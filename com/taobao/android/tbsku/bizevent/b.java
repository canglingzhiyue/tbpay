package com.taobao.android.tbsku.bizevent;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.t;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openMAC";

    static {
        kge.a(-13045114);
        kge.a(-1413102650);
    }

    @Override // tb.iyd
    public void a(iye iyeVar, iyb iybVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
        } else if (iyeVar == null || (b = iyeVar.b()) == null) {
        } else {
            JSONObject jSONObject = b.getJSONObject("fields");
            Bundle bundle = new Bundle();
            bundle.putSerializable("fields", jSONObject);
            try {
                t.a().a(iyeVar.a()).a(bundle).a("https://maccolor.taobao.com/home.htm");
            } catch (Exception unused) {
            }
        }
    }
}
