package com.alipay.android.msp.plugin.model;

/* loaded from: classes3.dex */
public class FingerprintPayResult {
    public String mData;
    public String mMessage;
    public FingerprintPayStatus mPayStatus;
    public FingerprintProgressStatus mProgressStatus;
    public FingerprintRegStatus mRegStatus;
    public int mResult;
    public String mTokenId;
    public int mType;

    /* loaded from: classes3.dex */
    public enum FingerprintPayStatus {
        SUCCESS,
        FAILED,
        BUSY,
        CANCELED,
        TOPWD,
        TIMEOUT
    }

    /* loaded from: classes3.dex */
    public enum FingerprintProgressStatus {
        SUCCESS,
        FAILED,
        BUSY,
        VERIFYING,
        CANCELED,
        TOPWD,
        TIMEOUT,
        RETRY_ING,
        RETRY_LIMIT
    }

    /* loaded from: classes3.dex */
    public enum FingerprintRegStatus {
        SUCCESS,
        FAILED,
        BUSY,
        CANCELED,
        TIMEOUT
    }
}
