package io.github.villcab.mvntest.tigoapiaccountclient.util;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class MyXmlUtil {

    public static String getStringFromDocument(Document document, String tagName) {
        NodeList elements = document.getElementsByTagName(tagName);
        if (elements.getLength() != 0) {
            return elements.item(0).getTextContent();
        }
        return null;
    }

    public static Integer getIntegerFromDocument(Document document, String tagName) {
        String value = getStringFromDocument(document, tagName);
        if (value != null) {
            return Integer.parseInt(value);
        }
        return null;
    }

}
