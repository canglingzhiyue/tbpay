package com.taobao.android.fluid.framework.card.cards.video.manager;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.psw;
import tb.shm;
import tb.sii;

/* loaded from: classes5.dex */
public class b extends shm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sii f12497a;

    static {
        kge.a(-1522790034);
    }

    @Override // tb.shm.a, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        }
    }

    public b(sii siiVar) {
        this.f12497a = siiVar;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f12497a.t().addCardLifecycleListener(this);
        }
    }
}
