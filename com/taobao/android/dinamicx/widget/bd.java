package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class bd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12077a;
    public int b;
    public int c;
    public int d;

    static {
        kge.a(-1167407812);
    }

    public bd a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bd) ipChange.ipc$dispatch("e2a643e3", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return this;
        }
        bd bdVar = new bd();
        bdVar.f12077a = this.f12077a;
        bdVar.b = this.b;
        bdVar.c = this.c;
        bdVar.d = this.d;
        return bdVar;
    }
}
