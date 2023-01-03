package ejercicio3;

/* 
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String.  
*/
public class Concatenar {

    public static void main(String[] args) {
        
        String[] pokemons = {"Bulbasaur", "Charizard", "Pikachu", "Venusaur"};

        String allPokes = "";

        for (String poke : pokemons) {
            allPokes = allPokes.concat(poke).concat(" ");
        }
        System.out.println(allPokes);

    }
    
}
