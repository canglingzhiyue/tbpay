package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.ext.event.j;
import com.alibaba.android.ultron.ext.event.util.c;
import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class bkt extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f25956a;

    static {
        kge.a(-433870745);
    }

    public abstract JSONObject a(JSONObject jSONObject);

    public boolean e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79b76b83", new Object[]{this, eVar})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public final void a_(e eVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
        } else if (!e(eVar)) {
        } else {
            c.a(getClass().getSimpleName(), "combineEventStart", "事件开始");
            JSONObject d = d(eVar);
            if (d == null || eVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("fields is null :");
                sb.append(d == null);
                sb.append("ultronEvent is null :");
                if (eVar != null) {
                    z = false;
                }
                sb.append(z);
                c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", sb.toString());
                return;
            }
            this.f25956a = eVar.a();
            JSONObject jSONObject = d.getJSONObject("native$combineEvent");
            if (jSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                h.a(jSONObject2, d);
                jSONObject = a(jSONObject2);
                d.put("native$combineEvent", (Object) jSONObject);
                d.put("eventChainID", (Object) Long.valueOf(System.currentTimeMillis()));
                c.a(getClass().getSimpleName(), "combineEventStart", dvq.FILES_DIR_NAME, JSON.toJSONString(d));
            }
            c.a(getClass().getSimpleName(), "combineEventDispatchEvent", "事件分发");
            b(eVar, jSONObject);
        }
    }

    public JSONObject a(JSONObject jSONObject, String str, String str2, JSONObject jSONObject2) {
        String str3;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("15ec8cf4", new Object[]{this, jSONObject, str, str2, jSONObject2});
        }
        c.a(getClass().getSimpleName(), "combineEventAddNext", "add下一个事件");
        if (jSONObject == null || StringUtils.isEmpty(str) || !(jSONObject.get("fields") instanceof JSONObject)) {
            if (jSONObject == null) {
                str3 = "addNextEvent 参数校验出错:targetEvent 为空";
            } else if (StringUtils.isEmpty(str)) {
                str3 = "addNextEvent 参数校验出错:nextKey 为空";
            } else {
                str3 = "addNextEvent 参数校验出错:fields 为空";
            }
            c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str3);
            return null;
        }
        Object obj = jSONObject.getJSONObject("fields").get("native$next");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject3 = (JSONObject) obj;
            Object obj2 = jSONObject3.get(str);
            if (obj2 instanceof JSONArray) {
                jSONArray = (JSONArray) obj2;
            } else {
                jSONArray = new JSONArray();
                jSONObject3.put(str, (Object) jSONArray);
            }
        } else {
            JSONObject jSONObject4 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONObject4.put(str, (Object) jSONArray2);
            jSONObject.getJSONObject("fields").put("native$next", (Object) jSONObject4);
            jSONArray = jSONArray2;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("type", (Object) str2);
        jSONObject5.put("fields", (Object) jSONObject2);
        jSONArray.add(jSONObject5);
        return jSONObject5;
    }
}
