package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public /* synthetic */ class Tab3LiveContentRender$doLiveRoomInit$3 extends FunctionReferenceImpl implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Tab3LiveContentRender$doLiveRoomInit$3(Tab3LiveContentRender tab3LiveContentRender) {
        super(0, tab3LiveContentRender, Tab3LiveContentRender.class, "callReportLiveRoom", "callReportLiveRoom()V", 0);
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
            Tab3LiveContentRender.d((Tab3LiveContentRender) this.receiver);
        }
    }
}
