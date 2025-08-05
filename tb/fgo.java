package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.ultronengine.c;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.sdk.utils.a;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.speed.TBSpeed;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes5.dex */
public class fgo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_ALL_VIDEO = "close_all_video";
    public static final String CLOSE_MAIN_DETAIL_DATA_TLOG = "close_apmlog";
    public static final String COMPONENT_MIGRATION_CONFIG = "ultron_componentsVO_config";
    public static final String COMP_UT_SAMPLE_RATE = "compUtSampleRate";
    public static final String DETAIL_REQUEST_WITH_BUSINESS_SCALE = "detail_request_with_business_scale";
    public static final String ENABLE_ACTION_BAR_SEARCH = "enable_search";
    public static final String ENABLE_ADDCARD_FLOAT = "enableAddCardFloat";
    public static final String ENABLE_ADD_AFCID = "enable_addAfcid";
    public static final String ENABLE_AD_TAOKE_COPY_TITLE = "enable_taoke_copy_title_track";
    public static final String ENABLE_APM_GOD_EYE = "enable_apm_god_eye";
    public static final String ENABLE_ASYNC_LOAD_SEARCH_INFO = "enable_aync_load_search_info";
    public static final String ENABLE_BUHUO_REMIND = "use_replenishmentRemind";
    public static final String ENABLE_BUY_NOW_OPEN_SKU = "enableBuyNowOpenSku";
    public static final String ENABLE_COLLOCATE_FLOAT = "enableCollocateFloat";
    public static final String ENABLE_DINAMIC_V3 = "enable_dinamic_v3";
    public static final String ENABLE_FILTER_REPEAT = "enable_filter_repeat";
    public static final String ENABLE_FLATTEN_TREE = "enableFlattenTree";
    public static final String ENABLE_FLOAT_WEEX_VIEW = "enable_float_weex_view";
    public static final String ENABLE_LINKBACK = "enable_linkback";
    public static final String ENABLE_MAINIMG_FITCENTER = "enableMainImgFitCenter";
    public static final String ENABLE_NEW_DETAIL = "enable_new_detail";
    public static final String ENABLE_NEW_DETAIL_ALL_CHANNEL = "enable_new_detail_allChannel";
    public static final String ENABLE_NEW_MAIN_PIC = "enableNewMainPic";
    public static final String ENABLE_NEW_MAIN_PIC_DEFAULT_VALUE = "enable_new_main_pic_default_value";
    public static final String ENABLE_NEW_TAOMOMENT = "enable_new_taomoment";
    public static final String ENABLE_OCR = "enable_OCR";
    public static final String ENABLE_PIPE_LINE_CHCHE = "enablePipelineCache";
    public static final String ENABLE_PRESET_DETAIL = "enable_preset_detail";
    public static final String ENABLE_REPLENISHMENT_UPDATE = "enableReplenishmentUpdate";
    public static final String ENABLE_SHOW_RELATED_ITEM = "enable_show_related_item";
    public static final String ENABLE_SKU_BUY_MODE = "enable_sku_buymode";
    public static final String ENABLE_SKU_PROM = "enable_sku_prom";
    public static final String ENABLE_SURFACEVIEW_OPTIMIZE = "enable_surfaceView_optimize";
    public static final String ENABLE_T_STUDIO = "enableTStudio";
    public static final String ENABLE_ULTRON_CACHE = "enableUltronCache2";
    public static final String ENABLE_VIDEO_AUTO_PLAY = "enable_video_autoplay";
    public static final String ENABLE_WEEX_SUPPORT = "enable_weex_support";
    public static final String FORCE_USE_H5_RENDER_BIZ_CODE = "forceUseH5RenderBizCode";
    public static final String FORCE_USE_H5_RENDER_DOMAIN = "forceUseH5RenderDomain";
    public static final String ISDETAILDEGRADE = "opensdk_degrade";
    public static final String IS_ULTRON2 = "is_ultron2";
    public static final String IS_USE_VIDEO_CTRL = "is_use_video_ctrl";
    public static final String NEW_DETAIL_ALL_CHANNEL_WHITE_LIST = "new_detail_allChannel_whiteList";
    public static final String NEW_DETAIL_CHANNEL = "new_detail_channel";
    public static final String NEW_DETAIL_ENABLE_NEW_ROUTER = "new_detail_enable_new_router";
    public static final String NEW_DETAIL_MINOR_CHANNEL = "new_detail_minorChannel";
    public static final String ORANGE_PRE_SP = "orangePre";
    public static final String SHOW_TMALL_TITLE = "show_tmall_title";
    public static final String USE_USER_BEHAVIOR_TRACK = "use_user_behavior_track";
    public static final String WEEX_FLOAT_MAX_COUNT = "weexFloat_maxCount";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f27928a;
    public static boolean b;
    public static String[] c;
    private static Map<String, Object> d;
    private static VariationSet e;
    private static Variation f;
    private static boolean g;

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue() : d(activity);
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : g;
    }

    static {
        kge.a(1600147080);
        d = new HashMap();
        e = null;
        f = null;
        g = true;
        f27928a = false;
        emu.a("com.taobao.android.detail.wrapper.utils.DetailABTestUtils");
        b = false;
        c = new String[]{"android_detail"};
    }

    public static boolean a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd717ceb", new Object[]{context, uri})).booleanValue() : d(context);
    }

    public static void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
            return;
        }
        i.d(j.a("DetailCoreActivity"), "startOldDetailActivity");
        Intent intent2 = (Intent) intent.clone();
        intent2.setAction("com.taobao.android.detail.olddetail");
        intent2.setComponent(new ComponentName("com.taobao.taobao", "com.taobao.tao.detail.activity.DetailActivity"));
        context.startActivity(intent2);
    }

    private static boolean d(Context context) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        c(context);
        return !(context instanceof Activity) || (data = ((Activity) context).getIntent().getData()) == null || !data.toString().contains("biz_degrade=true");
    }

    public static void a(final DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{detailCoreActivity});
            return;
        }
        i.d(j.a("DetailCoreActivity"), "config 0");
        emu.a();
        if (!DetailActivity.u || !f27928a) {
            i.d(j.a("DetailCoreActivity"), "firstboot false");
            a((Context) detailCoreActivity);
        }
        if (epv.b) {
            ecu.f27202a = false;
        } else {
            ecu.g = b((Activity) detailCoreActivity);
            if (ecu.f27202a) {
                String str = null;
                VariationSet activate = UTABTest.activate("taobao_detail", "wifi_auto_play", d, null);
                e = activate;
                Variation variation = activate.getVariation("bucket");
                f = variation;
                if (variation != null) {
                    str = f.getValueAsString("auto");
                }
                ecu.g = b((Activity) detailCoreActivity);
                boolean c2 = c((Activity) detailCoreActivity);
                boolean N = detailCoreActivity.N();
                if (!"auto".equals(str) || ecu.g || (c2 && N)) {
                    z = false;
                }
                if (z) {
                    z = a(detailCoreActivity.getApplicationContext(), z);
                }
                ecu.f27202a = z;
            }
        }
        i.d(j.a("DetailCoreActivity"), "config 1");
        Coordinator.postTask(new Coordinator.TaggedRunnable("apmTrack") { // from class: tb.fgo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z2 = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (jqm.a() && fgo.a((Activity) detailCoreActivity)) {
                    z2 = true;
                }
                ecu.h = z2;
                ecg.b(detailCoreActivity);
                String subEdition = TBSpeed.getSubEdition();
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                if (subEdition == null) {
                    subEdition = "";
                }
                sb.append(subEdition);
                sb.append("#桶号");
                hashMap.put("9999#极速版实验", sb.toString());
                hashMap.put("9997#新老详情", fgo.c() + "#桶号");
                a.a(hashMap);
                i.d(j.a("DetailCoreActivity"), "config 2");
            }
        });
    }

    public static void a(Context context) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        b(context);
        ecu.d = ecr.c(context);
        ecu.ac = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_ADD_AFCID, "true"));
        ecu.v = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_ACTION_BAR_SEARCH, "true"));
        ecu.b = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", SHOW_TMALL_TITLE, "false"));
        ecu.c = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", CLOSE_ALL_VIDEO, "false"));
        ecu.e = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", IS_USE_VIDEO_CTRL, "true"));
        ecu.i = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "enable_show_price_title", "false"));
        ecu.j = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_FILTER_REPEAT, "false"));
        ecu.k = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_BUHUO_REMIND, "false"));
        ecu.l = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", CLOSE_MAIN_DETAIL_DATA_TLOG, "true"));
        ecu.n = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_SURFACEVIEW_OPTIMIZE, "true"));
        ecu.o = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_SHOW_RELATED_ITEM, "true"));
        ecu.p = true;
        ecu.r = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_DINAMIC_V3, "true"));
        ecu.w = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_BUY_NOW_OPEN_SKU, "true"));
        ecu.f27202a = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_VIDEO_AUTO_PLAY, "true"));
        ecu.s = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_FLATTEN_TREE, "true"));
        ecu.t = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_PIPE_LINE_CHCHE, "true"));
        ecu.u = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "enablePerfTimeline", "false")) || jqm.a();
        ecu.m = "true".equals(epj.h().a("android_detail", ENABLE_OCR, "false"));
        ecu.x = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_SKU_BUY_MODE, "true"));
        ecu.y = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_PRESET_DETAIL, "true"));
        ecu.G = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_FLOAT_WEEX_VIEW, "true"));
        ecu.z = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_WEEX_SUPPORT, "false"));
        ecu.A = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_SKU_PROM, "true"));
        ecu.E = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_COLLOCATE_FLOAT, "false"));
        ecu.D = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_ADDCARD_FLOAT, "true"));
        ecu.F = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_MAINIMG_FITCENTER, "true"));
        ecu.C = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_APM_GOD_EYE, "true"));
        ecu.B = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_REPLENISHMENT_UPDATE, "true"));
        ecu.H = jqm.a() && "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_T_STUDIO, "true"));
        ecu.K = OrangeConfig.getInstance().getConfig("android_detail", COMP_UT_SAMPLE_RATE, "1/1000");
        String config = OrangeConfig.getInstance().getConfig("android_detail", COMPONENT_MIGRATION_CONFIG, null);
        if (config != null) {
            try {
                epv.f = JSON.parseObject(config);
            } catch (Throwable th) {
                TLog.loge("DetailCoreActivity", "ultronEngineComponentMigrationConfig", th);
            }
        }
        epv.g = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "enable_detail_ultron_clientEngine", "true"));
        ecu.I = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_AD_TAOKE_COPY_TITLE, "true"));
        epv.e = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_ULTRON_CACHE, "true"));
        c.f9923a = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "perfApm", "false"));
        ecu.J = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "enableBroadcastDetail", "true"));
        try {
            ecu.S = Integer.parseInt(OrangeConfig.getInstance().getConfig("android_detail", WEEX_FLOAT_MAX_COUNT, "3"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        ecu.N = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_NEW_MAIN_PIC, "true"));
        epv.h = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_NEW_MAIN_PIC_DEFAULT_VALUE, "true"));
        ecu.O = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "shop_recommend_downgrade", "false"));
        ecu.P = OrangeConfig.getInstance().getConfig("android_detail", DETAIL_REQUEST_WITH_BUSINESS_SCALE, "0");
        ecu.Z = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_NEW_TAOMOMENT, "true"));
        ecu.aa = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "roll_back_delete_ut", "false"));
        String config2 = OrangeConfig.getInstance().getConfig("android_detail", "roll_back_delete_ut_list", "");
        if (config2 != null) {
            ecu.ab = Arrays.asList(config2.split("/"));
        }
        a();
        eiq.a();
        eis.a();
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        ecu.M = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", ENABLE_LINKBACK, String.valueOf((applicationContext == null || (sharedPreferences = applicationContext.getSharedPreferences(ORANGE_PRE_SP, 0)) == null) ? false : sharedPreferences.getBoolean(ENABLE_LINKBACK, false))));
        if (b) {
            return;
        }
        final Context applicationContext2 = context.getApplicationContext();
        OrangeConfig.getInstance().registerListener(c, new d() { // from class: tb.fgo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                SharedPreferences sharedPreferences2;
                SharedPreferences.Editor edit;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                if (configs == null) {
                    return;
                }
                ecu.M = Boolean.parseBoolean(configs.get(fgo.ENABLE_LINKBACK));
                Context context2 = applicationContext2;
                if (context2 == null || (sharedPreferences2 = context2.getSharedPreferences(fgo.ORANGE_PRE_SP, 0)) == null || (edit = sharedPreferences2.edit()) == null) {
                    return;
                }
                edit.putBoolean(fgo.ENABLE_LINKBACK, Boolean.parseBoolean(configs.get(fgo.ENABLE_LINKBACK)));
                edit.commit();
            }
        }, false);
        b = true;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            ecu.Q = OrangeConfig.getInstance().getConfig("android_detail", FORCE_USE_H5_RENDER_DOMAIN, "https://main.m.taobao.com/detail/index.html");
            ecu.R = new HashSet(Arrays.asList(OrangeConfig.getInstance().getConfig("android_detail", FORCE_USE_H5_RENDER_BIZ_CODE, "").split(",")));
        } catch (Exception unused) {
            TLog.loge("DetailCoreActivity", "initFoceH5RenderBizCode error ");
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        ecu.q = true;
        fgz.c = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", USE_USER_BEHAVIOR_TRACK, "true"));
    }

    private static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        nyf nyfVar = (nyf) AliAdaptServiceManager.getInstance().findAliAdaptService(nyf.class);
        return nyfVar != null ? nyfVar.isAutoPlayVideoUnderCurrentNetwork(context) : z;
    }

    private static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        Uri data = activity.getIntent().getData();
        if (data == null) {
            return false;
        }
        return "taolive".equalsIgnoreCase(data.getQueryParameter("bizType"));
    }

    private static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{activity})).booleanValue();
        }
        Uri data = activity.getIntent().getData();
        if (data == null) {
            return false;
        }
        return "newDetail".equalsIgnoreCase(data.getQueryParameter("from"));
    }

    private static boolean d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b27d5801", new Object[]{activity})).booleanValue();
        }
        Uri data = activity.getIntent().getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("opendebug");
            if ("true".equalsIgnoreCase(queryParameter)) {
                return true;
            }
            if ("false".equalsIgnoreCase(queryParameter)) {
                return false;
            }
        }
        return ecu.h;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        epv.f27513a = true;
        epv.b = TBSpeed.isSpeedEdition(context, "DVideo");
        epv.c = TBSpeed.isSpeedEdition(context, "DAsyncView");
        epv.d = TBSpeed.isSpeedEdition(context, "DSkuModel");
        ecn.a(context.getApplicationContext(), "isOpenNaviteOptimize", true);
    }
}
