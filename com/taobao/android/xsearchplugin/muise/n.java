package com.taobao.android.xsearchplugin.muise;

import com.android.alibaba.ip.runtime.IpChange;
import tb.isr;
import tb.kge;

/* loaded from: classes6.dex */
public class n implements isr.c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.weex_framework.bridge.b f16262a;

    static {
        kge.a(-1583309770);
        kge.a(1796413787);
    }

    public static isr.c.a a(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (isr.c.a) ipChange.ipc$dispatch("b514b163", new Object[]{bVar});
        }
        if (bVar == null) {
            return null;
        }
        return new n(bVar);
    }

    private n(com.taobao.android.weex_framework.bridge.b bVar) {
        this.f16262a = bVar;
    }

    @Override // tb.isr.c.a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.f16262a.a(obj);
        }
    }
}
