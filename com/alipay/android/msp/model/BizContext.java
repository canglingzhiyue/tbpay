package com.alipay.android.msp.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AND_LITE = "ty";
    public static final String KEY_APP_KEY = "appkey";
    public static final String KEY_PACKAGE_VERSION = "av";
    public static final String KEY_START_TIME = "sdk_start_time";
    public static final String PAIR_AND = "&";
    public static final String PAIR_BIZCONTEXT = "bizcontext=\"";
    public static final String PAIR_BIZCONTEXT_ENCODED = "bizcontext=";
    public static final String PAIR_CONNECTION = "\"&";
    public static final String PAIR_QUOTATION_MARK = "\"";

    /* renamed from: a  reason: collision with root package name */
    private String f4913a;
    private String b;
    private Context c;

    public BizContext(Context context) {
        this.f4913a = "";
        this.b = "";
        this.c = null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f4913a = packageInfo.versionName;
            this.b = packageInfo.packageName;
            this.c = context.getApplicationContext();
        } catch (Exception unused) {
        }
    }

    public String format(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a69e58", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if (!str.contains("\"&")) {
            return a(str);
        }
        return b(str);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            String a2 = a(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(a2)) {
                str = str + "&" + a("bizcontext=", "");
            } else {
                int indexOf = str.indexOf(a2);
                str = str.substring(0, indexOf) + b(a2, "bizcontext=", "") + str.substring(indexOf + a2.length());
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            String a2 = a(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(a2)) {
                return str + "&" + a("bizcontext=\"", "\"");
            }
            if (!a2.endsWith("\"")) {
                a2 = a2 + "\"";
            }
            int indexOf = str.indexOf(a2);
            return str.substring(0, indexOf) + b(a2, "bizcontext=\"", "\"") + str.substring(indexOf + a2.length());
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    private String a(String str, String str2) throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String buildSimpleBizContext = buildSimpleBizContext("", "");
        return str + buildSimpleBizContext + str2;
    }

    public String buildSimpleBizContext(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d74469", new Object[]{this, str, str2});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put("av", this.f4913a);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    private String b(String str, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{this, str, str2, str3});
        }
        String substring = str.substring(str2.length());
        JSONObject jSONObject = new JSONObject(substring.substring(0, substring.length() - str3.length()));
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", "2014052600006128");
        }
        if (!jSONObject.has("ty")) {
            jSONObject.put("ty", "sdk_and");
        }
        if (!jSONObject.has("av")) {
            jSONObject.put("av", this.f4913a);
        }
        if (!jSONObject.has("sdk_start_time")) {
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
        }
        String jSONObject2 = jSONObject.toString();
        return str2 + jSONObject2 + str3;
    }
}
