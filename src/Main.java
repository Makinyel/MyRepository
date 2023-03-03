public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecuatando Programa!!!!");
        System.out.println("");

        Carro c = new Carro("V8",4);
        c.getClass().getSimpleName();
        System.out.println(c.toString());
        c.acelerando();
        System.out.println("*------------------------*");

        Vehiculo v = new Vehiculo();
        System.out.println(v.toString());
        v.frenando();
        System.out.println("*------------------------*");

        Moto m = new Moto("1000",false);
        System.out.println(m.toString());
        m.acelerando();
        System.out.println("*------------------------*");


    }
}