package com.taobao.android.tbsku.bizevent;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.p;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class g implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_toast";

    static {
        kge.a(-616534581);
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
        Context a2 = iyeVar.a();
        JSONObject b = iyeVar.b();
        if (b == null || b.isEmpty() || (jSONObject = b.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return;
        }
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString("text");
        String string3 = jSONObject.getString("default");
        String string4 = jSONObject.getString("combText");
        if (TextUtils.isEmpty(string2)) {
            string2 = string3;
        }
        if (TextUtils.isEmpty(string4)) {
            string4 = string2;
        } else if (!TextUtils.isEmpty(string2)) {
            string4 = string2 + "/n" + string4;
        }
        String string5 = jSONObject.getString("iconFont");
        if ("custom".equals(string)) {
            p.a(a2, 4, string4, string5);
        } else if ("failed".equals(string)) {
            p.a(a2, 3, string4, null);
        } else if ("success".equals(string)) {
            p.a(a2, 2, string4, null);
        } else if ("default".equals(string)) {
            p.a(a2, 1, string4, null);
        } else {
            p.a(a2, 1, string4, null);
        }
    }
}
