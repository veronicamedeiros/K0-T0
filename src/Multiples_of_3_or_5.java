public class Multiples_of_3_or_5 {
    public static void main(String[] args) {
        int sum = 0;
        int finalNumber = 1000;

        for(int number = 1; number < finalNumber; number++){
            if(number % 3 == 0 | number % 5 ==0){
                sum +=number;
            }
        }
        System.out.println("A soma dos número múliplos de 3 ou 5 abaixo de " + finalNumber + " é " + sum + ".");
    }
}
