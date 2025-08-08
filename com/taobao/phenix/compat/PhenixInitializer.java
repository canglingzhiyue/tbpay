package com.taobao.phenix.compat;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.monitor.Monitor;
import anetwork.channel.monitor.speed.NetworkSpeed;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.a;
import com.taobao.orange.OrangeConfigLocal;
import com.taobao.pexode.decoder.AvifDecoder;
import com.taobao.pexode.decoder.HeifDecoder;
import com.taobao.pexode.decoder.WebPConvert;
import com.taobao.pexode.decoder.WebPDecoder;
import com.taobao.pexode.decoder.a;
import com.taobao.phenix.compat.e;
import com.taobao.phenix.intf.b;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import mtopsdk.mtop.global.SDKUtils;
import tb.dqf;
import tb.neb;
import tb.niw;
import tb.niz;
import tb.nja;
import tb.nmr;
import tb.nwx;

/* loaded from: classes.dex */
public class PhenixInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FEATURE_ADD_DECODED_CACHE = "image_add_decoded_cache";
    private static final String FEATURE_AVIF_SUPPORT = "image_avif_support";
    private static final String FEATURE_CLOSE_HEIC = "image_force_close_heic";
    private static final String FEATURE_CLOSE_WEBP = "image_force_close_webp";
    private static final String FEATURE_DEVICE_SCALE = "image_device_scale";
    private static final String FEATURE_FORCE_WEBP = "image_force_webp";
    private static final String FEATURE_FUZZY_MATCH = "image_cache_fuzzy_match";
    private static final String FEATURE_LOW_QUALITY = "image_low_quality";
    private static final String FEATURE_NEW_MEM_CACHE_SIZE = "image_new_mem_cache_size";
    private static final String FEATURE_NOTIFY_LAUNCH_FINISH = "image_notify_launch_finish";
    private static final String FEATURE_OPT_ANIM_CACHE_NUM = "image_opt_anim_play";
    private static final String FEATURE_OPT_DECIDE_URL = "image_opt_decide_url_v2";
    private static final String FEATURE_OPT_HEIF_MULTI_THREAD_B = "image_heif_multi_thread_B";
    private static final String FEATURE_OPT_HEIF_MULTI_THREAD__A = "image_heif_multi_thread_A";
    private static final String FEATURE_OPT_IMAGE_SCROLL = "dx_scroll_hitchrate_image_key";
    private static final String FEATURE_OPT_LAUNCH_INIT = "image_opt_init";
    private static final String FEATURE_OPT_MEM_CACHE_STRATEGY = "image_opt_cache_strategy";
    private static final String FEATURE_POST_FRONT_UI_CLOSE = "image_post_front_ui_close";
    private static final String FEATURE_REPORTER_ASYNC = "image_reporter_async";
    private static final String FEATURE_TRADE_INDEPENDENT_CACHE = "image_trade_independent_storage";
    private static final String FEATURE_TURN_OFF_CHECK_AlIVFS = "image_turn_off_check_alivfs";
    private static final String FEATURE_TURN_OFF_FORMAT_CONVERT = "image_turn_off_format_convert";
    private static final String FEATURE_TURN_OFF_SERVER_FORMAT_CONVERT = "image_turn_off_server_adaptive_format";
    private static final String FEATURE_UA_ADD_LEVEL = "image_ua_add_level";
    private static boolean mABValid = false;
    private static boolean mEnableTTL = false;
    private static AvifDecoder sAvifDecoder = null;
    private static boolean sAvifSoPrepared = false;
    private static boolean sAvifSupported = false;
    private static com.taobao.pexode.decoder.f sGifDecoder = null;
    private static HeifDecoder sHeifDecoder = null;
    private static boolean sHeifPngSupported = false;
    private static boolean sHeifSupported = false;
    private static boolean sInited = false;
    private static int sJoinKeepAliveExperiment = -2;
    private static boolean sNewLaunchValid = true;
    private static boolean sUseDecouple;
    private static boolean sUserNewLaunch;
    private static WebPDecoder sWebPDecoder;
    private static boolean sWebPSupported;

    public static /* synthetic */ boolean access$000(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1253e7bf", new Object[]{context, str})).booleanValue() : isABFeatureOpen(context, str);
    }

    public static /* synthetic */ void access$100(Context context, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d8e299", new Object[]{context, eVar, new Boolean(z)});
        } else {
            setupOptPexodeAbility(context, eVar, z);
        }
    }

    public static /* synthetic */ void access$200(Context context, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404e831a", new Object[]{context, eVar, new Boolean(z)});
        } else {
            setupPexodeAbility(context, eVar, z);
        }
    }

    public static /* synthetic */ boolean access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue() : mEnableTTL;
    }

    public static /* synthetic */ boolean access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("906ef47f", new Object[0])).booleanValue() : sWebPSupported;
    }

    public static /* synthetic */ boolean access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue() : sHeifSupported;
    }

    public static /* synthetic */ boolean access$600() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa3b6b01", new Object[0])).booleanValue() : sHeifPngSupported;
    }

    public static /* synthetic */ boolean access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f21a642", new Object[0])).booleanValue() : sAvifSupported;
    }

    public static /* synthetic */ boolean access$800() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6407e183", new Object[0])).booleanValue() : sAvifSoPrepared;
    }

    public static /* synthetic */ boolean access$802(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("205eb277", new Object[]{new Boolean(z)})).booleanValue();
        }
        sAvifSoPrepared = z;
        return z;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (hashMap != null && hashMap.containsKey("isNextLaunch")) {
            sUserNewLaunch = true;
        }
        if (hashMap != null && hashMap.containsKey("ngLaunch")) {
            sUseDecouple = true;
        }
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            mABValid = true;
        } catch (Exception unused) {
            mABValid = false;
        }
        initCache(application);
        initPhenix(application);
        initImageStrategy(application);
        TUrlImageView.registerActivityCallback(application);
        niw.b("TBCompat4Phenix", "all init complete", new Object[0]);
    }

    public static void initHeif(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f87157", new Object[]{context});
        } else {
            initHeif(context, false);
        }
    }

    public static void initHeif(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6166c5d", new Object[]{context, new Boolean(z)});
        } else if (!sNewLaunchValid || sHeifDecoder != null || z) {
        } else {
            HeifDecoder heifDecoder = new HeifDecoder();
            sHeifDecoder = heifDecoder;
            com.taobao.pexode.d.a(heifDecoder);
            if (sHeifDecoder != null) {
                HeifDecoder.a(true);
                HeifDecoder.d(false);
                HeifDecoder.e(true);
                niw.d("TBCompat4Phenix", "useHeifBugFix=%d, heicIccSupportEnable=%d, localHeifBySystemEnable=%d", 1, 0, 1);
            }
            sHeifSupported = com.taobao.pexode.d.c(com.taobao.pexode.decoder.g.HEIF);
            b.h().h(sHeifSupported);
            if (shouldOptThreadCount()) {
                HeifDecoder.a(false, 1);
                return;
            }
            if (isABFeatureOpen(context, FEATURE_OPT_HEIF_MULTI_THREAD__A)) {
                HeifDecoder.a(false, 1);
            }
            if (!isABFeatureOpen(context, FEATURE_OPT_HEIF_MULTI_THREAD_B)) {
                return;
            }
            HeifDecoder.a(true, 2);
        }
    }

    public static void initAvif(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3468b1f", new Object[]{context});
        } else if (!isABFeatureOpen(context, FEATURE_AVIF_SUPPORT) || !sNewLaunchValid) {
        } else {
            e a2 = e.a(context);
            if (!a2.b(45)) {
                return;
            }
            AvifDecoder avifDecoder = new AvifDecoder();
            sAvifDecoder = avifDecoder;
            com.taobao.pexode.d.a(avifDecoder);
            sAvifSupported = true;
            boolean b = a2.b(48);
            AvifDecoder.a(b);
            niw.d("TBCompat4Phenix", "sSupportAvif=%d, localAvifEnable=%s", Integer.valueOf(sAvifSupported ? 1 : 0), String.valueOf(b));
        }
    }

    public static void initApng(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5da0c9", new Object[]{context});
        } else {
            initApng(context, false);
        }
    }

    public static void initApng(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60572b2b", new Object[]{context, new Boolean(z)});
        } else if (!sNewLaunchValid) {
        } else {
            if (!z && isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            if (z && !isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            com.taobao.pexode.d.a(new a());
        }
    }

    public static void initGif(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f131bd0d", new Object[]{context});
        } else {
            initGif(context, false);
        }
    }

    public static void initGif(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35069767", new Object[]{context, new Boolean(z)});
        } else if (!sNewLaunchValid || sGifDecoder != null) {
        } else {
            if (!z && isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            if (z && !isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            com.taobao.pexode.decoder.f fVar = new com.taobao.pexode.decoder.f();
            sGifDecoder = fVar;
            com.taobao.pexode.d.a(fVar);
        }
    }

    public static void initWebp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdafd5", new Object[]{context});
        } else {
            initWebp(context, false);
        }
    }

    public static void initWebp(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b8fd9f", new Object[]{context, new Boolean(z)});
        } else if (!sNewLaunchValid || sWebPDecoder != null) {
        } else {
            if (!z && isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            if (z && !isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                return;
            }
            WebPDecoder webPDecoder = new WebPDecoder();
            sWebPDecoder = webPDecoder;
            com.taobao.pexode.d.a(webPDecoder);
        }
    }

    public static void notifyLaunchFinish(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba65b72", new Object[]{context});
        } else if (!isABFeatureOpen(context, FEATURE_NOTIFY_LAUNCH_FINISH)) {
        } else {
            nmr.c(false);
        }
    }

    public static void initCache(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3cd20f", new Object[]{context});
        } else if (sInited) {
        } else {
            com.taobao.phenix.cache.disk.k.a(new Runnable() { // from class: com.taobao.phenix.compat.PhenixInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!PhenixInitializer.access$000(context, PhenixInitializer.FEATURE_ADD_DECODED_CACHE)) {
                    } else {
                        dqf.a().b();
                    }
                }
            });
        }
    }

    public static void initTBScheduler(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e84364", new Object[]{context});
            return;
        }
        i.a(true);
        if (isABFeatureOpen(context, FEATURE_POST_FRONT_UI_CLOSE)) {
            nmr.c(false);
        }
        registerApmForRx(context);
    }

    private static boolean isABFeatureOpen(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fea157a", new Object[]{context, str})).booleanValue();
        }
        boolean a2 = ABGlobal.a(context, "taobao", "tbspeed", str);
        niw.d("TBCompat4Phenix", "[ABFeatureOpenStatus]key=%s, open=%d", str, Integer.valueOf(a2 ? 1 : 0));
        return a2;
    }

    public static void registerApmForRx(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d8d86d", new Object[]{context});
        } else {
            com.taobao.application.common.c.a(new a.c() { // from class: com.taobao.phenix.compat.PhenixInitializer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IAppLaunchListener
                public void a(int i, int i2) {
                    com.taobao.phenix.cache.c<String, com.taobao.phenix.cache.memory.b> a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    } else if (i2 != 4) {
                    } else {
                        b.h().r(SceneIdentifier.getDeviceLevel() == 3);
                        if (!PhenixInitializer.access$000(context, PhenixInitializer.FEATURE_NOTIFY_LAUNCH_FINISH)) {
                            nmr.c(false);
                        }
                        niw.d("TBCompat4Phenix", "apm launch completed", new Object[0]);
                        if (SceneIdentifier.getDeviceLevel() == 3) {
                            nmr.e(true);
                        }
                        try {
                            if (!PhenixInitializer.access$000(context, PhenixInitializer.FEATURE_NEW_MEM_CACHE_SIZE) || (a2 = b.h().a().a()) == null) {
                                return;
                            }
                            a2.a(nwx.a(context, SceneIdentifier.getDeviceLevel() == 3 ? nwx.LOW_MAX_CACHE_SIZE : 104857600, 4), 0.2f);
                        } catch (Throwable th) {
                            niw.d("TBCompat4Phenix", "apm launch completed", th);
                        }
                    }
                }
            });
        }
    }

    public static void initBuild(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390fb2a3", new Object[]{context});
            return;
        }
        b.h().s();
        d.a(context, new h(), e.a(context).a(13), e.a(context).a(21), 524288, null);
        g.a();
        if (!isABFeatureOpen(context, FEATURE_REPORTER_ASYNC)) {
            return;
        }
        d.a(true);
    }

    public static synchronized boolean initPhenix(final Context context) {
        synchronized (PhenixInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("63f72a65", new Object[]{context})).booleanValue();
            } else if (sInited) {
                return true;
            } else {
                niw.a(new j());
                b.h().a(context);
                b.h().a(new f());
                initTTL(context);
                g.a(context);
                g.b(false);
                c.a();
                if (!sUseDecouple) {
                    i.a(true);
                }
                if (mABValid) {
                    String uTABTestValue = ABTestCenter.getUTABTestValue("PHENIX", "DISK");
                    String uTABTestValue2 = ABTestCenter.getUTABTestValue("PHENIX", "OSVER");
                    if (Build.VERSION.SDK_INT >= (!StringUtils.isEmpty(uTABTestValue2) ? Integer.valueOf(uTABTestValue2).intValue() : 23) && !StringUtils.isEmpty(uTABTestValue)) {
                        b.h().b().a(17, Integer.valueOf(uTABTestValue).intValue() * 1048576);
                    }
                    niw.d("TBCompat4Phenix", "DiskCache=%s", uTABTestValue);
                }
                nmr.b(false);
                sNewLaunchValid = true;
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(sNewLaunchValid ? 1 : 0);
                niw.d("TBCompat4Phenix", "use-new-launch=%d", objArr);
                e a2 = e.a(context);
                if (isABFeatureOpen(context, FEATURE_FUZZY_MATCH)) {
                    b.h().k(true);
                }
                if (shouldOptThreadCount()) {
                    com.taobao.phenix.cache.disk.g.a().a(false);
                } else {
                    com.taobao.phenix.cache.disk.g.a().a(!isABFeatureOpen(context, FEATURE_TURN_OFF_CHECK_AlIVFS));
                }
                niw.d("TBCompat4Phenix", "new-heif_png_support=%d", 1);
                sHeifPngSupported = true;
                b.h().b(true);
                d.b = true;
                nmr.a(true);
                g.a(true);
                b.h().c(false);
                if (Build.VERSION.SDK_INT >= 23 && Process.is64Bit()) {
                    b.h().d(true);
                    niw.d("TBCompat4Phenix", "image_mem_cache_size=%d", 1);
                }
                if (isABFeatureOpen(context, FEATURE_TURN_OFF_FORMAT_CONVERT)) {
                    b.h().e(true);
                    niw.d("TBCompat4Phenix", "image_turn_off_format_convert=%d", 1);
                }
                if (isABFeatureOpen(context, FEATURE_TURN_OFF_SERVER_FORMAT_CONVERT)) {
                    b.h().f(true);
                    niw.d("TBCompat4Phenix", "image_turn_off_server_adaptive_format=%d", 1);
                }
                if (isABFeatureOpen(context, FEATURE_OPT_ANIM_CACHE_NUM)) {
                    b.h().g(true);
                    niw.d("TBCompat4Phenix", "image_opt_anim_num=%d", 1);
                }
                if (isABFeatureOpen(context, FEATURE_OPT_IMAGE_SCROLL)) {
                    b.h().m(true);
                }
                if (isABFeatureOpen(context, FEATURE_LOW_QUALITY)) {
                    b.h().n(true);
                }
                if (isABFeatureOpen(context, FEATURE_CLOSE_HEIC)) {
                    b.h().o(true);
                }
                if (isABFeatureOpen(context, FEATURE_CLOSE_WEBP)) {
                    b.h().p(true);
                }
                if (isABFeatureOpen(context, FEATURE_UA_ADD_LEVEL)) {
                    b.h().q(true);
                }
                if (isABFeatureOpen(context, FEATURE_NOTIFY_LAUNCH_FINISH)) {
                    nmr.d(true);
                }
                if (isABFeatureOpen(context, FEATURE_ADD_DECODED_CACHE)) {
                    b.h().s(true);
                }
                if (isABFeatureOpen(context, FEATURE_TRADE_INDEPENDENT_CACHE)) {
                    b.h().t(true);
                }
                if (isABFeatureOpen(context, FEATURE_OPT_MEM_CACHE_STRATEGY)) {
                    b.h().u(true);
                }
                if (!sUseDecouple) {
                    b.h().s();
                }
                if (isABFeatureOpen(context, FEATURE_OPT_LAUNCH_INIT)) {
                    setupOptPexodeAbility(context, a2, true);
                } else {
                    setupPexodeAbility(context, a2, true);
                    initWebp(context);
                    initGif(context);
                }
                com.taobao.pexode.d.a(b.h().q().a());
                com.taobao.pexode.d.a(context);
                a2.a(new e.a() { // from class: com.taobao.phenix.compat.PhenixInitializer.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.compat.e.a
                    public void a(e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e920f3f3", new Object[]{this, eVar});
                        } else if (PhenixInitializer.access$000(context, PhenixInitializer.FEATURE_OPT_LAUNCH_INIT)) {
                            PhenixInitializer.access$100(context, eVar, false);
                        } else {
                            PhenixInitializer.access$200(context, eVar, false);
                            PhenixInitializer.initWebp(context);
                            PhenixInitializer.initGif(context);
                        }
                    }
                });
                if (!sUseDecouple) {
                    d.a(context, new h(), e.a(context).a(13), e.a(context).a(21), 524288, null);
                    g.a();
                    if (isABFeatureOpen(context, FEATURE_REPORTER_ASYNC)) {
                        d.a(true);
                    }
                }
                niw.b("TBCompat4Phenix", "phenix init complete", new Object[0]);
                sInited = true;
                return false;
            }
        }
    }

    private static void initTTL(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13031fe5", new Object[]{context});
            return;
        }
        mEnableTTL = true;
        niz nizVar = new niz("");
        nizVar.a(new nja() { // from class: com.taobao.phenix.compat.PhenixInitializer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nja
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : PhenixInitializer.access$300() && !StringUtils.isEmpty(str) && str.contains(e.f18893a);
            }

            @Override // tb.nja
            public boolean a(long j) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : PhenixInitializer.access$300() && j < e.b;
            }

            @Override // tb.nja
            public long a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : SDKUtils.getCorrectionTime();
            }
        });
        com.taobao.tao.image.c.a(new com.taobao.tao.image.e() { // from class: com.taobao.phenix.compat.PhenixInitializer.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.image.e
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                if (!StringUtils.isEmpty(str) && !str.equals(e.f18893a)) {
                    e.f18893a = str;
                }
                if (StringUtils.isEmpty(str2)) {
                    return;
                }
                e.b = Long.valueOf(str2).longValue();
            }
        });
        b.h().f().a(nizVar);
    }

    private static synchronized void setupOptPexodeAbility(Context context, e eVar, boolean z) {
        synchronized (PhenixInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcbbc04f", new Object[]{context, eVar, new Boolean(z)});
                return;
            }
            com.taobao.pexode.d.c = true;
            b.f18927a = true;
            ImageStrategyConfig.c = true;
            if (Build.VERSION.SDK_INT == 28 && WebPConvert.sIsSoInstalled) {
                WebPConvert.nativeUseBugFix(true);
            }
            if (z && (!sNewLaunchValid || !sUserNewLaunch)) {
                com.taobao.pexode.d.a(new com.taobao.pexode.decoder.a());
                HeifDecoder heifDecoder = new HeifDecoder();
                sHeifDecoder = heifDecoder;
                com.taobao.pexode.d.a(heifDecoder);
                if (isABFeatureOpen(context, FEATURE_AVIF_SUPPORT)) {
                    com.taobao.pexode.d.a(new AvifDecoder());
                    sAvifSupported = true;
                    Object[] objArr = new Object[1];
                    objArr[0] = Integer.valueOf(sAvifSupported ? 1 : 0);
                    niw.d("TBCompat4Phenix", "sSupportAvif=%d", objArr);
                }
            }
            if (sHeifDecoder != null) {
                HeifDecoder.a(true);
                HeifDecoder.d(false);
                HeifDecoder.e(true);
            }
            com.taobao.pexode.d.a(true);
            com.taobao.pexode.d.b(false);
            sWebPSupported = com.taobao.pexode.d.c(neb.WEBP) && com.taobao.pexode.d.c(neb.WEBP_A);
            if (!sNewLaunchValid || !sUserNewLaunch) {
                sHeifSupported = com.taobao.pexode.d.c(com.taobao.pexode.decoder.g.HEIF);
                b.h().h(sHeifSupported);
            }
            mEnableTTL = true;
            niw.b("TBCompat4Phenix", "setup pexode ability with heif=%b, webp=%b, initializing=%b", Boolean.valueOf(sHeifSupported), Boolean.valueOf(sWebPSupported), Boolean.valueOf(z));
            if (eVar.b(55)) {
                b.h().l(true);
            }
            checkHeifAlpha(eVar);
        }
    }

    private static void checkHeifAlpha(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abc560e", new Object[]{eVar});
            return;
        }
        boolean b = eVar.b(51);
        boolean b2 = eVar.b(53);
        boolean b3 = eVar.b(54);
        niw.d("TBCompat4Phenix", "checkHeifAlpha supportHeifAlpha = " + b + ", fixHeifAlphaCrash = " + b2, new Object[0]);
        HeifDecoder.b(b2);
        HeifDecoder.c(b3);
        b.h().i(b);
        if (!eVar.b(52) || eVar.b(e.CLEAR_CACHE_HISTORY).booleanValue()) {
            return;
        }
        eVar.a(e.CLEAR_CACHE_HISTORY, (Object) true);
        niw.d("TBCompat4Phenix", "clear all local diskcache because clear history switch opened", new Object[0]);
        b.h().v();
    }

    private static synchronized void setupPexodeAbility(Context context, e eVar, boolean z) {
        synchronized (PhenixInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a0216e8", new Object[]{context, eVar, new Boolean(z)});
                return;
            }
            boolean b = eVar.b(15);
            boolean b2 = eVar.b(16);
            boolean b3 = eVar.b(19);
            boolean b4 = eVar.b(46);
            com.taobao.pexode.d.b = b4;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(b4 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-AndroidS=%d", objArr);
            boolean b5 = eVar.b(29);
            com.taobao.pexode.d.f18687a = b5;
            Object[] objArr2 = new Object[1];
            objArr2[0] = Integer.valueOf(b5 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-AndroidP=%d", objArr2);
            ImageStrategyConfig.b = !eVar.b(31);
            Object[] objArr3 = new Object[1];
            objArr3[0] = Integer.valueOf(ImageStrategyConfig.b ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-Degrade-webp=%d", objArr3);
            boolean b6 = eVar.b(33);
            com.taobao.pexode.d.c = b6;
            Object[] objArr4 = new Object[1];
            objArr4[0] = Integer.valueOf(b6 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-webp-convert=%d", objArr4);
            boolean b7 = eVar.b(32);
            b.f18927a = b7;
            Object[] objArr5 = new Object[1];
            objArr5[0] = Integer.valueOf(b7 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-no-reuse-webp=%d", objArr5);
            boolean b8 = eVar.b(37);
            ImageStrategyConfig.c = b8;
            Object[] objArr6 = new Object[1];
            objArr6[0] = Integer.valueOf(b8 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-special-domain=%d", objArr6);
            boolean b9 = eVar.b(35);
            if (Build.VERSION.SDK_INT == 28 && WebPConvert.sIsSoInstalled) {
                WebPConvert.nativeUseBugFix(b9);
            }
            Object[] objArr7 = new Object[1];
            objArr7[0] = Integer.valueOf(b9 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-webp-bugfix=%d", objArr7);
            boolean z2 = Build.VERSION.SDK_INT >= 29 && eVar.b(36);
            if (z2) {
                b.h().j(true);
            }
            Object[] objArr8 = new Object[1];
            objArr8[0] = Integer.valueOf(z2 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-new-thumb=%d", objArr8);
            if (z && (!sNewLaunchValid || !sUserNewLaunch)) {
                if (eVar.b(20)) {
                    com.taobao.pexode.d.a(new com.taobao.pexode.decoder.a());
                }
                if (eVar.b(22)) {
                    HeifDecoder heifDecoder = new HeifDecoder();
                    sHeifDecoder = heifDecoder;
                    com.taobao.pexode.d.a(heifDecoder);
                }
                if (isABFeatureOpen(context, FEATURE_AVIF_SUPPORT) && eVar.b(45)) {
                    com.taobao.pexode.d.a(new AvifDecoder());
                    sAvifSupported = true;
                    Object[] objArr9 = new Object[1];
                    objArr9[0] = Integer.valueOf(sAvifSupported ? 1 : 0);
                    niw.d("TBCompat4Phenix", "sSupportAvif=%d", objArr9);
                }
            }
            boolean b10 = eVar.b(30);
            if (sHeifDecoder != null) {
                HeifDecoder.a(b10);
                HeifDecoder.d(false);
                HeifDecoder.e(true);
            }
            Object[] objArr10 = new Object[1];
            objArr10[0] = Integer.valueOf(b10 ? 1 : 0);
            niw.d("TBCompat4Phenix", "use-HeifBugFix=%d", objArr10);
            com.taobao.pexode.d.a(!b);
            com.taobao.pexode.d.c(b2);
            com.taobao.pexode.d.b(!b3);
            sWebPSupported = com.taobao.pexode.d.c(neb.WEBP) && com.taobao.pexode.d.c(neb.WEBP_A);
            if (!sNewLaunchValid || !sUserNewLaunch) {
                sHeifSupported = com.taobao.pexode.d.c(com.taobao.pexode.decoder.g.HEIF);
                b.h().h(sHeifSupported);
            }
            mEnableTTL = eVar.b(38);
            Object[] objArr11 = new Object[1];
            objArr11[0] = Integer.valueOf(mEnableTTL ? 1 : 0);
            niw.d("TBCompat4Phenix", "mEnableTTL=%d", objArr11);
            niw.d("TBCompat4Phenix", "sHeifSupported=%b", Boolean.valueOf(sHeifSupported));
            niw.b("TBCompat4Phenix", "setup pexode ability with heif=%b, webp=%b, external_prior=%b, cancellable=%b, ashmem=%b, initializing=%b", Boolean.valueOf(sHeifSupported), Boolean.valueOf(sWebPSupported), Boolean.valueOf(b), Boolean.valueOf(b2), Boolean.valueOf(b3), Boolean.valueOf(z));
            int c = eVar.c(42);
            int c2 = eVar.c(43);
            int c3 = eVar.c(44);
            if (c > 0) {
                com.taobao.phenix.cache.disk.g.a().a(c);
            }
            if (c2 > 0) {
                com.taobao.phenix.cache.disk.g.a().b(c2);
            }
            if (c3 > 0) {
                com.taobao.phenix.cache.disk.g.a().c(c3);
            }
            if (eVar.b(55)) {
                b.h().l(true);
            }
            String a2 = eVar.a(50, e.CLOUD_KEY_LIMIT_RECURSIVE_DEPTH_WHITELIST);
            niw.d("TBCompat4Phenix", "bizCodeList " + a2, new Object[0]);
            if (!StringUtils.isEmpty(a2)) {
                nmr.a(new ArrayList(Arrays.asList(a2.contains(",") ? a2.split(",") : new String[]{a2})));
            }
            checkHeifAlpha(eVar);
        }
    }

    private void initImageStrategy(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d225e3a", new Object[]{this, application});
            return;
        }
        com.taobao.tao.image.c.a(application, new com.taobao.tao.image.b() { // from class: com.taobao.phenix.compat.PhenixInitializer.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.image.b
            public String a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfigLocal.getInstance().getConfig(str, str2, str3);
            }

            @Override // com.taobao.tao.image.b
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : PhenixInitializer.access$400();
            }

            @Override // com.taobao.tao.image.b
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Monitor.getNetworkSpeed() == NetworkSpeed.Slow;
            }
        });
        com.taobao.tao.image.c.a().a(new com.taobao.tao.image.a() { // from class: com.taobao.phenix.compat.PhenixInitializer.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.image.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : PhenixInitializer.access$500();
            }

            @Override // com.taobao.tao.image.a
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : PhenixInitializer.access$600();
            }

            @Override // com.taobao.tao.image.a
            public boolean c() {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                if (!PhenixInitializer.access$700()) {
                    return false;
                }
                if (!PhenixInitializer.access$800()) {
                    if (!com.taobao.pexode.decoder.h.a().b() || !com.taobao.pexode.d.c(com.taobao.pexode.decoder.c.AVIF)) {
                        z = false;
                    }
                    PhenixInitializer.access$802(z);
                }
                return PhenixInitializer.access$800();
            }
        });
        OrangeConfigLocal.getInstance().registerListener(new String[]{com.taobao.tao.image.c.IMAGE_CONFIG}, new com.taobao.orange.g() { // from class: com.taobao.phenix.compat.PhenixInitializer.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else if (!com.taobao.tao.image.c.IMAGE_CONFIG.equals(str)) {
                } else {
                    com.taobao.tao.image.c.a().d();
                }
            }
        });
        Coordinator.postTask(new Coordinator.TaggedRunnable("initImageConfig") { // from class: com.taobao.phenix.compat.PhenixInitializer.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    OrangeConfigLocal.getInstance().getConfigs(com.taobao.tao.image.c.IMAGE_CONFIG);
                }
            }
        });
        if (isABFeatureOpen(application, FEATURE_DEVICE_SCALE)) {
            com.taobao.tao.image.c.a().a(true);
        }
        if (isABFeatureOpen(application, FEATURE_LOW_QUALITY)) {
            com.taobao.tao.image.c.a().b(true);
        }
        if (isABFeatureOpen(application, FEATURE_FORCE_WEBP)) {
            com.taobao.tao.image.c.a().c(true);
        }
        if (isABFeatureOpen(application, FEATURE_OPT_DECIDE_URL)) {
            com.taobao.tao.image.c.a().d(true);
        }
        niw.b("TBCompat4Phenix", "image_strategy init complete", new Object[0]);
    }

    public static void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        if (b.h() != null && b.h().n() != null) {
            ((Application) b.h().n()).unregisterActivityLifecycleCallbacks(com.taobao.phenix.compat.stat.b.c());
        }
        sInited = false;
    }

    private static boolean shouldOptThreadCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d24b10", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && !Process.is64Bit()) {
            return true;
        }
        return (StringUtils.equals(Build.BRAND, "HUAWEI") || StringUtils.equals(Build.BRAND, "HONOR")) && Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 28;
    }
}
