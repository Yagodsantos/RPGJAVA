/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabalho;

/**
 *
 * @author YAGODOSSANTOSESOUZA
 */
import java.util.Scanner;
public class MainJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Dados dados = new Dados();
    
        System.out.println("Bem-vindo ao jogo de fantasia!");
        System.out.print("Qual é o nome do seu personagem? ");
        String nome = scanner.nextLine();

        System.out.println("Escolha uma classe: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        switch (escolha) {
            case 1:
                personagens = new Guerreiro(nome);
                break;
            case 2:
                personagens = new Mago(nome);
                break;
            case 3:
                personagens =  new Arqueiro(nome);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        personagens.mostrarStatus();

        // História e escolhas interativas
        inicioDaAventura();
    }

    public static void inicioDaAventura() {
        System.out.println("\nVocê acorda em sua pequena aldeia, a manhã está fria, e o som dos pássaros pode ser ouvido.");
        System.out.println("Você ouve uma batida na porta, é um mensageiro.");
        System.out.println("Ele fala: o cachorro precioso da capital Porto Alegre foi sequestrado por um grande monstro!'");
        
        System.out.println("Você pode escolher o que fazer:");
        System.out.println("1 - Seguir o mensageiro imediatamente.");
        System.out.println("2 - Ignorar o pedido e ficar na aldeia.");
        
        int escolha1 = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha
        
        if (escolha1 == 1) {
            irParaPOA();
        } else {
            ficarNaAldeia();
        }
    }

    public static void irParaPOA() {
        System.out.println("\nVocê decide seguir o mensageiro até Porto Alegre.");
        System.out.println("Ao chegar, você vê uma grande floresta sombria e misteriosa, o cão está preso em cima da grande torre.");
        System.out.println("No caminho até a torre, você encontra um monstro bizarro. Seu nome é Gustavo e ele está decicido a não deixar você passar.");
        System.out.println("O que você faz?");
        System.out.println("1 - Atacar o monstro.");
        System.out.println("2 - fugir.");
        
        int escolha2 = scanner.nextInt();
        scanner.nextLine();  
        if (escolha2 == 1) {
            batalhaComMonstro();
        } else {
            fugir();
        }
    }

    public static void batalhaComMonstro() {
        System.out.println("\nVocê começa a lutar contra o monstro! A batalha é intensa.");
        // Aqui podemos implementar a lógica de combate. Vou simplificar:
        System.out.println("A batalha foi difícil, mas você venceu o monstro!");
        
        System.out.println("Você agora pode continuar até a torre do mago. O que você faz?");
        System.out.println("1 - Entrar na torre.");
        System.out.println("2 - Voltar para a aldeia.");

        int escolha3 = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        if (escolha3 == 1) {
            torre();
        } else {
            ficarNaAldeia();
        }
    }

    public static void torre() {
        System.out.println("\nVocê entra na grande torre e encontra-o preso em um círculo mágico.");
        System.out.println("O cão diz: 'Obrigado por me resgata-', mas antes que possa terminar, uma poderosa magia deixada pelo inimigo transforma o cão em um Dragão-Cão-Caramelo.'");
        System.out.println("O que você faz?");
        System.out.println("1 - Enfrentar o Dragão-Cão-Caramelo.");
        System.out.println("2 - Recuar e voltar para a aldeia.");

        int escolha4 = scanner.nextInt();
        scanner.nextLine();  

        if (escolha4 == 1) {
            batalhaFinal();
        } else {
            ficarNaAldeia();
        }
    }

    public static void batalhaFinal() {
        System.out.println("\nVocê parte para enfrentar o dragão-cão-caramelo, sabendo que essa é a maior batalha de sua vida.");

        System.out.println("A batalha foi épica, mas você conseguiu derrotar o Dragão-Cão-Caramelo e transforma-o de volta em um simples e fofo cachorro!");
        System.out.println("Você se torna um herói lendário de Porto Alegre e é presenteado com um curso gratuito do senac com aulas com o professor Eslabao!");
    }

    public static void fugir() {
        if (personagens instanceof Mago) {
            System.out.println("O Mago usa sua magia para derrotar o monstro!");
        } else {
            System.out.println("Você decide fugir e evitar o monstro.");
        }
        
        System.out.println("Você continua sua jornada para a grande torre.");
        torreDoMago();
    }

    public static void ficarNaAldeia() {
        System.out.println("\nVocê decide ficar na aldeia, mas um inimigo gigante que se parece com um Dragão-Cão ataca a aldeia e mata você");
    }
}

             
    


    

