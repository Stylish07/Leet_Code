package algorithms.roman_to_integer;

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int sLength = s.length();

        for (int i = 0; i < sLength; i++) {
            switch (s.substring(i, i + 1)) {
                case "I" -> {
                    if (i == sLength - 1) {
                        num += 1;
                        break;
                    }
                    switch (s.substring(i + 1, i + 2)) {
                        case "V" -> {
                            num += 4;
                            i++;
                        }
                        case "X" -> {
                            num += 9;
                            i++;
                        }
                        default -> num += 1;
                    }
                }
                case "V" -> num += 5;
                case "X" -> {
                    if (i == sLength - 1) {
                        num += 10;
                        break;
                    }
                    switch (s.substring(i + 1, i + 2)) {
                        case "L" -> {
                            num += 40;
                            i++;
                        }
                        case "C" -> {
                            num += 90;
                            i++;
                        }
                        default -> num += 10;
                    }
                }
                case "L" -> num += 50;
                case "C" -> {
                    if (i == sLength - 1) {
                        num += 100;
                        break;
                    }
                    switch (s.substring(i + 1, i + 2)) {
                        case "D" -> {
                            num += 400;
                            i++;
                        }
                        case "M" -> {
                            num += 900;
                            i++;
                        }
                        default -> num += 100;
                    }
                }
                case "D" -> num += 500;
                case "M" -> num += 1000;
            }
        }

        return num;
    }
}
