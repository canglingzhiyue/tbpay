package com.taobao.android.detail.core.detail.controller.stay;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9469a;
    private com.taobao.android.detail.datasdk.model.viewmodel.main.b b;
    private View c;

    static {
        kge.a(-1658443677);
    }

    public b(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar, View view) {
        this.b = bVar;
        this.c = view;
        emu.a("com.taobao.android.detail.core.detail.controller.stay.StayInfo");
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }
}
