package com.alibaba.android.ultron.event.ext;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bkd;
import tb.kge;

/* loaded from: classes2.dex */
public class e extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_EVENT_PARAM = "defaultEventParamEventModel";

    /* renamed from: a  reason: collision with root package name */
    private final String f2591a = "DefaultEventV2Subscriber";

    static {
        kge.a(1687882874);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            String b = eVar.b();
            if (com.taobao.android.adam.common.b.a(eVar, b)) {
                return;
            }
            bkd.a("DefaultEventV2Subscriber", bkd.ERROR_CODE_EVENT_CHAIN_NOT_FOUND, "not found eventchain = " + b);
        }
    }
}
