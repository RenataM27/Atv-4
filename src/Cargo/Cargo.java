package Cargo;

public class Cargo{
   private String nome;
   private double salario;
  private String beneficios;

   Cargo(String nome,double salario,String beneficios){
       this.nome=nome;
       this.salario=salario;
       this.beneficios=beneficios;

   }
   public String getNome(){
       return nome;
   }
   public double getSalario(){
       return salario;
   }
   public String getBeneficios(){
       return beneficios;
   }

}
