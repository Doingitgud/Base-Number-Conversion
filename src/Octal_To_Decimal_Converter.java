public class Octal_To_Decimal_Converter extends Converter {
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
    int powerConvert(int power) {
        int value = 1;
        for (int i = 1; i <= power; i++) {
            value *= 8;
        }
        return value;
    }

    void octToDecimal(int n) {
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
        if(!isOctal(value))
        {
            System.out.println("Invalid Input");
            return;
        }
//-----------------------Octal TO Decimal---------------------------------------------    
        for (int i = 0; i < l; i++) {
            sum += value[i] * powerConvert(i);
        }
        System.out.println("Decimal value: " + sum);
    }

}

