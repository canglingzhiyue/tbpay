package com.alibaba.android.ultron.trade.data.request;

import android.content.Context;
import com.alibaba.android.ultron.trade.event.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.f;
import java.util.ArrayList;
import java.util.Map;
import tb.bmi;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.alibaba.android.ultron.trade.presenter.a e;
    public Context f;
    public c g;

    static {
        kge.a(-1332230134);
    }

    public a(com.alibaba.android.ultron.trade.presenter.a aVar, Context context, c cVar) {
        if (aVar != null) {
            if (context == null) {
                throw new NullPointerException("param context can not be null");
            }
            if (cVar == null) {
                throw new NullPointerException("param request can not be null");
            }
            this.e = aVar;
            this.f = context;
            this.g = cVar;
            return;
        }
        throw new NullPointerException("param dataManager can not be null");
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.g.d(map);
        }
    }

    public static void a(com.alibaba.android.ultron.trade.presenter.a aVar, jny jnyVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ee6529", new Object[]{aVar, jnyVar, context, new Boolean(z)});
        } else if (aVar != null) {
            aVar.b(jnyVar);
            if (jnyVar == null || jnyVar.b() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (IDMComponent iDMComponent : jnyVar.b()) {
                if (iDMComponent != null) {
                    h.a(context, iDMComponent);
                    String b = f.b(iDMComponent);
                    if ("footer".equals(b)) {
                        arrayList2.add(iDMComponent);
                    } else if ("header".equals(b)) {
                        arrayList.add(iDMComponent);
                    } else if ("stickyTop".equals(b)) {
                        arrayList4.add(iDMComponent);
                    } else if ("stickyBottom".equals(b)) {
                        arrayList5.add(iDMComponent);
                    }
                }
                if (!z || (iDMComponent != null && iDMComponent.getStatus() != 0)) {
                    arrayList3.add(iDMComponent);
                }
            }
            bmi bmiVar = new bmi(arrayList, arrayList3, arrayList2);
            bmiVar.a(arrayList4);
            bmiVar.b(arrayList5);
            aVar.a(bmiVar);
        }
    }

    public c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4bddddd9", new Object[]{this}) : this.g;
    }
}
