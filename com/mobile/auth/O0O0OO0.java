package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import com.mobile.auth.O0O0o00;
import com.mobile.auth.O0OO00O;

/* loaded from: classes4.dex */
public class O0O0OO0 {
    private static String O000000o = null;
    private static String O00000Oo = null;
    private static int O00000o = -1;
    private static long O00000o0;

    private static int O000000o(String str) {
        String O00000Oo2;
        if (!TextUtils.isEmpty(O00000Oo)) {
            O00000Oo2 = O00000Oo;
        } else {
            O00000Oo2 = O0O0o00.O00000Oo("pre_sim_key", "");
            O00000Oo = O00000Oo2;
        }
        if (TextUtils.isEmpty(O00000Oo2)) {
            return 0;
        }
        return O00000Oo2.equals(str) ? 1 : 2;
    }

    public static long O000000o() {
        long O000000o2;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(O000000o)) {
            O0O000o.O00000Oo("PhoneScripUtils", O00000Oo + " " + O00000o0);
            O000000o2 = O00000o0;
        } else {
            String O00000Oo2 = O0O0o00.O00000Oo("phonescripcache", "");
            O000000o2 = O0O0o00.O000000o("phonescripstarttime", 0L);
            if (TextUtils.isEmpty(O00000Oo2)) {
                j = 0;
                return Math.max(j / 1000, 0L);
            }
        }
        j = (O000000o2 - currentTimeMillis) - 10000;
        return Math.max(j / 1000, 0L);
    }

    public static String O000000o(Context context) {
        if (TextUtils.isEmpty(O000000o)) {
            String O00000Oo2 = O0O0o00.O00000Oo("phonescripcache", "");
            if (TextUtils.isEmpty(O00000Oo2)) {
                O0O000o.O000000o("PhoneScripUtils", "null");
                return null;
            }
            O00000o0 = O0O0o00.O000000o("phonescripstarttime", 0L);
            O00000Oo = O0O0o00.O00000Oo("pre_sim_key", "");
            O00000o = O0O0o00.O000000o("phonescripversion", -1);
            String O00000Oo3 = O0O00oO.O00000Oo(context, O00000Oo2);
            O000000o = O00000Oo3;
            return O00000Oo3;
        }
        return O000000o;
    }

    public static void O000000o(final Context context, final String str, long j, final String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || j <= 0) {
            return;
        }
        O0O000o.O00000Oo("PhoneScripUtils", "save phone scrip simKey = " + str2);
        O000000o = str;
        long j2 = j * 1000;
        O00000o0 = System.currentTimeMillis() + j2;
        O0O000o.O00000Oo("sLifeTime", O00000o0 + "");
        O00000Oo = str2;
        O00000o = 2;
        if (!"operator".equals(str3)) {
            O0OO00O.O000000o(new O0OO00O.O000000o() { // from class: com.mobile.auth.O0O0OO0.1
                @Override // com.mobile.auth.O0OO00O.O000000o
                protected void O000000o() {
                    O0O000o.O00000Oo("PhoneScripUtils", "start save scrip to sp in sub thread");
                    O0O0OO0.O00000Oo(context, str, O0O0OO0.O00000o0, str2);
                }
            });
        } else if (j2 > 3600000) {
            O00000o0 = System.currentTimeMillis() + 3600000;
        } else {
            O00000o0 = System.currentTimeMillis() + j2;
        }
    }

    public static void O000000o(boolean z, boolean z2) {
        O0O0o00.O000000o O000000o2 = O0O0o00.O000000o();
        O000000o2.O000000o("phonescripstarttime");
        O000000o2.O000000o("phonescripcache");
        O000000o2.O000000o("pre_sim_key");
        O000000o2.O000000o("phonescripversion");
        if (z2) {
            O000000o2.O000000o();
        } else {
            O000000o2.O00000Oo();
        }
        if (z) {
            O000000o = null;
            O00000Oo = null;
            O00000o0 = 0L;
            O00000o = -1;
        }
    }

    private static boolean O000000o(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        O0O000o.O00000Oo("PhoneScripUtils", j + "");
        O0O000o.O00000Oo("PhoneScripUtils", currentTimeMillis + "");
        return j - currentTimeMillis > 10000;
    }

    public static boolean O000000o(a aVar) {
        int O000000o2 = O000000o(aVar.b("scripKey"));
        aVar.a("imsiState", O000000o2 + "");
        O0O000o.O00000Oo("PhoneScripUtils", "simState = " + O000000o2);
        if (O000000o2 == 0) {
            return false;
        }
        if (O00000o == -1) {
            O00000o = O0O0o00.O000000o("phonescripversion", -1);
        }
        if (O00000o != 2) {
            O000000o(true, false);
            O0O00oO.O000000o();
            O0O000o.O00000Oo("PhoneScripUtils", "phoneScriptVersion change");
            return false;
        } else if (O000000o2 != 2) {
            return O00000o0();
        } else {
            O000000o(true, false);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O00000Oo(Context context, String str, long j, String str2) {
        String O000000o2 = O0O00oO.O000000o(context, str);
        if (!TextUtils.isEmpty(O000000o2)) {
            O0O0o00.O000000o O000000o3 = O0O0o00.O000000o();
            O000000o3.O000000o("phonescripcache", O000000o2);
            O000000o3.O000000o("phonescripstarttime", j);
            O000000o3.O000000o("phonescripversion", 2);
            O000000o3.O000000o("pre_sim_key", str2);
            O000000o3.O00000Oo();
        }
    }

    private static boolean O00000o0() {
        if (TextUtils.isEmpty(O000000o)) {
            return !TextUtils.isEmpty(O0O0o00.O00000Oo("phonescripcache", "")) && O000000o(O0O0o00.O000000o("phonescripstarttime", 0L));
        }
        O0O000o.O00000Oo("PhoneScripUtils", O00000Oo + " " + O00000o0);
        return O000000o(O00000o0);
    }
}
