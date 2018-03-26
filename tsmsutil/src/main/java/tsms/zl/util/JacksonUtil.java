/******************************************
项目名称：tsmsutil
文件：JacksonUtil.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月9日 上午8:53:02
*******************************************/
package tsms.zl.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author hspcadmin
 *
 */
public class JacksonUtil {
	/**
	 * json转java对象
	 * @param args
	 */
	public static <T> T json2Obj(String json,Class<T> t) {
		ObjectMapper objectMapper = new ObjectMapper();
		T obj = null;
		try {
			obj = objectMapper.readValue(json, t);
			System.out.println("readJson2Entity="+obj);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	/**
	 * java对象转json
	 * @param args
	 */
	public static String obj2Json(Object obj) {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		try {
			json = objectMapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("obj2Json="+json);
		return json;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
