package com.taobao.homepage.view.manager.searchbar.impl.searchview;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;
import tb.kge;
import tb.ovr;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1290257807);
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        List<String> F = com.taobao.tao.topmultitab.c.a().F();
        if (F == null || F.isEmpty() || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null) {
            return jSONObject;
        }
        for (String str : F) {
            a(jSONObject2, str);
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        String b = ovr.b(str);
        if (!jSONObject.containsKey(b)) {
            a(b);
            return;
        }
        JSONObject a2 = a(b);
        if (a2 == null) {
            return;
        }
        jSONObject.put(b, (Object) a2);
    }

    private JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        IHomeSubTabController b = com.taobao.tao.topmultitab.c.a().b(str);
        if (b != null) {
            return b.getSubTabSearchBarData();
        }
        return null;
    }
}
