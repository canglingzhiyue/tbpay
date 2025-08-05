package com.alibaba.android.aura.datamodel.nextrpc;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import tb.kge;

/* loaded from: classes2.dex */
public class AURANextRPCIO extends UMFBaseIO {
    public AURANextRPCEndpoint nextRPCEndpoint;
    public String serviceName;

    static {
        kge.a(-929170051);
    }

    public AURANextRPCIO(String str, AURANextRPCEndpoint aURANextRPCEndpoint) {
        this.serviceName = str;
        this.nextRPCEndpoint = aURANextRPCEndpoint;
    }
}
