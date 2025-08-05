package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.dai.adapter.MRTTaobaoAdapter;

/* loaded from: classes3.dex */
public class S implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ T f3273a;

    public S(T t) {
        this.f3273a = t;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        T t = this.f3273a;
        MNNCV.init(T.$ipChange);
        T t2 = this.f3273a;
        Context context = T.$ipChange;
        T t3 = this.f3273a;
        MRTTaobaoAdapter.startMNNRuntime(context, T.$ipChange, null);
    }
}
