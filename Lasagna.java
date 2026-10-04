public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int MINUTES_PER_LAYER = 2;

    // Devuelve el tiempo esperado de horneado, en minutos.
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    // Minutos que faltan en el horno según los minutos ya transcurridos.
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    // Cada capa toma 2 minutos de preparación.
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * MINUTES_PER_LAYER;
    }

    // Tiempo total de trabajo = preparación + tiempo en el horno.
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
