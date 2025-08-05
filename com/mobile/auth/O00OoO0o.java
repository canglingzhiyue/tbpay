package com.mobile.auth;

import com.cmic.sso.sdk.a;

/* loaded from: classes4.dex */
public class O00OoO0o extends O00OoOO0 {
    private final O00Oo00 O00000Oo;
    private boolean O00000o0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O00OoO0o(String str, O00Oo00 o00Oo00, String str2, String str3) {
        super(str, o00Oo00, str2, str3);
        this.O00000o0 = false;
        this.O00000Oo = o00Oo00;
    }

    public void O000000o(a aVar) {
        O00OO0O O00000o0 = this.O00000Oo.O00000o0();
        O00000o0.O0000oOo(aVar.b("socketip"));
        O0O000o.O00000Oo("GetPrePhonescripParam", "socket socketip = " + aVar.b("socketip"));
        if (!this.O00000o0) {
            String[] strArr = null;
            if (!aVar.b("isCloseIpv4", false)) {
                strArr = O0Oo0o0.O000000o(true);
                O00000o0.O0000o(strArr[0]);
            }
            if (!aVar.b("isCloseIpv6", false)) {
                if (strArr == null) {
                    strArr = O0Oo0o0.O000000o(true);
                }
                O00000o0.O0000oO0(strArr[1]);
            }
            this.O00000o0 = true;
        }
        O00000o0.O0000o0(O00000o0.O0000oo0(aVar.b("appkey")));
        this.O00000Oo.O000000o(O00000o0);
        this.O00000Oo.O000000o(true);
        this.O000000o = this.O00000Oo.O00000Oo().toString();
    }
}
