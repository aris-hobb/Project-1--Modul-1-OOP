import java.io.*;
import java.net.*;

public class FileUploader {
    public static void main(String[] args) {
        String filePath = "data.txt";
        String serverHost = "localhost";
        int serverPort = 8080;

        Socket socket = null;
        PrintWriter out = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            try {
                socket = new Socket(serverHost, serverPort);
                out = new PrintWriter(socket.getOutputStream(), true);
                String line;
                while ((line = reader.readLine()) != null) {
                    out.println(line);
                }

                System.out.println("✅ File berhasil dikirim ke server.");

            } catch (UnknownHostException e) {
                System.out.println("❌ Host server tidak dikenali: " + e.getMessage());
            } catch (SocketException e) {
                System.out.println("❌ Kesalahan socket: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("❌ Kesalahan I/O saat mengirim data: " + e.getMessage());
            } finally {
                try {
                    if (out != null) out.close();
                    if (socket != null) socket.close();
                } catch (IOException e) {
                    System.out.println("⚠️ Gagal menutup koneksi: " + e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("❌ File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("❌ Kesalahan I/O saat membaca file: " + e.getMessage());
        }
    }
}
