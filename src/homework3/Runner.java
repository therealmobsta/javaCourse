package homework3;
public class Runner {

    public static void ex2() {
        // Создание Samsung
        Samsung samsung = SamsungFactory.createSamsung();
        samsung.takePhoto();

        // Создание Iphone
        Iphone iphone = IphoneFactory.createIphone();
        iphone.takePhoto();
        iphone.printProcessorInfo();
    }

    public static void ex3() {
        // Создание экземпляра класса Pyramid1 и вызов метода print
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();

        // Создание экземпляра класса Pyramid2 и вызов метода print
        Pyramid2 pyramid2 = new Pyramid2();
        pyramid2.print();

        // Создание экземпляра класса Pyramid3 и вызов метода print
        Pyramid3 pyramid3 = new Pyramid3();
        pyramid3.print();
    }

    public static void main(String[] args) {
        ex2();
        System.out.println("___________________");
        ex3();
    }
}