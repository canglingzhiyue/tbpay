package com.taobao.android.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.DinamicASTNode;
import tb.fpa;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-166795418);
    }

    @Override // com.taobao.android.dinamic.expressionv2.DinamicASTNode
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        fpa.a("DXBranchBlockNode:" + this.d);
        int size = this.b.size();
        fpa.a("children.size():" + size);
        if (size <= 1) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            Object a2 = this.b.get(i).a();
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public b() {
        this.f11745a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeBranchBlock;
        this.d = "branch";
    }
}
