package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final f d;
    private static final f e;
    private final boolean c;

    @Override // com.alibaba.jsi.standard.js.w
    public w b(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("8d90a414", new Object[]{this, dVar}) : this;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-695207717);
        d = new f(true);
        e = new f(false);
    }

    public f(boolean z) {
        this.c = z;
    }

    public static f a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("f7ec1bb", new Object[]{new Boolean(z)}) : z ? d : e;
    }

    public boolean l_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd9ba07e", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public String a_(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb92a9ee", new Object[]{this, dVar}) : this.c ? "true" : "false";
    }
}
