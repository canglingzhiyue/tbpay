package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONObject;
import tb.dck;

/* loaded from: classes4.dex */
public class OO0OOo0 {
    private static volatile OO0OOo0 O00000Oo;
    public Context O000000o;
    private ExecutorService O00000o0 = Executors.newSingleThreadExecutor();

    private OO0OOo0() {
    }

    public static OO0OOo0 O000000o() {
        try {
            if (O00000Oo == null) {
                synchronized (OO0OOo0.class) {
                    if (O00000Oo == null) {
                        O00000Oo = new OO0OOo0();
                    }
                }
            }
            return O00000Oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O000000o(Context context, String str, String str2) {
        try {
            return OO0Oo00.O000000o(context, str, str2);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O000000o(int i, OO0OOOO oo0oooo, String str) {
        try {
            OOO0o0.O00000oO("type:" + i + "\nmsg:" + str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", 1);
                jSONObject.put("resultMsg", str);
                jSONObject.put("resultData", "");
                jSONObject.put(dck.COL_SEQ, "");
                oo0oooo.onResult(jSONObject.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(boolean z) {
        try {
            OOO0o0.O000000o(z);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O000000o(Context context) {
        try {
            if (OO0Oo0.O000000o(context)) {
                if (OO0Oo0.O00000o0(context)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static boolean O000000o(Context context, String str, String str2, String str3) {
        try {
            return OO0Oo00.O000000o(context, str, str2, str3);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static String O00000Oo() {
        try {
            return OOO0O0O.O00000Oo();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000Oo(Context context) {
        try {
            OO0Oo0.O00000Oo(context);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[Catch: Throwable -> 0x002f, TryCatch #0 {Throwable -> 0x002f, blocks: (B:3:0x0001, B:6:0x000c, B:8:0x0014, B:10:0x001a, B:16:0x0029, B:18:0x002c), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: Throwable -> 0x002f, TRY_LEAVE, TryCatch #0 {Throwable -> 0x002f, blocks: (B:3:0x0001, B:6:0x000c, B:8:0x0014, B:10:0x001a, B:16:0x0029, B:18:0x002c), top: B:23:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean O00000Oo(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.String r1 = "ali.wosms.cn"
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "msv6.wosms.cn"
            r3 = 1
            if (r1 != 0) goto L26
            java.lang.String r1 = "m.zzx.cnklog.com"
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L26
            boolean r1 = r4.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L26
            java.lang.String r1 = "test.wosms.cn"
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L24
            goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            if (r1 == 0) goto L2c
            com.mobile.auth.OOO0O0O.O00000o0 = r4     // Catch: java.lang.Throwable -> L2f
            return r3
        L2c:
            com.mobile.auth.OOO0O0O.O00000o0 = r2     // Catch: java.lang.Throwable -> L2f
            return r0
        L2f:
            r4 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO0OOo0.O00000Oo(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[Catch: Throwable -> 0x002f, TryCatch #0 {Throwable -> 0x002f, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:8:0x0014, B:11:0x001d, B:13:0x0022, B:15:0x0028, B:16:0x002c, B:12:0x0020), top: B:21:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O00000o() {
        /*
            java.lang.String r0 = com.mobile.auth.OOO0O0O.O00000o0     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L20
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L20
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L2f
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L20
            java.lang.String r1 = "null"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L1d
            goto L20
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2f
            goto L22
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
        L22:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2c
            java.lang.String r0 = "msv6.wosms.cn"
            com.mobile.auth.OOO0O0O.O00000o0 = r0     // Catch: java.lang.Throwable -> L2f
        L2c:
            java.lang.String r0 = com.mobile.auth.OOO0O0O.O00000o0     // Catch: java.lang.Throwable -> L2f
            return r0
        L2f:
            r0 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO0OOo0.O00000o():java.lang.String");
    }

    public static boolean O00000o(Context context) {
        try {
            int O00000Oo2 = OOOO00O.O00000Oo(context);
            return O00000Oo2 == 0 || O00000Oo2 == 1;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static String O00000o0() {
        return "phoneinfo";
    }

    public static void O00000o0(Context context) {
        try {
            OO0Oo0.O00000o(context);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O00000oO() {
        return "auth.wosms.cn";
    }

    public static void O00000oO(Context context) {
        try {
            OO0Oo00.O000000o(context);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000oo() {
        try {
            OOO00Oo.O000000o = false;
            OOO00Oo.O00000Oo = false;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O0000O0o() {
        try {
            OOO0OO0.O000000o().O00000Oo();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public final String O000000o(String str) {
        try {
            if (this.O000000o == null) {
                return "sdk 未初始化, context 为空";
            }
            try {
                String lowerCase = str.toLowerCase();
                char c = 65535;
                switch (lowerCase.hashCode()) {
                    case -903629273:
                        if (lowerCase.equals("sha256")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 107902:
                        if (lowerCase.equals("md5")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3528965:
                        if (lowerCase.equals("sha1")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 93029116:
                        if (lowerCase.equals("appid")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 909712337:
                        if (lowerCase.equals(NewHtcHomeBadger.PACKAGENAME)) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return OOO.O00000o0();
                }
                if (c == 1) {
                    return this.O000000o.getApplicationContext().getPackageName();
                }
                if (c != 2 && c != 3 && c != 4) {
                    throw new Exception("no info");
                }
                return OOOO00O.O000000o(this.O000000o, this.O000000o.getPackageName(), str.toLowerCase());
            } catch (Exception e) {
                return "no info:" + e.toString();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
