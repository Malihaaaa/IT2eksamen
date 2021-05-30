//dette er superklassen
class Bird {
    public void sing(){
        System.out.println("tweet tweet");
    }
}
//Dette er en subklasse/underklasse af superklassen bird, men med anden funktion dog har den stadig samme funktioner som bird
class Robin extends Bird {
    public void sing(){
        System.out.println("twiddledeedee");
    }
}
class Pelican extends Bird {
    public void sing(){
        System.out.println("kwah kwah");
    }
}

public class Polymorfi {

    public static void main(String[] args) {
        Pelican p = new Pelican();
        Bird b = new Bird();
        Robin r = new Robin();

        p.sing();
        b.sing();
        r.sing();
    }

}