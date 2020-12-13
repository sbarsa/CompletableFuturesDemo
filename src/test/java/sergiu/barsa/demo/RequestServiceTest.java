package sergiu.barsa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RequestServiceTest {

    @ParameterizedTest
    @CsvSource( { "mydata,mydataresult", "abc,abcresult", "qqq,qqqresult" } )
    void requestProcessingShouldReturnExpectedResult( String input, String expectedOutput ) {
        //We wouldn't test this in real life, because our service would call an external system.
        //Testing it here just for fun.

        RequestService service = new RequestService();

        String result = service.processRawNote( input );

        Assertions.fail("failing so that we can see the failure in Github CI");

        //assertEquals( expectedOutput, result, "Wrong result received during processing" );
    }
}