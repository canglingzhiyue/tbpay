package com.taobao.tbpoplayer.info;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.tbpoplayer.track.model.TrackConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bzo;
import tb.bzz;
import tb.cac;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_AUTO_SIZE_ASPECT = "autoSizeAspect";
    public static final String SP_KEY_CDN_FETCH_CDN_URL = "CDN_FETCH_CDN_URL";
    public static final String SP_KEY_CDN_FETCH_PAGE_SWITCH_TIMES = "CDN_FETCH_PAGE_SWITCH_TIMES";
    public static final String SP_KEY_CONFIG_BY_CON = "CONFIG_BY_CON";
    public static final String SP_KEY_CONFIG_LOCAL_OPT = "CONFIG_LOCAL_OPT";
    public static final String SP_KEY_DAI_TRIGGER_ENABLE = "DAI_TRIGGER_ENABLE";
    public static final String SP_KEY_ENABLE_CLEAN_KEEP_DIRECTLY = "ENABLE_CLEAN_KEEP_DIRECTLY";
    public static final String SP_KEY_ENABLE_CONTEXT_WRAPPER = "ENABLE_CONTEXT_WRAPPER";
    public static final String SP_KEY_ENABLE_LAUNCH_OPT = "ENABLE_LAUNCH_OPT";
    public static final String SP_KEY_ENABLE_LOCAL_CONFIG = "ENABLE_LOCAL_CONFIG";
    public static final String SP_KEY_ENABLE_LOCAL_LM_CONFIG = "ENABLE_LOCAL_LM_CONFIG";
    public static final String SP_KEY_ENABLE_REMOVE_CONFIG_UPDATE_NOTIFY = "ENABLE_REMOVE_CONFIG_UPDATE_NOTIFY";
    public static final String SP_KEY_FATIGUE_FILTER_ENABLE = "FATIGUE_FILTER_ENABLE";
    public static final String SP_KEY_FLASH_POP_ENABLE = "FLASH_POP_ENABLE";
    public static final String SP_KEY_FLOW_INTERVENTION = "flowIntervention";
    public static final String SP_KEY_FORBID_H5_ACC = "FORBID_H5_ACC";
    public static final String SP_KEY_INTERCEPT_HOVER = "INTERCEPT_HOVER";
    public static final String SP_KEY_INTERRUPT_DOWN_ACTION = "INTERRUPT_DOWN_ACTION";
    public static final String SP_KEY_INVALID_ACTIVITY_CONFIG = "INVALID_ACTIVITY_CONFIG";
    public static final String SP_KEY_LM_CONFIG_ORANGE_VERSION = "LM_CONFIG_ORANGE_VERSION";
    public static final String SP_KEY_MTOP_GROUP_ENABLE = "MTOP_GROUP_ENABLE";
    public static final String SP_KEY_NATIVE_POP_ENABLE = "NATIVE_POP_ENABLE";
    public static final String SP_KEY_NATIVE_POP_GRADUAL_ENABLE = "NATIVE_POP_GRADUAL_ENABLE";
    public static final String SP_KEY_NATIVE_POP_PROP_REPLACE_BF = "NATIVE_POP_PROP_REPLACE_BF";
    public static final String SP_KEY_NATIVE_POP_RE_RENDER_ON_SCREEN_CHANGE = "NATIVE_POP_RE_RENDER_ON_SCREEN_CHANGE";
    public static final String SP_KEY_NEW_NATIVE_NOTIFICATION_ENABLE = "NEW_NATIVE_NOTIFICATION_ENABLE";
    public static final String SP_KEY_OPT_GROUP_CHECK = "OPT_GROUP_CHECK";
    public static final String SP_KEY_OPT_H5_SNAPSHOT = "OPT_H5_SNAPSHOT";
    public static final String SP_KEY_OPT_NATIVE_SNAPSHOT = "OPT_NATIVE_SNAPSHOT";
    public static final String SP_KEY_OPT_THREAD = "optThread";
    public static final String SP_KEY_OPT_WEBVIEW_REMOVE = "optWebviewRemove";
    public static final String SP_KEY_OPT_WEEX2_SNAPSHOT = "OPT_WEEX2_SNAPSHOT";
    public static final String SP_KEY_OPT_WEEX_SNAPSHOT = "OPT_WEEX_SNAPSHOT";
    public static final String SP_KEY_PAGE_EVENT_ENABLE = "PAGE_EVENT_ENABLE";
    public static final String SP_KEY_POP_CENTER_OUT_OF_TIME_HIGH = "POP_CENTER_OUT_OF_TIME_HIGH";
    public static final String SP_KEY_POP_CENTER_OUT_OF_TIME_LOW = "POP_CENTER_OUT_OF_TIME_LOW";
    public static final String SP_KEY_POP_CENTER_OUT_OF_TIME_MIDDLE = "POP_CENTER_OUT_OF_TIME_MIDDLE";
    public static final String SP_KEY_POP_DISPLAY_ENABLE = "POP_DISPLAY_ENABLE";
    public static final String SP_KEY_POP_HUB_CODE_BLACK_LIST = "POP_HUB_CODE_BLACK_LIST";
    public static final String SP_KEY_POP_HUB_CODE_WHITE_LIST = "POP_HUB_CODE_WHITE_LIST";
    public static final String SP_KEY_POP_HUB_TRIGGER_MODE = "POP_HUB_TRIGGER_MODE";
    public static final String SP_KEY_PRE_DEAL_TRIGGER_ENABLE = "PRE_DEAL_TRIGGER_ENABLE";
    public static final String SP_KEY_RECORD_BUCKET_ENABLE = "RECORD_BUCKET_ENABLE";
    public static final String SP_KEY_REQUESTING_FILTER_ENABLE = "REQUESTING_FILTER_ENABLE";
    public static final String SP_KEY_SCENE_FREQ = "sceneFreq";
    public static final String SP_KEY_SEND_SCREEN_CHANGE_EVENT = "SEND_SCREEN_CHANGE_EVENT";
    public static final String SP_KEY_USE_NEW_ACTION_LINE = "USE_NEW_ACTION_LINE";
    public static final String SP_KEY_USE_NEW_MAMA_TYPE = "USE_NEW_MAMA_TYPE";
    public static final String SP_KEY_WATER_MASK_ENABLE = "waterMaskEnable";
    public static final String SP_KEY_WATER_MASK_REQ_GAP = "waterMaskRequestGap";
    public static final String SP_KEY_WEEX2_SNAPSHOT_SCALE = "WEEX2_SNAPSHOT_SCALE";
    public static final String SP_KEY_WEEX_INIT_WAIT_TIME = "WEEX_INIT_WAIT_TIME";
    public static final String SP_KEY_WEEX_INIT_WAIT_TIME_ENABLE = "WEEX_INIT_WAIT_TIME_ENABLE";
    public static final String SP_KEY_WEEX_MODULE_INTERCEPT_ENABLE = "WEEX_MODULE_INTERCEPT_ENABLE";

    /* renamed from: a  reason: collision with root package name */
    private List<String> f22215a = new ArrayList();
    private List<String> b = new CopyOnWriteArrayList();
    private List<String> c = new CopyOnWriteArrayList();
    private TrackConfig d;

    /* renamed from: com.taobao.tbpoplayer.info.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0919a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f22216a;

        static {
            kge.a(-475496931);
            f22216a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2f4d1cf", new Object[0]) : f22216a;
        }
    }

    static {
        kge.a(-2073515702);
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2f4d1cf", new Object[0]) : C0919a.a();
    }

    public SharedPreferences.Editor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("2f094b28", new Object[]{this}) : bzo.f();
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            bzo.a(str, z);
        }
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            bzo.a(str, j);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            bzo.a(str, str2);
        }
    }

    public boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2b494", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        String d = bzo.d(SP_KEY_LM_CONFIG_ORANGE_VERSION);
        com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopConfigLocalManager.updateLocalConfigs.orangeVersion=" + str4 + ".localOrangeVersion=" + d);
        try {
            if (!StringUtils.isEmpty(d) && !StringUtils.isEmpty(str4)) {
                boolean equals = str4.equals(d);
                com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopConfigLocalManager.updateLocalConfigs.orangeVersionSame=" + equals);
                if (equals) {
                    return false;
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.parseOrangeVersionUpdated.error.", th);
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, "");
        bzo.a(str2, config);
        bzo.a(str3, OrangeConfig.getInstance().getConfig(str, str3, ""));
        String[] split = config.split(",");
        for (String str5 : split) {
            bzo.a(str5, OrangeConfig.getInstance().getConfig(str, str5, ""));
        }
        com.alibaba.poplayer.utils.c.a("OrangeConfigManager.updateLMLocalConfigs.done", new Object[0]);
        return true;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : bzo.d(str);
    }

    public List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        List<String> list = this.f22215a;
        if (list != null && !list.isEmpty()) {
            com.alibaba.poplayer.utils.c.a("OrangeConfigManager.getInValidActivities.FromOrange.list=%s.", this.f22215a);
            return this.f22215a;
        }
        List<String> c = bzo.c(SP_KEY_INVALID_ACTIVITY_CONFIG);
        com.alibaba.poplayer.utils.c.a("OrangeConfigManager.getInValidActivities.FromLocalSp.list=%s.", c);
        return new CopyOnWriteArrayList(c);
    }

    public void a(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.f22215a = list;
        if (!z) {
            return;
        }
        bzo.a(SP_KEY_INVALID_ACTIVITY_CONFIG, list);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d = (TrackConfig) JSON.parseObject(com.taobao.tbpoplayer.adapter.b.a().b("appMonitorConfig"), TrackConfig.class);
        TrackConfig trackConfig = this.d;
        if (trackConfig != null && trackConfig.UserTrack != null) {
            this.d.UserTrack.generateHitMap();
        }
        TrackConfig trackConfig2 = this.d;
        if (trackConfig2 == null || trackConfig2.AppMonitor == null) {
            return;
        }
        this.d.AppMonitor.generateHitMap();
        bzz.a(this.d.AppMonitor.useConfigCheckFail);
        bzz.b(this.d.AppMonitor.onePopOnlyResult);
    }

    public boolean a(String str, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b1e2e8", new Object[]{this, str, baseConfigItem})).booleanValue();
        }
        if (baseConfigItem != null && baseConfigItem.forceUpdateUT && (str.equals(com.alibaba.poplayer.utils.c.CATEGORY_WEB_JSBRIDGE) || str.equals(com.alibaba.poplayer.utils.c.CATEGORY_WEEX_JSBRIDGE) || str.equals("pageLifeCycle") || str.equals("containerLifeCycle") || cac.a().a(str))) {
            return true;
        }
        TrackConfig trackConfig = this.d;
        return (trackConfig == null || trackConfig.UserTrack == null || !this.d.UserTrack.enable) ? false : true;
    }

    public boolean a(String str, BaseConfigItem baseConfigItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("658b2c74", new Object[]{this, str, baseConfigItem, new Boolean(z)})).booleanValue();
        }
        if (baseConfigItem != null && baseConfigItem.forceUpdateUT && (str.equals(com.alibaba.poplayer.utils.c.CATEGORY_WEB_JSBRIDGE) || str.equals(com.alibaba.poplayer.utils.c.CATEGORY_WEEX_JSBRIDGE) || str.equals("pageLifeCycle") || str.equals("containerLifeCycle") || cac.a().a(str))) {
            return true;
        }
        TrackConfig trackConfig = this.d;
        return (trackConfig == null || trackConfig.UserTrack == null || !this.d.UserTrack.getCategoryHit(str, z)) ? false : true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        TrackConfig trackConfig = this.d;
        return (trackConfig == null || trackConfig.AppMonitor == null || !this.d.AppMonitor.enable) ? false : true;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        TrackConfig trackConfig = this.d;
        return (trackConfig == null || trackConfig.AppMonitor == null || !this.d.AppMonitor.getCategoryHit(str, false)) ? false : true;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : bzo.e(SP_KEY_DAI_TRIGGER_ENABLE);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : bzo.e(SP_KEY_WEEX_MODULE_INTERCEPT_ENABLE);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : bzo.e(SP_KEY_MTOP_GROUP_ENABLE);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_PRE_DEAL_TRIGGER_ENABLE, true);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_FATIGUE_FILTER_ENABLE, true);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_RECORD_BUCKET_ENABLE, true);
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_PAGE_EVENT_ENABLE, true);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_REQUESTING_FILTER_ENABLE, true);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_NEW_NATIVE_NOTIFICATION_ENABLE, true);
    }

    public long q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46c", new Object[]{this})).longValue() : bzo.b(SP_KEY_WEEX_INIT_WAIT_TIME, (long) Constants.STARTUP_TIME_LEVEL_1);
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : ABGlobal.isFeatureOpened(context, "POPCallWeexInitOpt");
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_INTERCEPT_HOVER, false);
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_USE_NEW_ACTION_LINE, true);
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_ENABLE_LOCAL_CONFIG, true);
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_ENABLE_LOCAL_LM_CONFIG, true);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_ENABLE_CONTEXT_WRAPPER, true);
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_ENABLE_CLEAN_KEEP_DIRECTLY, true);
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_ENABLE_REMOVE_CONFIG_UPDATE_NOTIFY, true);
    }

    public String F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fdc3673", new Object[]{this}) : bzo.d(SP_KEY_CDN_FETCH_CDN_URL);
    }

    public long H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40c20c3", new Object[]{this})).longValue() : bzo.b(SP_KEY_CDN_FETCH_PAGE_SWITCH_TIMES, 5L);
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_FORBID_H5_ACC, true);
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_USE_NEW_MAMA_TYPE, true);
    }

    public long K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4366746", new Object[]{this})).longValue() : bzo.b(SP_KEY_WEEX2_SNAPSHOT_SCALE, 25L);
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_INTERRUPT_DOWN_ACTION, true);
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_OPT_H5_SNAPSHOT, true);
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_OPT_WEEX_SNAPSHOT, true);
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_OPT_WEEX2_SNAPSHOT, true);
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_OPT_NATIVE_SNAPSHOT, true);
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_SEND_SCREEN_CHANGE_EVENT, true);
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_NATIVE_POP_RE_RENDER_ON_SCREEN_CHANGE, true);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_CONFIG_BY_CON, true);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_CONFIG_LOCAL_OPT, true);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : (int) bzo.b(SP_KEY_POP_HUB_TRIGGER_MODE, 0L);
    }

    public List<String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c435452e", new Object[]{this});
        }
        List<String> list = this.b;
        if (list != null && !list.isEmpty()) {
            com.alibaba.poplayer.utils.c.a("OrangeConfigManager.getCodeWhiteList.FromOrange.list=%s.", this.b);
            return this.b;
        }
        List<String> c = bzo.c(SP_KEY_POP_HUB_CODE_WHITE_LIST);
        com.alibaba.poplayer.utils.c.a("OrangeConfigManager.getCodeWhiteList.FromLocalSp.list=%s.", c);
        return new CopyOnWriteArrayList(c);
    }

    public void b(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0266f3a", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.b = list;
        if (!z) {
            return;
        }
        bzo.a(SP_KEY_POP_HUB_CODE_WHITE_LIST, list);
    }

    public List<String> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("143f826", new Object[]{this});
        }
        List<String> list = this.c;
        if (list != null && !list.isEmpty()) {
            com.alibaba.poplayer.utils.c.a("OrangeConfigManager.getCodeBlackList.FromOrange.list=%s.", this.c);
            return this.c;
        }
        List<String> c = bzo.c(SP_KEY_POP_HUB_CODE_BLACK_LIST);
        com.alibaba.poplayer.utils.c.a("OrangeConfigManager.getCodeBlackList.FromLocalSp.list=%s.", c);
        return new CopyOnWriteArrayList(c);
    }

    public void c(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ac29d9", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.c = list;
        if (!z) {
            return;
        }
        bzo.a(SP_KEY_POP_HUB_CODE_BLACK_LIST, list);
    }

    public long w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27172", new Object[]{this})).longValue() : bzo.b(SP_KEY_POP_CENTER_OUT_OF_TIME_LOW, 1000L);
    }

    public long B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bd", new Object[]{this})).longValue() : bzo.b(SP_KEY_POP_CENTER_OUT_OF_TIME_MIDDLE, 800L);
    }

    public long G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3fe0942", new Object[]{this})).longValue() : bzo.b(SP_KEY_POP_CENTER_OUT_OF_TIME_HIGH, 500L);
    }

    public String T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("db2c6b25", new Object[]{this}) : bzo.d(SP_KEY_SCENE_FREQ);
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_OPT_WEBVIEW_REMOVE, true);
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : bzo.b(SP_KEY_WATER_MASK_ENABLE, false);
    }

    public long V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d169d1", new Object[]{this})).longValue() : bzo.b(SP_KEY_WATER_MASK_REQ_GAP, 86400000L);
    }

    public String S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a6b086", new Object[]{this}) : bzo.d(SP_KEY_AUTO_SIZE_ASPECT);
    }
}
