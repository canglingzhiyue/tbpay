package com.taobao.infoflow.jsbridge.impl.bridge.model;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.lji;

/* loaded from: classes7.dex */
public class b implements lji.a.InterfaceC1153a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WVCallBackContext f17407a;

    static {
        kge.a(2000307048);
        kge.a(1300627736);
    }

    public b(WVCallBackContext wVCallBackContext) {
        this.f17407a = wVCallBackContext;
    }

    @Override // tb.lji.a.InterfaceC1153a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str);
            str = jSONObject.toJSONString();
        }
        this.f17407a.error(str);
    }

    @Override // tb.lji.a.InterfaceC1153a
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            this.f17407a.success();
        } else {
            this.f17407a.success(b(map));
        }
    }

    @Override // tb.lji.a.InterfaceC1153a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(c(str));
        }
    }

    private r b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("7d0b1f30", new Object[]{this, map});
        }
        r rVar = new r();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            rVar.a(entry.getKey(), entry.getValue());
        }
        return rVar;
    }

    private Map<String, Object> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", str);
        return hashMap;
    }
}
