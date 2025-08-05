package com.mobile.auth.gatewayauth.utils;

import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.TokenResultListener;
import com.mobile.auth.gatewayauth.model.TokenRet;
import java.lang.Thread;
import java.util.concurrent.Future;
import tb.czp;

/* loaded from: classes4.dex */
public class O0000O0o {

    /* loaded from: classes4.dex */
    public static abstract class O000000o implements Runnable {
        private Thread.UncaughtExceptionHandler O000000o;

        /* JADX INFO: Access modifiers changed from: protected */
        public O000000o() {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    try {
                        O0000Oo0.O00000o0("未知异常:" + czp.a(th));
                    } catch (Throwable th2) {
                        try {
                            ExceptionProcessor.processException(th2);
                        } catch (Throwable th3) {
                            ExceptionProcessor.processException(th3);
                        }
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public O000000o(final TokenResultListener tokenResultListener) {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, final Throwable th) {
                    try {
                        O0000O0o.O000000o(new czp.a() { // from class: com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o.2.1
                            @Override // tb.czp.a
                            protected void onException(Throwable th2) {
                            }

                            @Override // tb.czp.a
                            protected void safeRun() {
                                try {
                                    if (tokenResultListener != null) {
                                        tokenResultListener.onTokenFailed(O0000O0o.O000000o(th));
                                    } else {
                                        O0000Oo0.O000000o(th);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        ExceptionProcessor.processException(th2);
                                    } catch (Throwable th3) {
                                        ExceptionProcessor.processException(th3);
                                    }
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            ExceptionProcessor.processException(th2);
                        } catch (Throwable th3) {
                            ExceptionProcessor.processException(th3);
                        }
                    }
                }
            };
        }

        protected abstract void O000000o();

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.currentThread().setUncaughtExceptionHandler(this.O000000o);
                O000000o();
                Thread.currentThread().setUncaughtExceptionHandler(null);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static String O000000o(Throwable th) {
        try {
            TokenRet tokenRet = new TokenRet();
            tokenRet.setCode(com.mobile.auth.gatewayauth.utils.O000000o.O000000o ? ResultCode.CODE_ERROR_UNKNOWN_FAIL : Constant.CODE_ERROR_UNKNOWN_FAIL);
            tokenRet.setMsg("未知异常:" + czp.a(th));
            return tokenRet.toJsonString();
        } catch (Throwable th2) {
            try {
                ExceptionProcessor.processException(th2);
                return null;
            } catch (Throwable th3) {
                ExceptionProcessor.processException(th3);
                return null;
            }
        }
    }

    public static Future<?> O000000o(Runnable runnable) {
        try {
            return czp.a().a(runnable);
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

    public static void O000000o(czp.a aVar) {
        try {
            czp.a().b(aVar);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
