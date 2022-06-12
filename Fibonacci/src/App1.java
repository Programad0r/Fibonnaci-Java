//Implementação - Recursiva Utilizando o Operador Ternário
public class App1 {
    
    static long fibo(int n){
       return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args){
        //teste do programa. Imprime os 30 primeiros termos
        for(int i = 0; i < 30; i++){
            System.out.println("("+i+"):" + App1.fibo(i) + "\t");
        }
    }

}
