package com.whereami.web.vo;

public class WhereamiInfoVO {

	private String Service_ID=""; 	// 가입자 ID (이메일)
	private String PWD=""; 			// 가입자 암호
	private String Phone_Number=""; // 가입자 단말번호
	private String NAME=""; 		// 가입자 이름
	private String nickname=""; 	// 가입자 닉네임
	private String auth_yn=""; 		// 가입자 인증 여부
	private String push_id=""; 		// 가입자 안드로이드 ID
	private String updatetime=""; 	// 가입자 업데이트 날자
	private String TimeStamp=""; 	// 가입자 생성 날자
	
	public String getService_ID() {
		return Service_ID;
	}
	public void setService_ID(String service_ID) {
		Service_ID = service_ID;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAuth_yn() {
		return auth_yn;
	}
	public void setAuth_yn(String auth_yn) {
		this.auth_yn = auth_yn;
	}
	public String getPush_id() {
		return push_id;
	}
	public void setPush_id(String push_id) {
		this.push_id = push_id;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	
}
