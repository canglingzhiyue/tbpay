package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class p extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9712a;
    public String b;
    public com.taobao.android.detail.core.event.params.d c;
    public OpenSkuEvent e;
    public String i;
    public String j;
    public boolean d = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    static {
        kge.a(864919849);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public p() {
        emu.a("com.taobao.android.detail.core.event.basic.RefreshDetailEvent");
    }
}
