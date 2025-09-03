class KomponenMobil {
    String namaKomponen;

    public KomponenMobil(String namaKomponen) {
        this.namaKomponen = namaKomponen;
    }

    public void tampilkanKomponen() {
        System.out.println("Komponen: " + namaKomponen);
    }
}

class Mesin extends KomponenMobil {
    public Mesin(String namaMesin) {
        super(namaMesin);
    }

    public void nyalakanMesin() {
        System.out.println("Mesin " + namaKomponen + " dinyalakan.");
    }
}