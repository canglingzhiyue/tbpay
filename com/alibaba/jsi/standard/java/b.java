package com.alibaba.jsi.standard.java;

import com.alibaba.jsi.standard.c;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f3138a;
    private final c b;

    static {
        kge.a(-1571363518);
    }

    public b(d dVar, c cVar) {
        this.f3138a = dVar;
        this.b = cVar;
    }

    public w a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("eb2a78a2", new Object[]{this, obj});
        }
        com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(this.f3138a.g());
        try {
            return this.b.a(this.f3138a, obj);
        } finally {
            cVar.b();
        }
    }
}
