package com.meizu.cloud.pushsdk.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.PushManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.f.c.f;
import com.meizu.cloud.pushsdk.f.d.b;
import com.meizu.cloud.pushsdk.f.g.e;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f8018a;
        final /* synthetic */ Intent b;
        final /* synthetic */ long c;
        final /* synthetic */ boolean d;
        final /* synthetic */ Map e;

        a(Context context, Intent intent, long j, boolean z, Map map) {
            this.f8018a = context;
            this.b = intent;
            this.c = j;
            this.d = z;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8018a.startService(this.b);
                DebugLogger.i("UxIPUtils", "delayed " + this.c + " ms start tracker data in mz_tracker process " + this.b.getStringExtra(PushConstants.EXTRA_PUSH_TRACKER_JSON_DATA));
            } catch (Exception e) {
                e.printStackTrace();
                DebugLogger.e("UxIPUtils", "delayed startRemotePushTracker error " + e.getMessage());
                d.a(this.f8018a, this.d, (String) this.e.get("en"), this.e);
            }
        }
    }

    private static Intent a(Context context, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        String str4;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(PushConstants.MZ_PUSH_TRACKER_SERVICE_ACTION), 0);
        if (queryIntentServices != null) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = null;
                    str4 = null;
                    break;
                }
                ResolveInfo next = it.next();
                if (PushConstants.PUSH_PACKAGE_NAME.equals(next.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = next.serviceInfo;
                    str4 = serviceInfo.packageName;
                    str3 = serviceInfo.name;
                    break;
                }
            }
            if (!StringUtils.isEmpty(str3) || queryIntentServices.size() <= 0) {
                str = str3;
                str2 = str4;
            } else {
                str2 = queryIntentServices.get(0).serviceInfo.packageName;
                str = queryIntentServices.get(0).serviceInfo.name;
            }
        } else {
            str = null;
            str2 = null;
        }
        DebugLogger.i("UxIPUtils", "current process packageName " + str2);
        if (!StringUtils.isEmpty(str)) {
            try {
                String jSONObject = e.a((Map) map).toString();
                Intent intent = new Intent();
                intent.setPackage(str2);
                intent.setAction(PushConstants.MZ_PUSH_TRACKER_SERVICE_ACTION);
                intent.putExtra(PushConstants.EXTRA_PUSH_TRACKER_JSON_DATA, jSONObject);
                return intent;
            } catch (Exception e) {
                e.printStackTrace();
                DebugLogger.e("UxIPUtils", "getRemotePushTrackerIntent error " + e.getMessage());
            }
        }
        return null;
    }

    public static com.meizu.cloud.pushsdk.handler.e.j.d a(String str) {
        String str2;
        com.meizu.cloud.pushsdk.handler.e.j.d dVar = new com.meizu.cloud.pushsdk.handler.e.j.d();
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str3 = null;
                String string = jSONObject.has("task_id") ? jSONObject.getString("task_id") : null;
                String string2 = jSONObject.has(PushConstants.SEQ_ID) ? jSONObject.getString(PushConstants.SEQ_ID) : null;
                String string3 = jSONObject.has(PushConstants.PUSH_TIMESTAMP) ? jSONObject.getString(PushConstants.PUSH_TIMESTAMP) : null;
                if (jSONObject.has(PushConstants.DEVICE_ID)) {
                    str3 = jSONObject.getString(PushConstants.DEVICE_ID);
                }
                return com.meizu.cloud.pushsdk.handler.e.j.d.a().d(string).a(str3).b(string3).c(string2).a();
            } catch (Exception unused) {
                str2 = "the platformExtra parse error";
            }
        } else {
            str2 = "the platformExtra is empty";
        }
        DebugLogger.e("UxIPUtils", str2);
        return dVar;
    }

    public static String a(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_TASK_ID);
        if (StringUtils.isEmpty(stringExtra)) {
            try {
                MPushMessage mPushMessage = (MPushMessage) intent.getSerializableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
                return mPushMessage != null ? mPushMessage.getTaskId() : stringExtra;
            } catch (Exception e) {
                DebugLogger.e("UxIPUtils", "parse MessageV2 error " + e.getMessage());
                return "no push platform task";
            }
        }
        return stringExtra;
    }

    public static void a(Context context, Intent intent, String str, int i) {
        a(context, intent, PushManager.TAG, str, i);
    }

    public static void a(Context context, Intent intent, String str, String str2, int i) {
        if (!StringUtils.isEmpty(a(intent))) {
            a(context, context.getPackageName(), intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), a(intent), str, str2, i);
        }
    }

    public static void a(Context context, String str, int i, String str2, String str3) {
        if (!StringUtils.isEmpty(str2)) {
            a(context, context.getPackageName(), str3, str2, PushManager.TAG, str, i);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "acsm", str5);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        HashMap hashMap = new HashMap(8);
        hashMap.put(com.taobao.tao.powermsg.model.a.COL_TASK, str3);
        hashMap.put("deviceId", str2);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("package_name", str);
        hashMap.put("pushsdk_version", str4);
        hashMap.put("push_info", str5);
        hashMap.put("push_info_type", String.valueOf(i));
        a(context, false, "notification_service_message", (Map<String, String>) hashMap);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, false, str, str2, str3, str4, "fspm", str5, j);
    }

    public static void a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        a(context, z, str, str2, str3, str4, str5, str6, 0L);
    }

    public static void a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        HashMap hashMap = new HashMap(8);
        hashMap.put("en", str5);
        hashMap.put("ti", str3);
        hashMap.put(AppIconSetting.DEFAULT_LARGE_ICON, str2);
        hashMap.put("fdId", com.meizu.cloud.pushsdk.d.c.b(context));
        if (StringUtils.isEmpty(str6)) {
            str6 = String.valueOf(System.currentTimeMillis() / 1000);
        }
        hashMap.put("ts", str6);
        hashMap.put("pn", str);
        hashMap.put("pv", PushManager.TAG);
        hashMap.put("nm", String.valueOf(System.currentTimeMillis() / 1000));
        if (!StringUtils.isEmpty(str4)) {
            hashMap.put("si", str4);
        }
        if (!a(context, hashMap, z, j)) {
            a(context, z, str5, hashMap);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.meizu.cloud.pushsdk.f.d.b$c] */
    public static void a(Context context, boolean z, String str, Map<String, String> map) {
        DebugLogger.e("UxIPUtils", "onLogEvent eventName [" + str + "] properties = " + map);
        if (!"notification_service_message".equals(str)) {
            com.meizu.cloud.pushsdk.f.a.a(context, (com.meizu.cloud.pushsdk.e.d.a) null, (f) null).a(((b.c) com.meizu.cloud.pushsdk.f.d.b.d().c(str).a(1).a(Long.valueOf(map.get("ts")).longValue())).b(map.get("nm") != null ? map.get("nm") : String.valueOf(System.currentTimeMillis() / 1000)).a(map.get(AppIconSetting.DEFAULT_LARGE_ICON)).d(map.get("fdId")).f(map.get("pn")).g(map.get("pv")).i(map.get("ti")).h(StringUtils.isEmpty(map.get("si")) ? "" : map.get("si")).e(String.valueOf(b.e(context, map.get("pn")))).b(), z);
        }
    }

    private static boolean a(Context context, Intent intent, boolean z, Map<String, String> map, long j) {
        String str;
        if (intent == null) {
            str = "startRemotePushTracker error intent is null";
        } else if (j != 0) {
            new Handler(context.getMainLooper()).postDelayed(new a(context, intent, j, z, map), j);
            return true;
        } else {
            try {
                context.startService(intent);
                DebugLogger.i("UxIPUtils", "immediately start tracker data in mz_tracker process " + intent.getStringExtra(PushConstants.EXTRA_PUSH_TRACKER_JSON_DATA));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                str = "startRemotePushTracker error " + e.getMessage();
            }
        }
        DebugLogger.e("UxIPUtils", str);
        return false;
    }

    private static boolean a(Context context, Map<String, String> map, boolean z, long j) {
        return a(context, a(context, map), z, map, j);
    }

    public static void b(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "acce", str5);
    }

    public static void b(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, false, str, str2, str3, str4, "npm", str5, j);
    }

    public static void c(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "cpm", str5);
    }

    public static void c(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, false, str, str2, str3, str4, "nspm", str5, j);
    }

    public static void d(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "dpm", str5);
    }

    public static void d(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, false, str, str2, str3, str4, "rpe", str5, j);
    }

    public static void e(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "iopm", str5);
    }

    public static void e(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, false, str, str2, str3, str4, "sipm", str5, j);
    }

    public static void f(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "ipm", str5);
    }

    public static void f(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, true, str, str2, str3, str4, "spm", str5, j);
    }

    public static void g(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, false, str, str2, str3, str4, "rpe", str5);
    }

    public static void h(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "rpe", str5);
    }
}
