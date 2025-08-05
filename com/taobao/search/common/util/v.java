package com.taobao.search.common.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public final class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final v INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, JSONArray> f19046a;

    static {
        kge.a(-1214376057);
        INSTANCE = new v();
        f19046a = new HashMap<>();
    }

    private v() {
    }

    public final void a(String srpKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, srpKey});
            return;
        }
        kotlin.jvm.internal.q.c(srpKey, "srpKey");
        f19046a.remove(srpKey);
    }

    public final void a(String srpKey, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649033ff", new Object[]{this, srpKey, new Integer(i), jSONObject});
            return;
        }
        kotlin.jvm.internal.q.c(srpKey, "srpKey");
        if (jSONObject == null || !r.ad() || i > 2) {
            return;
        }
        JSONArray jSONArray = f19046a.get(srpKey);
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            f19046a.put(srpKey, jSONArray);
        }
        if (i == 1) {
            jSONArray.clear();
        }
        jSONArray.add(jSONObject);
    }

    public final JSONArray b(String srpKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{this, srpKey});
        }
        kotlin.jvm.internal.q.c(srpKey, "srpKey");
        return f19046a.get(srpKey);
    }
}
