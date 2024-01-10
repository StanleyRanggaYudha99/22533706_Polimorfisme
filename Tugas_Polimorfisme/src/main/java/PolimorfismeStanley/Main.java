package PolimorfismeStanley;


// Nama     : Stanley Rangga Yudha
// NIM      : 22533706
// Kelas    : 3F
/**
 *
 *
 */
public class Main {
    public static void main(String[] args){
        ObjectGeometri bangun;
        bangun = new Persegi(8);
        bangun.Jenis_Geometri("Persegi");
        
        bangun = new PersegiPanjang(10,12);
        bangun.Jenis_Geometri("Persegi Panjang");
        
        bangun = new Lingkaran(100);
        bangun.Jenis_Geometri("Lingkaran");
        
        bangun = new Segitiga(20,10);
        bangun.Jenis_Geometri("Segitiga");
        
    }
}
