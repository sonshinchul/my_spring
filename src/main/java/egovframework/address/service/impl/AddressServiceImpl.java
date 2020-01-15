package egovframework.address.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.address.service.AddressService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "addressMapper")
	private AddressMapper addressMapper;
	
	@Override
	public List<EgovMap> retrieveList(Map<String, Object> param) throws Exception {
		List<EgovMap> result = addressMapper.retrieveList(param);
		return result;
	}

}