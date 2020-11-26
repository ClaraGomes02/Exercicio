package newpackage;

public class NewMain {

    public static void main(String[] args) {
        
        Pessoa [] p = new Pessoa [2];
        Livro [] l = new Livro [2];
        
        p[0] = new Pessoa("Maria", 12, "F");
        p[1] = new Pessoa("João", 15, "M");
        
        l[0] = new Livro("Morro dos Ventos Uivantes", "Emanoel", 2, true, p[0]);
        l[1] = new Livro("She", "Harry", 50, true, p[1]);
        
        p[0].fazerAniversario();
        p[0].idadeAtual();
        
        l[0].detalhes();
    }
    
}
