public abstract class Veiculo {
    String modelo;
    String marca;
    int anof;
    boolean disponivel;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnof() {
        return anof;
    }

    public void setAnof(int anof) {
        this.anof = anof;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public Veiculo(String modelo, String marca, int anof, boolean disponivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anof = anof;
        this.disponivel = disponivel;
    }

}
