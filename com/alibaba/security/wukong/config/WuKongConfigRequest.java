package com.alibaba.security.wukong.config;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.service.build.InterfaceC1229m;

@InterfaceC1229m(apiName = "mtop.alibaba.ccrc.sdk.conf.fetchv2", intercept = false, responseType = WuKongConfigData.class)
/* loaded from: classes3.dex */
public class WuKongConfigRequest extends BaseRequest {
    public boolean clientSupDec;
    public String confInfo;
    public String confType;
    public long ts;

    public WuKongConfigRequest(String str) {
        super(str);
    }
}
