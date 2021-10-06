
public class Octal_To_Binary_Converter extends Binary_To_Octal_Converter {
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
    void octal_To_Binary(int n) {
// int type variable stored in array

        int k, remainder, l = 0, binIndex=0, binValueIndex=0;
        int x=detArraySize(n, 10);
        int[] value = new int[x];
        int [] singleBinValue=new int[3];
        int[]binValue=new int[3*x];
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
        if (!checkZero(value, l)) {
            System.out.println("Binary value: 0");
            return;
        }        
//-----------------------Octal TO Binary---------------------------------------------              
        value=revArray(value,l);
        
        for(int i=0;i<l;i++)
        {
            while(binIndex<3)
            {
             singleBinValue[binIndex]=value[i]%2;
             value[i]=value[i]/2;
             binIndex++;
            }
            singleBinValue=revArray(singleBinValue,binIndex);
             for(int j=0;j<3;j++)
             {
                 binValue[binValueIndex]= singleBinValue[j];
                 binValueIndex++;
             }
            
            singleBinValue=refreshArray(singleBinValue);
            binIndex=0;
        }
        printArray(binValue,binValueIndex,"Binary");
        
    }

}
