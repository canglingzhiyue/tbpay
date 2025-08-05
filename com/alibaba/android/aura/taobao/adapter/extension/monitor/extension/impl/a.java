package com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqs;
import tb.azf;
import tb.bar;
import tb.kge;
import tb.mto;

@AURAExtensionImpl(code = "aura.impl.aspect.error.alarm.monitor.sampling")
/* loaded from: classes2.dex */
public final class a implements azf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final double f2208a = 1.0d;
    private double b = 1.0d;

    static {
        kge.a(1279156285);
        kge.a(-1725458866);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = bar.a("alarm_monitor_sampling", 1.0d);
        }
    }

    @Override // tb.azf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : a(this.b, 1.0d);
    }

    private boolean a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0efa2c", new Object[]{this, new Double(d), new Double(d2)})).booleanValue();
        }
        int i = (d > mto.a.GEO_NOT_SUPPORT ? 1 : (d == mto.a.GEO_NOT_SUPPORT ? 0 : -1));
        if (i == 0) {
            return false;
        }
        if (d == 1.0d) {
            return true;
        }
        double random = Math.random();
        return (i < 0 || d > 1.0d) ? random < d2 : random < d;
    }
}
