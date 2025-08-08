package com.taobao.android.detail.core.event.basic;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.PropsNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.emu;
import tb.enn;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class j extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9705a;
    public boolean b = false;
    public String c;
    public ArrayList<Pair<String, String>> d;
    private com.taobao.android.detail.datasdk.model.datamodel.node.b e;
    private JSONObject f;

    static {
        kge.a(1515895018);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public j(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject) {
        this.e = bVar;
        a(jSONObject);
        emu.a("com.taobao.android.detail.core.event.basic.OpenProductParamsEvent");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f = jSONObject;
        this.d = c();
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.e;
    }

    public ArrayList<Pair<String, String>> a() {
        PropsNode q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = this.d;
        if (arrayList != null && arrayList.size() != 0) {
            return this.d;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.e;
        if (bVar != null && (q = eqb.q(bVar)) != null) {
            return q.propList;
        }
        return null;
    }

    public List<PropsNode.a> b() {
        PropsNode q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.e;
        if (bVar != null && (q = eqb.q(bVar)) != null) {
            return q.bundleProps;
        }
        return null;
    }

    private ArrayList<Pair<String, String>> c() {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.f;
        if (jSONObject == null) {
            this.b = false;
            return arrayList;
        }
        this.b = true;
        try {
            Set<String> keySet2 = jSONObject.keySet();
            if (keySet2 != null) {
                Iterator<String> it = keySet2.iterator();
                if (it.hasNext()) {
                    this.f9705a = it.next();
                }
            }
            Iterator<Object> it2 = this.f.getJSONArray(this.f9705a).iterator();
            while (it2.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it2.next();
                if (StringUtils.isEmpty(this.c) && (keySet = jSONObject2.keySet()) != null) {
                    Iterator<String> it3 = keySet.iterator();
                    if (it3.hasNext()) {
                        this.c = it3.next();
                    }
                }
                Iterator<Object> it4 = jSONObject2.values().iterator();
                while (it4.hasNext()) {
                    Iterator<Object> it5 = ((JSONArray) it4.next()).iterator();
                    while (it5.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it5.next();
                        for (String str : jSONObject3.keySet()) {
                            String string = jSONObject3.getString(str);
                            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(string)) {
                                arrayList.add(new Pair<>(str, string));
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }
}
