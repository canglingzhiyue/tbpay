package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.PnsLoggerHandler;
import com.mobile.auth.gatewayauth.PnsReporter;
import tb.cef;

/* loaded from: classes4.dex */
public class O0OOO0O implements PnsReporter {
    private OO0oO O000000o;
    private com.mobile.auth.gatewayauth.manager.O00000o O00000Oo;
    private com.mobile.auth.gatewayauth.manager.O0000OOo O00000o0;

    public O0OOO0O(OO0oO oO0oO, com.mobile.auth.gatewayauth.manager.O00000o o00000o) {
        this.O000000o = oO0oO;
        this.O00000Oo = o00000o;
    }

    public void O000000o(com.mobile.auth.gatewayauth.manager.O0000OOo o0000OOo) {
        try {
            this.O00000o0 = o0000OOo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setLogExtension(String str) {
        try {
            this.O00000Oo.O00000o0(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setLoggerEnable(boolean z) {
        try {
            System.currentTimeMillis();
            com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(z);
            cef.a(z);
            if (this.O00000o0 == null) {
                return;
            }
            for (com.mobile.auth.gatewayauth.manager.O000000o o000000o : this.O00000o0.O000000o()) {
                if (o000000o != null) {
                    o000000o.O000000o(z);
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

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setLoggerHandler(PnsLoggerHandler pnsLoggerHandler) {
        try {
            this.O000000o.O000000o(pnsLoggerHandler);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setUploadEnable(boolean z) {
        try {
            System.currentTimeMillis();
            com.mobile.auth.gatewayauth.utils.O0000Oo0.O00000Oo(z);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
