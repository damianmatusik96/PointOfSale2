package ImpaqTask;

import java.util.Scanner;

public class Reader {
    private int inputBarCode;
    private String barCode;
    private Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }
    public void setReaderValue() {
        System.out.println("Enter bar code: ");
        System.out.println("Available bar codes: 1234, 2345, 3456, 4567");
        inputBarCode = 0;
        barCode = reader.next();
        if(!"exit".equals(barCode)) {
            convertBarCode();
        }

    }
    public void convertBarCode() {
        try {
            inputBarCode = Integer.parseInt(barCode);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
        public void closeReader() {
        reader.close();
    }
    public int getInputBarCode() {
        return inputBarCode;
    }
    public String getBarCode() {
        return barCode;
    }
}
