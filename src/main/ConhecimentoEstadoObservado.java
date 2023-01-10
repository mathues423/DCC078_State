package main;

public class ConhecimentoEstadoObservado extends ConhecimentoEstado{
    private ConhecimentoEstadoObservado() {};
    private static ConhecimentoEstadoObservado intace = new ConhecimentoEstadoObservado();
    public static ConhecimentoEstadoObservado getInstance(){
        return intace;
    }

    @Override
    public String getEstado(){
        return "Conhecimento no estado de observação.";
    }

    public boolean teorizar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoTeorizado.getInstance());
        return true;
    }

    public boolean testar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoTestado.getInstance());
        return true;
    }
}
