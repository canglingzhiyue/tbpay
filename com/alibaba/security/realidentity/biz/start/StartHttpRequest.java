package com.alibaba.security.realidentity.biz.start;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.common.http.model.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StartHttpRequest extends HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "extendMap")
    public String extendMap;

    public StartHttpRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String apiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3948e054", new Object[]{this}) : "mtop.verifycenter.rp.start";
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public Class classType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ac7cbb06", new Object[]{this}) : StartHttpResponse.class;
    }
}
