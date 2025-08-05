package com.uc.webview.export.multiprocess.helper;

import android.os.StrictMode;
import java.io.Closeable;

/* loaded from: classes9.dex */
final class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f23850a;
    private final StrictMode.VmPolicy b;

    private d(StrictMode.ThreadPolicy threadPolicy) {
        this.f23850a = threadPolicy;
        this.b = null;
    }

    private d(StrictMode.ThreadPolicy threadPolicy, byte b) {
        this(threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a() {
        return new d(StrictMode.allowThreadDiskReads(), (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f23850a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
