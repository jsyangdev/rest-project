package com.example.restproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// View 리턴 X
// xml or json 타입을 리턴해야한다.

// restcontroller -> 리턴값을 무조건 json(여기서 디폴트값)으로 리턴
@RestController
public class StudentController {

	/*
	 *  DB Table -> select -> mapper -> service -> 자바의 객체 받아옴 ( 예상 )
	 */
	
	// List->interface
	// ArrayList implements List
	// "/students"라고 요청하면
	@GetMapping("/students")
	public List<Student> students() {
		
		List<Student> list = new ArrayList<Student>();
		
		// 더미 데이터 만들기 (Service Layer 메서드의 리턴값)
		list.add(new Student(1, 202, "양진선"));
		list.add(new Student(2, 202, "이유림"));
		list.add(new Student(3, 202, "정진우"));
		list.add(new Student(4, 202, "방혜원"));
		list.add(new Student(5, 202, "박혜란"));
		list.add(new Student(6, 202, "박형민"));
		list.add(new Student(7, 202, "이영호"));
		list.add(new Student(8, 202, "송동일"));
		list.add(new Student(9, 202, "복영수"));
	
		return list;	
	}
}
