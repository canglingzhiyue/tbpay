package com.alibaba.triver.triver_shop.newShop.view.provider;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public /* synthetic */ class RemoteClassDelegateContentRender$2 extends FunctionReferenceImpl implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RemoteClassDelegateContentRender$2(d dVar) {
        super(0, dVar, d.class, "remoteClassInitFailed", "remoteClassInitFailed()V", 0);
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
            d.i((d) this.receiver);
        }
    }
}
