
public class Main {

    public static void main(String [] args){
        int teste = multNumNat(6,4);
        System.out.println("O valor da função 1 é: " +teste);

        teste = sumNumNat(3, 3);
        System.out.println("O valor da funcão 2 é: " + teste);

        double value = sumDiv(2);
        System.out.printf("O valor da terceira função é: %.2f \n", value);

        String word = "Inverso";
        word = revString(word);

        System.out.println("A palavra invertida fica: "+ word);

        teste = seqGenerator(5);
        System.out.println("Resultado da função: " + teste);

        teste = ackerman(2, 3);
        System.out.println("Resultado da função: " + teste);

        int [] array = {1,1,1,1,1};
        teste = sumArray(array, 0);
        System.out.println("Resultado da função é: " + teste);

    }

    //Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int multNumNat(int multiplicador, int produto){
        if(multiplicador == 0){
            return 0;
        }

        return produto + multNumNat(multiplicador-1, produto);
    }

    //Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
    public static int sumNumNat(int parcela, int total){
        if (parcela == 0) {
            return total;
        }

        return sumNumNat(parcela -1, total +1);
    }

    //Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
    public static double sumDiv(int divisor){
        if (divisor == 1) {
            return 1.0;
        }
        
        return 1.0 / divisor + sumDiv(divisor - 1);
    }

    //Inversão de uma string.
    public static String revString(String word){
        if (word.isEmpty()) {
            return word;
        }

        return revString(word.substring(1)) + word.charAt(0);
    }

    /*Gerador da sequência dada por:
    * F(1) = 1
    * F(2) = 2
    * F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).*/

    public static int seqGenerator(int n){
        //Aparentemente está certo, mas não tenho certeza
        if (n == 1) {
            return 1;

        }else if (n == 2){
            return 2;

        }else{
            return 2 * seqGenerator(n - 1) + 3 * seqGenerator(n - 2);
        }
    }

    //Função de Ackerman
    //Recebe dois parametros
    //Se m == 0, retorna n + 1
    //Se n == 0, retorna  A(m − 1, 1)
    //Senão, retorna A(m − 1, A(m, n − 1))

    public static int ackerman(int a, int b){
        if (a == 0){
            return b + 1;

        }else if (b == 0){
            return ackerman(a - 1, 1);

        }else{
            return ackerman(a - 1, ackerman(a, b - 1));
        }
    }

    //A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.
    public static int sumArray(int [] array, int idx){
        if (idx == array.length){
            return 0;
        }
        return array[idx] + sumArray(array, idx + 1);
    }
}