package MustafaAba.task27.Ornek3;

import java.util.Scanner;

public class TechnoCafe {
    public static final String R = "\u001B[31m";
    public static final String B = "\u001B[34m";
    static Scanner input = new Scanner(System.in);
    static double toplamUcret;
    public static void main(String[] args) {

        menu();

    }

    private static void menu() {
        System.out.println(B + "========================== TechnoCafe =======================\r\n"
                + "========================== MENU =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-ADANA KEBAP   |            | 2-LAHMACUN       |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-BORSH         |            | 4-PAVLOV         |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-SİPARİŞ TAMAM    |            | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + R);
        int sec;
        do {
            System.out.print("ISLEM SECİNİZ : ");
            sec = input.nextInt();

            switch (sec) {
                case 1:
                    IFood adana = new AdanaKebap();
                    System.out.println("Kaç şiş istersiniz?");
                    TechnoKitchen.Pisir(adana, input.nextInt());
                    break;
                case 2:
                    IFood lahmacun = new Lahmacun();
                    System.out.println("Kaç adet istersiniz?");
                    TechnoKitchen.Pisir(lahmacun, input.nextInt());
                    break;
                case 3:
                    IFood borsh = new Borsh();
                    System.out.println("Kaç kase istersiniz?");
                    TechnoKitchen.Pisir(borsh, input.nextInt());
                    break;
                case 4:
                    IFood palov = new Palov();
                    System.out.println("Kaç tabak istersiniz?");
                    TechnoKitchen.Pisir(palov, input.nextInt());
                    break;
                case 5:
                    System.out.println("TechnoKitchen.toplamUcret = " + toplamUcret);
                    break;
            }
        }while (sec != 5) ;
    }
}


