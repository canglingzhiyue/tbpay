package com.mobile.auth.gatewayauth;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class O00000Oo {
    private Runnable O000000o;
    private AtomicBoolean O00000Oo;
    private long O00000o;
    private Handler O00000o0;
    private Runnable O00000oO;
    private volatile boolean O00000oo;

    public O00000Oo(long j, Runnable runnable) {
        this(j, runnable, Looper.getMainLooper());
    }

    public O00000Oo(long j, Runnable runnable, Looper looper) {
        this.O00000Oo = new AtomicBoolean(false);
        this.O00000oo = false;
        this.O00000o = j;
        this.O00000oO = runnable;
        this.O00000o0 = new Handler(looper);
    }

    static /* synthetic */ boolean O000000o(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O00000oo;
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

    static /* synthetic */ AtomicBoolean O00000Oo(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O00000Oo;
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

    static /* synthetic */ Runnable O00000o0(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O00000oO;
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

    public void O000000o() {
        try {
            if (this.O00000oO == null || this.O00000o <= 0) {
                return;
            }
            this.O000000o = new Runnable() { // from class: com.mobile.auth.gatewayauth.O00000Oo.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        synchronized (O00000Oo.this) {
                            if (!O00000Oo.O000000o(O00000Oo.this)) {
                                O00000Oo.O00000Oo(O00000Oo.this).set(true);
                                O00000Oo.O00000o0(O00000Oo.this).run();
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            };
            this.O00000o0.postDelayed(this.O000000o, this.O00000o);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public synchronized void O00000Oo() {
        try {
            this.O00000oo = true;
            if (this.O000000o != null) {
                this.O00000o0.removeCallbacks(this.O000000o);
            }
            this.O00000oO = null;
            this.O000000o = null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public synchronized boolean O00000o() {
        try {
            boolean O00000o0 = O00000o0();
            O00000Oo();
            return !O00000o0;
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

    public boolean O00000o0() {
        try {
            return this.O00000Oo.get();
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
