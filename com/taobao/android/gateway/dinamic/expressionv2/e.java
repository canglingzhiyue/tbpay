package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1957955831);
    }

    @Override // com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        com.taobao.android.gateway.util.a.a("DXSerialBlockNode:" + this.d);
        if (this.b == null) {
            return null;
        }
        int size = this.b.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object a2 = this.b.get(i).a();
            if (a2 != null) {
                arrayList.add(a2.toString());
            }
        }
        return arrayList;
    }

    public e() {
        this.f12702a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeSerialBlock;
        this.d = "branch";
    }
}
