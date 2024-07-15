package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		//읽기 스트림
		InputStream fr = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(fr, "MS949");
		BufferedReader br  = new BufferedReader(isr);
		
		
		List<Person> sList = new ArrayList<Person>();
		
		while (true) {
		
			String str = br.readLine(); 
			
			if (str == null) {
				System.out.println("파일 읽기 끝");
				break;
			}
			
			
			String[] re = str.split("#");
			
			Person p = new Person(re[0], re[1], re[2]);
			
			/*
			p.setName(re[0]);
			p.setHp(re[1]);
			p.setCompany(re[2]);
			*/
			sList.add(p);
			
			//p.showInfo();
			
		}	
		
		
		for (Person info : sList) {
			info.showInfo();
		}
		
		for (Person info2 : sList) {
			
			System.out.println("===============");
			System.out.println("이름: " + info2.getName());
			System.out.println("전화: " + info2.getHp());
			System.out.println("회사: " + info2.getCompany());
			System.out.println("===============");
		}
		
		System.out.println("=-=-=-=--=---=-=-=-=-=-=-=");
		
		for (Person info3 : sList) {
			System.out.println(info3.toString());
		}
		
		
		
		br.close();
		System.out.println("프로그램 종료");
	}
		
	

}
