package Lab9;

public class Decision {

	public void FirstDecision(int n, int x, int y)
	{
		double answer=0.0;
		int y1=1;
		int x1=1;
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= y; j++) {
			answer += (Math.pow(x1, n) + (Math.cos(y1)) * Math.pow(y1, n)) / (i*j);
			}
		}
		System.out.print("Formula answer:\n");
		System.out.print("Mathematical view: " + answer+"\n");
		System.out.print("Rounded view: " + Math.ceil(answer)+"\n");
	}
}
