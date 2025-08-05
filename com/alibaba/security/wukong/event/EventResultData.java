package com.alibaba.security.wukong.event;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.InterfaceC1229m;

@InterfaceC1229m(apiName = "mtop.alibaba.ccrc.sdk.event.resultv2", intercept = true)
/* loaded from: classes3.dex */
public class EventResultData extends BaseRequest {
    public String eventData;
    public long ts;
    public int type;

    public EventResultData(String str) {
        super(str);
    }
}
