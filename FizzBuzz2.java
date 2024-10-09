public class FizzBuzz2 {
    public static void main (String[] args) {
        for (int i = 1 ; i <= 30 ; i++) {
            System.out.println(FizzOrBuzz(i));
        }
    }
    public static String FizzOrBuzz (int n) {
        return (n % 15 == 0) ? "FizzBuzz" :
            (n % 5 == 0) ? "Fizz" :
            (n % 3 == 0) ? "Buzz" :
            String.valueOf(n);
    }
}