package ooplab6;

public class myString {
    public static void main(String[] args) {
        String s;
        s = new String();
        s = "RMUSV";
        System.out.println(s);
        s = "Welcome " + s;
        System.out.println(s);
        s = s.concat(" 2017");
        System.out.println(s);
        System.out.println(s.charAt(10));
        String s1 = "Hello";
        String s2 = "hello";
       // ==
        if (s1==s2)
            System.out.println("ข้อความนี้เท่ากัน");
        else System.out.println("ข้อความนี้ไม่เท่ากัน");
       // equalsmetod
        if (s1.equals(s2))
            System.out.println("ข้อความนี้เท่ากัน");
        else System.out.println("ข้อความนี้ไม่เท่ากัน");
        // compareto metod
        if (s1.compareTo(s2) ==0)
            System.out.println("ข้อความนี้เท่ากัน");
        else if (s1.compareTo(s2)>0)System.out.println("ข้อความทางซ้ายน้อยกว่า");
        else //+
            System.out.println("ข้อความทางขวามากกว่า");
        //trim metod
        String s3 = "  Hello  ";
        System.out.println(s3.length());
        System.out.println("*"+s3+"*");
        System.out.println("*"+s3.trim()+"*");
    }//main
}//class
