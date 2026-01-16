package exercise4_events.refactored.event;

public class SystemAlertEvent extends BaseEvent {
    private final AlertLevel level;
    private final String message;
    private final String name;

    public SystemAlertEvent(AlertLevel level, String message, String name) {
        this.level = level;
        this.message = message;
        this.name = name;
    }

    @Override
    public String getEventType() {
        return "SYSTEM_ALERT";
    }

    public AlertLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
