import java.util.List;

public class ImperativDeklerativ {


    public void main() {

    }

    //Imperativ metode - imperativ løsning - viser hvordan man gør, step by step
    public String returnStringIMP(String navn) {
        //navngivet længden, int attribut med navnet længde
        int længde = navn.length();
        //ny variabel som er null
        String navn2 = null;

        if (længde > 0) {
            navn2 = navn;
        }
        return navn2;

    }

    //deklerativ metode
    public String returnStringDEC(String navn) {
        if (navn.length() > 0)
            return navn;
            return null;

    }

}
    



