package praktikumArrayObject;

import java.util.Scanner;

public class MahasiswaMain { //kelas MahasiswaMain
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //membuat objek scanner untuk input

        System.out.print("Jumlah mahasiswa: "); //menampilkan teks jumlah mahasiswa
        int jumlah = sc.nextInt(); //input jumlah mahasiswa
        sc.nextLine(); //membersihkan enter biar ga loncat input

        Mahasiswa[] mhs = new Mahasiswa[jumlah]; //membuat array objek mahasiswa

        // input data mahasiswa
        for (int i = 0; i < jumlah; i++) { //perulangan sesuai jumlah mahasiswa
            System.out.println("\nData Mahasiswa ke-" + (i + 1)); //menampilkan data ke-i

            System.out.print("NIM: ");
            String nim = sc.nextLine(); //input nim

            System.out.print("Nama: ");
            String nama = sc.nextLine(); //input nama

            System.out.print("Tanggal Lahir: ");
            String tgl = sc.nextLine(); //input tanggal lahir

            System.out.print("Nilai US1: ");
            double us1 = sc.nextDouble(); //input nilai us1

            System.out.print("Nilai US2: ");
            double us2 = sc.nextDouble(); //input nilai us2

            System.out.print("Nilai UAS: ");
            double uas = sc.nextDouble(); //input nilai uas
            sc.nextLine(); //membersihkan enter

            mhs[i] = new Mahasiswa(nim, nama, tgl, us1, us2, uas); //mengisi objek mahasiswa
        }

        System.out.println("\nDaftar Mahasiswa Informatika Peserta PBO\n"); //judul output
        System.out.printf("%-3s %-10s %-10s %-12s %-6s %-6s %-6s %-8s %-5s\n",
                "No", "NIM", "Nama", "Tgl", "US1", "US2", "UAS", "Final", "Nilai"); //header tabel

        double max = mhs[0].nilaiFinal; //inisialisasi nilai terbesar dari data pertama
        int indexMax = 0; //menyimpan index nilai terbesar

        for (int i = 0; i < jumlah; i++) { //perulangan untuk menampilkan data + cek nilai terbesar

            System.out.printf("%-3d %-10s %-10s %-12s %-6.2f %-6.2f %-6.2f %-8.2f %-5s\n",
                    (i + 1),
                    mhs[i].nim,
                    mhs[i].nama,
                    mhs[i].tglLahir,
                    mhs[i].us1,
                    mhs[i].us2,
                    mhs[i].uas,
                    mhs[i].nilaiFinal,
                    mhs[i].nilaiHuruf); //menampilkan data mahasiswa dalam bentuk tabel

            if (mhs[i].nilaiFinal > max) { //kondisi untuk mencari nilai terbesar
                max = mhs[i].nilaiFinal; //update nilai terbesar
                indexMax = i; //simpan posisi index
            }
        }

        // menampilkan mahasiswa dengan nilai tertinggi
        System.out.println("\nNilai Tertinggi:");
        System.out.println("NIM   : " + mhs[indexMax].nim); //menampilkan nim
        System.out.println("Nama  : " + mhs[indexMax].nama); //menampilkan nama
        System.out.println("Tgl   : " + mhs[indexMax].tglLahir); //menampilkan tanggal lahir
        System.out.printf("Final : %.2f\n", mhs[indexMax].nilaiFinal); //menampilkan nilai final
        System.out.println("Nilai : " + mhs[indexMax].nilaiHuruf); //menampilkan nilai huruf
    }
}
