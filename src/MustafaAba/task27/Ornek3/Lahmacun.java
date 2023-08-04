package MustafaAba.task27.Ornek3;

public class Lahmacun implements IFood {

    @Override
    public double ucret(int adet) {
        return adet*50;
    }

    @Override
    public void taste() {
        System.out.println("Lahmacun Servise hazır.");
    }

    public void dough() {
        System.out.println("Hamur açıldı");
    }

    public void addMeat() {
        System.out.println("Etleri hamurun üstüne eklendi");
    }

    public void bake() {
        System.out.println("Lahmacunları fırına sür");
    }

}
