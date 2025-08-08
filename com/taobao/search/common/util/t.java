package com.taobao.search.common.util;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class t implements com.taobao.search.rainbow.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1210679111);
        kge.a(-220369617);
    }

    @Override // com.taobao.search.rainbow.c
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            AppMonitor.Counter.commit("tbsearch", "rainbow", b(str, str2), 1.0d);
        }
    }

    @Override // com.taobao.search.rainbow.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sversion", (Object) noa.SERVER_VERSION_VALUE);
        jSONObject.put("configVersion", (Object) str);
        AppMonitor.Counter.commit("tbsearch", "rainbowVersion", jSONObject.toString(), 1.0d);
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "_default_";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("testName", (Object) str);
        jSONObject.put("testValue", (Object) str2);
        jSONObject.put("sversion", (Object) noa.SERVER_VERSION_VALUE);
        return jSONObject.toString();
    }
}
