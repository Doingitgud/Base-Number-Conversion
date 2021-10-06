
public class Binary_To_Decimal_Converter extends Converter {
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

    void binToDecimal(int n) {
// int type variable stored in array

        int m, k, r, l = 0, sum=0;       
        k = detArraySize(n, 10);
        m = n;
        int[] value = new int[k];
        while (m != 0) {
            r = m % 10;
            value[l] = r;
            m = m / 10;
            l++;
        }
//---------------------Checking For Invalid Inputs------------------------------------
        if(!isBinary(value))
        {
            System.out.println("Invalid Input");
            return;
        }
//-----------------------Binary TO Decimal---------------------------------------------        
        for (int i = 0; i < l; i++) {
            sum += value[i] * powerConvert(i);
        }
        System.out.println("Decimal value from binary: " + sum);
    }

}
