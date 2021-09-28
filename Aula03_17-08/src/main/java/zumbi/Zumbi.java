package zumbi;

public class Zumbi {

    double vida;
    boolean estouComFome;

    String falar(){
        return "Estou com fome";
    }

    double getVida(){
        return vida;
    }

    boolean transferirVida(double quantia, Zumbi zumbiDestino){
        if(this.vida>quantia){
            zumbiDestino.vida += quantia;
            this.vida -= quantia;
            System.out.println("Sucesso.Vida do zumbi que transferiu: " + vida + " Vida do zumbi que recebeu: "+ zumbiDestino.vida);
            return true;
        }else{
            System.out.println("Erro, vida insuficiente. A vida máxima a se transferir deve ser menor que "+this.vida);
            return false;
        }
    }

}
