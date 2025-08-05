package com.alipay.mobile.security.bio.service.local.rpc;

import com.alipay.mobile.security.bio.service.local.LocalService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BioRPCService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void addRequestHeaders(Object obj, Map<String, String> map);

    public abstract <T> T getRpcProxy(Class<T> cls);

    public void setExtProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5addec", new Object[]{this, map});
        }
    }

    public abstract void setRegion(Object obj, String str);

    public abstract void setRemoteUrl(String str);
}
