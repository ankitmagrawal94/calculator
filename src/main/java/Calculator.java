import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        try{
            System.out.println("input please");

            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            add(input);

            System.out.println("another input please");

            while (scanner.hasNextLine()){

                input = scanner.nextLine();
                add(input);

                System.out.println("another input please");

            }
        } catch (NumberFormatException nfe){
            System.out.println("exiting from calculator as there is a no input");
        }

    }

    public static int add(String input) throws NumberFormatException{

        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();

        if (input == "") {

            return sum;

        }

        if(input != null){

            String[] inputNumbers = input.split(",");

            for(String s:inputNumbers){
                int i = Integer.parseInt(s);
                list.add(i);
            }
        }

        if(list != null || !list.isEmpty()){

            for(int number : list){
                sum = sum + number;
            }

        }

        System.out.println("The result is "+sum);

        return sum;
    }

}
