package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* loaded from: classes4.dex */
public class m implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final i<l> f14226a;

    @Override // com.taobao.phenix.intf.event.a
    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
    }

    public m(i<l> iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("aliImageListener must not be null.");
        }
        this.f14226a = iVar;
    }

    public boolean a(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue() : this.f14226a.a(new ae(succPhenixEvent));
    }
}
