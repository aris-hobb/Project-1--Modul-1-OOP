import java.net.*;
import java.io.*;

public class HostCheck {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("serveryangtidakada.local", 8080);
        } catch (UnknownHostException e) {
            System.out.println("Host tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        }
    }
}