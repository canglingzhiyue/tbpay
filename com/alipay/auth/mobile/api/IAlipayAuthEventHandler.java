package com.alipay.auth.mobile.api;

/* loaded from: classes3.dex */
public interface IAlipayAuthEventHandler {
    void alipayAuthDidCancel();

    void alipayAuthFailure();

    void alipayAuthSuccess(String str);
}
