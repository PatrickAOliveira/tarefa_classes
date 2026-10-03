import br.com.poliveira.Gabinete;

public class App {

    // Função para cadastrar novo gabinete
    static void novoGabinete(Gabinete gabinete) {
        gabinete.setArmazenamento("SSD Kingston NV3, 1TB");
        gabinete.setId(1);
        gabinete.setMemoriaRam("Memória DDR5 Kingston 16GB");
        gabinete.setNome("Gamer Ninja Tessen");
        gabinete.setFonte("Gamemax GS600, 600W, 80 Plus White");
        gabinete.setPlacaVideo("NVIDIA GeForce RTX 5060, 8GB");
        gabinete.setSistemaOperacional("Windows 11");
        gabinete.setProcessador("AMD Ryzen 5 8500G, 3.5GHz, 6-Cores 12-Threads, AM5");
        gabinete.setPlacaMae("Colorful Battle-AX B650M-E WIFI v14, AMD, AM5");
    }

    public static void main(String[] args) {
        Gabinete gabinete = new Gabinete();

        novoGabinete(gabinete);
        System.out.print(gabinete);
    }
}
