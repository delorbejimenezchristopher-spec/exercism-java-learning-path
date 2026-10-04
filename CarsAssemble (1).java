public class CarsAssemble {
    private static final int CARS_PER_HOUR_AT_SPEED_ONE = 221;

    public double productionRatePerHour(int speed) {
        return CARS_PER_HOUR_AT_SPEED_ONE * speed * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    // Tasa de éxito según la velocidad de la línea de ensamblaje.
    private double successRate(int speed) {
        if (speed <= 4) {
            return 1.0;
        }
        if (speed <= 8) {
            return 0.9;
        }
        if (speed == 9) {
            return 0.8;
        }
        return 0.77;
    }
}
