package com.alipay.mobile.security.bio.runtime.download;

import android.content.Context;

/* loaded from: classes3.dex */
public interface BioResDownloader {
    public static final int ERROR_UNKNOWN_ERROR = 10000;
    public static final int TASK_STATUS_CANCELLED = 3;
    public static final int TASK_STATUS_COMPLETE = 2;
    public static final int TASK_STATUS_DOWNLOADING = 1;
    public static final int TASK_STATUS_ERROR = -1;
    public static final int TASK_STATUS_INIT = 0;

    /* loaded from: classes3.dex */
    public interface BioDownloadTask {
        void cancel();

        BioDownloadItem getDownloadItem();

        int getStatus();
    }

    /* loaded from: classes3.dex */
    public interface Callback {
        void onComplete(BioDownloadTask bioDownloadTask);

        void onError(BioDownloadTask bioDownloadTask, int i, String str);

        void onProgress(BioDownloadTask bioDownloadTask, long j, long j2);

        void onStart(BioDownloadTask bioDownloadTask);
    }

    void destroy();

    void init(Context context);

    BioDownloadTask startDownload(Context context, BioDownloadItem bioDownloadItem, Callback callback);
}
