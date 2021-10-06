public class Binary_To_Hex_Converter extends Hex_To_Octal {

    String intToHex(int h) {
        if (h == 0) {
            return "0";
        } else if (h == 1) {
            return "1";
        } else if (h == 2) {
            return "2";
        } else if (h == 3) {
            return "3";
        } else if (h == 4) {
            return "4";
        } else if (h == 5) {
            return "5";
        } else if (h == 6) {
            return "6";
        } else if (h == 7) {
            return "7";
        } else if (h == 8) {
            return "8";
        } else if (h == 9) {
            return "9";
        } else if (h == 10) {
            return "A";
        } else if (h == 11) {
            return "B";
        } else if (h == 12) {
            return "C";
        } else if (h == 13) {
            return "D";
        } else if (h == 14) {
            return "E";
        } else if (h == 15) {
            return "F";
        } else {
            return "Invalid";
        }
    }

    boolean isBinary(int[] val) {
        for (int i = 0; i < val.length; i++) {
            if (val[i] != 0 && val[i] != 1) {
                return false;
            }
        }
        return true;
    }

    int powerConvert(int power) {
        int value = 1;
        for (int i = 1; i <= power; i++) {
            value *= 2;
        }
        return value;
    }

    void binToDecimal(int n) {
// int type variable stored in array

        int m, k, r, l = 0, sum = 0, hexIndex = 0, hexValueIndex = 0;
        k = detArraySize(n, 10);
        m = n;
        int[] value = new int[k];
        int[] hexValue;
        while (m != 0) {
            r = m % 10;
            value[l] = r;
            m = m / 10;
            l++;
        }
        //---------------Checking Invalid Input----------------------------------------
        if (!isBinary(value)) {
            System.out.println("Invalid Input");
            return;
        }
        //---------------Checking for only zero input----------------------------------------      
         if(!checkZero(value,l))
     { 
         hexValue=new int[1];       
         hexValue[0]=0;         
         printArray(hexValue,1,"Hex");
         return;
     }
   
        //-----------------------Binary TO Hexadecimal---------------------------------
        value = revArray(value, l);
        int[] singleHexValue = new int[4];
        
        String[] hexString;
        int extra = l % 4;
        int val = l / 4;
        if (extra > 0) {
            hexValue = new int[val + 1];
            hexString = new String[val + 1];
        } else {
            hexValue = new int[val];
            hexString = new String[val];
        }
        for (int i = l - 1; i >= 0; i--) {

            singleHexValue[hexIndex] = value[i];
            hexIndex++;

            if (hexIndex == 4) {
                for (int j = 0; j < 4; j++) {
                    sum += singleHexValue[j] * powerConvert(j);
                }
                hexValue[hexValueIndex] = sum;
                hexValueIndex++;
                singleHexValue = refreshArray(singleHexValue);
                hexIndex = 0;
                sum = 0;
            }

        }

        if (extra > 0) {
            for (int j = 0; j < hexIndex; j++) {
                sum += singleHexValue[j] * powerConvert(j);
            }
            hexValue[hexValueIndex] = sum;
            hexValueIndex++;
        }
        hexValue = revArray(hexValue, hexValueIndex);

        for (int i = 0; i < hexValueIndex; i++) {
            hexString[i] = intToHex(hexValue[i]);
        }
        System.out.println("Hex value from input: ");
        for (int i = 0; i < hexValueIndex; i++) {
            System.out.print(hexString[i]);
        }
        System.out.println();
    }
}
