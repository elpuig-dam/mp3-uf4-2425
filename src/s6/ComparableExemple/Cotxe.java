package s6.ComparableExemple;

public class Cotxe implements Comparable<Cotxe>{
    private String Marca;
    private String Model;
    private String matricula;
    private int potencia; //mesura en cv
    private int cilindrada;

    public Cotxe(String marca, String model, String matricula, int potencia, int cilindrada) {
        Marca = marca;
        Model = model;
        this.matricula = matricula;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public int compareTo(Cotxe o) {
        if(this.potencia < o.getPotencia()) return 1;
        else if(this.potencia > o.getPotencia()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "Marca='" + Marca + '\'' +
                ", Model='" + Model + '\'' +
                ", matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cotxe)) return false;

        Cotxe cotxe = (Cotxe) o;

        return getMatricula().equals(cotxe.getMatricula());
    }

    @Override
    public int hashCode() {
        return getMatricula().hashCode();
    }
}
