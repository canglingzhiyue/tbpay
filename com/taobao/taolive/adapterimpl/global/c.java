package com.taobao.taolive.adapterimpl.global;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.cgt;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements cgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-589873617);
        kge.a(376834857);
    }

    @Override // tb.cgt
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.style.tb_impl_dialog;
    }
}
