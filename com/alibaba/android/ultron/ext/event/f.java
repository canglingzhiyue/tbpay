package com.alibaba.android.ultron.ext.event;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_URL = "url";

    static {
        kge.a(508341324);
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(com.alibaba.android.ultron.event.base.e eVar) {
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
        b(eVar, "openUrl", d(eVar));
        if (!Boolean.valueOf(d.getBooleanValue("dismissCurrentPage")).booleanValue() || !(eVar.a() instanceof Activity)) {
            return;
        }
        ((Activity) eVar.a()).finish();
    }
}
