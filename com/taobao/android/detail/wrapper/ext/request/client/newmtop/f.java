package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1239263591);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.TraceIdUtils");
    }

    public static String a(MtopResponse mtopResponse) {
        List<String> list;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse});
        } else if (mtopResponse == null || mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) == null || list.isEmpty()) {
            return "";
        } else {
            obj = list.get(0);
        }
        return (String) obj;
    }
}
