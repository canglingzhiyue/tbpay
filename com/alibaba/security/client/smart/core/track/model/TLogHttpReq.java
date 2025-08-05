package com.alibaba.security.client.smart.core.track.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.InterfaceC1229m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

@InterfaceC1229m(apiName = "mtop.alibaba.ccrc.sdk.logs.report", intercept = true, responseType = Object.class)
/* loaded from: classes3.dex */
public class TLogHttpReq extends BaseRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(serialize = false)
    public List<String> ccrcCodes;
    public String logs;
    public long ts;

    public TLogHttpReq() {
        super(null);
        this.ts = System.currentTimeMillis();
        this.ccrcCodes = new ArrayList();
    }

    @Override // com.alibaba.security.ccrc.common.http.model.BaseRequest
    public List<String> ccrcCodes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8cfad4ab", new Object[]{this}) : this.ccrcCodes;
    }
}
