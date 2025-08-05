package com.taobao.order.downgrade.detail;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.hyk;
import tb.hyq;
import tb.kge;

/* loaded from: classes.dex */
public class a implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.order.bundle.nav.c<Intent> f18615a = new com.taobao.android.order.bundle.nav.c<>();
    public com.taobao.android.order.bundle.nav.c<Intent> b = new com.taobao.android.order.bundle.nav.c<>();

    static {
        kge.a(1782413202);
        kge.a(-234059470);
    }

    public a() {
        this.f18615a.a(new com.taobao.android.order.bundle.nav.detail.g(), new com.taobao.android.order.bundle.nav.detail.e(), new com.taobao.android.order.bundle.nav.detail.b(), new com.taobao.android.order.bundle.nav.detail.d(), new com.taobao.android.order.bundle.nav.detail.c());
        this.b.a(new com.taobao.android.order.bundle.nav.list.f(), new com.taobao.android.order.bundle.nav.list.d(), new com.taobao.android.order.bundle.nav.list.a(), new com.taobao.android.order.bundle.nav.list.b());
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        if (hyk.n()) {
            this.f18615a.a((com.taobao.android.order.bundle.nav.c<Intent>) intent);
        }
        if (hyk.B()) {
            this.b.a((com.taobao.android.order.bundle.nav.c<Intent>) intent);
        }
        hyq.a(null, "NavOrderSwitchProcessor", "", null);
        return true;
    }
}
