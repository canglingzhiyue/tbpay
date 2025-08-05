package com.mobile.auth;

import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.RequestCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.czp;
import tb.dbc;

/* loaded from: classes4.dex */
public abstract class O0Oo00 implements dbc<OO000o> {
    private com.mobile.auth.gatewayauth.manager.O0000OOo O000000o;
    private String O00000Oo;
    private String O00000o;
    private long O00000o0;

    public O0Oo00(com.mobile.auth.gatewayauth.manager.O0000OOo o0000OOo, String str, long j, String str2) {
        this.O000000o = o0000OOo;
        this.O00000Oo = str;
        this.O00000o0 = j;
        this.O00000o = str2;
    }

    public OO000o O000000o() {
        try {
            OO000o oO000o = new OO000o(true);
            oO000o.O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"));
            return oO000o;
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

    public abstract void O000000o(RequestCallback requestCallback, com.mobile.auth.gatewayauth.manager.O000000o o000000o);

    public OO000o O00000Oo() {
        try {
            com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(this.O00000o, "doRequest", System.currentTimeMillis());
            com.mobile.auth.gatewayauth.manager.O000000o O000000o = this.O000000o.O000000o(this.O00000Oo);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final OO000o oO000o = new OO000o(false);
            O000000o(new RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.O0Oo00.1
                public void O000000o(O000000o.C0294O000000o c0294O000000o) {
                    try {
                        oO000o.O000000o(true);
                        oO000o.O000000o(c0294O000000o);
                        oO000o.O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o().O00000o0(c0294O000000o.O00000o0()).O000000o(c0294O000000o.O00000o()).O000000o());
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                    try {
                        oO000o.O000000o(o00000Oo);
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                    try {
                        O000000o(o00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onSuccess(O000000o.C0294O000000o c0294O000000o) {
                    try {
                        O000000o(c0294O000000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, O000000o);
            try {
                long j = 5000;
                if (this.O00000o0 > 5000) {
                    j = this.O00000o0;
                }
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                oO000o.O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, czp.a(e)));
            }
            return oO000o;
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

    @Override // java.util.concurrent.Callable
    public /* synthetic */ Object call() throws Exception {
        try {
            return O00000Oo();
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

    @Override // tb.dbc
    public /* synthetic */ OO000o onTimeout() {
        try {
            return O000000o();
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
