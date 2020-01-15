package egovframework.address.service;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface AddressService {

	/**
	 * @Description 목록 조회
	 */
	public List<EgovMap> retrieveList(Map<String, Object> param) throws Exception;

}