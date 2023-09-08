/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alunos;

/**
 *
 * @author andre
 */
public class Aluno {
   // Atributos
   private long matricula;
   private String nome;
   private String email;
   private long numeroTelefone;
   private String endereco;
    
   public Aluno(long matricula,String nome, String email,long numeroTelefone,String endereco){
       this.matricula = matricula;
       this.nome = nome;
       this.email = email;
       this.numeroTelefone = numeroTelefone;
       this.endereco = endereco;
       
   }
   
   public Long getMatricula(){
   return this.matricula;
   }

   public String getName(){
    return this.nome;
   }
  
   public String toString(){
    return "Aluno: [Matricula: " + this.matricula+ ", Nome: "+this.nome+", Email: "+this.email+", Telefone: "+this.numeroTelefone+", Endereco: "+this.endereco+"]";
   }
}
