public class NightState implements State {
    private static NightState singleton = new NightState();
    private NightState() {
    }
    public static State getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {                
        context.callSecurityCenter("�����F���Ԃ̋��Ɏg�p�I");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("�����x��(����)");
    }
    public void doPhone(Context context) {
        context.recordLog("���Ԃ̒ʘb�^��");
    }
    public String toString() {
        return "[����]";
    }
}
