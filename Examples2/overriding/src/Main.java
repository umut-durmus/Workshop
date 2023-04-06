public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManager=new BaseKrediManager[]{new OgrenciKrediManager(),new TarimKrediManager(),
                                                                   new OgretmenKrediManager()};
        for (BaseKrediManager krediManager:baseKrediManager){
            System.out.println(krediManager);
        }
    }
}