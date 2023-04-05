public class MiniProje2 {

    public static void  miniProje2(){
        char harf='E';

        switch (harf){
            case 'A','O','U','I':
                System.out.println(harf+": kalın sesli");
                break;
            default:
                System.out.println(harf+": ince sesli");
        }
    }
}
