package tugas_2;

class Pemain {
    private String nama;
    private int kesehatan = 100;
    private int level = 1;
    
    public Pemain(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    protected void kurangiKesehatan(int kerusakan) {
        this.kesehatan -= kerusakan;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pemain: " + nama);
        System.out.println("Kesehatan: " + kesehatan);
        System.out.println("Level: " + level);
    }
}

class Pejuang extends Pemain {
    private int kekuatan = 30;
    
    public Pejuang(String nama) {
        super(nama);
    }

    public void serang(Pemain musuh) {
        System.out.println(getNama() + " menyerang " + musuh.getNama());
        musuh.kurangiKesehatan(this.kekuatan);
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();  // Memanggil metode tampilkanInfo dari superclass
        System.out.println("Kekuatan: " + kekuatan);
    }
}

public class tugas_2 {
    public static void main(String[] args) {
        Pemain p1 = new Pemain("Emil Audero");
        Pejuang w1 = new Pejuang("Maarten Paes");
        
        p1.tampilkanInfo();
        System.out.println();
        w1.tampilkanInfo();
        
        System.out.println("\nPertarungan Dimulai!");
        w1.serang(p1);
        
        System.out.println("\nSetelah Diserang:");
        p1.tampilkanInfo();
    }
}
