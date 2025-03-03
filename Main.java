
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
}