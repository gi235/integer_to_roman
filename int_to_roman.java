import java.util.Scanner;
public class number_to_roman {
    public static void main(String[] args) {
        int number,xnumber,var1,var2,var3,var4;
        String p,q,r,s;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = ob.nextInt();
        var1=number/1000;//1
        xnumber=number-(var1*1000);//234
        var2=xnumber/100;//2
        xnumber=xnumber-(var2*100);//34
        var3=xnumber/10;//3
        xnumber=xnumber-(var3*10);//4
        var4=xnumber;//4

        p="M";
        q="CM";
        r="D";
        s="C";

        if(var1==1)
        {
            p="M";
        }

        if(var1==2)
        {
             p="MM";
        }
        if(var1==3)
        {
            p="MMM";
        }

        if(var1==4)
        {
            p="MMMM";
        }

        if(var1==5)
        {
            p="MV";
        }

        if(var1==6)
        {
           p="MVI";
        }

        if(var1==7)
        {
           p="MVII";
        }

        if(var1==8)
        {
            p="MVIII";
        }

        if(var1==9)
        {
            p="MIX";
        }
/**********************************************************/
        if(var2==1)
        {
            q="C";
        }

        if(var2==2)
        {
            q="CC";
        }
        if(var2==3)
        {
            q="CCC";
        }

        if(var2==4)
        {
           q="CCCC";
        }

        if(var2==5)
        {
           q="CD";
        }

        if(var2==6)
        {
            q="DC";
        }

        if(var2==7)
        {
           q="DCC";
        }

        if(var2==8)
        {
             q="DCCC";
        }

        if(var2==9)
        {
             q="CM";
        }

        if(var3==1)
        {
            r="X";
        }

        if(var3==2)
        {
           r="XX";
        }
        if(var3==3)
        {
            r="XXX";
        }

        if(var3==4)
        {
            r="XL";
        }

        if(var3==5)
        {
            r="L";
        }

        if(var3==6)
        {
            r="LX";
        }

        if(var3==7)
        {
            r="LXX";
        }

        if(var3==8)
        {
            r="LXXX";
        }

        if(var3==9)
        {
            r="XC";
        }

        /******************************************/

        if(var4==1)
        {
            s="I";
        }

        if(var4==2)
        {
            s="II";
        }
        if(var4==3)
        {
           s="III";
        }

        if(var4==4)
        {
            s="IV";
        }

        if(var4==5)
        {
            s="V";
        }

        if(var4==6)
        {
           s="VI";
        }

        if(var4==7)
        {
            s="VII";
        }

        if(var4==8)
        {
            s="VIII";
        }

        if(var4==9)
        {
            s="IX";
        }


        System.out.println(p+" "+q+" "+r+" "+s);


    }
}
