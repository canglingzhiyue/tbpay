package com.alibaba.security.client.smart.core.heart;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.InterfaceC1229m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@InterfaceC1229m(apiName = "mtop.alibaba.lrc.sdk.heartbeat")
/* loaded from: classes3.dex */
public class LrcAlgoHeartRequest extends BaseRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, Object> mRequestMap;

    public LrcAlgoHeartRequest(String str, Map<String, Object> map) {
        super(str);
        this.mRequestMap = map;
    }

    @Override // com.alibaba.security.ccrc.common.http.model.BaseRequest
    public String body() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("270aae97", new Object[]{this}) : JsonUtils.toJSONString(this.mRequestMap);
    }
}
