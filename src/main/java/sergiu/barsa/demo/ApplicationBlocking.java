package sergiu.barsa.demo;

import lombok.extern.slf4j.Slf4j;

import static sergiu.barsa.demo.Utils.getRawNote;
import static sergiu.barsa.demo.Utils.sleepq;

@Slf4j
public class ApplicationBlocking {

    private static final String RAW_NOTE = getRawNote();

    public static void main( String[] args ) {
        RequestService requestService = new RequestService();
        RepoService repoService = new RepoService();

        String result = requestService.processRawNote( RAW_NOTE );
        log.info( "submitted raw note for processing" );

        repoService.persistProcessingResult( result );

        log.info( "The main thread is now unblocked. Application execution continues" );
        sleepq( 30 );
    }
}
