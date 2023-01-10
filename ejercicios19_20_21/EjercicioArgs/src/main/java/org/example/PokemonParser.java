package org.example;

import java.util.HashMap;

public class PokemonParser {
    private HashMap<String, String> options = new HashMap();
    private String []args;

    private PokemonParser(){};
    public PokemonParser(String []args) {
        this.args = args;
    }

    public void registerOption(String optionName) {
        options.put(optionName, "");
    }

    public String getOption(String optionName) {
        return options.get(optionName);
    }

    public void setValue(String optionName, String value) {
        options.replace(optionName, value);
    }

    public void parse() {
        for (int i = 0; i < args.length; i++) {

            String optionName = args[i].replace("--", "");

            if (options.containsKey(optionName)) {

                setValue(optionName, args[i + 1]);
                i++;

            }
        }
    }

}
