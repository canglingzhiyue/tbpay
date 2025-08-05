package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1175468026);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public g(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
    }

    public boolean c(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c8e2d3b", new Object[]{this, dVar})).booleanValue();
        }
        m();
        Object cmd = Bridge.cmd(dVar, 301, this.b);
        if (!(cmd instanceof f)) {
            return false;
        }
        return ((f) cmd).l_();
    }
}
