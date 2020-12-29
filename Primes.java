
import java.util.*;

public class Primes {
    static boolean isPrime(Integer a){
        if (a <= (int) primes.get(primes.size() -1)){
            return primes.contains(a);
        }
        else{
            int t = (int) primes.get( primes.size() -1) + 1;
            do l1: {
                int o=primes.size();
                //   System.out.println(t);
                for (int i=0; i<o; i++){
                    if ( (t %  (int) primes.get(i))==0 ){
                        t+=1;
                        break l1;
                    }
                }
                primes.add(t);
                t+=1;
                //   System.out.println("added "+primes.get(-1));
            }
            while (t<=a);
            return (primes.get(primes.size() -1) ==a);
        }
    }
    static public List primes = new ArrayList<Integer>();
    public static void main(String [] args){
        primes.add(2);
        int i = 3;
        while (i<100){
            isPrime(i);
            i++;
        };
        i=primes.size();
        while (i!=0){
            i--;
            System.out.print(primes.get(i).toString() + '\n');
        }
    }

}
