class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private static final int DISTANCE_PER_DRIVE = 10;

    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    @Override
    public void drive() {
        distanceTravelled += DISTANCE_PER_DRIVE;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    // Orden natural: de mayor a menor número de victorias.
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}
