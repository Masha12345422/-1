import java.util.Scanner;

public class Program {
	
	public static void main (String args[]){
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите количество строк матрицы");
        int N = in.nextInt();
        System.out.println("¬ведите количество столбцов в матрице");
        int M =  in.nextInt();
        int[][] mas = new int[N][M];
        int num =0, sredn=0, sum=0;
        
        for(int i=0;i<N;i++) {
        	
        	 for(int j=0;j<M;j++)	{
        	
        		 mas[i][j]=num;
        		 sum+=num;
        		 num++;
          }
        } 
        
        for(int i=0;i<N;i++) {
          	 for(int j=0;j<M;j++)	{
          
          		System.out.print(mas[i][j]+" ");
          
          } 
           System.out.print("\n");
      }
       
       sredn=sum/(N*M);;
       System.out.print("\n");
       
       for(int i=0;i<N;i++) {
        	 for(int j=0;j<M;j++)	{
        		
        		 if(mas[i][j]>sredn)
        		System.out.print(0+" ");
        		 else
        		System.out.print(mas[i][j]+" ");
        } 
         System.out.print("\n");
    }
}
}
