package org.javaacademy.core.lesson8.ex1;

public class Runner {
    public static void main(String[] args) throws CarHasNoFuelException {

        Car car = new Car(1);
//        try {
//            car.go();
//        } catch (Exception e) {
//            System.out.println("С машиной что то не так едем на моря на поезде");
//        }
//    }
//}
//
        car.go();
    }
}
