public class Main {

    public static void main(String[] args) {
        System.out.println("Process flow exercise!");


        Process process = new Process(10);

        Stage incep = new Inception("Inception", 5, 10, 0.8);

        incep.startWorking();
    }
}
