package componentmodel;

import java.util.HashMap;
import java.util.Map;

public class ComponentRegistry {
	
static Map<Class<?>, Object> components = new HashMap<Class<?>, Object>();
	
	public static void registerComponent(Class<?> ifceClazz, Object compObject) {
		components.put(ifceClazz, compObject);
	}
	
	public static Object fetchComponent(Class<?> ifceClazz) {
		return components.get(ifceClazz);
	}

}
