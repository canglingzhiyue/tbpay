package com.android.alibaba.ip.common;

import java.util.logging.Level;
import tb.kge;

/* loaded from: classes3.dex */
public class Log {
    public static Logging logging;

    /* loaded from: classes3.dex */
    public interface Logging {
        boolean isLoggable(Level level);

        void log(Level level, String str);

        void log(Level level, String str, Throwable th);
    }

    static {
        kge.a(-969562681);
        logging = null;
    }
}
