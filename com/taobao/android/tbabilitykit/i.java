package com.taobao.android.tbabilitykit;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import tb.dmo;
import tb.kge;
import tb.nog;

/* loaded from: classes6.dex */
public final class i implements com.taobao.android.abilitykit.mega.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(122343659);
        kge.a(-492976882);
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult b(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("1ae5592d", new Object[]{this, result});
        }
        kotlin.jvm.internal.q.d(result, "result");
        return result;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject a2 = dmo.a(jSONObject, "prefetchConfig", (JSONObject) null);
        if (a2 != null) {
            jSONObject.put((JSONObject) "prefetchTimeout", (String) a2.get("productionTimeout"));
            jSONObject.remove("prefetchConfig");
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "method", dmo.a(jSONObject, "usePost", false) ? "POST" : "GET");
        jSONObject2.put((JSONObject) "responseType", "JSON");
        jSONObject2.put((JSONObject) "droidParseAsync", (String) Boolean.valueOf(dmo.a(jSONObject, "droidParseAsync", false)));
        a(jSONObject, "bizParams", "data");
        a(jSONObject, "isNeedWua", "useWua");
        a(jSONObject, ICallService.KEY_NEED_ECODE, "needLogin");
        a(jSONObject, "unitStrategy", nog.PRICE_UNIT);
        if (!(jSONObject.get("loadingConfig") instanceof JSONObject)) {
            jSONObject2.put((JSONObject) "loadingConfig", (String) null);
        }
        return jSONObject;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult a(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b88a424e", new Object[]{this, result});
        }
        kotlin.jvm.internal.q.d(result, "result");
        if (!(result instanceof FinishResult)) {
            return result;
        }
        if (kotlin.jvm.internal.q.a((Object) result.f(), (Object) "onReceiveData")) {
            JSONObject jSONObject = new JSONObject(result.e());
            a(jSONObject, "responseHeader", "akResponseHeader");
            return new FinishResult(jSONObject, "success");
        } else if (!kotlin.jvm.internal.q.a((Object) result.f(), (Object) "onFailure")) {
            return result;
        } else {
            JSONObject jSONObject2 = new JSONObject(result.e());
            a(jSONObject2, "errorInfo", "errorViewInfo");
            return new FinishResult(jSONObject2, "failure");
        }
    }

    private final void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
            return;
        }
        jSONObject.put((JSONObject) str2, (String) jSONObject.get(str));
        jSONObject.remove(str);
    }
}
