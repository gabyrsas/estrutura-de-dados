package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class EstruturaDeDados {

	public static void main(String[] args) {
		
		        Queue<String> fila = new LinkedList<>();
		        Scanner leia = new Scanner(System.in);

		        while (true) {
		            
		            System.out.println("Menu:");
		            System.out.println("1: Adicionar um novo Cliente na fila");
		            System.out.println("2: Listar todos os Clientes na fila");
		            System.out.println("3: Chamar (retirar) uma pessoa da fila");
		            System.out.println("0: Finalizar o programa");
		            System.out.print("Digite uma opção: ");
		            int opcao = leia.nextInt();
		            leia.nextLine(); 
		            
		            switch (opcao) {
		                case 1:
		                    
		                    System.out.print("Digite o nome: ");
		                    String nome = leia.nextLine();
		                    fila.offer(nome);
		                    System.out.println("Cliente Adicionado!");
		                    System.out.println("Fila: " + fila);
		                    break;
		                case 2:
		                 
		                    System.out.println("Lista de Clientes na Fila: ");
		                    for (String cliente : fila) {
		                        System.out.println(cliente);
		                    }
		                    break;
		                case 3:
		                  
		                    if (fila.isEmpty()) {
		                        System.out.println("A Fila está vazia!");
		                    } else {
		                        String clienteChamado = fila.poll();
		                        System.out.println("O Cliente " + clienteChamado + " foi Chamado!");
		                        System.out.println("Fila: " + fila);
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