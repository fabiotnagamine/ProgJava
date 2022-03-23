//Para esse exemplo o uso da recursividade pode até ajudar até certos valores
//O uso exaustivo da recursividade temos o problema do StackOverFlow que é o estouro da memória da pilha
//Nesse exemplo foi usada a iteratividade para resolver esse problema, pois a iteratividade  nesse caso 
//são mais eficientes em termos de performance e do uso de memória

import java.util.stream.LongStream;

public class FactorialCalculation {

    public static void main(String[] args){
        final long iteration = 50L;

        final long result = LongStream.iterate(1, n -> n + 1 ).limit(iteration)
                .reduce(1,(a,b) -> a * b);

        System.out.println("Factorial result = " + result);
    }

}
