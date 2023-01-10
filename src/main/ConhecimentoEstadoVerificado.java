package main;

public class ConhecimentoEstadoVerificado extends ConhecimentoEstado{

    private ConhecimentoEstadoVerificado() {};
    private static ConhecimentoEstadoVerificado intace = new ConhecimentoEstadoVerificado();
    public static ConhecimentoEstadoVerificado getInstance(){
        return intace;
    }

    @Override
    public String getEstado() {
        return "Conhecimento no estado de verificação.";
    }

    public boolean observar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoObservado.getInstance());
        return true;
    }

    public boolean teorizar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoTeorizado.getInstance());
        return true;
    }

    public boolean testar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoTestado.getInstance());
        return true;
    }

    public boolean verificar(Conhecimento conhecimento) {
        return true;
    }
}
