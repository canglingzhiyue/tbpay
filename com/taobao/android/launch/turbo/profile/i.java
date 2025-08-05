package com.taobao.android.launch.turbo.profile;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.gsv;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<Map<String, String>> b;

    /* renamed from: a  reason: collision with root package name */
    private int f13018a;

    static {
        kge.a(-1769218831);
        b = new CopyOnWriteArrayList();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f13018a = i;
        }
    }

    private Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pgo_device_manufacturer", Build.MANUFACTURER);
        hashMap.put("pgo_device_model", Build.MODEL);
        hashMap.put("pgo_sdk_int", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("pgo_policy", String.valueOf(this.f13018a));
        return hashMap;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> b2 = b();
        b2.put("pgo_profile_compile_times", String.valueOf(i));
        a("pgo_dex2oat_compiling", b2);
    }

    public void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        Map<String, String> b2 = b();
        b2.put("pgo_profile_compile_used_time", String.valueOf(j));
        b2.put("pgo_profile_compile_times", String.valueOf(i));
        a("pgo_dex2oat_finish", b2);
    }

    public void a(long j, long j2, long j3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed985a7", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Integer(i)});
            return;
        }
        Map<String, String> b2 = b();
        b2.put("pgo_profile_compile_result", "1");
        b2.put("pgo_odex_compile_before_size", String.valueOf(j));
        b2.put("pgo_odex_compile_after_size", String.valueOf(j2));
        b2.put("pgo_profile_compile_used_time", String.valueOf(j3));
        b2.put("pgo_profile_compile_times", String.valueOf(i));
        a("pgo_compile_success", b2);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> b2 = b();
        b2.put("pgo_profile_compile_times", String.valueOf(i));
        a("pgo_compile_fail", b2);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!UTAnalytics.getInstance().isInit() || b.isEmpty()) {
            return false;
        }
        for (Map<String, String> map : b) {
            UTAnalytics.getInstance().getDefaultTracker().send(map);
        }
        gsv.a("ProfileMonitor", "cached ut log sent");
        b.clear();
        return true;
    }

    private static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        try {
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("launch_turbo_pgo", 19999, str, null, null, map);
            if (UTAnalytics.getInstance().isInit()) {
                a();
                UTAnalytics.getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
                return;
            }
            gsv.a("ProfileMonitor", "ut is not ready, add to cache");
            b.add(uTOriginalCustomHitBuilder.build());
        } catch (Throwable th) {
            gsv.a("ProfileMonitor", "send ut failed for: " + str, th);
        }
    }
}
