package com.alibaba.android.icart.core.data.request;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bcb;
import tb.bcr;
import tb.jnv;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(30969226);
    }

    public c(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // com.alibaba.android.icart.core.data.request.b
    public String a(RequestConfig requestConfig, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880760cb", new Object[]{this, requestConfig, jnvVar});
        }
        new bcr(this.f2310a, this.f2310a.n().m(), new com.alibaba.android.ultron.trade.data.request.c()).b(jnvVar, null, requestConfig.c());
        return null;
    }
}
