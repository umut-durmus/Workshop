public class StringsDemo {

    public void stringsDemo() {
        String mesaj = "Bugün Hava Çok Güzel";

        System.out.println("Eleman sayısı :" + mesaj.length());

        System.out.println(mesaj.concat("Ama Sıcak"));

        System.out.println(mesaj.indexOf("ün"));

        System.out.println(mesaj.lastIndexOf("el"));

        System.out.println(mesaj.startsWith("U"));

        System.out.println(mesaj.endsWith("l"));

        System.out.println(mesaj.replace(" ","*"));

        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.toLowerCase());

        String s=mesaj.substring(2,6);

        System.out.println(s);

        String []x=mesaj.split(" ");
        System.out.println(x[0]);


    }
}
