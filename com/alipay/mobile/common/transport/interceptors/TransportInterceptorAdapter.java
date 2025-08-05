package com.alipay.mobile.common.transport.interceptors;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class TransportInterceptorAdapter implements TransportInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.interceptors.TransportInterceptor
    public void preRequestInterceptor(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17d505b", new Object[]{this, str, map});
        }
    }
}
