public class CalculaSalario3000 implements RegraDeCalculo {
    @Override
    public double Calcula(Funcionario funcionario) {
        if (funcionario.salario > 3000) {
            return funcionario.salario * 0.8;
        } else {
            return funcionario.salario * 0.9;

        }
    }


}
