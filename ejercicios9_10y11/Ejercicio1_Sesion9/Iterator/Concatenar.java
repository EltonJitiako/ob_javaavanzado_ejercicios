package ejercicio3;


/**
 * Ejercicios 9, 10 y 11 - ejercicio 1 Java Avanzado
 * Ejercicio extraido de ejercicio 3 Java Basico - "En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola. Tened en cuenta que los textos pueden venir de un array de tipo String."
 * *********************************************************
 * Patron de comportamiento elegido fue el patron Iterator, una vez que en este ejercicio habia que revisar una lista para concatenar los elementos.
 */
public class Concatenar {

    public static void main(String[] args) {
        
        Pokemons pokemons = new Pokemons();
        pokemons.create(new Pokemon("Bulbasaur"));
        pokemons.create(new Pokemon("Charizard"));
        pokemons.create(new Pokemon("Pikachu"));
        pokemons.create(new Pokemon("Venusaur"));

        String allPokes = "";

        while (pokemons.hasMore()) {
            Pokemon pokemon = pokemons.next();
            allPokes = allPokes.concat(pokemon.getName()).concat(" ");;
        };

        System.out.println(allPokes);

    }
    
}
