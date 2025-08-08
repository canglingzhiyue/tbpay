package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class bjx extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f25947a;

    static {
        kge.a(-1330102169);
    }

    public abstract JSONObject a(JSONObject jSONObject);

    public boolean f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("332ef922", new Object[]{this, eVar})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public final void d(e eVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (!f(eVar)) {
        } else {
            bkd.a(getClass().getSimpleName(), "combineEventStart", "事件开始");
            JSONObject e = e(eVar);
            if (e == null || eVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("fields is null :");
                sb.append(e == null);
                sb.append("ultronEvent is null :");
                if (eVar != null) {
                    z = false;
                }
                sb.append(z);
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", sb.toString());
                return;
            }
            this.f25947a = eVar.a();
            JSONObject jSONObject = e.getJSONObject("native$combineEvent");
            if (jSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                bkg.a(jSONObject2, e);
                jSONObject = a(jSONObject2);
                e.put("native$combineEvent", (Object) jSONObject);
            }
            bkd.a(getClass().getSimpleName(), "combineEventDispatchEvent", "事件分发");
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
        bkd.a(getClass().getSimpleName(), "combineEventAddNext", "add下一个事件");
        if (jSONObject == null || StringUtils.isEmpty(str) || !(jSONObject.get("fields") instanceof JSONObject)) {
            if (jSONObject == null) {
                str3 = "addNextEvent 参数校验出错:targetEvent 为空";
            } else if (StringUtils.isEmpty(str)) {
                str3 = "addNextEvent 参数校验出错:nextKey 为空";
            } else {
                str3 = "addNextEvent 参数校验出错:fields 为空";
            }
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str3);
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
