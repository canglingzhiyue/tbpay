package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class O000Oo0 {
    private static ThreadPoolExecutor O000000o;
    private static O000Oo0 O00000Oo;

    /* loaded from: classes4.dex */
    public static abstract class O000000o implements Runnable {
        private boolean O000000o = false;

        public void O000000o(boolean z) {
            try {
                this.O000000o = z;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }

        public boolean O000000o() {
            try {
                return this.O000000o;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return false;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return false;
                }
            }
        }
    }

    private O000Oo0() {
        O00000Oo();
    }

    public static O000Oo0 O000000o() {
        try {
            if (O00000Oo == null) {
                O00000Oo = new O000Oo0();
            }
            return O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private void O00000Oo() {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            O000000o = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(Runnable runnable) {
        try {
            O000000o.execute(runnable);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public Future O00000Oo(Runnable runnable) {
        try {
            return O000000o.submit(runnable);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
