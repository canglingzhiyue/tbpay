package com.alibaba.triver.triver_shop.newShop.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f3820a;
    private final String b;

    static {
        kge.a(1329473799);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return q.a(this.f3820a, aVar.f3820a) && q.a((Object) this.b, (Object) aVar.b);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (this.f3820a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FloatDataModel(jsonObject=" + this.f3820a + ", floatName=" + this.b + ')';
    }

    public final boolean a(String str) {
        JSONObject jSONObject;
        String string;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null || (jSONObject = this.f3820a.getJSONObject("supportPage")) == null || (string = jSONObject.getString("type")) == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject.get(string);
        if (!(obj instanceof JSONArray)) {
            obj = jSONArray;
        }
        Iterator<Object> it = ((JSONArray) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (q.a((Object) str, it.next())) {
                z = true;
                break;
            }
        }
        return q.a((Object) "whitePages", (Object) string) ? z : !z;
    }
}
