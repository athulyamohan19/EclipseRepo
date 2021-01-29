package javaBasics;

public class AbstractBox extends AbstractContainer {

	@Override
	int AreaOf(int height) 
	{
		int total2=height+100;
		System.out.println("Box value : "+total2);
		return total2;
	}

}
