public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] allNumbers = new boolean[n+1];
        double counter = 0;
        for(int i = 2 ; i <= n; i++)
        {
           allNumbers[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (allNumbers[i]) {
                for (int j = i * i; j <= n; j += i) {
                    allNumbers[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int m = 2; m <= n; m++) {
            if (allNumbers[m]) {
                System.out.println(m + " ");
                counter ++;
         }
      }
      double pre = (double)counter/(double)n*100;
      System.out.print("There are " +(int)counter +" primes between 2 and " +n);
      System.out.println(" (" + (int)pre +"% are primes)");
    }
}