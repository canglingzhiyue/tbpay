package com.alibaba.security.realidentity.biz.dynamic;

import android.text.TextUtils;
import com.alibaba.security.common.http.model.HttpResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DynamicHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String result;

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.result);
    }
}
