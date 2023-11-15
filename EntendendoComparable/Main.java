package EntendendoComparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> concessionaria = new ArrayList<>();

        Carro ferrari = new Carro("Ferrari",2000000.00d);
        Carro fusca = new Carro("Volkswagen",30000.00d);
        Carro monstertruck = new Carro("Monstrah",59000.00d);
        Carro furtado = new Carro("DuhPerigo",1500.00d);

        concessionaria.add(ferrari);
        concessionaria.add(fusca);
        concessionaria.add(monstertruck);
        concessionaria.add(furtado);

        // Sem ordenar
        for(Carro c: concessionaria){
            System.out.println("Carro: "+c.marca+" | Preço: R$ "+c.preco);
        }

        System.out.println("=======================");

        // Sorteando por preço: crescente
        Collections.sort(concessionaria); // Pega sua lista de objetos, verifica na classe deles o parametro
                                          // pra comparar, e te retorna essa mesma lista só que
                                          // agora ordenada pelo parametro que você especificou na classe (aqui foi o Objeto.preco)
        for(Carro c: concessionaria){
            System.out.println("Carro: "+c.marca+" | Preço: R$ "+c.preco);
        }
    }
}
