package main;

public class Conhecimento {
    private String descricao;
    private ConhecimentoEstado estado;

    public Conhecimento() {
        this.estado = ConhecimentoEstadoObservado.getInstance();
    }

    public void setEstado(ConhecimentoEstado estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    //Acoes

    public boolean observar(){
        return estado.observar(this);
    }

    public boolean teorizar() {
        return estado.teorizar(this);
    }

    public boolean testar() {
        return estado.testar(this);
    }

    public boolean verificar(){
        return estado.verificar(this);
    }
}
