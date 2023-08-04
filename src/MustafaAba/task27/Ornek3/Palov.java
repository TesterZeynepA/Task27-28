package MustafaAba.task27.Ornek3;

public class Palov implements IFood {


    @Override
    public double ucret(int tabak) {
        return tabak*20;
    }

    @Override
    public void taste() {
        System.out.println("Pilav Servise hazır.");
    }

    void fry(){
        System.out.println("Pirinçi yağda kavur");
    }
    void boil(){
        System.out.println("Pilava su döktük haşla.");
    }
}


