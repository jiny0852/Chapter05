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

public class PhoneApp {

	public static void main(String[] args) throws IOException {//, IndexOutOfBoundsException {
		
		//읽기 스트림
		InputStream fr = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(fr, "UTF-8");
		BufferedReader br  = new BufferedReader(isr);
		
		//쓰기 스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDBv2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner sc = new Scanner(System.in);
		
		//리스트 업데이트
		List<Person> pList = new ArrayList<Person>();
		

		
		System.out.println("============================");
		System.out.println("=======주소록 관리 프로그램=======");
		System.out.println("============================");
		
		boolean processOn = true;
		
		while (processOn) {
			
			System.out.println("1. 리스트 2. 등록 3. 삭제 4. 검색 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("> 메뉴번호 : ");
			int processNum = sc.nextInt();
			
			switch (processNum) {
			
			
				case 1: //데이터 출력
					
					System.out.println("<1. 리스트>");
					
					while (true) {
						
						String str = br.readLine(); 
					
						if (str == null) {
							//System.out.println("파일 읽기 끝");
							break;
						}
					
						String[] re = str.split(",");
					
						pList.add(new Person(re[0], re[1], re[2]));
					
					}
					
					for (Person info : pList) {
						info.showInfo();
					}
					
					break;
				
			
				case 2: //데이터 입력
					
					System.out.println("<2. 등록>");
				
					System.out.println("정보를 입력하세요");
					System.out.print(">> ");
						
					String enterStr = sc.nextLine();
						
					String[] re = enterStr.split(",");
					
					pList.add(new Person(re[0], re[1], re[2]));	
					
					/*
					Person p = new Person();
						
						
						p.setName(re[0]);
						p.setHp(re[1]);
						p.setCompany(re[2]);
						
						pList.add(p);
						
						
					*/
					
					
					
					break;
				
				
				case 3: //데이터 삭제
					
					System.out.println("<3. 삭제>");
					
				case 4: //데이터 검색
					
					System.out.println("<4. 검색>");
					
				case 5: //프로그램 종료
					
					System.out.println("5. 프로그램을 종료합니다");
					processOn = false;
					break;
				
				default:
					System.out.println("잘못된 입력입니다");
					break;
		
			}
			
			
			
			
			
		}
		
		System.out.println("============================");
		System.out.println("=========프로그램  종료=========");
		System.out.println("============================");
		
		
		
		sc.close();
		bw.close();
		br.close();
		System.out.println("프로그램 종료");
	}
		
	

}
