
public class Main {

    public static void main(String[] args) {
        Insect Ladybag = new Insect();
        Insect Mantis = new Insect("Mantis", 3, 2, 0.133);
        Insect Bee = new Insect("Bee", 6, 4, 0.150, 150000);

        System.out.println(Ladybag.toString());
        System.out.println(Mantis.toString());
        System.out.println(Bee.toString());

        Insect.printStaticSum();
        Bee.printSum();

        Ladybag.resetValues("Fly", 6, 4, 0.050, 20000);
        Mantis.resetValues("DragonFly", 8, 6, 0.200, 1500);
        Bee.resetValues("Buterfly", 4, 2, 0.190, 500);

        System.out.println(Ladybag.toString());
        System.out.println(Mantis.toString());
        System.out.println(Bee.toString());

        Insect.printStaticSum();
        Ladybag.printSum();


    }

}