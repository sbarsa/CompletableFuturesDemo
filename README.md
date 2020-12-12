# CompletableFuturesDemo

This application demonstrates a simple worflow in 2 ways:
1) All steps sequentially in the main thread
2) Asynchronously, using CompletableFuture

The workflow is simple: we're simulating the sending of raw data over the wire for processing (using Thread.sleep to create a lenghty process). 
After receiving a response, we're simulating its saving to the DB (again, with Thread.sleep). 
