package PolimorfismeStanley;


public class Persegi extends ObjectGeometri {
    int Sisi;
    float Luas;
    
    Persegi(int Sisi){
        this.Sisi = Sisi;
        this.Luas = Sisi * Sisi;
    }
    
    public void Jenis_Geometri(String Jenis){
        System.out.println("Ini adalah " + Jenis);
        System.out.println("dengan luas = " + this.Luas);
        System.out.println(" ");
    }
    
    
}
