package second;

class Car {
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void start() {
        if (model == null || model.isEmpty()) {
            System.out.println("Car started (model not shown)");
        } else {
            System.out.println("Car " + model + " (" + color + ") started");
        }
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

public class second {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", "Red");
        c1.start();

        Car c2 = new Car("BMW", "Black");
        c2.start();

        Car c3 = new Car("", "Blue");
        c3.start();

        Car c5 = new Car("Ford", "Silver");
        c5.stop();
    }
}
