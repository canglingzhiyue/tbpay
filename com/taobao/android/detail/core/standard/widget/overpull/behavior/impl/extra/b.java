package com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9917a;
    public float b;
    public int c;

    static {
        kge.a(-1461609057);
        kge.a(-719915826);
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f9917a = i;
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.c
    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        this.b = f;
        this.c = i;
    }
}
