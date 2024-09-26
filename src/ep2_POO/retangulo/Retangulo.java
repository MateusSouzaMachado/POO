package ep2_POO.retangulo;

public class Retangulo {

    private double base;
    private double altura;
    private double area;

    public Retangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        this.area = this.base * this.altura;
    }
}
