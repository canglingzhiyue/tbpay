package com.taobao.android.icart.engine;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.MessageQueue;
import android.os.Process;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.UltronICartFragment;
import com.taobao.android.icart.utils.d;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.e;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.aat;
import tb.abj;
import tb.bci;
import tb.bed;
import tb.eds;
import tb.fpy;
import tb.ieu;
import tb.jpr;
import tb.jpt;
import tb.jqg;
import tb.jqh;
import tb.jqi;
import tb.kge;
import tb.qgs;

/* loaded from: classes5.dex */
public class CartVEngineFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CartVEngineFactory";
    private static final AtomicBoolean initAtomic;
    private static volatile boolean isPrefetchError;
    private static volatile boolean isPrefetchSuccess;
    private static final AtomicBoolean lifecycleAtomic;
    private static final Map<Integer, aat> mMap;
    private static final Object object;
    private static final AtomicInteger prefetchCount;
    private static final AtomicBoolean prefetchObj;
    private static CountDownLatch sCountDownLatch;
    private static final AtomicBoolean sHasRegisterTabChangedBroadcast;
    private static final AtomicInteger sIdleInvokeCount;
    private static String sInstanceId;
    private static volatile int sPid;
    private static volatile long sPrefetchLoadTime;
    private static volatile String sSceneName;
    private static volatile long sStartTime;
    private static final AtomicBoolean tabActivityDestroyAtomic;

    public static /* synthetic */ AtomicBoolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]) : prefetchObj;
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]) : mMap;
    }

    public static /* synthetic */ AtomicBoolean access$1100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("5528d467", new Object[0]) : initAtomic;
    }

    public static /* synthetic */ AtomicInteger access$1200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("ff1afc12", new Object[0]) : sIdleInvokeCount;
    }

    public static /* synthetic */ long access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26a27ded", new Object[0])).longValue() : sPrefetchLoadTime;
    }

    public static /* synthetic */ long access$202(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117691d", new Object[]{new Long(j)})).longValue();
        }
        sPrefetchLoadTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$302(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z)})).booleanValue();
        }
        isPrefetchSuccess = z;
        return z;
    }

    public static /* synthetic */ void access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906ef47b", new Object[0]);
        } else {
            countDown();
        }
    }

    public static /* synthetic */ int access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5552faf", new Object[0])).intValue() : sPid;
    }

    public static /* synthetic */ AtomicBoolean access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("b7c26dfe", new Object[0]) : tabActivityDestroyAtomic;
    }

    public static /* synthetic */ void access$900(aat aatVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5c4926", new Object[]{aatVar, str});
        } else {
            destroyCartVEngine(aatVar, str);
        }
    }

    static {
        kge.a(-36184282);
        mMap = new ConcurrentHashMap();
        prefetchObj = new AtomicBoolean();
        initAtomic = new AtomicBoolean();
        lifecycleAtomic = new AtomicBoolean();
        tabActivityDestroyAtomic = new AtomicBoolean();
        prefetchCount = new AtomicInteger();
        object = new Object();
        sIdleInvokeCount = new AtomicInteger();
        sInstanceId = null;
        sHasRegisterTabChangedBroadcast = new AtomicBoolean(false);
        d.a();
    }

    public static void prefetchCartVEngine(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5699f9fa", new Object[]{activity});
            return;
        }
        registerNavigationListener();
        registerLifecycle();
        if (activity == null) {
            tabActivityDestroyAtomic.set(true);
            initAtomic.set(true);
            jqg.b(TAG, "prefetchCartVEngine activity is null, so set flat true");
            return;
        }
        prefetchCartVEngine(activity, "normalPreload");
    }

    private static void doPreRequest(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45f1cfa", new Object[]{activity, str});
        } else if (activity == null || UltronICartFragment.hasCreated()) {
        } else {
            sInstanceId = ieu.a();
            if (!jqi.a("iCart", "enablePreRequestWhenPrefetchEngine", true, true)) {
                return;
            }
            qgs.a(activity, sInstanceId, false, str);
        }
    }

    public static void prefetchCartVEngine(final Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56965944", new Object[]{activity, str});
            return;
        }
        doPreRequest(activity, str);
        bed.a("prefetchScene", str + "#是否已初始化:" + initAtomic.get() + "#是否初始化成功:" + isPrefetchSuccess + "#是否初始化失败:" + isPrefetchError, true, 0.002f);
        if (initAtomic.getAndSet(true)) {
            return;
        }
        jpr.a("iCart");
        if (UltronICartFragment.hasCreated() && jqi.a("iCart", "skipPrefetchIfFragmentAlreadyCreated", true)) {
            return;
        }
        sSceneName = str;
        sStartTime = System.currentTimeMillis();
        sPid = Process.myPid();
        if (activity == null) {
            bed.a(TAG, "activity is null， scene=" + str, 0.005f);
            return;
        }
        eds.a(activity);
        jqg.a(TAG, "开始首屏闲时预加载,场景：", str, ",count=" + prefetchCount.incrementAndGet());
        final int hashCode = activity.hashCode();
        isPrefetchSuccess = false;
        if (sCountDownLatch != null) {
            countDown();
        }
        registerLifecycle();
        if (mMap.get(Integer.valueOf(hashCode)) != null || prefetchObj.get()) {
            jqg.b(TAG, "prefetch failed code=" + hashCode);
            return;
        }
        jqg.b(TAG, "开始预创建购物车engine thread=" + Thread.currentThread().getName() + ",sceneName=" + str + ",pid=" + Process.myPid() + ",code=" + hashCode);
        synchronized (object) {
            final long currentTimeMillis = System.currentTimeMillis();
            sCountDownLatch = new CountDownLatch(1);
            jqg.b(TAG, "开始创建CartVEngine");
            boolean b2 = bci.b(activity);
            com.taobao.android.icart.engine.a aVar = new com.taobao.android.icart.engine.a(activity, null, true, new aat.a() { // from class: com.taobao.android.icart.engine.CartVEngineFactory.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aat.a
                public void a(aat aatVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dfa7a604", new Object[]{this, aatVar});
                    } else if (activity.isFinishing()) {
                        jqg.b(CartVEngineFactory.TAG, "prefetchCartVEngine activity is destroy");
                        bed.a("fragmentPreloadState", "预热完成，但是当前fragment已经销毁，预热实例丢弃", false, 0.01f);
                        aatVar.a();
                    } else if (CartVEngineFactory.access$000().get()) {
                        jqg.b(CartVEngineFactory.TAG, "预热完成，但是当前fragment已经创建完成，预热实例丢弃");
                        aatVar.a();
                        bed.a("fragmentPreloadState", "预热完成，但是当前fragment已经创建完成，预热实例丢弃", false, 0.01f);
                    } else {
                        CartVEngineFactory.access$100().put(Integer.valueOf(hashCode), aatVar);
                        CartVEngineFactory.access$202(System.currentTimeMillis() - currentTimeMillis);
                        CartVEngineFactory.access$302(true);
                        CartVEngineFactory.access$400();
                        jqg.b(CartVEngineFactory.TAG, "预创建购物车engine成功（有cache），custom time=" + CartVEngineFactory.access$200() + ",thread=" + Thread.currentThread().getName() + ",pid=" + CartVEngineFactory.access$500() + ",activityCode=" + hashCode);
                    }
                }

                @Override // tb.aat.a
                public void b(aat aatVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ce2aac85", new Object[]{this, aatVar});
                        return;
                    }
                    jqg.b(CartVEngineFactory.TAG, "缓存加载失败，仍然复用engine");
                    a(aatVar);
                }
            });
            jqg.b(TAG, "完成创建CartVEngine，hasCacheData=" + b2);
            if (!aVar.h().j() || !b2) {
                countDown();
                mMap.put(Integer.valueOf(hashCode), aVar);
                sPrefetchLoadTime = System.currentTimeMillis() - currentTimeMillis;
                isPrefetchSuccess = true;
                jqg.b(TAG, "预创建购物车engine成功（无cache），custom time=" + sPrefetchLoadTime + ",thread=" + Thread.currentThread().getName() + ",pid=" + sPid + ",code=" + hashCode);
            }
        }
    }

    @TradeHybridCustomAnnotation
    public static void prefetchCartVEngine(Activity activity, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285783b7", new Object[]{activity, str, str2, map});
        } else if (!UltronTradeHybridStage.ON_CONTAINER_DESTROY.equals(str) && !UltronTradeHybridStage.ON_TAB_CHANGE.equals(str)) {
        } else {
            String a2 = jqi.a("iCart", "prefetchScenesFromTrade", "orderList,orderDetail,sku,newBuy,paysuccess,mytaobao");
            if (StringUtils.isEmpty(a2) || !a2.contains(str2)) {
                return;
            }
            if (jqi.a("iCart", "onlyDoPreRequestWhenPrefetchFromTrade", true, true)) {
                doPreRequest(activity, str2);
            } else {
                prefetchCartVEngine(activity, str2);
            }
        }
    }

    public static boolean hasStartPrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32c9bd0a", new Object[0])).booleanValue() : initAtomic.get();
    }

    private static void countDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea0be58", new Object[0]);
            return;
        }
        try {
            sCountDownLatch.countDown();
        } catch (Exception e) {
            abj.a("cartPrefetchCountDownError", e);
        }
    }

    public static long getPrefetchStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7160f8dd", new Object[0])).longValue() : sStartTime;
    }

    public static String getSceneName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ab72718", new Object[0]) : sSceneName;
    }

    public static void updatePrefetchObjResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e66c7b", new Object[0]);
        } else {
            prefetchObj.set(true);
        }
    }

    public static aat getCartVEngine(Activity activity) {
        aat aatVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (aat) ipChange.ipc$dispatch("68315c57", new Object[]{activity});
        }
        if (activity == null) {
            return null;
        }
        synchronized (object) {
            long j = 0;
            try {
                if (sCountDownLatch != null && sCountDownLatch.getCount() == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        sCountDownLatch.await(500, TimeUnit.MILLISECONDS);
                        j = System.currentTimeMillis() - currentTimeMillis;
                    } catch (Exception unused) {
                    }
                    z = true;
                }
            } catch (Exception unused2) {
            }
            aatVar = mMap.get(Integer.valueOf(activity.hashCode()));
            jpt c = bed.a.b("awaitCartEngine").a(z).c(z ? "等待了" : "没有等待");
            bed.a(c.a("耗时：" + j).c("c1", j >= 500 ? "500ms" : j >= 400 ? "400ms" : j >= 200 ? "200ms" : j >= 100 ? "100ms" : "小于100ms").c("c2", aatVar != null ? "Engine创建成功" : "Engine创建失败").a(0.001f));
        }
        return aatVar;
    }

    public static void putCartVEngine(aat aatVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e30fe2c", new Object[]{aatVar});
        } else if (aatVar == null || aatVar.i() == null) {
        } else {
            mMap.put(Integer.valueOf(aatVar.i().hashCode()), aatVar);
        }
    }

    public static void removeCartVEngine(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f871878d", new Object[]{activity});
        } else if (activity == null) {
        } else {
            mMap.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    public static boolean isPrefetchSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa6de70d", new Object[0])).booleanValue() : isPrefetchSuccess;
    }

    private static void registerLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cfc90e", new Object[0]);
        } else if (lifecycleAtomic.getAndSet(true)) {
        } else {
            Globals.getApplication().registerActivityLifecycleCallbacks(new a());
        }
    }

    private static void destroyCartVEngine(aat aatVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46acc6b", new Object[]{aatVar, str});
            return;
        }
        try {
            if (sCountDownLatch != null && sCountDownLatch.getCount() > 0) {
                sCountDownLatch.countDown();
            }
            sCountDownLatch = null;
            if (aatVar == null) {
                return;
            }
            aatVar.a();
            eds.a();
            fpy.a().a("iCart");
            jqg.b(TAG, "destroyCartVEngine reason=" + str);
        } catch (Exception e) {
            abj.a("destroyCartVEngine reason=" + str, e);
        }
    }

    public static String getAndResetInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8008ef5b", new Object[0]);
        }
        String str = sInstanceId;
        sInstanceId = null;
        return str;
    }

    private static void registerNavigationListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ca9df2", new Object[0]);
        } else if (sHasRegisterTabChangedBroadcast.getAndSet(true)) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.taobao.android.opencart.d.sTabChangedBroadcastAction);
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.icart.engine.CartVEngineFactory.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    final int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras == null || (i = extras.getInt("index", -1)) < 0) {
                            return;
                        }
                        jqh.a(new MessageQueue.IdleHandler() { // from class: com.taobao.android.icart.engine.CartVEngineFactory.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.os.MessageQueue.IdleHandler
                            public boolean queueIdle() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                                }
                                jqh.b(new Runnable() { // from class: com.taobao.android.icart.engine.CartVEngineFactory.2.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange4 = $ipChange;
                                        if (ipChange4 instanceof IpChange) {
                                            ipChange4.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            f.INSTANCE.a(Integer.valueOf(i));
                                        } catch (Throwable th) {
                                            jqg.a(CartVEngineFactory.TAG, "切换tab任务报错", th.getMessage());
                                        }
                                    }
                                }, jqi.a("iCart", "delayCallHybridOnTabChanged", 1000));
                                return false;
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }, intentFilter);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-386114147);
            kge.a(-1894394539);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        private a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (TBMainHost.a().getContext() != activity) {
            } else {
                try {
                    TBFragmentTabHost c = e.c();
                    int i = -1;
                    if (c != null) {
                        i = c.getCurrentTab();
                    }
                    if (!CartVEngineFactory.access$700().getAndSet(false) || !jqi.a("iCart", "enablePrefetchIdleHandler", true) || i == 3) {
                        return;
                    }
                    CartVEngineFactory.access$000().set(false);
                    jqh.a(new b(activity));
                } catch (Exception e) {
                    abj.a("tabActivityResume", e);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (TBMainHost.a().getContext() == activity) {
                try {
                    CartVEngineFactory.access$700().set(true);
                    for (aat aatVar : CartVEngineFactory.access$100().values()) {
                        if (aatVar != null && !aatVar.K()) {
                            CartVEngineFactory.access$900(aatVar, "主tab购物车销毁了");
                        }
                    }
                    CartVEngineFactory.access$100().clear();
                } catch (Exception e) {
                    abj.a("tabActivityDestroy", e);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Activity> f12777a;

        static {
            kge.a(208174700);
            kge.a(1508499111);
        }

        public static /* synthetic */ WeakReference a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("6bca7741", new Object[]{bVar}) : bVar.f12777a;
        }

        private b(Activity activity) {
            this.f12777a = new WeakReference<>(activity);
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            jqh.a(new Runnable() { // from class: com.taobao.android.icart.engine.CartVEngineFactory.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity = (Activity) b.a(b.this).get();
                    if (activity == null || activity.isFinishing() || !CartVEngineFactory.access$1100().getAndSet(false)) {
                        return;
                    }
                    jqg.b(CartVEngineFactory.TAG, "开始idle预创建购物车任务");
                    CartVEngineFactory.access$1200().incrementAndGet();
                    CartVEngineFactory.prefetchCartVEngine(activity, "idleHandlePreload");
                }
            });
            return false;
        }
    }
}
