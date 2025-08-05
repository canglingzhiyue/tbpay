package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import java.util.UUID;
import tb.dax;
import tb.day;

/* loaded from: classes4.dex */
public class Oo0OOo extends day<OO0000> {
    public Oo0OOo(dax<OO0000> daxVar, O0OOOOO o0ooooo) {
        super(daxVar, o0ooooo, ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.LIST, 5000L, OO0000.class);
    }

    public static synchronized String O000000o() {
        String uuid;
        synchronized (Oo0OOo.class) {
            try {
                uuid = UUID.randomUUID().toString();
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
        return uuid;
    }

    @Override // tb.day
    public String getKey() {
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
