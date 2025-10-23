import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);


        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie lost = new Serie();
        lost.setNome("La Casa de Papel");
        lost.setAnoDeLancamento(2017);
        lost.setIncluidoNoPlano(true);
        lost.setAtiva(true);
        lost.setTemporadas(5);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(lost);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());
        System.out.println("Filme favorito: " + favorito.getNome());
        System.out.println("Outro filme: " + outro.getNome());
        System.out.println("Série: " + lost.getNome());
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost); //obj episodio referenciando obj lost
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}
