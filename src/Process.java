public class Process {

    private int totalWork;
    private int iterations;
    private int timeSpend;

    public Process(int totalWork) {
        this.totalWork = 1000;
    }

    public void simulateProcess(Stage stage) {
        for(int i = 0; i < totalWork; i++) {

            iterations += stage.work();

        }

        simulationFeedback(stage);

        iterations = 0;
    }

    public void simulationFeedback(Stage stage) {

        // Ved ikke hvorfor de bliver 1.0 og 0
        double avgIterations = iterations/totalWork;
        double avgTimeSpend = stage.getTimeFrame()/totalWork;

        System.out.println("\nIterations during " + stage.getName() + ": " + iterations);
        System.out.println("Time spend: " + stage.getTimeFrame()*iterations + " weeks");
        System.out.println("Projects dropped: " + (stage.getnInputs() - stage.getnOutputs()));
    }

    public int getTotalWork() {
        return totalWork;
    }

    public void setTotalWork(int totalWork) {
        this.totalWork = totalWork;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public int getTimeSpend() {
        return timeSpend;
    }

    public void setTimeSpend(int timeSpend) {
        this.timeSpend = timeSpend;
    }
}
