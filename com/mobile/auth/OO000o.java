package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.O000000o;
import tb.dbd;

/* loaded from: classes4.dex */
public class OO000o extends dbd {
    private O000000o.C0294O000000o O000000o;
    private boolean O00000Oo;
    private com.mobile.auth.gatewayauth.manager.base.O00000Oo O00000o0;

    public OO000o(boolean z) {
        super(z);
    }

    public void O000000o(O000000o.C0294O000000o c0294O000000o) {
        try {
            this.O000000o = c0294O000000o;
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
            this.O00000o0 = o00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(boolean z) {
        try {
            this.O00000Oo = z;
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
            return this.O00000Oo;
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

    public com.mobile.auth.gatewayauth.manager.base.O00000Oo O00000Oo() {
        try {
            return this.O00000o0;
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

    public O000000o.C0294O000000o O00000o0() {
        try {
            return this.O000000o;
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

    @Override // tb.dbd
    public boolean isResultTimeout() {
        return false;
    }
}
