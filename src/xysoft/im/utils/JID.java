package xysoft.im.utils;

import xysoft.im.app.Launcher;

public class JID {

	public JID() {
		// TODO Auto-generated constructor stub
	}

	public static String bare(String from) {
		// TODO Auto-generated method stub
		return "test1@win7-1803071731";
	}

	public static String usernameByJid(String from) {

		return from.substring(0, from.indexOf("@"));
	}

	public static String nameByMuc(String fromfull) {
		// TODO Auto-generated method stub
		return "群友";
	}

	public static String usernameByMuc(String fromfull) {
		// TODO Auto-generated method stub
		String nickname = fromfull.substring(fromfull.indexOf("/")+1);
		if (nickname.contains("-"))
			return nickname.substring(0,nickname.indexOf("-"));
		else
			return nickname;
	}

	public static String full(String jid) {
		// bareJid补全fullJid
		return jid+"/"+Launcher.RESOURCE;
	}

}
