package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x1=scn.nextInt();
		int y1=scn.nextInt();
		int x2=x1*x1;
		int y2=y1*y1;
		double z1=x2+y2;
		double z2=Math.sqrt(z1);
		if (z2>100){
			System.out.println("out");
		}
		else {
	    if (z2<=100){
	    	System.out.println("in");
	    }
		}	
	}
}
