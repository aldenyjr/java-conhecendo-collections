package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPorNome = null;
        if(!dicionarioMap.isEmpty()){
            palavraPorNome = dicionarioMap.get(palavra);
        }
        return palavraPorNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Luxúria", "Comportamento desregrado em relação aos prazeres do sexo");
        dicionario.adicionarPalavra("Sucesso", "Acontecimento favorável; resultado feliz; êxito: projeto de sucesso");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("Luxúria");
        dicionario.exibirPalavras();

        System.out.println("Significado: " + dicionario.pesquisarPorPalavra("Sucesso"));


    }
}
