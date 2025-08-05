package com.loc;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    bo f7675a;

    public b(Context context) {
        this.f7675a = null;
        try {
            q.a().a(context);
        } catch (Throwable unused) {
        }
        this.f7675a = bo.a();
    }

    private String a(Context context, String str, Map<String, String> map) {
        try {
            HashMap hashMap = new HashMap(16);
            fl flVar = new fl();
            hashMap.clear();
            hashMap.put("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
            hashMap.put("Connection", "Keep-Alive");
            hashMap.put(HttpConstant.USER_AGENT, "AMAP_Location_SDK_Android 6.2.0");
            String a2 = n.a();
            String a3 = n.a(context, a2, x.b(map));
            map.put("ts", a2);
            map.put("scode", a3);
            flVar.b(map);
            flVar.a((Map<String, String>) hashMap);
            flVar.b(str);
            flVar.a(v.a(context));
            flVar.a(fr.i);
            flVar.b(fr.i);
            return new String(bo.a(flVar).f7708a, "utf-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Map<String, String> b(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashMap hashMap = new HashMap(16);
        hashMap.put("key", l.f(context));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("keywords", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("types", str2);
        }
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            hashMap.put("location", str6 + "," + str5);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("city", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("offset", str4);
        }
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("radius", str7);
        }
        return hashMap;
    }

    public final String a(Context context, String str, String str2) {
        Map<String, String> b = b(context, str2, null, null, null, null, null, null);
        b.put("extensions", "all");
        b.put("subdistrict", "0");
        return a(context, str, b);
    }

    public final String a(Context context, String str, String str2, String str3, String str4, String str5) {
        Map<String, String> b = b(context, str2, str3, str4, str5, null, null, null);
        b.put("children", "1");
        b.put("page", "1");
        b.put("extensions", "base");
        return a(context, str, b);
    }

    public final String a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Map<String, String> b = b(context, str2, str3, null, str4, str5, str6, str7);
        b.put("children", "1");
        b.put("page", "1");
        b.put("extensions", "base");
        return a(context, str, b);
    }
}
