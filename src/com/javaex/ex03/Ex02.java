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

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		//읽기 스트림
		InputStream fr = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(fr, "MS949");
		BufferedReader br  = new BufferedReader(isr);
		
		//쓰기 스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		while (true) {
		
			String str = br.readLine(); 
			//System.out.println("1" + str);
			
			if (str == null) {
				System.out.println("파일 읽기 끝");
				break;
			}
			
			bw.write(str);
			bw.newLine();
			//System.out.println("2" + str);
			
		}	
		
		bw.close();
		br.close();
		System.out.println("프로그램 종료");
	}
		
	

}
