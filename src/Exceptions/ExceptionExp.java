package Exceptions;

public class ExceptionExp {

    public static void main(String[] args) throws Exception {

        try {
            //  Block of code to try
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }

        method();
    }

    public static void method() throws Exception {
        //  Block of code to try

        throw new Exception("Error no code found");
    }
}
