public class SayiBulma {

    public static void sayiBulma(){
        int []sayilar={1,2,9,6,7,3,5};
        int aranacak=5;
        boolean varMi=false;
        for (int x: sayilar) {
            if (x==aranacak) {
                varMi=true;
                break;
            }else varMi=false;
        }
        if (varMi) System.out.println("Var");
        else System.out.println("Yok");
        }
    }

