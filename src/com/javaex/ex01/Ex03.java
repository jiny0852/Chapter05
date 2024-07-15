package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	
	public static void main(String[] args) throws IOException {
				
		//읽기 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		//쓰기 스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\Buffedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사 시작");
		while (true) {
			
			int data = bin.read();
			
			if (data == -1) {
				System.out.println("복사 끝");
				break;
			}
			
			bout.write(data);
			
		}
		
		System.out.println("프로그램 종료");
		
		
		bin.close();
		bout.close();
		//out.close();
		//in.close();
		
		
	}


}
