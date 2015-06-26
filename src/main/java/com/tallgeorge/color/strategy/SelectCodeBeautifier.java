package com.tallgeorge.color.strategy;

/**
 * Select a beautification strategy based on the code's content type.
 */
public interface SelectCodeBeautifier {

    /**
     * Lookup the correct beautification strategy based on content type.
     *
     * @param contentType a content type, the content type for the code.
     * @return a class, a code beautifier strategy
     */
    BeautifyCode lookupByContentType(String contentType);
}

