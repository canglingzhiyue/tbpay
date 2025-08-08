package com.taobao.android.detail.core.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tinct.ITinctOperater;
import tb.bga;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.jqm;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailScrollOptSwitch";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9937a;
    private static VariationSet b;
    private static boolean c;

    public static /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else {
            h();
        }
    }

    static {
        kge.a(461598022);
        f9937a = true;
        b = null;
        c = false;
        emu.a("com.taobao.android.detail.core.utils.DetailScrollOptSwitch");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b("detailPerfUltronPrerenderDX");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b("detailPerfPreloadRecommendTab");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b("detailPerfPreloadAsyncComponentOnScroll");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : b("detailPerfUltronAsyncRenderContext");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : b("detailPerfUltronCreateItemEventAsync");
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("saveFamilyInfo") { // from class: com.taobao.android.detail.core.utils.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.g();
                    }
                }
            });
        }
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            j();
            k();
            i();
        } catch (Throwable th) {
            i.a(TAG, "init DetailScrollOptSwitch error", th);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        i.d(TAG, "DetailScrollOptSwitch.realInit cost " + currentTimeMillis2 + "ms");
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        c = n();
        i.d(TAG, "initDeviceLevel sLowDevice = " + c);
    }

    private static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        f9937a = "true".equals(epj.h().a("android_detail", "detail_scroll_perf_enable", "true"));
        i.d(TAG, "initOrange sScrollOptOrangeEnable = " + f9937a);
    }

    private static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
        } else if (!l()) {
        } else {
            a(b);
        }
    }

    private static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        VariationSet activate = UTABTest.activate("AB_", "202207111650_2");
        b = activate;
        if (activate == null) {
            if (jqm.a()) {
                com.alibaba.android.ultron.vfw.widget.a.a(epo.a(), "体验优化实验为空");
            }
            i.a(TAG, "readAB 体验优化实验为空");
        }
        return b != null;
    }

    private static void a(VariationSet variationSet, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a909acf9", new Object[]{variationSet, str, str2, str3});
        } else if (variationSet != null) {
            StringBuilder sb = new StringBuilder("dumpAB:");
            sb.append("experimentId:");
            sb.append(str);
            sb.append("bucketId:");
            sb.append(str2);
            sb.append("publishId:");
            sb.append(str3);
            sb.append("~~~");
            for (Variation variation : variationSet) {
                String name = variation.getName();
                String valueAsString = variation.getValueAsString("");
                sb.append(name);
                sb.append(":");
                sb.append(valueAsString);
                sb.append(", ");
            }
            i.d(TAG, sb.toString());
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            bga.c.a("mainDetail", "detail_scroll_opt", str, "default", true);
        } catch (Throwable th) {
            i.a(TAG, "ITinctOperater markFeatureUsed error", th);
        }
    }

    private static void a(VariationSet variationSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa25d5b", new Object[]{variationSet});
        } else if (variationSet == null) {
        } else {
            try {
                String valueOf = String.valueOf(variationSet.getExperimentId());
                String valueOf2 = String.valueOf(variationSet.getExperimentBucketId());
                String valueOf3 = String.valueOf(variationSet.getExperimentReleaseId());
                ITinctOperater.getInstance().markABUsed("detail", valueOf, valueOf2, valueOf3);
                a(variationSet, valueOf, valueOf2, valueOf3);
                String format = String.format("命中实验:%s 分桶:%s 实验版本号%s", valueOf, valueOf2, valueOf3);
                i.d(TAG, format);
                if (!jqm.a()) {
                    return;
                }
                com.alibaba.android.ultron.vfw.widget.a.a(epo.a(), format);
            } catch (Throwable th) {
                i.a(TAG, "ITinctOperater markABUsed error", th);
            }
        }
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            if (!c) {
                i.a(TAG, "getBooleanSwitch sLowDevice false:" + str);
                return false;
            } else if (!f9937a) {
                i.b(TAG, "getBooleanSwitch detail_scroll_perf_enable is false，全局开关关闭了:" + str);
                return false;
            } else if (com.taobao.android.detail.core.debug.a.a(epo.a())) {
                i.a(TAG, "getBooleanSwitch debug包, 强制开启Scroll Opt:" + str);
                a(str);
                return true;
            } else if (m()) {
                i.b(TAG, "getBooleanSwitch 灰度版本号, 强制开启Scroll Opt:" + str);
                a(str);
                return true;
            } else if (b == null) {
                i.a(TAG, "getBooleanSwitch error, 一休开关sVariationSet配置为空; key:" + str);
                return false;
            } else {
                Variation variation = b.getVariation(str);
                if (variation == null) {
                    i.a(TAG, "getBooleanSwitch error, 一休开关variation配置为空; key:" + str);
                    return false;
                }
                boolean valueAsBoolean = variation.getValueAsBoolean(false);
                i.b(TAG, "getBooleanSwitch 一休开关，value for " + str + " is " + valueAsBoolean);
                if (valueAsBoolean) {
                    a(str);
                }
                return valueAsBoolean;
            }
        } catch (Throwable th) {
            i.a(TAG, "getBooleanSwitch error", th);
            return false;
        }
    }

    private static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        String e = epo.e();
        return !StringUtils.isEmpty(e) && e.split("\\.").length == 4;
    }

    private static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : "l".equals(o());
    }

    private static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[0]);
        }
        try {
            com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
            if (a2 == null) {
                return "";
            }
            int a3 = a2.a("deviceLevel", -1);
            return a3 == 2 ? "l" : a3 == 1 ? "m" : "h";
        } catch (Throwable th) {
            i.a(TAG, "get deviceLevel error", th);
            return "";
        }
    }
}
