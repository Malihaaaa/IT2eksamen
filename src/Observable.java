import java.util.Observable;
import java.util.Random;
import java.util.Observer;

//vi laver en klasse hvilket extends fra Observable hvilket vi har impoteret fra java
class vejr extends Observable {
    private String vejr;
    Random r = new Random();

    public vejr(String vejr)
    {
        this.vejr = vejr;
    }

    public double getVejr()
    {
        Random r = new Random();
        double Minpuls = 0;
        double Maxpuls = 50;
        double vejr = Minpuls + (Maxpuls - Minpuls)* r.nextDouble();
        return vejr;
    }

    public void setVejr(String vejr) {
        this.vejr = vejr;
        setChanged();
        //// hvis der sker ændringer i observavle skal observers notificeres
        notifyObservers();
    }

}

//// observer interface bruges til notificere observer at der er ændringere i observable det bruges ofte ved at implementer the observer pattern i java

 class vejreksemple implements Observer {
    private vejr vejrUpdate;

    @Override
    // dette er den eneste metode observer interface har. Observable x er den enste objekt fra java.util.Observable klasse

    // arg objectet er en valgfri objekt som kan videregives som objekt af notifiying observable class (A class that implements the Observer interface, declares itself eligible to listen to the changes made to the observables.)
     public void update(Observable observable, Object arg){
        vejrUpdate = (vejr) observable;
        System.out.println("Weather Report Live. Its "+vejrUpdate.getVejr());
    }
    public static void main(String[]args){
        vejr observable = new vejr(null);
        vejreksemple observer = new vejreksemple();
        observable.addObserver(observer);
        observable.setVejr("Bright and sunny...Let's play cricket!! ");
        observable.setVejr("Raining Heavily!..Let's have hot Pakodas!!");
    }

 }