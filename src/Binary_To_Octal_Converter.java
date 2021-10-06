
public class Binary_To_Octal_Converter extends Hex_To_Octal {
boolean isBinary(int []val)
    {
        for(int i=0;i<val.length;i++)
        {  
          if(val[i]!=0&&val[i]!=1)
          {
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

    void binToOctal(int n) {
// int type variable stored in array

        int m, k, r, l = 0, sum = 0, octIndex = 0, octValueIndex = 0;
        k = detArraySize(n, 10);
        m = n;
        int[] value = new int[k];
         int[] octValue;
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
         octValue=new int[1];       
         octValue[0]=0;         
         printArray(octValue,1,"Octal");
         return;
     }        
//-----------------------Binary TO Octal---------------------------------        
        value = revArray(value, l);
        int[] singleOctValue = new int[4];
       
        int extra = l % 3;
        int val = l / 3;
        if (extra > 0) {
            octValue = new int[val + 1];

        } else {
            octValue = new int[val];

        }
        for (int i = l - 1; i >= 0; i--) {

            singleOctValue[octIndex] = value[i];
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
        printArray(octValue,octValueIndex,"Octal");

    }
}
