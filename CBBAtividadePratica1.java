class TesteIgualdade {
    public static void main(String[] args) {
       String frase1;
       String frase2;
       frase1 = new String("Testando igualdade!");
       frase2 = new String("Testando igualdade!"); //   apesar de possuirem o mesmo conteudo, frase1 e frase2 possuem referencias diferentes //
                                                            //    ou seja, diferentes espacos alocados em memoria. um objeto para cada String um new para cada atributo //
       System.out.println("Frase1 :" +frase1);
       System.out.println("Frase2 :" +frase2);
       System.out.println("Frase1 e Frase2 sao iguais? R:" +(frase1==frase2));
    }

}
