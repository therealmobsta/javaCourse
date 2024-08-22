package homework4.ex3;

public class Runner {
    public static void main(String[] args) {
        SoundMaker[] soundMakers = {
                new Human(),
                new Builder(),
                new Driver(),
                new Bird()
        };

        for (SoundMaker soundMaker : soundMakers) {
            System.out.println(soundMaker.makeSound());
        }
    }
}