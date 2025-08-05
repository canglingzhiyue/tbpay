package com.taobao.taolive.adapterimpl.msg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import tb.kge;
import tb.pnr;

/* loaded from: classes8.dex */
public class b implements pnr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pnr f21381a;

    static {
        kge.a(1374095642);
        kge.a(-593771168);
    }

    public void a(pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f6a024", new Object[]{this, pnrVar});
        } else {
            this.f21381a = pnrVar;
        }
    }

    @Override // tb.pnr
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
            return;
        }
        pnr pnrVar = this.f21381a;
        if (pnrVar == null) {
            return;
        }
        pnrVar.a(tLiveMsg);
    }

    @Override // tb.pnr
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        pnr pnrVar = this.f21381a;
        if (pnrVar == null) {
            return;
        }
        pnrVar.a(i, obj);
    }
}
