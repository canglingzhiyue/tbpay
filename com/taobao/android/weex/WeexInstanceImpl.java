package com.taobao.android.weex;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import anet.channel.util.HttpConstant;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.mega.MegaModule;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex.util.WeexInstanceChecker;
import com.taobao.android.weex_ability.modules.WeexMegaBridgeModule;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.util.t;
import com.taobao.weex.common.WXConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jtz;
import tb.jua;
import tb.jud;
import tb.juh;
import tb.jus;
import tb.juv;
import tb.juw;
import tb.jux;
import tb.juz;
import tb.jvb;
import tb.kge;
import tb.qnj;

/* loaded from: classes6.dex */
public abstract class WeexInstanceImpl implements WeexInstance, jud {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<Integer, WeakReference<WeexInstanceImpl>> id2InstanceRef;
    private static final AtomicInteger sEngineInfoCallbackId;
    private static Map<Integer, a> sEngineInfoCallbacks;
    public jvb mAdapterMUSInstance;
    public final jtz mApmExtend;
    private String mBundleUrl;
    private Context mContext;
    private Handler mHandler;
    private final com.taobao.android.weex.config.b mInstanceConfig;
    private final boolean mIsAsyncCreate;
    private int mLastInnerHeight;
    private int mLastInnerWidth;
    private int mLastScreenHeight;
    private int mLastScreenWidth;
    private final WeexInstanceInternalMode mMode;
    public final long mNativePtr;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;
    private String mOriginUrl;
    private final WeexRenderType mRenderType;
    private View mRootView;
    private final int mInstanceID = MUSDKInstance.INSTANCE_ID_COUNTER.incrementAndGet();
    private final List<h> mWeexInstanceListeners = new ArrayList();
    private final Map<String, WeexValue> mInstanceEnv = new ConcurrentHashMap();
    private volatile boolean mDestroyed = false;
    public boolean mInitDoneSuccess = false;
    public boolean mRenderDoneSuccess = false;
    private final Map<String, Object> mExtraObject = new ConcurrentHashMap();
    private final Map<String, Pair<WeexModule, juv>> mWeexModules = new HashMap();
    private final ArrayList<Runnable> mGoBackEventCallbacks = new ArrayList<>();
    private MegaModule mMegaModule = null;
    private boolean mRootViewAdded = false;
    private final ConcurrentMap<String, juv> mModuleFactoryMap = new ConcurrentHashMap();
    private final i mWeexModuleInterface = new juw(this);
    private WeexInstanceStatus mMainThreadStatus = WeexInstanceStatus.NOT_INITED;
    private final ConcurrentHashMap<String, WeexValue> mInstanceInfo = new ConcurrentHashMap<>();
    private long mSDKInitTime = 0;
    private final boolean mFixPlatformLifeCycle = com.taobao.android.weex_framework.util.f.a();

    /* loaded from: classes6.dex */
    public interface a {
        void a(WeexValue weexValue);
    }

