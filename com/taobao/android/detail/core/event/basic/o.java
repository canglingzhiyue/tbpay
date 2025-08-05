package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class o extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.detail.core.event.params.c f9711a;

    static {
        kge.a(-829543236);
    }

    public o(com.taobao.android.detail.core.event.params.c cVar) {
        this.f9711a = cVar;
        emu.a("com.taobao.android.detail.core.event.basic.PopPicGalleryEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9711a;
    }
}
