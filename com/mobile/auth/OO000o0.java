package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.dbd;

/* loaded from: classes4.dex */
public class OO000o0 extends dbd {
    private boolean O000000o;
    private boolean O00000Oo;
    private String O00000o0;

    public OO000o0(boolean z, boolean z2) {
        super(z);
        this.O00000Oo = false;
        this.O000000o = z2;
    }

    public String O000000o() {
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

    public void O000000o(String str) {
        try {
            this.O00000o0 = str;
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
            this.O000000o = z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // tb.dbd
    public boolean isResultTimeout() {
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
}
