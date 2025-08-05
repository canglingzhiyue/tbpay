package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import tb.dbd;

/* loaded from: classes4.dex */
public class OO000OO extends dbd {
    private ConfigRule O000000o;

    public OO000OO(boolean z) {
        super(z);
    }

    public OO000OO(boolean z, ConfigRule configRule) {
        super(z);
        this.O000000o = configRule;
    }

    public ConfigRule O000000o() {
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
