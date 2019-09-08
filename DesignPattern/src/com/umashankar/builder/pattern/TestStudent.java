package com.umashankar.builder.pattern;

import java.util.Arrays;

public class TestStudent {
	
	public static void main(String[] args) {

        Student s = new Student.Builder()
			.name("mkyong")
			.age(18)
			.language(Arrays.asList("chinese","english"))
			.build();

		//Student{name='mkyong', age=18, language=[chinese, english]}
        System.out.println(s);

        // Classic way to create an object
		/*
		Student s = new Student();
        s.setName("mkyong");
        s.setAge(18);
        s.setLanguage(Arrays.asList("chinese","english"));
		*/

    }

}
