package io.github.villcab.mvntest.list;

public class ListMain {

    public static void main(String[] args) {

        String[] stringvector = new String[]{
                "            FACTURA             ",
                "  CON DERECHO A CREDITO FISCAL  ",
                "                                ",
                "         MI TELEFERICO          ",
                "         PUNTO VENTA 0          ",
                "AVENIDA ESTACION CENTRAL TELEFER",
                "ICO LINEA ROJA NRO. S/N ZONA/BAR",
                "RIO: PURA PURA",
                "      TEL. (591)-2-2179300      ",
                "            BOLIVIA             ",
                "- - - - - - - - - - - - - - - - ",
                "              NIT               ",
                "           280048029            ",
                "           No FACTURA           ",
                "               41               ",
                "              CUF               ",
                "132962CB5F86B68A1C01DA7133CFF0AB",
                "8E23DB0FA88666CA23A646D74",
                "         ACT. ECONOMICA         ",
                "TRANSPORTE URBANO DE CARGA Y/O P",
                "ASAJEROS",
                "- - - - - - - - - - - - - - - - ",
                "      NOMBRE/RAZON:Alanoca      ",
                "         NIT/CI/EX:7800726      ",
                "   COD.CLIENTE:0495A26A103A80   ",
                " FEC.EMISION:22/03/2022 10:29 PM",
                "- - - - - - - - - - - - - - - - ",
                "            DETALLE             ",
                "CR0001-Recarga",
                "1      x2.00               2.00",
                "- - - - - - - - - - - - - - - -",
                "DESC BS.                   0.00",
                "GIFTCARD BS.               0.00",
                "TOTAL BS.                  2.00",
                "IMP.CRED.FISC              2.00",
                "Son: ",
                "dos 00/100 Bolivianos",
                "",
                "",
                "<QR>https://pilotosiat.impuestos.gob.bo/consulta/QR?nit=280048029&cuf=132962CB5F86B68A1C01DA7133CFF0AB8E23DB0FA88666CA23A646D74&numero=41&t=1",
                "ESTA FACTURA CONTRIBUYE AL DESA",
                "RROLLO DE NUESTRO PAIS, EL USO ",
                "ILÍCITO  DE ÉSTA  SERÁ  SANCION",
                "ADO DE ACUERDO A LEY"
        };

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

        System.out.println(sb1);
        System.out.println("-------------------------------");
        System.out.println(qrCode);
        System.out.println("-------------------------------");
        System.out.println(sb2);
    }
}
