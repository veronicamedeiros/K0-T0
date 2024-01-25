public class Largest_Prime_Factor {
    public static void main(String[] args) {

        long finalNumber = 600851475143L;
        long initialNumber = finalNumber;
        int largest = 0;

        while (finalNumber != 1) {

            for (int number = 2; true; number++) {

                if (finalNumber % number == 0) {
                    finalNumber = finalNumber / number;
                    largest = number;
                    break;
                }
            }
        }
        
        System.out.print("O maior fator primo do número " + initialNumber + " é " + largest);
    }
}
