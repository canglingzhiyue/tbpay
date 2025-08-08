package com.alipay.sdk.sys;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.sdk.app.statistic.StatisticManager;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.cons.GlobalConstants;
import com.alipay.sdk.util.LogUtils;
import com.alipay.sdk.util.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHARSET_UTF8 = "UTF-8";
    public static final String KEY_ACT_INFO = "act_info";
    public static final String KEY_AND_LITE = "ty";
    public static final String KEY_APP_KEY = "appkey";
    public static final String KEY_AP_LINK_TOKEN = "ap_link_token";
    public static final String KEY_EXT_INFO = "extInfo";
    public static final String KEY_PACKAGE_NAME = "an";
    public static final String KEY_PACKAGE_VERSION = "av";
    public static final String KEY_SDK_VERSION = "sv";
    public static final String KEY_SETTING_FILTER = "setting";
    public static final String KEY_START_TIME = "sdk_start_time";
    public static final String PAIR_AND = "&";
    public static final String PAIR_BIZCONTEXT = "bizcontext=\"";
    public static final String PAIR_BIZCONTEXT_ENCODED = "bizcontext=";
    public static final String PAIR_CONNECTION = "\"&";
    public static final String PAIR_QUOTATION_MARK = "\"";

    /* renamed from: a  reason: collision with root package name */
    private String f6168a;
    public final long apInvokeTimestamp;
    public final String apLinkToken;
    private String b;
    private Context c;
    private boolean d;
    private boolean e;
    private final ActivityInfo f;
    private final StatisticInfo g;
    public final String invokeTag;
    public final int processUid;

    public static BizContext getNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizContext) ipChange.ipc$dispatch("d6e07aeb", new Object[0]);
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class HolderForAct {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final HashMap<UUID, BizContext> f6169a = new HashMap<>();
        private static final HashMap<String, BizContext> b = new HashMap<>();

        public static void putToIntent(BizContext bizContext, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c68dbe27", new Object[]{bizContext, intent});
            } else if (bizContext == null || intent == null) {
            } else {
                UUID randomUUID = UUID.randomUUID();
                f6169a.put(randomUUID, bizContext);
                intent.putExtra("i_uuid_b_c", randomUUID);
            }
        }

        public static BizContext getFromIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BizContext) ipChange.ipc$dispatch("40c80607", new Object[]{intent});
            }
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (!(serializableExtra instanceof UUID)) {
                return null;
            }
            return f6169a.remove((UUID) serializableExtra);
        }

        public static void putWithStringToken(BizContext bizContext, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6f98647", new Object[]{bizContext, str});
            } else if (bizContext == null || StringUtils.isEmpty(str)) {
            } else {
                b.put(str, bizContext);
            }
        }

        public static BizContext getWithStringToken(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BizContext) ipChange.ipc$dispatch("e81b2444", new Object[]{str});
            }
            if (!StringUtils.isEmpty(str)) {
                return b.remove(str);
            }
            return null;
        }
    }

    public BizContext(Context context, String str, String str2) {
        this(context, str, str2, null);
    }

    public BizContext(Context context, String str, String str2, StatisticInfo statisticInfo) {
        String str3;
        this.f6168a = "";
        this.b = "";
        this.c = null;
        this.d = false;
        this.e = false;
        boolean isEmpty = StringUtils.isEmpty(str2);
        this.g = statisticInfo;
        this.apLinkToken = b(str, this.b);
        this.apInvokeTimestamp = SystemClock.elapsedRealtime();
        this.processUid = Utils.getProcessUid();
        this.f = Utils.activityInfoForCtx(context);
        this.invokeTag = str2;
        if (!isEmpty) {
            StatisticManager.putAction(this, "biz", "eptyp", str2 + "|" + this.apLinkToken);
            if (this.f != null) {
                str3 = this.f.name + "|" + this.f.launchMode;
            } else {
                str3 = "null";
            }
            StatisticManager.putAction(this, "biz", "actInfo", str3);
        }
        try {
            this.c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f6168a = packageInfo.versionName;
            this.b = packageInfo.packageName;
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
        }
        if (!isEmpty) {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            StatisticManager.putAction(this, "biz", StatisticRecord.EC_PROGRESS_API_INVOKE, sb.toString());
        }
    }

    public Context getAppContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[]{this}) : this.c;
    }

    public String format(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a69e58", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if (!str.contains("\"&")) {
            return a(str);
        }
        return b(str);
    }

    public StatisticInfo getStatisticInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StatisticInfo) ipChange.ipc$dispatch("a01255e5", new Object[]{this}) : this.g;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            String a2 = a(str, "&", "bizcontext=");
            if (StringUtils.isEmpty(a2)) {
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
            if (StringUtils.isEmpty(a2)) {
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
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!StringUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
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
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d74469", new Object[]{this, str, str2});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put(KEY_SDK_VERSION, GlobalConstants.SDK_VERSION);
            if (!this.b.contains(KEY_SETTING_FILTER) || !Utils.isAlipayVersionBefore991(this.c)) {
                jSONObject.put("an", this.b);
            }
            jSONObject.put("av", this.f6168a);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            jSONObject.put("extInfo", a());
            if (this.f != null) {
                str3 = this.f.name + "|" + this.f.launchMode;
            } else {
                str3 = "null";
            }
            jSONObject.put(KEY_ACT_INFO, str3);
            if (!StringUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return "";
        }
    }

    private String b(String str, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{this, str, str2, str3});
        }
        String substring = str.substring(str2.length());
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith("\"") && substring2.endsWith("\"")) {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z = true;
        } else {
            jSONObject = new JSONObject(substring2);
        }
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", "2014052600006128");
        }
        if (!jSONObject.has("ty")) {
            jSONObject.put("ty", "and_lite");
        }
        if (!jSONObject.has(KEY_SDK_VERSION)) {
            jSONObject.put(KEY_SDK_VERSION, GlobalConstants.SDK_VERSION);
        }
        if (!jSONObject.has("an") && (!this.b.contains(KEY_SETTING_FILTER) || !Utils.isAlipayVersionBefore991(this.c))) {
            jSONObject.put("an", this.b);
        }
        if (!jSONObject.has("av")) {
            jSONObject.put("av", this.f6168a);
        }
        if (!jSONObject.has("sdk_start_time")) {
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
        }
        if (!jSONObject.has("extInfo")) {
            jSONObject.put("extInfo", a());
        }
        String jSONObject2 = jSONObject.toString();
        if (z) {
            jSONObject2 = "\"" + jSONObject2 + "\"";
        }
        return str2 + jSONObject2 + str3;
    }

    private JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.apLinkToken);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", Utils.md5Hash(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return "-";
        }
    }

    public static HashMap<String, String> generateApInfo(BizContext bizContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2853ca1", new Object[]{bizContext});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (bizContext != null) {
            hashMap.put("sdk_ver", GlobalConstants.MSP_VERSION);
            hashMap.put("app_name", bizContext.b);
            hashMap.put("token", bizContext.apLinkToken);
            hashMap.put("call_type", bizContext.invokeTag);
            hashMap.put("ts_api_invoke", String.valueOf(bizContext.apInvokeTimestamp));
        }
        return hashMap;
    }

    public boolean isNeedPayFallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de2a35", new Object[]{this})).booleanValue() : this.d;
    }

    public void setNeedPayFallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db1b1fb", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean isAPayEnActivityCreated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a073952a", new Object[]{this})).booleanValue() : this.e;
    }

    public void setAPayEnActivityCreated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f05ba6", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }
}
