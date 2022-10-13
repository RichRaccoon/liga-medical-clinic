package liga.medical.medicalmonitoring.core.service;

import liga.medical.medicalmonitoring.api.RabbitMessageRouterService;
import liga.medical.medicalmonitoring.core.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMessageRouterListener {
    private final RabbitMessageRouterService rabbitMessageRouterService;

    public RabbitMessageRouterListener(RabbitMessageRouterService rabbitMessageRouterService) {
        this.rabbitMessageRouterService = rabbitMessageRouterService;
    }

    @RabbitListener(queues = RabbitConfig.COMMON_QUEUE_NAME)
    public void receiveAndRedirectMessage(String message) {
        rabbitMessageRouterService.routeMessage(message);
    }
}
