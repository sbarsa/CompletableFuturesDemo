package sergiu.barsa.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static sergiu.barsa.demo.Utils.getRawNote;
import static sergiu.barsa.demo.Utils.sleepq;

@Slf4j
public class ApplicationAsync {

    private static final String RAW_NOTE = getRawNote();

    public static void main( String[] args ) {
        RequestService requestService = new RequestService();
        RepoService repoService = new RepoService();

        ExecutorService pool = Executors.newSingleThreadExecutor();

        CompletableFuture.supplyAsync( () -> requestService.processRawNote( RAW_NOTE ), pool ).thenAccept( repoService::persistProcessingResult );
        log.info( "submitted raw note for processing" );

        log.info( "The main thread is now unblocked. Application execution continues" );
        sleepq( 30 );
    }
}
