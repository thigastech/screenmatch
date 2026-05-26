import calculos.Recomendacao;
import modelos.Episodio;
import modelos.Movie;
import modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setNome("Círculo de Fogo");
        myMovie.setAnoDeLancamento(2013);
        myMovie.setDuracaoEmMinutos(180);
        myMovie.setIncluidoNoPlano(true);


        myMovie.exibeFicha();
        myMovie.avaliar(3);
        myMovie.avaliar(7);
        myMovie.avaliar(5);

        System.out.println("Total de Avaliações: " + myMovie.getTotalDeAvaliacao());
        System.out.println(myMovie.obterMedia());
       // myMovie.somaAvaliacao = 10;

        Serie theoffice = new Serie();

        theoffice.setNome("The Office");
        theoffice.setDuracao(25);
        theoffice.setTemporadas(9);
        theoffice.setAnoDeLancamento(2005);
        theoffice.setIncluidoNoPlano(true);
        theoffice.setAtiva(false);

        theoffice.exibeFicha();
        theoffice.avaliar(7);
        theoffice.avaliar(10);
        theoffice.avaliar(9);

        System.out.println("Total de Avaliações: " + theoffice.getTotalDeAvaliacao());
        System.out.println(theoffice.obterMedia());


        Recomendacao filtro = new Recomendacao();
        filtro.filtra((myMovie));

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theoffice);
        episodio.setTotalView(300);
        filtro.filtra(episodio);

        var secondMovie = new Movie();
        secondMovie.setNome("Internet: O filme");
        secondMovie.setDuracaoEmMinutos(200);
        secondMovie.setAnoDeLancamento(2017);
        secondMovie.setDiretor("Rafinha Bastos");
        secondMovie.setIncluidoNoPlano(true);
        secondMovie.avaliar(10);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(secondMovie);
        System.out.println("Tamanho da Lista: " +listaDeFilmes.size());
        System.out.println("Primeiro Filme: " +listaDeFilmes.get(0).getNome());









    }
}
