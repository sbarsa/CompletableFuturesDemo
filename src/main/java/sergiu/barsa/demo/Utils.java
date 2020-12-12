package sergiu.barsa.demo;

public class Utils {

    public static String getRawNote() {
        return "1";
    }

    public static void sleepq( int seconds ) {
        try {
            Thread.sleep( seconds * 1000 );
        } catch ( InterruptedException e ) {
            Thread.currentThread().interrupt();
            throw new RuntimeException( e );
        }
    }
}
