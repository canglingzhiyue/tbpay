package com.taobao.infoflow.taobao.subservice.biz.pop.jsbridge;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.HashMap;
import tb.kge;
import tb.kyu;

/* loaded from: classes7.dex */
public class b implements IJsBridgeService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_NAME = "IFPop.fetchPopData";

    /* renamed from: a  reason: collision with root package name */
    private kyu f17496a;

    static {
        kge.a(544997187);
        kge.a(-691738948);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : FEATURE_NAME;
    }

    public b(kyu kyuVar) {
        this.f17496a = kyuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            interfaceC0670a.a("bridge params is empty");
        } else {
            String string = jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID);
            if (StringUtils.isEmpty(string)) {
                interfaceC0670a.a("businessId is empty");
                return;
            }
            IPopData a2 = this.f17496a.a(string);
            if (a2 == null) {
                interfaceC0670a.a("pop data is empty");
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("data", JSON.toJSONString(a2));
            interfaceC0670a.a(hashMap);
        }
    }
}
