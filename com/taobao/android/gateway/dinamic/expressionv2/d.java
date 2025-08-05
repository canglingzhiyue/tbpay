package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode;
import java.util.ArrayList;
import tb.gkn;
import tb.glq;
import tb.gme;
import tb.gmf;
import tb.gmg;
import tb.kge;

/* loaded from: classes.dex */
public class d extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(331793237);
    }

    public d() {
        this.f12702a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod;
    }

    @Override // com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode
    public Object a() {
        gmg gmgVar;
        gmf gmfVar;
        gme b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            Object a2 = this.b.get(i).a();
            if (a2 != null) {
                arrayList.add(a2);
            } else {
                arrayList.add(gkn.NL);
            }
        }
        if (this.d != null) {
            gmgVar = glq.a(this.d);
            if (gmgVar == null && (b = (gmfVar = (gmf) this.c).b()) != null) {
                try {
                    return b.a(this.d, gmfVar).a(arrayList);
                } catch (Throwable th) {
                    com.taobao.android.gateway.util.a.a("DinamicExpresstion", th.getMessage(), "dataProviderParser parse express failed, parser=", gmgVar.getClass().getName());
                    return null;
                }
            }
        } else {
            gmgVar = null;
        }
        com.taobao.android.gateway.util.a.a("MethodName:" + this.d);
        if (gmgVar != null) {
            try {
                com.taobao.android.gateway.util.a.a("args:" + arrayList.toString());
                return gmgVar.a(arrayList, (gmf) this.c);
            } catch (Throwable th2) {
                com.taobao.android.gateway.util.a.a("DinamicExpresstion", th2.getMessage(), "parse express failed, parser=", gmgVar.getClass().getName());
                return null;
            }
        }
        return this.d;
    }
}
