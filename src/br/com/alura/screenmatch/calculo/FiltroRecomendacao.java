package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=4){
            System.out.println("Esta entre os Trendings Titles");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado");
        }
        else {
            System.out.println("Coloque na Lista e Veja Depois");
        }
    }
}

