package com.taobao.android.purchase.aura.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bau;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1709734919);
    }

    public static String a(MtopResponse mtopResponse) {
        List<String> list;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse});
        } else if (mtopResponse == null) {
            return null;
        } else {
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            if (bau.a(headerFields) || (list = headerFields.get("eagleeye-traceid")) == null || list.size() != 1) {
                return null;
            }
            obj = list.get(0);
        }
        return (String) obj;
    }
}
