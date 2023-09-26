package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumeros;

    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaDeNumeros.add(numero);
    }

    public int calcularSoma(){
        int somaTotal = 0;
        if (!this.listaDeNumeros.isEmpty()){
            for (int i = 0; i < this.listaDeNumeros.size(); i++) {
                somaTotal += listaDeNumeros.get(i);
            }
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaDeNumeros.isEmpty()){
            for (Integer numero : listaDeNumeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!listaDeNumeros.isEmpty()){
            for (Integer numero : listaDeNumeros){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if(!listaDeNumeros.isEmpty()){
            System.out.println(this.listaDeNumeros);
        } else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
