package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import anet.channel.util.HttpConstant;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.i;
import com.taobao.monitor.procedure.g;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.error.a;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.o;
import com.taobao.pha.core.p;
import com.xiaomi.mipush.sdk.Constants;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes7.dex */
public class ngn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f31447a;
    private static float b;
    private static final SimpleDateFormat c;
    private static final SimpleDateFormat d;

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue() : f / 7.5f;
    }

    static {
        kge.a(-1045183887);
        f31447a = null;
        b = -1.0f;
        c = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.ENGLISH);
        d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        if (ngu.m() && (context instanceof Activity)) {
            return Math.round((i * a((Activity) context)) / 750.0f);
        }
        return Math.round((i * b()) / 750.0f);
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue() : i.a(activity).width();
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : Math.round((i * b()) / 750.0f);
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue() : (f * b()) / 750.0f;
    }

    public static int b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a7862d7", new Object[]{context, new Integer(i)})).intValue();
        }
        if (ngu.m() && (context instanceof Activity)) {
            return Math.round((i * 750.0f) / a((Activity) context));
        }
        return Math.round((i * 750.0f) / b());
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20").replaceAll("\\%21", riy.AND_NOT).replaceAll("\\%27", "'").replaceAll("\\%28", riy.BRACKET_START_STR).replaceAll("\\%29", riy.BRACKET_END_STR).replaceAll("\\%7E", Constants.WAVE_SEPARATOR);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    jSONObject.put(str, (Object) a(obj.toString()));
                } else if (obj instanceof JSONObject) {
                    a((JSONObject) obj);
                }
            }
        }
    }

    public static nfz a(AppController appController, PageModel pageModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("aed06ad6", new Object[]{appController, pageModel}) : a(appController, pageModel, (Map<String, Object>) null);
    }

    public static nfz a(AppController appController, PageModel pageModel, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("6da2d5cd", new Object[]{appController, pageModel, map}) : new ngj().a(appController).a(pageModel).a(map).a();
    }

    public static String a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("172620d5", new Object[]{inputStream});
        }
        String str = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            str = ngp.a(inputStreamReader);
            inputStreamReader.close();
        } catch (Exception e) {
            ngr.b("CommonUtils", "Read InputStream Failed: " + e.getMessage());
        }
        return str;
    }

    public static String b(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
            return a(parse);
        }
        return null;
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null || !uri.isHierarchical()) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("wh_pid");
        Uri.Builder scheme = uri.buildUpon().clearQuery().scheme("");
        if (!StringUtils.isEmpty(queryParameter)) {
            scheme.appendPath(queryParameter);
        }
        String builder = scheme.toString();
        return builder.startsWith(HttpConstant.SCHEME_SPLIT) ? builder.substring(3) : builder;
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        if (StringUtils.equals(str, "alpha")) {
            return 1;
        }
        return StringUtils.equals(str, "translate") ? 2 : 0;
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue() : StringUtils.equals(str, "none") ? 0 : 1;
    }

    public static float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[0])).floatValue();
        }
        if (b < 0.0f) {
            b = p.e().getResources().getDisplayMetrics().density;
        }
        return b;
    }

    public static int e(String str) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{str})).intValue();
        }
        Resources resources = p.e().getResources();
        if (resources != null && (identifier = resources.getIdentifier(str, "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String a(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("244a69c8", new Object[]{str, obj, str2}) : a(str, obj, str2, false);
    }

    private static String a(String str, Object obj, String str2, boolean z) {
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("840f424", new Object[]{str, obj, str2, new Boolean(z)});
        }
        if (obj == null || StringUtils.isEmpty(str)) {
            return null;
        }
        if (obj instanceof String) {
            obj2 = "'" + ((String) obj) + "'";
        } else if (obj instanceof JSONObject) {
            obj2 = ((JSONObject) obj).toJSONString();
        } else {
            obj2 = obj.toString();
        }
        StringBuilder sb = new StringBuilder("(function(){var customEvent = new CustomEvent('");
        sb.append(str);
        if (z) {
            sb.append("');customEvent.data=");
            sb.append(obj2);
        } else {
            sb.append("', {'detail':");
            sb.append(obj2);
            sb.append("})");
        }
        sb.append(";customEvent.origin='");
        sb.append(str2);
        sb.append("';dispatchEvent(customEvent);})()");
        return sb.toString();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : p.e().getResources().getDisplayMetrics().widthPixels;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : p.e().getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i)})).intValue() : Math.round(a() * i);
    }

    public static int c(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b3989", new Object[]{new Float(f)})).intValue() : (int) ((f / a()) + 0.5f);
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            ngr.b("CommonUtils", "parse color error: " + e.toString());
            return 0;
        }
    }

    public static Integer g(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("373504df", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str) && str.charAt(0) == '#') {
            if (str.length() == 7) {
                str2 = "#ff" + str.substring(1);
            } else if (str.length() == 9) {
                str2 = "#" + str.substring(7) + str.substring(1, 7);
            }
            try {
                return Integer.valueOf((int) Long.parseLong(str2.substring(1), 16));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : (((Application) p.e()).getApplicationInfo().flags & 2) != 0;
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{str});
        }
        try {
            return b(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(charArray[(bArr[i] >> 4) & 15]);
            sb.append(charArray[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static JSONObject i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be7a595a", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Exception unused) {
            ngr.b("CommonUtils", "JsonObject parse failed");
            return null;
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        if (StringUtils.isEmpty(f31447a)) {
            StringBuilder sb = new StringBuilder();
            Map<String, String> g = g();
            sb.append(g.get("sysModel"));
            sb.append("(Android/");
            sb.append(g.get("sysVersion"));
            sb.append(riy.BRACKET_END_STR);
            String str = " ";
            sb.append(str);
            sb.append(StringUtils.isEmpty(g.get("appGroup")) ? "AliApp" : g.get("appGroup"));
            sb.append(riy.BRACKET_START_STR);
            sb.append(StringUtils.isEmpty(g.get("appName")) ? RVEnvironmentService.PLATFORM_TB : g.get("appName"));
            sb.append("/");
            sb.append(g.get("appVersion"));
            sb.append(riy.BRACKET_END_STR);
            sb.append(str);
            sb.append("PHA/");
            sb.append(g.get(o.phaVersion));
            sb.append(str);
            sb.append(StringUtils.isEmpty(g.get("externalUserAgent")) ? "" : g.get("externalUserAgent"));
            if (StringUtils.isEmpty(g.get("externalUserAgent"))) {
                str = "";
            }
            sb.append(str);
            sb.append(b() + "x" + c());
            f31447a = sb.toString();
        }
        return f31447a;
    }

    public static Uri a(Uri uri, Uri uri2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("46c7d661", new Object[]{uri, uri2, list, list2});
        }
        if (uri == null || uri2 == null) {
            return uri2;
        }
        Uri.Builder buildUpon = uri2.buildUpon();
        if (uri.getQueryParameterNames() != null) {
            HashSet<String> hashSet = new HashSet(uri.getQueryParameterNames());
            if (list != null) {
                hashSet.retainAll(list);
            } else if (list2 != null) {
                hashSet.removeAll(list2);
            } else {
                hashSet.clear();
            }
            for (String str : hashSet) {
                List<String> queryParameters = uri.getQueryParameters(str);
                if (queryParameters != null) {
                    for (String str2 : queryParameters) {
                        buildUpon.appendQueryParameter(str, str2);
                    }
                }
            }
        }
        return buildUpon.build();
    }

    private static Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("os", "android");
        hashMap.put("appVersion", f());
        hashMap.put("sysVersion", Build.VERSION.RELEASE);
        hashMap.put("sysModel", Build.MODEL);
        hashMap.put(o.phaVersion, "");
        if (hashMap.get("appName") == null && p.e() != null) {
            hashMap.put("appName", p.e().getPackageName());
        }
        Map<String, String> q = p.b().q();
        if (q != null) {
            for (Map.Entry<String, String> entry : q.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        try {
            return p.e().getPackageManager().getPackageInfo(p.e().getPackageName(), 0).versionName;
        } catch (Exception e) {
            ngr.a("Environment getAppVersionName Exception: " + e.getMessage());
            return "";
        }
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        StringBuilder sb = new StringBuilder();
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                sb.append("Caused By:\n");
                sb.append(cause.getClass() + ResponseProtocolType.COMMENT + cause.getMessage() + "\n");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append("at " + stackTraceElement + '\n');
                }
            }
        }
        String sb2 = sb.toString();
        return StringUtils.isEmpty(sb2) ? th.toString() : sb2;
    }

    public static boolean a(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d711a94c", new Object[]{uri, uri2})).booleanValue() : uri != null && uri2 != null && StringUtils.equals(uri.getHost(), uri2.getHost()) && StringUtils.equals(uri.getPath(), uri2.getPath());
    }

    public static boolean b(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a012a08d", new Object[]{uri, uri2})).booleanValue();
        }
        if (uri == null || uri2 == null) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.isEmpty()) {
            return true;
        }
        if (uri2.getQueryParameterNames().isEmpty()) {
            return false;
        }
        for (String str : queryParameterNames) {
            if (!StringUtils.isEmpty(str) && !StringUtils.equals(uri.getQueryParameter(str), uri2.getQueryParameter(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("691397ce", new Object[]{uri, uri2})).booleanValue() : b(uri, uri2);
    }

    public static Date j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("93ee805c", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return c.parse(str);
        } catch (Throwable unused) {
            ngr.a("PHAUtils parsing GMT time fail:" + str);
            return null;
        }
    }

    public static Date k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("f5411cfb", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return d.parse(str);
        } catch (Throwable unused) {
            ngr.a("PHAUtils parsing UTC time fail:" + str);
            return null;
        }
    }

    public static void a(AppController appController, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb016330", new Object[]{appController, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("api", (Object) str);
        if (jSONObject != null) {
            jSONObject2.put("params", (Object) jSONObject.toJSONString());
        }
        appController.P().a(nfc.PHA_MONITOR_MODULE_POINT_JS_API, jSONObject2);
    }

    public static void a(AppController appController, String str, JSONObject jSONObject, PHAErrorType pHAErrorType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ddbcd2", new Object[]{appController, str, jSONObject, pHAErrorType, str2});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("api", (Object) str);
        if (jSONObject != null) {
            jSONObject2.put("params", (Object) jSONObject.toJSONString());
        }
        appController.P().a(nfc.PHA_MONITOR_MODULE_POINT_JS_API, new a(pHAErrorType, str2, jSONObject2));
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f5a9d22", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (digest == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return String.valueOf(str.hashCode());
        }
    }

    private static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43070f0f", new Object[]{bArr}) : Base64.encodeToString(bArr, 0);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        try {
            return c(MessageDigest.getInstance("MD5").digest(bArr)).replaceAll("\\s+", "");
        } catch (Exception e) {
            ngr.b("CommonUtils", e.toString());
            return null;
        }
    }

    public static String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76788e01", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        if (str.endsWith(".js")) {
            return "application/javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (!str.endsWith(".html")) {
            return null;
        }
        return "text/html";
    }

    public static void a(AppController appController, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ecf562", new Object[]{appController, gVar});
        } else if (gVar != null && appController != null) {
            for (Map.Entry<String, Long> entry : appController.Y().entrySet()) {
                if (entry != null) {
                    gVar.a(entry.getKey(), entry.getValue().longValue());
                }
            }
            for (Map.Entry<String, Object> entry2 : appController.Z().entrySet()) {
                if (entry2 != null) {
                    gVar.a(entry2.getKey(), entry2.getValue());
                }
            }
        }
    }
}
