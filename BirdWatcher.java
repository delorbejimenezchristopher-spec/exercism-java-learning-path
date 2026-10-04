import java.util.Arrays;

class BirdWatcher {
    private static final int[] LAST_WEEK = {0, 2, 5, 3, 7, 8, 4};
    private static final int BUSY_DAY_THRESHOLD = 5;

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    // Se devuelve una copia para no exponer el arreglo interno.
    public static int[] getLastWeek() {
        return LAST_WEEK.clone();
    }

    // El último elemento es el conteo de hoy.
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    // Suma de los primeros 'numberOfDays' días (sin pasarse del tamaño del arreglo).
    public int getCountForFirstDays(int numberOfDays) {
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        int total = 0;
        for (int i = 0; i < limit; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    // Día ocupado: cinco o más aves.
    public int getBusyDays() {
        int busyDays = 0;
        for (int birds : birdsPerDay) {
            if (birds >= BUSY_DAY_THRESHOLD) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
