package com.ut.share;

import com.ut.share.data.ShareData;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareResponse {
    public ShareData data;
    public ErrorCode errorCode;
    public String errorMessage;
    public SharePlatform platform;

    /* loaded from: classes9.dex */
    public enum ErrorCode {
        ERR_SUCCESS,
        ERR_CANCEL,
        ERR_FAIL,
        ERR_START
    }

    static {
        kge.a(-287199282);
    }

    public ShareResponse() {
    }

    public ShareResponse(SharePlatform sharePlatform, ShareData shareData, ErrorCode errorCode, String str) {
        this.platform = sharePlatform;
        this.data = shareData;
        this.errorCode = errorCode;
        this.errorMessage = str;
    }
}
