package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;

/* loaded from: classes3.dex */
public interface Config {
    Context getApplicationContext();

    RpcParams getRpcParams();

    Transport getTransport();

    String getUrl();

    boolean isGzip();
}
