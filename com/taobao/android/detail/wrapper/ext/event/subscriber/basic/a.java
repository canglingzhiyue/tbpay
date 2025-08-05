package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import tb.emu;
import tb.enq;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements j<enq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11270a;

    static {
        kge.a(-486286379);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(enq enqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enqVar}) : a(enqVar);
    }

    public a(DetailCoreActivity detailCoreActivity) {
        this.f11270a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.GoBackSubscriber");
    }

    public com.taobao.android.trade.event.i a(enq enqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("e22b3e3f", new Object[]{this, enqVar});
        }
        if (!this.f11270a.y().a(4, (KeyEvent) null)) {
            this.f11270a.W();
        }
        return null;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
