package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> selecaoPortugal = new ArrayList<>();
        selecaoPortugal.add("De Bruyne");
        selecaoPortugal.add("Rafael Leão");
        selecaoPortugal.add("João Cancelo");
        selecaoPortugal.add("Ruben Neves");
        selecaoPortugal.add("Bernardo Silva");

        List<String> selecaoBelgica = new ArrayList<>();
        selecaoBelgica.add("De Bruyne");
        selecaoBelgica.add("Lukaku");
        selecaoBelgica.add("Hazard");
        selecaoBelgica.add("Kompany");
        selecaoBelgica.add("Vertonghen");

        for(int i = 0; i <= selecaoPortugal.size()-1; i++){
            var nome = selecaoPortugal.get(i);
            var temEsseNome = selecaoBelgica.contains(nome);
            if (temEsseNome) {
                System.out.println(nome + " semelhante a um nome da Seleção de Portugal");
            }
        }

        //Forma simplificada
        for(String nomeJogador : selecaoPortugal){
            if (selecaoBelgica.contains(nomeJogador)) {
                System.out.println(nomeJogador + " semelhante a um nome da Seleção de Portugal");
            }
        }

        //Outra forma
        Iterator<String> iterator = selecaoPortugal.iterator();
        while(iterator.hasNext()){
            if (selecaoBelgica.contains(iterator.next())) {
                System.out.println("Existe semelhanças entre jogadores Portugueses e Belgas");
            }
        }
    }

}
