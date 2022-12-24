package algorithms.add_binary;

public class Solution {

    String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0")) {
            return "0";
        }

        StringBuilder aReverse = new StringBuilder().append(a).reverse().append("0");
        StringBuilder bReverse = new StringBuilder().append(b).reverse().append("0");

        if (a.length() > b.length()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                bReverse.append("0");
            }
        } else {
            for (int i = 0; i < b.length() - a.length(); i++) {
                aReverse.append("0");
            }
        }

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        String carry = "0";

        for (int i = 0; i < aReverse.length(); i++) {
            temp.append(aReverse.substring(i, i + 1)).append(bReverse.substring(i, i + 1)).append(carry);

            switch (temp.toString()) {
            case "000":
                result.append("0");
                carry = "0";
                break;

            case "001":
            case "010":
            case "100":
                result.append("1");
                carry = "0";
                break;

            case "011":
            case "101":
            case "110":
                result.append("0");
                carry = "1";
                break;

            case "111":
                result.append("1");
                carry = "1";
                break;

            default:
                break;
            }
            temp.setLength(0);
        }

        return result.reverse().substring(result.indexOf("1")).toString();
    }

}
