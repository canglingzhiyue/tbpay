package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.OO0000;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import tb.dbc;

/* loaded from: classes4.dex */
public abstract class O0OOOOO<T extends OO0000> implements dbc<OO0000> {
    private Context O000000o;
    private com.mobile.auth.gatewayauth.manager.O00000Oo O00000Oo;

    public O0OOOOO(Context context, com.mobile.auth.gatewayauth.manager.O00000Oo o00000Oo) {
        this.O000000o = context.getApplicationContext();
        this.O00000Oo = o00000Oo;
    }

    public abstract T O000000o();

    public abstract T O000000o(String str);

    public OO0000 O00000Oo() {
        try {
            if (this.O00000Oo.O0000Oo()) {
                return O000000o();
            }
            this.O00000Oo.O0000OoO();
            return O000000o(EncryptUtils.generateAesKey());
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

    public Context O00000o0() {
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

    @Override // java.util.concurrent.Callable
    public /* synthetic */ Object call() throws Exception {
        try {
            return O00000Oo();
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
