package App;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String nome;
    private int profundidade = 0;
    private List<Node> listaDeAdjacencia;

    public Node(String nome) {
        this.nome = nome;
        this.listaDeAdjacencia = new ArrayList<>();
    }

    public void adicionaVizinho(Node node) {
        this.listaDeAdjacencia.add(node);
    }

    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    public List<Node> getListaDeAdjacencia() {
        return listaDeAdjacencia;
    }

    public void setListaDeAdjacencia(List<Node> listaDeAdjacencia) {
        this.listaDeAdjacencia = listaDeAdjacencia;
    }
}
