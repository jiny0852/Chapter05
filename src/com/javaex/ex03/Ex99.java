package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex99 {

	public static void main(String[] args) throws IOException {
		
		//읽기 스트림
		InputStream fr = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(fr, "MS949");
		BufferedReader br  = new BufferedReader(isr);
		
		//쓰기 스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		List<Person> sList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		
		//정보 추가
		System.out.print("정보를 추가하시겠습니까? y/n : ");
		String enterS = sc.nextLine();
		
		
		/*
		boolean enter;
		if ( enterS.equals("y") ) {
			enter = true;
		} else if ( enterS.equals("n") ) {
			enter = false;
		}
		*/
		
		
		while (enterS.equals("y")) {
			System.out.println("정보를 입력하세요");
			System.out.print(">> ");
			
			String enter3 = sc.nextLine();
			
			if ( enter3.equals("q") ) {
				break;
			}
			
			
			/*
			String[] re = enter3.split("#");
			
			Person p = new Person();
			
			p.setName(re[0]);
			p.setHp(re[1]);
			p.setCompany(re[2]);
			
			sList.add(p);
			
			//p.showInfo();
			*/
			bw.write(enter3);
			bw.newLine();
			
			
			
			
		}
		
		
		
		
		
		
		while (enterS.equals("n"
				+ "")) {
		
			String str = br.readLine(); 
			
			if (str == null) {
				System.out.println("파일 읽기 끝");
				break;
			}
			
			
			String[] re = str.split("#");
			
			Person p = new Person();
			
			p.setName(re[0]);
			p.setHp(re[1]);
			p.setCompany(re[2]);
			
			sList.add(p);
			
			//p.showInfo();
			
			//bw.write();
			//bw.newLine();
			
			
		}	
		
		
		for (Person info : sList) {
			info.showInfo();
		}
		
		
		sc.close();
		bw.close();
		br.close();
		System.out.println("프로그램 종료");
	}
		
	

}
