package homeworkpack.homework3;

class Samsung {
    private Processor processor;
    private Camera camera;
    private Body body;

    public Samsung(Processor processor, Camera camera, Body body) {
        this.processor = processor;
        this.camera = camera;
        this.body = body;
    }

    public void takePhoto() {
        camera.takePhoto();
    }
}