package com.alibaba.android.ultron.event.ext;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.bkd;
import tb.kge;

/* loaded from: classes2.dex */
public class i extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_URL = "url";

    static {
        kge.a(1896170572);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-8769417545223596352";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (TextUtils.isEmpty(e(eVar).getString("url"))) {
            HashMap hashMap = new HashMap();
            hashMap.put("fields", eVar.d().getFields().toString());
            hashMap.put("event", e(eVar).toString());
            bkd.a("OpenUrlV2Subscriber", "事件 url 为空", "onHandleEventChain", hashMap);
        } else {
            c(eVar, "openUrl", e(eVar));
            Boolean bool = e(eVar).getBoolean("animated");
            if (bool == null || bool.booleanValue()) {
                return;
            }
            Context a2 = eVar.a();
            if (!(a2 instanceof Activity)) {
                return;
            }
            ((Activity) a2).overridePendingTransition(0, 0);
        }
    }
}
