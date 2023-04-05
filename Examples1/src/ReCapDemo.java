public class ReCapDemo {

    public void reCapDemo(){
        int sayi1 = 35;
        int sayi2 = 40;
        int sayi3 = 65;

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) enBuyuk = sayi2;
        if (sayi3 > enBuyuk) enBuyuk = sayi3;
        System.out.println(enBuyuk);
    }
}
