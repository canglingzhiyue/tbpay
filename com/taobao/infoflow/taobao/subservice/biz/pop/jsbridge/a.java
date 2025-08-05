package com.taobao.infoflow.taobao.subservice.biz.pop.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import tb.kge;
import tb.kyu;

/* loaded from: classes7.dex */
public class a implements IJsBridgeService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final kyu f17495a;

    static {
        kge.a(1578526795);
        kge.a(-691738948);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "IFPop.popClickEvent";
    }

    public a(kyu kyuVar) {
        this.f17495a = kyuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            interfaceC0670a.a("bridge params is empty");
        } else {
            a(jSONObject.getInteger("eventType").intValue(), jSONObject, interfaceC0670a);
        }
    }

    public void a(int i, JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9e99fd", new Object[]{this, new Integer(i), jSONObject, interfaceC0670a});
            return;
        }
        String string = jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID);
        if (TextUtils.isEmpty(string)) {
            interfaceC0670a.a("businessId is empty");
            return;
        }
        IPopData a2 = this.f17495a.a(string);
        if (a2 == null) {
            interfaceC0670a.a("pop data is empty");
            return;
        }
        a(a2, jSONObject);
        try {
            com.taobao.homepage.pop.utils.c.b("PopClickEventJsBridge ", "==== popClick, type=" + i);
            this.f17495a.a(i, string);
        } catch (Throwable th) {
            com.taobao.homepage.pop.utils.c.a("PopClickEventJsBridge ", th);
        }
    }

    private void a(IPopData iPopData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0d3718", new Object[]{this, iPopData, jSONObject});
            return;
        }
        JSONObject clientParams = iPopData.getClientParams();
        if (jSONObject.containsKey("selectedIDList")) {
            clientParams.put(PopConst.POP_KEY_TAG_IDS, jSONObject.get("selectedIDList"));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(PopConst.POP_CLIENT_PARAMS_KEY);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return;
        }
        clientParams.putAll(jSONObject2);
    }
}
