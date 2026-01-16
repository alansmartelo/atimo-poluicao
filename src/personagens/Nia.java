package personagens;

public class Nia {

    private String nome;
    private int saude;
    private int conscienciaAmbiental;

    public Nia(){
    this.nome = "Nia";
    this.saude = 100;
    this.conscienciaAmbiental = 100;
}
    public void invocarVersaoPurificada(){
    if (conscienciaAmbiental >= 20) {
        System.out.println("✨ Nia invoca versão purificada");
        conscienciaAmbiental -=20;      
    } else{
        System.out.println("⚠️ Consciência insuficiente!");
    }
}    
    public void usarArtefato(Atimo alvo) {
    if (alvo.getTamanho()<=3) {
        System.out.println("🔮 Atimo capturado no artefato!");
        alvo.capturar();       
    } else {
        System.out.println("❌ Atimo ainda está forte demais!");
    }

}
    public void mostrarStatus() {
    System.out.println("--- Status de Nia ---");
    System.out.println("Saúde: " +saude);
    System.out.println("Consciência: " +conscienciaAmbiental);
}
}
