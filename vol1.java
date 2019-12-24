import java.util.*;
import java.io.*;
class calc
{
public static double PowerInt(int n1,int n2){
return Math.pow(n1,n2);
}
public static double PowerDouble(double n1,double n2)
{
return Math.pow(n1,n2);
}
}
public class vol1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
calc b=new calc();

double p=b.PowerInt(12,10);
double p1=b.PowerDouble(12.00,10.00);
System.out.println(p+" "+p1);
}
}