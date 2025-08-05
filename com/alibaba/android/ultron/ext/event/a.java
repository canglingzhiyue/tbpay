package com.alibaba.android.ultron.ext.event;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.taobao.windvane.export.adapter.ILocalizationService;
import com.alibaba.android.ultron.ext.event.widget.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_ALERT = "alert";
    public static final String NEXT_TAG_CANCEL = "cancel";
    public static final String NEXT_TAG_CONFIRM = "confirm";

    static {
        kge.a(-1552032477);
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(final com.alibaba.android.ultron.event.base.e eVar) {
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
        Context a2 = eVar.a();
        if (a2 instanceof Activity) {
            try {
                new com.alibaba.android.ultron.ext.event.widget.a(this.d).a((CharSequence) d.getString("msg")).a(d.getString("title")).b(d.getString("cancelText")).c(d.getString("confirmText")).a(new a.InterfaceC0090a() { // from class: com.alibaba.android.ultron.ext.event.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.ultron.ext.event.widget.a.InterfaceC0090a
                    public void a(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c0d596fe", new Object[]{this, dialogInterface});
                            return;
                        }
                        a.this.a(eVar, "confirm");
                        dialogInterface.dismiss();
                    }

                    @Override // com.alibaba.android.ultron.ext.event.widget.a.InterfaceC0090a
                    public void b(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2228339d", new Object[]{this, dialogInterface});
                            return;
                        }
                        a.this.a(eVar, "cancel");
                        dialogInterface.dismiss();
                    }
                }).a();
                return;
            } catch (Exception e) {
                com.alibaba.android.ultron.ext.event.util.c.a("AlertV2Subscriber", "onHandleEventChain", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", com.alibaba.android.ultron.ext.event.util.c.a(e));
                return;
            }
        }
        com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "context异常 context is" + a2);
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
        jSONObject2.put("type", (Object) "alertV3");
        jSONObject2.put("fields", (Object) jSONObject.getJSONObject("alert"));
        if (!jSONObject.containsKey("cancelText")) {
            jSONObject2.getJSONObject("fields").put("cancelText", (Object) ILocalizationService.CANCEL);
        }
        return jSONObject2;
    }
}
