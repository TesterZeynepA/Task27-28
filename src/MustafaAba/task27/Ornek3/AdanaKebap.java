package MustafaAba.task27.Ornek3;

public class AdanaKebap implements IFood {

    @Override
    public double ucret(int teksis) {
        return teksis*200;
    }

    public AdanaKebap() {

    }

    @Override
    public void taste() {
        System.out.println("Adana Kebap Servise hazır.");
    }
    public  void marinade() {

        System.out.println("Adana kebap için etler marinade edildi.");

    }
    public void grill() {
        System.out.println("Adana kebap pişti. ");

    }
}
