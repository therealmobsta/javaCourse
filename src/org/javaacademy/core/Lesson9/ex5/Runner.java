package org.javaacademy.core.Lesson9.ex5;

public class Runner  {
    public static void main(String[] args) {
        //vert - letit vpered
        //yasheritsu - polzet vpered
        //lodka - plyvet vpered

        Movable helicopter = new Movable() {

            @Override
            public void go() {
                System.out.println("Вертолет летит вперед");
            }
        };
        Movable reptile = new Movable() {

            @Override
            public void go() {
                System.out.println("яшерица ползет вперед");
            }
        };
        Movable boat = () -> System.out.println("лодка плывет вперед");
        Movable[] movables = {helicopter, reptile, boat};
        for (Movable movable : movables) {
            movable.go();
        }
    }
}
