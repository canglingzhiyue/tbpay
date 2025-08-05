package com.alibaba.security.realidentity.biz.biometrics;

import com.alibaba.security.common.http.model.HttpResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class EventHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> result;

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        Map<String, Object> map = this.result;
        return map != null && !map.isEmpty();
    }
}
