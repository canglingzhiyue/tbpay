package com.taobao.monitor.adapter;

import android.app.Application;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.am;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.adapter.test.AliAPMBridge;
import com.taobao.monitor.adapter.test.H5ProcedureGetterBridge;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.impl.util.i;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.p;
import com.taobao.monitor.procedure.r;
import com.taobao.orange.OConstant;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.uc.webview.export.WebView;
import com.ut.mini.internal.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ali;
import tb.alj;
import tb.jbg;
import tb.mms;
import tb.mmt;
import tb.mmu;
import tb.mmw;
import tb.mmy;
import tb.mnb;
import tb.mnd;
import tb.mni;
import tb.moh;
import tb.moi;
import tb.mpi;
import tb.mpm;
import tb.mqe;

/* loaded from: classes.dex */
public abstract class AbsAPMInitiator implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AbsAPMInitiator";
    private final long apmStartTime = h.a();
    private final long cpuStartTime = SystemClock.currentThreadTimeMillis();

    public void initExpendLauncher(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6a26a", new Object[]{this, application});
        }
    }

    public abstract void initPage(Application application);

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (mms.c) {
        } else {
            initAPMFunction(application, hashMap);
            mms.c = true;
            mms.b = true;
        }
    }

    private void initAPMFunction(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18a3361", new Object[]{this, application, hashMap});
            return;
        }
        initParams(application, hashMap);
        initThread(application);
        initDataLogger();
        com.taobao.monitor.adapter.init.b.a(application, hashMap);
        initEnv(hashMap);
        initAPMLauncher(application, hashMap);
        initNetwork();
        initSender();
        initDataHub();
        initLauncherProcedure();
        initWebView();
        initExpendLauncher(application);
        initUTSession(hashMap);
    }

    public void initParams(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb2c931", new Object[]{this, application, hashMap});
            return;
        }
        mms.k = mqe.a(hashMap.get(mms.KEY_NEED_DATAHUB), true);
        d.ae = mqe.a(hashMap.get("needPeriodicMemoryNotify"), true);
        if (mqe.a(hashMap.get(mms.KEY_NEED_TBSPEED), true)) {
            d.f18153a = ABGlobal.isFeatureOpened(application, "ApmInitPerformanceOpt");
            d.b = ABGlobal.isFeatureOpened(application, "ApmCalculatePerformanceOpt");
            d.af = ABGlobal.isFeatureOpened(application, "apmPingPongUseFront");
            d.ak = ABGlobal.isFeatureOpened(application, "apmFixedScrollHitchThreshold");
        }
        e.a().a(application);
        Object obj = hashMap.get("userId");
        if (obj != null) {
            b.a("sid", hashMap.get("sid"));
            b.a("userId", obj);
        }
        b.a("isLoginSessionValid", hashMap.get("checkSessionInvalid"));
        e.a().b(mqe.a(hashMap.get("ttid"), (String) null));
    }

    private void initThread(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc80d73e", new Object[]{this, application});
            return;
        }
        e.a().a(ProcedureGlobal.a().c());
        if (!mms.i) {
            return;
        }
        if (!d.f18153a) {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            com.taobao.monitor.common.c.a(VExecutors.newFixedThreadPool(3, new com.taobao.android.virtual_thread.face.h() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                    }
                    return "APM-common-" + atomicInteger.getAndIncrement();
                }
            }));
        }
        com.taobao.monitor.common.c.a(new com.taobao.monitor.common.a() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.monitor.common.a
            public HandlerThread a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (HandlerThread) ipChange2.ipc$dispatch("578e15aa", new Object[]{this, str}) : jbg.a(str);
            }
        });
    }

    private void initDataLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61330691", new Object[]{this});
        } else {
            mpi.a(new mmu());
        }
    }

    private void initNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28339085", new Object[]{this});
            return;
        }
        try {
            mmt.a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initSender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f7a96c", new Object[]{this});
            return;
        }
        mpm.a().a(new mmy());
        if (StringUtils.isEmpty(mms.n)) {
            return;
        }
        mpm.a().a(new mmw());
    }

    private void initWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
        } else if (!mms.j) {
        } else {
            q.a(H5ProcedureGetterBridge.API_SERVER_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) H5ProcedureGetterBridge.class, false);
            q.a(AliAPMBridge.API_SERVER_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) AliAPMBridge.class, false);
            mni.INSTANCE.a(new mnb() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.mnf
                public boolean a(View view) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : view instanceof WebView;
                }

                @Override // tb.mnb
                public int b(View view) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("9103723c", new Object[]{this, view})).intValue() : ((WebView) view).getProgress();
                }
            });
        }
    }

    private void initLauncherProcedure() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf59eea", new Object[]{this});
            return;
        }
        g a2 = r.f18232a.a(i.a("/startup"), new p.a().b(false).a(true).c(false).a((g) null).a());
        a2.b();
        ProcedureGlobal.PROCEDURE_MANAGER.a(a2);
        g a3 = r.f18232a.a("/APMSelf", new p.a().b(false).a(false).c(false).a(a2).a());
        a3.b();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            z = false;
        }
        a3.a("isMainThread", Boolean.valueOf(z));
        a3.a(am.THREAD_NAME, Thread.currentThread().getName());
        a3.a("taskStart", this.apmStartTime);
        a3.a("cpuStartTime", this.cpuStartTime);
        c.a();
        b.a();
        a3.a("taskEnd", h.a());
        a3.a("cpuEndTime", SystemClock.currentThreadTimeMillis());
        a3.d();
    }

    private static void initEnv(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904eab41", new Object[]{map});
            return;
        }
        try {
            Number number = (Number) map.get(OConstant.LAUNCH_ENVINDEX);
            if (number == null) {
                return;
            }
            if (number.intValue() != 0 && number.intValue() != 1 && number.intValue() != 2) {
                return;
            }
            mms.f31118a = number.intValue();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initAPMLauncher(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75181f29", new Object[]{this, application, hashMap});
            return;
        }
        initPage(application);
        com.taobao.monitor.b.a(application, hashMap);
        com.taobao.monitor.a.a(application, hashMap);
    }

    private void initDataHub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e51a4c2", new Object[]{this});
        } else if (!mms.k) {
        } else {
            alj.a().a(new ali() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ali
                public void a(final String str, final HashMap<String, String> hashMap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
                        return;
                    }
                    if (PopStrategy.IDENTIFIER_SPLASH.equals(str)) {
                        mnd.d = true;
                    }
                    a(new Runnable() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            HashMap hashMap2;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if ("afc".equals(str) && (hashMap2 = hashMap) != null) {
                                mpi.c(AbsAPMInitiator.TAG, str, hashMap2);
                            }
                            g a2 = a.a();
                            if (a2 == null) {
                                return;
                            }
                            a2.b(str, (Map<String, Object>) hashMap);
                        }
                    });
                }

                @Override // tb.ali
                public void b(final String str, final HashMap<String, String> hashMap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3967d960", new Object[]{this, str, hashMap});
                    } else {
                        a(new Runnable() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.4.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                g a2 = a.a();
                                if (a2 == null) {
                                    return;
                                }
                                a2.c(str, (Map<String, Object>) hashMap);
                            }
                        });
                    }
                }

                @Override // tb.ali
                public void a(final String str, final String str2, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
                        return;
                    }
                    final long a2 = h.a();
                    a(new Runnable() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.4.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            g a3 = a.a();
                            if (a3 == null) {
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put(str2, Long.valueOf(a2));
                            a3.d(str, hashMap);
                        }
                    });
                }

                @Override // tb.ali
                public void a(final String str, final String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        a(new Runnable() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.4.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                g a2 = a.a();
                                if (a2 == null) {
                                    return;
                                }
                                a2.a("bizID", str);
                                if (StringUtils.isEmpty(str2)) {
                                    return;
                                }
                                a2.a("bizCode", str2);
                            }
                        });
                    }
                }

                private void a(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("39112e6", new Object[]{this, runnable});
                    } else {
                        e.a().d().post(runnable);
                    }
                }
            });
        }
    }

    private void initUTSession(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a62a05", new Object[]{this, hashMap});
        } else if (!mqe.a(hashMap.get("needUT"), true)) {
        } else {
            moi.b().a(new moh() { // from class: com.taobao.monitor.adapter.AbsAPMInitiator.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.moh
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : f.getInstance().getUtsid();
                }
            });
        }
    }
}
