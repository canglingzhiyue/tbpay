package com.alibaba.android.ultron.event.ext;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class r extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    public static final String VALUE_STATUS_SUCCESS = "success";

    static {
        kge.a(-243781976);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-3462074060888466646";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (eVar.d() != null && eVar.d().getFields() != null && (eVar.d().getFields().get("asyncStatus") instanceof String)) {
            eVar.d().getFields().put("asyncStatus", eVar.d().getFields().get("asyncStatus"));
        } else {
            eVar.d().getFields().put("asyncStatus", "success");
        }
    }
}
