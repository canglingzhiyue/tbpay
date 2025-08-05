package com.alipay.mobile.verifyidentity.proxy.rpc;

import android.os.Bundle;

/* loaded from: classes3.dex */
public interface VIMessageChannel {
    public static final String K_ACTION_TYPE = "action";
    public static final String K_DATA = "data";
    public static final String V_TYPE_RPC = "viRpcRequest";

    void onAction(Bundle bundle, VIMessageChannelCallback vIMessageChannelCallback);
}
