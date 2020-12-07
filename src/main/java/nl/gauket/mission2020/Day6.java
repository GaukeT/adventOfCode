package nl.gauket.mission2020;

import nl.gauket.common.Day;

import static nl.gauket.common.ResultLogger.printResult;

public class Day6 extends Day {
    private static final int DAY = 6;

    public static void main(String[] args) {
        prepareDaily(YEAR20, DAY);
        part1();
        part2();
    }

    private static void part1() {
        start();
        // part 1 //
        var input = "";
        var result = solve(input, 1);

        stop();
        printResult(DAY, 0, result);
    }

    private static void part2() {
        start();
        // part 2 //
        var input = "";
        var result = solve(input, 2);

        stop();
        printResult(DAY, 0, result);
    }

    public static int solve(String input, int part) {
        return 0;
    }
}
