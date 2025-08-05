package com.alibaba.android.icart.core.data;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bcb;
import tb.jns;
import tb.jny;
import tb.jqd;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(347164845);
    }

    public static void a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbcbb03", new Object[]{jnyVar});
            return;
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
        JSONObject o = bVar.o();
        Map<String, DMComponent> u = bVar.u();
        for (String str : o.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                Object obj = o.get(str);
                com.taobao.android.ultron.datamodel.imp.c t = bVar.t();
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.isEmpty()) {
                        u.remove(str);
                        UnifyLog.d("DataParse", "componentMap remove key = " + str);
                    } else if (!a(bVar, str) && "item".equals(jSONObject.getString("tag"))) {
                        u.put(str, t.a(bVar, jSONObject, str));
                    }
                }
            }
        }
    }

    public static void a(bcb bcbVar, jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c8ce92", new Object[]{bcbVar, jnyVar});
            return;
        }
        Activity m = bcbVar.n().m();
        a((com.taobao.android.ultron.datamodel.imp.b) jnyVar);
        a(jnyVar, m);
        com.alibaba.android.ultron.trade.data.request.a.a(bcbVar, jnyVar, m, false);
    }

    public static void a(jny jnyVar, Context context) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b62a25", new Object[]{jnyVar, context});
        } else if (jnyVar != null && context != null && (b = jnyVar.b()) != null) {
            ArrayList arrayList = new ArrayList();
            final boolean b2 = jqd.a("iCart").b("isShot2024ItemV2Gray", false);
            jns<Boolean, IDMComponent> jnsVar = new jns<Boolean, IDMComponent>() { // from class: com.alibaba.android.icart.core.data.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public boolean f2302a = true;

                @Override // tb.jns
                public Boolean a(IDMComponent iDMComponent) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        return (Boolean) ipChange2.ipc$dispatch("824d669", new Object[]{this, iDMComponent});
                    }
                    try {
                        if (!b2 || !this.f2302a) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } finally {
                        this.f2302a = false;
                    }
                }
            };
            for (IDMComponent iDMComponent : b) {
                if (iDMComponent != null && iDMComponent.getFields() != null) {
                    a(iDMComponent, arrayList, jnsVar);
                }
            }
            jnyVar.a(arrayList);
        }
    }

    public static void a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3e9cdd", new Object[]{iDMComponent, list});
        } else {
            a(iDMComponent, list, null);
        }
    }

    public static void a(IDMComponent iDMComponent, List<IDMComponent> list, jns<Boolean, IDMComponent> jnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca2ec3e", new Object[]{iDMComponent, list, jnsVar});
        } else if (iDMComponent == null || list == null) {
        } else {
            String string = iDMComponent.getFields().getString("cornerType");
            if ("both".equals(string) || "top".equals(string)) {
                if (jnsVar == null || jnsVar.a(iDMComponent) == null || !jnsVar.a(iDMComponent).booleanValue()) {
                    list.add(new BundleLineComponent());
                }
                list.add(iDMComponent);
            } else if (iDMComponent instanceof BundleLineComponent) {
            } else {
                list.add(iDMComponent);
            }
        }
    }

    public static void a(com.taobao.android.ultron.datamodel.imp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a0b2", new Object[]{bVar});
            return;
        }
        List<IDMComponent> a2 = a(bVar.b());
        bVar.a(a2);
        for (IDMComponent iDMComponent : a2) {
            iDMComponent.getFields().remove("cornerType");
        }
        bVar.t().a(a2);
    }

    private static List<IDMComponent> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        Iterator<IDMComponent> it = list.iterator();
        while (it.hasNext()) {
            if (BundleLineComponent.COMPONENT_TAG.equals(it.next().getType())) {
                it.remove();
            }
        }
        return list;
    }

    private static boolean a(com.taobao.android.ultron.datamodel.imp.b bVar, String str) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bbaec200", new Object[]{bVar, str})).booleanValue() : (bVar == null || (b = bVar.b()) == null || b.isEmpty() || bVar.u().get(str) == null) ? false : true;
    }
}
