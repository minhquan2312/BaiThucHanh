package Slide11;

public class TestFinallyBlock1 {
    public static void main(String[] args) {
        try {
            int data = 25/0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finnaly block is always executed");
        }
        System.out.println("rest of the code...");
    }
} 
