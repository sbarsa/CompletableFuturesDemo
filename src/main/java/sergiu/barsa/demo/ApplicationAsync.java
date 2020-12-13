package sergiu.barsa.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;

import static sergiu.barsa.demo.Utils.getRawNote;
import static sergiu.barsa.demo.Utils.sleepq;

@Slf4j
public class ApplicationAsync {

    private static final String RAW_NOTE = getRawNote();

    public static void main( String[] args ) {
        RequestService requestService = new RequestService();
        RepoService repoService = new RepoService();

        CompletableFuture.supplyAsync( () -> requestService.processRawNote( RAW_NOTE ) ).thenAccept( repoService::persistProcessingResult );
        log.info( "submitted raw note for processing" );

        log.info( "The main thread is now unblocked. Application execution continues" );
        sleepq( 30 );
    }
}
