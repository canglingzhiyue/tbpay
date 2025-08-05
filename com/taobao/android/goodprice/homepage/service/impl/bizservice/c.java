package com.taobao.android.goodprice.homepage.service.impl.bizservice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1653711633);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        String c = c(str);
        if (a(c)) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("bxFeature", c);
        return hashMap;
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        try {
            BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
            return BUFS.getFeature(queryArgs, "goodprice.home.request." + str, "GoodPrice", "Page_Home");
        } catch (InfoFlowRuntimeException unused) {
            return null;
        }
    }
}
