package day03.part1;

import day03.Rucksack;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    private static final String PATH = "year2022/src/day03/part1/input.txt";

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get(PATH);
        List<String> inputItems = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

        int total = 0;
        for (String items : inputItems) {
            Rucksack rucksack = new Rucksack(items);
            String firstCompartment = rucksack.getFirstCompartment();
            String lastCompartment = rucksack.getLastCompartment();
            String itemDuplication = rucksack.getDuplication(firstCompartment, lastCompartment);
            total += rucksack.getPrioritizedScore(itemDuplication);
        }

        System.out.println(total);
    }
}
