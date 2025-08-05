package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cwx;

/* loaded from: classes4.dex */
public class m {

    /* loaded from: classes4.dex */
    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7503a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.f7503a = context;
            this.b = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (!d.b()) {
                HMSLog.d("ReportAaidToken", "Not HW Phone.");
            } else if (m.b(this.f7503a)) {
            } else {
                String a2 = com.huawei.hms.opendevice.b.a(this.f7503a);
                if (TextUtils.isEmpty(a2)) {
                    HMSLog.w("ReportAaidToken", "AAID is empty.");
                } else if (!m.d(this.f7503a, a2, this.b)) {
                    HMSLog.d("ReportAaidToken", "This time need not report.");
                } else {
                    String a3 = cwx.a(this.f7503a).a("region");
                    if (TextUtils.isEmpty(a3)) {
                        HMSLog.i("ReportAaidToken", "The data storage region is empty.");
                        return;
                    }
                    String a4 = k.a(this.f7503a, "com.huawei.hms.opendevicesdk", "ROOT", null, a3);
                    if (TextUtils.isEmpty(a4)) {
                        return;
                    }
                    String c = m.c(this.f7503a, a2, this.b);
                    Context context = this.f7503a;
                    m.b(this.f7503a, g.a(context, a4 + "/rest/appdata/v1/aaid/report", c, (Map<String, String>) null), a2, this.b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum b {
        MOBILE("1"),
        PC("2"),
        TABLET("3"),
        TV("4"),
        SOUNDBOX("5"),
        GLASS("6"),
        WATCH("7"),
        VEHICLE("8"),
        OFFICE_DEVICE("9"),
        IOT_DEVICES("10"),
        HEALTHY("11"),
        ENTERTAINMENT("12"),
        TRANSPORT_DEVICES(AgooConstants.ACK_FLAG_NULL);
        

        /* renamed from: a  reason: collision with root package name */
        private String f7504a;

        b(String str) {
            this.f7504a = str;
        }

        public String a() {
            return this.f7504a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum c {
        IOS("ios"),
        ANDROID("android"),
        HARMONY("harmony"),
        WINDOWS("windows"),
        EMBED("embed"),
        OTHERS("others");
        

        /* renamed from: a  reason: collision with root package name */
        private String f7505a;

        c(String str) {
            this.f7505a = str;
        }

        public String a() {
            return this.f7505a;
        }
    }

    public static void a(Context context, String str) {
        new a(context, str).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "Https response is empty.";
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(com.taobao.mtop.wvplugin.a.RESULT_KEY, 256);
                if (optInt != 0) {
                    HMSLog.e("ReportAaidToken", "Https response body's ret code: " + optInt + ", error message: " + jSONObject.optString("msg"));
                    return;
                }
                boolean saveString = i.a(context).saveString("reportAaidAndToken", n.a(str3 + str2, "SHA-256"));
                StringBuilder sb = new StringBuilder();
                sb.append("Report success ");
                sb.append(saveString ? "and save success." : "but save failure.");
                HMSLog.d("ReportAaidToken", sb.toString());
                return;
            } catch (JSONException unused) {
                str4 = "Has JSONException.";
            } catch (Exception unused2) {
                str4 = "Exception occur.";
            }
        }
        HMSLog.e("ReportAaidToken", str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
        int packageVersionCode = new PackageManagerHelper(context).getPackageVersionCode("com.huawei.android.pushagent");
        HMSLog.d("ReportAaidToken", "NC version code: " + packageVersionCode);
        return (90101400 <= packageVersionCode && packageVersionCode < 100000000) || packageVersionCode >= 100001301;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.alibaba.poplayer.utils.b.MONITOR_TIMEZONE, TimeZone.getDefault().getID());
            jSONObject2.put("country", SystemUtils.getLocalCountry());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("agent_version", new PackageManagerHelper(context).getPackageVersionName("com.huawei.android.pushagent"));
            jSONObject3.put("hms_version", String.valueOf(Util.getHmsVersion(context)));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("dev_type", b.MOBILE.a());
            jSONObject4.put("dev_sub_type", "phone");
            jSONObject4.put("os_type", c.ANDROID.a());
            jSONObject4.put("os_version", String.valueOf(HwBuildEx.VERSION.EMUI_SDK_INT));
            jSONObject.put("id", UUID.randomUUID().toString());
            jSONObject.put("global", jSONObject2);
            jSONObject.put("push_agent", jSONObject3);
            jSONObject.put(com.taobao.downgrade.e.HARDWARE, jSONObject4);
            jSONObject.put("aaid", str);
            jSONObject.put("token", str2);
            jSONObject.put("app_id", cwx.a(context).a("client/app_id"));
            jSONObject.put("region", cwx.a(context).a("region"));
            return jSONObject.toString();
        } catch (JSONException unused) {
            HMSLog.e("ReportAaidToken", "Catch JSONException.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context, String str, String str2) {
        i a2 = i.a(context);
        if (!a2.containsKey("reportAaidAndToken")) {
            HMSLog.d("ReportAaidToken", "It hasn't been reported, this time needs report.");
            return true;
        }
        String string = a2.getString("reportAaidAndToken");
        if (TextUtils.isEmpty(string)) {
            HMSLog.w("ReportAaidToken", "It has been reported, but report value is empty, this time needs report.");
            return true;
        }
        return !string.equals(n.a(str2 + str, "SHA-256"));
    }
}
