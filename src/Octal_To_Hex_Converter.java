
public class Octal_To_Hex_Converter extends Octal_To_Binary_Converter {
boolean isOctal(int []val)
{        
       for(int i=0;i<val.length;i++)
        {  
          if(val[i]!=0&&val[i]!=1&&val[i]!=2&&val[i]!=3&&val[i]!=4&&val[i]!=5&&val[i]!=6&&val[i]!=7)
          {
              return false;
          }
        }

        return true;
    }
    String intToHex(int h)
    {
        if(h==0)return "0";
        else if(h==1) return "1";
        else if(h==2) return "2";
        else if(h==3) return "3";
        else if(h==4) return "4";
        else if(h==5) return "5";
        else if(h==6) return "6";
        else if(h==7) return "7";
        else if(h==8) return "8";
        else if(h==9) return "9";
        else if(h==10) return "A";
        else if(h==11) return "B";
        else if(h==12) return "C";
        else if(h==13) return "D";
        else if(h==14) return "E";
        else if(h==15) return "F";
        else return "Invalid";
    }
    void octal_To_Hex(int n) {
// int type variable stored in array

        int k, remainder, l = 0, binIndex = 0, binValueIndex = 0, hexIndex = 0, hexValueIndex = 0, sum = 0;
        int x = detArraySize(n, 10);
        int[] value = new int[x];
        int[] singleBinValue = new int[3];
        int[] binValue = new int[3 * x];
        
        k = n;
        while (k != 0) {
            remainder = k % 10;
            value[l] = remainder;
            k = k / 10;
            l++;
        }
 //---------------------Checking For Invalid Inputs------------------------------------
        if(!isOctal(value))
        {
            System.out.println("Invalid Input");
            return;
        }
//-----------------------Checking For Only Zero Input-----------------------------    
        if (!checkZero(value,l)) {
            System.out.println("Hex value: 0");
            return;
        }        
//-----------------------Octal TO Binary---------------------------------------------    
        value = revArray(value, l);

        for (int i = 0; i < l; i++) {
            while (binIndex < 3) {
                singleBinValue[binIndex] = value[i] % 2;
                value[i] = value[i] / 2;
                binIndex++;
            }
            singleBinValue = revArray(singleBinValue, binIndex);
            for (int j = 0; j < 3; j++) {
                binValue[binValueIndex] = singleBinValue[j];
                binValueIndex++;
            }

            singleBinValue = refreshArray(singleBinValue);
            binIndex = 0;
        }

  //-------------------Binary To Hex conversion----------------------------------------      
         int[] singleHexValue = new int[4];
        int []hexValue;
        String []hexString;
        int extra = binValueIndex % 4;
        int val = binValueIndex / 4;
        if (extra > 0) {
            hexValue = new int[val + 1];
            hexString=new String[val+1];
        } else {
            hexValue = new int[val];
            hexString=new String[val];
        }
        for (int i = binValueIndex - 1; i >= 0; i--) {

            singleHexValue[hexIndex] = binValue[i];
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
        System.out.print("Hex value: ");
        for (int i = 0; i < hexValueIndex; i++) {
            System.out.print(hexString[i]);
        }
        System.out.println();
    }
}
