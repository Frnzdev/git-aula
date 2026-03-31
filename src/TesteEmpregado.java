import com.fornazeiro.Empregado;

import java.util.Arrays;
import java.util.List;

public class TesteEmpregado {
    public static void main(String[] args) {

        /*
        String name = "Felipe";
        String apelido = name; sempre sera Felipe
        name = "Mario";
        System.out.println(apelido); felipe
         */

        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();

        e1.setNome("Marcos");
        e2.setNome("Joao");
        e3.setNome("Pedro");


        e1.setTipo(1);
        e2.setTipo(2);
        e3.setTipo(3);

        e1.setSalario(2000);
        e2.setSalario(1700);
        e2.setComissao(0.2);//20% de comissão sobre o salário
        e3.setSalario(1500);
        e3.setBonus(400);

        List<Empregado> emps = Arrays.asList(e1, e2, e3);

        for (Empregado e : emps) {
            System.out.println("---------------------");
            System.out.println("Nome: " + e.getNome());
            System.out.println(e.calcularSalario());
        }
    }
}
