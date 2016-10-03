package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		double d = 0;
		double x=Math.ceil(n/30);
		if(n>=30&&n<=120){
			d=x*30;
		}else{
			if(n>120&&n<240){
			d=120+(x-4)*40;	
			}else{
				if(n>=240){
			d=280+(x-8)*60;		
				}else{
					if(n<30){
						d=0;
					}
				}
			}
		}
		System.out.println(d);
	}

}
