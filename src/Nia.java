package src;

/**
 * Nia - Protagonista e Ativista Ambiental.
 * "Salvador não é depósito de lixo de Atimo nenhum!"
 */
public class Nia {
    private String nome = "Nia";
    private int saude = 100;
    private int conscienciaAmbiental = 100;

    public void atacar(String atimoNome) {
        System.out.println(this.nome + " usa o artefato místico contra o " + atimoNome + "!");
    }

    // Métodos para acessar os dados (Getters)
    public int getSaude() {
        return saude;
    }

    public int getConsciencia() {
        return conscienciaAmbiental;
    }
}
