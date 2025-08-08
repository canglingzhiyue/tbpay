package com.mobile.auth.gatewayauth.network;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.taobao.tao.remotebusiness.RequestPoolManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.czo;

/* loaded from: classes4.dex */
public class UTSharedPreferencesHelper {
    public static final String AUTH_APP_INFO = "AUTH_APP_INFO";
    private static final String AUTH_CUCC_PL_KEY = "AUTH_CUCC_PL_KEY";
    public static final String AUTH_FLAG_CLOSE_GET_CONFIG_KEY = "AUTH_FLAG_CLOSE_GET_CONFIG_KEY";
    public static final String AUTH_FLAG_LIMIT_GET_CONFIG_KEY = "AUTH_FLAG_LIMIT_GET_CONFIG_KEY";
    public static final String AUTH_LIMIT_AUTH_TOKEN_KEY = "AUTH_LIMIT_AUTH_TOKEN_KEY";
    public static final String AUTH_LIMIT_GET_CONFIG_KEY = "AUTH_LIMIT_GET_CONFIG_KEY";
    public static final String AUTH_LIMIT_LOGIN_PAGE_KEY = "AUTH_LIMIT_LOGIN_PAGE_KEY";
    public static final String AUTH_LIMIT_LOGIN_PHONE_KEY = "AUTH_LIMIT_LOGIN_PHONE_KEY";
    public static final String AUTH_LIMIT_LOGIN_TOKEN_KEY = "AUTH_LIMIT_LOGIN_TOKEN_KEY";
    public static final String AUTH_LIMIT_SLS_KEY = "AUTH_LIMIT_SLS_KEY";
    public static final String AUTH_LIMIT_VENDOR_LIST_KEY = "AUTH_LIMIT_VENDOR_LIST_KEY";
    private static final String AUTH_PL_DATA_KEY = "AUTH_PL_DATA_KEY";
    public static final String AUTH_PRIVATE_KEY = "AUTH_PRIVATE_KEY";
    private static final String AUTH_SDK_CONFIG_KEY = "AUTH_SDK_CONFIG_KEY";
    private static final String AUTH_UT_DATA = "AUTH_UT_DATA";
    private static final String AUTH_UT_DATA_KEY = "AUTH_UT_DATA_KEY";
    public static final String FILE_VENDOR_CONFIG_KEY = "FILE_VENDOR_CONFIG_KEY";
    public static final String LIFE_BODY_VERIFY_CID_KEY = "LIFE_BODY_VERIFY_CID_KEY";
    public static final String LOGIN_TOKEN_KEY = "LOGIN_TOKEN_KEY";
    public static final String MASK_IMSI_KEY = "MASK_IMSI_KEY";
    public static final String MASK_LOCAL_IP_KEY = "MASK_LOCAL_IP_KEY";
    public static final String VERIFY_TOKEN_KEY = "VERIFY_TOKEN_KEY";
    public static final String WIFI_SETUP_FLAG = "wifi_setup_flag";

