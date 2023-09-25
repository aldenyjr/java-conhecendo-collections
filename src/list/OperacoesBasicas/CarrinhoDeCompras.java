package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if(!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(item);
                }
            }
            listaDeItens.removeAll(itemParaRemover);
        } else {
            System.out.println("Não há itens na Lista!");
        }
    }

    public double calcularValorTotal(){
        double valorTotalCarrinho = 0d;
        if(!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                double valorTotalDoProduto = item.getPreco() * item.getQuantidade();
                valorTotalCarrinho += valorTotalDoProduto;
            }
            return valorTotalCarrinho;
        } else {
            throw new RuntimeException("Não há itens na Lista!");
        }
    }

    public void exibirItens(){
        if(!listaDeItens.isEmpty()) {
            System.out.println(listaDeItens);
        } else {
            System.out.println("Não há itens na Lista!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Smart TV", 1250.50, 5);
        carrinhoDeCompras.adicionarItem("Geladeira", 4999.50, 5);
        carrinhoDeCompras.adicionarItem("Som Automitivo", 129.90, 10);

        carrinhoDeCompras.removerItem("Geladeira");
        carrinhoDeCompras.exibirItens();
        System.out.println("Total Carrinho: " + carrinhoDeCompras.calcularValorTotal());


    }

}
