package br.inatel.cdg;

import br.inatel.cdg.Pessoas.Cavaleiro;
import br.inatel.cdg.Pessoas.Guarda;
import br.inatel.cdg.Pessoas.Lorde;
import br.inatel.cdg.Pessoas.Pessoa;

public class Main {

    public static void main(String[] args) {
        Guarda g = new Guarda("Guarda",23,10,25);
        Cavaleiro c = new Cavaleiro("Dom Quixote",30,40,"La Mancha","Sancho pança");
        Lorde l = new Lorde("Aragorn",87,90,"Rivendell",8);

        Pessoa[] pessoasArray = new Pessoa[3];
        pessoasArray[0] = g;
        pessoasArray[1] = c;
        pessoasArray[2] = l;

        for(Pessoa pessoa: pessoasArray){
            System.out.println();
            if(pessoa instanceof Guarda){
                Guarda g1 = (Guarda)pessoa;
                g1.fazerPatrulha();
                g1.orar();
                g1.mostraInfo();
            }
            else if(pessoa instanceof Cavaleiro){
                Cavaleiro c1 = (Cavaleiro)pessoa;
                c1.fazerPatrulha();
                c1.consagrarCavaleiro();
                c1.orar();
                c1.mostraInfo();
            }
            if(pessoa instanceof Lorde){
                Lorde l1 = (Lorde)pessoa;
                l1.consagrarCavaleiro();
                l1.orar();
                l1.mostraInfo();
            }
        }
    }
}
