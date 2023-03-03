public class Vehiculo implements Acelerar,Frenar,IniciarMarcha {

    private final String marca="BMW";
    private final String modelo="2024";
    public Vehiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    @Override
    public void acelerando() {

    }

    @Override
    public void frenando() {
        Frenar.super.frenando();
    }

    @Override
    public void iniciarMarcha() {
        IniciarMarcha.super.iniciarMarcha();
    }

    @Override
    public String toString() {
        return  "Marca: "+getMarca()+ "\nModelo: " + getModelo() ;
    }
}
