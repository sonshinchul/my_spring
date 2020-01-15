package egovframework.address.service.impl;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("addressMapper")
public interface AddressMapper {

	/**
	 * @Description 목록 조회
	 */
	public List<EgovMap> retrieveList(Map<String, Object> param) throws Exception;

	
}