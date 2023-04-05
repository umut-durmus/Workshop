public class MukkemelSayi{

    public static void mukkemelSayi(){
        int sayi=6;
        int total=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                total+=i;
            }
        }
        if (sayi==total) System.out.println("Mükemmel Sayı");
        else System.out.println("Mükemmel Değil");
    }
}
