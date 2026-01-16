package exercise4_events.refactored.listener;

import exercise4_events.refactored.event.Event;

public class SlackNotificationListener implements EventListener{
    @Override
    public void onEvent(Event event) {
        // Lógica para enviar notificación por email basada en el evento
    }

    @Override
    public boolean supports(Class<? extends Event> eventClass) {
        // Retorna true si este listener soporta el tipo de evento dado
        return false;
    }
}
