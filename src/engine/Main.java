package engine;

import ambientes.*;
import personagens.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("🌿 === ÁTIMO POLUIÇÃO === 🌿");
        System.out.println("Salvador, Bahia\n");

        Nia heroina = new Nia();
        Atimo vilao = new Atimo("Lixo Sólido");

        Lixeira [] lixeiras = {
            new Lixeira("PLASTICO", "🔴"),
            new Lixeira("PAPEL", "🔵"),
            new Lixeira("VIDRO", "🟢"),
            new Lixeira("METAL", "🟡"),
            new Lixeira("ORGANICO", "🟤")
        };
        System.out.println("=== INÍCIO DO COMBATE ===\n");
        heroina.mostrarStatus();
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.println("--- ROUND " + i + " ---");
            String lixo = vilao.cuspirLixo();

            boolean acertou = Math.random() > 0.5;

            if (acertou) {
                System.out.println("→ Nia acertou a lixeira!");
                vilao.diminuir();                
            } else {
                System.out.println("→ Nia errou!");
                vilao.crescer();
            }
            System.out.println();
        }
        System.out.println("=== TENTATIVA DE CAPTURA ===");
        heroina.usarArtefato(vilao);

        if (vilao.estaCapturado()){
            System.out.println("\n🎉 VITÓRIA! Salvador está mais limpa!");
        } else {
            System.out.println("\nÁtimo ainda resiste...");
        }
    }
}