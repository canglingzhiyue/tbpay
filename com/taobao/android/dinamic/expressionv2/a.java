package com.taobao.android.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fpd;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fpd f11746a;

    static {
        kge.a(222571616);
    }

    public void a(fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fbfbbe", new Object[]{this, fpdVar});
        } else {
            this.f11746a = fpdVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x012f, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamic.expressionv2.DinamicASTNode a(android.util.Pair r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamic.expressionv2.a.a(android.util.Pair):com.taobao.android.dinamic.expressionv2.DinamicASTNode");
    }
}
