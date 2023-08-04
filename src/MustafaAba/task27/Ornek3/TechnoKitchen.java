package MustafaAba.task27.Ornek3;

public class TechnoKitchen extends TechnoCafe {

    public static void Pisir(IFood yemek,int porsiyon) {
        AdanaKebap adana=new AdanaKebap();
        Lahmacun lahmacun= new Lahmacun();
        Borsh borsh= new Borsh();
        Palov palov= new Palov();

        if (yemek.equals(adana)) {
            adana.marinade();
            adana.grill();
            yemek.taste();
            toplamUcret+=adana.ucret(porsiyon);
            System.out.println("toplamUcret = " + toplamUcret);
        } else if (yemek.equals(lahmacun)) {
            lahmacun.dough();
            lahmacun.addMeat();
            lahmacun.bake();
            lahmacun.taste();
            toplamUcret+=lahmacun.ucret(porsiyon);
        }else if (yemek.equals(borsh)){
            borsh.boil();
            borsh.taste();
            toplamUcret+=borsh.ucret(porsiyon);
        }else if (yemek.equals(palov)) {
            palov.boil();
            palov.fry();
            palov.taste();
            toplamUcret+=palov.ucret(porsiyon);
        }
    }
}
