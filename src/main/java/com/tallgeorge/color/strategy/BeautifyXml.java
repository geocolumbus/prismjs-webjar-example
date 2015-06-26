package com.tallgeorge.color.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Indents and colorizes a string containing XML.
 */
class BeautifyXml implements BeautifyCode {

    /**
     * The class logger.
     */
    private final Logger logger = LoggerFactory.getLogger(BeautifyXml.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public final String beautify(final String uglyXml) {
        try {
            Source xmlInput = new StreamSource(new StringReader(uglyXml));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", 2);
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (Exception e) {
            logger.warn("Unable to format XML for {} due to {}", uglyXml, e);
        }

        return uglyXml;

        //TODO Colorize the output and make the links live
    }
}
