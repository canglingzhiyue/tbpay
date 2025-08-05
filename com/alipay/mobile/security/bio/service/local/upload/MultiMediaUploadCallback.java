package com.alipay.mobile.security.bio.service.local.upload;

/* loaded from: classes3.dex */
public interface MultiMediaUploadCallback {
    void onUploadError(String str, int i, String str2);

    void onUploadFinished(String str, String str2);

    void onUploadProgress(String str, int i, long j, long j2);

    void onUploadStart(String str);
}
