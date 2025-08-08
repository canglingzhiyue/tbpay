package mtopsdk.mtop.intf;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import anetwork.network.cache.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.remotebusiness.login.c;
import com.taobao.tao.remotebusiness.login.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.global.init.IExtendMtopInitTask;
import mtopsdk.mtop.global.init.IMtopInitTask;
import mtopsdk.mtop.global.init.MtopInitTaskFactory;
import mtopsdk.mtop.network.NetworkPropertyService;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.xstate.a;
import tb.kge;
import tb.orq;

/* loaded from: classes.dex */
public class Mtop {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_PROCESS_NAME = "com.taobao.taobao:channel";
    public static final String MAIN_PROCESS_NAME = "com.taobao.taobao";
    private static final int MAX_PREFETCH_LENGTH = 50;
    private static final String MTOP_ID_ELEME = "MTOP_ID_ELEME";
    private static final String MTOP_ID_INNER = "INNER";
    private static final String MTOP_ID_KOUBEI = "MTOP_ID_KOUBEI";
    public static final String MTOP_ID_TAOBAO = "MTOP_ID_TAOBAO";
    private static final String MTOP_ID_XIANYU = "MTOP_ID_XIANYU";
    private static final String MTOP_SITE_ELEME = "eleme";
    private static final String MTOP_SITE_INNER = "taobao";
    private static final String MTOP_SITE_KOUBEI = "koubei";
    private static final String MTOP_SITE_XIANYU = "xianyu";
    private static final String TAG = "mtopsdk.Mtop";
    public static final String WIDGET_PROCESS_NAME = "com.taobao.taobao:widget";
    public static final String XIAOMI_WIDGET_PROCESS_NAME = "com.taobao.taobao:widgetProvider";
    public static final Map<String, Mtop> instanceMap;
    public static boolean mIsFullTrackValid;
    public final byte[] initLock;
    public final IMtopInitTask initTask;
    private final String instanceId;
    private volatile boolean isInit;
    public volatile boolean isInited;
    public volatile boolean isLaunchFirstFrame;
    public volatile boolean isSignDegradeInited;
    public volatile long lastPrefetchResponseTime;
    public final byte[] launchOptLock;
    public final MtopConfig mtopConfig;
    private Map<String, MtopBuilder> prefetchBuilderMap;
    public final byte[] signDegradeInitLock;
    private int type;

    /* renamed from: mtopsdk.mtop.intf.Mtop$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum = new int[EnvModeEnum.values().length];

        static {
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface Id {
        public static final String CUTE = "CUTE";
        public static final String INNER = "INNER";
        public static final String OPEN = "OPEN";
        public static final String PRODUCT = "PRODUCT";
        public static final String SSR = "SSR";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes9.dex */
    public interface Site {
        public static final String ELEME = "eleme";
        public static final String TAOBAO = "taobao";
        public static final String XIANYU = "xianyu";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes9.dex */
    public interface Type {
        public static final int CUTE = 3;
        public static final int INNER = 0;
        public static final int OPEN = 1;
        public static final int PRODUCT = 2;
        public static final int SSR = 4;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    public static /* synthetic */ void access$000(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36433310", new Object[]{mtop});
        } else {
            mtop.executeCoreTask();
        }
    }

    public static /* synthetic */ boolean access$100(Mtop mtop) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b2bfb55", new Object[]{mtop})).booleanValue() : mtop.checkLaunchFirstFrame();
    }

