package zumbi;

public class Main {

    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 100;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 30;


        //Referenciar zumbi1 = zumbi2 faz com que ambos se tornem o mesmo zumbi. zumbi1 passa a apontar para zumbi2
        //e o endereço de zumbi2 é perdido e removido pelo TrashCollector

        /*zumbi1 = zumbi2;
        zumbi1.vida = 40;*/

        if(zumbi1.transferirVida(99,zumbi2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        //System.out.println("Vida zumbi 1: "+ zumbi1.vida +" Vida zumbi 2: "+ zumbi2.vida);
    }

}
