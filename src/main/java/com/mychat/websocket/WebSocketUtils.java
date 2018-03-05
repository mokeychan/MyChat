/**
 * 
 */
package com.mychat.websocket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.Session;

public class WebSocketUtils {

	public static Map<String, Session> clients=new ConcurrentHashMap<String, Session>();
	public static void put(String key,Session session){
		clients.put(key, session);
	}
	public static Session get(String key){
		return clients.get(key);
	}
	 public static void remove(String key){
		 clients.remove(key);
	}
	 public static boolean hasConnection(String key) {
		 return clients.containsKey(key);
	}
}
