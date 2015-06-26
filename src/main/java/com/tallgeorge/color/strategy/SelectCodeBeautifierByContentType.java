package com.tallgeorge.color.strategy;

/**
 * Selects a code beautification strategy based on content type of the code.
 */
public class SelectCodeBeautifierByContentType implements SelectCodeBeautifier {

    /**
     * No argument class constructor.
     */
    public SelectCodeBeautifierByContentType() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final BeautifyCode lookupByContentType(final String contentTypeName) {

        BeautifyCode beautifyCodeStrategy;

        if (contentTypeName.contains("json")) {
            beautifyCodeStrategy = new BeautifyJson();
        } else if (contentTypeName.contains("xml")) {
            beautifyCodeStrategy = new BeautifyXml();
        } else if (contentTypeName.contains("html")) {
            beautifyCodeStrategy = new BeautifyHtml();
        } else {
            beautifyCodeStrategy = new BeautifyOther();
        }

        return beautifyCodeStrategy;
    }
}
