package com.taobao.android.editionswitcher.homepage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.LinkedHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f12306a;

    static {
        kge.a(-1465671856);
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else {
            new b(activity, i, null).b();
        }
    }

    public static int[] a(String[] strArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e38854f9", new Object[]{strArr, str, str2});
        }
        int[] iArr = new int[strArr.length];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str3 = strArr[i4];
            if (str3.equals(str)) {
                if (str3.equals(str2)) {
                    i2 = i4;
                    i3 = i2;
                } else {
                    i2 = i4;
                }
            } else if (str3.equals(str2)) {
                i3 = i4;
            } else if (str3.equals("GLOBAL")) {
                iArr[strArr.length - 1] = i4;
            } else {
                linkedHashMap.put(str3, Integer.valueOf(i4));
            }
        }
        iArr[0] = i2;
        if (i2 != i3) {
            iArr[1] = i3;
        } else {
            i = 1;
        }
        for (Integer num : linkedHashMap.values()) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (f12306a == null) {
            String string = Globals.getApplication().getSharedPreferences("homepage_location_sp", 0).getString("editionTipsIsShown", "");
            if (!TextUtils.isEmpty(string)) {
                f12306a = JSON.parseObject(string);
            }
        }
        JSONObject jSONObject = f12306a;
        return (jSONObject == null || jSONObject.get(str) == null || !Boolean.valueOf(f12306a.get(str).toString()).booleanValue()) ? false : true;
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        if (f12306a == null) {
            f12306a = new JSONObject();
        }
        f12306a.put(str, (Object) Boolean.valueOf(z));
        Globals.getApplication().getSharedPreferences("homepage_location_sp", 0).edit().putString("editionTipsIsShown", f12306a.toJSONString()).apply();
    }

    public static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]) : Globals.getApplication().getSharedPreferences(a(Globals.getApplication()), 0);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a().edit().putString(str, str2).apply();
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : a().getString(str, "");
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : a().getString(str, str2);
    }

    private static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        return context.getPackageName() + "_preferences";
    }
}
