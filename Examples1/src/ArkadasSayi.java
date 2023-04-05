public class ArkadasSayi {

    public static void arkadasSayi(){
        int sayi=220;
        int sayi2=284;

        int sayi1b=0;
        int sayi2b=0;

        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                sayi1b+=i;
            }
        }

        for (int i=1;i<sayi2;i++){
            if (sayi2%i==0){
                sayi2b+=i;
            }
        }
        if (sayi2b==sayi && sayi2==sayi1b) System.out.println("Arkadaş Sayı");
    }
}
