package com.tc.changer.utils;

import android.util.Log;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tc on 2017/2/24.
 */

public class Util {

    private final static String TAG = "tc";


    public static void Log(String msg) {
        Log.i(TAG, msg);
    }

    public static boolean isEmailCorrect(String email) {
        boolean isMatched = false;
        //电子邮件
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(email);
        if (email.isEmpty()) {
            isMatched = false;
        } else {
            isMatched = matcher.matches();
        }
        return isMatched;
    }

    public static boolean isMobileCorrect(String mobile) {
        Pattern p = Pattern.compile("^(1[3,4,5,7,8])\\d{9}$");
        Matcher m = p.matcher(mobile);
        return m.matches();
    }

    public static boolean isPasswordCorrect(String password) {
        boolean isMatched = false;
        //密码是否以字母开头
        String check = "\\b[a-z]\\w*";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(password);
        isMatched = matcher.matches();
        return isMatched;
    }

    public static String getUrl(String reqMoth, Map<String, String> map) {

        StringBuffer sb = new StringBuffer();
        String url = "http://10.0.2.2:8081/";
        if (map != null) {
            sb.append(url + reqMoth + "?");
            for (Map.Entry<String, String> s : map.entrySet()) {
                sb.append(s.getKey() + "=");
                sb.append(s.getValue() + "&");
            }
            sb.delete(sb.length() - 1, sb.length());
        } else {
            sb.append(url + reqMoth);
        }
        System.out.println("url = " + sb.toString());
        return sb.toString();
    }


}
