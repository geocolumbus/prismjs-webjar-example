package com.tallgeorge.color.strategy;

/**
 * Indents and colorizes a string that contains code.
 */
public interface BeautifyCode {

    /**
     * Execute the beautification strategy.
     *
     * @param code a string, code to be formatted
     * @return a string, formatted code
     */
    String beautify(String code);
}
