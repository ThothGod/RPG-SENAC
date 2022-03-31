import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("*SEM NOME*\n\n1.JOGAR\n2.CRÉDITOS\n3.SAIR");
    int start = entrada.nextInt();
    System.out.print( "\033[H\033[2J" );  //isso limpa a tela
    System.out.flush(); 
    if (start == 1){
    System.out.println("Digite seu nome");
    String nome = entrada.next();
      try { //isso dá um delay
      Thread.sleep(1000);
      }catch (Exception e) {
      }
      System.out.println("Escolha um personagem");
    int menu  = 0;
    String persona = " ";
    menu = entrada.nextInt();
    switch (menu) {
      case 1:
         persona = "teste"+nome;
      break;
      case 2:
        persona = "teste"+nome;
      break;
      case 3:
        persona = "teste"+nome;
      break;
      case 4:
        persona = "teste"+nome;
      break;
      case 5:
        persona = "teste"+nome;
      break;
      case 6:
        persona = "teste"+nome;
      break;
    }
    System.out.println("*LUGAR...*");
    int caminho  = 0;
    String opc = " ";
    caminho = entrada.nextInt();
    switch (caminho) {
      case 1:
         opc = "teste";
      break;
      case 2:
         opc = "teste";
      break;
      case 3:
         opc = "teste";
      break;
  }
  System.out.print( "\033[H\033[2J" ); 
  System.out.flush(); 
    }else if (start == 2){
      System.out.println("CRÉDITOS \n\n");
    }if (start == 3) {
    }
    }
    }
