# poo-2022-1-ac-005-team-mateusramon
poo-2022-1-ac-005-team-mateusramon created by GitHub Classroom

Questao 03 Livro Batista e Moraes (2013) :
Class TestaContaBancáriaSimplificada {
public static void main (String []args) {
 
    TestaContaBancáriaSimplificada c1;
    c1 = new TestaContaBancáriaSimplificada();
    c1.abreContaSimples("Maria");
    TestaContaBancáriaSimplificada c2 new TestaContaBancáriaSimplificada();
    c2.abreContaSimples("João");
    c1.deposita(200);
    c2.saldo = 1000;

    if (c1.retira(300)){
        System.out.println("Saque realizado com sucesso!");
    } else {
        System.out.println("ALERTA: SALDO INSUFICIENTE!!");
    }
    c1.mostradados();
    c2.mostradados();
}
}
Questão 06 Livro Batista e Moraes (2013): 
Class TestaContaBancáriaSimplificada {
public static void main (String []args) {
 
    TestaContaBancáriaSimplificada c1;
    c1 = new TestaContaBancáriaSimplificada();
    if(c1.saldo>=100){
        c1.abreContaSimples("Maria");
    }
    TestaContaBancáriaSimplificada c2 new TestaContaBancáriaSimplificada();
    if(c2.saldo>=100){
        c2.abreContaSimples("João");
    }
    c1.deposita(200);
    c2.saldo = 1000;

    if (c1.retira(300)){
        System.out.println("Saque realizado com sucesso!");
    } else {
        System.out.println("ALERTA: SALDO INSUFICIENTE!!");
    }
    c1.mostradados();
    c2.mostradados();
}
}

Questão 07:

1 class Registro De Eleitor ( Não pode dar espaço ao declarar o nome)
2 { /*
3 /** 
4 * Declaração dos campos desta classe
5 */
6 int tituloDeEleitor; // número do título do eleitor
7 String nome; // nome do eleitor
8 short zonaEleitoral; // número da zona eleitoral
9 } // fim da classe

Qestão 08:
1 class Teste2
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int num1,num2;
7 /**
8 * Declaração dos métodos desta classe
9 */
10 int maior()
11 {
12 if (num1 > num2)
13 return true;
14 else return false;
15 }
16 void menor() (Void não retorna valor)
17 {
18 if (num1 < num2)
19 return num1;
20 else return num2;
21 }
22 } // fim da classe

Questão 09 :
1 class TesteImpressao
2 {
3 main(String[] args)
4 {
5 System.out.println(“7+2=”+(7+2));
6 System.out.println(“7-2=”+(7-2));
7 System.out.println(“7*2=”+(7*2));
8 System.out.println(“7/2=”+(7/2));
9 return true;                     (Classe não tem nenhum método de chamada de função para retornar true/ false)
10 }
11 } // fim da classe
