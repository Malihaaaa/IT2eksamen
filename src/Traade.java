
public class Traade {


    //HEYYYYYYYY OPDATERING
    //Her har vi vores main hvor alt koden kører i (begge tråde)
    public static void main(String arg[]){

        //her laves et objekt Task/instans af klassen
        Task taskRunner = new Task();
        //her fortæl ler vi at tråden skal starte i Task
        //dog kører den her tråd samtidig med tråd nr.2 altså taskrunner 2
        taskRunner.start();

        System.out.println("hello");

        Task taskrunner2 = new Task();
        taskrunner2.start();


    }

}
        // en anden klasse hvor i vi laver tråden som skal køres main
        class Task extends Thread {

        public void run() {
            for(int i=0; i < 100; i++) {
                System.out.println("number: "+ i);
            }
        }
        }