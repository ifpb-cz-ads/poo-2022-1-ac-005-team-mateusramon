class TesteIgualdade2 {
    public static void main(String[] args) {
       String frase3;
       String frase4;
       frase3 = new String("Testando igualdade!");
       frase4 = frase3;             // dada a atribuicao as duas possuem a mesma referência.//                                                          
       System.out.println("Frase3 :" +frase3);
       System.out.println("Frase4 :" +frase4);
       System.out.println("Frase3 e Frase4 possuem a mesma referencia? R:" +(frase3==frase4));
    }


}