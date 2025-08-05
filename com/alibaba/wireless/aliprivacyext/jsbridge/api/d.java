package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"pasteboardAuthStatus"})
/* loaded from: classes3.dex */
public class d extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        boolean a2 = com.alibaba.wireless.aliprivacy.b.a(context);
        HashMap hashMap = new HashMap();
        hashMap.put("status", Integer.valueOf(a2 ? 1 : 0));
        a(bVar, "调用成功", hashMap);
        return true;
    }
}
