package com.taobao.taolive.room.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.kge;
import tb.ply;
import tb.pqj;

/* loaded from: classes8.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1567593071);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        int e = ply.e();
        if (e <= 0 || TextUtils.isEmpty(str) || str.length() <= e) {
            return str;
        }
        return str.substring(0, e) + "...";
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue() : a(str, 0);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue() : a(str, 0L);
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static float d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e5", new Object[]{str})).floatValue() : a(str, 0.0f);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return f;
        }
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : a(str, false);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (str == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return z;
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : str == null || "".equals(str);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        ArrayList arrayList = null;
        try {
            JSONArray parseArray = JSON.parseArray(str2);
            if (parseArray.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < parseArray.size(); i++) {
                    try {
                        if (!TextUtils.isEmpty(parseArray.getString(i))) {
                            arrayList2.add(parseArray.getString(i));
                        }
                    } catch (Throwable unused) {
                    }
                }
                arrayList = arrayList2;
            }
        } catch (Throwable unused2) {
        }
        if (!TextUtils.isEmpty(str) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!TextUtils.isEmpty(str3) && str3.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj}) : obj == null ? "" : obj.toString();
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || str.length() <= 1) {
            return str;
        }
        if (str.length() == 2) {
            return str.charAt(0) + "*";
        }
        return str.charAt(0) + "***" + str.charAt(str.length() - 1);
    }

    public static boolean a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d638caf3", new Object[]{context, aVar, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap = com.taobao.android.live.plugin.proxy.f.f().atmosphereInstanceGetStickerKeyMatchMap(aVar);
        int i = -1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ('[' == charAt) {
                i = i2;
            } else if (']' == charAt && i >= 0) {
                if (atmosphereInstanceGetStickerKeyMatchMap.containsKey(str.substring(i, i2 + 1))) {
                    return true;
                }
                i = -1;
            }
        }
        return false;
    }

    public static String a(Uri uri) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri != null && (b = pqj.b(uri.getQueryParameter(aw.PARAM_UT_PARAMS))) != null) {
            return b.getString("x_object_type");
        }
        return null;
    }
}
