package com.alipay.android.msp.plugin;

import com.alipay.android.app.render.api.result.RenderStatistic;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RenderTime {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RenderStatistic f4953a = new RenderStatistic();

    public long getDownloadTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5fc34e6", new Object[]{this})).longValue() : this.f4953a.getDownloadTime();
    }

    public long getParseTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("12cd80e5", new Object[]{this})).longValue() : this.f4953a.getParseTime();
    }

    public long getRenderTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4212574", new Object[]{this})).longValue() : this.f4953a.getRenderTime();
    }

    public RenderStatistic getInnerStatistic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderStatistic) ipChange.ipc$dispatch("ef789f3d", new Object[]{this}) : this.f4953a;
    }
}
