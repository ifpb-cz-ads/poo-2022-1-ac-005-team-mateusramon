class TesteIgualdade3 {
    public static void main(String[] args) {
       String frase1;
       String frase2;
       frase1 = new String("Testando igualdade!");
       frase2 = new String("Testando igualdade!"); 
       System.out.println("Frase1 :" +frase1);
       System.out.println("Frase2 :" +frase2);
       System.out.println("Frase1 e Frase2 possuem o mesmo conteudo? R:" +(frase1.equals(frase2))); // metodo equals para comparar conteudo de dois atributos do tipo objeto.//
    }

}
