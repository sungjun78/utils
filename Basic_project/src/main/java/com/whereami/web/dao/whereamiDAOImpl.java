package com.whereami.web.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.whereami.web.vo.WhereamiInfoVO;


@SuppressWarnings("restriction")
@Repository
public class whereamiDAOImpl implements whereamiDAO{

	/* 
	 * SqlMapClient의 method정보 :
	 * insert는 return값이 성공유무를 떠나서 null값을 return한다.
	 * update, delete method는 적용된 row수를 int로 return한다.
	 * update method는 insert시에도 적용이 가능하다.
	 * 그러므로, insert성공여부를 확인하고자 한다면, update method를 사용한다.
	 * 
	 */
	@Autowired
	@Resource(name = "mysqlSqlClient")
	SqlMapClient client;
	
	@SuppressWarnings("unchecked")
	public List<WhereamiInfoVO> logincheckInfo(WhereamiInfoVO naiVO) throws Exception {
		return (List<WhereamiInfoVO>) client.queryForObject("WhereamiTag.getLogin", naiVO);
	}	
	
//
//	@Override
//	public int addNameTagInfo(NameAppInfoVO naiVO) throws Exception {
//		return client.update("nameTag.addNameTagInfo", naiVO);
//	}
//
//	@Override
//	public NameAppInfoVO getLogin(NameAppInfoVO naiVO) throws Exception {
//		return (NameAppInfoVO) client.queryForObject("nameTag.getLogin", naiVO);
//	}
//	
//	@Override
//	public NameAppInfoVO getNameTagInfo(String login_email) throws Exception {
//		return (NameAppInfoVO) client.queryForObject("nameTag.getNameTagInfo", login_email);
//	}
//
//	@Override
//	public int updateNameTagInfo(NameAppInfoVO naiVO) throws Exception {
//		return client.update("nameTag.updateNameTagInfo", naiVO);
//	}
//
//	@Override
//	public int deleteNameTagInfo(String login_email) throws Exception {
//		return client.update("nameTag.deleteNameTagInfo", login_email);
//	}
//
//	@Override
//	public ArrayList<NameAppInfoVO> getNameTagInfoList() throws Exception {
//		return (ArrayList<NameAppInfoVO>) client.queryForList("nameTag.getNameTagInfoList");
//	}
//	
//	@Override
//	public int addexchangeNameTag(NameAppInfoVO naiVO) throws Exception {
//		return client.update("nameTag.addexchangeNameTag", naiVO);
//	}
//	
//	@Override
//	public int delexchangeNameTag(NameAppInfoVO naiVO) throws Exception {
//		return client.update("nameTag.delexchangeNameTag", naiVO);
//	}
//	
//	@Override
//	public NameAppExchangeInfoVO reqexchangeNameTag(NameAppExchangeInfoVO naiVO) throws Exception {
//		return (NameAppExchangeInfoVO) client.queryForObject("nameTag.reqexchangeNameTag", naiVO);
//
//	}			
//	
//	@Override
//	public ArrayList<NameAppInfoExVO> reqexchangeNameTaglist(String login_email) throws Exception {
//		return (ArrayList<NameAppInfoExVO>) client.queryForList("nameTag.reqexchangeNameTaglist", login_email);
//	}			
	
	
	
}
