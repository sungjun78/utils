package com.whereami.web.service;

import java.util.List;

import com.whereami.web.vo.WhereamiInfoVO;


public interface WhereamiService {
	
	public List<WhereamiInfoVO> logincheckInfo(WhereamiInfoVO naiVO) throws Exception;
	
//	public int addNameTagInfo(NameAppInfoVO naiVO)throws Exception;
//	
//	public NameAppInfoVO getNameTagInfo(String login_email)throws Exception;
//	
//	public ArrayList<NameAppInfoVO> getNameTagInfoList()throws Exception;
//	
//	public int updateNameTagInfo(NameAppInfoVO naiVO)throws Exception;
//	
//	public int deleteNameTagInfo(String login_email)throws Exception;
//	
//	public int addexchangeNameTag(NameAppInfoVO naiVO)throws Exception;
//
//	public int delexchangeNameTag(NameAppInfoVO naiVO)throws Exception;
//	
//	public NameAppExchangeInfoVO reqexchangeNameTag(NameAppExchangeInfoVO naiVO)throws Exception;
//
//	public ArrayList<NameAppInfoExVO> reqexchangeNameTaglist(String login_email) throws Exception;
//
//	public NameAppInfoVO getLogin(NameAppInfoVO naiVo) throws Exception;
	
	

}
