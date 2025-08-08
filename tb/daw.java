package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class daw {
    public static final String AUTH_LIMIT_SLS_KEY = "AUTH_LIMIT_SLS_KEY";

    public static synchronized ACMLimitConfig a(Context context) {
        ACMLimitConfig aCMLimitConfig;
        synchronized (daw.class) {
            String str = (String) a(context, "ALITX_LOGGER_DATA", "AUTH_LIMIT_CONFIG_KEY", "");
            aCMLimitConfig = null;
            if (!StringUtils.isEmpty(str)) {
                try {
                    aCMLimitConfig = ACMLimitConfig.fromJson(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return aCMLimitConfig;
    }

    public static <T> T a(Context context, String str, String str2, T t) {
        try {
            if (a(context, str, str2)) {
                String b = dav.b(context.getSharedPreferences(str, 0).getString(str2, ""));
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
            }
        } catch (Exception unused) {
        }
        return t;
    }

    public static synchronized void a(Context context, ACMLimitConfig aCMLimitConfig) {
        synchronized (daw.class) {
            b(context, "ALITX_LOGGER_DATA", "AUTH_LIMIT_CONFIG_KEY", aCMLimitConfig.toJsonString());
        }
    }

    public static synchronized void a(Context context, String str) {
        synchronized (daw.class) {
            b(context, "AUTH_LIMIT_SLS_KEY", str);
        }
    }

    public static boolean a(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).contains(str2);
    }

    public static synchronized int b(Context context, String str) {
        int c;
        synchronized (daw.class) {
            c = c(context, "AUTH_LIMIT_SLS_KEY", str);
        }
        return c;
    }

    public static synchronized void b(Context context, String str, String str2) {
        int i;
        synchronized (daw.class) {
            String str3 = (String) a(context, "ALITX_LOGGER_DATA", str, "");
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
            b(context, "ALITX_LOGGER_DATA", str, new JSONObject(map).toString());
        }
    }

    public static <T> void b(Context context, String str, String str2, T t) {
        try {
            context.getSharedPreferences(str, 0).edit().putString(str2, dav.a(t.toString())).commit();
        } catch (Exception unused) {
        }
    }

    public static synchronized int c(Context context, String str, String str2) {
        synchronized (daw.class) {
            String str3 = (String) a(context, "ALITX_LOGGER_DATA", str, "");
            Map<String, Integer> map = null;
            if (!StringUtils.isEmpty(str3)) {
                map = a.a(str3);
            }
            if (map == null || map.isEmpty() || !map.containsKey(str2)) {
                return 0;
            }
            return map.get(str2).intValue();
        }
    }
}
