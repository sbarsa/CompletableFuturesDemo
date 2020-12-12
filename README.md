# CompletableFuturesDemo

This application demonstrates a simple workflow in 2 ways:
1) All steps sequentially in the main thread
2) Asynchronously, using CompletableFuture

The workflow is simple: we're simulating the sending of raw data over the wire for processing 
(using Thread.sleep to create a lengthy process). 
After receiving a response, we're simulating saving it to the DB (again, with Thread.sleep). 

How to use:
There are 2 main methods:
1) In class ApplicationBlocking
2) In class ApplicationAsync

Run them from your IDE.