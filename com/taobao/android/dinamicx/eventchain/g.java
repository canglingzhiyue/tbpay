package com.taobao.android.dinamicx.eventchain;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXWidgetNode f11854a;

    static {
        kge.a(-1089467718);
    }

    public DXWidgetNode a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("d7f6b987", new Object[]{this}) : this.f11854a;
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else {
            this.f11854a = dXWidgetNode;
        }
    }
}
