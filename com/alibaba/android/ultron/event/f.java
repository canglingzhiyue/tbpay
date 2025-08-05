package com.alibaba.android.ultron.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bga;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(57860552);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            eVar.h().e();
        } catch (Throwable th) {
            UnifyLog.d("CommonLoadingSubscriber", th.toString());
            bga.a.a(this.f == null ? "Ultron" : this.f.h(), "CommonLoadingSubscriber", th);
        }
    }
}
