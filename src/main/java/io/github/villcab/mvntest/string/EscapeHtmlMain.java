package io.github.villcab.mvntest.string;

import org.apache.commons.lang3.StringEscapeUtils;

public class EscapeHtmlMain {

    public static void main(String[] args) {
        String value = "No se pudo autenticar. La sesi\u00F3n de autenticaci\u00F3n ha expirado. Vuelve a la p\u00E1gina original e int\u00E9ntalo de nuevo.";
        String htmlvalue = "No se pudo autenticar. La sesi&oacute;n de autenticaci&oacute;n ha expirado. Vuelve a la p&aacute;gina original e int&eacute;ntalo de nuevo.";

        String normaValue = "No se pudo autenticar. La sesión de autenticación ha expirado. Vuelve a la página original e inténtalo de nuevo.";

        System.out.println(StringEscapeUtils.escapeHtml4(value));

        System.out.println(StringEscapeUtils.unescapeHtml4(value));
        System.out.println(StringEscapeUtils.unescapeHtml4(htmlvalue));

        System.out.println(StringEscapeUtils.escapeHtml4(normaValue));
    }
}
