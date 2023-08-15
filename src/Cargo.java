public enum Cargo {
    DESENVOLVEDOR(new CalculaSalario3000()),
    TESTER(new CalculaSalario2000()),
    DBA(new CalculaSalario2000());

    private  RegraDeCalculo RegraDeCalculo;
     Cargo(RegraDeCalculo regraCalculo){
         RegraDeCalculo=regraCalculo;

    }
    public RegraDeCalculo getRegraCalculo() {
        return RegraDeCalculo;
    }
}
