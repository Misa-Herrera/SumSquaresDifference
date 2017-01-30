/**
 * Created by misae on 8/15/2016.
 */
public class SumSquaresDifference {

        public static void main(String []args)
        {
            int total = 0;
            int tot=0;
            int diff=0;
            for (int i = 1; i <= 100; i++)
            {
                total += (i*i);
                tot+=i;
            }
            tot = tot * tot;
            diff= tot - total;
            System.out.println("sum_squares() = " + total);
            System.out.println("squares_sum() = " + tot);
            System.out.println("difference= " + diff);

        }
    }