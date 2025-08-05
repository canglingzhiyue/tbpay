package com.taobao.android.tbabilitykit.weex.pop.render;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements IWXComputeScreenAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Rect f15369a = new Rect();

    static {
        kge.a(340905421);
        kge.a(1488373307);
    }

    @Override // com.taobao.weex.adapter.IWXComputeScreenAdapter
    public Rect computeCurrentScreenMetrics() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this}) : this.f15369a;
    }
}
