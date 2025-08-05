package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class j extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c;

    static {
        kge.a(-701727355);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public j(com.alibaba.jsi.standard.d dVar, h hVar, String str) {
        super(dVar, Bridge.createNative(dVar, 12, new Object[]{hVar, str}));
        this.c = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(com.alibaba.jsi.standard.d r3, com.alibaba.jsi.standard.js.h r4, java.lang.String r5, boolean r6) {
        /*
            r2 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r5 = 0
            if (r6 == 0) goto L11
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L12
        L11:
            r4 = r5
        L12:
            r6 = 2
            r0[r6] = r4
            r4 = 12
            long r0 = com.alibaba.jsi.standard.js.Bridge.createNative(r3, r4, r0)
            r2.<init>(r3, r0)
            r2.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.js.j.<init>(com.alibaba.jsi.standard.d, com.alibaba.jsi.standard.js.h, java.lang.String, boolean):void");
    }

    public j(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
        this.c = null;
    }

    public w a(com.alibaba.jsi.standard.d dVar, w wVar, w[] wVarArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("467095b0", new Object[]{this, dVar, wVar, wVarArr});
        }
        m();
        k(dVar);
        Object[] objArr = new Object[wVarArr != null ? wVarArr.length + 1 : 1];
        objArr[0] = wVar;
        if (wVarArr != null) {
            int length = wVarArr.length;
            while (i < length) {
                objArr[i2] = wVarArr[i];
                i++;
                i2++;
            }
        }
        Object cmd = Bridge.cmd(dVar, 550, this.b, objArr);
        if (!(cmd instanceof w)) {
            return null;
        }
        return (w) cmd;
    }

    public h c(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("81202684", new Object[]{this, dVar});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 554, this.b);
        if (!(cmd instanceof h)) {
            return null;
        }
        return (h) cmd;
    }

    public boolean d(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a65e93c", new Object[]{this, dVar})).booleanValue();
        }
        m();
        return Bridge.cmd(dVar, 553, this.b) != null;
    }
}
