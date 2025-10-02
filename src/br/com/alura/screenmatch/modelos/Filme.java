package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
   private double somaAvaliacoes; //shift + f6 pra renomear tudo
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    //getters
  public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome; //O this quer dizer ESTE objeto. Ref magica
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    //metodos
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){ //nota é um parametro do metodo
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

   public double pegaMediaDasAvaliacoes(){ //usa Double porque ele vai retornar algo que e double
        return somaAvaliacoes / totalDeAvaliacoes;
    }

}
