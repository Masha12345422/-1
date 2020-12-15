package Lab8;

public class Decision {

	public void FirstDecision(int f, int x, int n)
	{
		System.out.print("\n1) Z =  ");
		double answer = 0;
		int inX = 1;
		int inF = 2;
		int z = 2;
		int inZ = 3;
		for(int i = 0; i<n; i++)
		{
			if(i%2 == 0) answer += (Math.pow(x, inX)*Math.pow(f, inF))/z;
			if(i%2!=0) answer -= (Math.pow(x, inX)*Math.pow(f, inF))/z;
			z *= inZ;
			inX++;
			inF++;
			inZ++;
		}
		System.out.print(answer);
	}
	public void SecondDecision(int y, int x, int n)
	{
		System.out.print("\n2) Z = ");
		double answer = 0.0;
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= y; j++) 
				answer += ((Math.pow(i, 2) + Math.pow(j, 2))/(Math.pow(i, 3) + Math.pow(j, 3)));
		}
		System.out.print(answer);
	}
}
