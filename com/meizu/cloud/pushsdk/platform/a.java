package com.meizu.cloud.pushsdk.platform;

import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f8012a = a();
    private static final List<String> b = new ArrayList(f8012a.keySet());

    public static String a(String str) {
        String str2;
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.length() <= 3) {
                return str;
            }
            String substring = str.substring(0, 3);
            if (!f8012a.containsKey(substring)) {
                return str;
            }
            String str3 = f8012a.get(substring);
            str2 = str.substring(3);
            try {
                char[] cArr = new char[str2.length() / 2];
                int i = 0;
                int i2 = 0;
                while (i < str2.length() / 2) {
                    if (i2 == str3.length()) {
                        i2 = 0;
                    }
                    int i3 = i << 1;
                    cArr[i] = (char) (((char) Integer.valueOf(str2.substring(i3, i3 + 2), 16).intValue()) ^ str3.charAt(i2));
                    i++;
                    i2++;
                }
                return new String(String.valueOf(cArr).getBytes("iso-8859-1"), "UTF-8");
            } catch (Exception unused) {
                DebugLogger.e("PushIdEncryptUtils", "invalid pushId encryption " + str2);
                return str;
            }
        } catch (Exception unused2) {
            str2 = str;
        }
    }

    private static Map<String, String> a() {
        if (a(f8012a)) {
            synchronized (a.class) {
                if (a(f8012a)) {
                    TreeMap treeMap = new TreeMap();
                    f8012a = treeMap;
                    treeMap.put("UCI", "v9tC0Myz1MGwXRFy");
                    f8012a.put("G3G", "XAsFqhhaf4gKpmAi");
                    f8012a.put("V5R", "cOqH18NXwBtZVkvz");
                    f8012a.put("0XC", "IgSEKZ3Ea6Pm4woS");
                    f8012a.put("Z9K", "pH6J9DMPNgqQp8m8");
                    f8012a.put("EIM", "K11Rs9HAKRXeNwq8");
                    f8012a.put("SO7", "T8LquL1DvwVcogiU");
                    f8012a.put("DDI", "d02F6ttOtV05MYCQ");
                    f8012a.put("ULY", "ToZZIhAywnUfHShN");
                    f8012a.put("0EV", "r5D5RRwQhfV0AYLb");
                    f8012a.put("N6A", "QAtSBFcXnQoUgHO2");
                    f8012a.put("S5Q", "sDWLrZINnum227am");
                    f8012a.put("RA5", "4Uq3Ruxo1FTBdHQE");
                    f8012a.put("J04", "N5hViUTdLCpN59H0");
                    f8012a.put("B68", "EY3sH1KKtalg5ZaT");
                    f8012a.put("9IW", "q1u0MiuFyim4pCYY");
                    f8012a.put("UU3", "syLnkkd8AqNykVV7");
                    f8012a.put("Z49", "V00FiWu124yE91sH");
                    f8012a.put("BNA", "rPP7AK1VWpKEry3p");
                    f8012a.put("WXG", "om8w5ahkJJgpAH9v");
                }
            }
        }
        return f8012a;
    }

    public static <K, V> boolean a(Map<K, V> map) {
        return map == null || map.isEmpty();
    }
}
