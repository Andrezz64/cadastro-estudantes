
package alunos;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class AlunoData {  //Classe de manipulação dos dados de alunos e base de dados da aplicação
    // Atenção!!! Manter o ArrayList alunos PRIVADO.
    private ArrayList<Aluno> alunos = new ArrayList<>();  //Iniciaçização da base de dados em forma de array

    public void adicionarAluno(Aluno aluno) { //Método para adicionar um aluno a base
        if( this.buscarAlunoMatricula(aluno.getMatricula()) == null){
        alunos.add(aluno);
        }

    }

    public String buscarAlunoMatricula(long matricula) { // Método para buscar um aluno na base usando a matricula
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno.toString();
            }
        }
        return null;
    }

    public String buscarAlunoNome(String nome) { // Método para buscar um aluno na base usando a o nome
        for (Aluno aluno : alunos) {
            if (aluno.getName() == nome) {
                return aluno.toString();
            }
        }
        return null;
    }

    public int pegarIndexAluno(Long matricula){
        int controle = 0;
        for (Aluno aluno : alunos) {
            
            if (aluno.getMatricula() == matricula) {
                break;
                
            }
        controle++;
        }
        return controle;
    }
    
    public void romoverAluno(int index){  // Método para remover uma aluno da base
        alunos.remove(index);
      
    }

    public void exibirAlunos(){ // Exibe todos os alunos da base
  
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }
}
