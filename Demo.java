package test;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try {
		char[][] arr = new char[34][7];
		String str = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���������������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������";
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(i * 7 + j);
			}
		}
		for (int i = 0; i < arr.length; i++) { // ��������
		for (int j = 0; j < arr[i].length; j++) { // ��������
				System.out.print(arr[i][j]); // ���ÿ��Ԫ�ص�ֵ
			}
			// �жϲ���������ţ��±�Ϊ0����2�����붺�ţ�����������
			if (i % 2 == 0) {
				System.out.println(',');
			} else
				System.out.println('��');
		}
		System.out.println("���������:");
		
	  @SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	  String b=input.next();
      countString(str,b);
	}
	catch(Exception e) {
	System.out.println("�����쳣: "+e.toString());
	}
}
private static void countString(String str,String s) {
   int length=str.length();
   int count = 0;
   int k = 0;
   for(int i= 0; i<=length; i++){
       if(str.indexOf(s) == (i-k)){
           str = str.substring(i-k+1,str.length());
           count++;
           k = i+1;
       }
   }
   System.out.println("���ֵĴ���Ϊ"+count+"��");
 }
}
