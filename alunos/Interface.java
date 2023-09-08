package alunos;

import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Interface { // Classe referente a interface com o usuário, manipulação de Classes operárias
                         // e Instânciação.
    public static void ProgramCall() {
        // Iniciando várivaveis fora do Escopo do-while
        AlunoData controle = new AlunoData();
        boolean sair = false;
        Scanner scan = new Scanner(System.in);
        while (!sair) {
            // Inicializando váriaveis dos atributos da classe Aluno
            String nome;
            long matricula;
            String email;
            long numeroTelefone;
            String endereco;

    

            // Menu de operações

            System.out.println("Escolha a operação que deseja realizar: \n"+
            "(1) - Adicionar um Estudante\n"+
            "(2) - Buscar um Estudante\n"+
            "(3) - Deletar um Estudante\n"+
            "(4) - Exibir todos os estudantes da base\n"+
            "(0) - Sair\n"
            );
            int escolha = scan.nextInt();

            switch (escolha) {
                // Notas mentais: Transoformar cada operação em um método desta mesma classe, de preferencia como protected
                case 1: // Lógica para adicionar um aluno
                
                    System.out.print("Digite a matricula do estudante: ");
                    matricula = scan.nextLong();
                    scan.nextLine();

                    System.out.print("Digite o nome do estudante: ");
                    nome = scan.nextLine();

                    System.out.print("Digite o Email do estudante: ");
                    email = scan.nextLine();

                    System.out.print("Digite o Numero de telefone do estudante: ");
                    numeroTelefone = scan.nextLong();
                    scan.nextLine();

                    System.out.print("Digite o Endereco do estudante: ");
                    endereco = scan.nextLine();

                    Aluno novoAluno = new Aluno(matricula, nome, email, numeroTelefone, endereco);
                    controle.adicionarAluno(novoAluno);
                    break;
                case 2: // Lógica para Buscar um aluno

                    System.out.println("Como deseja Buscar os dados do estudante ?");
                    System.out.println("(1) - Buscar estudante por matricula");
                    System.out.println("(2) - Buscar estudante por nome");
                    int escolhaBuscar = scan.nextInt();
                    scan.nextLine();
                    if (escolhaBuscar == 1) {
                        System.out.print("Digite a matricula do estudante: ");
                        long matriculaBuscar = scan.nextLong();
                        System.out.println("------------------------------------------");
                        System.out.println(controle.buscarAlunoMatricula(matriculaBuscar));
                        System.out.println("------------------------------------------");
                    } else if (escolhaBuscar == 2) {
                        System.out.print("Digite o nome do estudante: ");

                        String matriculaBuscar = scan.nextLine();
                        System.out.println("------------------------------------------");
                        System.out.println(controle.buscarAlunoNome(matriculaBuscar));
                        System.out.println("------------------------------------------");
                    }

                    break;
                case 3:

                    System.out.print("Digite a matricula do estudante que deseja deletar: ");
                    long matriculaDeletar = scan.nextLong();
                    int alunoIndex = controle.pegarIndexAluno(matriculaDeletar);
                    controle.romoverAluno(alunoIndex);
                    break;

                case 4:
                    System.out.println("------------------------------------------");
                    controle.exibirAlunos();
                    System.out.println("------------------------------------------");
                    break;

                case 0:
                    sair = true;
                    
                    break;
            }

        }
        scan.close();
    }

}
