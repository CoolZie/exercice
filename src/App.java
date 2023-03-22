import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.exercice.core.Produit;

public class App {
    public static void main(String[] args) throws Exception {

        List<Produit> produits = Arrays.asList(
                new Produit("Produit 1", 12.3, 20),
                new Produit("Produit 2", 5.3, 5.5),
                new Produit("Produit 3", 123.23, 20),
                new Produit("Produit 3", 123.23, 101));
        exercice1(produits);
        exercice2(produits);
    }

    private static void exercice2(List<Produit> produits) {
        List<Produit> produitsLess100 = produits.stream().filter(produit->produit.getPrice() < 100)
        .collect(Collectors.toList());
        produitsLess100.forEach(p->System.out.println(p.toString()));
    }

    private static void exercice1(List<Produit> produits) {
        List<Double> priceTTC = produits.stream()
                .map((produit) -> produit.getPrice() + (produit.getPrice() * produit.getPourcentage() / 100))
                .collect(Collectors.toList());
        priceTTC.forEach(p -> System.out.println(p));
    }

}
