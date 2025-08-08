package com.taobao.android.editionswitcher;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import java.util.LinkedHashMap;
import tb.kge;
import tb.lbq;
import tb.njn;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f12295a;

    static {
        kge.a(1551603829);
    }

    public static void a(lbq lbqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbcab66", new Object[]{lbqVar, new Integer(i)});
        } else {
            a(lbqVar, i, (HomeLocationResult) null);
        }
    }

    public static void a(lbq lbqVar, int i, HomeLocationResult homeLocationResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25511a47", new Object[]{lbqVar, new Integer(i), homeLocationResult});
        } else {
            njn.a(lbqVar.getClass().getName()).a(new c(lbqVar, i, homeLocationResult));
        }
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
        } else {
            new c(context, i, (HomeLocationResult) null).b();
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
        if (f12295a == null) {
            String a2 = com.taobao.homepage.business.permission.c.a("editionTipsIsShown", "");
            if (!StringUtils.isEmpty(a2)) {
                f12295a = JSON.parseObject(a2);
            }
        }
        JSONObject jSONObject = f12295a;
        if (jSONObject != null && jSONObject.get(str) != null) {
            return Boolean.valueOf(f12295a.get(str).toString()).booleanValue();
        }
        return false;
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        if (f12295a == null) {
            f12295a = new JSONObject();
        }
        f12295a.put(str, (Object) Boolean.valueOf(z));
        com.taobao.homepage.business.permission.c.b("editionTipsIsShown", f12295a.toJSONString());
    }
}
