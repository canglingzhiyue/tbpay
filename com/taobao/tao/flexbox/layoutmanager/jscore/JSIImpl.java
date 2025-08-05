package com.taobao.tao.flexbox.layoutmanager.jscore;

import android.content.Context;
import android.os.Handler;
import android.taobao.windvane.extra.jsi.JsiMode;
import android.taobao.windvane.extra.jsi.WVJsi;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.js.f;
import com.alibaba.jsi.standard.js.h;
import com.alibaba.jsi.standard.js.i;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.m;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.s;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.oea;
import tb.ogg;

/* loaded from: classes8.dex */
public class JSIImpl implements com.taobao.tao.flexbox.layoutmanager.jscore.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThreadLocal<a> threadLocalEngine = new ThreadLocal<>();
    private o $ac;
    private j _cFunction;
    private o console;
    private j dispatch;
    private com.alibaba.jsi.standard.js.c engineScope;
    private boolean isQuickJS;
    private com.alibaba.jsi.standard.d jsContext;
    private TNodeJSCore jsCore;
    private JSEngine jsEngine;
    private j logFunction;
    private j loggerFunction;
    private j nanoFunction;
    private j register;

    /* loaded from: classes8.dex */
    public static class b extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<TNodeJSCore> f20402a;

        public b(TNodeJSCore tNodeJSCore) {
            this.f20402a = new WeakReference<>(tNodeJSCore);
        }

        @Override // com.alibaba.jsi.standard.js.h
        public w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
            TNodeJSCore tNodeJSCore;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
            }
            if (aVar.a() <= 0 || (tNodeJSCore = this.f20402a.get()) == null) {
                return null;
            }
            w a2 = aVar.a(0);
            tNodeJSCore.a(4, JSIImpl.access$500(a2, aVar.b()));
            a2.a();
            return null;
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<TNodeJSCore> f20403a;

        public c(TNodeJSCore tNodeJSCore) {
            this.f20403a = new WeakReference<>(tNodeJSCore);
        }

        @Override // com.alibaba.jsi.standard.js.h
        public w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
            TNodeJSCore tNodeJSCore;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
            }
            if (aVar.a() <= 1 || (tNodeJSCore = this.f20403a.get()) == null) {
                return null;
            }
            w a2 = aVar.a(0);
            w a3 = aVar.a(1);
            tNodeJSCore.a(TNodeJSCore.a(JSIImpl.access$400(a2)), JSIImpl.access$500(a3, aVar.b()));
            a2.a();
            a3.a();
            return null;
        }
    }

    /* loaded from: classes8.dex */
    public static class d extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<TNodeJSCore.AC> f20404a;

        public d(TNodeJSCore.AC ac) {
            this.f20404a = new WeakReference<>(ac);
        }

        @Override // com.alibaba.jsi.standard.js.h
        public w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
            }
            TNodeJSCore.AC ac = this.f20404a.get();
            return ac != null ? new m(ac._nanotime()) : new m(0);
        }
    }

    /* loaded from: classes8.dex */
    public static class e extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<TNodeJSCore.AC> f20405a;

        public e(TNodeJSCore.AC ac) {
            this.f20405a = new WeakReference<>(ac);
        }

        @Override // com.alibaba.jsi.standard.js.h
        public w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
            TNodeJSCore.AC ac;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
            }
            if (aVar.a() <= 0 || (ac = this.f20405a.get()) == null) {
                return null;
            }
            w a2 = aVar.a(0);
            ac._c(JSIImpl.access$500(a2, aVar.b()));
            a2.a();
            return null;
        }
    }

    private String parseFromError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab90518f", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                return "execute js error";
            case 2:
                return "function call error";
            case 3:
                return "new instance error";
            case 4:
                return "execute js timer error";
            case 5:
                return "execute js promise error";
            case 6:
                return "jsobject get error";
            case 7:
                return "jsobject set error";
            case 8:
                return "wasm module make error";
            case 9:
                return "wasm function call error";
            case 10:
                return "wasm instance make error";
            case 11:
                return "other api call error";
            case 12:
                return "JSI internal error";
            default:
                return "js error";
        }
    }

    public static /* synthetic */ void access$300(JSIImpl jSIImpl, com.alibaba.jsi.standard.d dVar, i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68837459", new Object[]{jSIImpl, dVar, iVar, new Integer(i)});
        } else {
            jSIImpl.reportJSErrorFromJSI(dVar, iVar, i);
        }
    }

    public static /* synthetic */ int access$400(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5bae86", new Object[]{wVar})).intValue() : convertInt(wVar);
    }

    public static /* synthetic */ String access$500(w wVar, com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9b45181", new Object[]{wVar, dVar}) : convertToString(wVar, dVar);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSEngine f20401a;
        private com.alibaba.jsi.standard.js.c b;
        private boolean c;

        public static /* synthetic */ JSEngine a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSEngine) ipChange.ipc$dispatch("7c8f2c1e", new Object[]{aVar}) : aVar.f20401a;
        }

        public static /* synthetic */ com.alibaba.jsi.standard.js.c b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.jsi.standard.js.c) ipChange.ipc$dispatch("a468244b", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c873ee7c", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public a(JSEngine jSEngine, com.alibaba.jsi.standard.js.c cVar, boolean z) {
            this.f20401a = jSEngine;
            this.b = cVar;
            this.c = z;
        }
    }

    public JSIImpl(TNodeJSCore tNodeJSCore) {
        this.jsCore = tNodeJSCore;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.c
    public boolean initJSCore(g gVar, Handler handler) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("586b8153", new Object[]{this, gVar, handler})).booleanValue();
        }
        a aVar = threadLocalEngine.get();
        if (aVar == null) {
            String str = "tnode:" + Thread.currentThread();
            WVJsi.InstanceResult createJSEngine = createJSEngine(str, "1.0", JsiMode.V8);
            if (createJSEngine == null || !createJSEngine.isSuccess()) {
                createJSEngine = createJSEngine(str, "1.0", JsiMode.QJS);
                z = true;
            } else {
                z = false;
            }
            if (createJSEngine != null && createJSEngine.isSuccess()) {
                JSEngine jsEngine = createJSEngine.getJsEngine();
                a aVar2 = new a(jsEngine, new com.alibaba.jsi.standard.js.c(jsEngine), z);
                threadLocalEngine.set(aVar2);
                ogg.a("TNodeJS", "use quickJS " + z);
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            this.jsEngine = a.a(aVar);
            this.engineScope = a.b(aVar);
            this.isQuickJS = a.c(aVar);
        }
        if (this.jsEngine != null && this.engineScope != null) {
            return true;
        }
        ogg.a("TNodeJS", "初始化JSI引擎失败");
        return false;
    }

    private WVJsi.InstanceResult createJSEngine(String str, String str2, JsiMode jsiMode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVJsi.InstanceResult) ipChange.ipc$dispatch("684d90b0", new Object[]{this, str, str2, jsiMode}) : WVJsi.instanceBuilder(ab.a()).name(str).version(str2).mode(jsiMode).bizName("tnode").build();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.c
    public void initJSContext(Context context, TNodeJSCore tNodeJSCore, String str, TNodeJSCore.AC ac, String str2) {
        o oVar;
        o oVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20d2e53", new Object[]{this, context, tNodeJSCore, str, ac, str2});
            return;
        }
        this.jsContext = this.jsEngine.createContext(str2);
        this.jsContext.a(new com.alibaba.jsi.standard.b() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.JSIImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                if (str3.hashCode() == -910998703) {
                    return new Boolean(super.onUncaughtJSException((com.alibaba.jsi.standard.d) objArr[0], (i) objArr[1], ((Number) objArr[2]).intValue()));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            @Override // com.alibaba.jsi.standard.b
            public boolean onUncaughtJSException(com.alibaba.jsi.standard.d dVar, i iVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c9b34351", new Object[]{this, dVar, iVar, new Integer(i)})).booleanValue();
                }
                JSIImpl.access$300(JSIImpl.this, dVar, iVar, i);
                return super.onUncaughtJSException(dVar, iVar, i);
            }
        });
        try {
            w a2 = this.jsContext.a(str, "tnode.js");
            w createJSObject = createJSObject(this.jsContext, oea.b(context));
            w createEnvJSObject = createEnvJSObject(this.jsContext, createJSObject);
            w[] wVarArr = {createEnvJSObject, createEnvJSObject};
            o oVar3 = (o) ((j) a2).a(this.jsContext, a2, wVarArr);
            createJSObject.a();
            wVarArr[0].a();
            wVarArr[1].a();
            w wVar = null;
            if (this.isQuickJS) {
                o h = this.jsContext.h();
                o oVar4 = (o) h.a(this.jsContext, com.taobao.android.weex_framework.util.a.ATOM_Function);
                w a3 = oVar4.a(this.jsContext, com.taobao.android.weex_framework.util.a.ATOM_prototype);
                oVar2 = oVar4;
                oVar = h;
                wVar = a3;
            } else {
                oVar = null;
                oVar2 = null;
            }
            this._cFunction = new j(this.jsContext, new e(ac), "_c");
            if (wVar != null) {
                this._cFunction.d(this.jsContext, wVar);
            }
            oVar3.a(this.jsContext, "_c", this._cFunction);
            this.logFunction = new j(this.jsContext, new b(tNodeJSCore), "_log");
            if (wVar != null) {
                this.logFunction.d(this.jsContext, wVar);
            }
            oVar3.a(this.jsContext, "_log", this.logFunction);
            this.loggerFunction = new j(this.jsContext, new c(tNodeJSCore), "_logger");
            if (wVar != null) {
                this.loggerFunction.d(this.jsContext, wVar);
            }
            oVar3.a(this.jsContext, "_logger", this.loggerFunction);
            this.nanoFunction = new j(this.jsContext, new d(ac), "_nanotime");
            if (wVar != null) {
                this.nanoFunction.d(this.jsContext, wVar);
            }
            oVar3.a(this.jsContext, "_nanotime", this.nanoFunction);
            if (oVar != null) {
                oVar.a();
            }
            if (oVar2 != null) {
                oVar2.a();
            }
            if (wVar != null) {
                wVar.a();
            }
            oVar3.a();
            a2.a();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void executeJS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d26399", new Object[]{this, str, str2});
            return;
        }
        w a2 = this.jsContext.a(str, str2);
        if (a2 == null) {
            return;
        }
        a2.a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.c
    public void dispatchJS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d52d94", new Object[]{this, str});
            return;
        }
        initJsVariant();
        w[] wVarArr = {new s(str)};
        this.dispatch.a(this.jsContext, this.$ac, wVarArr);
        wVarArr[0].a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.c
    public boolean applyModule(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0b00b99", new Object[]{this, str, str2})).booleanValue();
        }
        initJsVariant();
        w a2 = this.jsContext.a(str2, (String) null);
        if (a2 == null) {
            return false;
        }
        o oVar = new o(this.jsContext);
        f fVar = new f(true);
        oVar.a(this.jsContext, "preload", fVar);
        w[] wVarArr = {new s(str), a2, oVar};
        this.register.a(this.jsContext, this.$ac, wVarArr);
        wVarArr[0].a();
        wVarArr[1].a();
        fVar.a();
        wVarArr[2].a();
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        j jVar = this._cFunction;
        if (jVar != null) {
            jVar.d(this.jsContext);
            this._cFunction.h(this.jsContext);
            this._cFunction.a();
            this._cFunction = null;
        }
        j jVar2 = this.logFunction;
        if (jVar2 != null) {
            jVar2.d(this.jsContext);
            this.logFunction.h(this.jsContext);
            this.logFunction.a();
            this.logFunction = null;
        }
        j jVar3 = this.loggerFunction;
        if (jVar3 != null) {
            jVar3.d(this.jsContext);
            this.loggerFunction.h(this.jsContext);
            this.loggerFunction.a();
            this.loggerFunction = null;
        }
        j jVar4 = this.nanoFunction;
        if (jVar4 != null) {
            jVar4.d(this.jsContext);
            this.nanoFunction.h(this.jsContext);
            this.nanoFunction.a();
            this.nanoFunction = null;
        }
        o oVar = this.$ac;
        if (oVar != null) {
            oVar.h(this.jsContext);
            this.$ac.a();
            this.$ac = null;
        }
        o oVar2 = this.console;
        if (oVar2 != null) {
            oVar2.h(this.jsContext);
            this.console.a();
            this.console = null;
        }
        j jVar5 = this.dispatch;
        if (jVar5 != null) {
            jVar5.d(this.jsContext);
            this.dispatch.h(this.jsContext);
            this.dispatch.a();
            this.dispatch = null;
        }
        j jVar6 = this.register;
        if (jVar6 != null) {
            jVar6.d(this.jsContext);
            this.register.h(this.jsContext);
            this.register.a();
            this.register = null;
        }
        com.alibaba.jsi.standard.d dVar = this.jsContext;
        if (dVar != null) {
            this.jsEngine.removeContext(dVar);
            this.jsContext.b();
            this.jsContext = null;
        }
        if (this.jsEngine.getContextCount() != 0) {
            return;
        }
        this.engineScope.b();
        this.engineScope = null;
        this.jsEngine.dispose();
        this.jsEngine = null;
        threadLocalEngine.remove();
    }

    private void initJsVariant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06af253", new Object[]{this});
        } else if (this.$ac != null) {
        } else {
            o h = this.jsContext.h();
            this.$ac = (o) h.a(this.jsContext, "$ac");
            this.console = (o) h.a(this.jsContext, "console");
            this.dispatch = (j) this.$ac.a(this.jsContext, "dispatch");
            this.register = (j) this.$ac.a(this.jsContext, "register");
            h.a();
        }
    }

    private static int convertInt(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23de723e", new Object[]{wVar})).intValue();
        }
        if (!(wVar instanceof m)) {
            return 0;
        }
        return ((m) wVar).j();
    }

    private static String convertToString(w wVar, com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9c910b", new Object[]{wVar, dVar});
        }
        if (wVar.k()) {
            return wVar.a_(dVar);
        }
        if (wVar.d()) {
            return String.valueOf(((f) wVar).l_());
        }
        return wVar.g() ? String.valueOf(((m) wVar).m_()) : "unknown value";
    }

    private static w createEnvJSObject(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("15d02e5f", new Object[]{dVar, wVar});
        }
        o oVar = new o(dVar);
        oVar.a(dVar, "env", wVar);
        return oVar;
    }

    private static w createJSObject(com.alibaba.jsi.standard.d dVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("5ae4b7f2", new Object[]{dVar, obj});
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double) || (obj instanceof Long)) {
                return new m(((Number) obj).doubleValue());
            }
            return new m(((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            return new f(((Boolean) obj).booleanValue());
        } else {
            if (obj instanceof String) {
                return new s((String) obj);
            }
            if (obj instanceof Map) {
                o oVar = new o(dVar);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    w createJSObject = createJSObject(dVar, entry.getValue());
                    if (createJSObject != null) {
                        oVar.a(dVar, (String) entry.getKey(), createJSObject);
                        createJSObject.a();
                    }
                }
                return oVar;
            } else if (!(obj instanceof List)) {
                return null;
            } else {
                List list = (List) obj;
                com.alibaba.jsi.standard.js.d dVar2 = new com.alibaba.jsi.standard.js.d(dVar, list.size());
                for (int i = 0; i < list.size(); i++) {
                    w createJSObject2 = createJSObject(dVar, list.get(i));
                    if (createJSObject2 != null) {
                        dVar2.a(dVar, i, createJSObject2);
                        createJSObject2.a();
                    }
                }
                return dVar2;
            }
        }
    }

    private void reportJSErrorFromJSI(com.alibaba.jsi.standard.d dVar, i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c901546", new Object[]{this, dVar, iVar, new Integer(i)});
            return;
        }
        String parseFromError = parseFromError(i);
        String c2 = iVar.c(dVar);
        String d2 = iVar.d(dVar);
        HashMap hashMap = new HashMap();
        hashMap.put("msg", c2);
        hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, d2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", "js_error");
        hashMap2.put("params", hashMap);
        hashMap2.put("action", parseFromError);
        com.taobao.tao.flexbox.layoutmanager.core.w.a(this.jsCore.f20406a.b(), hashMap2, this.jsCore.f20406a.b().A());
    }
}
