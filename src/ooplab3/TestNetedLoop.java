package ooplab3;

public class TestNetedLoop {
    public static void main(String[] args) {
        int n=1;
        for (int i=1;i<=8;i++){
            //statement
            for (int j=1;j<=8;j++){
                //statement
                if (i==8 ||j==i||j==1){
                    System.out.print("*\t");
                }else System.out.print(n+"\t");
            }//j
            System.out.println();
        }//i


    }//main
}//class
