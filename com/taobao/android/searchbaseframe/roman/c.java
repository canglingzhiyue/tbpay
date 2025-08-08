package com.taobao.android.searchbaseframe.roman;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f15003a;
    private d b;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f15004a;

        static {
            kge.a(1533905002);
            f15004a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ea26e35a", new Object[0]) : f15004a;
        }
    }

    static {
        kge.a(-1536500794);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ea26e35a", new Object[0]) : a.a();
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String b = b(str, str2);
        return StringUtils.isEmpty(b) ? a(str) : b;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            hashMap.put(entry.getKey(), com.taobao.android.searchbaseframe.util.e.a(jSONObject2.getString("url"), jSONObject2.getInteger("version")));
        }
        this.b.a(hashMap);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        com.taobao.android.searchbaseframe.util.e<String, Integer> a2 = com.taobao.android.searchbaseframe.roman.a.a(str);
        if (a2 != null) {
            a(str, "fallback", a2.b.intValue());
            return a2.f15014a;
        }
        a(str, "fail", -1);
        return null;
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        com.taobao.android.searchbaseframe.util.e<String, Integer> a2 = this.f15003a.a(str, str2);
        com.taobao.android.searchbaseframe.util.e<String, Integer> a3 = this.b.a(str);
        if (a2 == null && a3 == null) {
            return null;
        }
        if (a2 == null) {
            a(str, WXStorageModule.NAME, a3.b.intValue());
            return a3.f15014a;
        } else if (a3 == null) {
            a(str, "orange", a2.b.intValue());
            return a2.f15014a;
        } else if (a2.b.intValue() >= a3.b.intValue()) {
            a(str, "orange", a2.b.intValue());
            return a2.f15014a;
        } else {
            a(str, WXStorageModule.NAME, a3.b.intValue());
            return a3.f15014a;
        }
    }

    private void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageKey", (Object) str);
        jSONObject.put("configSource", (Object) str2);
        jSONObject.put("configVersion", (Object) String.valueOf(i));
        AppMonitor.Counter.commit("tbsearch", "roman_page_version", jSONObject.toString(), 1.0d);
    }

    private c() {
        this.f15003a = new b();
        this.b = new d();
    }
}
