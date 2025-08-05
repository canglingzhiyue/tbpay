package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dax;
import tb.day;
import tb.dbc;

/* loaded from: classes4.dex */
public class O0o0 extends day<OO000o0> {
    private static final String O000000o = "com.mobile.auth.O0o0";

    public O0o0(dax<OO000o0> daxVar, dbc<OO000o0> dbcVar) {
        super(daxVar, dbcVar, ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.LIST, 500L, OO000o0.class);
    }

    @Override // tb.day
    public String getKey() {
        try {
            return O000000o;
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
