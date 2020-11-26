package newpackage;

public class Pessoa implements Cliente{
    
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, int ida, String s) {
        this.nome = n;
        this.idade = ida;
        this.sexo = s;
    }
    
    @Override
    public void dados(){
        
        System.out.println("---------DADOS DO CLIENTE---------");
        System.out.println("\nNome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("");
        
    }
    
    @Override
    public void idadeAtual(){
        
        System.out.println(this.getIdade());
        
    }
    
    @Override
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
