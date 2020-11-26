package newpackage;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, int ida, String s) {
        this.nome = n;
        this.idade = ida;
        this.sexo = s;
    }
    
    public void idadeAtual(){
        
        System.out.println(this.getIdade());
        
    }
    
    public void fazerAniversario(){
        
        this.setIdade(this.getIdade() + 1);
        
    } 

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int ida) {
        this.idade = ida;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
      
}
