package homework3;

class SamsungFactory {
    // Метод для создания телефона Samsung
    public static Samsung createSamsung() {
        Processor processor = new Processor(1500); // Создание процессора
        Camera camera = new Camera(16); // Создание камеры
        Body body = new Body(60, 200, 15); // Создание корпуса
        return new Samsung(processor, camera, body); // Создание телефона Samsung
    }
}