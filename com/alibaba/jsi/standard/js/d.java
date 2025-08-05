package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1319989300);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public d(com.alibaba.jsi.standard.d dVar) {
        super(dVar, Bridge.createNative(dVar, 8));
    }

    public d(com.alibaba.jsi.standard.d dVar, int i) {
        super(dVar, Bridge.createNative(dVar, 8, i));
    }

    public d(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
    }

    public int a(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20deb528", new Object[]{this, dVar})).intValue();
        }
        m();
        Object cmd = Bridge.cmd(dVar, 200, this.b);
        if (!(cmd instanceof Long)) {
            return 0;
        }
        return ((Long) cmd).intValue();
    }
}
