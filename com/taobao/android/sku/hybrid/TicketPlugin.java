package com.taobao.android.sku.hybrid;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.hybrid.c;
import com.taobao.android.sku.utils.k;
import tb.kge;

/* loaded from: classes6.dex */
public class TicketPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "TBDetailTicketSkuView";

    static {
        kge.a(135097997);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        c.a a2 = c.a();
        if (a2 == null || a2.f15181a != null || !"doBuy".equals(str)) {
            return false;
        }
        f fVar = a2.f15181a;
        fVar.a(5, k.a(str2));
        fVar.a(3, null);
        return true;
    }
}
