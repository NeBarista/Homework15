public class Main {
    public static void main(String[] args) {
        System.out.println(alarmСlock(true, false));
        System.out.println(alarmСlock(true, true));
        System.out.println(alarmСlock(false, false));
        System.out.println(alarmСlock(false, true));
    }
    public static boolean alarmСlock(boolean weekend, boolean holiday) {
        if (weekend) {
            return false;
        }
        if (holiday) {
            return false;
        } else {
            return true;
        }
    }
    }