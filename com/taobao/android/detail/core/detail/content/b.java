package com.taobao.android.detail.core.detail.content;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f9446a;

    static {
        kge.a(-775735716);
    }

    public b(Object[] objArr) {
        this.f9446a = objArr;
        emu.a("com.taobao.android.detail.core.detail.content.ContentDXEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9446a;
    }
}
