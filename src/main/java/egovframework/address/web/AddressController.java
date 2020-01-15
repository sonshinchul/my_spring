package egovframework.address.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.address.service.AddressService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class AddressController  {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Resource(name = "addressService")
	private AddressService addressService;
	
	

	/**
	 * @Description 메인
	 */
	@RequestMapping("/admin/address/main.do")
	public String main(@RequestParam Map<String, Object> param, ModelMap model) throws Exception {
	
		
		return "/admin/address/main";
	}

	/**
	 * @Description 목록 조회
	 */
	@RequestMapping("/test.do")
	public String retrieveList(@RequestParam Map<String, Object> param, ModelMap model) throws Exception {
		System.out.println("********************test.do");
		System.out.println("***********test2.do");
		
		
		
		List<EgovMap> resultList = addressService.retrieveList(param);
		
		
		model.addAttribute("resultList", resultList);

		return "/test";
	}
	/**
	 * @Description 목록 조회
	 */
	@RequestMapping("/testValue.do")
	public String retrieveListTest( HttpServletRequest req, @RequestParam Map<String, Object> param, ModelMap model) throws Exception {
		System.out.println("********************test.do");
	
		System.out.println("parm=============="+req.getParameter((String)param.get("testValue")));
		System.out.println("parm=============="+param.get("test_son"));
		System.out.println("********************test.do");
		return "/test";
	}
}