package com.taobao.android.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fpa;
import tb.kge;

/* loaded from: classes5.dex */
public class g extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(550413698);
    }

    @Override // com.taobao.android.dinamic.expressionv2.DinamicASTNode
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        fpa.a("VarName:" + this.d);
        return this.d;
    }
}
