package MustafaAba.task27.Ornek3;

public class Borsh implements IFood {

    @Override
    public double ucret(int kase) {
        return kase*25;
    }

    @Override
    public void taste() {
        System.out.println("Çorba Servise hazır.");
    }
    void boil(){
        System.out.println("Çorba hazır");
    }
    void eatTomorrow(){
        System.out.println("Yarına ancak pişer:(");

    }
}
