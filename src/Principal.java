import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        filmeUm.setNome("Fame");

        filmeUm.setIncluidoNoPlano(true);
        filmeUm.setDuracaoEmMinutos(160);

        filmeUm.exibeFichaTecnica();
        filmeUm.avalia(8);
        filmeUm.avalia(3);
        filmeUm.avalia(10);

       // System.out.println(filmeUm.somaAvaliacoes);
        System.out.println("Total: " + filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.pegaMediaDasAvaliacoes());
    }
}
