package com.alibaba.security.realidentity.biz.dynamic;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.common.http.model.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DynamicHttpRequest extends HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "keys")
    public String keys;

    public DynamicHttpRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String apiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3948e054", new Object[]{this}) : "mtop.verifycenter.rp.getwirelessconf";
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public Class classType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ac7cbb06", new Object[]{this}) : DynamicHttpResponse.class;
    }
}