    public static synchronized void clearAppInfo(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                clearInfo(context, "AUTH_APP_INFO", str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void clearCUCCPreLoginCount(Context context) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                put(context, AUTH_UT_DATA, AUTH_CUCC_PL_KEY, "");
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void clearInfo(Context context, String str, String str2) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                context.getSharedPreferences(str, 0).edit().remove(str2).commit();
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void clearLimitCount(Context context) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                put(context, AUTH_UT_DATA, "AUTH_LIMIT_SLS_KEY", "");
                put(context, AUTH_UT_DATA, AUTH_LIMIT_VENDOR_LIST_KEY, "");
                put(context, AUTH_UT_DATA, AUTH_LIMIT_GET_CONFIG_KEY, "");
                put(context, AUTH_UT_DATA, AUTH_LIMIT_AUTH_TOKEN_KEY, "");
                put(context, AUTH_UT_DATA, AUTH_LIMIT_LOGIN_TOKEN_KEY, "");
                put(context, AUTH_UT_DATA, AUTH_LIMIT_LOGIN_PHONE_KEY, "");
                put(context, AUTH_UT_DATA, AUTH_LIMIT_LOGIN_PAGE_KEY, "");
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static void clearUTData(Context context) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(AUTH_UT_DATA, 0).edit();
            edit.clear();
            edit.apply();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static boolean contains(Context context, String str, String str2) {
        try {
            return context.getSharedPreferences(str, 0).contains(str2);
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

    public static <T> T get(Context context, String str, String str2, T t) {
        try {
            if (!contains(context, str, str2)) {
                return t;
            }
            String b = czo.b(context.getSharedPreferences(str, 0).getString(str2, ""));
            if (t instanceof Integer) {
                return (T) Integer.valueOf(b);
            }
            if (t instanceof Boolean) {
                return (T) Boolean.valueOf(b);
            }
            if (t instanceof Long) {
                return (T) Long.valueOf(b);
            }
            if (!(t instanceof String)) {
                throw new Exception("unsupported type");
            }
            return (T) String.valueOf(b);
        } catch (Exception unused) {
            return t;
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

    public static synchronized <T> T getAppInfo(Context context, String str, T t) {
        T t2;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                t2 = (T) get(context, "AUTH_APP_INFO", str, t);
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
        return t2;
    }

    public static <T> void put(Context context, String str, String str2, T t) {
        try {
            try {
                context.getSharedPreferences(str, 0).edit().putString(str2, czo.a(t.toString())).commit();
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized <T> void putAppInfo(Context context, String str, T t) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                put(context, "AUTH_APP_INFO", str, t);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized String readAuthSDKPrivateKey(Context context) {
        String str;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                str = (String) get(context, "AUTH_APP_INFO", RequestPoolManager.Type.AUTH + PackageUtils.getPackageName(context) + PackageUtils.getSign(context), "");
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
        return str;
    }

    public static synchronized int readAuthTokenLimitCount(Context context, String str) {
        int readLimitCount;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                readLimitCount = readLimitCount(context, AUTH_LIMIT_AUTH_TOKEN_KEY, str);
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
        return readLimitCount;
    }

    public static synchronized int readConfigLimitCount(Context context, String str) {
        int readLimitCount;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                readLimitCount = readLimitCount(context, AUTH_LIMIT_GET_CONFIG_KEY, str);
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
        return readLimitCount;
    }

    public static synchronized int readLimitCount(Context context, String str, String str2) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                String str3 = (String) get(context, AUTH_UT_DATA, str, "");
                Map<String, Integer> map = null;
                if (!StringUtils.isEmpty(str3)) {
                    map = a.a(str3);
                }
                if (map == null || map.isEmpty() || !map.containsKey(str2)) {
                    return 0;
                }
                return map.get(str2).intValue();
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

    public static synchronized int readLoginPageLimitCount(Context context, String str) {
        int readLimitCount;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                readLimitCount = readLimitCount(context, AUTH_LIMIT_LOGIN_PAGE_KEY, str);
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
        return readLimitCount;
    }

    public static synchronized int readLoginPhoneLimitCount(Context context, String str) {
        int readLimitCount;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                readLimitCount = readLimitCount(context, AUTH_LIMIT_LOGIN_PHONE_KEY, str);
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
        return readLimitCount;
    }

    public static synchronized int readLoginTokenLimitCount(Context context, String str) {
        int readLimitCount;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                readLimitCount = readLimitCount(context, AUTH_LIMIT_LOGIN_TOKEN_KEY, str);
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
        return readLimitCount;
    }

    public static synchronized ConfigRule readSDKConfig(Context context) {
        ConfigRule configRule;
        synchronized (UTSharedPreferencesHelper.class) {
            configRule = null;
            String str = (String) get(context, AUTH_UT_DATA, AUTH_SDK_CONFIG_KEY, "");
            if (!StringUtils.isEmpty(str)) {
                try {
                    configRule = ConfigRule.fromJson(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return configRule;
    }

    public static synchronized boolean readSDKConfigCloseFlag(Context context) {
        boolean booleanValue;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                booleanValue = ((Boolean) get(context, AUTH_UT_DATA, AUTH_FLAG_CLOSE_GET_CONFIG_KEY, false)).booleanValue();
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
        return booleanValue;
    }

    public static synchronized String readSDKConfigLimitFlag(Context context) {
        String str;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                str = (String) get(context, AUTH_UT_DATA, AUTH_FLAG_LIMIT_GET_CONFIG_KEY, "");
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
        return str;
    }

    public static synchronized int readSLSLimitCount(Context context, String str) {
        int readLimitCount;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                readLimitCount = readLimitCount(context, "AUTH_LIMIT_SLS_KEY", str);
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
        return readLimitCount;
    }

    public static List<MonitorStruct> readUTInfo(Context context) {
        try {
            String str = (String) get(context, AUTH_UT_DATA, AUTH_UT_DATA_KEY, "");
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            return a.a(str, new d<MonitorStruct>() { // from class: com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper.1
            });
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

    public static synchronized int readVendorLimitCount(Context context, String str) {
        int readLimitCount;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                readLimitCount = readLimitCount(context, AUTH_LIMIT_VENDOR_LIST_KEY, str);
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
        return readLimitCount;
    }

    public static synchronized void saveAuthSDKPrivateKey(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                put(context, "AUTH_APP_INFO", RequestPoolManager.Type.AUTH + PackageUtils.getPackageName(context) + PackageUtils.getSign(context), str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveAuthTokenLimitCount(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                saveLimitCount(context, AUTH_LIMIT_AUTH_TOKEN_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveConfigLimitCount(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                saveLimitCount(context, AUTH_LIMIT_GET_CONFIG_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveLimitCount(Context context, String str, String str2) {
        int i;
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                String str3 = (String) get(context, AUTH_UT_DATA, str, "");
                Map<String, Integer> map = null;
                if (!StringUtils.isEmpty(str3)) {
                    map = a.a(str3);
                }
                if (map == null || map.isEmpty() || !map.containsKey(str2)) {
                    map = new HashMap<>();
                    i = 1;
                } else {
                    i = Integer.valueOf(map.get(str2).intValue() + 1);
                }
                map.put(str2, i);
                put(context, AUTH_UT_DATA, str, new JSONObject(map).toString());
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } finally {
                }
            }
        }
    }

    public static synchronized void saveLoginPageLimitCount(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                saveLimitCount(context, AUTH_LIMIT_LOGIN_PAGE_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveLoginPhoneLimitCount(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                saveLimitCount(context, AUTH_LIMIT_LOGIN_PHONE_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveLoginTokenLimitCount(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                saveLimitCount(context, AUTH_LIMIT_LOGIN_TOKEN_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveSDKConfig(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                put(context, AUTH_UT_DATA, AUTH_SDK_CONFIG_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveSDKConfigCloseFlag(Context context, boolean z) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                put(context, AUTH_UT_DATA, AUTH_FLAG_CLOSE_GET_CONFIG_KEY, Boolean.valueOf(z));
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveSDKConfigLimitFlag(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                put(context, AUTH_UT_DATA, AUTH_FLAG_LIMIT_GET_CONFIG_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveSLSLimitCount(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                saveLimitCount(context, "AUTH_LIMIT_SLS_KEY", str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static synchronized void saveUTInfo(Context context, MonitorStruct monitorStruct) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                List readUTInfo = readUTInfo(context);
                if (readUTInfo == null) {
                    readUTInfo = new ArrayList();
                }
                readUTInfo.add(monitorStruct);
                put(context, AUTH_UT_DATA, AUTH_UT_DATA_KEY, a.a(readUTInfo));
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public static void saveUTInfos(Context context, String str) {
        try {
            put(context, AUTH_UT_DATA, AUTH_UT_DATA_KEY, str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static synchronized void saveVendorLimitCount(Context context, String str) {
        synchronized (UTSharedPreferencesHelper.class) {
            try {
                saveLimitCount(context, AUTH_LIMIT_VENDOR_LIST_KEY, str);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }
}
