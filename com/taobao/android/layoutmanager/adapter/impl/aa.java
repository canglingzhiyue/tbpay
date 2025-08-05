package com.taobao.android.layoutmanager.adapter.impl;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ghi;
import tb.ghm;
import tb.ghp;
import tb.kge;

/* loaded from: classes5.dex */
public class aa implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2023418747);
        kge.a(1351616620);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.r
    public double a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d644e", new Object[]{this, context})).doubleValue();
        }
        return 1.0d;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.r
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : com.taobao.android.tbelder.b.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.r
    public String b() {
        ghp queryCurrentVersionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        ghm ghmVar = (ghm) ghi.a(ghm.class);
        if (ghmVar != null && (queryCurrentVersionInfo = ghmVar.queryCurrentVersionInfo()) != null) {
            return queryCurrentVersionInfo.c;
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.r
    public Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : a((ghp) null);
    }

    public static Map a(ghp ghpVar) {
        ghm ghmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e990b3e", new Object[]{ghpVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (ghpVar == null && (ghmVar = (ghm) ghi.a(ghm.class)) != null) {
            ghpVar = ghmVar.queryCurrentVersionInfo();
        }
        if (ghpVar != null) {
            jSONObject.put((JSONObject) "dataVersion", ghpVar.f28334a);
            jSONObject.put((JSONObject) "versionCode", ghpVar.c);
            jSONObject.put((JSONObject) "activeType", ghpVar.d);
            jSONObject.put((JSONObject) "groupCode", ghpVar.b);
            jSONObject.put((JSONObject) "bizParams", (String) ghpVar.e);
        }
        return jSONObject;
    }
}
