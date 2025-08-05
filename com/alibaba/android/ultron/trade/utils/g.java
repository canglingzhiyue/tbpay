package com.alibaba.android.ultron.trade.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes2.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1346884929);
    }

    public static String a(MtopResponse mtopResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse}) : (mtopResponse == null || mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("mtop-buytraceid")) == null || list.isEmpty()) ? "" : list.get(0);
    }
}
