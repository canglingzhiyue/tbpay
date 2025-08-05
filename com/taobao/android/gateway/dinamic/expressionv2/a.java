package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.gmf;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private gmf f12703a;

    static {
        kge.a(1740915595);
    }

    public void a(gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea877698", new Object[]{this, gmfVar});
        } else {
            this.f12703a = gmfVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x013a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode a(android.util.Pair r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.gateway.dinamic.expressionv2.a.a(android.util.Pair):com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode");
    }
}
