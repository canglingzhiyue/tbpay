package com.alipay.mobile.common.transport.http;

/* loaded from: classes3.dex */
public class ResponseSizeModel {
    public long compressedSize;
    public long rawSize;

    public ResponseSizeModel() {
    }

    public ResponseSizeModel(long j, long j2) {
        this.compressedSize = j;
        this.rawSize = j2;
    }
}
