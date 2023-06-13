package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(counter); j++) {
                if (counter % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(counter);
            }

            counter++;
        }
    }
}
