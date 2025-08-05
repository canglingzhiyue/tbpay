package com.alibaba.android.icart.core.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bcb;
import tb.bei;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_MANAGE_CHANGED = "manageClick";

    /* renamed from: a  reason: collision with root package name */
    public bcb f2304a;
    public boolean b = false;

    static {
        kge.a(1839688195);
    }

    public d(bcb bcbVar) {
        this.f2304a = bcbVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = !this.b;
        a(this.b);
    }

    public void a(boolean z) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        jny w = this.f2304a.w();
        if (w == null || (b = w.b()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : b) {
            if (iDMComponent != null) {
                boolean b2 = bei.b(iDMComponent);
                String tag = iDMComponent.getTag();
                if ("item".equals(tag)) {
                    iDMComponent.getFields().put("isManaging", (Object) String.valueOf(z));
                    IDMComponent parent = iDMComponent.getParent();
                    if (parent != null) {
                        boolean a2 = bei.a(z, iDMComponent);
                        if (!z && b2 && !a2) {
                            bei.a(iDMComponent, false);
                            arrayList.add(iDMComponent);
                            IDMComponent parent2 = parent.getParent();
                            if (parent2 != null) {
                                Iterator<IDMComponent> it = parent2.getChildren().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    IDMComponent next = it.next();
                                    if (next != null && "shop".equals(next.getTag())) {
                                        bei.a(next, false);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if ("shop".equals(tag) || "bundleHeader".equals(tag)) {
                    iDMComponent.getFields().put("isManaging", (Object) String.valueOf(z));
                    boolean a3 = bei.a(z, iDMComponent);
                    if (!z && b2 && !a3) {
                        bei.a(iDMComponent, false);
                    }
                } else if ("submit".equals(tag)) {
                    iDMComponent.getFields().put("isManaging", (Object) String.valueOf(z));
                } else if (z && ("submitPromotion".equals(tag) || "cartTimePromotion".equals(tag))) {
                    iDMComponent.getData().put("status", (Object) "hidden");
                }
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }
}
