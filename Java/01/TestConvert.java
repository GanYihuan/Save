public class TestConvert {
    public static void main(String arg[]) {
        // byte, short, char -> init > long > float > double
        int i1 = 123;
        int i2 = 456;
        double d1 = (i1 + i2) * 1.2;//change to double
        float f1 = (float) ((i1 + i2) * 1.2);//Casts.
        byte b1 = 67;
        byte b2 = 89;
        byte b3 = (byte) (b1 + b2);//(b1+b2)init Casts
        System.out.println(b3);
        double d2 = 1e200;
        float f2 = (float) d2;//double casts float The overflow
        System.out.println(f2);

        float f3 = 1.23f;//must add f
        long l1 = 123; // init -> long
        long l2 = 30000000000L;// must add L
        float f = l1 + l2 + f3;//long -> float
        long l = (long) f;//float casts long will delete decimal
    }
}
