package io.github.villcab.mvntest.externalexec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExternalExecMain {

    private static final Logger log = LogManager.getLogger(ExternalExecMain.class);

    public static void main(String[] args) {
        String pathExe = "C:\\Users\\Bismarck\\AppData\\Roaming\\Microsoft\\Windows\\Start\\ Menu\\Programs\\SINTESIS\\ S.A\\Intraticket\\ Suite\\ITWSMifare.appref-ms";
        String pathExe1 = "C:\\Users\\Bismarck\\Desktop\\ITWSMifare.appref-ms";
        executeCommand(pathExe1);
    }

    private static void executeCommand(String command) {
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
        } catch (Exception e) {
            log.error("Error al ejecutar el comando: {}, emessage: {}", command, e.getMessage(), e);
        }
    }
}
