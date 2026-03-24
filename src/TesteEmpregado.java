import com.fornazeiro.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado();
        emp1.setNome("Felipe");
        emp1.setTipo(2);
        emp1.setSalario(2000);
        emp1.setComissao(0.1);
        System.out.println(emp1.calcularSalario());
    }
}