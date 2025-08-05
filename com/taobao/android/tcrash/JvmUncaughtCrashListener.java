package com.taobao.android.tcrash;

import java.util.Map;

/* loaded from: classes6.dex */
public interface JvmUncaughtCrashListener {
    Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th);
}
