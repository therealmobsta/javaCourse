package homework3;

class IphoneFactory {

    public static Iphone createIphone() {
        Processor[] processors = {new Processor(1000), new Processor(1000)}; // Создание двух процессоров
        Camera camera = new Camera(8); // Создание камеры
        Body body = new Body(60, 200, 10); // Создание корпуса
        return new Iphone(processors, camera, body); // Создание телефона Iphone
    }
}