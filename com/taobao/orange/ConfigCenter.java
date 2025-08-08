package com.taobao.orange;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.StrategyCallBackHelper;
import anet.channel.util.HttpConstant;
import anetwork.channel.interceptor.InterceptorManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.application.common.a;
import com.taobao.orange.OConstant;
import com.taobao.orange.accssupport.OrangeAccsService;
import com.taobao.orange.aidl.OrangeConfigListenerStub;
import com.taobao.orange.aidl.ParcelableConfigListener;
import com.taobao.orange.candidate.MultiAnalyze;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.model.CustomConfigDO;
import com.taobao.orange.model.IndexAckDO;
import com.taobao.orange.model.IndexDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.receiver.OrangeReceiver;
import com.taobao.orange.sync.IndexUpdateHandler;
import com.taobao.orange.sync.e;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.StringUtil;
import com.taobao.orange.util.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.cew;
import tb.iwg;
import tb.kge;
import tb.mzu;
import tb.mzv;
import tb.nac;

/* loaded from: classes.dex */
public class ConfigCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_BIND_TIMEOUT = 3;
    public static ConfigCenter j;
    private static volatile long l;
    public AtomicBoolean mIsOrangeInit = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f18536a = new ConcurrentHashMap();
    public final Set<String> b = new HashSet();
    public final Map<String, Set<ParcelableConfigListener>> c = new HashMap();
    public final Set<ParcelableConfigListener> d = Collections.synchronizedSet(new HashSet());
    public final ConcurrentLinkedQueue<NameSpaceDO> e = new ConcurrentLinkedQueue<>();
    public volatile nac f = null;
    public AtomicBoolean isAfterIdle = new AtomicBoolean(false);
    public AtomicBoolean isAfterForeground = new AtomicBoolean(false);
    public volatile boolean g = false;
    private AtomicInteger m = new AtomicInteger(0);
    private Map<String, Long> n = new ConcurrentHashMap();
    private boolean o = false;
    private volatile long q = 0;
    private volatile long u = 0;
    private String r = null;
    public AtomicBoolean isWaitingIdle = new AtomicBoolean(false);
    public final Set<String> s = new HashSet();
    private AtomicBoolean t = new AtomicBoolean(false);
    public Set<String> k = new HashSet();
    public mzv h = new mzv();
    public mzu i = new mzu();
    public iwg p = new iwg();

    /* renamed from: com.taobao.orange.ConfigCenter$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18537a;
        public final /* synthetic */ OConfig b;

        public AnonymousClass1(Context context, OConfig oConfig) {
            this.f18537a = context;
            this.b = oConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (ConfigCenter.this) {
                if (!ConfigCenter.this.mIsOrangeInit.get()) {
                    a.k = UTDevice.getUtdid(this.f18537a);
                    if (OLog.isPrintLog(2)) {
                        SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(OConfig.class, new String[0]);
                        simplePropertyPreFilter.getExcludes().add("appSecret");
                        OLog.i("ConfigCenter", "init start", "sdkVersion", OConstant.SDK_VERSION, "utdid", a.k, "config", JSON.toJSONString(this.b, simplePropertyPreFilter, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.SortField));
                    }
                    a.g = this.f18537a.getApplicationContext();
                    a.h = this.b.appKey;
                    a.j = this.b.appVersion;
                    a.l = this.b.userId;
                    a.i = this.b.appSecret;
                    a.m = this.b.authCode;
                    a.r = this.b.reportAck;
                    a.s = this.b.statUsedConfig;
                    a.v = OConstant.UPDMODE.valueOf(this.b.indexUpdateMode);
                    a.J = OConstant.ENV.valueOf(this.b.env);
                    a.t = ConfigCenter.this.a(10L);
                    a.u.addAll(Arrays.asList(this.b.probeHosts));
                    a.K = this.b.dcHost;
                    if (this.b.dcVips != null) {
                        a.L.addAll(Arrays.asList(this.b.dcVips));
                    }
                    a.M = this.b.ackHost;
                    if (this.b.ackVips != null) {
                        a.N.addAll(Arrays.asList(this.b.ackVips));
                    }
                    if (this.b.enableDiffIndex) {
                        a.y = 2;
                    }
                    ConfigCenter.a(ConfigCenter.this, this.b.channelIndexUpdate);
                    ConfigCenter.this.c.put("orange", new HashSet<ParcelableConfigListener>() { // from class: com.taobao.orange.ConfigCenter.1.1
                        {
                            add(new ParcelableConfigListener.Stub() { // from class: com.taobao.orange.ConfigCenter.1.1.1
                                @Override // com.taobao.orange.aidl.ParcelableConfigListener
                                public void onConfigUpdate(String str, Map map) throws RemoteException {
                                    ConfigCenter.this.a(map);
                                }
                            });
                        }
                    });
                    MultiAnalyze.initBuildInCandidates();
                    ConfigCenter.this.a();
                    File file = new File(com.taobao.orange.util.b.b(), mzv.INDEX_STORE_NAME);
                    ConfigCenter.this.g = !file.exists();
                    com.taobao.orange.util.d.a();
                    try {
                        Class.forName(OConstant.REFLECT_NETWORK_INTERCEPTOR);
                        Class.forName(OConstant.REFLECT_NETWORK_INTERCEPTORMANAGER);
                        InterceptorManager.addInterceptor(new com.taobao.orange.sync.d());
                        OLog.i("ConfigCenter", "init", "add orange interceptor success to networksdk");
                    } catch (ClassNotFoundException e) {
                        OLog.w("ConfigCenter", "init", e, "add orange interceptor fail as not found networksdk");
                    }
                    ConfigCenter.this.mIsOrangeInit.set(true);
                    ConfigCenter.this.forceCheckUpdate();
                    OrangeAccsService.a();
                    com.taobao.orange.accssupport.a.a();
                    ConfigCenter.a(ConfigCenter.this);
                    if (ConfigCenter.this.f != null) {
                        nac nacVar = ConfigCenter.this.f;
                    }
                    if (this.b.time >= 0) {
                        e.a(new Runnable() { // from class: com.taobao.orange.ConfigCenter.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ConfigCenter.this.delayLoadConfigForeground();
                                ConfigCenter.this.delayLoadConfig();
                            }
                        }, this.b.time);
                    }
                    e.a(new Runnable() { // from class: com.taobao.orange.ConfigCenter.1.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            com.taobao.orange.util.e eVar = new com.taobao.orange.util.e();
                            eVar.f18605a.f18606a = ConfigCenter.this.g;
                            eVar.f18605a.b = a.w;
                            eVar.f18605a.c = 2;
                            eVar.f18605a.d = ConfigCenter.b(ConfigCenter.this).get();
                            eVar.f18605a.e = com.taobao.orange.util.b.f18599a.get();
                            eVar.f18605a.f = com.taobao.orange.util.b.b.get();
                            eVar.f18605a.g = com.taobao.orange.util.b.c.get();
                            eVar.f18605a.h = com.taobao.orange.util.b.d.get();
                            eVar.f18605a.i = com.taobao.orange.util.b.e.get();
                            com.taobao.orange.util.d.a(eVar);
                            com.taobao.orange.util.d.b = true;
                        }
                    }, 90000L);
                    OLog.i("ConfigCenter", "init completed", new Object[0]);
                } else {
                    OLog.w("ConfigCenter", "already init", new Object[0]);
                }
            }
        }
    }

    public static /* synthetic */ String a(ConfigCenter configCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5512564", new Object[]{configCenter, str});
        }
        configCenter.r = str;
        return str;
    }

    public static /* synthetic */ void a(ConfigCenter configCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc72d72", new Object[]{configCenter});
        } else {
            configCenter.b();
        }
    }

    public static /* synthetic */ void a(ConfigCenter configCenter, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13171f0d", new Object[]{configCenter, set});
        } else {
            configCenter.a(set);
        }
    }

    public static /* synthetic */ boolean a(ConfigCenter configCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("191f33a6", new Object[]{configCenter, new Boolean(z)})).booleanValue();
        }
        configCenter.o = z;
        return z;
    }

    public static /* synthetic */ AtomicInteger b(ConfigCenter configCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("8e6b241d", new Object[]{configCenter}) : configCenter.m;
    }

    public static /* synthetic */ void b(ConfigCenter configCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a71d041", new Object[]{configCenter, new Boolean(z)});
        } else {
            configCenter.a(z);
        }
    }

    public static /* synthetic */ AtomicBoolean c(ConfigCenter configCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("eb2b78b4", new Object[]{configCenter}) : configCenter.t;
    }

    static {
        kge.a(62472069);
        l = 0L;
        j = new ConfigCenter();
    }

    public static ConfigCenter getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigCenter) ipChange.ipc$dispatch("a93d374e", new Object[0]) : j;
    }

    private ConfigCenter() {
    }

    public ConcurrentLinkedQueue<NameSpaceDO> getConfigWaitingNetworkQueue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentLinkedQueue) ipChange.ipc$dispatch("442ef49d", new Object[]{this}) : this.e;
    }

    public mzu getConfigCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mzu) ipChange.ipc$dispatch("f491c64d", new Object[]{this}) : this.i;
    }

    public void setInitListener(nac nacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3b974d", new Object[]{this, nacVar});
        } else {
            this.f = nacVar;
        }
    }

    public boolean addGlobalListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e051bdf0", new Object[]{this, dVar})).booleanValue();
        }
        if (dVar == null) {
            return false;
        }
        return this.d.add(new OrangeConfigListenerStub(dVar));
    }

    public boolean removeGlobalListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1f3f4ad", new Object[]{this, dVar})).booleanValue();
        }
        if (dVar == null) {
            return false;
        }
        return this.d.remove(new OrangeConfigListenerStub(dVar));
    }

    @Deprecated
    public void setGlobalListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63eeb30b", new Object[]{this, dVar});
        } else {
            this.d.add(new OrangeConfigListenerStub(dVar));
        }
    }

    public void init(Context context, OConfig oConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7508d46d", new Object[]{this, context, oConfig});
        } else if (context == null || StringUtils.isEmpty(oConfig.appKey) || StringUtils.isEmpty(oConfig.appVersion)) {
            OLog.e("ConfigCenter", "init start", "input param error");
        } else {
            e.a(new AnonymousClass1(context, oConfig));
        }
    }

    public void a() {
        Set<NameSpaceDO> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            OLog.i("ConfigCenter", "loadCaches", "start index");
            this.h.a();
            if (a.G && !this.isAfterForeground.get()) {
                c = this.h.d();
                OLog.e("ConfigCenter", "loadCaches, getHighInitNameSpaces", new Object[0]);
            } else {
                c = this.h.c();
                OLog.e("ConfigCenter", "loadCaches, getAllNameSpaces", new Object[0]);
            }
            long currentTimeMillis = System.currentTimeMillis();
            a(c);
            if (a.H) {
                this.h.f();
            }
            OLog.e("ConfigCenter", "loadCaches", "size", Integer.valueOf(c.size()), "time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            a.g.registerReceiver(new OrangeReceiver(), intentFilter);
        } catch (Throwable th) {
            OLog.e("ConfigCenter", "loadCaches", th, new Object[0]);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, "0", "102", byteArrayOutputStream.toString());
        }
    }

    private void a(Set<NameSpaceDO> set) {
        Set<NameSpaceDO> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{this, set});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        OLog.i("ConfigCenter", "restoreConfigs", "start restore configs", Integer.valueOf(set.size()));
        if (this.o) {
            a2 = this.i.b(set);
        } else {
            a2 = this.i.a(set);
        }
        OLog.i("ConfigCenter", "restoreConfigs", "finish restore configs", Integer.valueOf(set.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        OLog.i("ConfigCenter", "restoreConfigs", "start load notMatchNamespaces", Integer.valueOf(a2.size()));
        long currentTimeMillis2 = System.currentTimeMillis();
        for (NameSpaceDO nameSpaceDO : a2) {
            com.taobao.orange.util.d.a(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_CONFIG_NOTMATCH_COUNTS, nameSpaceDO.name, 1.0d);
            loadConfig(nameSpaceDO);
            a2 = a2;
        }
        OLog.i("ConfigCenter", "restoreConfigs", "finish load notMatchNamespaces", Integer.valueOf(a2.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
    }

    public void forceCheckUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2de18d", new Object[]{this});
        } else if (!this.mIsOrangeInit.get()) {
            OLog.w("ConfigCenter", "forceCheckUpdate fail as not finish orange init", new Object[0]);
        } else if (a.v != OConstant.UPDMODE.O_XMD) {
            OLog.i("ConfigCenter", "forceCheckUpdate start", new Object[0]);
            IndexUpdateHandler.a(this.h.i(), this.h.j());
        } else {
            OLog.w("ConfigCenter", "forceCheckUpdate fail as not allow in O_XMD mode", new Object[0]);
        }
    }

    public String getConfig(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        Map<String, String> configs = getConfigs(str);
        if (configs != null && (str4 = configs.get(str2)) != null) {
            a(str, str2, str4);
            return str4;
        }
        a(str, str2, str3);
        return str3;
    }

    private void a(String str, String str2, String str3) {
        ConfigDO configDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            if (!StringUtils.equals("null", str3) || (configDO = this.i.a().get(str)) == null) {
                return;
            }
            com.taobao.orange.util.d.a(str, configDO.version, configDO.getChangeVersion(), str2);
        } catch (Throwable th) {
            OLog.e("ConfigCenter", "reportNullValue " + th.getMessage(), new Object[0]);
        }
    }

    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        try {
            Map<String, String> map = (Map) a(str);
            if (map != null) {
                return map;
            }
        } catch (Throwable th) {
            OLog.w("ConfigCenter", "getConfigs error", th, "namespace", str);
        }
        synchronized (this.s) {
            if (this.s.add(str)) {
                com.taobao.orange.util.d.a(str);
            }
        }
        return null;
    }

    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        try {
            String str3 = (String) a(str);
            if (str3 != null) {
                return str3;
            }
        } catch (Throwable th) {
            OLog.w("ConfigCenter", "getCustomConfig error", th, "namespace", str);
        }
        synchronized (this.s) {
            if (this.s.add(str)) {
                com.taobao.orange.util.d.a(str);
            }
        }
        return str2;
    }

    private <T> T a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            OLog.e("ConfigCenter", "getConfigObj error, namespace is empty", new Object[0]);
            return null;
        } else if ("orange".equals(str) || mzv.INDEX_STORE_NAME.equals(str)) {
            OLog.e("ConfigCenter", "getConfigObj error, namespace is occupied by sdk", new Object[0]);
            return null;
        } else {
            T t = (T) this.p.a(str);
            if (t != null) {
                OLog.e("ConfigCenter", "getConfigObj hit critical cache", "namespace", str);
                return t;
            }
            T t2 = (T) this.i.b(str);
            if (t2 == null) {
                if (OLog.isPrintLog(0)) {
                    OLog.v("ConfigCenter", "getConfigObj", "namespace", str, "...null");
                }
                final NameSpaceDO a2 = this.h.a(str);
                if (a2 != null && this.mIsOrangeInit.get()) {
                    if (!a(str, false)) {
                        e.a(new Runnable() { // from class: com.taobao.orange.ConfigCenter.9
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (OLog.isPrintLog(0)) {
                                    OLog.d("ConfigCenter", "getConfigObj force to load", "namespace", a2.name);
                                }
                                ConfigCenter.this.loadConfigLazy(a2);
                            }
                        });
                    }
                } else if (a.H && a2 == null && this.mIsOrangeInit.get()) {
                    e.b(new Runnable() { // from class: com.taobao.orange.ConfigCenter.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ConfigCenter.this.h.g();
                            NameSpaceDO a3 = ConfigCenter.this.h.a(str);
                            if (a3 != null && ConfigCenter.this.mIsOrangeInit.get()) {
                                ConfigCenter.this.loadConfig(a3);
                            }
                            ConfigCenter.this.h.f();
                        }
                    });
                } else {
                    b(str);
                }
            }
            return t2;
        }
    }

    public void loadConfigLazy(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d439b16c", new Object[]{this, nameSpaceDO});
        } else if (nameSpaceDO == null) {
            OLog.e("ConfigCenter", "loadConfigLazy fail", "nameSpaceDO is null");
        } else if ("orange".equals(nameSpaceDO.name)) {
            loadConfig(nameSpaceDO);
        } else if (a.w > 0) {
            OLog.w("ConfigCenter", "loadConfigLazy downgrade, back to old strategy", nameSpaceDO.name, nameSpaceDO.loadLevel, Integer.valueOf(a.w));
            loadConfig(nameSpaceDO);
            if (!com.taobao.orange.util.d.f18601a || this.n.get(nameSpaceDO.name) != null) {
                return;
            }
            this.n.put(nameSpaceDO.name, Long.valueOf(System.currentTimeMillis()));
            com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_DOWNGRADE, nameSpaceDO.name, 1.0d);
        } else {
            OLog.d("ConfigCenter", "loadConfigLazy", nameSpaceDO.name, nameSpaceDO.loadLevel, nameSpaceDO.highLazy);
            if (nameSpaceDO.highLazy.intValue() != 0 && this.g) {
                if (this.isAfterIdle.get()) {
                    loadConfig(nameSpaceDO);
                    return;
                }
                getConfigWaitingNetworkQueue().offer(nameSpaceDO);
                OLog.d("ConfigCenter", "offer a namespace", nameSpaceDO.name, "to network queue");
                return;
            }
            loadConfig(nameSpaceDO);
        }
    }

    public void loadConfig(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb27e80", new Object[]{this, nameSpaceDO});
        } else {
            loadConfig(nameSpaceDO, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227 A[Catch: Throwable -> 0x02e5, TryCatch #6 {Throwable -> 0x02e5, blocks: (B:84:0x01fa, B:86:0x01ff, B:88:0x0227, B:90:0x0232, B:92:0x023c, B:93:0x0246, B:89:0x022d, B:101:0x0265, B:103:0x026c, B:105:0x0270, B:106:0x0276, B:107:0x027b, B:110:0x0293, B:112:0x0299, B:113:0x02a2), top: B:152:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d A[Catch: Throwable -> 0x02e5, TryCatch #6 {Throwable -> 0x02e5, blocks: (B:84:0x01fa, B:86:0x01ff, B:88:0x0227, B:90:0x0232, B:92:0x023c, B:93:0x0246, B:89:0x022d, B:101:0x0265, B:103:0x026c, B:105:0x0270, B:106:0x0276, B:107:0x027b, B:110:0x0293, B:112:0x0299, B:113:0x02a2), top: B:152:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023c A[Catch: Throwable -> 0x02e5, TRY_LEAVE, TryCatch #6 {Throwable -> 0x02e5, blocks: (B:84:0x01fa, B:86:0x01ff, B:88:0x0227, B:90:0x0232, B:92:0x023c, B:93:0x0246, B:89:0x022d, B:101:0x0265, B:103:0x026c, B:105:0x0270, B:106:0x0276, B:107:0x027b, B:110:0x0293, B:112:0x0299, B:113:0x02a2), top: B:152:0x01cb }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Class<com.taobao.orange.model.ConfigDO>] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadConfig(final com.taobao.orange.model.NameSpaceDO r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.ConfigCenter.loadConfig(com.taobao.orange.model.NameSpaceDO, boolean):void");
    }

    public void registerListener(final String str, ParcelableConfigListener parcelableConfigListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4337f705", new Object[]{this, str, parcelableConfigListener, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || parcelableConfigListener == null) {
        } else {
            synchronized (this.c) {
                Set<ParcelableConfigListener> set = this.c.get(str);
                if (set == null) {
                    set = Collections.newSetFromMap(new LinkedHashMap<ParcelableConfigListener, Boolean>() { // from class: com.taobao.orange.ConfigCenter.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.LinkedHashMap
                        public boolean removeEldestEntry(Map.Entry<ParcelableConfigListener, Boolean> entry) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : ((long) size()) > 10;
                        }
                    });
                    this.c.put(str, set);
                }
                if (set.contains(parcelableConfigListener)) {
                    return;
                }
                if (z) {
                    set.add(parcelableConfigListener);
                    if (OLog.isPrintLog(1)) {
                        OLog.d("ConfigCenter", "registerListener append", "namespace", str, "size", Integer.valueOf(set.size()));
                    }
                } else {
                    if (OLog.isPrintLog(1)) {
                        OLog.d("ConfigCenter", "registerListener cover", "namespace", str);
                    }
                    set.clear();
                    set.add(parcelableConfigListener);
                }
                ConfigDO configDO = this.p.a().get(str);
                if (configDO != null && !configDO.isExpired.get()) {
                    String curVersion = configDO.getCurVersion();
                    OLog.e("ConfigCenter", "registerListener hit critical config onConfigUpdate", "namespace", str, "version", curVersion);
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("fromCache", "true");
                        hashMap.put("isCritical", "true");
                        hashMap.put("configVersion", curVersion);
                        parcelableConfigListener.onConfigUpdate(str, hashMap);
                        return;
                    } catch (Throwable th) {
                        OLog.w("ConfigCenter", "registerListener", th, new Object[0]);
                    }
                }
                ConfigDO configDO2 = this.i.a().get(str);
                if (configDO2 != null) {
                    String curVersion2 = configDO2.getCurVersion();
                    if (OLog.isPrintLog(0)) {
                        OLog.v("ConfigCenter", "registerListener onConfigUpdate", "namespace", str, "version", curVersion2);
                    }
                    try {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("fromCache", "true");
                        hashMap2.put("configVersion", curVersion2);
                        parcelableConfigListener.onConfigUpdate(str, hashMap2);
                        return;
                    } catch (Throwable th2) {
                        OLog.w("ConfigCenter", "registerListener", th2, new Object[0]);
                        return;
                    }
                }
                final NameSpaceDO a2 = this.h.a(str);
                if (this.h != null && a2 != null && this.mIsOrangeInit.get()) {
                    if (a(str, false)) {
                        return;
                    }
                    e.a(new Runnable() { // from class: com.taobao.orange.ConfigCenter.13
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ConfigCenter.this.loadConfigLazy(a2);
                            }
                        }
                    });
                } else if (a.H && a2 == null && this.mIsOrangeInit.get()) {
                    e.b(new Runnable() { // from class: com.taobao.orange.ConfigCenter.14
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ConfigCenter.this.h.g();
                            NameSpaceDO a3 = ConfigCenter.this.h.a(str);
                            if (a3 != null && ConfigCenter.this.mIsOrangeInit.get()) {
                                ConfigCenter.this.loadConfig(a3);
                            }
                            ConfigCenter.this.h.f();
                        }
                    });
                } else {
                    b(str);
                }
            }
        }
    }

    public void unregisterListener(String str, ParcelableConfigListener parcelableConfigListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b557cef6", new Object[]{this, str, parcelableConfigListener});
        } else if (StringUtils.isEmpty(str) || parcelableConfigListener == null) {
        } else {
            synchronized (this.c) {
                Set<ParcelableConfigListener> set = this.c.get(str);
                if (set != null && set.size() > 0 && set.remove(parcelableConfigListener) && OLog.isPrintLog(1)) {
                    OLog.d("ConfigCenter", "unregisterListener", "namespace", str, "size", Integer.valueOf(set.size()));
                }
            }
        }
    }

    public void unregisterListeners(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b11fb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (this.c) {
                this.c.remove(str);
            }
        }
    }

    public void notifyListeners(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912cc3e3", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            notifyListeners(str, str2, z, false);
        }
    }

    public void notifyListeners(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946c6b51", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
        } else if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("fromCache", String.valueOf(z));
            hashMap.put("isCritical", String.valueOf(z2));
            hashMap.put("configVersion", str2);
            if ((!z || z2) && !this.d.isEmpty()) {
                for (ParcelableConfigListener parcelableConfigListener : this.d) {
                    try {
                        parcelableConfigListener.onConfigUpdate(str, hashMap);
                    } catch (Throwable th) {
                        OLog.w("ConfigCenter", "notifyGlobalListeners", th, new Object[0]);
                    }
                }
            }
            HashSet<ParcelableConfigListener> hashSet = new HashSet();
            synchronized (this.c) {
                Set<ParcelableConfigListener> set = this.c.get(str);
                if (set != null && set.size() > 0) {
                    hashSet.addAll(set);
                }
            }
            if (hashSet.size() <= 0) {
                return;
            }
            if (OLog.isPrintLog(1)) {
                OLog.d("ConfigCenter", "notifyListeners ", "namespace", str, "args", hashMap, "listenerSet.size", Integer.valueOf(hashSet.size()));
            }
            for (ParcelableConfigListener parcelableConfigListener2 : hashSet) {
                try {
                    parcelableConfigListener2.onConfigUpdate(str, hashMap);
                } catch (Throwable th2) {
                    OLog.w("ConfigCenter", "notifyListeners", th2, new Object[0]);
                }
            }
        }
    }

    public synchronized void updateIndex(IndexUpdateHandler.IndexUpdateInfo indexUpdateInfo) {
        Set<NameSpaceDO> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a662f737", new Object[]{this, indexUpdateInfo});
        } else if (!a(indexUpdateInfo)) {
            if (OLog.isPrintLog(0)) {
                OLog.v("ConfigCenter", "updateIndex", "no need update or update fail index file");
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            HashSet hashSet = new HashSet((int) ((this.i.a().size() + this.b.size()) * 1.4d));
            hashSet.addAll(this.i.a().keySet());
            synchronized (this.b) {
                hashSet.addAll(this.b);
            }
            if (this.o) {
                a2 = this.h.b(hashSet);
            } else {
                a2 = this.h.a(hashSet);
            }
            OLog.i("ConfigCenter", "updateIndex", "start load updateNameSpaces", Integer.valueOf(a2.size()));
            for (NameSpaceDO nameSpaceDO : a2) {
                loadConfigLazy(nameSpaceDO);
            }
            OLog.i("ConfigCenter", "updateIndex", "finish load updateNameSpaces", Integer.valueOf(a2.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    private boolean a(final IndexUpdateHandler.IndexUpdateInfo indexUpdateInfo) {
        String str;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda21163", new Object[]{this, indexUpdateInfo})).booleanValue();
        }
        if (indexUpdateInfo == null || !indexUpdateInfo.checkValid()) {
            OLog.e("ConfigCenter", "updateIndex param is null", new Object[0]);
            return false;
        } else if (!StringUtils.isEmpty(this.h.b().md5) && this.h.b().md5.equals(indexUpdateInfo.md5)) {
            OLog.w("ConfigCenter", "loadIndex fail", "cdnMd5 is match");
            return false;
        } else {
            if (a.O.get() >= 10) {
                long currentTimeMillis = System.currentTimeMillis();
                if (l != 0) {
                    if (currentTimeMillis - l <= cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT) {
                        return false;
                    }
                    a.O.set(0);
                    l = 0L;
                    if (OLog.isPrintLog(3)) {
                        OLog.w("ConfigCenter", "updateIndex continuous fail already wait 100s", new Object[0]);
                    }
                } else {
                    l = currentTimeMillis;
                    if (OLog.isPrintLog(3)) {
                        OLog.w("ConfigCenter", "updateIndex continuous fail numbers exceed 10", new Object[0]);
                    }
                    return false;
                }
            }
            a.O.incrementAndGet();
            if (OLog.isPrintLog(2)) {
                OLog.i("ConfigCenter", "loadIndex start", "cdn", indexUpdateInfo.cdn, "resource", indexUpdateInfo.resourceId, "md5", indexUpdateInfo.md5);
            }
            try {
                com.taobao.orange.sync.c cVar = new com.taobao.orange.sync.b<IndexDO>(a.p + HttpConstant.SCHEME_SPLIT + indexUpdateInfo.cdn + File.separator + indexUpdateInfo.resourceId, indexUpdateInfo.md5) { // from class: com.taobao.orange.ConfigCenter.15
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.orange.model.IndexDO] */
                    @Override // com.taobao.orange.sync.b
                    public /* synthetic */ IndexDO b(String str2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6e4e661f", new Object[]{this, str2}) : a(str2);
                    }

                    public IndexDO a(String str2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (IndexDO) ipChange2.ipc$dispatch("5f88611a", new Object[]{this, str2}) : (IndexDO) JSON.parseObject(str2, IndexDO.class);
                    }
                };
                IndexDO c = cVar.c();
                if (!com.taobao.orange.util.d.b) {
                    this.m.incrementAndGet();
                }
                if (!a.x) {
                    if (c != null && c.checkValid()) {
                        str = OConstant.MONITOR_PRIVATE_MODULE;
                        d = 1.0d;
                    }
                    if (OLog.isPrintLog(0)) {
                        OLog.v("ConfigCenter", "loadIndex cdnReq fail downgrade to authReq", "code", cVar.d(), "msg", cVar.e());
                    }
                    String str2 = indexUpdateInfo.md5;
                    str = OConstant.MONITOR_PRIVATE_MODULE;
                    d = 1.0d;
                    com.taobao.orange.sync.c cVar2 = new com.taobao.orange.sync.a<IndexDO>(str2, false, OConstant.REQTYPE_DOWNLOAD_RESOURCE) { // from class: com.taobao.orange.ConfigCenter.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.orange.sync.a
                        public String b() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this});
                            }
                            return null;
                        }

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.orange.model.IndexDO] */
                        @Override // com.taobao.orange.sync.a
                        public /* synthetic */ IndexDO b(String str3) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6e4e661f", new Object[]{this, str3}) : a(str3);
                        }

                        @Override // com.taobao.orange.sync.a
                        public Map<String, String> a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this});
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, indexUpdateInfo.resourceId);
                            return hashMap;
                        }

                        public IndexDO a(String str3) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (IndexDO) ipChange2.ipc$dispatch("5f88611a", new Object[]{this, str3}) : (IndexDO) JSON.parseObject(str3, IndexDO.class);
                        }
                    };
                    cVar = cVar2;
                    c = (IndexDO) cVar2.c();
                } else {
                    str = OConstant.MONITOR_PRIVATE_MODULE;
                    d = 1.0d;
                    com.taobao.orange.util.d.a(str, OConstant.POINT_FALLBACK_AVOID, indexUpdateInfo.resourceId, 1.0d);
                }
                if (c != null && c.checkValid()) {
                    a.O.set(0);
                    if (!c.id.equals(this.h.b().id) && !c.version.equals(this.h.b().version)) {
                        c.md5 = indexUpdateInfo.md5;
                        List<String> a2 = this.h.a(c);
                        com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_INDEX_RATE, indexUpdateInfo.resourceId);
                        com.taobao.orange.util.d.c(c.appIndexVersion, c.baseVersion, a.z);
                        if (OLog.isPrintLog(1)) {
                            OLog.d("ConfigCenter", "loadIndex success", "indexDO", com.taobao.orange.util.f.a(c));
                        }
                        try {
                            com.taobao.orange.util.g.a(new IndexAckDO(c.id, com.taobao.orange.util.f.a(), indexUpdateInfo.md5));
                        } catch (Exception e) {
                            OLog.w("ConfigCenter", "loadIndex", e, new Object[0]);
                        }
                        if (a2.size() <= 0) {
                            return true;
                        }
                        if (OLog.isPrintLog(2)) {
                            OLog.i("ConfigCenter", "loadIndex remove diff namespace", "removeNamespaces", a2);
                        }
                        for (String str3 : a2) {
                            com.taobao.orange.util.d.a(str, OConstant.POINT_CONFIG_REMOVE_COUNTS, str3, d);
                            this.i.a(str3);
                        }
                        return true;
                    }
                    OLog.w("ConfigCenter", "loadIndex fail", "id or version is match");
                    return false;
                }
                if (!"-200".equals(cVar.d())) {
                    if (c != null && !c.checkValid()) {
                        cVar.a(-5);
                        cVar.c("index is invaild");
                    }
                    com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_INDEX_RATE, indexUpdateInfo.resourceId, cVar.d(), cVar.e());
                }
                OLog.e("ConfigCenter", "loadIndex fail", "code", cVar.d(), "msg", cVar.e());
                return false;
            } catch (Throwable th) {
                com.taobao.orange.util.d.a(OConstant.MONITOR_MODULE, OConstant.POINT_INDEX_RATE, indexUpdateInfo.resourceId, "0", th.getMessage());
                OLog.e("ConfigCenter", "loadIndex fail", th, new Object[0]);
                return false;
            }
        }
    }

    public void a(Map map) {
        int i;
        List parseArray;
        List parseArray2;
        JSONArray parseArray3;
        ConfigDO configDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        try {
            Map map2 = (Map) this.i.b("orange");
            if (OLog.isPrintLog(2)) {
                OLog.i("ConfigCenter", "updateSystemConfig", "args", map, "orangeConfigs", map2);
            }
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            String str = (String) map2.get("processIsolated");
            boolean z = !StringUtils.isEmpty(str) && Boolean.parseBoolean(str) != a.A;
            String str2 = (String) map2.get(OConstant.SYSKEY_PROCESS_QUERY);
            if (!StringUtils.isEmpty(str2) && Boolean.parseBoolean(str2) != a.B) {
                z = true;
            }
            String str3 = (String) map2.get(OConstant.SYSKEY_PROCESS_QUERY_FORBID_TIME);
            if (!StringUtils.isEmpty(str3) && !a.C.equals(str3)) {
                z = true;
            }
            String str4 = (String) map2.get(OConstant.SYSKEY_PROCESS_QUERY_STRATEGY);
            if (!StringUtils.isEmpty(str4) && !a.D.equals(str4)) {
                z = true;
            }
            String str5 = (String) map2.get(OConstant.SYSKEY_PROCESS_MEMORY_OPTIMIZE);
            if (!StringUtils.isEmpty(str5) && Boolean.parseBoolean(str5) != a.H) {
                z = true;
            }
            if (z && (configDO = this.i.a().get("orange")) != null) {
                ConfigDO configDO2 = new ConfigDO();
                configDO2.appKey = configDO.appKey;
                configDO2.appVersion = configDO.appVersion;
                configDO2.id = configDO.id;
                configDO2.name = configDO.name;
                configDO2.resourceId = configDO.resourceId;
                configDO2.type = configDO.type;
                configDO2.loadLevel = configDO.loadLevel;
                configDO2.version = configDO.version;
                configDO2.content = new HashMap();
                configDO2.content.putAll(configDO.content);
                com.taobao.orange.util.b.b(configDO2, OConstant.PROCESS_ISOLATED_LOCAL_CONFIG);
            }
            String str6 = (String) map2.get(OConstant.SYSKEY_FALLBACK_AVOID);
            if (!StringUtils.isEmpty(str6)) {
                a.x = Boolean.parseBoolean(str6);
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_FALLBACK_AVOID, Boolean.valueOf(a.x));
            }
            String str7 = (String) map2.get(OConstant.SYSKEY_INDEX_ENV_CHECK);
            if (!StringUtils.isEmpty(str7)) {
                a.E = Boolean.parseBoolean(str7);
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_INDEX_ENV_CHECK, Boolean.valueOf(a.E));
            }
            String str8 = (String) map2.get(OConstant.SYSKEY_REQ_RETRY_NUM);
            if (!StringUtils.isEmpty(str8)) {
                int parseInt = Integer.parseInt(str8);
                if (parseInt > 5) {
                    parseInt = 5;
                }
                a.q = parseInt;
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_REQ_RETRY_NUM, Integer.valueOf(a.q));
            }
            String str9 = (String) map2.get(OConstant.SYSKEY_REPORT_UPDACK);
            if (!StringUtils.isEmpty(str9)) {
                a.r = Integer.parseInt(str9) == 1;
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_REPORT_UPDACK, Boolean.valueOf(a.r));
            }
            String str10 = (String) map2.get(OConstant.SYSKEY_DELAYACK_INTERVAL);
            if (!StringUtils.isEmpty(str10)) {
                long parseLong = Long.parseLong(str10);
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_DELAYACK_INTERVAL, Long.valueOf(parseLong));
                if (parseLong > 0) {
                    a.t = a(parseLong);
                    OLog.i("ConfigCenter", "updateSystemConfig", "randomDelayAckInterval", Long.valueOf(a.t));
                }
            }
            String str11 = (String) map2.get(OConstant.SYSKEY_INDEXUPD_MODE);
            if (!StringUtils.isEmpty(str11)) {
                a.v = OConstant.UPDMODE.valueOf(Integer.parseInt(str11));
                OLog.i("ConfigCenter", "updateSystemConfig", "indexUpdMode", a.v);
            }
            String str12 = (String) map2.get("downgrade");
            if (!StringUtils.isEmpty(str12)) {
                if (Boolean.valueOf(str12).booleanValue()) {
                    a.w = 2;
                }
                OLog.i("ConfigCenter", "updateSystemConfig", "downgrade", Integer.valueOf(a.w));
            }
            String str13 = (String) map2.get("hosts");
            if (!StringUtils.isEmpty(str13) && (parseArray3 = JSON.parseArray(str13)) != null && parseArray3.size() >= 0) {
                ArrayList arrayList = new ArrayList(parseArray3.size());
                for (int i2 = 0; i2 < parseArray3.size(); i2++) {
                    String string = parseArray3.getJSONObject(i2).getString("host");
                    if (!StringUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.size() > 0) {
                    a.u.clear();
                    a.u.addAll(arrayList);
                    OLog.i("ConfigCenter", "updateSystemConfig", "probeHosts", a.u);
                }
            }
            String str14 = (String) map2.get(OConstant.SYSKEY_DCVIPS);
            if (!StringUtils.isEmpty(str14) && (parseArray2 = JSON.parseArray(str14, String.class)) != null && parseArray2.size() > 0) {
                a.L.clear();
                a.L.addAll(parseArray2);
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_DCVIPS, a.L);
            }
            String str15 = (String) map2.get(OConstant.SYSKEY_ACKVIPS);
            if (!StringUtils.isEmpty(str15) && (parseArray = JSON.parseArray(str15, String.class)) != null && parseArray.size() > 0) {
                a.N.clear();
                a.N.addAll(parseArray);
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_ACKVIPS, a.N);
            }
            String str16 = (String) map2.get(OConstant.SYSKEY_BIND_TIMEOUT);
            if (!StringUtils.isEmpty(str16)) {
                int parseInt2 = StringUtil.parseInt(str16);
                Context context = a.g;
                if (parseInt2 == 0) {
                    parseInt2 = 3;
                }
                h.a(context, OConstant.SYSKEY_BIND_TIMEOUT, Integer.valueOf(parseInt2));
            }
            String str17 = (String) map2.get(OConstant.SYSKEY_RECOVERY_SERVICE_STATE);
            if (!StringUtils.isEmpty(str17)) {
                h.a(a.g, OConstant.SYSKEY_RECOVERY_SERVICE_STATE, Integer.valueOf(StringUtil.parseInt(str17)));
            }
            String str18 = (String) map2.get(OConstant.SYSKEY_CHANNEL_CONFIGS);
            if (!StringUtils.isEmpty(str18)) {
                h.a(a.g, OConstant.SYSKEY_CHANNEL_CONFIGS, (Object) new HashSet(JSON.parseArray(str18, String.class)));
            }
            String str19 = (String) map2.get(OConstant.SYSKEY_INDEX_CHECK_ENABLE);
            if (!StringUtils.isEmpty(str19)) {
                h.a(a.g, OConstant.SYSKEY_INDEX_CHECK_ENABLE, Boolean.valueOf(Boolean.parseBoolean(str19)));
            }
            String str20 = (String) map2.get(OConstant.SYSKEY_REINIT_SERVICE_DELAY_TIME);
            if (!StringUtils.isEmpty(str20)) {
                long parseLong2 = Long.parseLong(str20);
                if (parseLong2 > 0) {
                    h.a(a.g, OConstant.SYSKEY_REINIT_SERVICE_DELAY_TIME, Long.valueOf(parseLong2));
                    Object[] objArr = new Object[2];
                    i = 0;
                    try {
                        objArr[0] = OConstant.SYSKEY_REINIT_SERVICE_DELAY_TIME;
                        objArr[1] = Long.valueOf(parseLong2);
                        OLog.i("ConfigCenter", "updateSystemConfig", objArr);
                    } catch (Throwable th) {
                        th = th;
                        OLog.e("ConfigCenter", "updateSystemConfig", th, new Object[i]);
                        return;
                    }
                }
            }
            String str21 = (String) map2.get(OConstant.SYSKEY_SERVICE_DELAY_BIND);
            if (!StringUtils.isEmpty(str21)) {
                boolean parseBoolean = Boolean.parseBoolean(str21);
                h.a(a.g, OConstant.SYSKEY_SERVICE_DELAY_BIND, Boolean.valueOf(parseBoolean));
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_SERVICE_DELAY_BIND, Boolean.valueOf(parseBoolean));
            }
            String str22 = (String) map2.get(OConstant.SYSKEY_MAIN_BIND_SERVICE_DELAY_TIME);
            if (!StringUtils.isEmpty(str22)) {
                long parseLong3 = Long.parseLong(str22);
                if (parseLong3 > 0) {
                    h.a(a.g, OConstant.SYSKEY_MAIN_BIND_SERVICE_DELAY_TIME, Long.valueOf(parseLong3));
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = OConstant.SYSKEY_MAIN_BIND_SERVICE_DELAY_TIME;
                    objArr2[1] = Long.valueOf(parseLong3);
                    OLog.i("ConfigCenter", "updateSystemConfig", objArr2);
                }
            }
            String str23 = (String) map2.get(OConstant.SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS);
            if (!StringUtils.isEmpty(str23)) {
                int parseInt3 = Integer.parseInt(str23);
                h.a(a.g, OConstant.SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS, Integer.valueOf(parseInt3));
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS, Integer.valueOf(parseInt3));
            }
            String str24 = (String) map2.get(OConstant.SYSKEY_ENABLE_REMOVE_MAIN_SERVICE);
            if (!StringUtils.isEmpty(str24)) {
                boolean parseBoolean2 = Boolean.parseBoolean(str24);
                h.c(a.g, OConstant.SYSKEY_ENABLE_REMOVE_MAIN_SERVICE, Boolean.valueOf(parseBoolean2));
                OLog.i("ConfigCenter", "updateSystemConfig", OConstant.SYSKEY_ENABLE_REMOVE_MAIN_SERVICE, Boolean.valueOf(parseBoolean2));
            }
            String str25 = (String) map2.get(OConstant.SYSKEY_WAIT_STRATEGY_CALLBACK_TIME);
            if (StringUtils.isEmpty(str25)) {
                return;
            }
            long a2 = com.taobao.orange.util.f.a(str25);
            h.c(a.g, OConstant.SYSKEY_WAIT_STRATEGY_CALLBACK_TIME, Long.valueOf(a2));
            Object[] objArr3 = new Object[2];
            i = 0;
            objArr3[0] = OConstant.SYSKEY_WAIT_STRATEGY_CALLBACK_TIME;
            objArr3[1] = Long.valueOf(a2);
            OLog.i("ConfigCenter", "updateSystemConfig", objArr3);
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
    }

    public long a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j2)})).longValue();
        }
        if (j2 != 0) {
            return com.taobao.orange.util.f.d(a.k) % (j2 * 1000);
        }
        return 0L;
    }

    public void addFails(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260d99c4", new Object[]{this, strArr});
            return;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (!StringUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (this.b) {
            if (this.b.addAll(arrayList) && OLog.isPrintLog(2)) {
                OLog.i("ConfigCenter", "addFails", "namespaces", arrayList);
            }
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (this.b) {
                if (this.b.add(str) && OLog.isPrintLog(2)) {
                    OLog.i("ConfigCenter", "addFail", "namespace", str);
                }
            }
        }
    }

    public void removeFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf6fed3", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (this.b) {
                if (this.b.remove(str) && OLog.isPrintLog(2)) {
                    OLog.i("ConfigCenter", "removeFail", "namespace", str);
                }
            }
        }
    }

    public synchronized void retryFailRequests() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f22e751", new Object[]{this});
            return;
        }
        HashSet<NameSpaceDO> hashSet = new HashSet();
        synchronized (this.b) {
            for (String str : this.b) {
                NameSpaceDO a2 = this.h.a(str);
                if (a2 != null) {
                    hashSet.add(a2);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            OLog.i("ConfigCenter", "retryFailRequests", "start load retryNamespaces", Integer.valueOf(hashSet.size()));
            long currentTimeMillis = System.currentTimeMillis();
            for (NameSpaceDO nameSpaceDO : hashSet) {
                loadConfig(nameSpaceDO);
            }
            OLog.i("ConfigCenter", "retryFailRequests", "finish load retryNamespaces", Integer.valueOf(hashSet.size()), "cost(ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        if (OLog.isPrintLog(1)) {
            OLog.d("ConfigCenter", "retryFailRequests no any", new Object[0]);
        }
    }

    private boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (this.f18536a.get(str) != null) {
            OLog.d("ConfigCenter", "config", str, "is loading");
            return true;
        }
        if (z) {
            this.f18536a.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        return false;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.f18536a.remove(str);
        }
    }

    public void rematchNamespace(final Set<String> set, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407e2605", new Object[]{this, set, new Boolean(z)});
        } else {
            e.a(new Runnable() { // from class: com.taobao.orange.ConfigCenter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (ConfigCenter.this) {
                        if (set != null && !set.isEmpty() && ConfigCenter.this.h.f31344a != null && !ConfigCenter.this.h.f31344a.isEmpty()) {
                            set.addAll(ConfigCenter.this.k);
                            ConfigCenter.this.k.clear();
                            if (OLog.isPrintLog(1)) {
                                OLog.d("ConfigCenter", "rematchNamespace", "<<<<<<<<<<<<<< START >>>>>>>>>>>>>>");
                            }
                            if (OLog.isPrintLog(1)) {
                                OLog.d("ConfigCenter", "rematchNamespace", "candidateKeys", set);
                            }
                            HashSet<String> hashSet = new HashSet();
                            for (String str : set) {
                                Set<String> set2 = ConfigCenter.this.h.f31344a.get(str);
                                if (set2 != null) {
                                    hashSet.addAll(set2);
                                }
                            }
                            if (OLog.isPrintLog(1)) {
                                OLog.d("ConfigCenter", "rematchNamespace", "specialNamespaces", hashSet);
                            }
                            for (String str2 : hashSet) {
                                if (!ConfigCenter.this.i.a().containsKey(str2)) {
                                    OLog.w("ConfigCenter", "rematchNamespace break as not used DEFAULT", "namespace", str2);
                                } else {
                                    ConfigCenter.this.loadConfig(ConfigCenter.this.h.a(str2), z);
                                }
                            }
                            ConfigCenter.b(ConfigCenter.this, true);
                            if (OLog.isPrintLog(1)) {
                                OLog.d("ConfigCenter", "rematchNamespace", "<<<<<<<<<<<<<< END >>>>>>>>>>>>>>");
                            }
                            return;
                        }
                        if (OLog.isPrintLog(3)) {
                            OLog.w("ConfigCenter", "rematchNamespace fail", new Object[0]);
                        }
                        ConfigCenter.this.k.addAll(set);
                    }
                }
            });
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.isAfterIdle.get() && !this.isWaitingIdle.get()) {
            this.isWaitingIdle.set(true);
        } else if (!z && !this.isWaitingIdle.get()) {
        } else {
            if (StringUtils.isEmpty(a.R)) {
                a.R = (String) h.b(a.g, "appVersion", "");
            }
            if (StringUtils.isEmpty(a.S)) {
                a.S = (String) h.b(a.g, "osVersion", "");
            }
            if (!StringUtils.equals(a.R, a.j)) {
                a.R = a.j;
                h.a(a.g, "appVersion", a.R);
            }
            if (StringUtils.equals(a.S, String.valueOf(Build.VERSION.SDK_INT))) {
                return;
            }
            a.S = String.valueOf(Build.VERSION.SDK_INT);
            h.a(a.g, "osVersion", a.S);
        }
    }

    public void delayLoadConfigForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dd6d5", new Object[]{this});
        } else if (!a.G) {
        } else {
            e.a(new Runnable() { // from class: com.taobao.orange.ConfigCenter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (ConfigCenter.this) {
                        if (!ConfigCenter.this.mIsOrangeInit.get()) {
                            ConfigCenter.this.isAfterForeground.compareAndSet(false, true);
                            OLog.w("ConfigCenter", "delayLoadConfigForeground skip as not finish orange init", new Object[0]);
                            return;
                        }
                        if (ConfigCenter.this.isAfterForeground.compareAndSet(false, true)) {
                            Set<NameSpaceDO> e = ConfigCenter.this.h.e();
                            long currentTimeMillis = System.currentTimeMillis();
                            ConfigCenter.a(ConfigCenter.this, e);
                            OLog.e("ConfigCenter", "delayLoadConfigForeground", "size", Integer.valueOf(e.size()), "time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            MultiAnalyze.initBuildInCandidates();
                        }
                    }
                }
            });
        }
    }

    public void delayLoadConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115cf4b2", new Object[]{this});
            return;
        }
        OLog.d("ConfigCenter", "delayLoadConfig", new Object[0]);
        if (!this.mIsOrangeInit.get()) {
            this.isAfterIdle.compareAndSet(false, true);
            OLog.w("ConfigCenter", "delayLoadConfig fail as not finish orange init", new Object[0]);
        } else if (this.isAfterIdle.compareAndSet(false, true)) {
            com.taobao.orange.util.e eVar = new com.taobao.orange.util.e();
            eVar.f18605a.f18606a = this.g;
            eVar.f18605a.b = a.w;
            eVar.f18605a.c = 0;
            eVar.f18605a.d = this.m.get();
            eVar.f18605a.e = com.taobao.orange.util.b.f18599a.get();
            eVar.f18605a.f = com.taobao.orange.util.b.b.get();
            eVar.f18605a.g = com.taobao.orange.util.b.c.get();
            eVar.f18605a.h = com.taobao.orange.util.b.d.get();
            eVar.f18605a.i = com.taobao.orange.util.b.e.get();
            if (getConfigWaitingNetworkQueue() != null) {
                e.a(new Runnable() { // from class: com.taobao.orange.ConfigCenter.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        HashSet<NameSpaceDO> hashSet = new HashSet();
                        while (!ConfigCenter.this.getConfigWaitingNetworkQueue().isEmpty()) {
                            NameSpaceDO poll = ConfigCenter.this.getConfigWaitingNetworkQueue().poll();
                            if (poll != null) {
                                hashSet.add(poll);
                            }
                        }
                        for (NameSpaceDO nameSpaceDO : hashSet) {
                            if (nameSpaceDO != null) {
                                if (OLog.isPrintLog(0)) {
                                    OLog.d("ConfigCenter", "idle load config", "namespace", nameSpaceDO.name);
                                }
                                ConfigCenter.this.loadConfig(nameSpaceDO);
                            }
                        }
                    }
                });
            }
            for (String str : getConfigCache().a().keySet()) {
                final ConfigDO configDO = getConfigCache().a().get(str);
                if (configDO != null && !configDO.persisted) {
                    e.b(new Runnable() { // from class: com.taobao.orange.ConfigCenter.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (OLog.isPrintLog(0)) {
                                OLog.d("ConfigCenter", "idle persist config", "namespace", configDO.name);
                            }
                            ConfigDO configDO2 = configDO;
                            configDO2.persisted = true;
                            com.taobao.orange.util.b.a(configDO2, configDO2.name);
                        }
                    });
                }
            }
            if (!a.G) {
                a(false);
            }
            com.taobao.orange.util.d.a(eVar);
        }
    }

    public void fetchCriticalConfigs(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd888775", new Object[]{this, new Boolean(z)});
            return;
        }
        OLog.i("ConfigCenter", "fetchCriticalConfigs start", OConstant.DIMEN_IS_COLD_STARTUP, Boolean.valueOf(z));
        final com.taobao.orange.sync.e<List<ConfigDO>> eVar = new com.taobao.orange.sync.e<List<ConfigDO>>() { // from class: com.taobao.orange.ConfigCenter.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<com.taobao.orange.model.ConfigDO>, java.lang.Object] */
            @Override // com.taobao.orange.sync.e
            public /* synthetic */ List<ConfigDO> b(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6e4e661f", new Object[]{this, str}) : a(str);
            }

            public List<ConfigDO> a(String str) {
                GenericDeclaration genericDeclaration;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("287b5bd5", new Object[]{this, str});
                }
                if (StringUtils.isEmpty(str)) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                try {
                    JSONObject parseObject = JSON.parseObject(str);
                    ConfigCenter.a(ConfigCenter.this, parseObject.getString("v"));
                    JSONArray jSONArray = parseObject.getJSONArray("configs");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        String string = jSONArray.getJSONObject(i).getString("type");
                        if (NameSpaceDO.TYPE_STANDARD.equals(string)) {
                            genericDeclaration = ConfigDO.class;
                        } else if (!NameSpaceDO.TYPE_CUSTOM.equals(string)) {
                            OLog.e("ConfigCenter", "parse config fail not support type", "type", string);
                            return null;
                        } else {
                            genericDeclaration = CustomConfigDO.class;
                        }
                        ConfigDO configDO = (ConfigDO) jSONArray.getObject(i, genericDeclaration);
                        if (configDO != null) {
                            OLog.e("ConfigCenter", "configDO: " + configDO, new Object[0]);
                            configDO.isCritical = true;
                            arrayList.add(configDO);
                        }
                    }
                } catch (Throwable th) {
                    OLog.e("ConfigCenter", "fetchCriticalConfigs parseResContent", th, new Object[0]);
                    arrayList = null;
                }
                Object[] objArr = new Object[1];
                objArr[0] = arrayList == null ? "0" : Integer.valueOf(arrayList.size());
                OLog.e("ConfigCenter", "fetchCriticalConfigs configsSize", objArr);
                return arrayList;
            }
        };
        eVar.a().g = System.currentTimeMillis();
        this.q = eVar.a().g;
        if (!z) {
            if (this.u > 0 && this.q - this.u < 10000) {
                OLog.e("ConfigCenter", "fetchCriticalConfigs too fast", new Object[0]);
                return;
            }
            this.u = this.q;
            eVar.b = false;
            a(eVar);
            return;
        }
        eVar.b = true;
        if (!d()) {
            OLog.e("ConfigCenter", "just request, no wait strategy callback", new Object[0]);
            e.c(new Runnable() { // from class: com.taobao.orange.ConfigCenter.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ConfigCenter.this.a(eVar);
                    }
                }
            });
            return;
        }
        e.c(new Runnable() { // from class: com.taobao.orange.ConfigCenter.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                OLog.e("ConfigCenter", "delay self request", new Object[0]);
                if (!ConfigCenter.c(ConfigCenter.this).compareAndSet(false, true)) {
                    OLog.e("ConfigCenter", "onReceiveStrategyCallBack is called", new Object[0]);
                } else {
                    ConfigCenter.this.a(eVar);
                }
            }
        }, ((Long) h.d(a.g, OConstant.SYSKEY_WAIT_STRATEGY_CALLBACK_TIME, 100L)).longValue());
        try {
            StrategyCallBackHelper.registerStrategyCallBack(new StrategyCallBackHelper.IStrategyCallBackListener() { // from class: com.taobao.orange.ConfigCenter.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.strategy.StrategyCallBackHelper.IStrategyCallBackListener
                public void onReceiveStrategyCallBack(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77a1e6ad", new Object[]{this, str});
                        return;
                    }
                    OLog.e("ConfigCenter", "onReceiveStrategyCallBack", "host", str);
                    if (!ConfigCenter.c(ConfigCenter.this).compareAndSet(false, true)) {
                        OLog.e("ConfigCenter", "onReceiveStrategyCallBack too late", new Object[0]);
                        return;
                    }
                    eVar.a().f = true;
                    ConfigCenter.this.a(eVar);
                }
            }, eVar.g());
        } catch (Throwable th) {
            OLog.e("ConfigCenter", "registerStrategyCallBack fail as not found networkSdk." + th, new Object[0]);
        }
    }

    public void a(com.taobao.orange.sync.e<List<ConfigDO>> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e79c58", new Object[]{this, eVar});
            return;
        }
        OLog.i("ConfigCenter", "syncCriticalRequest start", new Object[0]);
        List<ConfigDO> c = eVar.c();
        e.a a2 = eVar.a();
        boolean z = eVar.b;
        if (c != null) {
            for (ConfigDO configDO : c) {
                if (configDO != null && this.p.a(configDO)) {
                    com.taobao.orange.util.d.a(configDO.name, configDO.version, configDO.getChangeVersion(), Boolean.valueOf(z), a2.e);
                }
            }
            a2.h = System.currentTimeMillis();
            com.taobao.orange.util.d.a(this.r, "success", a2, z);
            OLog.e("ConfigCenter", "fetchCriticalConfigs success", "v", this.r, "monitorData", JSONObject.toJSON(a2));
            return;
        }
        a2.h = System.currentTimeMillis();
        com.taobao.orange.util.d.a((String) null, "fail", a2, z);
        OLog.e("ConfigCenter", "fetchCriticalConfigs fail", "code", eVar.d(), "msg", eVar.e(), "monitorData", JSONObject.toJSON(a2));
    }

    public boolean a(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9cbe4a7a", new Object[]{this, configDO})).booleanValue() : this.p.b(configDO);
    }

    public boolean cacheCriticalConfig(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c683c7c", new Object[]{this, configDO})).booleanValue() : this.p.a(configDO);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!a.f18576a || !c()) {
        } else {
            try {
                com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.orange.ConfigCenter.19
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.application.common.IApmEventListener
                    public void onEvent(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                        } else if (i != 2) {
                        } else {
                            OLog.e("ConfigCenter", "BACKGROUND_2_FOREGROUND fetch critical start", new Object[0]);
                            ConfigCenter.this.fetchCriticalConfigs(false);
                        }
                    }
                });
            } catch (Throwable th) {
                OLog.w("ConfigCenter", "init", th, "addApmEventListener fail");
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : (a.T & 2) == 0;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : (a.T & 4) != 0;
    }

    public boolean checkCriticalConfigValid(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ceae72c", new Object[]{this, configDO})).booleanValue();
        }
        ConfigDO configDO2 = this.p.a().get(configDO.name);
        long a2 = com.taobao.orange.util.f.a(configDO.getChangeVersion());
        if (configDO2 != null && com.taobao.orange.util.f.a(configDO2.getChangeVersion()) >= a2) {
            OLog.i("ConfigCenter", "changeVersion older than local critical config cache, no need update " + configDO.name, new Object[0]);
            return false;
        }
        ConfigDO configDO3 = this.i.a().get(configDO.name);
        if (configDO3 == null || com.taobao.orange.util.f.a(configDO3.getChangeVersion()) < a2) {
            return true;
        }
        OLog.i("ConfigCenter", "changeVersion older than local config cache, no need update " + configDO.name, new Object[0]);
        return false;
    }

    public org.json.JSONObject getIndexAndConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("886d5cb", new Object[]{this});
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("index", getIndex());
            hashMap.put("config", getAllConfigs());
            return new org.json.JSONObject(hashMap);
        } catch (Exception e) {
            OLog.e("ConfigCenter", "getIndexAndConfigs", e, new Object[0]);
            return null;
        }
    }

    public org.json.JSONObject getAllConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("dcad8e7b", new Object[]{this});
        }
        try {
            Map a2 = com.taobao.orange.util.f.a((Map) this.i.a(), true);
            Map<String, ConfigDO> a3 = this.p.a();
            for (String str : a3.keySet()) {
                ConfigDO configDO = a3.get(str);
                if (configDO != null && !configDO.isExpired.get()) {
                    a2.put(str, configDO);
                }
            }
            return new org.json.JSONObject(JSON.toJSONString(a2));
        } catch (Exception e) {
            OLog.e("ConfigCenter", "getAllConfigs", e, new Object[0]);
            return null;
        }
    }

    public org.json.JSONObject getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("2e9a711", new Object[]{this});
        }
        try {
            IndexDO indexDO = new IndexDO(this.h.b());
            Collections.sort(indexDO.mergedNamespaces, new Comparator<NameSpaceDO>() { // from class: com.taobao.orange.ConfigCenter.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(NameSpaceDO nameSpaceDO, NameSpaceDO nameSpaceDO2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, nameSpaceDO, nameSpaceDO2})).intValue() : a(nameSpaceDO, nameSpaceDO2);
                }

                public int a(NameSpaceDO nameSpaceDO, NameSpaceDO nameSpaceDO2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("10c053bb", new Object[]{this, nameSpaceDO, nameSpaceDO2})).intValue() : nameSpaceDO.name.compareTo(nameSpaceDO2.name);
                }
            });
            return new org.json.JSONObject(JSON.toJSONString(indexDO));
        } catch (Exception e) {
            OLog.e("ConfigCenter", "getIndex", e, new Object[0]);
            return null;
        }
    }
}
