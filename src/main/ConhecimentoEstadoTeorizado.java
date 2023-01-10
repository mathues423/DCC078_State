package main;

public class ConhecimentoEstadoTeorizado extends ConhecimentoEstado{

    private ConhecimentoEstadoTeorizado() {};
    private static ConhecimentoEstadoTeorizado intace = new ConhecimentoEstadoTeorizado();
    public static ConhecimentoEstadoTeorizado getInstance(){
        return intace;
    }

    @Override
    public String getEstado() {
        return "Conhecimento no estado de teorização.";
    }

    public boolean verificar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoVerificado.getInstance());
        return true;
    }

    public boolean testar(Conhecimento conhecimento) {
        conhecimento.setEstado(ConhecimentoEstadoTestado.getInstance());
        return true;
    }
}
