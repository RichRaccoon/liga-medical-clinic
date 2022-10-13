package liga.medical.medicalmonitoring.core.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.common.dto.RabbitMessageDTO;
import liga.medical.medicalmonitoring.api.RabbitMessageRouterService;
import liga.medical.medicalmonitoring.core.config.RabbitExchangeConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMessageRouterServiceImpl implements RabbitMessageRouterService {
    private final ObjectMapper objectMapper;

    private final RabbitTemplate rabbitTemplate;

    public RabbitMessageRouterServiceImpl(ObjectMapper objectMapper,
                                          RabbitTemplate rabbitTemplate) {
        this.objectMapper = objectMapper;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void routeMessage(String message) {
        rabbitTemplate.setExchange(RabbitExchangeConfig.DIRECT_EXCHANGE_NAME);

        try {
            RabbitMessageDTO rabbitMessageDTO = objectMapper.readValue(message, RabbitMessageDTO.class);
            rabbitTemplate.convertAndSend(rabbitMessageDTO.getType().toString(), message);
            System.out.println("Роутер перенаправил сообщение");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
