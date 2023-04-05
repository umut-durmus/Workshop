public class ReCapDemo2 {

    public void reCapDemo2(){
        double []doubles={1.2,3.5,8.6,9.5};
        double total=0;
        double max =doubles[0];

        for (double dob:doubles){
            total+=dob;
            if (max<dob)max=dob;
        }
        System.out.println("Toplam :"+total);
        System.out.println("En Büyük Değer :"+max);
    }
}
