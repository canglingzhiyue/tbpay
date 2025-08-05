package com.android.alibaba.ip.server;

import com.android.alibaba.ip.common.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;
import tb.kge;

/* loaded from: classes3.dex */
public class Logging {
    public static final String LOG_TAG = "InstantPatcher";

    static {
        kge.a(-1183579718);
        Log.logging = new Log.Logging() { // from class: com.android.alibaba.ip.server.Logging.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.alibaba.ip.common.Log.Logging
            public void log(Level level, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b26a33ac", new Object[]{this, level, str});
                } else {
                    log(level, str, null);
                }
            }

            @Override // com.android.alibaba.ip.common.Log.Logging
            public boolean isLoggable(Level level) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("193a3bc3", new Object[]{this, level})).booleanValue();
                }
                if (level == Level.SEVERE) {
                    return android.util.Log.isLoggable(Logging.LOG_TAG, 6);
                }
                if (level == Level.FINE) {
                    return android.util.Log.isLoggable(Logging.LOG_TAG, 2);
                }
                return android.util.Log.isLoggable(Logging.LOG_TAG, 4);
            }

            @Override // com.android.alibaba.ip.common.Log.Logging
            public void log(Level level, String str, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee5503c9", new Object[]{this, level, str, th});
                } else if (level != Level.SEVERE) {
                    Level level2 = Level.FINE;
                } else if (th == null) {
                    android.util.Log.e(Logging.LOG_TAG, str);
                } else {
                    android.util.Log.e(Logging.LOG_TAG, str, th);
                }
            }
        };
    }
}
