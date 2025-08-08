package com.mobile.auth;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.dbc;

/* loaded from: classes4.dex */
public class O0Oo000 implements dbc<OO000o0> {
    private Context O000000o;
    private OO0oO O00000Oo;

    public O0Oo000(Context context, OO0oO oO0oO) {
        this.O000000o = context;
        this.O00000Oo = oO0oO;
    }

    private void O000000o(Context context, OO000o0 oO000o0) {
        try {
            String O00000Oo = com.mobile.auth.gatewayauth.utils.O00000Oo.O00000Oo();
            if (StringUtils.isEmpty(O00000Oo)) {
                oO000o0.O000000o(false);
                return;
            }
            oO000o0.O000000o(true);
            oO000o0.O000000o(O00000Oo);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public OO000o0 O000000o() {
        try {
            return new OO000o0(true, false);
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

    public OO000o0 O00000Oo() throws Exception {
        try {
            OO000o0 oO000o0 = new OO000o0(false, false);
            if (Build.VERSION.SDK_INT >= 21) {
                O000000o(this.O000000o, oO000o0);
            } else {
                oO000o0.O000000o(false);
            }
            return oO000o0;
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

    @Override // tb.dbc
    public /* synthetic */ OO000o0 onTimeout() {
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
