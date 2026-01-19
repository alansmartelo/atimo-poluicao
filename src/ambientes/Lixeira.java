package ambientes;

public class Lixeira {
    private String tipo;
    private String cor;

    public Lixeira(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }
    public boolean aceitaLixo(String tipoLixo) {
        return this.tipo.equals(tipoLixo);
    }
    public String getTipo() {
        return tipo;
    }
    @Override
    public String toString() {
        return cor + " Lixeira de " + tipo;
    }
}