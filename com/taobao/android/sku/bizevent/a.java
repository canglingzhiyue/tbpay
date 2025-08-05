package com.taobao.android.sku.bizevent;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_callback";

    static {
        kge.a(86074123);
        kge.a(-1413102650);
    }

    @Override // tb.iyd
    public void a(iye iyeVar, iyb iybVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
            return;
        }
        JSONObject b = iyeVar.b();
        if (b == null || b.isEmpty() || (jSONObject = b.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return;
        }
        iybVar.a(jSONObject);
    }
}