    public static /* synthetic */ String access$200(Mtop mtop) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce16874e", new Object[]{mtop}) : mtop.instanceId;
    }

    static {
        kge.a(-1419282090);
        mIsFullTrackValid = false;
        instanceMap = new ConcurrentHashMap();
    }

    private Mtop(String str, MtopConfig mtopConfig) {
        this.prefetchBuilderMap = new ConcurrentHashMap();
        this.lastPrefetchResponseTime = System.currentTimeMillis();
        this.isInit = false;
        this.isInited = false;
        this.isSignDegradeInited = false;
        this.initLock = new byte[0];
        this.signDegradeInitLock = new byte[0];
        this.launchOptLock = new byte[0];
        this.isLaunchFirstFrame = false;
        this.type = 0;
        this.instanceId = str;
        this.mtopConfig = mtopConfig;
        this.initTask = MtopInitTaskFactory.getMtopInitTask(str, this.type);
        if (this.initTask == null) {
            throw new RuntimeException("IMtopInitTask is null,instanceId=" + str);
        }
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            Class.forName("com.taobao.analysis.scene.SceneIdentifier");
            Class.forName("com.taobao.analysis.abtest.ABTestCenter");
            Class.forName("com.taobao.analysis.v3.FalcoGlobalTracer");
            mIsFullTrackValid = true;
        } catch (Throwable unused) {
            mIsFullTrackValid = false;
        }
    }

    @Deprecated
    public static Mtop instance(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("57c06ec3", new Object[]{context}) : instance(null, context, null);
    }

    @Deprecated
    public static Mtop instance(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("d87e94b9", new Object[]{context, str}) : instance(null, context, str);
    }

    public static Mtop instance(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("c02b2d8d", new Object[]{str, context}) : instance(str, context, null);
    }

    private static void channelLazyConfig(Context context, Mtop mtop) {
        if (!SwitchConfig.getInstance().getEnableChannelLazy() || !"com.taobao.taobao:channel".equals(MtopUtils.getCurrentProcessName(context))) {
            return;
        }
        String instanceId = mtop.getInstanceId();
        if ("INNER".equals(instanceId)) {
            MtopAccountSiteUtils.bindInstanceId("INNER", "taobao");
            return;
        }
        String str = MTOP_ID_ELEME;
        String str2 = "";
        if (str.equals(instanceId)) {
            str2 = "eleme";
        } else if (MTOP_ID_XIANYU.equals(instanceId)) {
            str2 = "xianyu";
            str = MTOP_ID_XIANYU;
        } else if (MTOP_ID_KOUBEI.equals(instanceId)) {
            str2 = MTOP_SITE_KOUBEI;
            str = MTOP_ID_KOUBEI;
        } else {
            str = str2;
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return;
        }
        MtopAccountSiteUtils.bindInstanceId(str, str2);
        try {
            h.a(mtop, (c) Class.forName("com.ali.user.open.mtop.UccRemoteLogin").getMethod("getUccLoginImplWithSite", String.class).invoke(null, str2));
        } catch (ClassNotFoundException e) {
            TBSdkLog.e(TAG, e.toString());
        } catch (IllegalAccessException e2) {
            TBSdkLog.e(TAG, e2.toString());
        } catch (NoSuchMethodException e3) {
            TBSdkLog.e(TAG, e3.toString());
        } catch (InvocationTargetException e4) {
            TBSdkLog.e(TAG, e4.toString());
        }
    }

    public static Mtop instance(String str, Context context, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("7766f503", new Object[]{str, context, str2});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        Mtop mtop = instanceMap.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                mtop = instanceMap.get(str);
                if (mtop == null) {
                    MtopConfig mtopConfig = MtopSetting.mtopConfigMap.get(str);
                    if (mtopConfig == null) {
                        mtopConfig = new MtopConfig(str);
                    }
                    Mtop mtop2 = new Mtop(str, mtopConfig);
                    mtopConfig.mtopInstance = mtop2;
                    instanceMap.put(str, mtop2);
                    channelLazyConfig(context, mtop2);
                    mtop = mtop2;
                }
            }
        }
        if (!mtop.isInit) {
            mtop.init(context, str2);
        }
        return mtop;
    }

    private Mtop(String str, int i, MtopConfig mtopConfig) {
        this.prefetchBuilderMap = new ConcurrentHashMap();
        this.lastPrefetchResponseTime = System.currentTimeMillis();
        this.isInit = false;
        this.isInited = false;
        this.isSignDegradeInited = false;
        this.initLock = new byte[0];
        this.signDegradeInitLock = new byte[0];
        this.launchOptLock = new byte[0];
        this.isLaunchFirstFrame = false;
        this.type = 0;
        this.instanceId = str;
        this.mtopConfig = mtopConfig;
        this.type = i;
        this.initTask = MtopInitTaskFactory.getMtopInitTask(str, i);
        if (this.initTask == null) {
            throw new RuntimeException("IMtopInitTask is null,instanceId=" + str);
        }
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            Class.forName("com.taobao.analysis.scene.SceneIdentifier");
            Class.forName("com.taobao.analysis.abtest.ABTestCenter");
            Class.forName("com.taobao.analysis.v3.FalcoGlobalTracer");
            mIsFullTrackValid = true;
        } catch (Throwable unused) {
            mIsFullTrackValid = false;
        }
    }

    public static Mtop instance(String str, Context context, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("c09720f8", new Object[]{str, context, str2, new Integer(i)});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        Mtop mtop = instanceMap.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                mtop = instanceMap.get(str);
                if (mtop == null) {
                    MtopConfig mtopConfig = MtopSetting.mtopConfigMap.get(str);
                    if (mtopConfig == null) {
                        mtopConfig = new MtopConfig(str);
                    }
                    Mtop mtop2 = new Mtop(str, i, mtopConfig);
                    mtopConfig.mtopInstance = mtop2;
                    instanceMap.put(str, mtop2);
                    channelLazyConfig(context, mtop2);
                    mtop = mtop2;
                }
            }
        }
        if (!mtop.isInit) {
            mtop.init(context, str2);
        }
        return mtop;
    }

    public static Mtop instance(String str, Context context, String str2, int i, MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("2cb18455", new Object[]{str, context, str2, new Integer(i), mtopConfig});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        Mtop mtop = instanceMap.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                mtop = instanceMap.get(str);
                if (mtop == null) {
                    MtopConfig mtopConfig2 = MtopSetting.mtopConfigMap.get(str);
                    if (mtopConfig2 != null) {
                        mtopConfig = mtopConfig2;
                    } else if (mtopConfig == null) {
                        mtopConfig = new MtopConfig(str);
                    }
                    mtop = new Mtop(str, i, mtopConfig);
                    mtopConfig.mtopInstance = mtop;
                    instanceMap.put(str, mtop);
                    channelLazyConfig(context, mtop);
                }
            }
        }
        if (!mtop.isInit) {
            mtop.init(context, str2);
        }
        return mtop;
    }

    public static Mtop getInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("56dd1313", new Object[]{str}) : getMtopInstance(str);
    }

    @Deprecated
    public static Mtop getMtopInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("c7b26d2b", new Object[]{str});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        return instanceMap.get(str);
    }

    public static Mtop getInstanceWithAccountSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("4df1973b", new Object[]{str});
        }
        String instanceId = MtopAccountSiteUtils.getInstanceId(str);
        if (!StringUtils.isBlank(instanceId)) {
            return getMtopInstance(instanceId);
        }
        return null;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this}) : this.instanceId;
    }

    public MtopConfig getMtopConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopConfig) ipChange.ipc$dispatch("9e59e092", new Object[]{this}) : this.mtopConfig;
    }

    private synchronized void init(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{this, context, str});
        } else if (this.isInit) {
        } else {
            if (context == null) {
                TBSdkLog.e(TAG, this.instanceId + " [init] The Parameter context can not be null.");
                return;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, this.instanceId + " [init] context=" + context + ", ttid=" + str);
            }
            this.mtopConfig.context = context.getApplicationContext();
            if (StringUtils.isNotBlank(str)) {
                this.mtopConfig.ttid = str;
            }
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.Mtop.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        synchronized (Mtop.this.initLock) {
                            long currentTimeMillis = System.currentTimeMillis();
                            Mtop.access$000(Mtop.this);
                            Mtop.access$100(Mtop.this);
                            if (Mtop.this.initTask instanceof IExtendMtopInitTask) {
                                ((IExtendMtopInitTask) Mtop.this.initTask).executeSignTask(Mtop.this.mtopConfig);
                            }
                            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.Mtop.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        Mtop.this.initTask.executeExtraTask(Mtop.this.mtopConfig);
                                    } catch (Throwable th) {
                                        TBSdkLog.e(Mtop.TAG, Mtop.access$200(Mtop.this) + " [init] executeExtraTask error.", th);
                                    }
                                }
                            });
                            TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [init]do executeAllTask cost[ms]: " + (System.currentTimeMillis() - currentTimeMillis));
                            Mtop.this.isInited = true;
                            Mtop.this.initLock.notifyAll();
                        }
                    } catch (Exception e) {
                        TBSdkLog.e(Mtop.TAG, Mtop.access$200(Mtop.this) + " [init] executeCoreTask error.", e);
                    }
                }
            });
            this.isInit = true;
        }
    }

    private void executeCoreTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0323860", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            synchronized (this.signDegradeInitLock) {
                try {
                    updateAppKeyIndex();
                    this.initTask.executeCoreTask(this.mtopConfig);
                } finally {
                    String str = TAG;
                    TBSdkLog.i(str, this.instanceId + " [init]do executeCoreTask cost[ms]: " + (System.currentTimeMillis() - currentTimeMillis));
                    this.isSignDegradeInited = true;
                    this.signDegradeInitLock.notifyAll();
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, this.instanceId + " [init]do executeCoreTask " + th.getMessage());
        }
    }

    public void unInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[]{this});
            return;
        }
        this.isInited = false;
        this.isInit = false;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, this.instanceId + "[unInit] MTOPSDK unInit called");
    }

    public void updateAppKeyIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5b8972", new Object[]{this});
            return;
        }
        EnvModeEnum envModeEnum = this.mtopConfig.envMode;
        if (envModeEnum == null) {
            return;
        }
        int i = AnonymousClass3.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[envModeEnum.ordinal()];
        if (i == 1 || i == 2) {
            MtopConfig mtopConfig = this.mtopConfig;
            mtopConfig.appKeyIndex = mtopConfig.onlineAppKeyIndex;
        } else if (i != 3 && i != 4) {
        } else {
            MtopConfig mtopConfig2 = this.mtopConfig;
            mtopConfig2.appKeyIndex = mtopConfig2.dailyAppkeyIndex;
        }
    }

    public Mtop switchEnvMode(final EnvModeEnum envModeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("fa489261", new Object[]{this, envModeEnum});
        }
        if (envModeEnum != null && this.mtopConfig.envMode != envModeEnum) {
            if (!MtopUtils.isApkDebug(this.mtopConfig.context) && !this.mtopConfig.isAllowSwitchEnv.compareAndSet(true, false)) {
                TBSdkLog.e(TAG, this.instanceId + " [switchEnvMode]release package can switch environment only once!");
                return this;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, this.instanceId + " [switchEnvMode]MtopSDK switchEnvMode called.envMode=" + envModeEnum);
            }
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.Mtop.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Mtop.this.checkMtopSDKInit();
                    if (Mtop.this.mtopConfig.envMode == envModeEnum) {
                        TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [switchEnvMode] Current EnvMode matches target EnvMode,envMode=" + envModeEnum);
                        return;
                    }
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [switchEnvMode]MtopSDK switchEnvMode start");
                    }
                    Mtop.this.mtopConfig.envMode = envModeEnum;
                    try {
                        Mtop.this.updateAppKeyIndex();
                        if (EnvModeEnum.ONLINE == envModeEnum) {
                            TBSdkLog.setPrintLog(false);
                        }
                        Mtop.this.initTask.executeCoreTask(Mtop.this.mtopConfig);
                        if (Mtop.this.initTask instanceof IExtendMtopInitTask) {
                            ((IExtendMtopInitTask) Mtop.this.initTask).executeSignTask(Mtop.this.mtopConfig);
                        }
                        Mtop.this.initTask.executeExtraTask(Mtop.this.mtopConfig);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        return;
                    }
                    TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [switchEnvMode]MtopSDK switchEnvMode end. envMode =" + envModeEnum);
                }
            });
        }
        return this;
    }

    public boolean checkMtopSDKInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd87b2e5", new Object[]{this})).booleanValue();
        }
        if (this.isInited) {
            return this.isInited;
        }
        synchronized (this.initLock) {
            try {
                if (!this.isInited) {
                    this.initLock.wait(60000L);
                    if (!this.isInited) {
                        TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKInit]Didn't call Mtop.instance(...),please execute global init.");
                    }
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKInit] wait Mtop initLock failed---" + e.toString());
            }
        }
        return this.isInited;
    }

    public boolean checkMtopSDKSignDegradeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3744b0aa", new Object[]{this})).booleanValue();
        }
        if (this.isSignDegradeInited) {
            return this.isSignDegradeInited;
        }
        synchronized (this.signDegradeInitLock) {
            try {
                if (!this.isSignDegradeInited) {
                    this.signDegradeInitLock.wait(orq.FRAME_CHECK_TIMEOUT);
                    if (!this.isSignDegradeInited) {
                        TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKSignDegradeInit]Didn't call Mtop.instance(...),please execute global init.");
                    }
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKSignDegradeInit] wait Mtop signDegradeInitLock failed---" + e.toString());
            }
        }
        return this.isSignDegradeInited;
    }

    public boolean isInited() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue() : this.isInited;
    }

    @Deprecated
    public Mtop registerSessionInfo(String str, @Deprecated String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("2419a489", new Object[]{this, str, str2, str3}) : registerMultiAccountSession(null, str, str3);
    }

    @Deprecated
    public static void setAppKeyIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b256d9", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            MtopSetting.setAppKeyIndex(i, i2);
        }
    }

    @Deprecated
    public static void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{str});
        } else {
            MtopSetting.setAppVersion(str);
        }
    }

    @Deprecated
    public static void setSecurityAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289de771", new Object[]{str});
        } else {
            MtopSetting.setSecurityAppKey(str);
        }
    }

    @Deprecated
    public static void setMtopDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac98453", new Object[]{str, str2, str3});
        } else {
            MtopSetting.setMtopDomain(str, str2, str3);
        }
    }

    public Mtop registerSessionInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("e09ed293", new Object[]{this, str, str2}) : registerMultiAccountSession(null, str, str2);
    }

    public Mtop logout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("2cf134be", new Object[]{this}) : logoutMultiAccountSession(null);
    }

    public Mtop registerMultiAccountSession(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("13e99c6b", new Object[]{this, str, str2, str3});
        }
        String str4 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        String concatStr = StringUtils.concatStr(str4, str);
        a.a(concatStr, "sid", str2);
        a.a(concatStr, "uid", str3);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(concatStr);
            sb.append(" [registerSessionInfo]register sessionInfo succeed: sid=");
            sb.append(str2);
            sb.append(",uid=");
            sb.append(str3);
            TBSdkLog.i(TAG, sb.toString());
        }
        NetworkPropertyService networkPropertyService = this.mtopConfig.networkPropertyService;
        if (networkPropertyService != null) {
            networkPropertyService.setUserId(str3);
        }
        return this;
    }

    public Mtop logoutMultiAccountSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("2c4abee6", new Object[]{this, str});
        }
        String str2 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        String concatStr = StringUtils.concatStr(str2, str);
        a.b(concatStr, "sid");
        a.b(concatStr, "uid");
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb = new StringBuilder(32);
            sb.append(concatStr);
            sb.append(" [logout] remove sessionInfo succeed.");
            TBSdkLog.i(TAG, sb.toString());
        }
        NetworkPropertyService networkPropertyService = this.mtopConfig.networkPropertyService;
        if (networkPropertyService != null) {
            networkPropertyService.setUserId(null);
        }
        return this;
    }

    public Mtop registerTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("55c4cb20", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopConfig.ttid = str;
            a.a(this.instanceId, "ttid", str);
            NetworkPropertyService networkPropertyService = this.mtopConfig.networkPropertyService;
            if (networkPropertyService != null) {
                networkPropertyService.setTtid(str);
            }
        }
        return this;
    }

    public Mtop registerUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("c8e85dc1", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopConfig.utdid = str;
            a.c("utdid", str);
        }
        return this;
    }

    public Mtop registerDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("5ad54dea", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopConfig.deviceId = str;
            a.a(this.instanceId, "deviceId", str);
        }
        return this;
    }

    @Deprecated
    public String getSid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("169fb061", new Object[]{this}) : getMultiAccountSid(null);
    }

    public String getMultiAccountSid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50302a6b", new Object[]{this, str});
        }
        String str2 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return a.a(StringUtils.concatStr(str2, str), "sid");
    }

    @Deprecated
    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : getMultiAccountUserId(null);
    }

    public String getMultiAccountUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abeacc1f", new Object[]{this, str});
        }
        String str2 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return a.a(StringUtils.concatStr(str2, str), "uid");
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this}) : a.a(this.instanceId, "ttid");
    }

    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : a.a(this.instanceId, "deviceId");
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : a.a("utdid");
    }

    public Mtop setCoordinates(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("a5cd151b", new Object[]{this, str, str2});
        }
        a.c(DispatchConstants.LONGTITUDE, str);
        a.c(DispatchConstants.LATITUDE, str2);
        return this;
    }

    public boolean removeCacheBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cde6eb24", new Object[]{this, str})).booleanValue();
        }
        b bVar = this.mtopConfig.cacheImpl;
        return bVar != null && bVar.b(str);
    }

    public boolean unintallCacheBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd87b5cb", new Object[]{this, str})).booleanValue();
        }
        b bVar = this.mtopConfig.cacheImpl;
        return bVar != null && bVar.a(str);
    }

    public boolean removeCacheItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931b26b0", new Object[]{this, str, str2})).booleanValue();
        }
        if (StringUtils.isBlank(str2)) {
            TBSdkLog.e(TAG, "[removeCacheItem] remove CacheItem failed,invalid cacheKey=" + str2);
            return false;
        }
        b bVar = this.mtopConfig.cacheImpl;
        return bVar != null && bVar.b(str, str2);
    }

    public Mtop logSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("62dc8aba", new Object[]{this, new Boolean(z)});
        }
        TBSdkLog.setPrintLog(z);
        return this;
    }

    public MtopBuilder build(IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("afdc0349", new Object[]{this, iMTOPDataObject, str}) : new MtopBuilder(this, iMTOPDataObject, str);
    }

    public MtopBuilder build(MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("90e04d1c", new Object[]{this, mtopRequest, str}) : new MtopBuilder(this, mtopRequest, str);
    }

    @Deprecated
    public MtopBuilder build(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("d5db1fc7", new Object[]{this, obj, str}) : new MtopBuilder(this, obj, str);
    }

    public Map<String, MtopBuilder> getPrefetchBuilderMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("761d820a", new Object[]{this}) : this.prefetchBuilderMap;
    }

    public void addPrefetchBuilderToMap(MtopBuilder mtopBuilder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84229281", new Object[]{this, mtopBuilder, str});
            return;
        }
        if (this.prefetchBuilderMap.size() >= 50) {
            MtopPrefetch.cleanPrefetchCache(mtopBuilder.mtopInstance);
        }
        if (this.prefetchBuilderMap.size() >= 50) {
            MtopPrefetch.onPrefetchAndCommit("TYPE_FULL", mtopBuilder.getMtopPrefetch(), mtopBuilder.getMtopContext(), null);
        }
        this.prefetchBuilderMap.put(str, mtopBuilder);
    }

    public void setLaunchFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3989e8b9", new Object[]{this});
        } else if (!"INNER".equals(this.instanceId) || !ABGlobal.isFeatureOpened(this.mtopConfig.context, "Home_Page_SecondRefreshOpt")) {
        } else {
            try {
                synchronized (this.launchOptLock) {
                    this.isLaunchFirstFrame = true;
                    this.launchOptLock.notifyAll();
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.instanceId + " [init]do executeCoreTask " + th.getMessage());
            }
        }
    }

    private boolean checkLaunchFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb74263", new Object[]{this})).booleanValue();
        }
        if (!"INNER".equals(this.instanceId) || !ABGlobal.isFeatureOpened(this.mtopConfig.context, "Home_Page_SecondRefreshOpt")) {
            return true;
        }
        if (this.isLaunchFirstFrame) {
            return this.isLaunchFirstFrame;
        }
        synchronized (this.launchOptLock) {
            try {
                if (!this.isLaunchFirstFrame) {
                    TBSdkLog.e(TAG, this.instanceId + " [checkLaunchFirstFrame]wait to first frame.");
                    this.launchOptLock.wait(5000L);
                    TBSdkLog.e(TAG, this.instanceId + " [checkLaunchFirstFrame]isLaunchFirstFrame=" + this.isLaunchFirstFrame);
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, this.instanceId + " [checkFirstFrame] wait Mtop checkFirstFrame failed---" + e.toString());
            }
        }
        return this.isLaunchFirstFrame;
    }
}
