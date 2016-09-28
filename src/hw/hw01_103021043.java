package hw;
/*
 * Topic:假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
 * 而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
 * 請問老問需找多少個1元、5元、50元，其銅板數目最少。
 * (先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，且a1*15+ a2*20+ a3*30小於或等於N。
 * 列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/26
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw01_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("先輸入媽媽給小明多少錢 N :");
		int n=scn.nextInt();
		System.out.println("輸入a1顆蘋果 :");
		int a1=scn.nextInt();
		System.out.println("輸入a2顆柳丁 :");
		int a2=scn.nextInt();
		System.out.println("輸入a3顆桃子:");
		int a3=scn.nextInt();
		int d=(a1*15+ a2*20+ a3*30);
		if(n<d){
			System.out.println("0");
		}
		else{
			int f=(n-d);
			int b1=f/50; 
			int b2=((f-(b1*50))/5);
			int b3=(f-((b1*50)+(b2*5)));
			System.out.println("共"+d+"元");
			System.out.println("找"+f+"元");
			System.out.println(b1+"個50元，"+b2+"個5元，"+b3+"個1元。");	
		}
	}
}
