public class Dimension {


    double altura;
    double profundidad;



    double ancho;

    public Dimension(double altura, double profundidad, double ancho) {
        setAltura(altura);
        setProfundidad(profundidad);
        setAncho(ancho);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }




}
