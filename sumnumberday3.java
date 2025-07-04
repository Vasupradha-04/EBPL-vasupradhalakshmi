import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int num=5294;
		int sum=0;
		while(num>0){
		    int digit=num%10;
		    sum=sum+digit;
		    num/=10;
		}
		System.out.println(sum);
	}
}