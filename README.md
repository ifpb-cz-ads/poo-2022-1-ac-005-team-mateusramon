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
