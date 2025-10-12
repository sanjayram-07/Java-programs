import java.io.*;

public class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        String message = "Welcome to MIT";
        byte[] b = message.getBytes();

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int i;
        while ((i = bis.read()) != -1) {
            char ch = (char) i;
            System.out.print(ch);
            bos.write(i);
        }

        String result = bos.toString();
        System.out.println("\nCopied String: " + result);
        System.out.println("Character Count: " + result.length());
    }
}
