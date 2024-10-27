public class Principal {
    public static void main(String[] args) {
        // Criando um buraco redondo
        BuracoRedondo buraco = new BuracoRedondo(5.0);

        // Criando um pino redondo
        PinoRedondo pinoRedondo = new PinoRedondoConcreto(4.0);
        System.out.println("Pino redondo se encaixa? " + buraco.encaixa(pinoRedondo));

        // Criando um pino quadrado
        PinoQuadrado pinoQuadrado = new PinoQuadrado(6.0);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado se encaixa? " + buraco.encaixa(adaptador));

        // Testando um pino quadrado que se encaixa
        PinoQuadrado pinoQuadradoMenor = new PinoQuadrado(4.0);
        AdaptadorPinoQuadrado adaptadorMenor = new AdaptadorPinoQuadrado(pinoQuadradoMenor);
        System.out.println("Pino quadrado menor se encaixa? " + buraco.encaixa(adaptadorMenor));
    }
}
