package sergiu.barsa.demo;

import static sergiu.barsa.demo.Utils.sleepq;

public class RequestService {

    public String processRawNote( String rawNote ) {
        System.out.println( "Started Processing Raw Note " + rawNote );

        sleepq( 5 );

        System.out.printf( "Finished Processing Raw Note %s and got a result\n", rawNote );

        return rawNote + "result";
    }
}
