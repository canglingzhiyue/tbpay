package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dax;
import tb.day;

/* loaded from: classes4.dex */
public class O0o extends day<OO000o> {
    private String O000000o;

    public O0o(O0Oo00 o0Oo00, dax<OO000o> daxVar, long j, String str) {
        super(daxVar, o0Oo00, ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.LIST, j, OO000o.class);
        this.O000000o = str;
    }

    @Override // tb.day
    public String getKey() {
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
}
