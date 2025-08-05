package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dax;
import tb.day;
import tb.dbc;

/* loaded from: classes4.dex */
public class O0o00 extends day<OO000OO> {
    private static final String O000000o = "com.mobile.auth.O0o00";

    public O0o00(dax<OO000OO> daxVar, dbc<OO000OO> dbcVar, long j, Class<OO000OO> cls) {
        super(daxVar, dbcVar, ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.COVER, j, cls);
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
