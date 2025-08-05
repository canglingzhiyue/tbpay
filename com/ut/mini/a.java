package com.ut.mini;

import tb.rpw;

/* loaded from: classes.dex */
public interface a {
    String getUTAppVersion();

    String getUTChannel();

    com.ut.mini.crashhandler.a getUTCrashCraughtListener();

    rpw getUTRequestAuthInstance();

    boolean isAliyunOsSystem();

    boolean isUTCrashHandlerDisable();

    boolean isUTLogEnable();
}
