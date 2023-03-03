public class Carro extends Vehiculo{
    private String motor;
    private int puertas;

    public Carro(String motor, int puertas) {
        this.motor = motor;
        this.puertas = puertas;
    }


    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    @Override
    public void acelerando() {
        System.out.println("Estamos Acelerando Carro");
        super.acelerando();
    }

    @Override
    public void frenando() {
        System.out.println("Estamos Frenando Carro");
        super.frenando();
    }
    @Override
    public void iniciarMarcha() {
        super.iniciarMarcha();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"\nMotor: "+getMotor()+"\nPuertas: "+getPuertas();
    }

}
