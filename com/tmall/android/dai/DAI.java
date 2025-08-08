package com.tmall.android.dai;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoSpanLayer;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import com.taobao.mrt.utils.a;
import com.tmall.android.dai.DAIConfiguration;
import com.tmall.android.dai.adapter.DAIUserAdapter;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.compute.ServiceListener;
import com.tmall.android.dai.internal.compute.b;
import com.tmall.android.dai.internal.featurecenter.FeatureCenterImpl;
import com.tmall.android.dai.internal.init.WalleInitBridgeJava;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamListener;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamSource;
import com.tmall.android.dai.internal.util.DeviceInfos;
import com.tmall.android.dai.internal.windvane.WVDaiApiPlugin;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import org.tensorflow.contrib.tmall.task.TaskManager;
import tb.gsf;
import tb.huk;
import tb.ihq;
import tb.kge;
import tb.ktk;
import tb.riq;
import tb.rkq;
import tb.rkr;
import tb.rks;
import tb.rku;
import tb.rkw;
import tb.rkx;
import tb.rky;
import tb.rkz;
import tb.rla;
import tb.rlb;
import tb.rlc;
import tb.rle;
import tb.rlf;
import tb.rlg;

/* loaded from: classes9.dex */
public final class DAI {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_COMPUTE_COMPLETE = "com.tmall.android.dai.intent.action.COMPUTE_COMPLETE";
    public static final String ACTION_INITIALIZE_COMPLETE = "com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE";
    public static final String EXTRA_MODEL_NAME = "com.tmall.android.dai.intent.extra.MODEL_NAME";
    public static final String EXTRA_OUTPUT_DATA = "com.tmall.android.dai.intent.extra.OUTPUT_DATA";
    public static final String EXTRA_RESULT = "com.tmall.android.dai.intent.extra.RESULT";
    private static final String ODCP_SERVICEID = "ODCP";
    public static final int SDK_VERSION_CODE = 2;
    private static final String TAG = "DAI";
    public static final String WALLE_DOWNLOAD_ONLY = "__walle_inner_only_download";
    public static final String WALLE_INNER_EXTEND_ARGS = "__walle_inner_extend_args";
    public static final String WALLE_RESOURCE_DOWNLOAD = "com.alibaba.walle.resource_download";
    private static volatile boolean available;
    public static final HashMap<String, String> debugStatusMap;
    private static Boolean degrade32Runtime;
    private static final Map<Object, String> mAliasTriIdMap;
    private static ConcurrentHashMap<Object, String> mFeatureCenterTaskMap;
    public static volatile boolean mInit;
    private static final Map<Object, String> mKeyNameMap;
    private static final Map<String, String> mSceneModelNameMap;

