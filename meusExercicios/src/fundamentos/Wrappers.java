package fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; /* Integer.parseInt("1000"); */
        Long l = 100000L;
    
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l * 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678D;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("false");
        System.out.println(bo);

        Character c = '#';
        System.out.println(c + "...");
    }
}
