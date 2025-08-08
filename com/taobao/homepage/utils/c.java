package com.taobao.homepage.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ksp;
import tb.lap;
import tb.oqc;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, JSONObject> f17282a;

    static {
        kge.a(-89005825);
        f17282a = new HashMap(4);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            final JSONObject jSONObject = f17282a.get(str);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put(str2, (Object) str3);
            f17282a.put(str, jSONObject);
            final String str4 = "bizParams_" + str;
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.homepage.utils.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.homepage.business.permission.c.b(str4, jSONObject.toString());
                    }
                }
            });
        }
    }

    public static void a(String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            final String str2 = "bizParams_" + str;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            f17282a.put(str, jSONObject);
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.homepage.utils.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.homepage.business.permission.c.b(str2, jSONObject.toString());
                    lap.a("TopTabBar", "saveTabParams", "BizParamsPersistenceUtils.saveBizParams; saveKey:" + str2 + ";params:" + jSONObject.toString());
                }
            });
        }
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = f17282a.get(str);
            if (jSONObject != null) {
                return jSONObject;
            }
            String a2 = com.taobao.homepage.business.permission.c.a("bizParams_" + str, (String) null);
            if (a2 == null) {
                return null;
            }
            JSONObject parseObject = JSON.parseObject(a2);
            f17282a.put(str, parseObject);
            return parseObject;
        } catch (Throwable th) {
            ksp.c("BizParamsPersistenceUtils", "getBizParams error : " + th.getMessage());
            return null;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            a(oqc.a().m(), str, " ");
        }
    }
}
