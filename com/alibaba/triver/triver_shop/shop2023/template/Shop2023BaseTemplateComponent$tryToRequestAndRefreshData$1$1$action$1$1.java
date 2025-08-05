package com.alibaba.triver.triver_shop.shop2023.template;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public /* synthetic */ class Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1$1 extends FunctionReferenceImpl implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1$1(a aVar) {
        super(0, aVar, a.class, "onRootViewAppear", "onRootViewAppear()V", 0);
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            ((a) this.receiver).k();
        }
    }
}
