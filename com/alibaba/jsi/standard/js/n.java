package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class n extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(214661909);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean n_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c10551bc", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public n(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
    }

    public double c(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c8e2d25", new Object[]{this, dVar})).doubleValue();
        }
        m();
        Object cmd = Bridge.cmd(dVar, 300, this.b);
        return cmd instanceof m ? ((m) cmd).m_() : mto.a.GEO_NOT_SUPPORT;
    }
}
