package Serap.task27.ornek5;

public abstract class Personel {
    public String name ="Nur Hanım";

    public abstract void maasHesapla();//abs. meth
    public abstract void maasBilgisi();//abs. meth


    public  void  sigorta(){//conc. meth
        System.out.println("Agam özel sigorta kapsamındasın :) ");//conc. meth
    }
}
