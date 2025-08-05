package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.logger.model.b;

/* loaded from: classes4.dex */
public class OO0O0OO extends OO0O00o<b> {
    @Override // com.mobile.auth.OO0O00o
    protected boolean O000000o(String str) {
        try {
            if (this.O000000o == null) {
                return false;
            }
            return this.O000000o.O000000o(str);
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
