package com.alibaba.android.ultron.ext.event.util;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-986508087);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!a((CharSequence) str)) {
            return str.startsWith("@");
        }
        return false;
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (char c : charArray) {
            if ('@' == c) {
                z = true;
            } else if ('{' == c && z) {
                return sb.toString();
            } else {
                if (z) {
                    sb.append(c);
                }
            }
        }
        return null;
    }

    public static Object a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("abaf35f4", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = charArray.length;
        String str2 = str;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < length) {
            char c = charArray[i];
            if ('@' == c) {
                z = true;
                str2 = str2;
            } else {
                if ('{' == c && z) {
                    String sb3 = sb.toString();
                    if (k.b(sb3)) {
                        str3 = sb3;
                        z = false;
                        z2 = true;
                    } else {
                        str3 = sb3;
                        z = false;
                    }
                } else if ('}' == c && z2) {
                    String sb4 = sb2.toString();
                    j a2 = k.a(str3);
                    String str4 = str2;
                    if (a2 != null) {
                        try {
                            str4 = a2.a(sb4, jSONObject);
                        } catch (Exception e) {
                            c.a("ExpressionParserEngine", "getValue", "EVENT_CHAIN_EXPRESSION_PARSER_ENGINE_PARSE_ERROR", c.a(e));
                            return null;
                        }
                    }
                    z = false;
                    str2 = str4;
                } else if (z) {
                    sb.append(c);
                } else if (z2) {
                    sb2.append(c);
                }
                i++;
                str2 = str2;
            }
            z2 = false;
            i++;
            str2 = str2;
        }
        return str2;
    }
}
