import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedWithinUncheckedExceptions {

    public static void main(String[] args) {

        try {
            System.out.println("Searching File..");
            new FileInputStream("C:/Users/awlsa/Desktop/Virtusa LP training/ExceptionHandling/src/TextFile2.txt");
            System.out.println("File found..");
        } catch (IOException e) {
            System.out.println("File not found. Inside catch block..");
            throw new RuntimeException(e);
        }

    }


}
