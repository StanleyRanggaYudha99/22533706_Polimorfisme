package PolimorfismeStanley;

/**
 *
 * @author HP
 */
public class PersegiPanjang extends ObjectGeometri {
    int Panjang, Lebar, Luas;
    
    PersegiPanjang(int Panjang, int Lebar){
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Luas = Panjang* Lebar;
    }
    
    public void Jenis_Geometri(String Jenis){
        System.out.println("Ini adalah " + Jenis);
        System.out.println("memiliki luas = " + this.Luas);
        System.out.println(" ");
    }
}
