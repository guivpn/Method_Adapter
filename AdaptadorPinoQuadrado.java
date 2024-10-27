public class AdaptadorPinoQuadrado implements PinoRedondo {
    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        // Raio equivalente para o pino quadrado
        return (pinoQuadrado.getLargura() / 2) * Math.sqrt(2);
    }
}
