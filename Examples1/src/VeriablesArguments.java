public class VeriablesArguments {

    public static int topla(int... sayi){
        int total=0;

        for (int i:sayi)
            total+=i;

        return total;
    }
}
