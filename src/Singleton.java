
public class Singleton {
    //kræver en statisk metode, som laves her
  private static Singleton INSTANCE = new Singleton();

  //Konstruktøren skal være privat
  private Singleton() {}

  //Her laves en statis metode der terunere referencen til instansen
      public static Singleton getINSTANCE(){
          return INSTANCE;
        }
    }

