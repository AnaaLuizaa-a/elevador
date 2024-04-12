public class elevador {
        int andaratual = 0;
        int totalandares, capacidade, pessoas;

      //Inicializar: que deve receber como parametros a capacidade do elevador e o total de andares no predio (os elevadores sempre comecam no terreo e vazio);
      public void inicializar(int capacidade, int totalandares){
        this.capacidade = capacidade;
        this.totalandares = totalandares;
      }
      //Entrar: para acrescentar uma pessoa no elevador (so´ deve acrescentar se ainda houver espaco);
      public void entrar(int pessoas){
        if(pessoas < capacidade){
        this.pessoas = pessoas;
        } else { 
    System.out.println("Elevador já está cheio");
         }
      }  
      //Sair: para remover uma pessoa do elevador (so deve remover se houver alguem dentro dele);
      public void sair(int pessoas){
        if (pessoas > 0){
          this.pessoas = pessoas;
        }else{
System.out.println("Elevador está vazio");
        }
      }
      //Subir: para subir um andar (nao deve subir se ja estiver no ultimo andar);
  public void subir(int andaratual){
    if(andaratual < totalandares){
      this.andaratual = andaratual;
    }else{
      System.out.println("Elevador já está no último andar");
    }
  }
     public void descer(int andaratual){
       if(andaratual > 0){
         this.andaratual = andaratual;
       }else{
         System.out.println("Elevador já está no terreo");
       }
     } 
  
    }