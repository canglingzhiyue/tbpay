package com.mobile.auth;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.cmic.sso.sdk.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class O00O0o {
    private String O000000o;
    private String O00000Oo;

    private O00OoOO0 O000000o(String str, String str2, String str3, O00Oo0 o00Oo0) {
        O00OoOO0 o00OoOO0 = new O00OoOO0(str, o00Oo0, str3, str2);
        if (str3.equals("GET")) {
            o00OoOO0.O000000o("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
        }
        return o00OoOO0;
    }

    public O00OoOO0 O000000o(O00OoOO0 o00OoOO0, O00o00 o00o00, a aVar) {
        List<String> list;
        Map<String, List<String>> O00000Oo = o00o00.O00000Oo();
        if (TextUtils.isEmpty(this.O000000o) && (list = O00000Oo.get("pplocation")) != null && list.size() > 0) {
            this.O000000o = list.get(0);
        }
        O0OO0Oo.O00000Oo(aVar, String.valueOf(o00o00.O000000o()));
        List<String> list2 = O00000Oo.get(HttpConstant.LOCATION);
        if (list2 == null || list2.isEmpty()) {
            list2 = O00000Oo.get(HttpConstant.LOCATION.toLowerCase());
        }
        if (list2 != null && list2.size() > 0) {
            this.O00000Oo = list2.get(0);
            if (!TextUtils.isEmpty(this.O00000Oo)) {
                String b = aVar.b("operatortype", "0");
                O0OO0Oo.O000000o(aVar, "2".equals(b) ? "getUnicomMobile" : "3".equals(b) ? "getTelecomMobile" : "NONE");
            }
        }
        O0O000o.O00000Oo(HttpConstant.LOCATION, this.O00000Oo);
        O00OoOO0 O000000o = O000000o(this.O00000Oo, o00OoOO0.O00000oo(), "GET", new O00OOo0(o00OoOO0.O0000Oo().O000000o()));
        O000000o.O000000o(o00OoOO0.O0000O0o());
        return O000000o;
    }

    public String O000000o() {
        return this.O000000o;
    }

    public O00OoOO0 O00000Oo(O00OoOO0 o00OoOO0, O00o00 o00o00, a aVar) {
        String b = aVar.b("operatortype", "0");
        O0OO0Oo.O000000o(aVar, "2".equals(b) ? "getNewUnicomPhoneNumberNotify" : "3".equals(b) ? "getNewTelecomPhoneNumberNotify" : "NONE");
        O0OO0Oo.O00000Oo(aVar, String.valueOf(o00o00.O000000o()));
        O00OOo o00OOo = new O00OOo(o00OoOO0.O0000Oo().O000000o(), "1.0", o00o00.O00000o0());
        o00OOo.O00000o0(aVar.b("userCapaid"));
        if (aVar.c("logintype") == 3 || aVar.b("isRisk", false)) {
            o00OOo.O00000Oo("pre");
        } else {
            o00OOo.O00000Oo("authz");
        }
        O00OoOO0 O000000o = O000000o(this.O000000o, o00OoOO0.O00000oo(), "POST", o00OOo);
        O000000o.O000000o(o00OoOO0.O0000O0o());
        this.O000000o = null;
        return O000000o;
    }
}
