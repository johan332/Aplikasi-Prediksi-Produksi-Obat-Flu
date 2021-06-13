/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungFuzzy1;

/**
 *
 * @author samsung
 */
public class HitungFuzzy1 {
    private double alfatotal=0;
    public double sedikit (double persediaan)
    {
        double hasil=(196-persediaan)/64;
        return hasil;
    }
    
    public double banyak (double persediaan)
    {
        double hasil = (persediaan-132)/64;
        return hasil;
    }
    
    public double turun (double permintaan)
    {
        double hasil  = (541-permintaan)/341;
        return hasil;
    }
    
    public double naik (double permintaan)
    {
        double hasil  = (permintaan-200)/341;
        return hasil;
    }
    
    public double hasilBerkurang(double produksiBerkurang)
    {
        double hasil = 720-(119*produksiBerkurang);
        return hasil;
    }
    
    public double hasilBertambah (double produksiBertambah)
    {
        double hasil = 601+(119*produksiBertambah);
        return hasil;
    }
    
    public double Rule1 (double persediaan, double permintaan)
    {
        double alfa1=Math.min(banyak(persediaan), turun(permintaan));
        double hasil=hasilBerkurang(alfa1);
        hasil=alfa1*hasil;
        alfatotal=alfatotal+alfa1;
        System.out.println("Alfa1 : "+alfa1);
        System.out.println(hasil);
        return hasil;
    }
    
    public double Rule2 (double persediaan, double permintaan)
    {
        double alfa2=Math.min(sedikit(persediaan), turun(permintaan));
        double hasil=hasilBerkurang(alfa2);
        hasil=alfa2*hasil;
        alfatotal=alfatotal+alfa2;
        System.out.println("Alfa2 : "+alfa2);
        System.out.println(hasil);
        return hasil;
    }
    
    public double Rule3 (double persediaan, double permintaan)
    {
        double alfa3=Math.min(banyak(persediaan), naik(permintaan));
        double hasil=hasilBertambah(alfa3);
        hasil=alfa3*hasil;
        alfatotal=alfatotal+alfa3;
        System.out.println("Alfa3 : "+alfa3);
        System.out.println(hasil);
        return hasil;
    }
    
    public double Rule4 (double persediaan, double permintaan)
    {
        double alfa4=Math.min(sedikit(persediaan), naik(permintaan));
        double hasil=hasilBertambah(alfa4);
        hasil=alfa4*hasil;
        alfatotal=alfatotal+alfa4;
        System.out.println("Alfa4 : "+alfa4);
        System.out.println(hasil);
        return hasil;
    }
    
    public double PerkiraanProduksi (double persediaan, double permintaan)
    {
        double rule1=Rule1(persediaan,permintaan);
        double rule2=Rule2(persediaan,permintaan);
        double rule3=Rule3(persediaan,permintaan);
        double rule4=Rule4(persediaan,permintaan);
        double wek = rule1+rule2+rule3+rule4;
        double hasil = wek/alfatotal;
        System.out.println("Rule1 : "+rule1);
        System.out.println("Rule2 : "+rule2);
        System.out.println("Rule3 : "+rule3);
        System.out.println("Rule4 : "+rule4);
        System.out.println("Jumlah rule : "+wek);
        System.out.println("Alfa total : "+alfatotal);
        System.out.println(hasil);
        alfatotal=0;
        return hasil;
    }
    
}
