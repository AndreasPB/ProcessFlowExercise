import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Process flow exercise!");


        Stage inception = new Stage("Inception", 1, 0.5, 1);
        Stage elaboration = new Stage("Elaboration", 2, 0.5);
        Stage construction = new Stage("Construction", 4, 0.5);
        Stage transition = new Stage("Transition", 2, 0.8, 2);

        List<Stage> stageList = Arrays.asList(inception, elaboration, construction, transition);

        Process process = new Process(1000);

        for (Stage stage: stageList) {

            process.simulateProcess(stage);
        }
    }
}
