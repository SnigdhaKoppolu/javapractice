package com.inheritence;

public class StaffInfo extends StudentInfo{
	String s_members;
	void getStaffDetails() {
		
	}
	public static void main(String[] args) {
		
		StaffInfo s1 = new StaffInfo();
		System.out.println(s1.sch_name);
		System.out.println(s1.students);
		System.out.println(s1.s_members);

	}

}
