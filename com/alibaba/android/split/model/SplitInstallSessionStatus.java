package com.alibaba.android.split.model;

/* loaded from: classes2.dex */
public @interface SplitInstallSessionStatus {
    public static final int CANCELED = 7;
    public static final int CANCELING = 9;
    public static final int DOWNLOADED = 3;
    public static final int DOWNLOADING = 2;
    public static final int DOWNLOAD_FINISH = 13;
    public static final int FAILED = 6;
    public static final int INSTALLED = 5;
    public static final int INSTALLING = 4;
    public static final int LOADING = 11;
    public static final int PENDING = 1;
    public static final int SUSPEND = 8;
    public static final int UNINSTALL = 12;
    public static final int UNKNOWN = 0;
    public static final int VERIFYING = 10;
}
