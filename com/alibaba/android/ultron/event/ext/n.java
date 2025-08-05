package com.alibaba.android.ultron.event.ext;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bkd;
import tb.kge;

/* loaded from: classes2.dex */
public class n extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_MSG = "message";

    static {
        kge.a(389917038);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (e(eVar) == null || !(e(eVar).get("message") instanceof String) || TextUtils.isEmpty(e(eVar).getString("message"))) {
            if (e(eVar) == null) {
                str = "getEventFields 为空";
            } else {
                str = !(e(eVar).get("message") instanceof String) ? "message 参数有问题" : "message 参数为空";
            }
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            c(eVar, "toast", e(eVar));
        }
    }
}
