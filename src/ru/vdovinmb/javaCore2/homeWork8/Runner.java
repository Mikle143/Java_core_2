package ru.vdovinmb.javaCore2.homeWork8;

import java.io.IOException;
import java.nio.file.Path;

public class Runner {
    public static void main(String[] args) throws IOException {
        Path path1=Path.of("src", "ru", "vdovinmb", "javaCore2", "homeWork8",  "items-name.csv");
        Path path2=Path.of("src", "ru", "vdovinmb", "javaCore2", "homeWork8",   "items-price.csv");
        Path path3=Path.of("src", "ru", "vdovinmb", "javaCore2", "homeWork8",   "result.csv");
        Path path4=Path.of("src", "ru", "vdovinmb", "javaCore2", "homeWork8",  "error.csv");

        Util.StringJoin(path1,path2,path3,path4);

    }
}
