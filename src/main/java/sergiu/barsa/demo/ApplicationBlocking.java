package sergiu.barsa.demo;

import static sergiu.barsa.demo.Utils.getRawNote;
import static sergiu.barsa.demo.Utils.sleepq;

public class ApplicationBlocking {

    public static void main( String[] args ) {
        RequestService requestService = new RequestService();
        RepoService repoService = new RepoService();

        String result = requestService.processRawNote( getRawNote() );
        System.out.println( "submitted raw note for processing" );

        repoService.persistProcessingResult( result );

        System.out.println( "The main thread is now unblocked. Application execution continues" );
        sleepq( 30 );
    }
}
