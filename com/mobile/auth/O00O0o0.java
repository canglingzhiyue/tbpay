package com.mobile.auth;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import com.cmic.sso.sdk.a;
import com.mobile.auth.O0OO00O;
import com.mobile.auth.O0OOO00;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class O00O0o0 implements O00O0Oo0 {
    private O00O0Oo0 O000000o;

    public void O000000o(O00O0Oo0 o00O0Oo0) {
        this.O000000o = o00O0Oo0;
    }

    @Override // com.mobile.auth.O00O0Oo0
    public void O000000o(final O00OoOO0 o00OoOO0, final O00o0 o00o0, final a aVar) {
        if (!o00OoOO0.O00000Oo()) {
            O00000Oo(o00OoOO0, o00o0, aVar);
            return;
        }
        O0OOO00 O000000o = O0OOO00.O000000o((Context) null);
        if (Build.VERSION.SDK_INT >= 21) {
            O000000o.O000000o(new O0OOO00.O000000o() { // from class: com.mobile.auth.O00O0o0.1
                private final AtomicBoolean O00000oO = new AtomicBoolean(false);

                @Override // com.mobile.auth.O0OOO00.O000000o
                public void O000000o(final Network network) {
                    if (!this.O00000oO.getAndSet(true)) {
                        O0OO00O.O000000o(new O0OO00O.O000000o(null, aVar) { // from class: com.mobile.auth.O00O0o0.1.1
                            @Override // com.mobile.auth.O0OO00O.O000000o
                            protected void O000000o() {
                                if (network == null) {
                                    o00o0.O000000o(O00o000.O000000o(102508));
                                    return;
                                }
                                O0O000o.O00000Oo("WifiChangeInterceptor", "onAvailable");
                                o00OoOO0.O000000o(network);
                                O00O0o0.this.O00000Oo(o00OoOO0, o00o0, aVar);
                            }
                        });
                    }
                }
            });
            return;
        }
        O0O000o.O000000o("WifiChangeInterceptor", "低版本不在支持wifi切换");
        o00o0.O000000o(O00o000.O000000o(102508));
    }

    public void O00000Oo(O00OoOO0 o00OoOO0, final O00o0 o00o0, a aVar) {
        O00O0Oo0 o00O0Oo0 = this.O000000o;
        if (o00O0Oo0 != null) {
            o00O0Oo0.O000000o(o00OoOO0, new O00o0() { // from class: com.mobile.auth.O00O0o0.2
                @Override // com.mobile.auth.O00o0
                public void O000000o(O00o000 o00o000) {
                    o00o0.O000000o(o00o000);
                }

                @Override // com.mobile.auth.O00o0
                public void O000000o(O00o00 o00o00) {
                    o00o0.O000000o(o00o00);
                }
            }, aVar);
        }
    }
}
