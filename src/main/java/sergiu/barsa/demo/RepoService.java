package sergiu.barsa.demo;

import static sergiu.barsa.demo.Utils.sleepq;

public class RepoService {

    public void persistProcessingResult( String processingResult ) {
        System.out.println( "Started persisting " + processingResult );

        sleepq( 6 );

        System.out.println( "Finished persisting " + processingResult );
    }
}
