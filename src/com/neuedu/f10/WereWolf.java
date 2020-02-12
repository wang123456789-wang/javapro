package com.neuedu.f10;

import java.util.*;

public class WereWolf {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������������");
		//number�����������
		int number = input.nextInt();
		if(number<12||number>18) {
			System.out.println("�����������������������룺");
		}else {
			System.out.println("ף��Ŀ���");
		}
		input.close();
		//cards1Ϊ�����飬cards2Ϊ�������飬cards3Ϊ��������
		String[] cards1= new String[]{ "Ԥ�Լ�", "Ů��", "�����", "����", "����",
				"�峤", "������", "������","����"};
		String[] cards2= new String[] {"����","����","����","����","����","����","����",};
		String[] cards3= new String[] {"����","����","����","����","����","����"};
		//����������
		String[] serialPlay=new String[] { "01:", "02:", "03:", "04:", "05:", "06:", "07:", "08:", "09:", "10:", "11:",
				"12:", "13:", "14:", "15:", "16:", "17:", "18:"  };
		//����������
		String[] serialBottom=new String[]{ "01:", "02:", "03:" };
		
		if(number==12) {	
			//�����Ϊ12��ʱ��������Ϊ15
			String[] allPlayCards=new String[15];
			for(int i=0;i<serialPlay.length;i++) {
					System.arraycopy(cards1, 0, allPlayCards, 0, 6);
					System.arraycopy(cards2, 0, allPlayCards, 6, 4);
					System.arraycopy(cards3, 0, allPlayCards, 10, 4);
					System.arraycopy(cards1, 8, allPlayCards, 14,1);
			}
			//��ҵ�12����
			String[] playCards = new String[12];
			//����3��
			String[] bottomCards = new String[3];
			//��random�������
			for(int i=0;i<13;i++) {
				int random =(int)(Math.random()*13);
				String temp = "";
				temp = allPlayCards[i];
				allPlayCards[i]=allPlayCards[random];
				allPlayCards[random]=temp;
			}
			//��������ҵ���
			for(int i=0;i<12;i++) {
				System.arraycopy(allPlayCards, 2, playCards, 0, 11);
				System.arraycopy(allPlayCards, 14, playCards, 11, 1);
			}
			//����������
			for(int i=0;i<serialBottom.length;i++) {
				System.arraycopy(allPlayCards, 13, bottomCards, 0, 1);
				System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
				System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);	
			}
			//����������������
			for (int i = 0; i < 12; i++) {
				playCards[i]=serialPlay[i]+playCards[i];
			}
			System.out.println("�����Ϊ��");
			System.out.println(Arrays.toString(playCards));
			for (int i = 0; i < 3; i++) {
				bottomCards[i]=serialBottom[i]+bottomCards[i];
			}
			System.out.println("����Ϊ��");
			System.out.println(Arrays.toString(bottomCards));
			
		}
		
		if(number==13) {	
			//�����Ϊ13��ʱ��������Ϊ16
			String[] allPlayCards=new String[16];
			for(int i=0;i<serialPlay.length;i++) {
					System.arraycopy(cards1, 0, allPlayCards, 0, 6);
					System.arraycopy(cards2, 0, allPlayCards, 6, 5);
					System.arraycopy(cards3, 0, allPlayCards, 11, 4);
					System.arraycopy(cards1, 8, allPlayCards, 15,1);
			}
			//��ҵ�13����
			String[] playCards = new String[13];
			//����3��
			String[] bottomCards = new String[3];
			for(int i=0;i<14;i++) {
				int random =(int)(Math.random()*14);
				String temp = "";
				temp = allPlayCards[i];
				allPlayCards[i]=allPlayCards[random];
				allPlayCards[random]=temp;
			}
//			System.out.println(Arrays.toString(allPlayCards));
			for(int i=0;i<13;i++) {
				System.arraycopy(allPlayCards, 2, playCards, 0, 13);
				System.arraycopy(allPlayCards, 15, playCards, 12, 1);
			}
			for(int i=0;i<serialBottom.length;i++) {
				System.arraycopy(allPlayCards, 14, bottomCards, 0, 1);
				System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
				System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);	
			}
			for (int i = 0; i < 13; i++) {
				playCards[i]=serialPlay[i]+playCards[i];
			}
			System.out.println("�����Ϊ��");
			System.out.println(Arrays.toString(playCards));
			for (int i = 0; i < 3; i++) {
				bottomCards[i]=serialBottom[i]+bottomCards[i];
			}
			System.out.println("����Ϊ��");
			System.out.println(Arrays.toString(bottomCards));
			
		}
		
		if(number==14) {	
			//�����Ϊ14��ʱ��������Ϊ17
			String[] allPlayCards=new String[17];
			for(int i=0;i<serialPlay.length;i++) {
					System.arraycopy(cards1, 0, allPlayCards, 0, 6);
					System.arraycopy(cards2, 0, allPlayCards, 6, 5);
					System.arraycopy(cards3, 0, allPlayCards, 11,5);
					System.arraycopy(cards1, 8, allPlayCards, 16,1);
			}
			//��ҵ�13����
			String[] playCards = new String[14];
			//����3��
			String[] bottomCards = new String[3];
			for(int i=0;i<15;i++) {
				int random =(int)(Math.random()*15);
				String temp = "";
				temp = allPlayCards[i];
				allPlayCards[i]=allPlayCards[random];
				allPlayCards[random]=temp;
			}
//			System.out.println(Arrays.toString(allPlayCards));
			for(int i=0;i<14;i++) {
				System.arraycopy(allPlayCards, 2, playCards, 0, 13);
				System.arraycopy(allPlayCards, 16, playCards, 13, 1);
			}
			for(int i=0;i<serialBottom.length;i++) {
				System.arraycopy(allPlayCards, 15, bottomCards, 0, 1);
				System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
				System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);	
			}
			for (int i = 0; i < 14; i++) {
				playCards[i]=serialPlay[i]+playCards[i];
			}
			System.out.println("�����Ϊ��");
			System.out.println(Arrays.toString(playCards));
			for (int i = 0; i < 3; i++) {
				bottomCards[i]=serialBottom[i]+bottomCards[i];
			}
			System.out.println("����Ϊ��");
			System.out.println(Arrays.toString(bottomCards));
			
		}
		
		if(number==15) {	
			//�����Ϊ15��ʱ��������Ϊ18
			String[] allPlayCards=new String[18];
			for(int i=0;i<serialPlay.length;i++) {
					System.arraycopy(cards1, 0, allPlayCards, 0, 7);
					System.arraycopy(cards2, 0, allPlayCards, 7, 5);
					System.arraycopy(cards3, 0, allPlayCards, 12,5);
					System.arraycopy(cards1, 8, allPlayCards, 17,1);
			}
			//��ҵ�15����
			String[] playCards = new String[15];
			//����3��
			String[] bottomCards = new String[3];
			for(int i=0;i<15;i++) {
				int random =(int)(Math.random()*16);
				String temp = "";
				temp = allPlayCards[i];
				allPlayCards[i]=allPlayCards[random];
				allPlayCards[random]=temp;
			}
			for(int i=0;i<15;i++) {
				System.arraycopy(allPlayCards, 2, playCards, 0, 14);
				System.arraycopy(allPlayCards, 17, playCards, 14, 1);
			}
			for(int i=0;i<serialBottom.length;i++) {
				System.arraycopy(allPlayCards, 16, bottomCards, 0, 1);
				System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
				System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);	
			}
			for (int i = 0; i < 15; i++) {
				playCards[i]=serialPlay[i]+playCards[i];
			}
			System.out.println("�����Ϊ��");
			System.out.println(Arrays.toString(playCards));
			for (int i = 0; i < 3; i++) {
				bottomCards[i]=serialBottom[i]+bottomCards[i];
			}
			System.out.println("����Ϊ��");
			System.out.println(Arrays.toString(bottomCards));
			
		}
		
		if(number==16) {	
			//�����Ϊ16��ʱ��������Ϊ19
			String[] allPlayCards=new String[19];
			for(int i=0;i<serialPlay.length;i++) {
					System.arraycopy(cards1, 0, allPlayCards, 0, 7);
					System.arraycopy(cards2, 0, allPlayCards, 7, 6);
					System.arraycopy(cards3, 0, allPlayCards, 13,5);
					System.arraycopy(cards1, 8, allPlayCards, 18,1);
			}
			//��ҵ�16����
			String[] playCards = new String[16];
			//����3��
			String[] bottomCards = new String[3];
			for(int i=0;i<15;i++) {
				int random =(int)(Math.random()*16);
				String temp = "";
				temp = allPlayCards[i];
				allPlayCards[i]=allPlayCards[random];
				allPlayCards[random]=temp;
			}
			for(int i=0;i<16;i++) {
				System.arraycopy(allPlayCards, 2, playCards, 0, 15);
				System.arraycopy(allPlayCards, 18, playCards, 15, 1);
			}
			for(int i=0;i<serialBottom.length;i++) {
				System.arraycopy(allPlayCards, 17, bottomCards, 0, 1);
				System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
				System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);	
			}
			for (int i = 0; i < 16; i++) {
				playCards[i]=serialPlay[i]+playCards[i];
			}
			System.out.println("�����Ϊ��");
			System.out.println(Arrays.toString(playCards));
			for (int i = 0; i < 3; i++) {
				bottomCards[i]=serialBottom[i]+bottomCards[i];
			}
			System.out.println("����Ϊ��");
			System.out.println(Arrays.toString(bottomCards));
		}
		
		if(number==17) {	
			//�����Ϊ17��ʱ��������Ϊ20
			String[] allPlayCards=new String[20];
			for(int i=0;i<serialPlay.length;i++) {
					System.arraycopy(cards1, 0, allPlayCards, 0, 7);
					System.arraycopy(cards2, 0, allPlayCards, 7, 6);
					System.arraycopy(cards3, 0, allPlayCards, 13,6);
					System.arraycopy(cards1, 8, allPlayCards, 19,1);
			}
			//��ҵ�17����
			String[] playCards = new String[17];
			//����3��
			String[] bottomCards = new String[3];
			for(int i=0;i<16;i++) {
				int random =(int)(Math.random()*17);
				String temp = "";
				temp = allPlayCards[i];
				allPlayCards[i]=allPlayCards[random];
				allPlayCards[random]=temp;
			}
			for(int i=0;i<17;i++) {
				System.arraycopy(allPlayCards, 2, playCards, 0, 16);
				System.arraycopy(allPlayCards, 19, playCards, 16, 1);
			}
			for(int i=0;i<serialBottom.length;i++) {
				System.arraycopy(allPlayCards, 18, bottomCards, 0, 1);
				System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
				System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);	
			}
			for (int i = 0; i < 17; i++) {
				playCards[i]=serialPlay[i]+playCards[i];
			}
			System.out.println("�����Ϊ��");
			System.out.println(Arrays.toString(playCards));
			for (int i = 0; i < 3; i++) {
				bottomCards[i]=serialBottom[i]+bottomCards[i];
			}
			System.out.println("����Ϊ��");
			System.out.println(Arrays.toString(bottomCards));
			
		}
		
		if(number==18) {	
			//�����Ϊ18��ʱ��������Ϊ21
			String[] allPlayCards=new String[21];
			for(int i=0;i<serialPlay.length;i++) {
					System.arraycopy(cards1, 0, allPlayCards, 0, 7);
					System.arraycopy(cards2, 0, allPlayCards, 7, 7);
					System.arraycopy(cards3, 0, allPlayCards, 14,6);
					System.arraycopy(cards1, 8, allPlayCards, 20,1);
			}
			//��ҵ�17����
			String[] playCards = new String[18];
			//����3��
			String[] bottomCards = new String[3];
			for(int i=0;i<17;i++) {
				int random =(int)(Math.random()*18);
				String temp = "";
				temp = allPlayCards[i];
				allPlayCards[i]=allPlayCards[random];
				allPlayCards[random]=temp;
			}
			for(int i=0;i<18;i++) {
				System.arraycopy(allPlayCards, 2, playCards, 0, 17);
				System.arraycopy(allPlayCards, 20, playCards, 17, 1);
			}
			for(int i=0;i<serialBottom.length;i++) {
				System.arraycopy(allPlayCards, 19, bottomCards, 0, 1);
				System.arraycopy(allPlayCards, 0, bottomCards, 1, 1);
				System.arraycopy(allPlayCards, 1 , bottomCards, 2, 1);	
			}
			for (int i = 0; i < 18; i++) {
				playCards[i]=serialPlay[i]+playCards[i];
			}
			System.out.println("�����Ϊ��");
			System.out.println(Arrays.toString(playCards));
			for (int i = 0; i < 3; i++) {
				bottomCards[i] = serialBottom[i]+bottomCards[i];
			}
			System.out.println("����Ϊ��");
			System.out.println(Arrays.toString(bottomCards));
			
		}
		
		
	}

}
