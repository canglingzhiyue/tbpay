package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class be {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12078a;
    public int b;
    public int c;
    public int d;

    static {
        kge.a(819588675);
    }

    public be a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (be) ipChange.ipc$dispatch("e2a64402", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        be beVar = new be();
        beVar.f12078a = this.f12078a;
        beVar.b = this.b;
        beVar.c = this.c;
        beVar.d = this.d;
        return beVar;
    }
}
