import java.util.Random;

public class Stage {

    private String name;
    private int timeFrame;
    private int nInputs;
    private int nOutputs;
    private double succesRate;
    private int maxIterations;

    public Stage(String name, int timeFrame, double succesRate, int maxIterations) {
        this.name = name;
        this.timeFrame = timeFrame;
        this.succesRate = succesRate;
        this.maxIterations = maxIterations;
    }

    public Stage(String name, int timeFrame, double succesRate) {
        this.name = name;
        this.timeFrame = timeFrame;
        this.succesRate = succesRate;
        this.maxIterations = 100;
    }

    public int work() {
        Random rand = new Random();
        double stageQuality = rand.nextDouble();
        int iterations = 0;
        boolean stageSuccess;

        // Starter om hver gang successRate er lavere end stageQuality
        while(succesRate < stageQuality) {
            nInputs++;
            iterations++;

            if(maxIterations < iterations) {
                // Projektet mislykkedet og skrottet = intet output
            } else {
                nOutputs++;
            }
            stageQuality = rand.nextDouble();
        }

        return iterations;
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