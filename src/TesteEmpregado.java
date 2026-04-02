import com.fornazeiro.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteEmpregado {
    public static void main(String[] args) {

        /*
        String name = "Felipe";
        String apelido = name; sempre sera Felipe
        name = "Mario";
        System.out.println(apelido); felipe
         */
        //ta com esse erro de write only object, pois eu não usei em lugar algum, apenas instaciei o objeto
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();
        Empregado e4 = new Empregado();

        e1.setNome("Marcos");
        e2.setNome("Joao");
        e3.setNome("Pedro");

        e1.setTipo(1);
        e2.setTipo(2);
        e3.setTipo(3);
        e4.setTipo(3);



        e1.setSalario(2000);
        e2.setSalario(1700);
        e2.setComissao(0.2);//20% de comissão sobre o salário
        e3.setSalario(1500);
        e3.setBonus(400);
        e4.setSalario(1500);
        e4.setBonus(400);

        Scanner s = new Scanner(System.in);
        List<Empregado> emps = new ArrayList<>();


        for (int i = 0; i >= emps.size() && emps.size() <= 3 ; i++) {
            Empregado newEmp = new Empregado();
            System.out.println("digite seu nome");
            String nome = s.next();
            newEmp.setNome(nome);
            System.out.println("digite sua idade");
            int idade = s.nextInt();
            newEmp.setIdade(idade);
            emps.add(newEmp);
        }
        for (Empregado e : emps) {
            System.out.println("---------------------");
            System.out.println("Nome: " + e.getNome());
            System.out.println(e.calcularSalario());
        }
    }
}
