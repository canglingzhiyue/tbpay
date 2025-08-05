package com.mobile.auth;

import android.content.Context;
import com.cmic.sso.sdk.a;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class O0OO00O {
    private static final ExecutorService O000000o = new ThreadPoolExecutor(0, 30, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* loaded from: classes4.dex */
    public static abstract class O000000o implements Runnable {
        private final Thread.UncaughtExceptionHandler O000000o;

        /* JADX INFO: Access modifiers changed from: protected */
        public O000000o() {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.O0OO00O.O000000o.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    th.printStackTrace();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public O000000o(final Context context, final a aVar) {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.O0OO00O.O000000o.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    aVar.a().O000000o.add(th);
                    O000o.O000000o(context).O000000o("200025", "发生未知错误", aVar, null);
                }
            };
        }

        protected abstract void O000000o();

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setUncaughtExceptionHandler(this.O000000o);
            O000000o();
            Thread.currentThread().setUncaughtExceptionHandler(null);
        }
    }

    public static void O000000o(O000000o o000000o) {
        try {
            O000000o.execute(o000000o);
        } catch (Exception e) {
            o000000o.O000000o.uncaughtException(Thread.currentThread(), e);
        }
    }
}
