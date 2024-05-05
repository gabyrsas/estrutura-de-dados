package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Exerciciiios {

	public static void main(String[] args) {

				        Stack<String> pilha = new Stack<>();
				        Scanner leia = new Scanner(System.in);

				        while (true) {
				           
				            System.out.println("Menu:");
				            System.out.println("1: Adicionar um novo livro na pilha");
				            System.out.println("2: Listar todos os livros da Pilha");
				            System.out.println("3: Retirar um livro da pilha");
				            System.out.println("0: Finalizar o programa");
				            System.out.print("Digite uma opção: ");
				            int opcao = leia.nextInt();
				            leia.nextLine(); 
				            switch (opcao) {
				                case 1:
				                 
				                    System.out.print("Digite o nome do livro: ");
				                    String livro = leia.nextLine();
				                    pilha.push(livro);
				                    System.out.println("Livro adicionado!");
				                    System.out.println("Pilha: " + pilha);
				                    break;
				                case 2:
				                   
				                    System.out.println("Lista de Livros na Pilha:");
				                    for (String l : pilha) {
				                        System.out.println(l);
				                    }
				                    break;
				                case 3:
				                  
				                    if (pilha.isEmpty()) {
				                        System.out.println("A Pilha está vazia!");
				                    } else {
				                        String livroRetirado = pilha.pop();
				                        System.out.println("Um Livro foi retirado da pilha!");
				                        System.out.println("Pilha: " + pilha);
				                    }
				                    break;
				                case 0:
				                 
				                    System.out.println("Programa Finalizado!");
				                    return;
				                default:
				                    System.out.println("Opção inválida!");
				                    break;
				            }
				            System.out.println();
				        }
				}



}
