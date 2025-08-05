package com.taobao.android.weexdownloader.downloader;

/* loaded from: classes6.dex */
public enum DownloadStatus {
    DOWNLOAD_START(""),
    DOWNLOAD_SUCCESS(""),
    DOWNLOAD_CANCEL(""),
    DOWNLOAD_FAIL("fail"),
    DOWNLOAD_LOADING("");
    
    private String reason;

    DownloadStatus(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
