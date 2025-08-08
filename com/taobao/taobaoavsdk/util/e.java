package com.taobao.taobaoavsdk.util;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.kge;
import tb.oyu;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f21346a;
    public static volatile boolean n;
    private String b;
    private String c;
    private String d;
    private long e = 0;
    private long f = 0;
    private long g = 0;
    private boolean m = false;
    private boolean h = false;
    private boolean l = true;
    private String i = "[\"guangguang_pick\",\"ggpick_preload\",\"homepageLiveCard\"]";
    private long j = 0;
    private int k = 30;

    static {
        kge.a(-1345955583);
        n = true;
    }

    private e() {
    }

    public static e a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c58cabce", new Object[]{context});
        }
        if (f21346a == null) {
            synchronized (e.class) {
                if (f21346a == null) {
                    e eVar = new e();
                    f21346a = eVar;
                    eVar.b(context);
                }
            }
        }
        return f21346a;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (MediaSystemUtils.isApkDebuggable()) {
            String a2 = oyu.a(context, "surfaceview_component_gray3", "surfaceview_module_gray3", "enable", "");
            if (!StringUtils.isEmpty(a2)) {
                this.h = Boolean.parseBoolean(a2);
            }
            String a3 = oyu.a(context, "surfaceview_component_gray3", "surfaceview_module_gray3", "subBusinessTypeList", "");
            if (!StringUtils.isEmpty(a3)) {
                this.i = a3;
            }
            String a4 = oyu.a(context, "surfaceview_component_gray3", "surfaceview_module_gray3", "sdkVersion", "");
            if (!StringUtils.isEmpty(a4)) {
                this.k = Integer.valueOf(a4).intValue();
            }
            String a5 = oyu.a(context, "surfaceview_component_gray3", "surfaceview_module_gray3", "enableLiveRoomInit", "");
            if (!StringUtils.isEmpty(a5)) {
                n = Boolean.parseBoolean(a5);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLiveRoomInitSurfaceViewParamFromAB mEnableLiveRoomInitSurfaceViewFromAB is " + n);
            }
            String a6 = oyu.a(context, "surfaceview_component_gray3", "surfaceview_module_gray3", "sdkVersionBlackList", "");
            if (!StringUtils.isEmpty(a6) && a6.contains(String.valueOf(Build.VERSION.SDK_INT))) {
                n = false;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLiveRoomInitSurfaceViewParamFromAB mEnableLiveRoomInitSurfaceViewFromAB set to false because blackSDKversion=" + a6 + ", device sdk=" + Build.VERSION.SDK_INT);
            }
            String a7 = oyu.a(context, "surfaceview_component_gray3", "surfaceview_module_gray3", "deviceLevelBlackList", "");
            if (!StringUtils.isEmpty(a7) && a7.contains(String.valueOf(oyu.c()))) {
                n = false;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLiveRoomInitSurfaceViewParamFromAB mEnableLiveRoomInitSurfaceViewFromAB set to false because deviceLevelBlackList=" + a7 + ", deviceLevel=" + oyu.c());
            }
            String a8 = oyu.a(context, "surfaceview_component_gray3", "surfaceview_module_gray3", "deviceModelBlackList", "");
            if (StringUtils.isEmpty(a8) || !a8.contains(String.valueOf(Build.MODEL))) {
                return;
            }
            n = false;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLiveRoomInitSurfaceViewParamFromAB deviceModelBlackList set to false because deviceModelBlackList=" + a8 + ", deviceModel=" + Build.MODEL);
        } else if (this.m) {
        } else {
            try {
                VariationSet activate = UTABTest.activate("surfaceview_component_gray3", "surfaceview_module_gray3");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enable");
                    if (variation != null) {
                        this.h = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("subBusinessTypeList");
                    if (variation2 != null) {
                        this.i = variation2.getValueAsString("");
                    }
                    Variation variation3 = activate.getVariation("sdkVersion");
                    if (variation3 != null) {
                        this.k = variation3.getValueAsInt(30);
                    }
                    Variation variation4 = activate.getVariation("enableLiveRoomInit");
                    if (variation4 != null) {
                        n = variation4.getValueAsBoolean(false);
                    }
                    Variation variation5 = activate.getVariation("sdkVersionBlackList");
                    if (variation5 != null) {
                        String valueAsString = variation5.getValueAsString("");
                        if (!StringUtils.isEmpty(valueAsString) && valueAsString.contains(String.valueOf(Build.VERSION.SDK_INT))) {
                            n = false;
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLiveRoomInitSurfaceViewParamFromAB mEnableLiveRoomInitSurfaceViewFromAB set to false because blackSDKversion=" + valueAsString + ", device sdk=" + Build.VERSION.SDK_INT);
                        }
                    }
                    Variation variation6 = activate.getVariation("deviceLevelBlackList");
                    if (variation6 != null) {
                        String valueAsString2 = variation6.getValueAsString("");
                        if (!StringUtils.isEmpty(valueAsString2) && valueAsString2.contains(String.valueOf(oyu.c()))) {
                            n = false;
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLiveRoomInitSurfaceViewParamFromAB mEnableLiveRoomInitSurfaceViewFromAB set to false because deviceLevelBlackList=" + valueAsString2 + ", deviceLevel=" + oyu.c());
                        }
                    }
                    Variation variation7 = activate.getVariation("deviceModelBlackList");
                    if (variation7 != null) {
                        String valueAsString3 = variation7.getValueAsString("");
                        if (!StringUtils.isEmpty(valueAsString3) && valueAsString3.contains(Build.MODEL)) {
                            n = false;
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLiveRoomInitSurfaceViewParamFromAB deviceModelBlackList set to false because deviceModelBlackList=" + valueAsString3 + ", deviceModel=" + Build.MODEL);
                        }
                    }
                    this.e = activate.getExperimentId();
                    this.f = activate.getExperimentBucketId();
                    this.g = activate.getExperimentReleaseId();
                }
                this.m = true;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SurfaceViewUtils generateABParam error: " + th.toString());
            }
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.e;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.f + (this.j * 1000 * 1000 * 1000);
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.g;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        this.l = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SURFACEVIEW_IN_LIVE, "true"));
        if (this.l) {
            return true;
        }
        this.j += 100;
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SURFACEVIEW_MIN_SDK_VERSION, "28"))) {
            this.j = 1L;
            return false;
        } else if (!oyu.e) {
            this.j = 2L;
            return false;
        } else if (oyu.p > 2) {
            this.j = 6L;
            return false;
        } else if (!oyu.b()) {
            this.j = 3L;
            return false;
        } else {
            this.h = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SURFACEVIEW, "true"));
            if (!this.h) {
                this.j = 4L;
                return false;
            }
            this.b = OrangeConfig.getInstance().getConfig("DWInteractive", "h264HardwareDecodeBlackList", "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            this.c = OrangeConfig.getInstance().getConfig("DWInteractive", "h265HardwareDecodeBlackList2", "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            this.d = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_HEVC_AUTHEN_BLACK, MediaConstant.DEFAULT_H265_HW_DECODE_BLACK_LIST_NEW);
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_SURFACEVIEW_MODEL_LIST, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            if (b.b(Build.MODEL, this.b) || b.b(Build.MODEL, this.c) || b.b(Build.MODEL, this.d) || b.b(Build.MODEL, config)) {
                this.j = 5L;
                return false;
            }
            this.j = 0L;
            return true;
        }
    }

    public boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        b(context);
        if (Build.VERSION.SDK_INT < this.k) {
            this.j += 40;
            return false;
        } else if (StringUtils.isEmpty(str)) {
            this.j += 10;
            return false;
        } else if (StringUtils.isEmpty(this.i)) {
            this.j += 20;
            return false;
        } else {
            boolean b = b.b(str, this.i);
            if (!b) {
                this.j += 30;
            }
            return b;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j += i * 1000;
        }
    }
}
