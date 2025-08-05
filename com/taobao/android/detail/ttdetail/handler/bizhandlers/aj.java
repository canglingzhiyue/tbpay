package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class aj implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_sku_quantity";

    /* renamed from: a  reason: collision with root package name */
    private Context f10685a;
    private eyx b;
    private a c;

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(1057697938);
        kge.a(1967244270);
    }

    public aj(Context context, eyx eyxVar, a aVar) {
        this.f10685a = context;
        this.b = eyxVar;
        this.c = aVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        a(b, runtimeAbilityParamArr);
        a(b);
        return false;
    }

    private void a(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ca12ce", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("beReplaced", (Object) "globalMultiBuyVO");
        jSONObject3.put("toReplace", (Object) "fields");
        jSONObject2.put("targetReplacement", (Object) jSONObject3);
        JSONObject jSONObject4 = jSONObject.getJSONObject("extraData");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject2.put("payload", (Object) jSONObject4);
        this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateSKUQuantityImplementor$1
            {
                put("type", "adjustState");
                put("fields", (Object) jSONObject2);
            }
        }), runtimeAbilityParamArr);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("quantity");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.c.a(string);
    }
}
