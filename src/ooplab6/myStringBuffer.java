package ooplab6;

public class myStringBuffer {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        System.out.println (buffer);
        buffer.insert(5," ");
        //System.out.println(buffer.reverse());
        buffer.append("RMUTSV");
        System.out.println(buffer);
        buffer.delete(6, 8);
        System.out.println(buffer);
        pringBuffer(buffer);

    }

    private static void pringBuffer(StringBuffer buffer) {
    }
}
