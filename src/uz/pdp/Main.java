package uz.pdp;

public class Main {

    public static void main(String[] args) {


    var clothes1=new Clothes("Red",Size.M,Gender.MALE);
    var clothes2=new Clothes("Blue",Size.S,Gender.FEMALE);
    var clothes3=new Clothes("Green",Size.XL,Gender.MALE);
    var clothes4=new Clothes("Yellow",Size.X,Gender.FEMALE);

        System.out.println(clothes1);
        System.out.println(clothes2);
        System.out.println(clothes3);
        System.out.println(clothes4);

    }
}
