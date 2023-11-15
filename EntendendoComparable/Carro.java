package EntendendoComparable;

public class Carro implements Comparable<Carro>{
    public String marca;
    public double preco;
    public Carro(String marca, double preco){
        this.marca = marca;
        this.preco = preco;

    }
    @Override
    public int compareTo(Carro outroCarro) {
        if(this.preco == outroCarro.preco){
            return 0; // se esse cara é maior
        }else if(this.preco > outroCarro.preco){
            return 1; // se são iguais
        }
        return -1; // se o outroCarro é maior
    }
}
