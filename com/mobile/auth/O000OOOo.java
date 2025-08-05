package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.lang.reflect.Method;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class O000OOOo {
    private static int O000000o(int i) {
        int i2 = -101;
        if (i != -101) {
            i2 = -1;
            if (i != -1) {
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 2;
                    case 13:
                    case 18:
                    case 19:
                        return 3;
                    default:
                        return i;
                }
            }
        }
        return i2;
    }

    public static NetworkInfo O000000o(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
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

    public static boolean O00000Oo(Context context) {
        try {
            NetworkInfo O000000o = O000000o(context);
            if (O000000o != null) {
                if (O000000o.isAvailable()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static boolean O00000o(Context context) {
        if (context == null) {
            return true;
        }
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
        } catch (Throwable th) {
            try {
                O000000o.O000000o("NetUtil", "isMobileEnable error ", th);
                return true;
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return false;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return false;
                }
            }
        }
    }

    public static boolean O00000o0(Context context) {
        try {
            NetworkInfo O000000o = O000000o(context);
            if (O000000o != null) {
                if (O000000o.getType() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static String O00000oO(Context context) {
        try {
            int O0000OOo = O0000OOo(context);
            return O0000OOo != -101 ? (O0000OOo == -1 || O0000OOo == 0) ? "null" : O0000OOo != 1 ? O0000OOo != 2 ? O0000OOo != 3 ? Integer.toString(O0000OOo) : "4G" : "3G" : "2G" : "WIFI";
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

    public static String O00000oo(Context context) {
        try {
            String O00000oO = O00000oO(context);
            if (O00000oO != null && O00000oO.equals("WIFI")) {
                if (O00000o(context)) {
                    return "BOTH";
                }
            }
            return O00000oO;
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

    public static String O0000O0o(Context context) {
        try {
            String O00000oo = O00000oo(context);
            if (!TextUtils.isEmpty(O00000oo) && !O00000oo.equals("null")) {
                if (O00000oo.equals("2G")) {
                    return "10";
                }
                if (O00000oo.equals("3G")) {
                    return "11";
                }
                if (O00000oo.equals("4G")) {
                    return "12";
                }
                if (O00000oo.equals("WIFI")) {
                    return AgooConstants.ACK_FLAG_NULL;
                }
                if (O00000oo.equals("BOTH")) {
                    return AgooConstants.ACK_PACK_NOBIND;
                }
            }
            return AgooConstants.ACK_PACK_ERROR;
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

    private static int O0000OOo(Context context) {
        int i = 0;
        try {
            try {
                NetworkInfo O000000o = O000000o(context);
                if (O000000o == null || !O000000o.isAvailable() || !O000000o.isConnected()) {
                    i = -1;
                } else {
                    int type = O000000o.getType();
                    if (type == 1) {
                        i = -101;
                    } else if (type == 0) {
                        try {
                            i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) context.getSystemService("phone"));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (i == 0) {
                            i = O000000o.getSubtype();
                        }
                    }
                }
            } catch (NullPointerException e2) {
                e2.printStackTrace();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return O000000o(i);
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
}
