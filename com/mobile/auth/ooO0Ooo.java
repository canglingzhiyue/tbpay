package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dax;
import tb.day;

/* loaded from: classes4.dex */
public class ooO0Ooo extends day<OO00OO> {
    private String O000000o;

    public ooO0Ooo(com.mobile.auth.gatewayauth.manager.O0000OOo o0000OOo, dax<OO00OO> daxVar, long j, String str, O000000o.O00000Oo o00000Oo) {
        super(daxVar, new O0Oo0(o0000OOo, str, o00000Oo, j), ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.LIST, j, OO00OO.class);
        this.O000000o = o00000Oo.O00000Oo();
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
