public class Methods {

    public void varmi(){
        int []sayilar={1,2,9,6,7,3,5};
        int aranan=5;
        boolean varMi=false;
        for (int x: sayilar) {
            if (x==aranan) {
                varMi=true;
                break;
            }else varMi=false;
        }
        if (varMi) {
            mesajVer("Aranan Sayı Mevcuttur:"+aranan);
        }
        else{
            mesajVer("Aranan Sayı Mevcut Değil:"+aranan);
    }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
