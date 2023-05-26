package Slide13;

import javax.lang.model.util.ElementScanner14;

public class TestThrow1 {
    static void validate(int age) {
        if (age < 18)
           throw new ArithmeticException("not valid");
        else 
           System.out.println("Welcome");
    } 

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
    
}
