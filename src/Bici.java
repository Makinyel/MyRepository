public class Bici extends Vehiculo{

    private String tipoLLanta;
    private String tamaño;
    private int cambios;

    public Bici(String tipoLLanta, String tamaño, int cambios) {
        this.tipoLLanta = tipoLLanta;
        this.tamaño = tamaño;
        this.cambios = cambios;
    }
    @Override
    public void iniciarMarcha() {
        super.iniciarMarcha();
    }

    @Override
    public String toString() {
        return "Bici{" +
                "tipoLLanta='" + tipoLLanta + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", cambios=" + cambios +
                '}';
    }

    public String getTipoLLanta() {
        return tipoLLanta;
    }

    public void setTipoLLanta(String tipoLLanta) {
        this.tipoLLanta = tipoLLanta;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
}
