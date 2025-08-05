package com.alipay.android.app.selftest;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ui.ImageLoader;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.ResUtils;
import com.alipay.mobile.common.rpc.EmptyRpcInvokeContext;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class SelfTestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f4395a = new AtomicBoolean(false);

    public static /* synthetic */ void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    public static synchronized void triggerSelfTestAsync(Context context) {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc1a469b", new Object[]{context});
            } else if (context == null) {
            } else {
                final Context applicationContext = context.getApplicationContext();
                if (DrmManager.getInstance(applicationContext).isGray(DrmKey.DEGRADE_SDK_RUNTIME_INFO_DETECT, false, applicationContext)) {
                    return;
                }
                long j = 10;
                JSONObject drmValueFromKey = DrmManager.getInstance(applicationContext).getDrmValueFromKey(DrmKey.CONFIG_SDK_RUNTIME_INFO_DETECT_DELAY_IN_SECOND);
                if (drmValueFromKey != null && drmValueFromKey.containsKey("delay")) {
                    j = drmValueFromKey.getLongValue("delay");
                }
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.selftest.SelfTestManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            GlobalHelper.getInstance().init(applicationContext);
                            SelfTestManager.a();
                        } catch (Throwable th) {
                            LogUtil.record(8, "STM.triggerSelfTestAsync", "task error");
                            LogUtil.printExceptionStackTrace(th);
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(j));
            }
        }
    }

    private static synchronized void b() throws Exception {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            } else if (d()) {
                LogUtil.record(2, "STM.startSelfTestSync", "mem done");
            } else if (f()) {
                LogUtil.record(2, "STM.startSelfTestSync", "spref done");
                c();
            } else {
                e();
                c();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                a(jSONObject2, "target", PkgInfoTests.a());
                a(jSONObject2, "is_64_bit", PkgInfoTests.b());
                a(jSONObject2, "app_name", PkgInfoTests.c());
                a(jSONObject2, "sdk_ver", GlobalSdkConstant.getMspVersion());
                LogUtil.record(2, "STM.testBasicInfo", "basic -> ".concat(String.valueOf(jSONObject2)));
                a(jSONObject, "basic_info", jSONObject2);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                a(jSONObject3, "BirdNest", DepInfoTests.a());
                a(jSONObject3, "VISDK", DepInfoTests.b());
                LogUtil.record(2, "STM.testDependencyInfo", "dependency -> ".concat(String.valueOf(jSONObject3)));
                a(jSONObject, "dependency", jSONObject3);
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                a(jSONObject4, "RPCSDK.setAppKey", FuncInfoTests.a());
                LogUtil.record(2, "STM.testFuncInfo", "dependency -> ".concat(String.valueOf(jSONObject4)));
                a(jSONObject, "func", jSONObject4);
                JSONArray jSONArray = new JSONArray();
                a(jSONArray, a("com.alipay.android.app/alipay_msp_arrow_left"));
                a(jSONArray, a("com.alipay.android.app/alipay_msp_close"));
                a(jSONArray, a("com.alipay.android.app/alipay_msp_rmb"));
                a(jSONArray, a("AlipaySDK.bundle/alipay_msp_check"));
                a(jSONArray, a("com.alipay.android.app/alipay_substitute_user_corner_bg"));
                a(jSONObject, "resource_detect", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                a(jSONArray2, a(1, "year_up_btn", "id", null));
                a(jSONArray2, a(2, "alipay_msp_tag_view_holder", "id", "com.alipay.android.app.template"));
                a(jSONArray2, a(3, "year_down_btn", "id", null));
                a(jSONObject, "id_detect", jSONArray2);
                String replace = jSONObject.toString().replace("#", "#0").replace(",", "#1");
                LogUtil.record(2, "STM.startSelfTestSync", "report content: ".concat(String.valueOf(replace)));
                EventLogUtil.logPayEvent("1010914", "info", replace);
            }
        }
    }

    private static org.json.JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("2f58b020", new Object[]{str});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        a(jSONObject, "name", str);
        Pair a2 = ResInfoTests.a(str);
        a(jSONObject, "width", a2.first);
        a(jSONObject, "height", a2.second);
        LogUtil.record(2, "STM.testImageResource", "img -> ".concat(String.valueOf(jSONObject)));
        return jSONObject;
    }

    private static org.json.JSONObject a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("d7814da7", new Object[]{new Integer(i), str, str2, str3});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        a(jSONObject, "name", str2 + "/" + str);
        if (i == 1) {
            a(jSONObject, "id", Integer.valueOf(ResInfoTests.a(str, str2)));
        } else if (i == 2) {
            a(jSONObject, "id", Integer.valueOf(ResInfoTests.idResFromCashier(str, str2, str3)));
        } else if (i == 3) {
            a(jSONObject, "id", Integer.valueOf(ResInfoTests.idResFromSafepay(str, str2)));
        }
        return jSONObject;
    }

    private static synchronized void c() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[0]);
            } else {
                f4395a.set(true);
            }
        }
    }

    private static synchronized boolean d() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
            }
            return f4395a.get();
        }
    }

    private static synchronized void e() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
                return;
            }
            int i = GlobalHelper.getInstance().getPackageInfo().versionCode;
            LogUtil.record(2, "STM.setSPrefTested", "tested <- ".concat(String.valueOf(i)));
            PrefUtils.putInt("cashier_test_info", "tested_max_app_version", Integer.valueOf(i));
        }
    }

    private static synchronized boolean f() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
            }
            int i = GlobalHelper.getInstance().getPackageInfo().versionCode;
            Integer num = PrefUtils.getInt("cashier_test_info", "tested_max_app_version", 0);
            LogUtil.record(2, "STM.getSPrefTested", "tested = " + num + ", current = " + i);
            return num.intValue() >= i;
        }
    }

    private static void a(org.json.JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f61e7c", new Object[]{jSONObject, str, obj});
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    private static void a(JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8566c5e", new Object[]{jSONArray, obj});
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Throwable unused) {
        }
    }

    /* loaded from: classes3.dex */
    public static final class PkgInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private PkgInfoTests() {
        }

        public static /* synthetic */ String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : d();
        }

        public static /* synthetic */ String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : e();
        }

        public static /* synthetic */ String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : f();
        }

        private static String d() {
            ApplicationInfo applicationInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
            }
            try {
                Context context = GlobalHelper.getInstance().getContext();
                return (context == null || (applicationInfo = context.getApplicationInfo()) == null) ? "unknown" : String.valueOf(applicationInfo.targetSdkVersion);
            } catch (Throwable unused) {
                return "unknown";
            }
        }

        private static String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
            }
            try {
                return Build.VERSION.SDK_INT >= 23 ? String.valueOf(Process.is64Bit()) : "unknown";
            } catch (Throwable unused) {
                return "unknown";
            }
        }

        private static String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
            }
            try {
                return GlobalHelper.getInstance().getPackageInfo().packageName;
            } catch (Throwable unused) {
                return "unknown";
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class DepInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private DepInfoTests() {
        }

        public static /* synthetic */ String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : c();
        }

        public static /* synthetic */ String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : d();
        }

        private static String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
            }
            try {
                return BirdNestEngine.getVersion();
            } catch (Throwable unused) {
                return "unknown";
            }
        }

        private static String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
            }
            try {
                return AppInfo.getInstance().getViSdkVersion();
            } catch (Throwable unused) {
                return "unknown";
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class FuncInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b();
        }

        private static String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            try {
                EmptyRpcInvokeContext.getInstance().setAppKey("");
                return "true";
            } catch (NoClassDefFoundError | NoSuchMethodError unused) {
                return "false";
            } catch (Throwable unused2) {
                return "unknown";
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class ResInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private ResInfoTests() {
        }

        public static /* synthetic */ int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue() : b(str, str2);
        }

        public static /* synthetic */ Pair a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str}) : b(str);
        }

        private static Pair<String, String> b(String str) {
            int imageResId;
            Pair<String, String> pair;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("4f8080fd", new Object[]{str});
            }
            Pair<String, String> pair2 = new Pair<>("", "");
            try {
                Context context = GlobalHelper.getInstance().getContext();
                if (context == null || (imageResId = ImageLoader.getInstance().getImageResId(str)) == 0) {
                    return pair2;
                }
                Drawable drawable = context.getResources().getDrawable(imageResId);
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    pair = new Pair<>(String.valueOf(bitmap.getWidth()), String.valueOf(bitmap.getHeight()));
                } else if (drawable == null) {
                    return pair2;
                } else {
                    pair = new Pair<>(String.valueOf(drawable.getIntrinsicWidth()), String.valueOf(drawable.getIntrinsicHeight()));
                }
                return pair;
            } catch (Throwable unused) {
                return pair2;
            }
        }

        private static int b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{str, str2})).intValue();
            }
            try {
                Context context = GlobalHelper.getInstance().getContext();
                if (context == null) {
                    return -1;
                }
                return ResUtils.getResourceId(context, str, str2);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return -1;
            }
        }

        public static int idResFromCashier(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d7cd30c", new Object[]{str, str2, str3})).intValue();
            }
            if (str3 == null) {
                try {
                    str3 = GlobalHelper.getInstance().getContext().getPackageName();
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    return -1;
                }
            }
            return com.alipay.android.msp.utils.ResUtils.getResourceId(str, str2, str3);
        }

        public static int idResFromSafepay(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d173563a", new Object[]{str, str2})).intValue();
            }
            try {
                Context context = GlobalHelper.getInstance().getContext();
                if (context == null) {
                    return -1;
                }
                return com.alipay.android.app.safepaybase.util.ResUtils.getResourceId(context, str, str2);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return -1;
            }
        }
    }
}
