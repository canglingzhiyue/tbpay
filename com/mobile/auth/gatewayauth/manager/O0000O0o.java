package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import android.util.SparseArray;
import com.mobile.auth.O0OOOOO;
import com.mobile.auth.O0OOOo0;
import com.mobile.auth.OO0000;
import com.mobile.auth.OO0oO;
import com.mobile.auth.Oo0OOo;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dax;
import tb.dba;

/* loaded from: classes4.dex */
public class O0000O0o {
    private O0OOOOO O000000o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface O000000o {
        void O000000o(String str, String str2);

        void O000000o(String str, String str2, SparseArray<VendorConfig> sparseArray);
    }

    public O0000O0o(O0OOOOO o0ooooo) {
        this.O000000o = o0ooooo;
    }

    public static final O0000O0o O000000o(Context context, VendorSdkInfoManager vendorSdkInfoManager, O00000Oo o00000Oo, OO0oO oO0oO) {
        try {
            return new O0000O0o(new O0OOOo0(context, vendorSdkInfoManager, o00000Oo, oO0oO));
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

    public void O000000o(final O000000o o000000o) {
        try {
            dba.a().a(new Oo0OOo(new dax<OO0000>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.O0000O0o.1
                public void O000000o(OO0000 oo0000) {
                    try {
                        if (o000000o == null) {
                            return;
                        }
                        if (oo0000.O000000o()) {
                            o000000o.O000000o(oo0000.O00000o0(), oo0000.O00000Oo(), oo0000.O00000oO());
                        } else {
                            o000000o.O000000o(oo0000.O00000o0(), oo0000.O00000Oo());
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.dax
                public /* synthetic */ void onResult(OO0000 oo0000) {
                    try {
                        O000000o(oo0000);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, this.O000000o));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
