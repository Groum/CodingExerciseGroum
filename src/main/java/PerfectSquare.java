import java.util.List;
import java.util.stream.Collectors;

public class PerfectSquare {
    public List<Integer> ingest(List<Integer> ListCollected)
    {
        System.out.println("The following numbers are received and 0 " +
                "is not accepted as entry but 0 is a Prefect Square \n");

        ListCollected.stream().
                filter(x ->x!=0)
                .forEach(System.out :: println);
        List<Integer> ArrayListCollectedb = checkPerfectSquare(ListCollected);
        return ArrayListCollectedb;

    }

        List<Integer>  checkPerfectSquare(List<Integer> ListCollected)
    {

                 List<Integer> evenNumbers = ListCollected.stream()
                .filter(i -> Math.sqrt(i) % 1 == 0)
                .filter(j -> j !=0)
                .collect(Collectors.toList());

        System.out.println("The following numbers are Perfect Square from your list");
        evenNumbers.forEach(System.out::println);
        if (evenNumbers.isEmpty())
        {
            System.out.println("No Perfect numbers found");
        }

        return evenNumbers;

    }



}
