public class Main {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        int[]array={1,2,3};
        int[]array1={4,5,6};

        array1=array;
        array[0]=10;
        System.out.println(array1[0]);
    }
}