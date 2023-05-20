package io.github.villcab.mvntest.itext;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class BillRoll {

    public static void main(String[] args) {
        String[] stringvector = new String[]{
                "EMPRESA ESTATAL DE TRANSPORTE POR CABLE   ",
                "             \"MI TELEFÉRICO\"              ",
                "   AVENIDA ESTACIÓN CENTRAL TELEFÉRICO    ",
                "   LINEA ROJA NRO. S/N ZONA PURA PURA     ",
                "                                          ",
                "           Teléfono: 2179300              ",
                "            La Paz - Bolivia              ",
                "            FACTURA ORIGINAL              ",
                "------------------------------------------",
                "             Nit:7800726                  ",
                "             Factura:163                  ",
                "             CUF: 132962CB5F86B80D484AABFA",
                "D6E414DC68E89537E77D8B0E377846D74         ",
                "------------------------------------------",
                "   Fecha      : 30/03/2022                ",
                "   Hora       : 07:57:06                  ",
                "   Señor(es)  : Alanoca                   ",
                "   NIT/CI     : 7800726                   ",
                "   Estación   : ESTACION CENTRAL NARANJA  ",
                "   Dispositivo: POS_BISMARK_28            ",
                "   Turno      : 92912                     ",
                "------------------------------------------",
                "CANT.   DESC          PRECIO    IMPORTE   ",
                "------------------------------------------",
                "CR0001                                    ",
                "    1 Recarga          2,00       4,00    ",
                "------------------------------------------",
                "                 TOTAL:               2,00",
                "SON: DOS 00/100 Bolivianos                ",
                "<QR>https://pilotosiat.impuestos.gob.bo/consulta/QR?nit=280048029&cuf=132962CB5F86B80D484AABFAD6E414DC68E89537E77D8B0E377846D74&numero=163&t=1",
                "Ley N.453:Tienes derecho a un trato equi- ",
                "tativo sin discriminación en la oferta    ",
                "de servicios.                             ",
                "                                          ",
                "Este documento es la Representación Grá-  ",
                "fica de un Documento Fiscal emitido en    ",
                "una modalidad de facturación en Línea.    ",
                "                                          ",
                "¡Gracias por usar el Teleferico!|Que tenga",
                " un buen viaje y feliz año nuevo!!!!      "
        };
        System.out.println(stringvector.length);

        String breakline = "";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String qrCode = "";
        boolean qrFound = false;
        for (String s : stringvector) {
            if (s.startsWith("<QR>")) {
                qrCode = s.replace("<QR>", "");
                breakline = "";
                qrFound = true;
            } else if (qrFound) {
                sb2.append(breakline).append(s);
                breakline = "\n";
            } else {
                sb1.append(breakline).append(s);
                breakline = "\n";
            }
        }
        createPdf(sb1.toString(), sb2.toString(), stringvector.length);
    }

    public static void createPdf(String text1, String text2, int lines) {
        final String FILE = "c:/temp/BillRoll.pdf";
        try {
//            Rectangle rectangle = new Rectangle(210, (float) (lines * 12.5));
//            Rectangle rectangle = new Rectangle(210, 1122);
            Rectangle rectangle = new Rectangle(210, 853);
            Document document = new Document(rectangle, 0, 0, 0,0);
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addTitlePage(document, text1, text2);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addTitlePage(Document document, String text1, String text2) throws DocumentException, IOException {
//        final Font textFont = new Font(Font.FontFamily.COURIER, 8, Font.NORMAL);

        //this code should run once at initialization/application startup
//        FontFactory.register("D:/Fonts/CascadiaCode-2111.01/ttf/CascadiaCode.ttf");
//        Font textFont = FontFactory.getFont("Cascadia Code", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 8); //10 is the size

//        FontFactory.register("D:/Fonts/JetBrainsMono-2.242/fonts/ttf/JetBrainsMono-Regular.ttf");
//        Font textFont = FontFactory.getFont("JetBrains Mono", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 8); //10 is the size

//        FontFactory.register("D:/Fonts/Menlo-Regular.ttf");
//        Font textFont = FontFactory.getFont("Menlo", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 8); //10 is the size

        FontFactory.registerDirectory("D:/Fonts//dejavu-sans-mono");
        Font textFont = FontFactory.getFont("DejaVu Sans Mono", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 8); //10 is the size

        Paragraph preface = new Paragraph();
        // We add one empty line
//        addEmptyLine(preface, 1);
        // Lets write a big header
        preface.add(new Paragraph(text1, textFont));

//        preface.add(new Paragraph(text2, textFont));
//        addEmptyLine(preface, 1);
        // Will create: Report generated by: _name, _date
//        preface.add(new Paragraph(
//                "Report generated by: " + System.getProperty("user.name") + ", " + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//                smallBold));
//        addEmptyLine(preface, 3);
//        preface.add(new Paragraph(
//                "This document describes something which is very important ",
//                smallBold));
//        addEmptyLine(preface, 8);
//        preface.add(new Paragraph(
//                "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
//                redFont));
        document.add(preface);

        Image img = Image.getInstance("C:/Users/Bismarck/Pictures/ksnip/ksnip_20220330-222124.png");
        img.scaleToFit(80, 80);
        img.setAlignment(Element.ALIGN_CENTER);
        document.add(img);

        Paragraph preface1 = new Paragraph();
        preface1.add(new Paragraph(text2, textFont));
        document.add(preface1);
        // Start a new page
        document.newPage();
    }

}
