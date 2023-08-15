public class Calculadora {
    public double Calcular(Funcionario funcionario){
        return funcionario.cargo.getRegraCalculo().Calcula(funcionario);
    }
}
