package javaapplication8;
public class BankBeraksi {
    public static void main(String[] args) {
        
        Bank bankABC = new Bank(100000);

        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankABC.ambilsaldo());

        bankABC.simpanuang(500000);
        System.out.println("Saldo saat ini: Rp. " + bankABC.ambilsaldo());

        bankABC.ambiluang(150000);
        System.out.println("Saldo saat ini: Rp. " + bankABC.ambilsaldo());
    }
}
