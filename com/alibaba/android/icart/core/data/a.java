package com.alibaba.android.icart.core.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bbz;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f2298a = new ArrayList();
    private bbz b;

    static {
        kge.a(773154784);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(bbz bbzVar) {
        this.b = bbzVar;
    }

    @Override // com.taobao.android.ultron.datamodel.imp.k, tb.joe
    public JSONObject a(com.taobao.android.ultron.datamodel.imp.b bVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a841f102", new Object[]{this, bVar, iDMComponent});
        }
        if (bVar == null) {
            return null;
        }
        try {
            Map<String, DMComponent> u = bVar.u();
            if (u == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            if (iDMComponent != null) {
                hashSet.add(iDMComponent);
            }
            JSONArray s = bVar.s();
            if (s != null && !s.isEmpty()) {
                Iterator<Object> it = s.iterator();
                while (it.hasNext()) {
                    DMComponent dMComponent = u.get((String) it.next());
                    if (dMComponent != null) {
                        hashSet.add(dMComponent);
                    }
                }
                a(u, hashSet);
                JSONObject a2 = a(bVar, hashSet, iDMComponent, true);
                a(bVar, a2);
                return a2;
            }
            JSONObject a3 = a(bVar, hashSet, iDMComponent, true);
            a(bVar, a3);
            return a3;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a(com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0def87e", new Object[]{this, bVar, jSONObject});
        } else if (!this.b.n().o().B() || (jSONObject2 = jSONObject.getJSONObject("linkage")) == null || (jSONObject3 = jSONObject2.getJSONObject("common")) == null) {
        } else {
            jSONObject3.remove("queryParams");
            jqg.b("CartSubmitModule", "从上行参数中移除queryParams");
        }
    }

    private void a(Map<String, DMComponent> map, Set<IDMComponent> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab66ef02", new Object[]{this, map, set});
            return;
        }
        List<String> list = this.f2298a;
        if (list == null || list.isEmpty() || map == null) {
            return;
        }
        for (String str : this.f2298a) {
            DMComponent dMComponent = map.get(str);
            if (dMComponent != null) {
                set.add(dMComponent);
            }
        }
        this.f2298a.clear();
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.f2298a.addAll(list);
        }
    }
}
