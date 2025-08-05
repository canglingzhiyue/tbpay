package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import tb.fvb;
import tb.fve;
import tb.his;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DinamicXEngine f13853a;
    private List<k> b = new ArrayList();
    private fve c = new fve() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.l.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fve
        public void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (fvbVar != null && fvbVar.f28139a != null) {
                his.b("TBLiveTemplateHelper", "onNotificationListener | size=" + fvbVar.f28139a.size());
                for (k kVar : l.a(l.this)) {
                    if (kVar.b()) {
                        kVar.a(fvbVar.f28139a);
                    } else {
                        List<String> a2 = kVar.a();
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                                if (a2.contains(dXTemplateItem.f11925a)) {
                                    arrayList.add(dXTemplateItem);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                kVar.a(arrayList);
                            }
                        }
                    }
                }
                if (fvbVar.b == null) {
                    return;
                }
                for (int i = 0; i < fvbVar.b.size(); i++) {
                    his.a("TBLiveTemplateHelper", "onFinished | failed:" + fvbVar.b.get(i).f11925a + " version=" + fvbVar.b.get(i).b);
                }
            }
        }
    };

    static {
        kge.a(-1659353763);
    }

    public static /* synthetic */ List a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("771f6ea1", new Object[]{lVar}) : lVar.b;
    }

    public l(DinamicXEngine dinamicXEngine) {
        this.f13853a = dinamicXEngine;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90300687", new Object[]{this, kVar});
        } else if (kVar == null || this.b.contains(kVar)) {
        } else {
            this.b.add(kVar);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f13853a.b(this.c);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f13853a.c(this.c);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.clear();
        d();
    }
}
