import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int str1=0;
		int str2=1;
		for(int i=0;i<n;i++){
		     int cost=i;
		    for(int j=0;j<=i;j++){
		        if(cost%2==0){
		        System.out.print(str2);
		        cost--;
		        }
		        else{
		        System.out.print(str1);  
		        cost--;
		        }
		    }
		    System.out.println();
		}
	}

}
