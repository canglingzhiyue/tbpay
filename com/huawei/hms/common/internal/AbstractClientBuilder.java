package com.huawei.hms.common.internal;

import android.content.Context;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;

/* loaded from: classes4.dex */
public abstract class AbstractClientBuilder<TClient extends AnyClient, TOption> {
    /* renamed from: buildClient */
    public abstract TClient mo784buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks);
}
