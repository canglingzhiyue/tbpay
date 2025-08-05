package com.taobao.android.goodprice.homepage.service.impl.bizservice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b = 0;

    static {
        kge.a(1313381708);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Map<String, String> a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a46a79db", new Object[]{this, new Long(j), str});
        }
        String a2 = a(j);
        if (a(a2)) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("zeroRefreshBXFeature", a2);
        hashMap.put("zeroRefreshBeginCode", str);
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        this.b = i + 1;
        sb.append(i);
        sb.append("");
        hashMap.put("searchBackSeq", sb.toString());
        return hashMap;
    }

    private String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        try {
            BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
            queryArgs.setStartTime(j);
            return BUFS.getFeature(queryArgs, "goodprice.home.request.PageBack.zeroRefresh", "GoodPrice", "Page_Home");
        } catch (InfoFlowRuntimeException unused) {
            return null;
        }
    }
}
