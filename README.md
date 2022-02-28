# Project1CECS326

Instructions on Running the Code (Windows):
-------------------------------------------------------------------------------------------
Q1: Quote of the Day Server
-------------------------------------------------------------------------------------------
    1. Open two instances of command terminal (cmd.exe).
    2. Change the directory to where the files are stored. (Use the cd <path> command)
    3. Each file requires compiling beforehand to ensure integrity.
        a. To do this, in Terminal 1, type 'javac QuoteServer.java'.
        b. In Terminal 2, type 'javac QuoteClient.java'.
    4. Next, the Server needs to be started up first so that it can listen to a port. The port we have chosen is port 6018, as 6017 as per the instructions was in use already.
        a. To do this, in Terminal 1, type 'java QuoteServer.java'. NOTE: The program will run and you will not be able to run any other commands on Terminal 1 until QuoteServer is shut down.
    5. On Terminal 2, type 'java QuoteClient.java'. This should return the QOTD from QuoteServer. Quote Client will terminate immediately after recieving response.
    6. Once finished, close terminals or use CTRL+C to terminate the QuoteServer.
    
-------------------------------------------------------------------------------------------
Q2: Echo Server
-------------------------------------------------------------------------------------------
    1. Open two instances of command terminal (cmd.exe).
    2. Change the directory to where the files are stored. (Use the cd <path> command)
    3. Each file requires compiling beforehand to ensure integrity.
        a. To do this, in Terminal 1, type 'javac EchoServer.java'
        b. In Terminal 2, type 'javac EchoClient.java'
    4. Next, the Server needs to be started up first so that it can listen to a port (The port we have chosen is port 6017, however this can be changed if the port is taken).
        a. To do this, in Terminal 1, type 'java EchoServer.java'. NOTE: The program will run and you will not be able to run any other commands on Terminal 1 until EchoSever is shut down.
    5. On Terminal 2, type 'java EchoClient.java'. This will ask the user to input any text which will be sent to the server and echod back.
    6. Once finished, close terminals or use CTRL+C to terminate the EchoServer.
