package StringHandling;

public class Practisee1 {

    public static void main(String[] args) {

//        Payment $100 paid

        String s= "Payment $100 paid";
        System.out.println(s.charAt(8));

        String s1= "Payments $100 paid";
        System.out.println(s1.indexOf("$"));
        System.out.println(s1.substring(9));



    }
}
