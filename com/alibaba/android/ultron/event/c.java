package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2588a = "value";
    private final String b = "empty";
    private final String l = "notEmpty";

    static {
        kge.a(1076122247);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        JSONObject fields;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null || (fields = b.getFields()) == null || (jSONObject = fields.getJSONObject("next")) == null) {
            return;
        }
        Object obj = fields.get("value");
        if (obj != null && ((!(obj instanceof String) || !TextUtils.isEmpty(obj.toString())) && ((!(obj instanceof Map) || !((Map) obj).isEmpty()) && (!(obj instanceof List) || !((List) obj).isEmpty())))) {
            z = false;
        }
        if (z) {
            jSONArray = jSONObject.getJSONArray("empty");
        } else {
            jSONArray = jSONObject.getJSONArray("notEmpty");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("value", obj);
        a(jSONArray, jSONObject2);
    }
}
