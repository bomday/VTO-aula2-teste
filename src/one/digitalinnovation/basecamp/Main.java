package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; -> Passando do seu limite

        //int i1 = -1000000000000000; -> Passando do seu limite negativo suportado
        int i2 = 28500;

        //long l1 = 100000000000000000; -> Precisa de "L" no final para funcionar
        long l2 = 244845000000000004L;

        //float f1 = 4.5; -> Necessita do "f" no final para funcionar
        float f2 = 10.48f;

        double d1 = 85.69;
        double d2 = 99.45d;

        char c1 = 'w';
        //char c2 = 'wn'; -> O char é apenas 1 caractere

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "Olá! Como vai?";
        //Para String: Utilizar aspas duplas ("")

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}