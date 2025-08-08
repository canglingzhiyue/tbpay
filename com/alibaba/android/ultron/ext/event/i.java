package com.alibaba.android.ultron.ext.event;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class i extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_MSG = "message";

    static {
        kge.a(-1086385810);
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(com.alibaba.android.ultron.event.base.e eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
        } else if (d(eVar) == null || !(d(eVar).get("message") instanceof String) || StringUtils.isEmpty(d(eVar).getString("message"))) {
            if (d(eVar) == null) {
                str = "getEventFields 为空";
            } else {
                str = !(d(eVar).get("message") instanceof String) ? "message 参数有问题" : "message 参数为空";
            }
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            b(eVar, "toast", d(eVar));
        }
    }
}
