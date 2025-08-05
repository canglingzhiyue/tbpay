package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import android.support.v4.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.wrapper.fragment.weex.DetailWeexFragment;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.taobao.R;
import tb.edm;
import tb.eei;
import tb.ehu;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class i extends eei<edm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11282a;
    private DetailWeexFragment b;
    private float c = -1.0f;

    static {
        kge.a(-2018014422);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.event.subscriber.basic.SwitchWeexPageSubscriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((edm) event);
    }

    public i(DetailCoreActivity detailCoreActivity) {
        this.f11282a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.SwitchWeexPageSubscriber");
    }

    public com.taobao.android.trade.event.i a(edm edmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("c651d205", new Object[]{this, edmVar});
        }
        int i = edmVar.f27211a;
        if (i == 1) {
            a();
        } else if (i == 2) {
            b();
        }
        return com.taobao.android.trade.event.i.SUCCESS;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = new DetailWeexFragment();
        }
        FragmentTransaction beginTransaction = this.f11282a.getSupportFragmentManager().beginTransaction();
        if (this.b.isAdded()) {
            beginTransaction.show(this.b);
        } else {
            beginTransaction.add(R.id.fl_detail_fragment, this.b);
            beginTransaction.addToBackStack(null);
        }
        a(false);
        beginTransaction.commit();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
        } else {
            FragmentTransaction beginTransaction = this.f11282a.getSupportFragmentManager().beginTransaction();
            if (this.b.isAdded()) {
                beginTransaction.hide(this.b);
            }
            a(true);
            beginTransaction.commit();
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f11282a;
        if (detailCoreActivity == null || detailCoreActivity.Y()) {
            return;
        }
        if (!z) {
            ehu r = this.f11282a.r();
            if (r == null) {
                return;
            }
            this.c = r.getTransparency();
            r.setTransparency(1.0f);
            return;
        }
        ehu r2 = this.f11282a.r();
        if (r2 == null) {
            return;
        }
        float f = this.c;
        if (f < 0.0f) {
            return;
        }
        r2.setTransparency(f);
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
