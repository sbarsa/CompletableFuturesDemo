package sergiu.barsa.demo;

import lombok.extern.slf4j.Slf4j;

import static sergiu.barsa.demo.Utils.sleepq;

@Slf4j
public class RepoService {

    public void persistProcessingResult( String processingResult ) {
        log.info( "Started persisting {}", processingResult );

        sleepq( 6 );

        log.info( "Finished persisting {}", processingResult );
    }
}
