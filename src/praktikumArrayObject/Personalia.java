package praktikumArrayObject;

import java.util.Scanner;

public class Personalia { //kelas Personalia
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pegawai: "); //mencetak teks masukkan jumlah mahasiswa
        int jumlah = sc.nextInt(); //baca dan simpan jumlah bertipe int

        Pegawai[] pegawai = new Pegawai[jumlah]; //membuat objek baru pegawai

        for(int i = 0; i < jumlah; i++){ //perulangan jumlah
            System.out.println("\nData Pegawai ke-" + (i + 1)); //mencetak data pegawai ke - i

            System.out.print("NIP: ");
            int nip = sc.nextInt(); //baca dan simpan nip

            System.out.print("Nama: ");
            String nama = sc.next(); //baca dan simpan nama

            System.out.print("Alamat: ");
            String alamat = sc.next(); //baca dan simpan alamat

            System.out.print("Umur: ");
            int umur = sc.nextInt(); //baca dan simapn umur

            System.out.print("Gaji Pokok: ");
            double gajiPokok = sc.nextDouble(); //baca dan simpan gaji pokok
            sc.nextLine(); //membuat line baru

            pegawai[i] = new Pegawai(nip, nama, alamat, umur, gajiPokok); //mengisi objek pegawai baru
        }

        for(Pegawai p : pegawai){ //perulanagan pegawai
            p.tampilData(); //method tampil data
        }

        double terbesar = pegawai[0].getGajiPokok(); //inisialisasi nilai awal gaji terbesar dari pegawai pertama
        double terkecil = pegawai[0].getGajiPokok(); //inisialisasi nilai awal gaji terkecil dari pegawai pertama
        double total=0; //inisialisasi total gaji seluruh pegawai

        for(Pegawai p : pegawai){  //perulangan untuk mengecek setiap data pegawai
            double gajiPokok = p.getGajiPokok(); //mengambil nilai gaji pokok dari setiap pegawai

            if(gajiPokok> terbesar)terbesar=gajiPokok; //mengecek dan memperbarui gaji terbesar
            if(gajiPokok<terkecil)terkecil=gajiPokok; //mengecek dan memperbarui gaji terkecil

            total += gajiPokok; //menjumlahkan seluruh gaji untuk menghitung rata-rata
        }

        double rerata = total/jumlah; //menghitung rata rata gaji

        System.out.println("\nAnalisis Gaji Pegawai");
        System.out.println("Gaji Tertinggi: " + terbesar); //mencetak gaji tertinggi
        System.out.println("Gaji Terendah: " + terkecil); //mencetak gaji terkecil
        System.out.println("Rata-rata Gaji: " + rerata); //mencetak rata rata gaji seluruh pegawai
    }
}
