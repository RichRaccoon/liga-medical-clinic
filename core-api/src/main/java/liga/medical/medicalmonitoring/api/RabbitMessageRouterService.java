package liga.medical.medicalmonitoring.api;

public interface RabbitMessageRouterService {
    void routeMessage(String message);
}
