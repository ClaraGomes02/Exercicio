package newpackage;

public class NewMain {

    public static void main(String[] args) {
        
        Pessoa [] p = new Pessoa [3]; //0,1,2
        Livro [] l = new Livro [8]; //0,1,2,3,4,5,6,7
        
        p[0] = new Pessoa("Maria Clara", 18, "F");
        p[1] = new Pessoa("Lívia", 19, "F");
        p[2] = new Pessoa("Rafael", 17, "M");
        
        l[0] = new Livro("Morro dos Ventos Uivantes", "Emily Brontë", 478, p[0]);
        l[1] = new Livro("Cidades de Papel", "John Green", 368, p[1]);
        l[2] = new Livro("Dom Quixote", "Miguel de Cervantes", 844, p[2]);
        l[3] = new Livro("Guerra e Paz", "Liev Tolstói", 2536, p[1]);
        l[4] = new Livro("A Montanha Mágica", "Thomas Mann", 880, p[1]);
        l[5] = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 402, p[2]);
        l[6] = new Livro("Ulisses", "James Joyce", 550, p[2]);
        l[7] = new Livro("Em Busca do Tempo Perdido", "Marcel Proust", 558, p[2]);
        
    }
    
}
