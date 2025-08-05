package com.mobile.auth;

import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.taobao.search.common.util.k;

/* loaded from: classes4.dex */
public final class OOO {
    public static String O000000o = "123.125.99.31";
    public static int O00000Oo = 0;
    public static OO0OO0o O00000o = null;
    public static String O00000o0 = "0";
    private static String O00000oO = "";
    private static String O00000oo = "";
    private static String O0000O0o = "";
    private static int O0000OOo = 5;
    private static String O0000Oo = "";
    private static int O0000Oo0 = -1;
    private static String O0000OoO = "";
    private static String O0000Ooo = "";

    public static String O000000o() {
        try {
            return k.HTTPS_PREFIX + OO0OOo0.O00000o() + "/unicomAuth/android/v3.0/qc?";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O000000o(int i) {
        try {
            O00000Oo = i;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O000000o(String str) {
        try {
            if (str.contains("auth.wosms.cn") || str.contains(OO0OOo0.O00000o()) || str.contains(O000000o) || str.contains("msv6.wosms.cn") || str.contains("ali.wosms.cn") || str.contains("test.wosms.cn") || str.contains("m.zzx.cnklog.com") || str.contains("10010.com") || str.contains("id6.me")) {
                return true;
            }
            return str.contains("cmpassport.com");
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static String O00000Oo() {
        try {
            return O00000o0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000Oo(int i) {
        try {
            O0000OOo = i;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo(String str) {
        try {
            O00000o0 = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O00000o() {
        try {
            return O00000oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000o(String str) {
        try {
            O00000oo = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O00000o0() {
        try {
            return O00000oO;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000o0(int i) {
        try {
            O0000Oo0 = i;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o0(String str) {
        try {
            O00000oO = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O00000oO() {
        try {
            String O000000o2 = OO0o00.O000000o();
            O00000oo = O000000o2;
            return O000000o2;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000oO(String str) {
        try {
            OOO0o0.O00000o0("APN:".concat(String.valueOf(str)));
            O0000O0o = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O00000oo() {
        try {
            return O0000O0o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000oo(String str) {
        try {
            if (!ConnectionUtil.TYPE_CMNET.equals(str) && !"cmwap".equals(str)) {
                if (!ConnectionUtil.TYPE_3GWAP.equals(str) && !ConnectionUtil.TYPE_UNIWAP.equals(str) && !ConnectionUtil.TYPE_3GNET.equals(str) && !ConnectionUtil.TYPE_UNINET.equals(str)) {
                    if (!ConnectionUtil.TYPE_CTNET.equals(str)) {
                        if (!ConnectionUtil.TYPE_CTWAP.equals(str)) {
                            return "0";
                        }
                    }
                    return "2";
                }
                return "3";
            }
            return "1";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static int O0000O0o() {
        try {
            return O0000OOo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static void O0000O0o(String str) {
        try {
            O0000Oo = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static int O0000OOo() {
        try {
            return O0000Oo0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }
}
