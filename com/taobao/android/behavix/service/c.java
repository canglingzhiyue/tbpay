package com.taobao.android.behavix.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.android.behavix.utils.g;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f9206a;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f9207a;

        static {
            kge.a(1767267154);
            f9207a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("477a27ed", new Object[0]) : f9207a;
        }
    }

    static {
        kge.a(1872334975);
        f9206a = null;
    }

    private c() {
    }

    public static final c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("477a27ed", new Object[0]) : a.a();
    }

    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        JSONArray b = b(str, str2, str3);
        return b == null || !g.a(b);
    }

    public synchronized JSONArray b(String str, String str2, String str3) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("23ac9c57", new Object[]{this, str, str2, str3});
        }
        JSONArray jSONArray = new JSONArray();
        if (f9206a == null || f9206a.isEmpty()) {
            f9206a = BHXCXXInnerBridge.getMatchConditionConfig();
        }
        JSONObject jSONObject5 = null;
        if (f9206a == null || f9206a.isEmpty()) {
            return null;
        }
        try {
            jSONObject = f9206a.getJSONObject("node").getJSONObject(str2);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return jSONArray;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject(str).getJSONObject(str3);
        } catch (Throwable unused2) {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            a(jSONArray, jSONObject2);
        }
        try {
            jSONObject3 = jSONObject.getJSONObject(str).getJSONObject("*");
        } catch (Throwable unused3) {
            jSONObject3 = null;
        }
        if (jSONObject3 != null) {
            a(jSONArray, jSONObject3);
        }
        try {
            jSONObject4 = jSONObject.getJSONObject("*").getJSONObject(str3);
        } catch (Throwable unused4) {
            jSONObject4 = null;
        }
        if (jSONObject4 != null) {
            a(jSONArray, jSONObject4);
        }
        try {
            jSONObject5 = jSONObject.getJSONObject("*").getJSONObject("*");
        } catch (Throwable unused5) {
        }
        if (jSONObject5 != null) {
            a(jSONArray, jSONObject5);
        }
        return jSONArray;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48168760", new Object[]{this, jSONArray, jSONObject});
        } else if (jSONObject != null && (jSONArray2 = jSONObject.getJSONArray("eventMatchResult")) != null && jSONArray2.size() > 0) {
            for (int i = 0; i < jSONArray2.size(); i++) {
                jSONArray.add(jSONArray2.getString(i));
            }
        }
    }
}
