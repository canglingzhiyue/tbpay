package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements IJsBridgeService.a.InterfaceC0670a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WVCallBackContext f17440a;

    static {
        kge.a(-1186463396);
        kge.a(1769800630);
    }

    public b(WVCallBackContext wVCallBackContext) {
        this.f17440a = wVCallBackContext;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.InterfaceC0670a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str);
            str = jSONObject.toJSONString();
        }
        this.f17440a.error(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.InterfaceC0670a
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            this.f17440a.success();
        } else {
            this.f17440a.success(b(map));
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
}
