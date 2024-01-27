# JAVA-Exceptions

## `EXCEPTION HANDLING IN JAVA`

- What is exception?
    - An exception is an object that is generated as the result of an error or an unexpected event.
    - To prevent exceptions from crashing your program, you must write code that detects and handles them.
    - In Java – each error and exception is also an Object
- Exception Classes
    - The exception classes are in the Java API. For example, FileNotFoundException is in the java.io package.
    - When you handle an exception that is not in the ***lang*** package, you will need the appropriate import statement.

- Handle exception means:
    - exception is an object created when a certain condition happens
    - We can also manually create an exception (throw exception) if we want
    - we successfully catch the exception and code execution is not interruped/stopped
    - What happens if we don’t handle properly?
        
        if the exception is not handled properly (if you couldn’t catch the exception), compiler will stop here and won’t continue.
        
- Steps for handling
    
    -> Exception is error that happens during code execution
    -> We also call it RuntimeException
    -> When exception/error happens , execution is stopped
    -> so we can handle the error/exception using TRY CATCH statements.
    
- How we use during Web Automation
    
    In selenium webdriver when or where do we use try catch to control or handle the exception:
    *** we should ONLY use try catch where code execution needs to continue even if exception happens. We only use with steps that are not important, or steps that are sometimes needed and not needed at other times.
    
    `So basically, we use try catch when exception happens during runtime, we do not want the code to stop execution. we want to catch and handle and successfully continue code execution`
    
- `THROW keyword is used to manually create runtime exceptions.`
    
    ```
    ex:
    throw new RuntimeException("invalid email provided");
    
    We use throw new statement, when we want to the code execution to STOP when one of our requirements is NOT met.
    So we show runtimeError and stop the code execution, because we decided at this point , execution should not continue, as something invalid took place.
    
    String email = "cydeo.gmail.com";
    
    System.out.println("Thank you for your email: " + email);
    
    In above example, code will run successfully as it looks fine for java.
    But for us, programmers, when email is not valid, we want to show ERROR and STOP the code execution:
    
    String email = "cydeo.gmail.com";
    if(!email.contains("@")) {
    //SHOW ERROR AND STOP RIGHT HERE
    throw new RuntimeException("Invalid email!");
    }
    System.out.println("Thank you for your email: " + email);
    //code that rely on email below here
    
    summarize: throw keyword is used to manually SHOW ERROR and STOP CODE EXECUTION.
    throw new RuntimeException("Invalid email!");
    ```
    
- `TYPES OF EXCEPTIONS:`
    - `ERROR class and SUB CLASSES:`
        
        ```
        throwable > Error class and its sub classes:
           there are Errors that happen while code execution due to bad code, or    environment etc:
            ex:
              StackOverFlowError -> it means stack memory is full.
              OutOfMemoryError -> it means heap memory is full
              etc...
            We DO NOT HANDLE these types of ERRORS. We try to prevent by writing    good code etc, no infinite loops, or no not exiting recursion etc.
        ```
        
    - `CHECKED VS UNCHECKED EXCEPTIONS:`
        - `CHECKED EXCEPTION`
            - exception types that are checked at compile time.
            - they are Throwable class, Exception class, and all sub classes of Exception except RuntimeException
            - We must/mandatory to HANDLE or DECLARE checked exceptions, otherwise code will not compile
            - `What do we do so that code compiles and we read data from file:`
                - `HANDLE it using try catch.`
                    
                    `code will compile and if exception happends during runtime, it will be caught and handled, then execution will continue successfully.`
                    
                - `DECLARE the Exception using THROWS keyword in method signature`
                    
                    Code will compile and run. But if any error happens during the execution, code will STOP and show error. 
                    
                    throws keyword DOES NOT HANDLE the error, it just DECLARES.
                    
        - `UNCHECKED EXCEPTIONS`
            - `are the exceptions that happen during RUNTIME`
            - `it is optional to handle them or declare them, Code will ALWAYS compile.`
            - Unchecked Exceptions are also called Runtime Exceptions.
            - Uncheckec Exceptions are RuntimeException class and its Sub classes.
            - Can we declare un-checked exceptions using THROWS keyword?
            Yes, but it will not make any benefit or difference. So no need to do so.
            
- finally block
    - The ***try*** statement may have an ***optional*** ***finally*** clause, which must appear *after all of the catch clauses*.
    - ***Finally*** block is always executed (even when an exception is thrown). So ***if we want some code to be always executed*** we can move the code to “finally block.”
    - Finally block will be executed even if there is a ***return, break or continue*** statements in try catch block.
    - finally block is guaranteed to be executed even if an exception is raised **and not caught**. You then use the finally block, as a one time chance, to perform necessary clean-up like closing streams. The code after the finally block might never be reached.
    - If we have error in catch block, it only runs finally block and then shows the error.
    - Finally block, always runs *(even we put “return” keyword inside the catch block)* except :
        - exit(0);
        - JVM crash
        - If we have error in finally block, it stops there and shows the error.
- Some Interview Questions
    - `Difference between Checked vs Unchecked Exceptions?` 99 % PIQ
        - checked exceptions are checked during compile time, and must be handled using TRY catch or declared using throws keyword for code to compile. Otherwise code will not compile.
        try catch -> code will not stop if exception happens
        throws -> code will stop if exception happens
        - *`Unchecked exceptions are also called RuntimeExceptions, they are thrown during Runtime, and normally happen due to programming mistakes like wrong index, null pointer etc.`*
        - checked exceptions are Throwable , Exception classes and all sub classes of Exception class except RuntimeTimeException classes.
        - unchecked exceptions are RuntimeException and all its sub classes.
        - checked exceptions : Examples could be Thread.sleep. reading from files, connecting to database type of codes.
        - un-checked exceptions : Examples ArrayIndexOutOfBounds Exception, Nullpointer exception.
    - `Difference between throw vs throws keywords?` 99 % PIQ
        - THROW keyword is used to throw Exception manually, programmatically.
        throw is followed by new object of Exception type
        ex:
        throw new IllegalArgumentException("message");
        - THROWS keyword is used to DECLARE the exception in the method signature.
        We normally use throws while working with checked exceptions.
        EX:
        public static void main(String[] args) throws Exception {
        String filePath = "data.txt";
        List<String> data = Files.readAllLines(Paths.get(filePath)); }
    - `Can we create custom exceptions?`
        - Normally, we might need custom exceptions for project specific errors.
        - Yes, We can create a class for our custom exception and extend either Exception or RuntimeException classes.
        EX:
        Bank application might need a custom exception like
           InsufficientFundException
           InvalidPinException
           CannotTransferFundsException
