package com.mobile.auth;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.cmic.sso.sdk.a;
import com.mobile.auth.O000o000;

/* loaded from: classes4.dex */
public class O000o00 implements O000o000.O000000o {
    private static O000o00 O000000o;
    private O00O0Oo O00000Oo;
    private O000o000 O00000o;
    private O00O0Oo O00000o0;
    private Context O00000oO;

    private O000o00(Context context) {
        this.O00000oO = context;
        O00000Oo();
    }

    public static O000o00 O000000o(Context context) {
        if (O000000o == null) {
            synchronized (O000o00.class) {
                if (O000000o == null) {
                    O000000o = new O000o00(context);
                }
            }
        }
        return O000000o;
    }

    private void O00000Oo() {
        String O00000Oo = O0O0o00.O00000Oo("sdk_config_version", "");
        if (StringUtils.isEmpty(O00000Oo) || !BuildConfig.CMCC_SDK_VERSION.equals(O00000Oo)) {
            this.O00000o = O000o000.O000000o(true);
            this.O00000Oo = this.O00000o.O000000o();
            if (!StringUtils.isEmpty(O00000Oo)) {
                O00000o0();
            }
        } else {
            this.O00000o = O000o000.O000000o(false);
            this.O00000Oo = this.O00000o.O00000Oo();
        }
        this.O00000o.O000000o(this);
        this.O00000o0 = this.O00000o.O000000o();
    }

    private void O00000o0() {
        O0O000o.O00000Oo("UmcConfigManager", "delete localConfig");
        this.O00000o.O00000o0();
    }

    public O00O0Oo O000000o() {
        try {
            return this.O00000Oo.clone();
        } catch (CloneNotSupportedException unused) {
            return this.O00000o0;
        }
    }

    public void O000000o(a aVar) {
        this.O00000o.O000000o(aVar);
    }

    @Override // com.mobile.auth.O000o000.O000000o
    public void O000000o(O00O0Oo o00O0Oo) {
        this.O00000Oo = o00O0Oo;
    }
}
