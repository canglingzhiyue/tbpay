package com.alibaba.security.realidentity.biz.biometrics;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.common.http.model.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class EventRequest extends HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String eventCode;
    public String eventData;
    public String name;
    @JSONField(serialize = false)
    public boolean sessionless;

    public EventRequest(String str, String str2, boolean z) {
        super(str, str2);
        this.sessionless = z;
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String apiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3948e054", new Object[]{this}) : !this.sessionless ? "mtop.verifycenter.rp.event" : "mtop.verifycenter.rp.event.sessionless";
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public Class classType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ac7cbb06", new Object[]{this}) : EventHttpResponse.class;
    }
}
