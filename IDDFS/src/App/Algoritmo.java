/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.Stack;

/**
 *
 * @author fabio
 */
public class Algoritmo {
    private Node objetivo;
    private boolean objetivoAtingido;
    
    public Algoritmo(Node objetivo){
        this.objetivo = objetivo;
    }
    public void algoritmoDeBuscaProfundidade(Node inicio){
        int profundidade = 0;
        
        while(!objetivoAtingido){
            System.out.println();
            dfs(inicio,profundidade);
            profundidade++;
            
        }
    }
    
    private void dfs(Node inicio, int profundidade){
        Stack<Node> pilha = new Stack<>();
        inicio.setProfundidade(0);
        pilha.push(inicio);
        
        while(!pilha.isEmpty()){
            Node noAtual = pilha.pop();
            System.out.println(noAtual+" ");
            
            if(noAtual.getNome().equals(this.objetivo.getNome())){
                System.out.println("\nNo foi achado");
                this.objetivoAtingido = true;
                return;
        }
            if (noAtual.getProfundidade() >= profundidade){
                continue;
            }
            for (Node node: noAtual.getListaDeAdjacencia()){
                node.setProfundidade(noAtual.getProfundidade()+ 1 );
                pilha.push(node);
                
            }
        }
    }
}
