import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {


            public static void main(String[]args) {

                PerfectSquare obj = new PerfectSquare();
                int inputNumber;
                List<Integer> collected = new ArrayList<Integer>();
                Scanner scanIn = new Scanner(System.in);
                System.out.println("Type the numbers to check for perfect Square\n"+
                        " Or Type 0 to exit" );
                do {
                    inputNumber = scanIn.nextInt();

                    collected.add(inputNumber);

                } while(inputNumber != 0);

                  obj.ingest(collected);

           }

}
