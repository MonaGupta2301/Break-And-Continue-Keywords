//Wap to demo Break and Continue Statement in java
class demo
{
    public static void main(String arg[])
	{
          int n =20,i;
		  for(i=0;i<=n;i++)
		  {
			    if(i==10)
				{
					continue; /* It will Skip the Current Instruction and Moves Towords the Next Instruction*/
				}
				if(i==15)
				{
					break;  /* It will Exit From the Loop */
				}
				System.out.println(i+" ");
		  }
	}		
}
/*
*************OUTPUT*****************
D:\GItHub>javac BreakAndContinue.java

D:\GItHub>java demo
0
1
2
3
4
5
6
7
8
9
11
12
13
14

D:\GItHub>*/