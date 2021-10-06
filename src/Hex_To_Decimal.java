
public class Hex_To_Decimal {

    int inputHexToInt(char h) {
        if (h == '0') {
            return 0;
        } else if (h == '1') {
            return 1;
        } else if (h == '2') {
            return 2;
        } else if (h == '3') {
            return 3;
        } else if (h == '4') {
            return 4;
        } else if (h == '5') {
            return 5;
        } else if (h == '6') {
            return 6;
        } else if (h == '7') {
            return 7;
        } else if (h == '8') {
            return 8;
        } else if (h == '9') {
            return 9;
        } else if (h == 'A' || h == 'a') {
            return 10;
        } else if (h == 'B' || h == 'b') {
            return 11;
        } else if (h == 'C' || h == 'c') {
            return 12;
        } else if (h == 'D' || h == 'd') {
            return 13;
        } else if (h == 'E' || h == 'e') {
            return 14;
        } else if (h == 'F' || h == 'f') {
            return 15;
        } else {
            return -1;
        }
    }

    boolean isHex(char[] val) {
        for (int i = 0; i < val.length; i++) {
            if (val[i] != '0' && val[i] != '1' && val[i] != '2' && val[i] != '3' && val[i] != '4' && val[i] != '5' && val[i] != '6' && val[i] != '7' && val[i] != '8' && val[i] != '9' && val[i] != 'A' && val[i] != 'a' && val[i] != 'B' && val[i] != 'b' && val[i] != 'C' && val[i] != 'c' && val[i] != 'D' && val[i] != 'd' && val[i] != 'E' && val[i] != 'e' && val[i] != 'F' && val[i] != 'f') {
                return false;
            }
        }
        return true;
    }

    int powerConvert(int power) {
        int value = 1;
        for (int i = 1; i <= power; i++) {
            value *= 16;
        }
        return value;
    }

    void hex_To_Decimal_Convert(String s) {
        //-----------------------Checking For Invalid Input-----------------------------      
        char[] str = s.toCharArray();
        if (!isHex(str)) {
            System.out.println("Invalid Input");
            return;
        }
        int v = str.length, sum = 0, r = 0;
        int[] value = new int[v];
//String converted to Int  stored in array

        for (int i = v - 1; i >= 0; i--) {
            value[r] = inputHexToInt(str[i]);
            r++;
        }
//----------------Hexadecimal To Decimal-----------------------------------------
        for (int i = 0; i < v; i++) {
            sum += value[i] * powerConvert(i);
        }
        System.out.println("Decimal value from HEX: " + sum);

    }
}
