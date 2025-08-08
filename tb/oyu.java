package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.application.common.c;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.i;
import com.taobao.taobaoavsdk.util.a;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.taobaoavsdk.util.d;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tb.aku;
import tb.mto;

/* loaded from: classes8.dex */
public class oyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile float A;
    public static volatile float B;
    public static volatile float C;
    public static volatile boolean D;
    private static volatile boolean E;
    private static volatile boolean F;
    private static volatile Boolean G;
    private static volatile int H;
    private static volatile int I;
    private static volatile Boolean J;
    private static volatile Boolean K;
    private static volatile Boolean L;
    private static volatile int M;
    private static volatile JSONArray N;
    private static volatile int O;
    private static volatile ArrayList<Double> P;
    private static volatile ArrayList<Double> Q;
    private static volatile ArrayList<Double> R;
    private static volatile ArrayList<Double> S;
    private static volatile CopyOnWriteArrayList<Double> T;
    private static volatile CopyOnWriteArrayList<Double> U;
    private static volatile Boolean V;
    public static volatile boolean W;
    private static volatile boolean X;
    public static volatile float Y;
    public static volatile boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Application f32496a;
    public static volatile boolean aA;
    public static volatile boolean aB;
    public static volatile boolean aC;
    public static volatile Map<String, Integer> aD;
    public static volatile Map<String, Integer> aE;
    public static volatile long aF;
    public static volatile boolean aG;
    public static volatile String aH;
    public static volatile boolean aI;
    public static volatile boolean aJ;
    private static volatile boolean aK;
    public static volatile boolean aL;
    public static volatile String aM;
    public static volatile String aN;
    public static volatile boolean aO;
    private static volatile boolean aP;
    public static volatile boolean aQ;
    public static volatile String aR;
    public static volatile boolean aS;
    public static volatile boolean aT;
    public static volatile boolean aU;
    public static volatile boolean aV;
    public static volatile String aW;
    private static final AtomicBoolean aX;
    private static final AtomicBoolean aY;
    private static final AtomicBoolean aZ;
    public static volatile int aa;
    public static volatile int ab;
    public static volatile int ac;
    public static volatile boolean ad;
    public static volatile boolean ae;
    public static volatile String af;
    public static volatile String ag;
    public static volatile int ah;
    private static volatile Boolean ai;
    private static final Map<String, Long> aj;
    private static final Map<String, Long> ak;
    private static final Map<String, Long> al;
    private static volatile boolean am;
    private static volatile Boolean an;
    private static volatile boolean ao;
    private static volatile String ap;
    private static volatile long aq;
    private static volatile int ar;
    private static volatile Boolean as;
    private static volatile Boolean at;
    private static volatile Boolean au;
    private static volatile double av;
    public static volatile boolean aw;
    public static volatile boolean ax;
    public static volatile int ay;
    public static volatile boolean az;
    public static volatile int b;
    public static volatile boolean bA;
    private static volatile Boolean bB;
    private static volatile Boolean bC;
    public static volatile boolean bD;
    public static volatile boolean bE;
    public static volatile boolean bF;
    public static volatile int bG;
    public static volatile int bH;
    public static volatile int bI;
    public static volatile boolean ba;
    public static volatile int bb;
    public static volatile int bc;
    public static volatile boolean bd;
    public static volatile Boolean be;
    public static volatile boolean bf;
    public static volatile boolean bg;
    public static volatile boolean bh;
    public static volatile int bi;
    public static volatile String bj;
    public static volatile boolean bk;
    public static volatile String bl;
    public static volatile boolean bm;
    public static volatile boolean bn;
    public static volatile boolean bo;
    public static volatile boolean bp;
    public static volatile boolean bq;
    public static volatile boolean br;
    public static volatile boolean bs;
    public static volatile int bt;
    public static volatile String bu;
    public static volatile boolean bv;
    private static volatile Boolean bw;
    public static volatile boolean bx;
    private static volatile Boolean by;
    private static volatile Boolean bz;
    public static volatile boolean c;
    public static volatile boolean d;
    public static volatile boolean e;
    public static volatile boolean f;
    public static volatile boolean g;
    public static volatile boolean h;
    public static volatile String i;
    public static volatile boolean j;
    public static File k;
    public static volatile int l;
    public static volatile int m;
    public static final AtomicBoolean mEnableLowDeviceSwitchUd;
    public static final AtomicBoolean mRtcAbrDynamicEnable;
    public static final AtomicBoolean mRtcAdaptionAutoSwitch;
    public static final AtomicReference<String> mRtcAdaptionParamJson;
    public static final AtomicReference<String> mRtcLiveParam;
    public static final AtomicReference<String> mRtcSwitchParamJson;
    public static final AtomicInteger mSyncThreshold;
    public static final AtomicBoolean mUseRtcAbr;
    public static final AtomicInteger mUseRtcAbrId;
    public static volatile boolean n;
    public static volatile int o;
    public static volatile int p;
    public static volatile double q;
    public static volatile boolean r;
    public static volatile boolean s;
    public static volatile int t;
    public static volatile String u;
    public static volatile boolean v;
    public static volatile boolean w;
    public static volatile boolean x;
    public static volatile int y;
    public static volatile float z;

    public static /* synthetic */ Map G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bcc6bb03", new Object[0]) : al;
    }

    public static /* synthetic */ Map H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8a711cc4", new Object[0]) : aj;
    }

    public static /* synthetic */ Map I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("581b7e85", new Object[0]) : ak;
    }

    public static /* synthetic */ AtomicBoolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c838149c", new Object[0]) : aZ;
    }

    public static /* synthetic */ int a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i2)})).intValue();
        }
        H = i2;
        return i2;
    }

    public static /* synthetic */ AtomicBoolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("170e69f9", new Object[0]) : aX;
    }

    static {
        kge.a(-278276263);
        b = -1;
        c = true;
        d = true;
        e = true;
        f = true;
        E = false;
        F = false;
        g = true;
        h = false;
        i = "null";
        j = false;
        k = null;
        l = 0;
        m = 0;
        n = false;
        o = 0;
        p = 0;
        G = null;
        H = -100;
        I = -1;
        J = null;
        K = null;
        ai = false;
        aj = new ConcurrentHashMap();
        ak = new ConcurrentHashMap();
        al = new ConcurrentHashMap();
        am = false;
        af = "null";
        ag = "null";
        an = false;
        ao = false;
        ap = "";
        aq = 0L;
        ar = 30;
        as = false;
        at = true;
        au = false;
        av = 0.5d;
        aP = false;
        aG = true;
        L = true;
        M = -1;
        bw = false;
        aJ = false;
        aR = "[\"LiveRoom\",\"liveRoom\"]";
        aM = "*";
        aN = "";
        aO = false;
        aS = false;
        by = false;
        aw = false;
        ax = false;
        ay = 20;
        bb = 300;
        bc = 20;
        ah = 0;
        N = new JSONArray();
        O = -1;
        q = 23000.0d;
        r = false;
        s = false;
        W = true;
        aF = 0L;
        V = null;
        t = 256000;
        u = "[\"guangguang_pick\",\"ggpick_preload\"]";
        v = true;
        w = true;
        x = false;
        aK = false;
        y = 125;
        aL = true;
        z = 1.0f;
        A = 0.5f;
        B = 2.0f;
        C = 0.0f;
        Y = 1.0f;
        X = true;
        D = true;
        Z = true;
        aH = "[-10608,-5,-110]";
        aX = new AtomicBoolean(true);
        mRtcLiveParam = new AtomicReference<>("");
        aY = new AtomicBoolean(true);
        mSyncThreshold = new AtomicInteger(50);
        bz = true;
        aW = "";
        aZ = new AtomicBoolean(true);
        mUseRtcAbr = new AtomicBoolean(true);
        mRtcAbrDynamicEnable = new AtomicBoolean(false);
        mRtcAdaptionAutoSwitch = new AtomicBoolean(true);
        mEnableLowDeviceSwitchUd = new AtomicBoolean(true);
        mUseRtcAbrId = new AtomicInteger(0);
        mRtcAdaptionParamJson = new AtomicReference<>("");
        mRtcSwitchParamJson = new AtomicReference<>("");
        bB = true;
        be = false;
        bC = true;
        bf = false;
        bg = false;
        bh = false;
        bi = 0;
        bn = false;
        bo = false;
        bq = false;
        br = false;
        bs = true;
        bt = 180000;
        bu = "{\"ud\":{\"max_rtt\":\"40\",\"max_v_loss_rate\":\"0.2\",\"max_stall_time_msps\":\"50\",\"network_type_black_list\":[\"2G\",\"3G\",\"4G\",\"*\"]},\"hd\":{}}";
        aa = 0;
        ae = true;
        aA = false;
        aB = false;
        aC = true;
        aD = new HashMap();
        aE = new HashMap();
        aT = false;
        aU = false;
        az = true;
        bd = true;
        bA = false;
        aQ = false;
        aV = false;
        ba = false;
        bE = false;
        bp = false;
        bv = false;
        aI = false;
        bx = false;
        bD = false;
        bF = true;
        bG = 3000;
        bH = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        bI = 500;
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else if (f32496a != null) {
        } else {
            synchronized (oyu.class) {
                if (f32496a != null) {
                    return;
                }
                f32496a = application;
                MediaSystemUtils.sApplication = application;
            }
        }
    }

    public static synchronized void w() {
        synchronized (oyu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a2717e", new Object[0]);
            } else {
                aa++;
            }
        }
    }

    public static synchronized void x() {
        synchronized (oyu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b088ff", new Object[0]);
            } else {
                aa--;
            }
        }
    }

    public static synchronized int y() {
        synchronized (oyu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6bea073", new Object[0])).intValue();
            }
            return aa;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c.a().a("isInBackground", true);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (G == null && context != null) {
            if (context != null && "com.taobao.avsdk.test".equals(context.getPackageName())) {
                G = true;
            } else {
                G = false;
            }
        }
        return G.booleanValue();
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (!E && context != null) {
            E = true;
            if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion > 196608) {
                F = true;
            }
        }
        return F;
    }

    public static boolean b() {
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!g) {
            return false;
        }
        boolean b2 = b.b(Build.MODEL, OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEGRADE_RENDER_EGL_MODEL_LIST, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264));
        return b2 ? !b2 : !b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_EGL_ENABLE_CHECK_DEVICE_LEVEL, "false")) || (c2 = c()) == 0 || c2 == 1;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        if (H >= 0 && H <= 2) {
            return H;
        }
        try {
            H = akt.a();
        } catch (Throwable unused) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get deviceLevel error=" + H);
            H = -100;
        }
        return H;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_RTC_VVC, "true"));
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SMOOTH_TELE_STATE, "true"));
    }

    public static boolean a(String str) {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1618942553:
                if (str.equals("vodSelect")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1553113728:
                if (str.equals(MediaConstant.ABTEST_TAG_BUFFERED_SIZE)) {
                    c2 = 3;
                    break;
                }
                break;
            case -1401878318:
                if (str.equals("surfaceview")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1394702396:
                if (str.equals("lowPerformance")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1869215378:
                if (str.equals(MediaConstant.ABTEST_BLUECONNECT_COMOPONENT_DEBUG)) {
                    c2 = 4;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            booleanValue = ai.booleanValue();
        } else if (c2 == 1) {
            booleanValue = an.booleanValue();
        } else if (c2 == 2) {
            booleanValue = as.booleanValue();
        } else if (c2 == 3) {
            booleanValue = aK;
        } else if (c2 != 4) {
            return false;
        } else {
            booleanValue = aP;
        }
        if (!booleanValue) {
            e(str);
        }
        return true;
    }

    private static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1618942553:
                if (str.equals("vodSelect")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1553113728:
                if (str.equals(MediaConstant.ABTEST_TAG_BUFFERED_SIZE)) {
                    c2 = 3;
                    break;
                }
                break;
            case -1401878318:
                if (str.equals("surfaceview")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1394702396:
                if (str.equals("lowPerformance")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1869215378:
                if (str.equals(MediaConstant.ABTEST_BLUECONNECT_COMOPONENT_DEBUG)) {
                    c2 = 4;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            VariationSet activate = UTABTest.activate(str + "_component", str + "_module");
            if (activate != null && activate.size() > 0) {
                Variation variation = activate.getVariation("enable");
                if (variation != null) {
                    am = variation.getValueAsBoolean(false);
                }
                aj.put(str, Long.valueOf(activate.getExperimentId()));
                ak.put(str, Long.valueOf(activate.getExperimentBucketId()));
                al.put(str, Long.valueOf(activate.getExperimentReleaseId()));
                Variation variation2 = activate.getVariation("whiteListFor1080p");
                if (variation2 != null) {
                    af = variation2.getValueAsString(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                }
                Variation variation3 = activate.getVariation("cpuWhiteList");
                if (variation3 != null) {
                    ag = variation3.getValueAsString("");
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner lowPerformance_component lowPerformance_module init success.");
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner lowPerformance_component lowPerformance_module init failed.");
            }
            ai = true;
        } else if (c2 == 1) {
            VariationSet activate2 = UTABTest.activate(str + "_component", str + "_module");
            if (activate2 != null && activate2.size() > 0) {
                Variation variation4 = activate2.getVariation("enable");
                if (variation4 != null) {
                    ao = variation4.getValueAsBoolean(false);
                }
                Variation variation5 = activate2.getVariation("subBusinessTypeList");
                if (variation5 != null) {
                    ap = variation5.getValueAsString("");
                }
                Variation variation6 = activate2.getVariation("sdkVersion");
                if (variation6 != null) {
                    ar = variation6.getValueAsInt(30);
                }
                aj.put(str, Long.valueOf(activate2.getExperimentId()));
                ak.put(str, Long.valueOf(activate2.getExperimentBucketId()));
                al.put(str, Long.valueOf(activate2.getExperimentReleaseId()));
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner surfaceview_component surfaceview_module init success.");
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner surfaceview_component surfaceview_module init failed.");
            }
            an = true;
        } else if (c2 == 2) {
            VariationSet activate3 = UTABTest.activate(str + "_component", str + "_module");
            if (activate3 != null && activate3.size() > 0) {
                Variation variation7 = activate3.getVariation("enableCacheFirst");
                if (variation7 != null) {
                    at = Boolean.valueOf(variation7.getValueAsBoolean(true));
                }
                Variation variation8 = activate3.getVariation("enableQualityFirst");
                if (variation8 != null) {
                    au = Boolean.valueOf(variation8.getValueAsBoolean(false));
                }
                Variation variation9 = activate3.getVariation("beta");
                if (variation9 != null) {
                    av = variation9.getValueAsDouble(0.5d);
                }
                Variation variation10 = activate3.getVariation("minTotalSize");
                if (variation10 != null) {
                    q = variation10.getValueAsDouble(23000.0d);
                }
                Variation variation11 = activate3.getVariation("enableRobustNetSpeed");
                if (variation11 != null) {
                    r = variation11.getValueAsBoolean(false);
                }
                Variation variation12 = activate3.getVariation("enableUseRecDataTime");
                if (variation12 != null) {
                    s = variation12.getValueAsBoolean(false);
                }
                Variation variation13 = activate3.getVariation("useCacheIfExisted");
                if (variation13 != null) {
                    W = variation13.getValueAsBoolean(true);
                }
                Variation variation14 = activate3.getVariation("minLengthForUseCache");
                if (variation14 != null) {
                    aF = variation14.getValueAsLong(0L);
                }
                aj.put(str, Long.valueOf(activate3.getExperimentId()));
                ak.put(str, Long.valueOf(activate3.getExperimentBucketId()));
                al.put(str, Long.valueOf(activate3.getExperimentReleaseId()));
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner vodSelect_component vodSelect_module init success.");
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner vodSelect_component vodSelect_module init failed.");
            }
            as = true;
        } else if (c2 != 3) {
            if (c2 != 4) {
                return;
            }
            VariationSet activate4 = UTABTest.activate(MediaConstant.ABTEST_BLUECONNECT_COMOPONENT_DEBUG, MediaConstant.ABTEST_BLUECONNECT_MODULE_DEBUG);
            if (activate4 != null && activate4.size() > 0) {
                Variation variation15 = activate4.getVariation("enable");
                if (variation15 != null) {
                    aG = variation15.getValueAsBoolean(false);
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner blueconnect_debug_ab_componet2 init success.");
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initABTestParamInner blueconnect_debug_ab_componet2 init success.");
            }
            aP = true;
        } else {
            try {
                w = b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SMALL_NETCUT_SIZE_AT_TAB2_PRELOAD, "true"));
                VariationSet activate5 = UTABTest.activate("preloadNetSize_component", "preloadNetSize_module");
                if (activate5 == null || activate5.size() <= 0) {
                    return;
                }
                Variation variation16 = activate5.getVariation("netCutSize");
                if (variation16 != null) {
                    t = variation16.getValueAsInt(256000);
                }
                Variation variation17 = activate5.getVariation("enableSBT");
                if (variation17 != null) {
                    u = variation17.getValueAsString("[\"guangguang_pick\",\"ggpick_preload\"]");
                }
                Variation variation18 = activate5.getVariation("onlyAtPreload");
                if (variation18 != null) {
                    v = variation18.getValueAsBoolean(true);
                }
                Variation variation19 = activate5.getVariation("enPredownload");
                if (variation19 != null) {
                    v = variation19.getValueAsBoolean(false);
                }
                Variation variation20 = activate5.getVariation("maxBufferedSize");
                if (variation20 != null) {
                    y = variation20.getValueAsInt(125);
                }
                Variation variation21 = activate5.getVariation("enUpdateAtRealPlay");
                if (variation21 != null) {
                    aL = variation21.getValueAsBoolean(true);
                }
                aj.put(str, Long.valueOf(activate5.getExperimentId()));
                ak.put(str, Long.valueOf(activate5.getExperimentBucketId()));
                al.put(str, Long.valueOf(activate5.getExperimentReleaseId()));
                aK = true;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get preloadNetSize_component info failed: " + th.toString());
            }
        }
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue();
        }
        if (!aj.containsKey(str)) {
            return 0L;
        }
        return aj.get(str).longValue();
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        if (!ak.containsKey(str)) {
            return 0L;
        }
        return ak.get(str).longValue();
    }

    public static long d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e9", new Object[]{str})).longValue();
        }
        if (!al.containsKey(str)) {
            return 0L;
        }
        return al.get(str).longValue();
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : am;
    }

    public static String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[0]) : af;
    }

    public static String C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec4b0696", new Object[0]) : ag;
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : at.booleanValue();
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : au.booleanValue();
    }

    public static double F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1bb", new Object[0])).doubleValue() : av;
    }

    public static String d() {
        if (Build.VERSION.SDK_INT < 19) {
            return i;
        }
        if (h) {
            return i;
        }
        h = true;
        try {
            if (Class.forName("ohos.utils.system.SystemCapability") != null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                i = (String) cls.getMethod("get", String.class).invoke(cls, "ro.huawei.build.display.id");
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            e.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e = e4;
            e.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        return i;
    }

    public static File e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b2a84a21", new Object[0]);
        }
        if (!j) {
            k = Environment.getExternalStorageDirectory();
            j = true;
        }
        return k;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableHandleSurfaceDestroy1", "false"));
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else if (H >= 0) {
        } else {
            try {
                new aku().a(application).a(new Handler()).a(new aku.a() { // from class: tb.oyu.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.aku.a
                    public void a(int i2, float f2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c114785", new Object[]{this, new Integer(i2), new Float(f2)});
                        } else {
                            oyu.a(akt.a());
                        }
                    }
                }).a();
            } catch (Exception unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "start AliHardwareInitializer failed.");
            }
        }
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (I != -1) {
            return I;
        }
        if (context != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                I = (int) ((memoryInfo.totalMem / 1024) / 1024);
            } catch (Exception unused) {
                I = -1;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getRunMemory failed.");
            }
        }
        return I;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : I;
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        if (!L.booleanValue()) {
            return -1;
        }
        L = Boolean.valueOf(b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_DYNAMIC_DEBUG_LEVEL, "false")));
        int b2 = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEBUG_LEVEL, "-1"));
        M = b2;
        return b2;
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        try {
            if (N == null) {
                N = new JSONArray();
            }
            if (O == -1) {
                O = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_MAX_NET_CUT_INFO_SIZE, "10"));
            }
            synchronized (oyu.class) {
                if (N.size() >= O) {
                    N.mo1572remove(0);
                }
                N.add(jSONObject);
                b(jSONObject);
            }
        } catch (Exception e2) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setNetCutList failed!" + e2.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        if (P == null) {
            P = new ArrayList<>();
        }
        if (Q == null) {
            Q = new ArrayList<>();
        }
        if (R == null) {
            R = new ArrayList<>();
        }
        if (S == null) {
            S = new ArrayList<>();
        }
        if (O == -1) {
            O = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_MAX_NET_CUT_INFO_SIZE, "10"));
        }
        if (jSONObject == null) {
            return;
        }
        Double d2 = jSONObject.getDouble("totalSize");
        if (d2 != null) {
            a(P, d2, O);
        }
        Double d3 = jSONObject.getDouble("duration");
        if (d3 != null) {
            a(Q, d3, O);
        }
        Double d4 = jSONObject.getDouble("firstDataTime");
        if (d4 != null) {
            a(R, d4, O);
        }
        Double d5 = jSONObject.getDouble("recDataTime");
        if (d5 == null) {
            return;
        }
        a(S, d5, O);
    }

    public static void a(double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0efa28", new Object[]{new Double(d2), new Double(d3)});
            return;
        }
        if (U == null) {
            U = new CopyOnWriteArrayList<>();
        }
        if (T == null) {
            T = new CopyOnWriteArrayList<>();
        }
        if (O == -1) {
            O = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_MAX_NET_CUT_INFO_SIZE, "10"));
        }
        if (d2 >= mto.a.GEO_NOT_SUPPORT && d2 <= 100000.0d) {
            a(U, Double.valueOf(d2), O);
        }
        a(T, Double.valueOf(d3), O);
    }

    public static ArrayList<Double> l() {
        ArrayList<Double> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("59205b4d", new Object[0]);
        }
        synchronized (oyu.class) {
            a2 = a(P);
        }
        return a2;
    }

    public static ArrayList<Double> m() {
        ArrayList<Double> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("dd50a84e", new Object[0]);
        }
        synchronized (oyu.class) {
            a2 = a(Q);
        }
        return a2;
    }

    public static ArrayList<Double> n() {
        ArrayList<Double> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6180f54f", new Object[0]);
        }
        synchronized (oyu.class) {
            a2 = a(R);
        }
        return a2;
    }

    public static ArrayList<Double> o() {
        ArrayList<Double> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e5b14250", new Object[0]);
        }
        synchronized (oyu.class) {
            a2 = a(S);
        }
        return a2;
    }

    public static ArrayList<Double> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("69e18f51", new Object[0]);
        }
        if (U != null) {
            return new ArrayList<>(U);
        }
        return new ArrayList<>();
    }

    public static ArrayList<Double> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ee11dc52", new Object[0]);
        }
        if (T != null) {
            return new ArrayList<>(T);
        }
        return new ArrayList<>();
    }

    private static void a(ArrayList<Double> arrayList, Double d2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3bc4b7", new Object[]{arrayList, d2, new Integer(i2)});
            return;
        }
        while (arrayList.size() > i2) {
            arrayList.remove(0);
        }
        arrayList.add(d2);
    }

    private static void a(CopyOnWriteArrayList<Double> copyOnWriteArrayList, Double d2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e308584", new Object[]{copyOnWriteArrayList, d2, new Integer(i2)});
            return;
        }
        while (copyOnWriteArrayList.size() > i2) {
            copyOnWriteArrayList.remove(0);
        }
        copyOnWriteArrayList.add(d2);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", "forceUseSoftwareDecodeModeList", "[\"2311DRK48C\",\"23078RKD5C\",\"2407FRK8EC\",\"23090RA98C\"]");
        boolean b2 = b.b(Build.MODEL, config);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mForceUseSoftwareDecodeModeList: " + config + ", model: " + Build.MODEL + ", useSoftwareDecide:" + b2);
        return b2;
    }

    public static boolean s() {
        MediaCodecInfo[] codecInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        if (V != null) {
            return V.booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                V = true;
                return true;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (!mediaCodecInfo.isEncoder()) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            if (str.equalsIgnoreCase("video/hevc")) {
                                String name = mediaCodecInfo.getName();
                                V = Boolean.valueOf(!b.g(name, "OMX.google.") && !b.g(name, "c2.android.") && (b.g(name, "OMX.") || b.g(name, "c2.")));
                            }
                            if (V.booleanValue()) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "isMediaCodecListContainH265HardWare error:" + e2.toString());
            V = true;
            return true;
        }
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        return b.b(Build.MODEL, OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_H265_HW_BLACK_LIST_FOR_DEGRADE_H264, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264));
    }

    public static ArrayList<Double> a(ArrayList<Double> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a85ead1c", new Object[]{arrayList});
        }
        ArrayList<Double> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            Iterator<Double> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
        }
        return arrayList2;
    }

    public static void v() {
        Variation variation;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[0]);
        } else if (!X) {
        } else {
            try {
                D = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_DETECT_TID_AND_ACTIVE_DROP_FRAME, "true"));
                Z = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_CHECK_AVG_FPS_AT_60FPS_DROP, "true"));
                String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_HIGH_DEVICE_DISABLE_DROP_FRAME_AT_60_FPS_LIVE, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                d dVar = new d();
                dVar.a("model", "" + Build.MODEL);
                dVar.a(config);
                if (dVar.b()) {
                    D = false;
                }
                if (!D) {
                    return;
                }
                VariationSet activate = UTABTest.activate("activeDropFrame_component", "activeDropFrame_module");
                if (activate != null && activate.size() > 0 && (variation = activate.getVariation("dynamic_drop_pkt_params")) != null) {
                    String valueAsString = variation.getValueAsString("");
                    if (!StringUtils.isEmpty(valueAsString) && (parseObject = JSON.parseObject(valueAsString)) != null) {
                        Float f2 = parseObject.getFloat("drop_pkt_count_resume_step");
                        if (f2 != null) {
                            z = f2.floatValue();
                        }
                        if (parseObject.getFloat("drop_pkt_count_base_threshold") != null) {
                            A = f2.floatValue();
                        }
                        if (parseObject.getFloat("drop_pkt_count_advanced_threshold") != null) {
                            B = f2.floatValue();
                        }
                        if (parseObject.getFloat("resume_pkt_count_base_threshold") != null) {
                            C = f2.floatValue();
                        }
                        Float f3 = parseObject.getFloat("avg_fps_diff_threshold");
                        if (f3 != null) {
                            Y = f3.floatValue();
                        }
                    }
                }
                X = false;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "60fpssupport:get activeDropFrame_component info failed: " + th.toString());
            }
        }
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue();
        }
        if (!aB) {
            return aA;
        }
        try {
            VariationSet activate = UTABTest.activate("bt709FullRangeSupport_component", "bt709FullRangeSupport_module");
            if (activate != null && activate.size() > 0) {
                Variation variation = activate.getVariation("enable");
                boolean valueAsBoolean = variation != null ? variation.getValueAsBoolean(false) : false;
                Variation variation2 = activate.getVariation("deviceWhiteList");
                boolean b2 = variation2 != null ? b.b(Build.MODEL, variation2.getValueAsString(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) : false;
                Variation variation3 = activate.getVariation("CPUWhiteList");
                boolean b3 = variation3 != null ? b.b(Build.MODEL, variation3.getValueAsString(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) : false;
                if (valueAsBoolean && (b2 || b3)) {
                    aA = true;
                }
            }
            aB = false;
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get enableBt709FullRangeSupport info failed: " + th.toString());
        }
        return aA;
    }

    public static boolean L() {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        if (!aT) {
            return aU;
        }
        try {
            VariationSet activate = UTABTest.activate("pauseRTCEarly_component", "pauseRTCEarly_module");
            if (activate != null && activate.size() > 0 && (variation = activate.getVariation("enable")) != null) {
                aU = variation.getValueAsBoolean(false);
            }
            aT = false;
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get enableBt709FullRangeSupport info failed: " + th.toString());
        }
        return aU;
    }

    public static void e(Context context) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else if (!bd || context == null) {
        } else {
            if (MediaSystemUtils.isApkDebuggable()) {
                if (StringUtils.isEmpty(a(context, "AudioGain_component", "enableAudioGain_module", "enableAudioGain", ""))) {
                    return;
                }
                bx = Boolean.parseBoolean(a(context, "AudioGain_component", "enableAudioGain_module", "enableAudioGain", ""));
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mEnableAudioGainABtest is " + bx);
                return;
            }
            try {
                VariationSet activate = UTABTest.activate("AudioGain_component", "enableAudioGain_module");
                if (activate != null && activate.size() > 0 && (variation = activate.getVariation("enableAudioGain")) != null) {
                    bx = variation.getValueAsBoolean(false);
                }
                bd = false;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get AudioGainParamFromAB info failed: " + th.toString());
            }
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{context});
        } else if (bA || context == null) {
        } else {
            if (MediaSystemUtils.isApkDebuggable()) {
                if (StringUtils.isEmpty(a(context, "PauseFrame_component", "PauseFrame_module", "enablePauseFrame", ""))) {
                    return;
                }
                bD = Boolean.parseBoolean(a(context, "PauseFrame_component", "PauseFrame_module", "enablePauseFrame", ""));
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mEnablePauseFrameABtest is " + bD);
                return;
            }
            try {
                VariationSet activate = UTABTest.activate("PauseFrame_component", "PauseFrame_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enablePauseFrame");
                    if (variation != null) {
                        bD = variation.getValueAsBoolean(false);
                    }
                    aj.put("pauseFrameLock", Long.valueOf(activate.getExperimentId()));
                    ak.put("pauseFrameLock", Long.valueOf(activate.getExperimentBucketId()));
                    al.put("pauseFrameLock", Long.valueOf(activate.getExperimentReleaseId()));
                }
                bA = true;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get setPauseFrameLockFromAB info failed: " + th.toString());
            }
        }
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f6cf7", new Object[]{context});
        } else if (!az) {
        } else {
            try {
                if (MediaSystemUtils.isApkDebuggable()) {
                    if (!StringUtils.isEmpty(a(context, "initDecoderEarly_component", "initDecoderEarly_module", "initDecoderEarly", ""))) {
                        aQ = Boolean.parseBoolean(a(context, "initDecoderEarly_component", "initDecoderEarly_module", "initDecoderEarly", ""));
                    }
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initDecoderEarly is " + aQ);
                    return;
                }
                VariationSet activate = UTABTest.activate("initDecoderEarly_component", "initDecoderEarly_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("initDecoderEarly");
                    if (variation != null) {
                        aQ = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("openDeviceEarly");
                    if (variation2 != null) {
                        aV = variation2.getValueAsBoolean(false);
                    }
                    aj.put("INIT_DECODER_EARLY", Long.valueOf(activate.getExperimentId()));
                    ak.put("INIT_DECODER_EARLY", Long.valueOf(activate.getExperimentBucketId()));
                    al.put("INIT_DECODER_EARLY", Long.valueOf(activate.getExperimentReleaseId()));
                    Variation variation3 = activate.getVariation("qtiChipFastOutput");
                    if (variation3 != null) {
                        aI = variation3.getValueAsBoolean(false);
                    }
                }
                az = false;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get initDecoderAndEGLInitEarlyParamFromAB info failed: " + th.toString());
            }
        }
    }

    public static void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a382c158", new Object[]{context});
        } else if (ba) {
        } else {
            try {
                if (MediaSystemUtils.isApkDebuggable()) {
                    if (StringUtils.isEmpty(a(context, "RtcConnectOnlyAtWarmup_component", "RtcConnectOnlyAtWarmup_module", "enableRtcConnectOnlyAtWarmup", ""))) {
                        return;
                    }
                    bE = Boolean.parseBoolean(a(context, "RtcConnectOnlyAtWarmup_component", "RtcConnectOnlyAtWarmup_module", "enableRtcConnectOnlyAtWarmup", ""));
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mEnableRtcConnectOnlyAtWarmup is " + bE);
                    return;
                }
                VariationSet activate = UTABTest.activate("RtcConnectOnlyAtWarmup_component", "RtcConnectOnlyAtWarmup_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enableRtcConnectOnlyAtWarmup");
                    if (variation != null) {
                        bE = variation.getValueAsBoolean(false);
                    }
                    aj.put("RtcConnectOnlyAtWarmup", Long.valueOf(activate.getExperimentId()));
                    ak.put("RtcConnectOnlyAtWarmup", Long.valueOf(activate.getExperimentBucketId()));
                    al.put("RtcConnectOnlyAtWarmup", Long.valueOf(activate.getExperimentReleaseId()));
                }
                ba = true;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get mHasGetRtcConnectOnlyConfig info succeed, mEnableRtcConnectOnlyAtWarmup is " + bE);
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get mHasGetRtcConnectOnlyConfig info failed: " + th.toString());
            }
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
        } else if (bp) {
        } else {
            try {
                if (MediaSystemUtils.isApkDebuggable()) {
                    if (StringUtils.isEmpty(a(context, "WarmupManagerOpt_component", "WarmupManagerOpt_module", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, ""))) {
                        return;
                    }
                    bv = Boolean.parseBoolean(a(context, "WarmupManagerOpt_component", "WarmupManagerOpt_module", MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT, ""));
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mEnableWarmupManagerOpt is " + bv);
                    return;
                }
                VariationSet activate = UTABTest.activate("WarmupManagerOpt_component", "WarmupManagerOpt_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation(MediaConstant.ORANGE_ENABLE_WARMUP_MANAGER_OPT);
                    if (variation != null) {
                        bv = variation.getValueAsBoolean(false);
                    }
                    aj.put("WarmupManagerOpt", Long.valueOf(activate.getExperimentId()));
                    ak.put("WarmupManagerOpt", Long.valueOf(activate.getExperimentBucketId()));
                    al.put("WarmupManagerOpt", Long.valueOf(activate.getExperimentReleaseId()));
                }
                bp = true;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get mHasGetWarmupManagerConfig info succeed, mEnableWarmupManagerOpt is " + bv);
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get mHasGetWarmupManagerConfig info failed: " + th.toString());
            }
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else if (bw.booleanValue()) {
        } else {
            try {
                if (MediaSystemUtils.isApkDebuggable()) {
                    if (!StringUtils.isEmpty(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "enableRtcAutoDegrade", ""))) {
                        aJ = Boolean.parseBoolean(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "enableRtcAutoDegrade", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mEnableRtcAutoDegrade is " + aJ);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "forceDegradeRtc", ""))) {
                        aO = Boolean.parseBoolean(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "forceDegradeRtc", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "FORCE_DEGRADE_RTC is " + aO);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "enableRtcAutoDegradeWhiteList", ""))) {
                        aM = a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "enableRtcAutoDegradeWhiteList", "");
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ENABLE_RTC_DEGRADE_CODE_WHITE_LIST is " + aM);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "disableRtcAutoDegradeBlackList", ""))) {
                        aN = a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "disableRtcAutoDegradeBlackList", "");
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DISABLE_RTC_DEGRADE_CODE_BLACK_LIST is " + aN);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "forceDegradeFlv", ""))) {
                        aS = Boolean.parseBoolean(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "forceDegradeFlv", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "FORCE_DEGRADE_FLV is " + aS);
                    }
                    if (StringUtils.isEmpty(a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "enableRtcDegradeFrom", ""))) {
                        return;
                    }
                    aR = a(context, "RtcAutoDegrade_component", "RtcAutoDegrade_module", "enableRtcDegradeFrom", "");
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ENABLE_RTC_DEGRADE_FROM is " + aR);
                    return;
                }
                VariationSet activate = UTABTest.activate("RtcAutoDegrade_component", "RtcAutoDegrade_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enableRtcAutoDegrade");
                    if (variation != null) {
                        aJ = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("enableRtcAutoDegradeWhiteList");
                    if (variation2 != null) {
                        aM = variation2.getValueAsString("*");
                    }
                    Variation variation3 = activate.getVariation("disableRtcAutoDegradeBlackList");
                    if (variation3 != null) {
                        aN = variation3.getValueAsString("");
                    }
                    Variation variation4 = activate.getVariation("forceDegradeRtc");
                    if (variation4 != null) {
                        aO = variation4.getValueAsBoolean(false);
                    }
                    Variation variation5 = activate.getVariation("forceDegradeFlv");
                    if (variation5 != null) {
                        aS = variation5.getValueAsBoolean(false);
                    }
                    Variation variation6 = activate.getVariation("enableRtcDegradeFrom");
                    if (variation6 != null) {
                        aR = variation6.getValueAsString("[\"LiveRoom\",\"liveRoom\"]");
                    }
                    aj.put(MediaConstant.ABTEST_TAG_RTC_DEGRADE, Long.valueOf(activate.getExperimentId()));
                    ak.put(MediaConstant.ABTEST_TAG_RTC_DEGRADE, Long.valueOf(activate.getExperimentBucketId()));
                    al.put(MediaConstant.ABTEST_TAG_RTC_DEGRADE, Long.valueOf(activate.getExperimentReleaseId()));
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "RtcAutoDegrade_component RtcAutoDegrade_module init success.");
                } else {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "RtcAutoDegrade_component RtcAutoDegrade_module init failed.");
                }
                bw = true;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get RtcAudioDegrade_component info failed: " + th.toString());
            }
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
        } else if (by.booleanValue()) {
        } else {
            try {
                if (MediaSystemUtils.isApkDebuggable()) {
                    if (!StringUtils.isEmpty(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "enableRtcNewBufferStrategy", ""))) {
                        aw = Boolean.parseBoolean(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "enableRtcNewBufferStrategy", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mEnableRtcNewBufferStrategy is " + aw);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "disableAudioSlowPlay", ""))) {
                        ax = Boolean.parseBoolean(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "disableAudioSlowPlay", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mDisableAudioSlowPlay is " + ax);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerVideoPipeStartCount", ""))) {
                        ay = Integer.parseInt(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerVideoPipeStartCount", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mSourcerVideoPipeStartCount is " + ay);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerVideoPipeMaxCount", ""))) {
                        bb = Integer.parseInt(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerVideoPipeMaxCount", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mSourcerVideoPipeMaxCount is " + bb);
                    }
                    if (!StringUtils.isEmpty(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeMaxBufferRatio", ""))) {
                        bc = Integer.parseInt(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "sourcerPipeMaxBufferRatio", ""));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mSourcerPipeMaxBufferRatio is " + bc);
                    }
                    if (StringUtils.isEmpty(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "fastFrameTime", ""))) {
                        return;
                    }
                    ah = Integer.parseInt(a(context, "RtcNewBuffer_component", "RtcNewBuffer_module", "fastFrameTime", ""));
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mFastFrameTime is " + ah);
                    return;
                }
                VariationSet activate = UTABTest.activate("RtcNewBuffer_component", "RtcNewBuffer_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enableRtcNewBufferStrategy");
                    if (variation != null) {
                        aw = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("disableAudioSlowPlay");
                    if (variation2 != null) {
                        ax = variation2.getValueAsBoolean(false);
                    }
                    Variation variation3 = activate.getVariation("sourcerVideoPipeStartCount");
                    if (variation3 != null) {
                        ay = variation3.getValueAsInt(20);
                    }
                    Variation variation4 = activate.getVariation("sourcerVideoPipeMaxCount");
                    if (variation4 != null) {
                        bb = variation4.getValueAsInt(300);
                    }
                    Variation variation5 = activate.getVariation("sourcerPipeMaxBufferRatio");
                    if (variation5 != null) {
                        bc = variation5.getValueAsInt(20);
                    }
                    Variation variation6 = activate.getVariation("fastFrameTime");
                    if (variation6 != null) {
                        ah = variation6.getValueAsInt(0);
                    }
                    aj.put(MediaConstant.ABTEST_TAG_RTC_NEW_BUFFER, Long.valueOf(activate.getExperimentId()));
                    ak.put(MediaConstant.ABTEST_TAG_RTC_NEW_BUFFER, Long.valueOf(activate.getExperimentBucketId()));
                    al.put(MediaConstant.ABTEST_TAG_RTC_NEW_BUFFER, Long.valueOf(activate.getExperimentReleaseId()));
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "RtcNewBuffer_component RtcNewBuffer_module init success.");
                } else {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "RtcNewBuffer_component RtcNewBuffer_module init failed.");
                }
                by = true;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get RtcNewBuffer_component info failed: " + th.toString());
            }
        }
    }

    public static void K() {
        Variation variation;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[0]);
        } else if (aC) {
            try {
                VariationSet activate = UTABTest.activate("rtcDelayAndRetain_component", "rtcDelayAndRetain_module");
                if (activate != null && activate.size() > 0 && (variation = activate.getVariation("rtcDelayParams")) != null) {
                    String valueAsString = variation.getValueAsString("");
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get artp_master_rtc_delay and paramsJsonStr = " + valueAsString);
                    if (!StringUtils.isEmpty(valueAsString) && (parseObject = JSON.parseObject(valueAsString)) != null) {
                        for (String str : parseObject.keySet()) {
                            JSONObject jSONObject = parseObject.getJSONObject(str);
                            if (jSONObject != null) {
                                Integer integer = jSONObject.getInteger("masterRtcDelay");
                                if (integer != null && aD != null) {
                                    aD.put(str, integer);
                                }
                                Integer integer2 = jSONObject.getInteger("rtcGopCacheRetainMs");
                                if (integer2 != null && aE != null) {
                                    aE.put(str, integer2);
                                }
                            }
                        }
                    }
                }
                aC = false;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get getRtcDelayAndRetainParamFromAB info failed: " + th.toString());
            }
        }
    }

    public static void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[0]);
        } else if (!aX.get()) {
        } else {
            a.a().execute(new Runnable() { // from class: tb.oyu.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        VariationSet activate = UTABTest.activate("taolive", MediaConstant.ABTEST_RTC_LIVE_PARAMS_MODULE_DEBUG);
                        if (activate == null || activate.size() <= 0) {
                            return;
                        }
                        Variation variation = activate.getVariation("params");
                        if (variation != null) {
                            oyu.mRtcLiveParam.set(variation.getValueAsString(""));
                        }
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get initRtcLiveParamFromAB success");
                        oyu.r().set(false);
                    } catch (Throwable th) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get initRtcLiveParamFromAB info failed: " + th.toString());
                    }
                }
            });
        }
    }

    public static void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[0]);
        } else if (!aY.get()) {
        } else {
            a.a().execute(new Runnable() { // from class: tb.oyu.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Variation variation;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        VariationSet activate = UTABTest.activate("syncOpt_component", "syncOpt_module");
                        if (activate == null || activate.size() <= 0 || (variation = activate.getVariation("syncThreshold")) == null) {
                            return;
                        }
                        oyu.mSyncThreshold.set(variation.getValueAsInt(50));
                    } catch (Throwable th) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get initSyncOptFromAB info failed: " + th.toString());
                    }
                }
            });
            aY.set(false);
        }
    }

    public static void Q() {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[0]);
        } else if (!bz.booleanValue()) {
        } else {
            try {
                VariationSet activate = UTABTest.activate("flvconfig_component", "flvconfig_module");
                if (activate != null && activate.size() > 0 && (variation = activate.getVariation("config")) != null) {
                    aW = variation.getValueAsString("");
                }
                bz = false;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get initFlvConfigFromAB info failed: " + th.toString());
            }
        }
    }

    public static void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[0]);
        } else if (!aZ.get()) {
        } else {
            a.a().execute(new Runnable() { // from class: tb.oyu.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        VariationSet activate = UTABTest.activate("AB_TBLIVE_RTC_ABR_COMPONENT", "AB_TBLIVE_RTC_ABR_MODULE_20230731");
                        if (activate == null || activate.size() <= 0) {
                            return;
                        }
                        Variation variation = activate.getVariation("useRtcAbr");
                        if (variation != null) {
                            oyu.mUseRtcAbr.set(variation.getValueAsBoolean(true));
                        }
                        Variation variation2 = activate.getVariation("rtcAbrId");
                        if (variation2 != null) {
                            oyu.mUseRtcAbrId.set(variation2.getValueAsInt(0));
                        }
                        Variation variation3 = activate.getVariation("rtcAdaptionParamJson");
                        if (variation3 != null) {
                            oyu.mRtcAdaptionParamJson.set(variation3.getValueAsString(""));
                        }
                        Variation variation4 = activate.getVariation("rtcSwitchParamJson");
                        if (variation4 != null) {
                            oyu.mRtcSwitchParamJson.set(variation4.getValueAsString(""));
                        }
                        Variation variation5 = activate.getVariation("rtcAbrDynamicEnable");
                        if (variation5 != null) {
                            oyu.mRtcAbrDynamicEnable.set(variation5.getValueAsBoolean(false));
                        }
                        Variation variation6 = activate.getVariation("rtcAdaptionAutoSwitch");
                        if (variation6 != null) {
                            oyu.mRtcAdaptionAutoSwitch.set(variation6.getValueAsBoolean(true));
                        }
                        Variation variation7 = activate.getVariation("enableLowDeviceSwitchUd");
                        if (variation7 != null) {
                            oyu.mEnableLowDeviceSwitchUd.set(variation7.getValueAsBoolean(true));
                        }
                        oyu.H().put("AB_TBLIVE_RTC_ABR", Long.valueOf(activate.getExperimentId()));
                        oyu.I().put("AB_TBLIVE_RTC_ABR", Long.valueOf(activate.getExperimentBucketId()));
                        oyu.G().put("AB_TBLIVE_RTC_ABR", Long.valueOf(activate.getExperimentReleaseId()));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get initRtcLiveParamFromAB info success");
                        oyu.U().set(false);
                    } catch (Throwable th) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get initRtcLiveParamFromAB info failed: " + th.toString());
                    }
                }
            });
        }
    }

    public static void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[0]);
        } else if (!bC.booleanValue()) {
        } else {
            try {
                VariationSet activate = UTABTest.activate("lowspeed_component", "lowspeed_module");
                if (activate != null && activate.size() > 0) {
                    Variation variation = activate.getVariation("enable");
                    if (variation != null) {
                        bh = variation.getValueAsBoolean(false);
                    }
                    Variation variation2 = activate.getVariation("id");
                    if (variation2 != null) {
                        bi = variation2.getValueAsInt(0);
                    }
                    Variation variation3 = activate.getVariation("config");
                    if (variation3 != null) {
                        bj = variation3.getValueAsString("");
                    }
                    Variation variation4 = activate.getVariation("operator");
                    if (variation4 != null) {
                        bk = variation4.getValueAsBoolean(false);
                    }
                    Variation variation5 = activate.getVariation("enNewPolicy");
                    if (variation5 != null) {
                        bm = variation5.getValueAsBoolean(false);
                    }
                    Variation variation6 = activate.getVariation("enableRtcWeakNetFlag");
                    if (variation6 != null) {
                        bn = variation6.getValueAsBoolean(false);
                    }
                    Variation variation7 = activate.getVariation("enableRtcWeakNetSVCDrop");
                    if (variation7 != null) {
                        bq = variation7.getValueAsBoolean(false);
                    }
                    Variation variation8 = activate.getVariation("configOfNewPolicy");
                    if (variation8 != null) {
                        bu = variation8.getValueAsString("");
                    }
                    Variation variation9 = activate.getVariation("defDeciseWindow");
                    if (variation9 != null) {
                        bt = variation9.getValueAsInt(180000);
                    }
                    Variation variation10 = activate.getVariation("enCdnStartPlaySpeed");
                    if (variation10 != null) {
                        bs = variation10.getValueAsBoolean(true);
                    }
                    Variation variation11 = activate.getVariation("artpCommonParams");
                    if (variation11 != null) {
                        bl = variation11.getValueAsString("");
                    }
                    Variation variation12 = activate.getVariation("enableHomePageCardSVCDrop");
                    if (variation12 != null) {
                        br = variation12.getValueAsBoolean(false);
                    }
                    aj.put("lowspeed", Long.valueOf(activate.getExperimentId()));
                    ak.put("lowspeed", Long.valueOf(activate.getExperimentBucketId()));
                    al.put("lowspeed", Long.valueOf(activate.getExperimentReleaseId()));
                }
                bC = false;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initLowSpeedPolicyABIfNeeded error: " + th.toString());
            }
        }
    }

    public static boolean T() {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue();
        }
        if (!bB.booleanValue()) {
            return be.booleanValue();
        }
        try {
            VariationSet activate = UTABTest.activate("rebuildRenderView_component", "rebuildRenderView_module");
            if (activate != null && activate.size() > 0 && (variation = activate.getVariation("enable")) != null) {
                be = Boolean.valueOf(variation.getValueAsBoolean(false));
            }
            bB = false;
            return be.booleanValue();
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "enableRebuildFromAB error: " + th.toString());
            return be.booleanValue();
        }
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{str})).intValue();
        }
        if (aD == null) {
            return 0;
        }
        if (aD.get(str) != null) {
            return aD.get(str).intValue();
        }
        if (aD.get("*") != null) {
            return aD.get("*").intValue();
        }
        return 0;
    }

    public static int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0cfe3ab", new Object[]{str})).intValue();
        }
        if (aE == null) {
            return 0;
        }
        if (aE.get(str) != null) {
            return aE.get(str).intValue();
        }
        if (aE.get("*") != null) {
            return aE.get("*").intValue();
        }
        return 0;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else if (bF) {
        } else {
            bG = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LOADING_SHOW_TIME_AFTER_CALL_START, "3000"));
            bH = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LOADING_TOAST_AFTER_CALL_START, Constant.CODE_GET_TOKEN_SUCCESS));
            bI = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LOADING_SHOW_TIME_WHEN_PLAYING, "500"));
        }
    }

    public static long a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d18de968", new Object[]{context, str, str2})).longValue();
        }
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str) && context != null) {
            StringBuilder sb = new StringBuilder(128);
            if (!StringUtils.isEmpty(str)) {
                if (!StringUtils.isEmpty(sb)) {
                    sb.append("&");
                }
                sb.append("videoCacheId=" + str);
            }
            String a2 = b.a(str2, sb);
            try {
                i a3 = oyw.a(context);
                boolean a4 = a3.a();
                long p2 = a4 ? a3.p(a2) : 0L;
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "check if url=" + a2 + " is hit localFile, bUseVideoCache=" + a4 + ", cacheLength=" + p2);
                return p2;
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getCacheLengthByCacheKeyAndUrl failed: " + th.toString());
            }
        }
        return 0L;
    }

    public static String a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61b42118", new Object[]{context, str, str2, str3, str4});
        }
        try {
            if (MediaSystemUtils.isApkDebuggable()) {
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("ab_mock_value", 0);
                if (sharedPreferences == null) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "prefs is null ");
                    return "";
                }
                String string = sharedPreferences.getString(str + "_" + str2 + "_" + str3, "");
                StringBuilder sb = new StringBuilder();
                sb.append("get SharedPreferences value is ");
                sb.append(string);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
                if (StringUtils.isEmpty(string)) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "jsonBody is empty");
                    return "";
                } else if (StringUtils.isEmpty(str4)) {
                    return string;
                } else {
                    JSONObject parseObject = JSON.parseObject(string);
                    if (parseObject.containsKey(str4)) {
                        return parseObject.getString(str4);
                    }
                }
            }
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get SharedPreferences value failed: " + th.toString());
        }
        return "";
    }
}
