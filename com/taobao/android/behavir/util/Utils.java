package com.taobao.android.behavir.util;

import android.app.Application;
import android.os.Build;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationManagerCompat;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.message.notification.constans.SettingContants;
import mtopsdk.mtop.global.SDKUtils;
import tb.kge;

/* loaded from: classes4.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, int i, JSONObject jSONObject, long j);
    }

    static {
        kge.a(-775323709);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str == null ? "" : str;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Looper.getMainLooper().isCurrentThread();
        }
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj}) : obj != null ? String.valueOf(obj.hashCode()) : "";
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject}) : jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{jSONArray}) : jSONArray == null ? new JSONArray() : jSONArray;
    }

    public static <I, O> JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject}) : jSONObject == null ? g.EMPTY_JSON : jSONObject;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "taobao".equals(com.taobao.android.behavix.d.c());
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(deserialize = false, serialize = false)

        /* renamed from: a  reason: collision with root package name */
        private final transient JSONObject f9149a;

        static {
            kge.a(-1740500629);
        }

        public b(JSONObject jSONObject) {
            this.f9149a = jSONObject;
        }

        @JSONField(serialize = false)
        public JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : Utils.a(this.f9149a);
        }
    }

    public static void a(String str, String str2, String str3, String str4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcf2471", new Object[]{str, str2, str3, str4, aVar});
        } else if (aVar == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            BHREvent.buildInternalEvent(str, str2, "").bizArgKVMapObject = g.a("triggerCode", str4, com.alibaba.triver.triver_shop.newShop.event.ucp.a.MATERIAL_ID_KEY, str3, "br_from", "ucp");
            a(str, str2, str3, currentTimeMillis, str4, aVar, true);
        }
    }

    private static void a(String str, String str2, String str3, long j, String str4, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5d777b", new Object[]{str, str2, str3, new Long(j), str4, aVar, new Boolean(z)});
            return;
        }
        BHRTaskConfigBase.isMatchTrackSimpling(com.taobao.android.behavix.behavixswitch.a.a("ucpDefaultTrackSampling", 1.0d));
        long currentTimeMillis = System.currentTimeMillis() - j;
        aVar.a(true, 201, g.a().a("schemeId", str).a("bizId", str2).a(com.alibaba.triver.triver_shop.newShop.event.ucp.a.MATERIAL_ID_KEY, str3).a("triggerCode", str4).a("checkCost", Long.valueOf(currentTimeMillis)).a("retCode", 201).a(), currentTimeMillis);
    }

    public static long getServerTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7cda1621", new Object[0])).longValue() : SDKUtils.getCorrectionTimeMillis();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        Application b2 = com.taobao.android.behavix.d.b();
        if (b2 != null) {
            return PreferenceManager.getDefaultSharedPreferences(b2).getBoolean(SettingContants.SETTINGS_APP_BANNER, true);
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        Application b2 = com.taobao.android.behavix.d.b();
        if (b2 != null) {
            return NotificationManagerCompat.from(b2).areNotificationsEnabled();
        }
        return false;
    }
}
