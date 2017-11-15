hello-antlr
===========

How to run :

1. Get the code

    ```shell 
    git clone https://github.com/dharmeshkakadia/hello-antlr/ && cd hello-antlr
    ```
    
2. Compile it. This takes care of generating the code for the grammar as well.

    ```shell
    mvn compile
    ```
    
3. Run it.

    ```shell
    mvn exec:java -q
    ```
    it would print:
    
    ```shell
    Entering Msg : world
    Exiting Msg
    ```
