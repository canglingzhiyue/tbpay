package com.taobao.android.tbsku.bizevent;

import com.android.alibaba.ip.runtime.IpChange;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class f implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_loading";

    static {
        kge.a(1470064406);
        kge.a(-1413102650);
    }

    @Override // tb.iyd
    public void a(iye iyeVar, iyb iybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
            return;
        }
        com.taobao.android.sku.c b = iybVar.b();
        if (b == null) {
            return;
        }
        b.w();
    }
}
