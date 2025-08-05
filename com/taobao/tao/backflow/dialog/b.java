package com.taobao.tao.backflow.dialog;

import android.app.Dialog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import tb.kge;
import tb.njr;
import tb.nyy;

/* loaded from: classes8.dex */
public class b implements njr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Dialog f19853a;

    static {
        kge.a(-1571134362);
        kge.a(1885639559);
    }

    @Override // tb.njr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PopStrategy.IDENTIFIER_TAO_PASSWORD;
    }

    @Override // tb.njr
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.njr
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public b(Dialog dialog) {
        this.f19853a = dialog;
    }

    @Override // tb.njr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        nyy.a("TaoPasswordPopOperation#show");
        Dialog dialog = this.f19853a;
        if (dialog == null) {
            return;
        }
        dialog.show();
    }
}
