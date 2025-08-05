package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;

/* loaded from: classes4.dex */
public class h implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final i<g> f12722a;

    @Override // com.taobao.phenix.intf.event.a
    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
    }

    public h(i<g> iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("aliImageListener must not be null.");
        }
        this.f12722a = iVar;
    }

    public boolean a(FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue() : this.f12722a.a(new w(failPhenixEvent));
    }
}
