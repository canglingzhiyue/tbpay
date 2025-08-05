package com.taobao.android.xsearchplugin.weex.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;
import tb.isr;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements isr.c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSCallback f16274a;

    static {
        kge.a(1285191975);
        kge.a(1796413787);
    }

    public static isr.c.a a(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (isr.c.a) ipChange.ipc$dispatch("7f57b822", new Object[]{jSCallback});
        }
        if (jSCallback == null) {
            return null;
        }
        return new b(jSCallback);
    }

    private b(JSCallback jSCallback) {
        this.f16274a = jSCallback;
    }

    @Override // tb.isr.c.a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.f16274a.invoke(obj);
        }
    }
}
