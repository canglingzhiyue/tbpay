package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class czu {

    /* renamed from: a  reason: collision with root package name */
    private static volatile czu f26626a = null;
    private static boolean b = false;
    private boolean c = false;
    private String d = "";
    private String e = "";
    private String f = "";

    public static czu a() {
        if (f26626a == null) {
            synchronized (czu.class) {
                if (f26626a == null) {
                    f26626a = new czu();
                }
            }
        }
        return f26626a;
    }

    public static boolean b() {
        return b;
    }

    private czf c(Context context, String str, String str2) {
        czg a2 = czg.a(context.getApplicationContext());
        czf a3 = a2.a("KEY_CACHE_UAID_TRACKER");
        if (a3 == null) {
            return a2.a("KEY_CACHE_UAID_TRACKER", (String) new czk(1, false, "UAID_TRACKER_DATA", str2 + str));
        }
        return a3;
    }

    public String a(Context context, String str, String str2) {
        String a2 = c(context, str, str2).a();
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            long j = jSONObject.getLong("expiredTime");
            boolean z = jSONObject.getBoolean("isUsable");
            if (j > System.currentTimeMillis() && !z) {
                return jSONObject.getJSONObject("tokens").toString();
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public void a(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public void a(boolean z) {
        b = z;
    }

    public void b(Context context, String str, String str2) {
        czf c = c(context, str, str2);
        try {
            JSONObject jSONObject = new JSONObject(c.a());
            jSONObject.put("isUsable", true);
            c.a(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }
}
