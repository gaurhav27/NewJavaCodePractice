package com.practice.code;

public class Rec {

	public static void main(String[] args) {

		Rec rec = new Rec();

		rec.m1();

	}

	private void m1() {

		System.out.println("Hi!!");
		m1();
		System.out.println("Hello!!");
	}
}
