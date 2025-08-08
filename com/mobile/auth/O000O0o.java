package com.mobile.auth;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public final class O000O0o {
    private static SharedPreferences O000000o(Context context) {
        try {
            return context.getSharedPreferences(O00000Oo(context), 0);
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

    public static void O000000o(Context context, String str, int i) {
        if (context != null) {
            try {
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                try {
                    O000000o(context).edit().putInt(str, i).commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static void O000000o(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                try {
                    O000000o(context).edit().putString(str, str2).commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static int O00000Oo(Context context, String str, int i) {
        if (context != null) {
            try {
                if (!StringUtils.isEmpty(str)) {
                    try {
                        return O000000o(context).getInt(str, i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return -1;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return -1;
                }
            }
        }
        return i;
    }

    private static String O00000Oo(Context context) {
        return "ct_account_api_sdk";
    }

    public static String O00000Oo(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (!StringUtils.isEmpty(str)) {
                    try {
                        return O000000o(context).getString(str, str2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
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
        return str2;
    }
}
