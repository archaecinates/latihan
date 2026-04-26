package praktikumArrayObject;

class Mahasiswa { //kelas mahasiswa
    String nim, nama, tglLahir; //deklarasi nim, nama, tglLahir bertipe String
    double us1, us2, uas, nilaiFinal; //deklarasi us1, uas, nilaiFinal bertipe double
    char nilaiHuruf; //deklarasi nilaiHuruf bertipe char

    Mahasiswa(String nim, String nama, String tglLahir, double us1, double us2, double uas) { //constructor kelas Mahasiswa
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.us1 = us1;
        this.us2 = us2;
        this.uas = uas;

        hitungFinal(); //method hitung final
        NilaiHuruf(); //method tentukanHuruf
    }

    void hitungFinal() { //method hitungFinal
        nilaiFinal = (0.3 * us1) + (0.3 * us2) + (0.4 * uas); //menghitung nilai final mahasiswa
    }

    void NilaiHuruf() { //method untuk menentukan huruf
        if (nilaiFinal >= 80) nilaiHuruf = 'A'; //kondisi jika nilai final >= 80 maka akan mendapat A
        else if (nilaiFinal >= 70) nilaiHuruf = 'B'; //kondisi jika nilai final >= 70 maka akan mendapat B
        else if (nilaiFinal >= 60) nilaiHuruf = 'C'; //kondisi jika nilai final >= 60 maka akan mendapat C
        else if (nilaiFinal >= 50) nilaiHuruf = 'D'; //kondisi jika nilai final >= 50 maka akan mendapat D
        else nilaiHuruf = 'E'; //jika tidak ada konidisi yang terpenuhi maka akan mendapat E
    }
}
