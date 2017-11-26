package com.example;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.service.Service;

@SpringBootApplication
public class WorkApplication {

	@Autowired
	private Service service;
	public static void main(String[] args) {
		SpringApplication.run(WorkApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		
			System.out.println("--------------欢迎--------------");
			while(true) {
				System.out.println("1.签到        2.查询        3.统计        4.退出");
				System.out.println("请输入1.2.3.4进行操作：");
				Scanner sc = new Scanner(System.in);
				String choose = sc.nextLine();
				switch (choose) {
				case "1":
					service.sign();
					break;
				case "2":
					service.select();;
					break;
				case "3":
					service.count();
					break;	
				case "4":
					System.out.println("再见！");
					break;
				default:
					System.out.println("输入错误，请重新输入：");
					break;
				}
			}
		
	}
}
