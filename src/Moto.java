public class Moto extends Vehiculo{

    private String cilindrage;
    private Boolean esElectrica;

    public Moto(String cilindrage, Boolean esElectrica) {
        this.cilindrage = cilindrage;
        this.esElectrica = esElectrica;
    }
    @Override
    public void acelerando() {
        super.acelerando();
    }
    @Override
    public void frenando() {
        super.frenando();
    }
    @Override
    public void iniciarMarcha() {
        super.iniciarMarcha();
    }

    @Override
    public String toString() {
        return "Moto" +
                "\ncilindrage='" + cilindrage + '\'' +
                ",\nesElectrica=" + esElectrica;
    }

    public String getCilindrage() {
        return cilindrage;
    }

    public void setCilindrage(String cilindrage) {
        this.cilindrage = cilindrage;
    }

    public Boolean getEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(Boolean esElectrica) {
        this.esElectrica = esElectrica;
    }
}
