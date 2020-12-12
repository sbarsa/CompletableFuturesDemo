package sergiu.barsa.demo;

import java.util.concurrent.CompletableFuture;

import static sergiu.barsa.demo.Utils.getRawNote;
import static sergiu.barsa.demo.Utils.sleepq;

public class ApplicationAsync {

    public static void main( String[] args ) {
        RequestService requestService = new RequestService();
        RepoService repoService = new RepoService();

        CompletableFuture.supplyAsync( () -> requestService.processRawNote( getRawNote() ) ).thenAccept( repoService::persistProcessingResult );
        System.out.println( "submitted raw note for processing" );

        System.out.println( "The main thread is now unblocked. Application execution continues" );
        sleepq( 30 );
    }
}
