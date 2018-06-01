package ImpaqTask;

import java.util.Scanner;

public class Reader {
    private int inputBarCode;
    private Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }
    public void setReaderValue() {
        System.out.println("Enter bar code: ");
        System.out.println("//Available bar codes: 1234, 2345, 3456, 4567");
        inputBarCode = reader.nextInt();
    }
    public void closeReader() {
        reader.close();
    }
    public int getInputBarCode() {
        return inputBarCode;
    }
}