    public static JSONObject convertMrtTaskDescription(MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("665dc5f0", new Object[]{mRTTaskDescription});
        }
        return null;
    }

    static {
        kge.a(338849076);
        debugStatusMap = new HashMap<>();
        mSceneModelNameMap = new HashMap();
        mKeyNameMap = new HashMap();
        mAliasTriIdMap = new HashMap();
        mFeatureCenterTaskMap = new ConcurrentHashMap<>();
        available = false;
        degrade32Runtime = null;
        mInit = false;
    }

    private DAI() {
    }

    public static DAIConfiguration.Builder newConfigurationBuilder(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DAIConfiguration.Builder) ipChange.ipc$dispatch("28718470", new Object[]{context}) : new DAIConfiguration.Builder(context);
    }

    public static boolean isAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue() : available && rkq.d().h();
    }

    public static boolean is64Runtime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1ae6ddb", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return Process.is64Bit();
    }

    public static boolean osSupport64() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cfcf954", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 21 && Build.SUPPORTED_64_BIT_ABIS.length > 0;
    }

    public static boolean check32RuntimeDegrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5679050", new Object[0])).booleanValue();
        }
        Boolean bool = degrade32Runtime;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!is64Runtime() && !com.tmall.android.dai.internal.config.d.a().i()) {
            Boolean bool2 = Boolean.TRUE;
            degrade32Runtime = bool2;
            return bool2.booleanValue();
        }
        Boolean bool3 = Boolean.FALSE;
        degrade32Runtime = bool3;
        return bool3.booleanValue();
    }

    public static synchronized void initialize(Context context, DAIConfiguration dAIConfiguration) {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50dcb2de", new Object[]{context, dAIConfiguration});
                return;
            }
            a.a(TAG, "Walle DAI.initialize called");
            com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init", null, null, null);
            if (Build.VERSION.SDK_INT <= 20) {
                a.d(TAG, "4.x ,walle degrade !!");
                com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "4.x", null, null);
            } else if (context == null) {
                com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "context", null, null);
                a.d(TAG, "context is null,initialize failed");
            } else if (dAIConfiguration == null) {
                com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.ARRAY_KEY_CONFIGURATION, null, null);
                a.d(TAG, "configuration is null,initialize failed");
            } else {
                rkq.d().a(context);
                com.tmall.android.dai.internal.config.d.a().a(context);
                if (!com.tmall.android.dai.internal.config.d.a().d()) {
                    rkq.d().d(true);
                    a.d(TAG, "Orange开关未开，Walle降级");
                    com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "orange", null, null);
                } else if (com.tmall.android.dai.internal.config.d.a().k()) {
                    rkq.d().d(true);
                    a.d(TAG, "[WalleInit] lowDeviceDowngradeAll, Walle disabled!!!");
                    com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "low_device_downgrade", null, null);
                } else {
                    if (check32RuntimeDegrade()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("support_64", String.valueOf(osSupport64()));
                        hashMap.put("sdk_version", String.valueOf(Build.VERSION.SDK_INT));
                        com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "degrade_32_bit", null, hashMap);
                    }
                    rkq.d().a(dAIConfiguration);
                    if (dAIConfiguration.getUserAdapterClass() != null) {
                        rkr.a(dAIConfiguration.getUserAdapterClass());
                    } else if (dAIConfiguration.getUserAdapter() != null) {
                        rkr.a(dAIConfiguration.getUserAdapter());
                    } else {
                        a.c(TAG, "UserAdapter is null!");
                        rkq.d().d(true);
                        com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "user adapter", null, null);
                        return;
                    }
                    if (loadBaseLib() != 1) {
                        com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "load so", null, null);
                        return;
                    }
                    if (com.tmall.android.dai.internal.config.d.a().e()) {
                        a.c(TAG, "[WalleInit] Walle init rollbacked");
                        if (initialNativeTaskHandle() == -2) {
                            return;
                        }
                        if (initialNativeData() == -2) {
                            return;
                        }
                        mInit = true;
                        DAIUserAdapter a2 = rkr.a();
                        if (a2 != null) {
                            ktk.a(rkq.d().e(), a2.getTtid());
                            debugStatusMap.put("progress", "HighwayClientInit");
                        } else {
                            a.c(TAG, "highway client not init!");
                            com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "highway client", null, null);
                        }
                        initStreamProcessing();
                        debugStatusMap.put("progress", "BaseConfigCheck");
                        rkq.d().n().a();
                        a.a(TAG, "[WalleInit] rollbacked Walle init finished");
                        com.tmall.android.dai.internal.util.a.a(TAG, 19999, "WalleInit", "rollbacked Walle init finished", null, null);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("deviceLevel", com.tmall.android.dai.internal.util.c.a());
                        com.tmall.android.dai.internal.util.a.a(TAG, 19999, "device_coverage", null, null, hashMap2);
                    } else {
                        com.tmall.android.dai.internal.init.a.a().b();
                        com.tmall.android.dai.internal.init.a.a().f23695a.execute($$Lambda$DAI$OazlLCeNNuu0xwNHjpuyGu4r5fM.INSTANCE);
                    }
                    mInit = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$initialize$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b64de0", new Object[0]);
            return;
        }
        initFinishedBroadcast();
        a.a(TAG, "[WalleInit] refactored Walle init finished");
        com.tmall.android.dai.internal.util.a.a(TAG, 19999, "WalleInit", "refactored Walle init finished", null, null);
        HashMap hashMap = new HashMap();
        hashMap.put("deviceLevel", com.tmall.android.dai.internal.util.c.a());
        com.tmall.android.dai.internal.util.a.a(TAG, 19999, "device_coverage", null, null, hashMap);
    }

    public static void onBasicConfigUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb97d561", new Object[0]);
            return;
        }
        Context e = rkq.d().e();
        try {
            if (huk.a()) {
                a.b(TAG, "MNNBridge load success");
            } else {
                a.d(TAG, "MNNBridge load fail");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        debugStatusMap.put("progress", "MNNPyBridgeLoaded");
        try {
            debugStatusMap.put("UserTrackPlugin", "tryRegister");
            com.ut.mini.module.plugin.d.getInstance().registerPlugin(new com.tmall.android.dai.internal.usertrack.c());
            debugStatusMap.put("UserTrackPlugin", "registerSuccess");
            try {
                riq.a(e);
            } catch (Throwable th2) {
                a.b(TAG, "WADataCollector初始化失败.", th2);
            }
            try {
                q.a("WVDAIHandler", (Class<? extends android.taobao.windvane.jsbridge.e>) WVDaiApiPlugin.class);
            } catch (Throwable th3) {
                a.b(TAG, "WV插件注册失败。", th3);
            }
            debugStatusMap.put("UserTrackPlugin", "WVRegistered");
            com.tmall.android.dai.internal.util.a.a(FalcoSpanLayer.BUSINESS, "initialize");
            HashMap hashMap = new HashMap();
            hashMap.put("deviceLevel", com.tmall.android.dai.internal.util.c.a());
            com.tmall.android.dai.internal.util.a.a(TAG, 19999, "device_coverage", null, null, hashMap);
            com.taobao.mrt.c.a(e);
            g.a().a(com.tmall.android.dai.internal.config.d.a().g(), com.tmall.android.dai.internal.config.d.a().h(), ODCP_SERVICEID);
            initFeatureCenter();
            debugStatusMap.put("progress", "FeatureCenterInited");
            available = true;
            try {
                com.taobao.android.jarviswe.a.a().a(e.getApplicationContext());
                Intent intent = new Intent("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE");
                intent.setPackage(rkq.d().e().getPackageName());
                rkq.d().e().sendBroadcast(intent);
            } catch (Throwable th4) {
                a.b(TAG, th4.getMessage(), th4);
            }
            rku.a().b();
        } catch (Throwable th5) {
            debugStatusMap.put("UserTrackPlugin", "registerFailed");
            a.c(TAG, "UT插件注册失败。", th5);
            initializeFailure(97, th5.getMessage());
            com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "ut plugin", null, null);
        }
    }

    public static int loadNativeDBBeforeStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("834fbc2", new Object[0])).intValue();
        }
        try {
            Integer num = (Integer) com.tmall.android.dai.internal.init.a.a().f23695a.submit($$Lambda$DAI$Bfoh48iK19wA0kf5KMqK0XVelP0.INSTANCE).get();
            a.b(TAG, "[WalleInit] loadNativeDBBeforeStart finished, return " + num);
            return num.intValue();
        } catch (Exception e) {
            a.b(TAG, "[WalleInit] loadNativeDBBeforeStartInner exception", e);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer loadNativeDBBeforeStartInner() {
        int loadBaseLib;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2ee6b95c", new Object[0]);
        }
        if (rkq.d().a()) {
            return 1;
        }
        com.tmall.android.dai.internal.config.d.a().a(riq.c().b());
        if (com.tmall.android.dai.internal.config.d.a().d() && !com.tmall.android.dai.internal.config.d.a().k() && (loadBaseLib = loadBaseLib()) == 1 && WalleInitBridgeJava.a().b()) {
            WalleInitBridgeJava.a().d();
            return Integer.valueOf(loadBaseLib);
        }
        return -1;
    }

    public static synchronized int loadBaseLib() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2f24c7a8", new Object[0])).intValue();
            } else if (rkq.d().c()) {
                a.b(TAG, "so is inited");
                return 1;
            } else {
                a.b(TAG, "loadBaseLib");
                Context e = rkq.d().e();
                if (e == null) {
                    e = riq.c().b();
                }
                if (e != null) {
                    AliNNPython.initialize(rkq.d().e());
                    AliNNPython.nativeRedirectStdioToLogCat();
                    a.b(TAG, "call python initialize()");
                } else if (!AliNNPython.isNewPythonEngine()) {
                    a.b(TAG, "python not load, context is null");
                    return -2;
                }
                a.b(TAG, "AliNNPython.isNewPythonEngine():" + AliNNPython.isNewPythonEngine());
                if (!AliNNPython.nativeAvailable()) {
                    a.d(TAG, "python not load failed2");
                    return -2;
                } else if (!ihq.a().c("walle_base").g()) {
                    return -3;
                } else {
                    a.b(TAG, "加载libwalle_base.so成功");
                    rkq.d().c(true);
                    return 1;
                }
            }
        }
    }

    public static synchronized int initialNativeTaskHandle() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d293762", new Object[0])).intValue();
            } else if (rkq.d().b()) {
                return 1;
            } else {
                a.b(TAG, "initialNativeTaskHandle start");
                TaskManager.getInstance().addListener(new ServiceListener());
                b.a().a(8, new rlf());
                b.a().a(9, new rlg());
                b.a().a(11, new rkx(rkq.d().e()));
                b.a().a(12, new rkz());
                b.a().a(13, new rky());
                b.a().a(17, new rla());
                b.a().a(18, new rlb());
                b.a().a(19, new rkw());
                b.a().a(20, $$Lambda$DAI$avbDj3RuqWN3oPB0VjPfLjvo6p0.INSTANCE);
                b.a().a(22, new rlc());
                b.a().a(24, new rle());
                if (!com.tmall.android.dai.internal.config.d.a().c()) {
                    a.b(TAG, "initialNativeTaskHandle onNativeInit");
                    TaskManager.getInstance().onNativeInit();
                }
                boolean equals = "true".equals(DAIKVStoreage.getValue("JARVIS", "featureUploadAllSwitch"));
                ktk.a(equals);
                TaskManager.getInstance().initializeMonitor(equals);
                a.b(TAG, "initialNativeTaskHandle addTaskInner success");
                rkq.d().b(true);
                a.b(TAG, "initialNativeTaskHandle success");
                return 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Map lambda$initialNativeTaskHandle$1(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("637c7dfb", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_match, String.valueOf(gsf.a((String) map.get("crowd_ids"))));
        return hashMap;
    }

    public static synchronized int initialNativeData() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc8f58bf", new Object[0])).intValue();
            } else if (rkq.d().a()) {
                return 1;
            } else {
                DbManager.getInstance().initIfNeeded();
                a.b(TAG, "initialNativeData success");
                rkq.d().a(true);
                return 1;
            }
        }
    }

    public static void initFeatureCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1f56c2", new Object[0]);
        } else {
            com.taobao.android.jarviswe.a.a().d().execute(new Runnable() { // from class: com.tmall.android.dai.DAI.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DAI.initFeatureCenterInner();
                    }
                }
            });
        }
    }

    public static int initFeatureCenterInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79df3255", new Object[0])).intValue();
        }
        try {
            com.tmall.android.dai.internal.util.a.a("walle_feature_center", "feature_query", MeasureSet.create().addMeasure("feature_size"), DimensionSet.create().addDimension("feature_name").addDimension("task_name").addDimension("trigger_id"));
            FeatureCenterImpl.a();
            a.b(TAG, "initFeatureCenter success");
            return 1;
        } catch (Throwable th) {
            a.b(TAG, "initFeatureCenter.", th);
            initializeFailure(181, th.getMessage());
            com.tmall.android.dai.internal.util.a.a(TAG, 19999, "init_error", "java-c-data bridge", null, null);
            return -2;
        }
    }

    private static int initStreamProcessing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51585edd", new Object[0])).intValue();
        }
        if (!com.tmall.android.dai.internal.config.d.a().b()) {
            return -2;
        }
        DeviceInfos.b();
        WalleStreamListener.getInstance().registerCallbackToStreamConstructor();
        WalleStreamSource.getInstance();
        com.tmall.android.dai.internal.streamprocessing.a.a().b();
        return 1;
    }

    private static void initFinishedBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da121246", new Object[0]);
            return;
        }
        available = true;
        try {
            Intent intent = new Intent("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE");
            intent.setPackage(rkq.d().e().getPackageName());
            rkq.d().e().sendBroadcast(intent);
        } catch (Throwable th) {
            a.b(TAG, th.getMessage(), th);
        }
        rku.a().b();
    }

    private static void initializeFailure(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19f790c", new Object[]{new Integer(i), str});
            return;
        }
        com.tmall.android.dai.internal.util.a.a(FalcoSpanLayer.BUSINESS, "initialize", String.valueOf(i), str);
        rkq.d().d(true);
    }

    public static int registerModel(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("283374e4", new Object[]{aVar})).intValue();
        }
        if (aVar == null) {
            a.d(TAG, "[registerModel] modelConfigMapdaiModel");
            return -1;
        }
        if (aVar.c != null) {
            mSceneModelNameMap.put(aVar.c, aVar.b());
        }
        if (!StringUtils.isEmpty(aVar.f23718a)) {
            mKeyNameMap.put(aVar.f23718a, aVar.b());
            mAliasTriIdMap.put(aVar.f23718a, aVar.g);
            if (!StringUtils.isEmpty(aVar.a())) {
                mFeatureCenterTaskMap.put(aVar.f23718a, aVar.g);
            }
        }
        registerDAIModelInner(aVar);
        return 0;
    }

    public static void registerDAIModelInner(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddd7dc1", new Object[]{aVar});
            return;
        }
        e.a(aVar.b(), true, "");
        rkq.d().m().a(aVar);
        g.a().a(com.tmall.android.dai.internal.config.f.a(aVar));
    }

    public static void unregisterModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cd0f1e", new Object[]{str});
        } else if (str == null) {
        } else {
            a.e(TAG, "unregister model: " + str);
            rkq.d().m().b(str);
            e.a(str, "");
        }
    }

    @Deprecated
    public static Collection<com.tmall.android.dai.model.a> getRegisteredModels() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("a44f35de", new Object[0]) : rkq.d().m().a();
    }

    public static com.tmall.android.dai.model.a getRegisteredModel(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.tmall.android.dai.model.a) ipChange.ipc$dispatch("88b15930", new Object[]{str}) : rkq.d().m().c(str);
    }

    public static com.tmall.android.dai.model.a getRegisteredModelForSceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.a) ipChange.ipc$dispatch("ade8d73e", new Object[]{str});
        }
        String str2 = mSceneModelNameMap.get(str);
        if (str2 == null) {
            return null;
        }
        return getRegisteredModel(str2);
    }

    public static com.tmall.android.dai.model.a getRegisteredModelForAlias(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.a) ipChange.ipc$dispatch("fff655d7", new Object[]{str});
        }
        if (mFeatureCenterTaskMap.contains(str)) {
            str2 = mFeatureCenterTaskMap.get(str);
        } else {
            str2 = mKeyNameMap.get(str);
        }
        return rkq.d().m().c(str2);
    }

    @Deprecated
    public static void runCompute(String str, Map<String, Object> map, DAICallback dAICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e2720", new Object[]{str, map, dAICallback});
        } else {
            runComputeWithTriId(str, map, dAICallback, null);
        }
    }

    public static void runComputeWithTriId(String str, Map<String, Object> map, DAICallback dAICallback, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4870f2", new Object[]{str, map, dAICallback, str2});
            return;
        }
        try {
            if (rkr.a() != null) {
                rkq.d().m().a(str, map, DAIComputeService.TaskPriority.NORMAL, dAICallback, str2);
            } else if (dAICallback == null) {
            } else {
                dAICallback.onError(new DAIError(83));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void runComputeByAlias(String str, Map<String, Object> map, DAICallback dAICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29316e61", new Object[]{str, map, dAICallback});
        } else {
            runComputeByAliasWithTriId(str, map, dAICallback, null);
        }
    }

    public static void runComputeByAliasWithTriId(String str, Map<String, Object> map, DAICallback dAICallback, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6693a911", new Object[]{str, map, dAICallback, str2});
            return;
        }
        try {
            String str3 = mFeatureCenterTaskMap.get(str);
            if (StringUtils.isEmpty(str3)) {
                str3 = mKeyNameMap.get(str);
            }
            if (StringUtils.isEmpty(str3)) {
                if (dAICallback != null) {
                    dAICallback.onError(new DAIError(209, "model not register"));
                }
                a.b(TAG, "cannot found modelName,modelAlias:" + str);
                return;
            }
            if (str2 == null) {
                str2 = mAliasTriIdMap.get(str);
            }
            runComputeWithTriId(str3, map, dAICallback, str2);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public static void runCompute(String str, Map<String, Object> map, DAICallback dAICallback, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c9065", new Object[]{str, map, dAICallback, map2});
        } else {
            runComputeWithTriId(str, map, dAICallback, map2, (String) null);
        }
    }

    public static void runComputeWithTriId(String str, Map<String, Object> map, DAICallback dAICallback, Map<String, Object> map2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386b91e7", new Object[]{str, map, dAICallback, map2, str2});
            return;
        }
        if (map2 != null) {
            if (map == null) {
                try {
                    map = new HashMap<>();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            map.put(WALLE_INNER_EXTEND_ARGS, map2);
        }
        runComputeWithTriId(str, map, dAICallback, str2);
    }

    public static void runCompute(String str, Map<String, Object> map, c cVar, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82129137", new Object[]{str, map, cVar, map2});
        } else {
            runComputeWithTriId(str, map, cVar, map2, (String) null);
        }
    }

    public static void runComputeWithTriId(String str, Map<String, Object> map, c cVar, Map<String, Object> map2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620b9839", new Object[]{str, map, cVar, map2, str2});
            return;
        }
        try {
            if (rkr.a() != null) {
                rks rksVar = null;
                if (cVar != null) {
                    rksVar = new rks(str, map, cVar);
                }
                runComputeWithTriId(str, map, rksVar, map2, str2);
            } else if (cVar == null) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("code", 0);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", str);
                hashMap2.put("input", map);
                hashMap.put("model", hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("code", 83);
                hashMap.put("error", hashMap3);
                cVar.a(false, hashMap);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void runComputeByAliasWithTriId(String str, Map<String, Object> map, c cVar, Map<String, Object> map2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e99b7a", new Object[]{str, map, cVar, map2, str2});
            return;
        }
        try {
            String str3 = mKeyNameMap.get(str);
            if (StringUtils.isEmpty(str3)) {
                if (cVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", 0);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", str3);
                    hashMap2.put("input", map);
                    hashMap.put("model", hashMap2);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("code", 209);
                    hashMap.put("error", hashMap3);
                    cVar.a(false, hashMap);
                }
                a.b(TAG, "cannot found modelName,modelAlias:" + str);
                return;
            }
            runComputeWithTriId(str3, map, cVar, map2, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Deprecated
    public static void runComputeByAlias(String str, Map<String, Object> map, c cVar, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5feaa96", new Object[]{str, map, cVar, map2});
        } else {
            runComputeByAliasWithTriId(str, map, cVar, map2, null);
        }
    }

    public static final synchronized Map<String, Object> getStatusInfo() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7c7374b2", new Object[0]);
            }
            return e.a();
        }
    }
}
