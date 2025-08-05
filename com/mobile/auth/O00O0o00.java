package com.mobile.auth;

import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes4.dex */
public class O00O0o00 implements O00O0Oo0 {
    private O00O0Oo0 O000000o;
    private O00o0 O00000Oo;
    private final O00O0o O00000o0 = new O00O0o();

    public void O000000o(O00O0Oo0 o00O0Oo0) {
        this.O000000o = o00O0Oo0;
    }

    @Override // com.mobile.auth.O00O0Oo0
    public void O000000o(O00OoOO0 o00OoOO0, O00o0 o00o0, a aVar) {
        O00000Oo(o00OoOO0, o00o0, aVar);
    }

    public void O00000Oo(final O00OoOO0 o00OoOO0, final O00o0 o00o0, final a aVar) {
        if (this.O000000o != null) {
            this.O00000Oo = new O00o0() { // from class: com.mobile.auth.O00O0o00.1
                @Override // com.mobile.auth.O00o0
                public void O000000o(O00o000 o00o000) {
                    if (!o00OoOO0.O0000Oo0()) {
                        o00o0.O000000o(o00o000);
                        return;
                    }
                    O0O000o.O000000o("RetryAndRedirectInterceptor", ResponseProtocolType.RETRY + o00OoOO0.O000000o());
                    O00O0o00.this.O00000Oo(o00OoOO0, o00o0, aVar);
                }

                @Override // com.mobile.auth.O00o0
                public void O000000o(O00o00 o00o00) {
                    if (o00o00.O00000o()) {
                        O00O0o00.this.O00000Oo(O00O0o00.this.O00000o0.O000000o(o00OoOO0, o00o00, aVar), o00o0, aVar);
                    } else if (TextUtils.isEmpty(O00O0o00.this.O00000o0.O000000o())) {
                        o00o0.O000000o(o00o00);
                    } else {
                        O00O0o00.this.O00000Oo(O00O0o00.this.O00000o0.O00000Oo(o00OoOO0, o00o00, aVar), o00o0, aVar);
                    }
                }
            };
            this.O000000o.O000000o(o00OoOO0, this.O00000Oo, aVar);
        }
    }
}
