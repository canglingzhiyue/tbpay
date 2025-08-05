package com.alipay.mobile.common.amnet.api.model;

import com.alipay.mobile.common.transportext.Transport;

/* loaded from: classes3.dex */
public class ActivatingParams {
    public Transport.Activating activating;
    public boolean canUseBifrost;
    public boolean isReconnect;

    public ActivatingParams() {
    }

    public ActivatingParams(Transport.Activating activating, boolean z, boolean z2) {
        this.activating = activating;
        this.isReconnect = z;
        this.canUseBifrost = z2;
    }
}
