public class Even_Fibonacci_Numbers {
    public static void main(String[] args) {

        int finalNumber = 4000000;
        int x = 1;
        int y = 2;
        int aux = 0;
        int sum = 0;

        while(aux <= finalNumber){

            if(y % 2 == 0){
                sum += y;
            }

            aux = x + y;
            x = y;
            y = aux;
        }
    System.out.println("A soma dos números pares dentro da sequência Fibonacci até o número " + finalNumber + " é " + sum + ".");
    }
}
