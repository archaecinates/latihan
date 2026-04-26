package praktikumArrayObject;

public class Pegawai { //class data Pegawai
    private int nip;
    private String nama;
    private String alamat;
    private int umur;
    private double gajiPokok;

    public Pegawai(int nip, String nama, String alamat, int umur, double gajiPokok){ //constructor untuk menginisialisasi data pegawai
        this.nip=nip;
        this.nama=nama;
        this.alamat=alamat;
        this.umur=umur;
        this.gajiPokok=gajiPokok;
    }

    public double getGajiPokok() { //method getter untuk mengambil nilai gaji pokok dari luar class
        return gajiPokok; //mengembalikan isi gaji pokok
    }

    public void tampilData(){ //method untuk menampilkan seluruh data pegawai
        System.out.println("\nDATA PEGAWAI"); //mencetak data pegawai
        System.out.println("NIP: "+nip); //mencetak nip
        System.out.println("Nama: "+nama); //mencetak nama
        System.out.println("Alamat: "+alamat); //mencetak alamat
        System.out.println("Umur: "+umur); //mencetak umur
        System.out.println("Gaji Pokok: "+gajiPokok); //mencetak gaji pokok
    }
}
