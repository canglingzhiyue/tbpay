package com.taobao.browser.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.config.j;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.h;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.util.i;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import tb.kge;
import tb.nom;

/* loaded from: classes6.dex */
public class BrowserUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_LIMIT = 10000;
    public static final String KEY_QUERY_MULTI_PROCESS = "browser_multiProcess";

    /* renamed from: a  reason: collision with root package name */
    public static String f16842a;
    public static String b;
    public static String c;
    private static Pattern d;

    /* loaded from: classes6.dex */
    enum PhoneClass {
        Level0,
        Level1,
        Level2,
        Level3,
        Level4,
        Level5,
        UNKNOWN
    }

    public static int a(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d01caec9", new Object[]{iWVWebView, str})).intValue();
        }
        return 2;
    }

    static {
        kge.a(375554258);
        d = null;
        f16842a = com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE;
        b = i.b.MEASURE_ONCREATE;
        c = "deprecated_class";
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(str2);
            if (queryParameter == null) {
                Uri.Builder buildUpon = parse.buildUpon();
                String path = parse.getPath();
                if (path == null || path.length() == 0) {
                    buildUpon.appendPath("");
                }
                return buildUpon.appendQueryParameter(str2, str3).toString();
            } else if ("".equals(queryParameter)) {
                return str.replace(str2 + "=", str2 + "=" + str3);
            } else {
                return str.replace(queryParameter, str3);
            }
        } catch (Exception e) {
            android.taobao.util.k.a(android.taobao.util.k.TAOBAO_TAG, "" + e.getMessage());
            return str;
        }
    }

    public static final boolean a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d04957b1", new Object[]{str, strArr})).booleanValue();
        }
        if (str != null && strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr[i] != null && str.indexOf(strArr[i]) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int a(String str) {
        try {
            return R.string.class.getDeclaredField("uik_icon_" + str).getInt(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return 0;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return 0;
        } catch (SecurityException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static Bitmap a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("99351448", new Object[]{view});
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    public static void a(Context context, String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b85fb3a", new Object[]{context, str, str2, bitmap});
            return;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra(AgooConstants.MESSAGE_DUPLICATE, false);
        intent.putExtra("android.intent.extra.shortcut.NAME", str2);
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        try {
            Intent intent2 = new Intent();
            intent2.setData(Uri.parse(str));
            intent2.setPackage(context.getPackageName());
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            context.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue();
        }
        try {
            String queryParameter = uri.getQueryParameter("wvUseSysWebView");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("true".equals(queryParameter)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        try {
            String queryParameter = uri.getQueryParameter("useSysWebView");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("true".equals(queryParameter)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4533b5c0", new Object[]{uri})).booleanValue();
        }
        try {
            String queryParameter = uri.getQueryParameter("disableScreenShot");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("true".equals(queryParameter.trim())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            TLog.loge("BrowserUtil", e.getMessage());
            return false;
        }
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb9705f", new Object[]{uri})).booleanValue();
        }
        try {
            String queryParameter = uri.getQueryParameter("disableNav");
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!"true".equals(queryParameter)) {
                    if (nom.VALUE_YES.equals(queryParameter)) {
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void a(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474dd404", new Object[]{context, iWVWebView});
        } else if (ABGlobal.a(context, "anrOpt", "WindVane", "optNotifyRefreshCookies") && TextUtils.equals("true", OrangeConfig.getInstance().getConfig("WindVane", i.KEY_ORANGE_CONFIG_NOTIFY_REFRESH_COOKIES, "true"))) {
            com.taobao.browser.a.a().a(new Runnable() { // from class: com.taobao.browser.utils.BrowserUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!Login.checkSessionValid() || Login.checkLoginCookieValid()) {
                        android.taobao.util.k.a("BrowserUtil", "Login.checkLoginCookieValid()");
                    } else {
                        android.taobao.util.k.a("BrowserUtil", "checkLoginCookieInvalid refreshCookies");
                        Login.refreshCookies();
                    }
                }
            });
        } else {
            android.taobao.util.k.a("BrowserUtil", "refreshCookies");
            Login.refreshCookies();
        }
    }

    public static final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        Toast makeText = Toast.makeText(Globals.getApplication(), "", 1);
        if (makeText == null) {
            return;
        }
        makeText.setText(str);
        makeText.show();
    }

    public static boolean b(Context context, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        if (com.taobao.browser.config.a.commonConfig.m) {
            z = TBMainHost.a(context) != null;
        } else {
            z = context instanceof TBMainActivity;
        }
        boolean z2 = context instanceof BrowserActivity;
        boolean z3 = !z2 && !z;
        if (!com.taobao.browser.config.a.commonConfig.i) {
            z3 = !z2;
        }
        if ((context instanceof BrowserUpperActivity) || z3) {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setPackage(context.getPackageName());
            intent.setAction("android.intent.action.VIEW");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null && BrowserActivity.class.toString().contains(resolveActivity.activityInfo.name)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            return Pattern.compile(j.commonConfig.w, 2).matcher(str).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    public static Bundle c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d0751678", new Object[]{str});
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return bundle;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        String[] d2 = h.a().d();
        if (d2 == null) {
            h.a().c();
            return null;
        }
        String str = "";
        String str2 = "(function(){var d=document,r={}";
        for (int i = 0; i < d2.length; i++) {
            str2 = str2 + String.format(",n%d='%s',e%d=d.getElementById(n%d)", Integer.valueOf(i), d2[i], Integer.valueOf(i), Integer.valueOf(i));
            str = str + String.format("if(e%d){r[n%d]=e%d.getAttribute('value')}", Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
        }
        return str2 + String.format(";%sreturn JSON.stringify(r);})()", str);
    }

    @Deprecated
    public static String[] a(Context context, int i) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("48a92bb2", new Object[]{context, new Integer(i)});
        }
        if (context != null && (string = context.getResources().getString(i)) != null) {
            return string.split(";");
        }
        return null;
    }

    public static BitmapDrawable a(int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("770f599e", new Object[]{new Integer(i), context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setText(i);
        tIconFontTextView.setTextSize(20.0f);
        tIconFontTextView.setTextColor(Color.parseColor("#F5A623"));
        tIconFontTextView.setTypeface(Typeface.createFromAsset(context.getAssets(), "uik_iconfont.ttf"));
        return new BitmapDrawable(context.getResources(), a(tIconFontTextView));
    }

    public static float a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6450", new Object[]{context})).floatValue();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843499});
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        try {
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
        }
        return dimension;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{activity}) : Integer.toHexString(activity.hashCode());
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{str, str2, str3, str4, map});
        } else if (!com.taobao.browser.config.a.commonConfig.o) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("className", str);
            map.put("method", str2);
            if (str3 != null) {
                map.put("branch", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                map.put("url", str4);
            }
            AppMonitor.Alarm.commitSuccess(i.KEY_MONITOR_MODULE, "WebViewFeature", new com.alibaba.fastjson.JSONObject(map).toString());
        }
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935bc097", new Object[]{stackTraceElementArr});
        }
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString() + " \n");
        }
        return sb.toString();
    }
}
