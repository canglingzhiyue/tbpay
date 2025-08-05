package com.alipay.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.sdk.m.e.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.nom;

/* loaded from: classes3.dex */
public final class OpenAuthTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int Duplex = 5000;
    public static final int ERROR_RESULT_BIZ = 3001;
    public static final int ERROR_RESULT_EXC = 3002;
    public static final int NOT_INSTALLED = 4001;
    public static final int OK = 9000;
    public static final int SYS_ERR = 4000;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Callback> f6141a = new ConcurrentHashMap();
    private static long b = -1;
    private final Activity d;
    private Callback e;
    private volatile boolean c = false;
    private final Handler f = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");
        
        private final String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    /* loaded from: classes3.dex */
    public interface Callback {
        void onResult(int i, String str, Bundle bundle);
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6142a;

        static {
            int[] iArr = new int[BizType.values().length];
            f6142a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6142a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6142a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f6143a;
        public final String b;
        public final Bundle c;

        public /* synthetic */ b(OpenAuthTask openAuthTask, int i, String str, Bundle bundle, a aVar) {
            this(i, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (OpenAuthTask.a(OpenAuthTask.this) == null) {
            } else {
                OpenAuthTask.a(OpenAuthTask.this).onResult(this.f6143a, this.b, this.c);
            }
        }

        private b(int i, String str, Bundle bundle) {
            this.f6143a = i;
            this.b = str;
            this.c = bundle;
        }
    }

    public OpenAuthTask(Activity activity) {
        this.d = activity;
    }

    public static /* synthetic */ Callback a(OpenAuthTask openAuthTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Callback) ipChange.ipc$dispatch("fe18469f", new Object[]{openAuthTask}) : openAuthTask.e;
    }

    public static void returnResult(String str, int i, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bebef65", new Object[]{str, new Integer(i), str2, bundle});
            return;
        }
        Callback remove = f6141a.remove(str);
        if (remove == null) {
            return;
        }
        try {
            remove.onResult(i, str2, bundle);
        } catch (Throwable unused) {
        }
    }

    public void execute(String str, BizType bizType, Map<String, String> map, Callback callback, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290856d5", new Object[]{this, str, bizType, map, callback, new Boolean(z)});
            return;
        }
        com.alipay.sdk.m.d.a aVar = new com.alipay.sdk.m.d.a();
        this.e = callback;
        a(aVar, str, bizType, map, z);
    }

    public boolean isAliPaySupportOpenAuth() {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21bdb78", new Object[]{this})).booleanValue();
        }
        try {
            com.alipay.sdk.m.d.a aVar = new com.alipay.sdk.m.d.a();
            com.alipay.sdk.m.e.b a2 = e.a(aVar, this.d, com.alipay.sdk.m.c.a.g);
            if (a2 != null && !a2.a(aVar) && !a2.a() && (packageInfo = a2.f6157a) != null) {
                if (packageInfo.versionCode >= 122) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean a(com.alipay.sdk.m.d.a aVar, String str, BizType bizType, Map<String, String> map, boolean z) {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d247c560", new Object[]{this, aVar, str, bizType, map, new Boolean(z)})).booleanValue();
        }
        if (this.c) {
            this.f.post(new b(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.c = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - b <= 3000) {
            this.f.post(new b(this, 5000, "3s 内重复授权", null, null));
            return true;
        }
        b = elapsedRealtime;
        String a2 = e.a(32);
        HashMap hashMap = new HashMap(map);
        hashMap.put("mqpPkgName", this.d.getPackageName());
        hashMap.put("mqpScene", g4.a.f3423a);
        com.alipay.sdk.m.e.b a3 = e.a(aVar, this.d, com.alipay.sdk.m.c.a.g);
        if (a3 == null || a3.a(aVar) || a3.a() || (packageInfo = a3.f6157a) == null || packageInfo.versionCode < 122) {
            if (z) {
                hashMap.put("mqpScheme", String.valueOf(str));
                hashMap.put("mqpNotifyName", a2);
                hashMap.put("mqpScene", "landing");
                String a4 = a(bizType, hashMap);
                Intent intent = new Intent(this.d, H5OpenAuthActivity.class);
                intent.putExtra("url", String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(a4)));
                com.alipay.sdk.m.d.b.a(aVar, intent);
                this.d.startActivity(intent);
                return false;
            }
            this.f.post(new b(this, 4001, "支付宝未安装或签名错误", null, null));
            return true;
        }
        try {
            String a5 = a(bizType, hashMap);
            f6141a.put(a2, this.e);
            String str2 = null;
            try {
                str2 = a(elapsedRealtime, a2, bizType, a5);
            } catch (JSONException unused) {
            }
            if (TextUtils.isEmpty(str2)) {
                this.f.post(new b(this, 4000, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme(MspGlobalDefine.ALIPAYS_SCHEME).authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter("payload", str2).build());
            intent2.addFlags(268435456);
            intent2.setPackage(a3.f6157a.packageName);
            try {
                com.alipay.sdk.m.d.b.a(aVar, a2);
                this.d.startActivity(intent2);
            } catch (Throwable unused2) {
            }
            return false;
        } catch (Throwable unused3) {
            this.f.post(new b(this, 4000, "业务参数错误", null, null));
            return true;
        }
    }

    private String a(BizType bizType, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f01a87f7", new Object[]{this, bizType, map});
        }
        if (bizType != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(MspGlobalDefine.ALIPAYS_SCHEME).authority("platformapi").path("startapp").appendQueryParameter("appId", bizType.appId);
            if (a.f6142a[bizType.ordinal()] == 1) {
                appendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", nom.VALUE_YES);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return appendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    private String a(long j, String str, BizType bizType, String str2) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae7895c", new Object[]{this, new Long(j), str, bizType, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", String.valueOf(j));
        jSONObject.put(MspGlobalDefine.SESSION, str);
        jSONObject.put("package", this.d.getPackageName());
        if (bizType != null) {
            jSONObject.put("appId", bizType.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.100");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2);
    }
}
