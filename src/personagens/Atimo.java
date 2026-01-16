package personagens;

public class Atimo {

    private String tipo;
    private int tamanho;
    private boolean capturado;
    
    public Atimo(String tipo) {
        this.tipo = tipo;
        this.tamanho = 10;
        this.capturado = false;
        
    }
    public void crescer() {
        tamanho++;
        System.out.println("💢 Atimo do " + tipo + " cresce! Tamanho: " + tamanho);
    }
    public void diminuir() {
        if (tamanho >1) {
            tamanho--;
            System.out.println("✓ Atimo do " + tipo + " enfraquece! Tamanho: " + tamanho);
        }
        }
    public String cuspirLixo() {
        String[] tiposLixo = {"PLASTICO", "PAPEL", "VIDRO", "METAL", "ORGANICO"};
        int random = (int)(Math.random() * tiposLixo.length);
        String lixo = tiposLixo[random];
        System.out.println("💨 Atimo do " + tipo + " cospe " + lixo + "!");
        return lixo;
    }
    public void capturar() {
        this.capturado = true;
    }
    public boolean estaCapturado() {
        return capturado;
    }
    public int getTamanho() {
        return tamanho;
    }
}


    

