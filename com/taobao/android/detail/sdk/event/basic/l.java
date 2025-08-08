package com.taobao.android.detail.sdk.event.basic;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class l implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10228a;
    public boolean b = false;
    public String c;
    public ArrayList<Pair<String, String>> d;
    private NodeBundle e;
    private JSONObject f;

    static {
        kge.a(-327988187);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20033;
    }

    public l(NodeBundle nodeBundle, JSONObject jSONObject) {
        this.e = nodeBundle;
        a(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenProductParamsEvent");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f = jSONObject;
        this.d = a();
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.e;
    }

    private ArrayList<Pair<String, String>> a() {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
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
                    this.f10228a = it.next();
                }
            }
            Iterator<Object> it2 = this.f.getJSONArray(this.f10228a).iterator();
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
