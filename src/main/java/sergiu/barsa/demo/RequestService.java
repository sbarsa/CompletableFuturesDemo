package sergiu.barsa.demo;

import lombok.extern.slf4j.Slf4j;

import static sergiu.barsa.demo.Utils.sleepq;

@Slf4j
public class RequestService {

    public String processRawNote( String rawNote ) {
        log.info( "Started Processing Raw Note {}", rawNote );

        sleepq( 5 );

        log.info( "Finished Processing Raw Note {} and got a result", rawNote );

        return rawNote + "result";
    }
}
