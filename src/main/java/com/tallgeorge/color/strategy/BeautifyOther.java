package com.tallgeorge.color.strategy;

/**
 * Default beautifier for code that cannot be handled by a specific beautifier.
 */
class BeautifyOther implements BeautifyCode {

    /**
     * {@inheritDoc}
     */
    @Override
    public final String beautify(final String uglyCode) {
        return uglyCode;
    }
}
