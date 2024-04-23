public class ProdutoEletronico implements Promocao {
    String modelo;
    String marca;
    double preco;

    @Override
    public double calcDesconto(double percentual){
        double desconto = preco * (percentual/100);
        return preco - desconto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
