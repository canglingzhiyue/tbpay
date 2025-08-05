package com.taobao.android.detail.wrapper.ext.provider.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ehq;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements ehq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1183754171);
        kge.a(-2016906842);
    }

    public b() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.IResDependProvider");
    }

    @Override // tb.ehq
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.drawable.uik_error_icon;
    }
}
