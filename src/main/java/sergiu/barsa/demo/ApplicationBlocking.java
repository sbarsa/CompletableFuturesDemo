package sergiu.barsa.demo;

import static sergiu.barsa.demo.Utils.getRawNote;
import static sergiu.barsa.demo.Utils.sleepq;

public class ApplicationBlocking {

    private static final String RAW_NOTE = getRawNote();

    public static void main( String[] args ) {
        RequestService requestService = new RequestService();
        RepoService repoService = new RepoService();

        String result = requestService.processRawNote( RAW_NOTE );
        System.out.println( "submitted raw note for processing" );

        repoService.persistProcessingResult( result );

        System.out.println( "The main thread is now unblocked. Application execution continues" );
        sleepq( 30 );
    }
}
