
public class Main {

    public static void main(String[] args) {
        Insect ladybag = new Insect();
        Insect mantis = new Insect("Mantis", 3, 2, 0.133);
        Insect bee = new Insect("Bee", 6, 4, 0.150, 150000);

        System.out.println(ladybag.toString());
        System.out.println(mantis.toString());
        System.out.println(bee.toString());

        Insect.printStaticSum();
        bee.printSum();

        ladybag.resetValues("Fly", 6, 4, 0.050, 20000);
        mantis.resetValues("DragonFly", 8, 6, 0.200, 1500);
        bee.resetValues("Buterfly", 4, 2, 0.190, 500);

        System.out.println(ladybag.toString());
        System.out.println(mantis.toString());
        System.out.println(bee.toString());

        Insect.printStaticSum();
        ladybag.printSum();


    }

}