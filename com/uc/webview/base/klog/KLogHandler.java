package com.uc.webview.base.klog;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.klog.ILogger;
import com.uc.webview.base.task.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.riy;

/* loaded from: classes9.dex */
public final class KLogHandler {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private static final a f23791a = new a();
        private final ConcurrentLinkedQueue<com.uc.webview.base.klog.a> b = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean c = new AtomicBoolean(false);

        private a() {
        }

        public static void a(com.uc.webview.base.klog.a aVar) {
            a aVar2 = f23791a;
            aVar2.b.add(aVar);
            if (!aVar2.c.get()) {
                aVar2.c.set(true);
                try {
                    if (Build.VERSION.SDK_INT < 30) {
                        AsyncTask.SERIAL_EXECUTOR.execute(aVar2);
                    } else {
                        b.a.f23797a.a(aVar2);
                    }
                } catch (Throwable th) {
                    Log.e("thread", "post to thread pool failed", th);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            do {
                try {
                    com.uc.webview.base.klog.a poll = this.b.poll();
                    while (true) {
                        com.uc.webview.base.klog.a aVar = poll;
                        if (aVar != null) {
                            KLogHandler.b(aVar);
                            poll = this.b.poll();
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            } while (this.b.peek() != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static volatile boolean f23792a = GlobalSettings.getBoolValue(39);
        private static final GlobalSettings.Observer b;

        static {
            GlobalSettings.Observer observer = new GlobalSettings.Observer() { // from class: com.uc.webview.base.klog.KLogHandler.b.1
                @Override // com.uc.webview.base.GlobalSettings.Observer
                public final void onValueChanged(int i, String str) {
                    if (i == 39) {
                        boolean unused = b.f23792a = Boolean.valueOf(str).booleanValue();
                    } else if (i != 68) {
                    } else {
                        com.uc.webview.base.Log.a(Boolean.valueOf(str).booleanValue());
                    }
                }
            };
            b = observer;
            GlobalSettings.addObserver(observer);
            com.uc.webview.base.Log.a(GlobalSettings.getBoolValue(68));
        }
    }

    public static void a(com.uc.webview.base.klog.a aVar) {
        if (!b.f23792a) {
            return;
        }
        a.a(aVar);
    }

    public static void a(boolean z) {
        boolean unused = b.f23792a = z;
        GlobalSettings.set(39, z);
    }

    public static boolean a() {
        return b.f23792a;
    }

    static /* synthetic */ void b(com.uc.webview.base.klog.a aVar) {
        ILogger iLogger = ILogger.Instance.get();
        if (iLogger != null) {
            int i = aVar.f;
            String str = aVar.g;
            String str2 = riy.ARRAY_START_STR + com.uc.webview.base.klog.a.a(aVar.e) + " " + aVar.c + " " + aVar.d + "] " + aVar.h;
            Throwable th = aVar.i;
            if (i == 1) {
                iLogger.i(str, str2, th);
            } else if (i == 2) {
                iLogger.w(str, str2, th);
            } else if (i != 3) {
                iLogger.d(str, str2, th);
            } else {
                iLogger.e(str, str2, th);
            }
        }
    }

    public static void postLogMessage(long j, int i, int i2, int i3, String str, String str2, Throwable th) {
        a(new com.uc.webview.base.klog.a(j, i, i2, i3, str, str2, th));
    }
}
