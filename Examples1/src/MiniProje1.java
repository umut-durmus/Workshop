public class MiniProje1 {

    public static void miniProje1() {
        int numaber = 6;

        boolean asal = true;

        for (int i = 2; i < numaber; i++) {
            if (numaber % i == 0) {
                asal = false;
                break;

            } else {
                asal = true;
            }
        }
        if (asal) System.out.println("Sayı asal:" + numaber);
        else System.out.println("Sayı Asal değil");

    }
}
