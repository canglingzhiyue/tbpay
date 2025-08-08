package com.uc.webview.base.timing;

import mtopsdk.common.util.StringUtils;
import com.uc.webview.base.timing.StartupTimingKeys;

/* loaded from: classes9.dex */
public final class TraceEvent implements AutoCloseable {
    private static final boolean STAT = a.f23808a;
    private static final boolean TRACE = a.b;
    private final int mKey;
    private final String mName;

    public TraceEvent(int i, String str) {
        this.mKey = i;
        this.mName = str;
        if (TRACE) {
            doTrace(true);
        }
        if (STAT) {
            doStat(true);
        }
    }

    private void doStat(boolean z) {
        if (STAT && -1 != this.mKey) {
            if (z) {
                a.b().markBegin(this.mKey);
            } else {
                a.b().markEnd(this.mKey);
            }
        }
    }

    private void doTrace(boolean z) {
        if (TRACE && !StringUtils.isEmpty(this.mName)) {
            if (z) {
                a.a(this.mName);
            } else {
                a.a();
            }
        }
    }

    public static TraceEvent scoped(int i) {
        if (!STAT) {
            return null;
        }
        return new TraceEvent(i, StartupTimingKeys.Helper.desc(i));
    }

    public static TraceEvent scoped(int i, boolean z) {
        if (STAT && z) {
            return scoped(i);
        }
        return null;
    }

    public static TraceEvent scoped(String str) {
        if (!TRACE) {
            return null;
        }
        return new TraceEvent(-1, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (TRACE) {
            doTrace(false);
        }
        if (STAT) {
            doStat(false);
        }
    }
}
