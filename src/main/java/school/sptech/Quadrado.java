package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    public Quadrado() {}

    @Override
    public Double calcularArea() {
        return lado*lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
