import com.fornazeiro.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {

        /*
        String name = "Felipe";
        String apelido = name; sempre sera Felipe
        name = "Mario";
        System.out.println(apelido);
         */

        Empregado e1 = new Empregado("João", 30, 1, 3000.0, 0.0, 0.0);
        Empregado e2 = new Empregado("Maria", 28, 2, 2500.0, 0.1, 0.0);
        Empregado e3 = new Empregado("Carlos", 35, 3, 4000.0, 0.0, 500.0);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}