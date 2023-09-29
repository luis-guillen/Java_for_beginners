public class HundredthPrime
{
   public static void main(String[] args)
   {
      int n = 100; // Find the 100th prime number
      int count = 0;
      int number = 2;

      while (count < n) {
         boolean isPrime = true;

         // Check if the current number is prime
         for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
               isPrime = false;
               break;
            }
         }

         if (isPrime) {
            count++;
            if (count == n) {
               System.out.println(number);
            }
         }

         number++;
      }
   }
}