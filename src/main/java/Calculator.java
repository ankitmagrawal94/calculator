import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static void main(String[] args){

        add("");

    }

    public static int add(String input) throws NumberFormatException{

        int sum =0;

        List<Integer> list = new ArrayList<Integer>();

        String[] inputNumbers = input.split(",");

        for(String s:inputNumbers){
            int i = Integer.parseInt(s);
            list.add(i);
        }

        for(int number : list){

            sum = sum + number;

        }

        return sum;
    }

}
