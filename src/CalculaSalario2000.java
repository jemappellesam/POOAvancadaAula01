public class CalculaSalario2000 implements RegraDeCalculo {
    @Override
    public double Calcula(Funcionario funcionario) {
        if(funcionario.salario>3000){
            return funcionario.salario*0.75;

        }
        else {
            return funcionario.salario*0.85;
        }
    }

}
