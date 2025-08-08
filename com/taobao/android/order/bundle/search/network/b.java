package com.taobao.android.order.bundle.search.network;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f14569a;

    static {
        kge.a(-1917820431);
        f14569a = b.class.getSimpleName();
    }

    public static MtopRequest a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("6be5c6b4", new Object[]{str, str2, map});
        }
        if (StringUtils.isEmpty(str)) {
            hyn.a(f14569a, "getMtopRequest empty", "apiName is null");
            return null;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        if (map != null && !map.isEmpty()) {
            mtopRequest.setData(JSONObject.toJSONString(map));
        }
        String str3 = f14569a;
        hyn.a(str3, "getMtopRequest", "mtopRequest:" + mtopRequest.toString());
        return mtopRequest;
    }
}
