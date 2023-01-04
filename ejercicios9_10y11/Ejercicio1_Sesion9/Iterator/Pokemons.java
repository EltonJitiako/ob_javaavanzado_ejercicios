package ejercicio3;

import java.util.ArrayList;

public class Pokemons implements PokemonsInterator {
    private ArrayList<Pokemon> pokemon = new ArrayList<>();

    private int position = 0;

    public void create(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    };

    @Override
    public boolean hasMore() {
        return position < this.pokemon.size();
    };

    @Override
    public Pokemon next() {
        Pokemon pokemon = this.pokemon.get(position);
        position++;
        return pokemon;
    };

    @Override
    public void reset() {
        position = 0;
    };




}
