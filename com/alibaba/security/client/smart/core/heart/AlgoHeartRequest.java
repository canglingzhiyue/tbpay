package com.alibaba.security.client.smart.core.heart;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.InterfaceC1229m;

@InterfaceC1229m(apiName = "mtop.alibaba.ccrc.sdk.heartbeat")
/* loaded from: classes3.dex */
public class AlgoHeartRequest extends BaseRequest {
    public String algoList;
    public String dataId;
    public long ts;

    public AlgoHeartRequest(String str) {
        super(str);
    }
}
