import java.util.*;
import java.io.*;
class box
{
double l;
double w;
double h;
box(double le,double wi,double he)
{
l=le;
w=wi;
h=he;
}
double display()
{
return l*w*h ;
}
}
public class vol
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
double le=s.nextDouble();
double wi=s.nextDouble();
double he=s.nextDouble();
box b=new box(le,wi,he);
double p=b.display();
System.out.println(p);
}
}