    public void reportEngineException(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cffa37", new Object[]{this, new Integer(i), str, str2});
        }
    }

    public void reportUnicornScreenInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5377e6eb", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setApmAware(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff36fb0b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setWeexApmCustomData(WeexApmCustomData weexApmCustomData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4043a86", new Object[]{this, weexApmCustomData});
        }
    }

    public static /* synthetic */ boolean access$000(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89431099", new Object[]{weexInstanceImpl})).booleanValue() : weexInstanceImpl.mRootViewAdded;
    }

    public static /* synthetic */ boolean access$002(WeexInstanceImpl weexInstanceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12b4f8a1", new Object[]{weexInstanceImpl, new Boolean(z)})).booleanValue();
        }
        weexInstanceImpl.mRootViewAdded = z;
        return z;
    }

    public static /* synthetic */ Map access$100(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("49d7e4b", new Object[]{weexInstanceImpl}) : weexInstanceImpl.mWeexModules;
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e220286e", new Object[0]) : sEngineInfoCallbacks;
    }

    static {
        kge.a(-307337615);
        kge.a(-17477455);
        kge.a(1540909049);
        id2InstanceRef = new ConcurrentHashMap();
        sEngineInfoCallbackId = new AtomicInteger();
        sEngineInfoCallbacks = new ConcurrentHashMap();
    }

    public static WeexInstanceImpl queryInstance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceImpl) ipChange.ipc$dispatch("d8148395", new Object[]{new Integer(i)});
        }
        WeakReference<WeexInstanceImpl> weakReference = id2InstanceRef.get(Integer.valueOf(i));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public WeexInstanceImpl(g gVar) {
        long j = 0;
        InitBeforeInstanceCreate(gVar.f15864a);
        if (gVar.g == null) {
            this.mInstanceConfig = new com.taobao.android.weex.config.b();
        } else {
            this.mInstanceConfig = gVar.g;
        }
        this.mIsAsyncCreate = gVar.k;
        gVar.f = createInitOptions(gVar.f15864a, gVar.f, gVar.g, this.mIsAsyncCreate);
        if (gVar.h != null && gVar.h.isDestroyed()) {
            throw new IllegalStateException("Create Instance when parent isDestroyed()");
        }
        if (gVar.i != null && gVar.i.isDestroyed()) {
            throw new IllegalStateException("Create Instance when embedParent isDestroyed()");
        }
        this.mMode = gVar.d;
        this.mRenderType = gVar.e;
        this.mBundleUrl = gVar.b;
        this.mContext = gVar.f15864a;
        com.taobao.android.weex_framework.util.s.a("CreateCInstance");
        if (gVar.h != null) {
            com.taobao.android.weex.util.c.a(!this.mIsAsyncCreate);
            this.mNativePtr = WeexPlatformInstanceBridge.createInstanceChild(this, gVar.b, gVar.c, this.mMode.ordinal(), gVar.h.mNativePtr, WeexValueImpl.ofJSON(gVar.f), gVar.i != null ? gVar.i.mNativePtr : j, gVar.j);
        } else if (gVar.i != null) {
            this.mNativePtr = WeexPlatformInstanceBridge.createInstanceEmbed(this, gVar.b, gVar.c, gVar.i.mNativePtr, gVar.j, WeexValueImpl.ofJSON(gVar.f));
        } else {
            this.mNativePtr = WeexPlatformInstanceBridge.createInstance(this, gVar.b, gVar.c, gVar.d.ordinal(), gVar.e.getCppIndex(), WeexValueImpl.ofJSON(gVar.f));
        }
        com.taobao.android.weex_framework.util.s.b("CreateCInstance");
        WeexInstanceChecker.a().a(this, this.mIsAsyncCreate);
        id2InstanceRef.put(Integer.valueOf(this.mInstanceID), new WeakReference<>(this));
        this.mApmExtend = new jtz(this);
    }

    public void initAfterCreate() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f13174f", new Object[]{this});
            return;
        }
        if (getAdapterMUSInstance() != null) {
            z = true;
        }
        com.taobao.android.weex.util.c.a(z);
        WeexPlatformInstanceBridge.initAfterCreate(this.mNativePtr, this);
    }

    public static void postInstanceCreate(WeexInstanceImpl weexInstanceImpl, jvb jvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2471eb0", new Object[]{weexInstanceImpl, jvbVar});
            return;
        }
        jvbVar.a(weexInstanceImpl);
        weexInstanceImpl.bindMUSAdapterInstance(jvbVar);
        weexInstanceImpl.initAfterCreate();
        jvbVar.e();
    }

    public boolean isSettingEnable(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1786195e", new Object[]{this, str, new Boolean(z)})).booleanValue() : isDestroyed() ? z : WeexPlatformInstanceBridge.isSettingEnable(this.mNativePtr, str, z);
    }

    public boolean isAsyncCreate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("189aac99", new Object[]{this})).booleanValue() : this.mIsAsyncCreate;
    }

    public ArrayList<String> getRenderEngineOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("bfe373b1", new Object[]{this});
        }
        if (isDestroyed()) {
            return new ArrayList<>();
        }
        return WeexPlatformInstanceBridge.getRenderEngineOptions(this.mNativePtr);
    }

    public void reportTaskLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c163fc", new Object[]{this, str});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.reportTaskLog(this.mNativePtr, 0, str);
        }
    }

    private void InitBeforeInstanceCreate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa756c81", new Object[]{this, context});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean b2 = d.b((Application) context.getApplicationContext());
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (b2) {
            this.mSDKInitTime = uptimeMillis2;
        }
        if (com.taobao.android.weex_framework.m.b == null || !MUSEngine.isInitDone()) {
            throw new IllegalStateException("Init not done when create WeexInstance");
        }
        MUSEngine.registerZCacheAccessApi();
    }

    public JSONObject createInitOptions(Context context, JSONObject jSONObject, com.taobao.android.weex.config.b bVar, boolean z) {
        WeexUnicornConfig a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a29e3734", new Object[]{this, context, jSONObject, bVar, new Boolean(z)});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        if (bVar != null && bVar.a() != null && (a2 = bVar.a()) != null) {
            jSONObject2.put("transparent", (Object) Boolean.valueOf(a2.a()));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("devicePixelRatio", (Object) Float.valueOf(com.taobao.android.weex_framework.m.g()));
        updateInstanceScreenSize(context, false);
        float a3 = com.taobao.android.weex_framework.util.i.a(context, this.mLastScreenWidth);
        float a4 = com.taobao.android.weex_framework.util.i.a(context, this.mLastScreenHeight);
        jSONObject3.put(WXConfig.deviceWidth, (Object) Float.valueOf(a3));
        jSONObject3.put(WXConfig.deviceHeight, (Object) Float.valueOf(a4));
        int a5 = com.taobao.android.weex_framework.util.l.a(context);
        if (a5 < 0) {
            a5 = 0;
        }
        jSONObject3.put("statusBarHeight", (Object) Float.valueOf(com.taobao.android.weex_framework.util.i.a(context, a5)));
        jSONObject3.put("navBarHeight", (Object) Float.valueOf(com.taobao.android.weex_framework.util.i.a(context, com.taobao.android.weex_framework.util.l.b(context))));
        if (jSONObject2.getJSONObject("render_param") != null) {
            jSONObject3.putAll(jSONObject2.getJSONObject("render_param"));
        }
        jSONObject2.put("render_param", (Object) jSONObject3);
        jSONObject2.put("async_create", (Object) Boolean.valueOf(z));
        jSONObject2.put("new_life_cycle", (Object) Boolean.valueOf(this.mFixPlatformLifeCycle));
        return jSONObject2;
    }

    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue() : this.mDestroyed;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setTag(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8389e805", new Object[]{this, str, obj});
        } else {
            this.mExtraObject.put(str, obj);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public Object getTag(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d763d7dd", new Object[]{this, str}) : this.mExtraObject.get(str);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public Map<String, Object> getInstanceTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5acbf240", new Object[]{this}) : this.mExtraObject;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public synchronized void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            this.mDestroyed = true;
            com.taobao.android.weex_framework.util.r.a(getInstanceId(), UMLLCons.FEATURE_TYPE_PAGE, "destroyStartInJava").a();
            WeexPlatformInstanceBridge.destroy(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public int getInstanceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd985600", new Object[]{this})).intValue() : this.mInstanceID;
    }

    public long getSDKInitTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3643b91c", new Object[]{this})).longValue() : this.mSDKInitTime;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        WeexInstanceChecker.a().c(this);
        ((juw) this.mWeexModuleInterface).b();
        if (isDestroyed()) {
            return;
        }
        if (this.mFixPlatformLifeCycle) {
            WeexPlatformInstanceBridge.pageShow(this.mNativePtr);
        } else {
            WeexPlatformInstanceBridge.pageForeground(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        WeexInstanceChecker.a().d(this);
        if (com.taobao.android.weex_framework.l.a().m() != null) {
            com.taobao.android.weex_framework.l.a().m();
            getInstanceId();
        }
        ((juw) this.mWeexModuleInterface).c();
        if (!this.mFixPlatformLifeCycle || isDestroyed()) {
            return;
        }
        WeexPlatformInstanceBridge.viewAppear(this.mNativePtr);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        WeexInstanceChecker.a().e(this);
        ((juw) this.mWeexModuleInterface).d();
        if (!this.mFixPlatformLifeCycle || isDestroyed()) {
            return;
        }
        WeexPlatformInstanceBridge.viewDisappear(this.mNativePtr);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        WeexInstanceChecker.a().f(this);
        ((juw) this.mWeexModuleInterface).e();
        if (isDestroyed()) {
            return;
        }
        if (this.mFixPlatformLifeCycle) {
            WeexPlatformInstanceBridge.pageHide(this.mNativePtr);
        } else {
            WeexPlatformInstanceBridge.pageBackground(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onActivityResult(final int i, final int i2, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ((juw) this.mWeexModuleInterface).a(i, i2, intent);
        this.mHandler.post(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!WeexInstanceImpl.this.isDestroyed()) {
                    for (final MUSModule mUSModule : WeexInstanceImpl.this.getAdapterMUSInstance().c().values()) {
                        com.taobao.android.weex_framework.util.j.b(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.weex_framework.util.o
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else if (WeexInstanceImpl.this.isDestroyed()) {
                                } else {
                                    mUSModule.onActivityResult(i, i2, intent);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.viewAppear(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.viewDisappear(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        } else if (this.mContext == context) {
        } else {
            WeexInstanceChecker.a().a(this.mContext, context, this);
            this.mContext = context;
            if (getAdapterMUSInstance().getContext().a() == context) {
                return;
            }
            getAdapterMUSInstance().getContext().b(context);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == jud.class) {
            return this;
        }
        if (cls == jtz.class) {
            return (T) this.mApmExtend;
        }
        if (cls != jua.class) {
            return null;
        }
        return (T) this.mApmExtend;
    }

    public WeexModule buildModuleWithCache(String str, juv juvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexModule) ipChange.ipc$dispatch("df2cefe5", new Object[]{this, str, juvVar});
        }
        try {
            WeexModule a2 = juvVar.a(str, this);
            a2.onInit(str, getWeexModuleInterface());
            addModule(str, a2, juvVar);
            return a2;
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a("module", str + " module build instance failed.", e, "Module: " + str + " 构造报错, 查看adb log修复");
            return null;
        }
    }

    public final Pair<WeexModule, juv> ensureModuleAndFactory(String str) {
        WeexModule buildModuleWithCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("715dd8b8", new Object[]{this, str});
        }
        Pair<WeexModule, juv> pair = this.mWeexModules.get(str);
        if (pair != null) {
            return pair;
        }
        juv<?> juvVar = this.mModuleFactoryMap.get(str);
        if (juvVar == null) {
            juvVar = jux.a(str);
        }
        if (juvVar == null || (buildModuleWithCache = buildModuleWithCache(str, juvVar)) == null) {
            return null;
        }
        Pair<WeexModule, juv> create = Pair.create(buildModuleWithCache, juvVar);
        this.mWeexModules.put(str, create);
        if (WeexMegaBridgeModule.NAME.equals(str) && (buildModuleWithCache instanceof MegaModule)) {
            this.mMegaModule = (MegaModule) buildModuleWithCache;
        }
        return create;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public WeexValue requireModule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("8a1075fe", new Object[]{this, str});
        }
        Pair<WeexModule, juv> ensureModuleAndFactory = ensureModuleAndFactory(str);
        if (ensureModuleAndFactory != null) {
            return WeexValueImpl.ofJSONArray(((juv) ensureModuleAndFactory.second).a());
        }
        return com.taobao.android.weex_framework.module.a.c(str);
    }

    public WeexValue callModule(final String str, final String str2, final WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("31c99b58", new Object[]{this, str, str2, weexValueArr});
        }
        MUSMonitor.a(str, str2, getBundleUrl());
        Pair<WeexModule, juv> ensureModuleAndFactory = ensureModuleAndFactory(str);
        if (ensureModuleAndFactory != null) {
            final WeexModule weexModule = (WeexModule) ensureModuleAndFactory.first;
            if (weexModule instanceof WeexInnerModule) {
                try {
                    return ((WeexInnerModule) weexModule).callModuleMethod(this, str, str2, weexValueArr);
                } catch (Throwable th) {
                    com.taobao.android.weex_framework.util.g.a("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", th, "Module: " + str + "<" + weexModule.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                    return null;
                }
            }
            final jus<T> a2 = ((juv) ensureModuleAndFactory.second).a(str2);
            if (a2 == 0) {
                com.taobao.android.weex_framework.util.g.c("[Module] callModuleMethod " + str + "#" + str2 + "() is not defined");
                return null;
            } else if (a2.a() == MUSThreadStrategy.JS) {
                try {
                    return WeexValueImpl.convert(a2.a(this, weexModule, weexValueArr));
                } catch (Throwable th2) {
                    com.taobao.android.weex_framework.util.g.a("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", th2, "Module: " + str + "<" + weexModule.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                    return null;
                }
            } else {
                com.taobao.android.weex_framework.util.j.b(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        try {
                            a2.a(WeexInstanceImpl.this, weexModule, weexValueArr);
                        } catch (Throwable th3) {
                            com.taobao.android.weex_framework.util.g.a("[Module]", "callModuleMethod " + str + "#" + str2 + "() error", th3, "Module: " + str + "<" + weexModule.getClass().getSimpleName() + "> 调用报错, 查看adb log修复");
                        }
                    }
                });
                return null;
            }
        }
        return getAdapterMUSInstance().a(str, str2, weexValueArr);
    }

    public WeexValue callMega(boolean z, String str, String str2, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("d182dfa4", new Object[]{this, new Boolean(z), str, str2, weexValueArr});
        }
        try {
            if (this.mMegaModule == null) {
                ensureModuleAndFactory(WeexMegaBridgeModule.NAME);
            }
            if (this.mMegaModule == null) {
                com.taobao.android.weex_framework.util.g.d("call Mega error");
                return null;
            }
            JSONObject jSONObjectOrNull = weexValueArr.length > 0 ? weexValueArr[0].toJSONObjectOrNull() : null;
            if (z) {
                return this.mMegaModule.syncCall(str, str2, jSONObjectOrNull);
            }
            this.mMegaModule.asyncCall(str, str2, jSONObjectOrNull, weexValueArr.length > 1 ? weexValueArr[1].toFunctionOrNull(this) : null);
            return null;
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.a("callMega error", th);
            return null;
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void registerModule(String str, Class<? extends WeexModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e316fd", new Object[]{this, str, cls});
        } else if (StringUtils.isEmpty(str) || cls == null) {
            com.taobao.android.weex_framework.util.g.d("register module illegal");
        } else {
            if (this.mModuleFactoryMap.containsKey(str)) {
                com.taobao.android.weex_framework.util.g.c("register module twice,Module name is  " + str);
            }
            if (WeexInnerModule.class.isAssignableFrom(cls)) {
                com.taobao.android.weex.util.c.a(false, "Subclass of WeexInnerModule should use registerInnerModule to register");
            } else {
                this.mModuleFactoryMap.put(str, new juz(cls));
            }
        }
    }

    public void registerInnerModule(String str, Class<? extends WeexInnerModule> cls, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53d79d2", new Object[]{this, str, cls, strArr});
        } else if (StringUtils.isEmpty(str) || cls == null) {
            com.taobao.android.weex_framework.util.g.d("register module illegal");
        } else {
            if (this.mModuleFactoryMap.containsKey(str)) {
                com.taobao.android.weex_framework.util.g.c("register module twice,Module name is  " + str);
            }
            com.taobao.android.weex.util.c.a(WeexInnerModule.class.isAssignableFrom(cls), "registerInnerModule only support WeexInnerModule");
            this.mModuleFactoryMap.put(str, new qnj(cls, strArr));
        }
    }

    public void onInitCalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c6ba73", new Object[]{this});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.INITED;
        if (this.mNativePtr != 0) {
            return;
        }
        initFailed(false, WeexErrorType.FATAL_ERR.ordinal(), "Instance create failed, may not have render engine!");
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void initWithEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446f0dfe", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.initWithEmpty(this.mNativePtr);
            onInitCalled();
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void initWithData(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295d5098", new Object[]{this, bArr, str});
        } else if (isDestroyed()) {
        } else {
            t.a(getInstanceId(), com.taobao.android.weex_framework.adapter.e.RECORD_INIT_WITH_DATA, bArr, str, this);
            WeexPlatformInstanceBridge.initWithData(this.mNativePtr, bArr, str);
            onInitCalled();
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void initWithURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f58d6a", new Object[]{this, str});
        } else if (isDestroyed()) {
        } else {
            t.a(getInstanceId(), "environment", str, this.mInstanceEnv, com.taobao.android.weex_framework.m.e(), this);
            WeexPlatformInstanceBridge.initWithURL(this.mNativePtr, str);
            onInitCalled();
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void render(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c13e4f", new Object[]{this, weexValue});
        } else if (isDestroyed()) {
        } else {
            t.a(getInstanceId(), "render", weexValue);
            WeexPlatformInstanceBridge.render(this.mNativePtr, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void execute(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a4be4d", new Object[]{this, bArr, str});
        } else if (isDestroyed()) {
        } else {
            t.a(getInstanceId(), com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, bArr, str);
            WeexPlatformInstanceBridge.execute(this.mNativePtr, bArr, str);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void dispatchEvent(WeexEventTarget weexEventTarget, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef416b17", new Object[]{this, weexEventTarget, str, weexValue});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.dispatchEvent(this.mNativePtr, weexEventTarget.getEventTarget(), str, weexValue);
        }
    }

    public void fireEvent(int i, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de828baa", new Object[]{this, new Integer(i), str, weexValue});
        } else {
            dispatchNodeEvent(i, str, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void dispatchNodeEvent(int i, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acde1384", new Object[]{this, new Integer(i), str, weexValue});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.fireEvent(this.mNativePtr, i, str, weexValue);
        }
    }

    public void invokeCallback(int i, WeexValue[] weexValueArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f9249e", new Object[]{this, new Integer(i), weexValueArr, new Boolean(z)});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.invokeCallback(this.mNativePtr, i, weexValueArr, z);
        }
    }

    public void legacyDispatchWindVaneEvent(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bc56ae", new Object[]{this, str, weexValue});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.legacyDispatchWindVaneEvent(this.mNativePtr, str, weexValue);
        }
    }

    @Override // tb.jud
    public void fireGlobalEvent(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f2457f", new Object[]{this, str, objArr});
            return;
        }
        int length = objArr != null ? objArr.length : 0;
        WeexValue[] weexValueArr = new WeexValue[length];
        for (int i = 0; i < length; i++) {
            weexValueArr[i] = WeexValueImpl.convert(objArr[i]);
        }
        legacyFireGlobalEvent(str, weexValueArr);
    }

    public void legacyFireGlobalEvent(String str, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d743180", new Object[]{this, str, weexValueArr});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.legacyFireGlobalEvent(this.mNativePtr, str, weexValueArr);
        }
    }

    public void legacyCallNativeUINode(int i, String str, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa4c989", new Object[]{this, new Integer(i), str, weexValueArr});
        } else if (isDestroyed()) {
        } else {
            if (Looper.myLooper() != getJSThreadHandler().getLooper()) {
                z = false;
            }
            com.taobao.android.weex.util.c.a(z);
            WeexPlatformInstanceBridge.legacyCallNativeUINode(this.mNativePtr, i, str, weexValueArr);
        }
    }

    public void removeCallback(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5474f013", new Object[]{this, new Integer(i)});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.removeCallback(this.mNativePtr, i);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateContainerSize(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd13ade0", new Object[]{this, new Float(f), new Float(f2)});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.updateContainerSize(this.mNativePtr, com.taobao.android.weex_framework.util.i.a(this.mContext, f), com.taobao.android.weex_framework.util.i.a(this.mContext, f2));
        }
    }

    public void updateScreenSize(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e54e3", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.updateScreenSize(this.mNativePtr, com.taobao.android.weex_framework.util.i.a(this.mContext, f), com.taobao.android.weex_framework.util.i.a(this.mContext, f2), f3);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateRTL(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fb3eec", new Object[]{this, new Boolean(z)});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.updateRTL(this.mNativePtr, z);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateBaseFontSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc2000f", new Object[]{this, new Float(f)});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.updateBaseFontSize(this.mNativePtr, f);
        }
    }

    public void updateBundleUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c37fe55", new Object[]{this, str});
        } else if (isDestroyed()) {
        } else {
            this.mBundleUrl = str;
            this.mOriginUrl = null;
            jtz jtzVar = (jtz) getExtend(jtz.class);
            if (jtzVar != null) {
                jtzVar.a(str);
            }
            WeexPlatformInstanceBridge.updateBundleUrl(this.mNativePtr, str);
        }
    }

    public String getOriginURLString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5feb1d5", new Object[]{this});
        }
        String str = this.mOriginUrl;
        if (str != null) {
            return str;
        }
        String bundleUrl = getBundleUrl();
        if (StringUtils.isEmpty(bundleUrl)) {
            this.mOriginUrl = "";
            return "";
        }
        Uri parse = Uri.parse(bundleUrl);
        StringBuilder sb = new StringBuilder();
        if (parse.isHierarchical()) {
            sb.append(parse.getScheme());
            sb.append(HttpConstant.SCHEME_SPLIT);
            sb.append(parse.getAuthority());
        }
        String sb2 = sb.toString();
        this.mOriginUrl = sb2;
        return sb2;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateInstanceEnv(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d105ac", new Object[]{this, str, weexValue});
        } else if (isDestroyed()) {
        } else {
            this.mInstanceEnv.put(str, weexValue);
            WeexPlatformInstanceBridge.updateInstanceEnv(this.mNativePtr, str);
        }
    }

    public WeexValue getInstanceEnv(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexValue) ipChange.ipc$dispatch("2b4079af", new Object[]{this, str}) : this.mInstanceEnv.get(str);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public synchronized View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        if (this.mRootView == null) {
            this.mRootView = new FrameLayout(getContext());
            this.mRootView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addOnLayoutChangeListener(this.mRootView);
        }
        return this.mRootView;
    }

    public View getRootViewWithoutCreate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8e1d7c90", new Object[]{this}) : this.mRootView;
    }

    public void addOnLayoutChangeListener(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c801945d", new Object[]{this, view});
        } else if (this.mOnLayoutChangeListener != null) {
        } else {
            this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.taobao.android.weex.WeexInstanceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    WeexInstanceImpl.this.updateContainerSizeOnLayoutChange(i3 - i, i4 - i2);
                    WeexInstanceImpl weexInstanceImpl = WeexInstanceImpl.this;
                    weexInstanceImpl.updateInstanceScreenSize(weexInstanceImpl.getContext(), true);
                    if (WeexInstanceImpl.access$000(WeexInstanceImpl.this)) {
                        return;
                    }
                    WeexInstanceImpl.access$002(WeexInstanceImpl.this, true);
                    if (WeexInstanceImpl.this.isDestroyed()) {
                        return;
                    }
                    WeexPlatformInstanceBridge.onRootViewFirstAdded(WeexInstanceImpl.this.mNativePtr);
                }
            };
            view.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
    }

    public void updateInstanceScreenSize(Context context, boolean z) {
        int e;
        int g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b42a3e", new Object[]{this, context, new Boolean(z)});
        } else if (context == null) {
        } else {
            if ((context instanceof Activity) && com.taobao.android.weex_framework.l.a().n() != null) {
                Rect a2 = com.taobao.android.weex_framework.l.a().n().a((Activity) context);
                e = a2.right - a2.left;
                g = a2.bottom - a2.top;
            } else {
                e = com.taobao.android.weex_framework.util.l.e(context);
                g = com.taobao.android.weex_framework.util.l.g(context);
            }
            if (this.mInstanceConfig.c() != null) {
                Rect a3 = this.mInstanceConfig.c().a();
                e = a3.right - a3.left;
                g = a3.bottom - a3.top;
            }
            if (this.mLastScreenWidth == e && this.mLastScreenHeight == g) {
                return;
            }
            if (z) {
                updateScreenSize(e, g, com.taobao.android.weex_framework.util.l.c(context));
            }
            this.mLastScreenWidth = e;
            this.mLastScreenHeight = g;
        }
    }

    public void updateContainerSizeOnLayoutChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0b8ad9", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == this.mLastInnerWidth && i2 == this.mLastInnerHeight) {
        } else {
            this.mLastInnerWidth = i;
            this.mLastInnerHeight = i2;
            updateContainerSize(this.mLastInnerWidth, this.mLastInnerHeight);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void addInstanceListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b333a3", new Object[]{this, hVar});
        } else {
            this.mWeexInstanceListeners.add(hVar);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void removeInstanceListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a455d60", new Object[]{this, hVar});
        } else {
            this.mWeexInstanceListeners.remove(hVar);
        }
    }

    public void addGoBackEventCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ebe174", new Object[]{this, runnable});
        } else {
            this.mGoBackEventCallbacks.add(runnable);
        }
    }

    public void clearGoBackEventCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a83197", new Object[]{this});
        } else {
            this.mGoBackEventCallbacks.clear();
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue() : this.mGoBackEventCallbacks.size() > 0;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.mGoBackEventCallbacks.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public void initSucceed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5abb5b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mInitDoneSuccess = true;
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onInitSuccess(this, z);
        }
    }

    public void initFailed(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179d342d", new Object[]{this, new Boolean(z), new Integer(i), str});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.INVALID;
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onInitFailed(this, z, WeexErrorType.transformErrorType(i), str);
        }
    }

    public void renderSucceed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971ffee1", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.mMainThreadStatus = WeexInstanceStatus.RENDERED;
        }
        this.mRenderDoneSuccess = true;
        if (com.taobao.android.weex_framework.l.a().m() != null) {
            com.taobao.android.weex_framework.l.a().m();
        }
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onRenderSuccess(this, z);
        }
    }

    public void renderFailed(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be6e233", new Object[]{this, new Boolean(z), new Integer(i), str});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.INVALID;
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onRenderFailed(this, z, WeexErrorType.transformErrorType(i), str);
        }
    }

    public void executeSucceed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716eb714", new Object[]{this});
            return;
        }
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onExecuteSuccess(this);
        }
    }

    public void executeFailed(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72849d4", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.INVALID;
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onExecuteFailed(this, WeexErrorType.transformErrorType(i), str);
        }
    }

    public void scriptException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6b39e2", new Object[]{this, new Integer(i), str});
            return;
        }
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onScriptException(this, WeexErrorType.transformErrorType(i), str);
        }
    }

    public void engineException(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b81c759", new Object[]{this, new Integer(i), str});
            return;
        }
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onEngineException(this, WeexErrorType.transformErrorType(i), str);
        }
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee20482", new Object[]{this}) : this.mBundleUrl;
    }

    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
            return;
        }
        this.mDestroyed = true;
        id2InstanceRef.remove(Integer.valueOf(this.mInstanceID));
        WeexInstanceChecker.a().b(this);
    }

    private void destroyModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6651608d", new Object[]{this});
            return;
        }
        this.mHandler.post(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                final HashMap hashMap = new HashMap(WeexInstanceImpl.access$100(WeexInstanceImpl.this));
                for (Pair pair : hashMap.values()) {
                    try {
                        ((WeexModule) pair.first).onJSThreadDestroy();
                    } catch (Throwable th) {
                        com.taobao.android.weex_framework.util.g.c("[Module]", "onJSThreadDestroy exception:", th);
                    }
                }
                com.taobao.android.weex_framework.util.j.a(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        for (Pair pair2 : hashMap.values()) {
                            try {
                                ((WeexModule) pair2.first).onMainThreadDestroy();
                            } catch (Throwable th2) {
                                com.taobao.android.weex_framework.util.g.c("[Module]", "onMainThreadDestroy exception:", th2);
                            }
                        }
                    }
                });
            }
        });
        this.mHandler.post(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                final HashMap hashMap = new HashMap(WeexInstanceImpl.this.getAdapterMUSInstance().c());
                com.taobao.android.weex_framework.util.j.a(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.5.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        for (MUSModule mUSModule : hashMap.values()) {
                            mUSModule.destroy();
                        }
                    }
                });
            }
        });
    }

    public void onJSDestroyPostDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3257245b", new Object[]{this});
        } else {
            destroyModule();
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mMainThreadStatus = WeexInstanceStatus.DESTROYED;
        for (h hVar : this.mWeexInstanceListeners) {
            hVar.onDestroyed(this);
        }
        if (com.taobao.android.weex_framework.l.a().m() != null) {
            com.taobao.android.weex_framework.l.a().m();
            getInstanceId();
        }
        this.mApmExtend.a().a();
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            final long j = this.mNativePtr;
            com.taobao.android.weex_framework.util.j.c(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.WeexInstanceImpl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WeexPlatformInstanceBridge.finalizeCInstance(j);
                    }
                }
            });
        } catch (Throwable th) {
            Log.e(com.taobao.android.weex_framework.util.g.TAG, "err finalize", th);
        }
    }

    public void bindMUSAdapterInstance(jvb jvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb7a777", new Object[]{this, jvbVar});
        } else {
            this.mAdapterMUSInstance = jvbVar;
        }
    }

    public jvb getAdapterMUSInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvb) ipChange.ipc$dispatch("9ce0a342", new Object[]{this}) : this.mAdapterMUSInstance;
    }

    public i getWeexModuleInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("70c90a00", new Object[]{this}) : this.mWeexModuleInterface;
    }

    public void debugShowInstanceTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d186", new Object[]{this, str});
        } else if (Build.VERSION.SDK_INT < 23 || getRootView() == null) {
        } else {
            Drawable foreground = getRootView().getForeground();
            if (foreground == null) {
                getRootView().setForeground(new com.taobao.android.weex_framework.devtool.b(str, -13261794, 25));
            } else if (!(foreground instanceof com.taobao.android.weex_framework.devtool.b)) {
            } else {
                ((com.taobao.android.weex_framework.devtool.b) foreground).b(str);
            }
        }
    }

    public void bindJSThread(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16d5a27", new Object[]{this, handler});
        } else {
            this.mHandler = handler;
        }
    }

    public com.taobao.android.weex.config.b getInstanceConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex.config.b) ipChange.ipc$dispatch("72832521", new Object[]{this}) : this.mInstanceConfig;
    }

    @Deprecated
    public Handler getJSThreadHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("2981e4be", new Object[]{this}) : this.mHandler;
    }

    public void updateInstanceInfo(String str, WeexValueImpl weexValueImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92bb5bcf", new Object[]{this, str, weexValueImpl});
        } else {
            this.mInstanceInfo.put(str, weexValueImpl);
        }
    }

    public ConcurrentHashMap<String, WeexValue> getInstanceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("c736c686", new Object[]{this}) : this.mInstanceInfo;
    }

    public void addModule(String str, WeexModule weexModule, juv juvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143083ea", new Object[]{this, str, weexModule, juvVar});
        } else {
            this.mWeexModules.put(str, new Pair<>(weexModule, juvVar));
        }
    }

    public Pair<WeexModule, juv> getModuleWithFactory(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("f2589b3d", new Object[]{this, str}) : this.mWeexModules.get(str);
    }

    @Override // com.taobao.android.weex.WeexInstance
    public WeexInstanceStatus getInstanceStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstanceStatus) ipChange.ipc$dispatch("bd9ef07e", new Object[]{this}) : this.mMainThreadStatus;
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void dispatchExternalEvent(n nVar) throws WeexExternalEventCheckException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e109872", new Object[]{this, nVar});
            return;
        }
        juh juhVar = (juh) getExtend(juh.class);
        if (juhVar == null) {
            return;
        }
        juhVar.a(nVar);
    }

    public WeexInstanceInternalMode getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstanceInternalMode) ipChange.ipc$dispatch("a9c4db4", new Object[]{this}) : this.mMode;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "WeexInstance<" + this.mMode.toString() + ">(" + getInstanceId() + "){ " + com.taobao.android.weex.util.b.c(getBundleUrl()) + " }";
    }

    public void dumpEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cac2dd", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.dumpRenderTree(this.mNativePtr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void setInstanceData(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55512e24", new Object[]{this, weexValue});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.setInstanceData(this.mNativePtr, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateInstanceData(String str, String str2, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe48c49", new Object[]{this, str, str2, weexValue});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.updateInstanceData(this.mNativePtr, str, str2, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstance
    public void updateRenderEnvironments(o oVar) {
        double d;
        double d2;
        double d3;
        double d4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6288cca7", new Object[]{this, oVar});
        } else if (isDestroyed() || oVar == null) {
        } else {
            p d5 = oVar.d();
            if (oVar.d() != null) {
                double a2 = d5.a();
                double b2 = d5.b();
                double c = d5.c();
                d4 = d5.d();
                d = a2;
                d2 = b2;
                d3 = c;
            } else {
                d = -1.0d;
                d2 = -1.0d;
                d3 = -1.0d;
                d4 = -1.0d;
            }
            WeexPlatformInstanceBridge.updateRenderEnvironments(this.mNativePtr, oVar.a(), oVar.b(), oVar.c(), d, d2, d3, d4);
        }
    }

    public void getEngineInfoAsync(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45822687", new Object[]{this, new Integer(i), aVar});
            return;
        }
        int incrementAndGet = sEngineInfoCallbackId.incrementAndGet();
        sEngineInfoCallbacks.put(Integer.valueOf(incrementAndGet), aVar);
        WeexPlatformInstanceBridge.getEngineInfoAsync(this.mNativePtr, i, incrementAndGet);
        com.taobao.android.weex_framework.util.j.b(new b(incrementAndGet), 10000);
    }

    public static void getEngineInfoAsyncCallback(int i, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37fad2b", new Object[]{new Integer(i), weexValue});
            return;
        }
        a remove = sEngineInfoCallbacks.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        remove.a(weexValue);
    }

    /* loaded from: classes6.dex */
    public static class b extends com.taobao.android.weex_framework.util.o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f15844a;

        static {
            kge.a(-1718192535);
        }

        public b(int i) {
            this.f15844a = i;
        }

        @Override // com.taobao.android.weex_framework.util.o
        public void a() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            a aVar = (a) WeexInstanceImpl.access$200().remove(Integer.valueOf(this.f15844a));
            if (aVar == null) {
                return;
            }
            aVar.a(WeexValueImpl.ofUndefined());
        }
    }
}
