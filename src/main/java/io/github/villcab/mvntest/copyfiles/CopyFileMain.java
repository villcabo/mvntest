package io.github.villcab.mvntest.copyfiles;

import io.github.villcab.mvntest.date.DateNumber;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class CopyFileMain {

    private static final Logger log = LogManager.getLogger(CopyFileMain.class);

    public static void main(String[] args) throws IOException, URISyntaxException {
        CopyFileMain main = new CopyFileMain();
        //main.copyFromJar("/ITWSMifare", Paths.get("C:\\Users\\Bismarck\\Documents"));
        main.method();


    }

    public void method() throws IOException, URISyntaxException {
//        log.debug(this.getClass().getResource("/log4j2.xml"));
        log.debug(this.getClass().getResource("/ITWSMifare"));

        //InputStream inputStream = this.getClass().getResourceAsStream("/ITWSMifare");
//        Files.copy(inputStream, Paths.get("D:\\Sintesis\\file.txt"));

        //FileUtils.copyInputStreamToFile(inputStream, new File("D:\\Temporales\\ITWSMifare_version"));
        FileUtils.copyDirectory(new File(this.getClass().getResource("/ITWSMifare").getPath()), new File("D:\\Temporales\\ITWSMifare_1.9.12"));


        //copyFromJar(Thread.currentThread().getContextClassLoader().getResource("/ITWSMifare").getPath(), Paths.get("D:\\Temporales\\ITWSMifare_1.9.12"));
    }

    public void copyFromJar(String source, final Path target) throws URISyntaxException, IOException {
        URI resource = getClass().getResource("").toURI();
        FileSystem fileSystem = FileSystems.newFileSystem(
                resource,
                Collections.<String, String>emptyMap()
        );


        final Path jarPath = fileSystem.getPath(source);

        Files.walkFileTree(jarPath, new SimpleFileVisitor<Path>() {

            private Path currentTarget;

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                currentTarget = target.resolve(jarPath.relativize(dir).toString());
                Files.createDirectories(currentTarget);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.copy(file, target.resolve(jarPath.relativize(file).toString()), StandardCopyOption.REPLACE_EXISTING);
                return FileVisitResult.CONTINUE;
            }

        });
    }


}
