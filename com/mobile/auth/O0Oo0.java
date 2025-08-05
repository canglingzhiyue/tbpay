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
public class O0Oo0 implements dbc<OO00OO> {
    private com.mobile.auth.gatewayauth.manager.O0000OOo O000000o;
    private O000000o.O00000Oo O00000Oo;
    private long O00000o;
    private String O00000o0;

    public O0Oo0(com.mobile.auth.gatewayauth.manager.O0000OOo o0000OOo, String str, O000000o.O00000Oo o00000Oo, long j) {
        this.O000000o = o0000OOo;
        this.O00000Oo = o00000Oo;
        this.O00000o0 = str;
        this.O00000o = j;
    }

    public OO00OO O000000o() {
        try {
            OO00OO oo00oo = new OO00OO(true);
            oo00oo.O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"));
            return oo00oo;
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

    public OO00OO O00000Oo() {
        try {
            com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(this.O00000Oo.O00000Oo(), "doRequest", System.currentTimeMillis());
            com.mobile.auth.gatewayauth.manager.O000000o O000000o = this.O000000o.O000000o(this.O00000o0);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final OO00OO oo00oo = new OO00OO(false);
            O000000o.O00000o0(new RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.O0Oo0.1
                public void O000000o(O000000o.C0294O000000o c0294O000000o) {
                    try {
                        oo00oo.O000000o(true);
                        oo00oo.O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o().O00000o0(c0294O000000o.O00000o0()).O000000o(c0294O000000o.O00000o()).O000000o());
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
                        oo00oo.O000000o(o00000Oo);
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
            }, this.O00000Oo);
            try {
                long j = 5000;
                if (this.O00000o > 5000) {
                    j = this.O00000o;
                }
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                oo00oo.O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, czp.a(e)));
            }
            return oo00oo;
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
    public /* synthetic */ OO00OO onTimeout() {
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
