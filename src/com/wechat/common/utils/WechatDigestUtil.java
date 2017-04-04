package com.wechat.common.utils;

import java.security.*;

public final class WechatDigestUtil {
	private static final WechatDigestUtil _instance = new WechatDigestUtil();

	private MessageDigest alga;
	
	private WechatDigestUtil() {
		try {
			alga = MessageDigest.getInstance("SHA-1");
		} catch(Exception e) {
			throw new InternalError("init MessageDigest error:" + e.getMessage());
		}
	}

	public static WechatDigestUtil getInstance() {
		return _instance;
	}

	public static String byte2hex(byte[] b) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < b.length; i++) {
			tmp = (Integer.toHexString(b[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}
	
	public String encipher(String strSrc) {
		String strDes = null;
		byte[] bt = strSrc.getBytes();
		alga.update(bt);
		strDes = byte2hex(alga.digest()); //to HexString
		return strDes;
	}
}