//import java.util.Scanner;
class Main
{
//int fact=1;
static int factorial(int n)
{
if(n==1 && n==0)
{
return 1;
}
else
{
return n*factorial(n-1);
}
}


public static void main(String[] args)
{
factorial(5);
}
}


















