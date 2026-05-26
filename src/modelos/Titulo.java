package modelos;

public class Titulo {

        public String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaAvaliacao;
        private int totalDeAvaliacao;
        private int duracaoEmMinutos;



        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome(){
            return this.nome;
        }

        public int getAnoDeLancamento(){
            return this.anoDeLancamento;
        }

        public boolean getisIncluidoNoPlano() {
            return this.incluidoNoPlano;
        }

        public int getDuracaoEmMinutos() {
            return this.duracaoEmMinutos;
        }

        public int getTotalDeAvaliacao(){
            return this.totalDeAvaliacao;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void exibeFicha(){
            System.out.println("Nome do Filme: " + nome);
            System.out.println("Ano de Lançamento: " + anoDeLancamento);
            System.out.println("Duração em minutos: " +duracaoEmMinutos);
            System.out.println("Incluído no Plano: " +incluidoNoPlano);
        }

        public void avaliar(double nota){
            somaAvaliacao += nota;
            totalDeAvaliacao++;
        }

        public double obterMedia(){
            return somaAvaliacao / totalDeAvaliacao;
        }

    }






