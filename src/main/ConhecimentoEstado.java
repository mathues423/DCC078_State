package main;

public abstract class ConhecimentoEstado {
    public abstract String getEstado();

    public boolean observar(Conhecimento conhecimento){
        return false;
    }

    public boolean teorizar(Conhecimento conhecimento) {
        return false;
    }

    public boolean testar(Conhecimento conhecimento) {
        return false;
    }

    public boolean verificar(Conhecimento conhecimento){
        return false;
    }
}
