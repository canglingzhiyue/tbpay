package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class ax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12069a = -1;
    public int b = 0;
    public int c = 0;
    public int d = -1;
    public int e = -1;

    static {
        kge.a(-1469402182);
    }

    public ax a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ax) ipChange.ipc$dispatch("e2a6428e", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        ax axVar = new ax();
        axVar.f12069a = this.f12069a;
        axVar.b = this.b;
        axVar.c = this.c;
        axVar.d = this.d;
        axVar.e = this.e;
        return axVar;
    }
}
