package homeworkpack.homework3;

class Iphone {
    private Processor[] processors;
    private Camera camera;
    private Body body;

    public Iphone(Processor[] processors, Camera camera, Body body) {
        this.processors = processors;
        this.camera = camera;
        this.body = body;
    }

    public void takePhoto() {
        camera.takePhoto();
    }

    public void printProcessorInfo() {
        for (Processor processor : processors) {
            System.out.println("Processor MHz: " + processor.getMhz());
        }
    }
}