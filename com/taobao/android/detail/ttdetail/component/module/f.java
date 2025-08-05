package com.taobao.android.detail.ttdetail.component.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;

/* loaded from: classes4.dex */
public class f implements ObserverFrameLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10542a;

    public f(e eVar) {
        this.f10542a = eVar;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        e eVar = this.f10542a;
        if (e.$ipChange == i) {
            return;
        }
        e.a(this.f10542a, i);
        this.f10542a.updateComponent();
    }
}
