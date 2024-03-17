package ru.vdovinmb.javaCore2.homeWork8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public final class Util {
    public static void StringJoin(Path path1, Path path2, Path path3, Path path4) throws IOException {
        Scanner scannerItemsName = new Scanner(path1);
        Scanner scannerItemsPrice = new Scanner(path2);
        Map<String, String> mapName = new HashMap<>();
        Map<String, String> mapPrice = new HashMap<>();
        while (scannerItemsName.hasNext()) {
            String ItemsName = scannerItemsName.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(ItemsName, ",");
            String key = stringTokenizer.nextToken();
            String value = stringTokenizer.nextToken();
            mapName.put(key, value);

        }
        while (scannerItemsPrice.hasNext()) {
            String ItemsPrice = scannerItemsPrice.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(ItemsPrice, ",");
            String key = stringTokenizer.nextToken();
            String value = stringTokenizer.nextToken();
            mapPrice.put(key, value);

        }
        mapPrice.forEach((k, v) -> mapName.merge(k, v, (v1, v2) -> v1 + ", " + v2));
        for (Map.Entry<String, String> entry : mapName.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        mapSplit(mapName, path3, path4);

    }

    public static void mapSplit(Map<String, String> mapName, Path path3, Path path4) throws IOException {
        try (BufferedWriter writerResult = new BufferedWriter(new FileWriter(path3.toFile(), true))) {
            try (BufferedWriter writerError = new BufferedWriter(new FileWriter(path4.toFile(), true))) {
                for (Map.Entry<String, String> entry : mapName.entrySet()) {
                    if (entry.getValue().split(",").length >= 2) {
                        writerResult.append(entry.getKey()).append(", ").append(entry.getValue());
                        writerResult.newLine();

                    } else {
                        writerError.append(entry.getKey()).append(", ").append(entry.getValue());
                        writerError.newLine();
                    }
                }
            }
        }
    }
}
