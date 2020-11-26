package newpackage;

import java.util.Random;

public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean aberto = false;
    private Pessoa leitor;
    public int pagAtual;

    public Livro(String t, String a, int tot, Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tot;
        this.leitor = l;
    }
    
    @Override
    public void detalhes(){
        
        if(this.getAberto()){
            
            System.out.println("---------DADOS DO LIVRO---------");
            System.out.println("\nTítulo: "+this.titulo);
            System.out.println("Autor: "+this.autor);
            System.out.println("Total de páginas: "+this.totPaginas);
            System.out.println("Página atual: "+this.pagAtual);
            System.out.println("");
            
        }else{
        
        System.out.println("---------DADOS DO LIVRO---------");
        System.out.println("\nTítulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Total de páginas: "+this.totPaginas);
        System.out.println("Livro fechado.");
        System.out.println("");
        
        }
        
    }
    
    @Override
    public void abrir() {
        
        this.setAberto(true);
        
    }

    @Override
    public void fechar() {
        
        this.setAberto(false);
        
    }

    @Override
    public void folhear() {
        
        if(this.getAberto() && this.getTotPaginas() > 0){ //Se o livro estiver aberto e o total de páginas for maior que 0:
        
        Random pagAleatoria = new Random(); //Criação de "pagAleatoria" como sendo do tipo Random.
        
        pagAtual = pagAleatoria.nextInt(this.getTotPaginas()); //Será colocado dentro de "pagAtual" o valor aleatório calculado de acordo com o total de páginas do Livro.
        
        switch (this.getPagAtual()){ //Pega o que está dentro de pagAtual e verifica se ele se enquadra em algum dos casos.
            
            case 0: //Caso "0" = primeiro caso. Se o valor do Random der 0 quer dizer que o Livro está fechado.
                
                this.setAberto(false);
                
                break;
                
                
            default:
                
                
                
        }
        
        }else{
            
            //System.out.println("Livro fechado."); //Se o Livro estiver fechado não poderá folhear.
            
        }

    }
    
    @Override
    public void avancarPag() {
        
        this.setPagAtual(this.getPagAtual() + 1);
        
    }

    @Override
    public void voltarPag() {
        
        this.setPagAtual(this.getPagAtual() - 1);
        
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagA) {
        this.pagAtual = pagA;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int tot) {
        this.totPaginas = tot;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }

}
