package io.github.villcab.mvntest.string;

public class ValidateExtensionFile {

    public static void main(String[] args) {
        String fileName1 = "st-webticket.jasper";
        String fileName2 = "st-webticket";
        String fileName3 = ".jasper";
        String fileName4 = "st-webticket.jaspers";

        System.out.println(isValidJasperFile(fileName1));
        System.out.println(isValidJasperFile(fileName2));
        System.out.println(isValidJasperFile(fileName3));
        System.out.println(isValidJasperFile(fileName4));
    }

    public static boolean isValidJasperFile(String fileName) {
        int beginIndex = fileName.lastIndexOf(".jasper");
        System.out.println("index: " + beginIndex);
        if (beginIndex > 0) {
            String ext = fileName.substring(beginIndex).toLowerCase();
            return ext.equals(".jasper");
        }
        return false;
    }
}
