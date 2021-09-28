package composicao;

public class Principal {
    public static void main(String[] args) {

        Empresa emp = new Empresa();
        emp.departamento.nome = "Desenvolvimento";
        emp.nome = "Ubisoft";

        System.out.println(emp.departamento.nome);
        emp.imprimirNome();

    }
}
