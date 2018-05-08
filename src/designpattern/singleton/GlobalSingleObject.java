package designpattern.singleton;

public class GlobalSingleObject {
	private GlobalSingleObject() {
		
	}
	
	private static GlobalSingleObject __instance = null;
	private static final Object __lockObj = new Object();
	
	// Varianta multithreading safe
	public static GlobalSingleObject getInstance() {
		if(__instance == null) {
			synchronized (__lockObj) {
				if(__instance == null) {
					__instance = new GlobalSingleObject();
				}
			}
		}
		return __instance;
	}
}
