
public class Main {

    public static void main(String [] args){
        int teste = multNumNat(6,4);
        System.out.println("O valor da função é: " +teste);


    }

    //Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int multNumNat(int multiplicador, int produto){
        if(multiplicador == 0){
            return 0;
        }

        return produto + multNumNat(multiplicador-1, produto);
    }

    
}