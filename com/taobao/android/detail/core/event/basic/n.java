package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class n extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MultiMediaModel f9710a;

    static {
        kge.a(-1414859047);
    }

    public n(MultiMediaModel multiMediaModel) {
        this.f9710a = multiMediaModel;
        emu.a("com.taobao.android.detail.core.event.basic.PopMultiMediaEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9710a;
    }
}
