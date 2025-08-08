package com.taobao.android.ultron.datamodel.imp.delta;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.jok;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "merge";

    static {
        kge.a(-13538266);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.ultron.datamodel.imp.delta.a
    public void a(com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject, List<jok> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4278c96f", new Object[]{this, bVar, jSONObject, list});
        } else if (jSONObject == null || bVar == null) {
        } else {
            String string = jSONObject.getString("target");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            JSONObject o = bVar.o();
            Map<String, DMComponent> u = bVar.u();
            JSONObject x = bVar.x();
            if (o == null || x == null) {
                return;
            }
            JSONObject jSONObject2 = o.getJSONObject(string);
            JSONObject jSONObject3 = x.getJSONObject(string);
            DMComponent dMComponent = u.get(string);
            a(jSONObject2, jSONObject3);
            if (dMComponent == null) {
                return;
            }
            dMComponent.writeBackDataAndReloadEvent(jSONObject2, com.taobao.android.ultron.datamodel.imp.a.a(bVar, jSONObject2.getJSONObject("events")), false);
        }
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject2 != null) {
            if (jSONObject == null) {
                JSONObject.parseObject(jSONObject2.toJSONString());
                return;
            }
            for (String str : jSONObject2.keySet()) {
                if (!StringUtils.isEmpty(str)) {
                    Object obj = jSONObject2.get(str);
                    Object obj2 = jSONObject.get(str);
                    if ((obj2 instanceof JSONObject) && (obj instanceof JSONObject)) {
                        a((JSONObject) obj2, (JSONObject) obj);
                    } else {
                        jSONObject.put(str, obj);
                    }
                }
            }
        }
    }
}
