package com.whereami.web.utils;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.util.TokenBuffer;

public class JSONParser {

	 /*——————————————————————-
	   |      S E L F / M E T H O D S                       |
	   ——————————————————————-*/
	    /**
	     * Object를 Jsong Text로 마샬링 한다.
	     *
	     * @param object the object
	     * @return the string
	     * @throws Exception the exception
	     */
	    public static String marshallingJson(Object object) throws Exception {
	        TokenBuffer buffer = new TokenBuffer(null);
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.writeValue(buffer, object);
	        JsonNode root = objectMapper.readTree(buffer.asParser());
	        String jsonText = objectMapper.writeValueAsString(root);
	        jsonText = jsonText.replaceAll("null", "");
	        
	        return jsonText;
	    }

	    /**
	     * Json Text를 Object로 언마샬링 한다.
	     *
	     * @param <T> 언마샬링 될 제너릭 타입
	     * @param jsonText Json 형태의 텍스트
	     * @param valueType 언마샬링 될 오브젝트 타입
	     * @return the t
	     * @throws Exception the exception
	     */
	    public static <T> T unmarshallingJson(String jsonText, Class<T> valueType) throws Exception {
	        ObjectMapper objectMapper = new ObjectMapper();
	        return (T) objectMapper.readValue(jsonText, valueType);
	    }
	
}
