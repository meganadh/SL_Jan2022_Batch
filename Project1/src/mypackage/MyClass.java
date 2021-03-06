package mypackage;

abstract class Salary
{
	public int getPF(int basic)
	{
		return 12*basic/100;
	}
	
	public int getHRA(int basic)
	{
		return 40*basic/100;
	}	
	
	public abstract int getDA();
	
	public abstract int getSA();
	
	public abstract int getTA();
}

class Cognizant extends Salary
{	
	public int getDA()
	{
		return 6000;
	}
	public int getSA()
	{
		return 12000;
	}
	public int getTA()
	{
		return 5000;
	}
}


class Infosys extends Salary
{
	public int getDA()
	{
		return 7000;
	}
	public int getSA()
	{
		return 10000;
	}
	public int getTA()
	{
		return 6000;
	}
}


public class MyClass 
{
	public static void main(String[] args)
	{
		Salary sal = new Infosys();
		System.out.println(sal.getHRA(4000));
		
		sal = new Cognizant();
		System.out.println(sal.getHRA(5000));
		
		
	}
}
