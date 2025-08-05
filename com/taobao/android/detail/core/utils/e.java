package com.taobao.android.detail.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import tb.acg;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.jqm;
import tb.kge;

@Deprecated
/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENABLE_DETAIL_DX_ERROR_DOWNGRADE = "enable_detail_dx_error_downgrade";
    public static final String ENABLE_LOW_MEM_RECYCLE = "enable_low_memory_recycle";
    public static final String ENABLE_MTOP_HANDLER = "enable_mtop_handler";
    public static final String ORANGE_KEY_CLOSE_PRELOAD_DESC = "detail_close_preload_desc";
    public static final String ORANGE_KEY_PERF_BLACKLIST = "detail_perf_switch_blacklist";
    public static final String ORANGE_KEY_PERF_ENABLE = "detail_perf_switch_enable";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9935a;
    private static String b;

    static {
        kge.a(-1735297487);
        f9935a = false;
        b = "";
        emu.a("com.taobao.android.detail.core.utils.DetailPerfSwitch");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        g.f();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f9935a = "true".equals(epj.h().a("android_detail", ORANGE_KEY_PERF_ENABLE, "false"));
            b = epj.h().a("android_detail", ORANGE_KEY_PERF_BLACKLIST, "");
        } catch (Throwable th) {
            i.a("detail.PerfSwitch", "init DetailPerfSwitch error", th);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append(f9935a ? "DetailPerfSwitch总开关开启" : "DetailPerfSwitch总开关关闭");
        sb.append("userTime=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        String sb2 = sb.toString();
        i.d("detail.PerfSwitch", sb2);
        if (f9935a || !jqm.a()) {
            return;
        }
        com.alibaba.android.ultron.vfw.widget.a.a(epo.a(), sb2);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            if (!b.isEmpty() && b.contains(str)) {
                String str2 = str + " in detail_perf_switch_blacklist, so disable";
                i.d("detail.PerfSwitch", str2);
                if (jqm.a()) {
                    com.alibaba.android.ultron.vfw.widget.a.a(epo.a(), str2);
                }
                return false;
            }
            return ABGlobal.a(acg.a(), "taobao", "tbspeed", str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : f9935a && a("detail_main_pic_transmit");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f9935a && a("detail_sku_async");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : f9935a && a("detail_ultron_adapter_precreate");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : f9935a && a("detail_preload_static_template");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : f9935a && a("detail_simple_adjust");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : f9935a && !n() && a("detail_preload_desc");
    }

    private static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", ORANGE_KEY_CLOSE_PRELOAD_DESC, "false"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : f9935a && a("detail_preload_recommend");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : f9935a && a("detail_dx_use_pipeline_cache");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_DETAIL_DX_ERROR_DOWNGRADE, "true"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_LOW_MEM_RECYCLE, "true"));
        } catch (Throwable unused) {
            return true;
        }
    }
}
