package com.taobao.android.dinamic.expressionv2;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.DinamicASTNode;
import com.taobao.android.dinamic.j;
import java.util.ArrayList;
import java.util.List;
import tb.fnp;
import tb.fnq;
import tb.fpa;
import tb.fpd;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List e;

    static {
        kge.a(-1186550742);
    }

    public List b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.e;
    }

    public d() {
        this.f11745a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod;
    }

    @Override // com.taobao.android.dinamic.expressionv2.DinamicASTNode
    public Object a() {
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
                arrayList.add(com.taobao.android.dinamic.f.NL);
            }
        }
        fnp a3 = this.d != null ? fnq.a(this.d) : null;
        fpa.a("MethodName:" + this.d);
        if (a3 == null) {
            return null;
        }
        try {
            fpa.a("args:" + arrayList.toString());
            return a3.a(arrayList, (fpd) this.c);
        } catch (Throwable th) {
            fpa.a("DinamicExpresstion", th, "parse express failed, parser=", a3.getClass().getName());
            return null;
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        fpa.c("DinamicExpression handleEvent", new String[0]);
        if (this.b == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(this.b.get(i).a());
        }
        com.taobao.android.dinamic.dinamic.d dVar = null;
        if (this.d != null) {
            dVar = com.taobao.android.dinamic.e.c(this.d);
        }
        if (dVar == null) {
            return;
        }
        try {
            fpd fpdVar = (fpd) this.c;
            dVar.a(view, fpdVar.b(), arrayList, fpdVar.e(), fpdVar.d(), (ArrayList) view.getTag(j.VIEW_PARAMS));
        } catch (Throwable th) {
            fpa.a("DinamicExpression", th, "parse express failed, parser=", dVar.getClass().getName());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e = new ArrayList();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.add(this.b.get(i).a());
        }
    }
}
