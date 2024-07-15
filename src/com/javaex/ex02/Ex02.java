package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		BufferedReader br  = new BufferedReader(fr);
		
		while (true) {
		
			String str = br.readLine(); //파일의 내용을 1줄씩 읽어온다
			
			if (str == null) {
				System.out.println("파일 읽기 끝");
				break;
			}			
			
			System.out.println(str);
			
		}	
		
		br.close();
		System.out.println("프로그램 종료");
	}

}
