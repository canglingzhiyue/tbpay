package com.taobao.taobao.scancode.gateway.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-373079706);
    }

    public static String a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str2 != null) {
            try {
                if (str2.length() > 0) {
                    android.taobao.util.k.a("URLUtil", "originUrl:" + str);
                    int indexOf = str.indexOf(35);
                    if (indexOf >= 0) {
                        str3 = str.substring(indexOf + 1);
                        str = str.substring(0, indexOf);
                    } else {
                        str3 = "";
                    }
                    android.taobao.util.k.a("URLUtil", "urlWithoutFragment:" + str + "\nfragment:" + str3);
                    int indexOf2 = str.indexOf(63);
                    if (indexOf2 >= 0) {
                        str4 = str.substring(indexOf2 + 1);
                        str = str.substring(0, indexOf2);
                    } else {
                        str4 = "";
                    }
                    android.taobao.util.k.a("URLUtil", "path:" + str + "\nquery:" + str4);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    if (str4.length() > 0) {
                        str2 = "&" + str2;
                    }
                    sb.append(str2);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("?");
                    sb3.append(sb2);
                    if (str3.length() > 0) {
                        str5 = "#" + str3;
                    } else {
                        str5 = "";
                    }
                    sb3.append(str5);
                    String sb4 = sb3.toString();
                    android.taobao.util.k.a("URLUtil", "result url :" + sb4);
                    return sb4;
                }
            } catch (Throwable unused) {
                return "";
            }
        }
        return str;
    }
}
