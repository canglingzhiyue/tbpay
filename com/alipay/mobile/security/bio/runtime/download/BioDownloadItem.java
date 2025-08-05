package com.alipay.mobile.security.bio.runtime.download;

/* loaded from: classes3.dex */
public interface BioDownloadItem {
    String getFileName();

    String getMd5();

    String getSavePath();

    String getUrl();

    String getVersion();

    void setSavePath(String str);
}
