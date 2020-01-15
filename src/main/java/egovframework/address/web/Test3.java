package egovframework.address.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.address.dto.SampleDto;

@RestController
public class Test3 {

	@RequestMapping("/rest.do")
	public String getText(){
		System.out.println("**********");
		SampleDto dto = new SampleDto();
		
		dto.setMno(1);
		dto.setFirstName("sdf");
		dto.setLastName("신철");
		System.out.println("********get"+dto.getFirstName());
		return "안녕하세요";
	}
}
