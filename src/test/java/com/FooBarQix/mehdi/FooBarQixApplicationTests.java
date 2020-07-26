package com.FooBarQix.mehdi;

import com.FooBarQix.mehdi.service.FooBarQixService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FooBarQixApplicationTests {

private FooBarQixService fooBarQix;


	@BeforeEach
	public void init() {

		fooBarQix = new FooBarQixService();
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void testSingleResultFooBarQix() {
		 String a = "3";
		String result = fooBarQix.fooBarQixResult(a);
		assertEquals("FooFoo", result);
	}

	@ParameterizedTest(name = "{0} => {1}")
	@CsvSource({ "1,1", "2,2", "3,FooFoo","4,4","5,BarBar","6,Foo","7,QixQix",
			"8,8","9,Foo","10,Bar*","13,Foo","15,FooBarBar","21,FooQix",
	"33,FooFooFoo","51,FooBar","53,BarFoo",
	"101,1*1","303,FooFoo*Foo","105,FooBarQix*Bar","10101,FooQix**"})
	public void testResult(String s, String expectResult) {
		String result = fooBarQix.fooBarQixResult(s);
		assertEquals(expectResult, result);
	}

}
