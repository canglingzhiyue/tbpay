package com.alibaba.android.icart.core.event;

import android.view.View;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.bca;
import tb.bed;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class ap extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-641726383);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject c = c();
        JSONObject jSONObject = c.getJSONObject("popParams");
        if (jSONObject == null) {
            return;
        }
        String string = c.getString("popType");
        alu aluVar = new alu(new alr("iCart", "nativeFragment").a(this.e));
        Map<String, ? extends Object> jSONObject2 = new JSONObject();
        jSONObject2.put("popId", (Object) ("CartStdPop" + System.identityHashCode(this.e)));
        jSONObject2.put("bizId", (Object) "iCart");
        jSONObject2.put("backgroundMode", (Object) "color");
        jSONObject2.put("backgroundStyle", (Object) "7F000000");
        jSONObject2.put("contentBackColor", (Object) "#FF5000");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("animation", (Object) com.taobao.android.abilitykit.ability.pop.model.d.KEY_BOTTOM_IN_OUT);
        jSONObject3.put("panEnable", (Object) "true");
        jSONObject2.put(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (Object) jSONObject3);
        jSONObject2.putAll(jSONObject);
        aluVar.b("stdPop", string, new alq().a((View) null), jSONObject2, new alo() { // from class: com.alibaba.android.icart.core.event.ap.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else if (!(executeResult instanceof ErrorResult)) {
                } else {
                    ErrorResult errorResult = (ErrorResult) executeResult;
                    String a2 = errorResult.a();
                    String str = "StdPop出错#" + a2;
                    bed.a(str, "message=" + errorResult.b() + ",type=" + executeResult.f());
                }
            }
        });
    }
}
