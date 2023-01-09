package org.example;


/**
 * Ejercicios 9, 10 y 11 - ejercicio 1 Java Avanzado
 * Ejercicio extraido de ejercicio 3 Java Basico - "En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola. Tened en cuenta que los textos pueden venir de un array de tipo String."
 * *********************************************************
 * Patron de comportamiento elegido fue el patron Iterator, una vez que en este ejercicio habia que revisar una lista para concatenar los elementos.
 */
public class Concatenar {

    public static void main(String[] args) {

        /**
         * Recibe los argumentos (--nameX pokemonName) y ponerlos en una HashMap (Key:nameX, value:pokemonName)
         */
        PokemonParser optionsParser = new PokemonParser(args);
        optionsParser.registerOption("name1");
        optionsParser.registerOption("name2");
        optionsParser.registerOption("name3");
        optionsParser.registerOption("name4");
        optionsParser.parse();

        
        Pokemons pokemons = new Pokemons();
        pokemons.create(new Pokemon(optionsParser.getOption("name1")));
        pokemons.create(new Pokemon(optionsParser.getOption("name2")));
        pokemons.create(new Pokemon(optionsParser.getOption("name3")));
        pokemons.create(new Pokemon(optionsParser.getOption("name4")));

        String allPokes = "";

        while (pokemons.hasMore()) {
            Pokemon pokemon = pokemons.next();
            allPokes = allPokes.concat(pokemon.getName()).concat(" ");;
        };

        System.out.println(allPokes);

    }
    
}
