package PolimorfismeStanley;

/**
 *
 * @author HP
 */
public class Lingkaran extends ObjectGeometri{
    double phi = 3.14;
    double r, Luas;
    
    Lingkaran(double r){
        this.r = r;
        this.Luas = phi*r*r;
    }
    
    public void Jenis_Geometri(String Jenis){
        System.out.println("Ini adalah " + Jenis);
        System.out.println("dengan luas = " + this.Luas);
        System.out.println(" ");
    }
}
