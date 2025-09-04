package javaapplication8;

public class Bank {
    private double saldo;

    public Bank(double saldoawal) {
        saldo = saldoawal;
    }

    public void simpanuang(double jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    public void ambiluang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        }
    }

    public double ambilsaldo() {
        return saldo;
    }
}
