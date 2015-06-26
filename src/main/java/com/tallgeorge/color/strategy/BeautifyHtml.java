package com.tallgeorge.color.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Indents and colorizes a string containing HTML.
 */
class BeautifyHtml implements BeautifyCode {

    /**
     * The class logger.
     */
    private final Logger logger = LoggerFactory.getLogger(BeautifyHtml.class);
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String beautify(final String uglyHtml) {
        return uglyHtml.replaceAll("\\<","&lt;");
    }
}
