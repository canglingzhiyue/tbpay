package com.alibaba.android.split;

/* loaded from: classes.dex */
public interface j {
    public static final String ARG_DEFFERED_INSTALL = "deffered_install";
    public static final String ARG_DOWNLOAD = "download";
    public static final String ARG_INSTALL = "install";
    public static final String ARG_INSTALL_HISTORY = "install_history";
    public static final String ARG_INSTALL_PRELOAD = "install_preload";
    public static final String ARG_INSTALL_UPDATE = "install_update";
    public static final String ARG_LOAD = "load";
    public static final String ARG_MERGE = "merge";
    public static final String ARG_START_INSTALL = "start_install";
    public static final String ARG_SYNC_DT = "syncSplitDT";
    public static final String ARG_SYNC_SPLIT = "syncSplitFile";
    public static final String ARG_UPDATE = "update";
    public static final String ARG_VERIFY = "verify";
    public static final String MODULE = "splitBundle";
    public static final String MODULE_POINT = "splitLoader";

    @Deprecated
    void a(String str, boolean z, int i, long j, int i2, String str2, long j2);

    @Deprecated
    void a(String str, boolean z, String str2, long j, int i, String str3, long j2);

    void a(String str, boolean z, String str2, long j, int i, String str3, String str4, long j2, long j3, long j4, boolean z2, boolean z3);
}
