package org.android.netutil;

/* loaded from: classes.dex */
public interface PingTaskWatcher {
    void OnEntry(int i, int i2, double d);

    void OnFailed(int i);

    void OnFinished();
}
