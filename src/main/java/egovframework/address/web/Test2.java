package egovframework.address.web;


import javax.annotation.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import egovframework.address.dto.SampleDto;
import egovframework.address.service.AddressService;



@RestController
@RequestMapping("/rest")
public class Test2 {

	
	@Resource(name = "addressService")
	private AddressService addressService;
	
	
	@GetMapping(value="/getText",produces="text/plain; charset=UTF-8")
	public String test1() {
		System.out.println("***********test");
		
		return "안녕하세요d";
		
	}
	
	@GetMapping(value="/getSample",produces= {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
	public SampleDto getSample() {
		
		System.out.println("**********여기 오나 ");
		
		SampleDto dto = new SampleDto();
		
		dto.setMno(1);
		dto.setFirstName("손");
		dto.setLastName("신철");
		System.out.println("**dto="+dto.getMno());
		System.out.println("**dto="+dto.getFirstName());
		System.out.println("**dto="+dto.getLastName());
		
		return dto;
	}
	
	
	
	
	
/*	
	@GetMapping("/rest/collection.do")
	public List<EgovMap> test2(@RequestParam Map<String, Object> param, ModelMap model) throws Exception{
		
		List<EgovMap> resultList = addressService.retrieveList(param);
		return resultList;
	}
	*/
	
	
}
