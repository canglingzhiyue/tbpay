package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"setPrivacyProfile"})
/* loaded from: classes3.dex */
public class j extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        Map<String, Object> b = com.alibaba.wireless.aliprivacyext.f.b((Object) str2);
        if (b == null) {
            b(bVar, "参数异常", null);
            return true;
        }
        Iterator<Map.Entry<String, Object>> it = b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            if (!com.alibaba.wireless.aliprivacyext.recommendation.b.a(context, next.getKey(), (String) next.getValue())) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", "false");
                a(bVar, "调用成功", hashMap);
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("result", "true");
        a(bVar, "调用成功", hashMap2);
        return true;
    }
}
