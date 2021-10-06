
public class Hex_To_Octal extends Hex_To_Binary {

    int powerConvert(int power) {
        int value = 1;
        for (int i = 1; i <= power; i++) {
            value *= 2;
        }
        return value;
    }

    int[] refreshArray(int[] arr) {
        for (int i = 0; i < 3; i++) {
            arr[i] = 0;
        }
        return arr;
    }
   
    boolean isHex(char[] val) {
        for (int i = 0; i < val.length; i++) {
            if (val[i] != '0' && val[i] != '1' && val[i] != '2' && val[i] != '3' && val[i] != '4' && val[i] != '5' && val[i] != '6' && val[i] != '7' && val[i] != '8' && val[i] != '9' && val[i] != 'A' && val[i] != 'a' && val[i] != 'B' && val[i] != 'b' && val[i] != 'C' && val[i] != 'c' && val[i] != 'D' && val[i] != 'd' && val[i] != 'E' && val[i] != 'e' && val[i] != 'F' && val[i] != 'f') {
                return false;
            }
        }
        return true;
    }

    void hex_To_Bin_Convert(String s) {
//-----------------------Checking For Invalid Input-----------------------------        
        char[] str = s.toCharArray();
        if (!isHex(str)) {
            System.out.println("Invalid Input");
            return;
        }
       
        int v = str.length, index = 0, octIndex = 0, octValueIndex = 0, p = 0, sum = 0;
        int[] hexValue = new int[v];
        int[] singleHexCon = new int[4];
        int[] binValue = new int[4 * v];
        int[] singleOctValue = new int[3];
        int[] octValue;
//String converted to Int  stored in array

        for (int i = 0; i < v; i++) {
            hexValue[i] = inputHexToInt(str[i]);
        }
//-----------------------Checking For Only Zero Input-----------------------------    
     if(!checkZero(hexValue,v))
     { 
         octValue=new int[3];
         for(int i=0;i<3;i++)
         {
             octValue[i]=0;
         }
         printArray(octValue,3,"Octal");
         return;
     }
//----------------Hexadecimal To Binary-----------------------------------------
        while (p < v) {
            singleHexCon = singleHexToBin(hexValue[p]);
            singleHexCon = revArray(singleHexCon, 4);

            for (int i = 0; i < 4; i++) {
                binValue[index] = singleHexCon[i];
                index++;
            }
            p++;
        }
       
//----------------Hexadecimal To Octal-----------------------------------------        
       
        int extra = index % 3;
        int val = (p * 4) / 3;
        if (extra > 0) {
            octValue = new int[val + 1];
        } else {
            octValue = new int[val];
        }

        for (int i = index - 1; i >= 0; i--) {

            singleOctValue[octIndex] = binValue[i];
            octIndex++;

            if (octIndex == 3) {
                for (int j = 0; j < 3; j++) {
                    sum += singleOctValue[j] * powerConvert(j);
                }
                octValue[octValueIndex] = sum;
                octValueIndex++;
                singleOctValue = refreshArray(singleOctValue);
                octIndex = 0;
                sum = 0;
            }

        }
        if (extra > 0) {
            for (int j = 0; j < octIndex; j++) {
                sum += singleOctValue[j] * powerConvert(j);
            }
            octValue[octValueIndex] = sum;
            octValueIndex++;
        }
        octValue = revArray(octValue, octValueIndex);
        printArray(octValue, octValueIndex, "Octal");
        
    }

}
