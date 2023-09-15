// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        byte b = 24;
        short s = 3984;
        int a = 2000;
        long l=43734l;
        float f= 458.34f;
        double dd=1000.5201d;
        boolean x = true;
        boolean z = false;
        char c = 'c';
        int m = 0x869af;
        char y = 127;
        String name = "different types of characters";

        System.out.println("-------string--------");
        System.out.println(name);
        System.out.println("-----Integral Data types--------");
        System.out.println("byte value = " +b);
        System.out.println(s);
        System.out.println(a);
        System.out.println(l);

        System.out.println("-------Float types--------");
        System.out.println(f);
        System.out.println(dd);

        System.out.println("----Boolean----");
        System.out.println(x);
        System.out.println(z);

        System.out.println("----character------");
        System.out.println(c);
        System.out.println("Hexadecimal value" +m);
        System.out.println("char as int literal" +y);
    }
}
