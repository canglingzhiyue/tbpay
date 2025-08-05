package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class t extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-760002083);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public t(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
    }

    public String c(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa82fc49", new Object[]{this, dVar});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 302, this.b);
        if (!(cmd instanceof s)) {
            return null;
        }
        return ((s) cmd).p_();
    }
}
