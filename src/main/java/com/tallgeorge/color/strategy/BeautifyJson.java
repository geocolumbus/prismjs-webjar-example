package com.tallgeorge.color.strategy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Indents and colorizes a string containing JSON.
 */
class BeautifyJson implements BeautifyCode {

    /**
     * {@inheritDoc}
     */
    @Override
    public final String beautify(final String uglyJson) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(uglyJson);
        return gson.toJson(je);

        //TODO Colorize the output and make the links live
    }
}
