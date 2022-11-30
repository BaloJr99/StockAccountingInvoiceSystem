package InterfazAbstracta;

public abstract class Vehiculo {
    public String modelo, fechaingreso, fechabaja, marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(String fechabaja) {
        this.fechabaja = fechabaja;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String modelo, String fechaingreso, String fechabaja, String marca) {
        this.modelo = modelo;
        this.fechaingreso = fechaingreso;
        this.fechabaja = fechabaja;
        this.marca = marca;
    }

}
