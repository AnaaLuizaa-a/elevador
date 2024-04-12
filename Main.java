import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite a capacidade do elevador: ");
    int capacidade = ler.nextInt();
    System.out.print("Digite o total de andares no prédio: ");
    int totalandares = ler.nextInt();
    
    elevador elevador = new elevador();
    elevador.inicializar(capacidade, totalandares);
    elevador.capacidade = capacidade;
    elevador.totalandares = totalandares;
    elevador.pessoas = 0;
    elevador.andaratual = 0;
    System.out.println("Elevador inicializado com capacidade de" + capacidade + "pessoas e " + totalandares + " andares.");
    while (true){
      System.out.println("Digite 1 para entrar, 2 para sair, 3 para subir e 4 para descer: ");
      int opcao = ler.nextInt();
      if (opcao == 1){
        System.out.print("Digite o número de pessoas que entraram: ");
        int pessoas = ler.nextInt();
        elevador.entrar(pessoas);
      }
      if (opcao == 2){
        System.out.print("Digite o número de pessoas que sairam: ");
        int pessoas = ler.nextInt();
        elevador.sair(pessoas);
      }
      if (opcao == 3){
        System.out.print("Digite o andar atual: ");
        int andaratual = ler.nextInt();
        elevador.subir(andaratual);
      }
      if (opcao == 4){
        System.out.print("Digite o andar atual: ");
        int andaratual = ler.nextInt();
        elevador.descer(andaratual);
      }
      System.out.println("Elevador está no andar " + elevador.andaratual + " com " + elevador.pessoas + " pessoas.");
    }
  }

}