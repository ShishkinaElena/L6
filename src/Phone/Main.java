package Phone;
/*Д/з изменить в проекте с Phone интерфейсы Callable и Informable на использование generic,
применить интерфейсы к абстрактному классу Phone и классам-наследникам.
 */



public class Main {
    public static void main(String[] args){
        Informable informable;
        informable = new Phone();
        informable.infoD();

        Callable<String> samsungPhone1 = new Phone<String>("999-999-999", "Samsung", 105.9);
        System.out.println(samsungPhone1.getNumber());

        Callable<String> xiaomiPhone1= new Phone<String>("888-888-888", "Xiaomi", 192);
        String xNum = xiaomiPhone1.getNumber();
        System.out.println(xNum);

        Callable<String> applePhone1 = new Phone<String>("777-777-777", "Apple", 200.16);
        String aNum = applePhone1.getNumber();
        System.out.println(aNum);

        SamsungPhone samsungPhone= new SamsungPhone("999-999-999", "Sumsung",100.123, "Sasha");
        XiaomiPhone xiaomiPhone= new XiaomiPhone("888-888-888", "Xiaomi", 192, "Yolca");
        ApplePhone applePhone = new ApplePhone("777-777-777", "Apple", 200.16, "Misha");
        samsungPhone.info();
        xiaomiPhone.info();
        applePhone.info();

        samsungPhone.receiveCall();
        xiaomiPhone.receiveCall();
        applePhone.receiveCall();


    }
}
