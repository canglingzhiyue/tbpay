package com.alibaba.android.ultron.ext.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_DISPATCHER = "dispatch";

    static {
        kge.a(-2003995841);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
            return;
        }
        JSONObject d = d(eVar);
        if (d == null) {
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        JSONObject a2 = com.alibaba.android.ultron.ext.event.util.h.a(d);
        JSONArray jSONArray = a2.getJSONArray("conditions");
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("expression");
            JSONArray jSONArray2 = jSONObject.getJSONArray("next");
            if (a(string)) {
                b(eVar, jSONArray2, a2);
                return;
            }
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str.contains("==")) {
            String[] split = str.split("==");
            if (split.length != 2) {
                return false;
            }
            return split[1].equals(c(split[0]));
        }
        com.alibaba.android.ultron.ext.event.util.h.a(str, this.g.getFields(), "");
        return !StringUtils.isEmpty(c(str));
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        com.alibaba.android.ultron.ext.event.util.h.a(jSONArray, this.g.getFields(), "");
        return (String) jSONArray.get(0);
    }

    private void b(com.alibaba.android.ultron.event.base.e eVar, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2331c866", new Object[]{this, eVar, jSONArray, jSONObject});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(jSONArray.getString(i));
            if (jSONObject2 != null) {
                b(eVar, jSONObject2.getString("type"), jSONObject2.getJSONObject("fields"));
            }
        }
    }
}
