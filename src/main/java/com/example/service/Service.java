package com.example.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.example.entity.Person;

/**
 * 模拟一个上课的场景，写服务(签到、查询，统计等)，不用存库，不用web界面，使用命令行界面就可以
 * @author 管婕
 *
 */
@org.springframework.stereotype.Service
public class Service {
	List<Person> list = new ArrayList<Person>();
	
	/**
	 * 签到
	 */
	public void sign() {
		System.out.println("请输入姓名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		String date = sdf.format(new Date());
		Person p = new Person(name,date);
		list.add(p);
		System.out.println(name+"已签到成功！");
	}
	
	/**
	 * 查询
	 */
	public void select() {
		System.out.println("请输入查询姓名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for (Person l : list) {
			if(l.getName().equals(name)) {
				System.out.println(name+"已签到");
			}else {
				System.out.println(name+"未签到");
			}
		}
	}
	
	/**
	 * 统计
	 */
	public void count() {
		int count = list.size();
		System.out.println("当前签到人数为："+count+"人");
		System.out.println("---------------------------------------");
		System.out.println("1.查看详细信息        2.返回上一级");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			String choose = sc.nextLine();
			if(choose.equals("1")) {
				if(count==0) {
					System.out.println("无结果");
				}else {
					System.out.println("   姓名     |  签到时间");
					System.out.println("-----------------------------");
					for (Person l : list) {
						System.out.println(l.getName()+"\t"+l.getDate());
					}
				}
			}else if(choose.equals("2")) {
				
				break;
			}else {
				System.out.println("请输入正确选项：");
			}
		}		
	}
}
