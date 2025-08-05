package com.taobao.trtc.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1024256732);
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue() : a(jSONObject, str, z, false);
    }

    private static boolean a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63962156", new Object[]{jSONObject, str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (jSONObject == null) {
            return z;
        }
        try {
            if (jSONObject.containsKey(str)) {
                z = jSONObject.getBooleanValue(str);
            }
            return z;
        } catch (Exception e) {
            TrtcLog.a("TRTC-JSONUtils", "getBoolean exception: " + e.getMessage());
            return z2;
        }
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e389e4", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        try {
            return jSONObject.containsKey(str) ? jSONObject.getIntValue(str) : i;
        } catch (Exception e) {
            TrtcLog.a("TRTC-JSONUtils", "getInt exception: " + e.getMessage());
            return i;
        }
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f883384", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        try {
            return jSONObject.containsKey(str) ? jSONObject.getString(str) : str2;
        } catch (Exception e) {
            TrtcLog.a("TRTC-JSONUtils", e.getMessage());
            return str2;
        }
    }

    public static String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{jSONObject, str}) : a(jSONObject, str, "");
    }
}
