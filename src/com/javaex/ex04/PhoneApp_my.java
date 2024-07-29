package com.javaex.ex04;

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

import com.javaex.ex03.Person;

public class PhoneApp_my {

	public static void main(String[] args) throws IOException {
		
		//읽기 스트림
		InputStream fr = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(fr, "MS949");
		BufferedReader br  = new BufferedReader(isr);
		
		//쓰기 스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDBv2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner sc = new Scanner(System.in);
		List<Person> pList = new ArrayList<Person>();
				
		System.out.println("메뉴 선택");
		System.out.println("1. PhoneDB 정보 출력\n2. PhoneDB 정보 입력\n3.프로그램 종료");
		int processOn = sc.nextInt();
		
		switch (processOn) {
		
		
			case 1: //정보 출력
				System.out.println("PhoneDB의 내용입니다.");
				
				while (true) {
					
					String str = br.readLine(); 
					
					if (str == null) {
						System.out.println("파일 읽기 끝");
						break;
					}
					
					String[] re = str.split(",");
					
					Person p = new Person(re[0], re[1], re[2]);
					
					bw.write(str);
					bw.newLine();
					
				}	
				
			
			case 2: //정보 입력
				System.out.println("PhoneDB에 정보를 입력합니다.");
				
				while (true) {
					
					System.out.println("정보를 입력하세요");
					System.out.print(">> ");
						
					String enter3 = sc.nextLine();
						
					if ( enter3.equals("q") ) {
						break;
					}
					
					
				}
				
				
				
				
				
			case 3:
				System.out.println("프로그램을 종료합니다");
				break;
				
			default:
				System.out.println("잘못된 입력입니다");
				break;
		
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		bw.close();
		br.close();
		System.out.println("프로그램 종료");
	}
		
	

}
