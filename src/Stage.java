import java.util.Random;

public class Stage {

    private String name;
    private int timeFrame;
    private int nInputs;
    private int nOutputs;
    private double succesRate;

    public Stage(String name, int timeFrame, double succesRate) {
        this.name = name;
        this.timeFrame = timeFrame;
        // this.nInputs = nInputs;
        // this.nOutputs = nOutputs;
        this.succesRate = succesRate;

    }

    public int startWorking() {
        Random rand = new Random();
        double projectQuality;
        int iterations = 0;

        do {
            iterations++;


            projectQuality = rand.nextDouble();
            System.out.println(projectQuality);
        } while (succesRate > projectQuality);

        return nOutputs;
    }

    public String getName() {
        return name;
    }

    public int getTimeFrame() {
        return timeFrame;
    }

    public int getnInputs() {
        return nInputs;
    }

    public int getnOutputs() {
        return nOutputs;
    }

}