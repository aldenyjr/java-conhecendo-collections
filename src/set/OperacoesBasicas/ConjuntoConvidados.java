package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if(!convidadoSet.isEmpty()){
            for (Convidado c : convidadoSet){
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        } else {
         throw new RuntimeException("Não há Convidados na Lista!");
        }
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicicionarConvidado("Convidado 2", 1234);
        conjuntoConvidados.adicicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado(s) dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();

    }
}
