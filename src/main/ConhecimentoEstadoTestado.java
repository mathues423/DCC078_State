package main;

public class ConhecimentoEstadoTestado extends ConhecimentoEstado{
    private ConhecimentoEstadoTestado() {};
    private static ConhecimentoEstadoTestado intace = new ConhecimentoEstadoTestado();
    public static ConhecimentoEstadoTestado getInstance(){
        return intace;
    }

    @Override
    public String getEstado() {
        return "Conhecimento no estado de testes.";
    }

    public boolean verificar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoVerificado.getInstance());
        return true;
    }

    public boolean teorizar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoTeorizado.getInstance());
        return true;
    }
}
