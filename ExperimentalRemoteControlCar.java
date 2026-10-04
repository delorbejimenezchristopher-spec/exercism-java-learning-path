public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private static final int DISTANCE_PER_DRIVE = 20;

    private int distanceTravelled = 0;

    @Override
    public void drive() {
        distanceTravelled += DISTANCE_PER_DRIVE;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
