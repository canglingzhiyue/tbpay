package tb;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.b;
import com.tanx.exposer.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class dhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f26746a;

    static {
        kge.a(-2039818509);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return String.format("%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33824d54", new Object[]{str, jSONObject});
        }
        if (str != null && jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!StringUtils.isEmpty(next) && !StringUtils.isEmpty(optString)) {
                    str = str.replace(next, optString);
                }
            }
        }
        return str;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d08f5a0b", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!StringUtils.isEmpty(next) && opt != null) {
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (!StringUtils.isEmpty(f26746a)) {
            return f26746a;
        }
        b d = d.a().d();
        if (d == null) {
            return "";
        }
        String b = StringUtils.isEmpty(d.i()) ? b(d.a().c()) : d.i();
        String a2 = StringUtils.isEmpty(d.j()) ? a(d.a().c()) : d.j();
        if (StringUtils.isEmpty(b) || StringUtils.isEmpty(a2)) {
            return "";
        }
        f26746a = b + ";" + a2 + ";Android;" + Build.VERSION.RELEASE + ";" + Build.MODEL;
        if (dha.f26745a) {
            dha.a("TANX_EXPOSE_UTIL", "getUserAgent: mUserAgent = " + f26746a);
        }
        return f26746a;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            dha.a("TANX_EXPOSE_UTIL", "getVersionName: exception" + e.getMessage());
            return "";
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageName();
        } catch (Exception e) {
            dha.a("TANX_EXPOSE_UTIL", "getVersionName: exception" + e.getMessage());
            return "";
        }
    }
}
