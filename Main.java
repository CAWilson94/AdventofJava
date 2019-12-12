import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<Integer> fileToArrayList(String fileName) {
        List<Integer> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.ready()) {
                String line = br.readLine();
                int intLine = Integer.parseInt(line);
                result.add(intLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();
        List<Integer> fuelList = new ArrayList<>();
        List<Integer> inputList = m.fileToArrayList("I:\\hackathon\\AdventCode\\resources\\demo.txt");
        RocketModule rocket = new RocketModule();
        inputList.forEach( (mass) ->fuelList.add(rocket.calculateFuelAmount((mass))));
        int sum = fuelList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
