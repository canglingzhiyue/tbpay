package com.taobao.message.lab.comfrm.inner2.js;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.taobao.windvane.extra.jsi.JsiMode;
import android.taobao.windvane.extra.jsi.WVJsi;
import android.taobao.windvane.util.e;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.a;
import com.alibaba.jsi.standard.js.c;
import com.alibaba.jsi.standard.js.h;
import com.alibaba.jsi.standard.js.i;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.m;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.s;
import com.alibaba.jsi.standard.js.w;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.support.model.Action1;
import com.taobao.message.lab.comfrm.support.model.Func1;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes7.dex */
public class JSIImpl implements JSFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JSIImpl";
    private static final AtomicLong sInstanceId;
    private static final HandlerThread sThread;
    private static boolean sWVFlag;
    private ExecutorService mExecutor;
    private boolean mOOMAllowReturnNull;
    private JSEngine mJSEngine = null;
    private d mJSContext = null;
    private boolean mLeakFix = true;
    private volatile boolean mDemote = false;
    public b.a mLocaleChangeListener = new b.a() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ability.localization.b.a
        public void a(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("246661b", new Object[]{this, language, str});
            } else {
                JSIImpl.access$000(JSIImpl.this);
            }
        }
    };

    public static /* synthetic */ void access$000(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae562af", new Object[]{jSIImpl});
        } else {
            jSIImpl.registerGlobal();
        }
    }

    public static /* synthetic */ ExecutorService access$100(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("aeb0b64d", new Object[]{jSIImpl}) : jSIImpl.mExecutor;
    }

    public static /* synthetic */ boolean access$200(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d520871", new Object[]{jSIImpl})).booleanValue() : jSIImpl.mOOMAllowReturnNull;
    }

    public static /* synthetic */ d access$300(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("534f99d7", new Object[]{jSIImpl}) : jSIImpl.mJSContext;
    }

    public static /* synthetic */ boolean access$400(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fbeae2f", new Object[]{jSIImpl})).booleanValue() : jSIImpl.mLeakFix;
    }

    public static /* synthetic */ JSEngine access$500(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSEngine) ipChange.ipc$dispatch("1969816e", new Object[]{jSIImpl}) : jSIImpl.mJSEngine;
    }

    static {
        kge.a(-595195237);
        kge.a(-1335218584);
        sInstanceId = new AtomicLong(0L);
        try {
            Class.forName("android.taobao.windvane.extra.jsi.WVJsi");
            sWVFlag = true;
        } catch (ClassNotFoundException unused) {
            sWVFlag = false;
        }
        HandlerThread handlerThread = new HandlerThread("JSILoop");
        sThread = handlerThread;
        handlerThread.start();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void startRemoteInspect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fed33d", new Object[]{this, str});
        } else if (!e.a()) {
        } else {
            JSEngine.startRemoteInspect(str);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void initJS(Context context, String str, ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980464b7", new Object[]{this, context, str, executorService});
            return;
        }
        this.mOOMAllowReturnNull = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "JSIOOMAllowReturnNull", "0"));
        this.mExecutor = executorService;
        String str2 = "MPFRM" + sInstanceId.getAndIncrement();
        Handler handler = new Handler(sThread.getLooper()) { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.2
            public static final /* synthetic */ boolean $assertionsDisabled = false;
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("44d6b87", new Object[]{this, message});
                } else {
                    JSIImpl.access$100(JSIImpl.this).execute(message.getCallback());
                }
            }
        };
        if (sWVFlag) {
            WVJsi.InstanceResult build = WVJsi.instanceBuilder(context).name(str2).version("1.0").handler(handler).mode(JsiMode.V8_QJS).build();
            if (build != null && build.isSuccess()) {
                this.mJSEngine = build.getJsEngine();
            } else {
                Logger.e(TAG, "mJSEngine init fail");
                AppMonitor.Alarm.commitFail(Constants.Monitor.MODULE_MONITOR, "initJS", "-1", "mJSEngine init fail");
                this.mDemote = true;
                return;
            }
        } else {
            try {
                JSEngine.loadSo(context, new Bundle());
                Bundle bundle = new Bundle();
                bundle.putString("name", "MPFRM" + sInstanceId.getAndIncrement());
                bundle.putString("version", "1.0");
                this.mJSEngine = JSEngine.getInstance("MessageFramework");
                if (this.mJSEngine == null) {
                    this.mJSEngine = JSEngine.createInstance(context, bundle, handler);
                }
            } catch (Throwable th) {
                Logger.e(TAG, th.toString());
                AppMonitor.Alarm.commitFail(Constants.Monitor.MODULE_MONITOR, "initJS", "-1", th.toString());
                this.mDemote = true;
                return;
            }
        }
        AppMonitor.Alarm.commitSuccess(Constants.Monitor.MODULE_MONITOR, "initJS");
        if (ApplicationUtil.isDebug()) {
            z = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "JSIEnableStats", "1"));
        }
        this.mJSEngine.setEnableStats(z);
        b.a(this.mLocaleChangeListener);
        createContext(str);
    }

    private void createContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aef3364", new Object[]{this, str});
            return;
        }
        Calendar.getInstance().setTime(new Date());
        Bundle bundle = new Bundle();
        bundle.putBoolean("javaSuper", true);
        bundle.putBoolean("javaField", true);
        bundle.putBoolean("javaClass", true);
        try {
            this.mJSContext = this.mJSEngine.createContext(str, bundle, null);
        } catch (Throwable unused) {
            this.mJSContext = this.mJSEngine.createContext(str);
        }
        registerGlobal();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void registerGlobal() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.registerGlobal():void");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void registerStringFunc(String str, Action1<String> action1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7928dd5", new Object[]{this, str, action1});
        } else if (this.mDemote) {
        } else {
            c cVar = new c(this.mJSContext.g());
            try {
                o h = this.mJSContext.h();
                j consumerStringFunc = consumerStringFunc(str, action1);
                h.a(this.mJSContext, str, consumerStringFunc);
                consumerStringFunc.a();
                h.a();
            } finally {
                cVar.b();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void registerDelayListFunc(String str, Func1<String, List> func1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c684d9", new Object[]{this, str, func1});
        } else if (this.mDemote) {
        } else {
            c cVar = new c(this.mJSContext.g());
            try {
                o h = this.mJSContext.h();
                j consumerDelayListFunc = consumerDelayListFunc(str, func1);
                h.a(this.mJSContext, str, consumerDelayListFunc);
                consumerDelayListFunc.a();
                h.a();
            } finally {
                cVar.b();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void registerObjectFunc(String str, Func1<String, Object> func1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f60ccf5", new Object[]{this, str, func1});
        } else if (this.mDemote) {
        } else {
            c cVar = new c(this.mJSContext.g());
            try {
                o h = this.mJSContext.h();
                j consumerObjectFunc = consumerObjectFunc(str, func1);
                h.a(this.mJSContext, str, consumerObjectFunc);
                consumerObjectFunc.a();
                h.a();
            } finally {
                cVar.b();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public java.lang.String executeJS2String(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.executeJS2String(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public String executeJSFunc(String str, String str2, Object[] objArr) {
        d dVar;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae45ae8c", new Object[]{this, str, str2, objArr});
        }
        String str4 = null;
        if (this.mDemote || (dVar = this.mJSContext) == null || dVar.g().isDisposed() || dVar.c()) {
            return null;
        }
        c cVar = new c(dVar.g());
        try {
            w a2 = dVar.a(str);
            if (dVar.i()) {
                i j = dVar.j();
                if (j != null) {
                    str3 = (((("name: " + j.b(dVar)) + "\nmessage: ") + j.c(dVar)) + "\nstack: ") + j.d(dVar);
                    Logger.e(TAG, "jsException|" + str3);
                    j.a();
                } else {
                    str3 = "unknow";
                }
                if (ApplicationUtil.isDebug()) {
                    throw new RuntimeException(str3);
                }
                AppMonitor.Alarm.commitFail(Constants.Monitor.MODULE_MONITOR, "executeJSFunc", str2, "-1", str3);
            } else {
                AppMonitor.Alarm.commitSuccess(Constants.Monitor.MODULE_MONITOR, "executeJS2String", str2);
                if (a2 instanceof j) {
                    w[] wVarArr = new o[objArr.length];
                    com.alibaba.jsi.standard.java.b k = dVar.k();
                    for (int i = 0; i < objArr.length; i++) {
                        wVarArr[i] = k.a(objArr[i]);
                    }
                    w a3 = ((j) a2).a(dVar, (w) null, wVarArr);
                    if (dVar.i()) {
                        i j2 = dVar.j();
                        if (j2 != null) {
                            String str5 = (((("name: " + j2.b(dVar)) + "\nmessage: ") + j2.c(dVar)) + "\nstack: ") + j2.d(dVar);
                            Logger.e(TAG, "jsException|" + str5);
                            j2.a();
                            if (ApplicationUtil.isDebug()) {
                                throw new RuntimeException(str5);
                            }
                        }
                    } else if (a3 instanceof s) {
                        str4 = ((s) a3).p_();
                    }
                    if (a3 != null) {
                        a3.a();
                    }
                    for (w wVar : wVarArr) {
                        wVar.a();
                    }
                }
            }
            if (a2 != null) {
                a2.a();
            }
            return str4;
        } finally {
            cVar.b();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public boolean isDemote() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6365b6e9", new Object[]{this})).booleanValue() : this.mDemote;
    }

    private j logFunc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("ad6bc03a", new Object[]{this}) : new j(this.mJSContext, new h() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == -1888865210) {
                    return super.onCallFunction((a) objArr[0]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.alibaba.jsi.standard.js.h
            public w onCallFunction(a aVar) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                }
                if (aVar.a() > 0) {
                    w a2 = aVar.a(0);
                    if (a2 instanceof s) {
                        str = "console.log: " + ((s) a2).p_();
                    } else {
                        str = "console.log doesn't support log";
                    }
                    Logger.e(JSIImpl.TAG, str);
                    if (a2 != null) {
                        a2.a();
                    }
                }
                return super.onCallFunction(aVar);
            }
        }, "log");
    }

    private j consumerStringFunc(String str, final Action1<String> action1) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("efb2cead", new Object[]{this, str, action1}) : new j(this.mJSContext, new h() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str2, Object... objArr) {
                if (str2.hashCode() == -1888865210) {
                    return super.onCallFunction((a) objArr[0]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // com.alibaba.jsi.standard.js.h
            public w onCallFunction(a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                }
                if (aVar.a() > 0) {
                    w a2 = aVar.a(0);
                    try {
                        if (a2 instanceof s) {
                            action1.call(((s) a2).p_());
                        } else {
                            action1.call(null);
                        }
                    } catch (Throwable th) {
                        if (ApplicationUtil.isDebug()) {
                            throw new RuntimeException(th);
                        }
                        th.printStackTrace();
                        Logger.e(JSIImpl.TAG, Log.getStackTraceString(th));
                    }
                    if (a2 != null) {
                        a2.a();
                    }
                }
                return super.onCallFunction(aVar);
            }
        }, str);
    }

    private j consumerObjectFunc(String str, final Func1<String, Object> func1) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("fff5650d", new Object[]{this, str, func1}) : new j(this.mJSContext, new h() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str2, Object... objArr) {
                if (str2.hashCode() == -1888865210) {
                    return super.onCallFunction((a) objArr[0]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
            @Override // com.alibaba.jsi.standard.js.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.alibaba.jsi.standard.js.w onCallFunction(com.alibaba.jsi.standard.js.a r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "JSIImpl"
                    com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.message.lab.comfrm.inner2.js.JSIImpl.AnonymousClass5.$ipChange
                    boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                    r3 = 1
                    r4 = 2
                    r5 = 0
                    if (r2 == 0) goto L1a
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r0[r5] = r10
                    r0[r3] = r11
                    java.lang.String r11 = "8f6a3446"
                    java.lang.Object r11 = r1.ipc$dispatch(r11, r0)
                    com.alibaba.jsi.standard.js.w r11 = (com.alibaba.jsi.standard.js.w) r11
                    return r11
                L1a:
                    int r1 = r11.a()
                    if (r1 <= 0) goto Ld1
                    com.alibaba.jsi.standard.js.w r11 = r11.a(r5)
                    r1 = 0
                    boolean r2 = r11 instanceof com.alibaba.jsi.standard.js.s     // Catch: java.lang.Throwable -> L44
                    if (r2 == 0) goto L3c
                    r2 = r11
                    com.alibaba.jsi.standard.js.s r2 = (com.alibaba.jsi.standard.js.s) r2     // Catch: java.lang.Throwable -> L44
                    java.lang.String r2 = r2.p_()     // Catch: java.lang.Throwable -> L44
                    com.taobao.message.lab.comfrm.support.model.Func1 r6 = r2     // Catch: java.lang.Throwable -> L3a
                    java.lang.Object r6 = r6.call(r2)     // Catch: java.lang.Throwable -> L3a
                    r9 = r6
                    r6 = r2
                    r2 = r9
                    goto L58
                L3a:
                    r6 = move-exception
                    goto L46
                L3c:
                    com.taobao.message.lab.comfrm.support.model.Func1 r2 = r2     // Catch: java.lang.Throwable -> L44
                    java.lang.Object r2 = r2.call(r1)     // Catch: java.lang.Throwable -> L44
                    r6 = r1
                    goto L58
                L44:
                    r6 = move-exception
                    r2 = r1
                L46:
                    boolean r7 = com.taobao.message.uikit.util.ApplicationUtil.isDebug()
                    if (r7 != 0) goto Lcb
                    r6.printStackTrace()
                    java.lang.String r6 = android.util.Log.getStackTraceString(r6)
                    com.taobao.message.lab.comfrm.util.Logger.e(r0, r6)
                    r6 = r2
                    r2 = r1
                L58:
                    if (r11 == 0) goto L5d
                    r11.a()
                L5d:
                    if (r2 == 0) goto Lca
                    java.util.HashMap r11 = new java.util.HashMap
                    r11.<init>()
                    java.lang.String r7 = "data"
                    r11.put(r7, r2)
                    com.alibaba.jsi.standard.js.s r7 = new com.alibaba.jsi.standard.js.s     // Catch: java.lang.Throwable -> L7d
                    com.alibaba.fastjson.serializer.SerializerFeature[] r4 = new com.alibaba.fastjson.serializer.SerializerFeature[r4]     // Catch: java.lang.Throwable -> L7d
                    com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect     // Catch: java.lang.Throwable -> L7d
                    r4[r5] = r8     // Catch: java.lang.Throwable -> L7d
                    com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: java.lang.Throwable -> L7d
                    r4[r3] = r8     // Catch: java.lang.Throwable -> L7d
                    java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r11, r4)     // Catch: java.lang.Throwable -> L7d
                    r7.<init>(r3)     // Catch: java.lang.Throwable -> L7d
                    return r7
                L7d:
                    r3 = move-exception
                    com.taobao.message.lab.comfrm.util.Logger.e(r0, r3)
                    com.taobao.message.lab.comfrm.inner2.js.JSIImpl r4 = com.taobao.message.lab.comfrm.inner2.js.JSIImpl.this
                    boolean r4 = com.taobao.message.lab.comfrm.inner2.js.JSIImpl.access$200(r4)
                    if (r4 != 0) goto Lca
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
                    r4.<init>()     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r7 = "|key|"
                    r4.append(r7)     // Catch: java.lang.Throwable -> Lbd
                    r4.append(r6)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r6 = "|className|"
                    r4.append(r6)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> Lbd
                    r4.append(r2)     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lbd
                    com.taobao.message.lab.comfrm.util.Logger.e(r0, r2)     // Catch: java.lang.Throwable -> Lbd
                    com.taobao.message.lab.comfrm.inner2.js.JSIImpl$5$1 r2 = new com.taobao.message.lab.comfrm.inner2.js.JSIImpl$5$1     // Catch: java.lang.Throwable -> Lbd
                    r2.<init>()     // Catch: java.lang.Throwable -> Lbd
                    com.alibaba.fastjson.serializer.SerializerFeature[] r4 = new com.alibaba.fastjson.serializer.SerializerFeature[r5]     // Catch: java.lang.Throwable -> Lbd
                    java.lang.String r11 = com.alibaba.fastjson.JSON.toJSONString(r11, r2, r4)     // Catch: java.lang.Throwable -> Lbd
                    com.taobao.message.lab.comfrm.util.Logger.e(r0, r11)     // Catch: java.lang.Throwable -> Lbd
                Lbd:
                    java.lang.Thread$UncaughtExceptionHandler r11 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
                    if (r11 == 0) goto Lca
                    java.lang.Thread r0 = com.taobao.android.virtual_thread.face.VExecutors.currentThread()
                    r11.uncaughtException(r0, r3)
                Lca:
                    return r1
                Lcb:
                    java.lang.RuntimeException r11 = new java.lang.RuntimeException
                    r11.<init>(r6)
                    throw r11
                Ld1:
                    com.alibaba.jsi.standard.js.w r11 = super.onCallFunction(r11)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.AnonymousClass5.onCallFunction(com.alibaba.jsi.standard.js.a):com.alibaba.jsi.standard.js.w");
            }
        }, str);
    }

    private j consumerDelayListFunc(String str, final Func1<String, List> func1) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("974040b7", new Object[]{this, str, func1}) : new j(this.mJSContext, new h() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str2, Object... objArr) {
                if (str2.hashCode() == -1888865210) {
                    return super.onCallFunction((a) objArr[0]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // com.alibaba.jsi.standard.js.h
            public w onCallFunction(a aVar) {
                List list;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                }
                if (aVar.a() <= 0) {
                    return super.onCallFunction(aVar);
                }
                w a2 = aVar.a(0);
                try {
                    list = (List) (a2 instanceof s ? func1.call(((s) a2).p_()) : func1.call(null));
                } catch (Throwable th) {
                    if (ApplicationUtil.isDebug()) {
                        throw new RuntimeException(th);
                    }
                    th.printStackTrace();
                    Logger.e(JSIImpl.TAG, Log.getStackTraceString(th));
                    list = null;
                }
                if (a2 != null) {
                    a2.a();
                }
                if (list == null) {
                    return null;
                }
                o oVar = new o(JSIImpl.access$300(JSIImpl.this));
                final Object ref = JSIImpl.access$400(JSIImpl.this) ? new Ref(list) : list;
                j jVar = new j(JSIImpl.access$300(JSIImpl.this), new h() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.6.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                        if (str2.hashCode() == -1888865210) {
                            return super.onCallFunction((a) objArr[0]);
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    }

                    @Override // com.alibaba.jsi.standard.js.h
                    public w onCallFunction(a aVar2) {
                        List list2;
                        Object obj;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (w) ipChange3.ipc$dispatch("8f6a3446", new Object[]{this, aVar2});
                        }
                        Object obj2 = ref;
                        if (obj2 instanceof Ref) {
                            list2 = (List) ((Ref) obj2).get();
                            if (list2 == null) {
                                return null;
                            }
                        } else {
                            list2 = (List) obj2;
                        }
                        if (aVar2.a() > 0) {
                            w a3 = aVar2.a(0);
                            int i = -1;
                            try {
                                if (a3 instanceof m) {
                                    i = ValueUtil.getInteger(Integer.valueOf(((m) a3).j()), -1);
                                }
                            } catch (Throwable th2) {
                                if (ApplicationUtil.isDebug()) {
                                    throw new RuntimeException(th2);
                                }
                                th2.printStackTrace();
                                Logger.e(JSIImpl.TAG, Log.getStackTraceString(th2));
                            }
                            if (a3 != null) {
                                a3.a();
                            }
                            if (i >= 0 && i < list2.size() && (obj = list2.get(i)) != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("data", obj);
                                return new s(JSON.toJSONString(hashMap, SerializerFeature.DisableCircularReferenceDetect));
                            }
                        }
                        return super.onCallFunction(aVar2);
                    }
                }, "at");
                j jVar2 = new j(JSIImpl.access$300(JSIImpl.this), new h() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.6.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.jsi.standard.js.h
                    public w onCallFunction(a aVar2) {
                        List list2;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (w) ipChange3.ipc$dispatch("8f6a3446", new Object[]{this, aVar2});
                        }
                        Object obj = ref;
                        if (obj instanceof Ref) {
                            list2 = (List) ((Ref) obj).get();
                            if (list2 == null) {
                                return null;
                            }
                        } else {
                            list2 = (List) obj;
                        }
                        return new m(list2.size());
                    }
                }, "size");
                if (JSIImpl.access$400(JSIImpl.this)) {
                    oVar.a(JSIImpl.access$300(JSIImpl.this), "release", new j(JSIImpl.access$300(JSIImpl.this), new h() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.6.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str2, Object... objArr) {
                            if (str2.hashCode() == -1888865210) {
                                return super.onCallFunction((a) objArr[0]);
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                        }

                        @Override // com.alibaba.jsi.standard.js.h
                        public w onCallFunction(a aVar2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (w) ipChange3.ipc$dispatch("8f6a3446", new Object[]{this, aVar2});
                            }
                            Object obj = ref;
                            if (obj instanceof Ref) {
                                ((Ref) obj).release();
                            }
                            return super.onCallFunction(aVar2);
                        }
                    }, "release"));
                }
                oVar.a(JSIImpl.access$300(JSIImpl.this), "at", jVar);
                oVar.a(JSIImpl.access$300(JSIImpl.this), "size", jVar2);
                jVar.a();
                jVar2.a();
                return oVar;
            }
        }, str);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        ExecutorService executorService = this.mExecutor;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (JSIImpl.access$300(JSIImpl.this) != null) {
                        JSIImpl.access$300(JSIImpl.this).b();
                        if (JSIImpl.access$500(JSIImpl.this) != null) {
                            JSIImpl.access$500(JSIImpl.this).removeContext(JSIImpl.access$300(JSIImpl.this));
                        }
                    }
                    if (JSIImpl.access$500(JSIImpl.this) == null) {
                        return;
                    }
                    JSIImpl.access$500(JSIImpl.this).dispose();
                }
            });
        }
        b.b(this.mLocaleChangeListener);
    }

    /* loaded from: classes7.dex */
    public static class Ref<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private T data;

        static {
            kge.a(-1089805590);
        }

        public Ref(T t) {
            this.data = t;
        }

        public T get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            if (this.data == null && "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "throwJSICoreError", "1"))) {
                Logger.e(JSIImpl.TAG, "Ref调用release()之后，不应该再有调用");
                Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.Ref.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        throw new IllegalStateException("Ref调用release()之后，不应该再有调用");
                    }
                });
            }
            return this.data;
        }

        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else {
                this.data = null;
            }
        }
    }
}
