package Phone;

public interface Informable<T>{

    default void infoD(){
              System.out.println("Phone is created");
    }
}
