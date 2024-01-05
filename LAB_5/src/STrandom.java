
public class STrandom {

    public double random(int startNumber, int endNumber) {
        double randomMePlz = Math.random();
        randomMePlz = (int) (randomMePlz * (endNumber - startNumber + 1) + startNumber);

        return (randomMePlz);
    }

    public double randomStartx100(int startNumber) {
        // endNumber = startNumber * 100
        int ConvertStartNumber = startNumber + 100;
        double randomMePlz = Math.random();
        randomMePlz = (int) (randomMePlz * (ConvertStartNumber - startNumber + 1) + startNumber);

        return (randomMePlz);
    }

    public double random0(int endNumber) {
        double randomMePlz = Math.random();

        randomMePlz = (int) (randomMePlz * (endNumber - 0 + 1) + 0);
        return (randomMePlz);
    }

    public double random1(int endNumber) {
        double randomMePlz = Math.random();
        randomMePlz = (int) (randomMePlz * (endNumber - 1 + 1) + 1);

        return (randomMePlz);
    }

}
