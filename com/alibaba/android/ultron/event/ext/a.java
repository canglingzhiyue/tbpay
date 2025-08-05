package com.alibaba.android.ultron.event.ext;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.bkb;
import tb.bkd;
import tb.bkf;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_ALERT = "alert";
    public static final String NEXT_TAG_CANCEL = "cancel";
    public static final String NEXT_TAG_CONFIRM = "confirm";

    static {
        kge.a(-75729629);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-1290276990007329743";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        JSONObject e = e(eVar);
        if (e == null) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        Context a2 = eVar.a();
        if (a2 instanceof Activity) {
            try {
                new bkb((Activity) a2, new bkf() { // from class: com.alibaba.android.ultron.event.ext.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.bkf
                    public void a(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        } else if (z) {
                            a.this.a(eVar, "confirm");
                        } else {
                            a.this.a(eVar, "cancel");
                        }
                    }
                }, e.getString("title"), e.getString("msg"), e.getString("cancelText"), e.getString("confirmText")).a();
                return;
            } catch (Exception e2) {
                bkd.a("AlertV2Subscriber", "onHandleEventChain", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", bkd.a(e2));
                return;
            }
        }
        bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "context异常 context is" + a2);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "alertV2");
        jSONObject2.put("fields", (Object) jSONObject.getJSONObject("alert"));
        if (!jSONObject.containsKey("cancelText")) {
            jSONObject2.getJSONObject("fields").put("cancelText", (Object) com.alibaba.ability.localization.b.a(R.string.order_biz_cancel));
        }
        return jSONObject2;
    }
}
