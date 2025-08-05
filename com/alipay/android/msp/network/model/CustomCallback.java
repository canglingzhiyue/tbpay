package com.alipay.android.msp.network.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class CustomCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CustomCallback defaultCallback = new CustomCallback() { // from class: com.alipay.android.msp.network.model.CustomCallback.1
    };

    /* loaded from: classes3.dex */
    public enum WhatNext {
        CONTINUE,
        TERMINATE
    }

    public WhatNext onBuildRequestConfig(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WhatNext) ipChange.ipc$dispatch("a3149ad9", new Object[]{this, requestConfig}) : WhatNext.CONTINUE;
    }

    public WhatNext onReqEnd(NetResponseData netResponseData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WhatNext) ipChange.ipc$dispatch("794dde76", new Object[]{this, netResponseData}) : WhatNext.CONTINUE;
    }

    public WhatNext onReqException(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WhatNext) ipChange.ipc$dispatch("68312b45", new Object[]{this, th}) : WhatNext.CONTINUE;
    }
}
