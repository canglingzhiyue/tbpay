package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12074a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;

    static {
        kge.a(-1440763421);
    }

    public ba a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ba) ipChange.ipc$dispatch("e2a64386", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        ba baVar = new ba();
        baVar.f12074a = this.f12074a;
        baVar.b = this.b;
        baVar.c = this.c;
        baVar.d = this.d;
        baVar.e = this.e;
        return baVar;
    }
}
