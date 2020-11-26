package newpackage;

import java.util.Random;

public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean aberto;
    private Pessoa leitor;
    private int pagina;
    public int pagAtual;

    public Livro(String t, String a, int tot, boolean ab, Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tot;
        this.aberto = ab;
        this.leitor = l;
    }
    
    public void detalhes(){
        
        System.out.println("Título: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Total de páginas: "+this.totPaginas);
        
    }
    
    @Override
    public void abrir() {
        
        this.setAberto(this.getAberto() == true);
        
    }

    @Override
    public void fechar() {
        
        this.setAberto(this.getAberto() == false);
        
    }

    @Override
    public void folhear() {
        
        if(this.getAberto() && this.getTotPaginas() > 0){
        
        Random pagAleatoria = new Random();
        
        pagAtual = pagAleatoria.nextInt(this.getTotPaginas());
        
        switch (this.getPagAtual()){
            
            case 0:
                
                System.out.println("Folheou até o livro fechar. Tente novamente.");
                
                break;
                
                
            default:
                
                System.out.print(this.getPagAtual());
            
        }
        
        }else{
            
            System.out.println("Livro fechado.");
            
        }

    }
    
    @Override
    public void avancarPag() {
        
        this.setPagina(this.getPagina() + 1);
        
    }

    @Override
    public void voltarPag() {
        
        this.setPagina(this.getPagina() - 1);
        
    }

    public int getPagina() {
        return this.pagina;
    }

    public void setPagina(int pag) {
        
        this.pagina = pagAtual;
        
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
