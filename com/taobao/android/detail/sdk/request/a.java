package com.taobao.android.detail.sdk.request;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, Integer> m;

    static {
        kge.a(495031347);
        HashMap<String, Integer> hashMap = new HashMap<>();
        m = hashMap;
        hashMap.put("sm_recommend", 1);
        m.put("sm_promotion", 2);
        m.put("sm_best_selling", 3);
        m.put("sm_poi", 4);
        m.put("isvCustomGetUrl", 5);
        tpc.a("com.taobao.android.detail.sdk.request.DataSourceDefs");
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        Integer num = m.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
