import java.util.*;
class Amstrong
{
public static void main(String args[])
{
int num,original,res=0,rem;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
original=num;

while(original!=0)
{
rem=original%10;
res+=Math.pow(rem,3);
original=original/10;
}
if(res==num){
System.out.println(num+"  is an amstrong number");
}
else
{
System.out.println(num+"  is not an amstrong number");
}


}
}