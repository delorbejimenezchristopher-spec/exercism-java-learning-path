class NeedForSpeed {
    private static final int FULL_BATTERY = 100;

    private final int speed;
    private final int batteryDrain;
    private int battery = FULL_BATTERY;
    private int distanceDriven = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    // La batería está agotada si no alcanza para otro recorrido.
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }
        distanceDriven += speed;
        battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    // Se prueba con una batería nueva: se conduce hasta agotarla o hasta llegar a la meta.
    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() < distance) {
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
