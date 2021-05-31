//her oprettes et interface uden for main
interface watterbottle {
    String color = "Blue";

    void fillUp();
    //laver jeg et void pourOut(), f.eks. og ikke skriver den i klassen, vil der opstå en fejl.
}
//her oprettes en klasse, hvor vi implementere vores interface watterbottle
// ( hvilket betyder man SKAL bruge attributter og metoder fra interfacet i denne klasse )
public class Interface implements watterbottle {

    public static void main (String[] args) {
        System.out.println(color);

        Interface in = new Interface();
        in.fillUp();

    }

    @Override
    public void fillUp() {
        System.out.println("Filled up");

    }
}
