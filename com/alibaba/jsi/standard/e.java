package com.alibaba.jsi.standard;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Map<String, Long> h;
    private static final Map<Long, JSEngine> i;
    private static final Object j;
    public static final int kEngineJSC = 2;
    public static final int kEngineQJS = 3;
    public static final int kEngineV8 = 1;
    private static final AtomicBoolean r;
    private static int s;

    /* renamed from: a  reason: collision with root package name */
    public long f3130a;
    public final boolean c;
    private final String d;
    private final Object e;
    private final ArrayList<d> f = new ArrayList<>();
    private final Runnable g = new a(4);
    public boolean b = true;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private int n = 20;
    private final Set<com.alibaba.jsi.standard.js.b> o = new HashSet();
    private final Object[] p = new Object[6];
    private com.alibaba.jsi.standard.a q = null;

    public static /* synthetic */ boolean access$002(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18849753", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.k = z;
        return z;
    }

    public static /* synthetic */ Object access$100(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5ed5f3ce", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ void access$200(e eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d492e39", new Object[]{eVar, str, str2});
        } else {
            eVar.doStartTrace(str, str2);
        }
    }

    public static /* synthetic */ void access$300(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105ae766", new Object[]{eVar});
        } else {
            eVar.doStopTrace();
        }
    }

    public static /* synthetic */ void access$400(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7733a727", new Object[]{eVar});
        } else {
            eVar.doPrintObjects();
        }
    }

    static {
        kge.a(1175054814);
        h = new HashMap();
        i = new HashMap();
        j = new Object();
        r = new AtomicBoolean(false);
        s = 1;
    }

    public e(Object obj, Map<String, String> map, long j2, Object obj2) {
        Object obj3;
        this.f3130a = 0L;
        this.c = j2 == 0;
        if (obj != null) {
            h.a(obj);
        }
        this.d = map.get("name");
        if (obj2 == null) {
            obj3 = g.b();
            if (obj3 == null) {
                if (this.c) {
                    throw new RuntimeException("Create JSEngine in a thread with Looper, or specify a Handler");
                }
                warnThreadNoHandler();
            }
        } else {
            obj3 = obj2;
        }
        this.e = obj3;
        if (this.c) {
            syncGlobalInfos(obj);
            String str = map.get("version");
            String str2 = h.b;
            if ((getNativeInfos() & s) != 0 || supportMultipleEngine()) {
                Object engineCmd = Bridge.engineCmd(null, 8, Integer.parseInt(map.get("engine")), Integer.parseInt(map.get("timeout")), new Object[]{str2, this.d, str});
                if (engineCmd instanceof Long) {
                    this.f3130a = ((Long) engineCmd).longValue();
                } else {
                    g.c("Create JSEngine '" + this.d + "' failed!");
                }
            } else {
                this.f3130a = JNIBridge.nativeInitInstance(str2, this.d, str);
            }
            requestLoopAsync(0L);
            return;
        }
        this.f3130a = j2;
    }

    private static void syncGlobalInfos(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796b2b6a", new Object[]{obj});
        } else if (obj == null || r.getAndSet(true)) {
        } else {
            String c = g.c(obj);
            String a2 = g.a(obj, c);
            JNIBridge.nativeSetInfo(0L, "app-package", c, 0L);
            JNIBridge.nativeSetInfo(0L, "app-version", a2, 0L);
        }
    }

    public long getNativeInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f2d623d", new Object[]{this})).longValue() : this.f3130a;
    }

    public synchronized void dispose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b24946e", new Object[]{this, new Boolean(z)});
            return;
        }
        for (d dVar : getContexts()) {
            removeContext(dVar);
        }
        if (this.l && this.b) {
            g.a("Print java objects at dispose ...");
            doPrintObjects();
        }
        long j2 = this.f3130a;
        this.f3130a = 0L;
        if (!z) {
            JNIBridge.nativeDisposeInstance(j2);
        }
        if (this.l) {
            f.a(false);
            this.l = false;
        }
        synchronized (i) {
            h.remove(this.d);
            i.remove(Long.valueOf(j2));
        }
    }

    public static JSEngine getInstance(long j2) {
        JSEngine jSEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("a7f60656", new Object[]{new Long(j2)});
        }
        synchronized (i) {
            jSEngine = i.get(Long.valueOf(j2));
        }
        return jSEngine;
    }

    public static JSEngine createInstanceImpl(Object obj, Map<String, String> map, long j2, Object obj2) {
        JSEngine jSEngine;
        String str;
        JSEngine jSEngine2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("77b0d573", new Object[]{obj, map, new Long(j2), obj2});
        }
        String str2 = map.get("name");
        synchronized (i) {
            Long l = h.get(str2);
            if (l != null && l.longValue() != 0 && (jSEngine2 = i.get(l)) != null) {
                g.b("Instance '" + str2 + "' already created!");
                return jSEngine2;
            }
            JSEngine jSEngine3 = new JSEngine(obj, map, j2, obj2);
            synchronized (i) {
                jSEngine = i.get(Long.valueOf(jSEngine3.f3130a));
                if (jSEngine != null && (jSEngine.c || !jSEngine3.c)) {
                    g.b("JSEngine '" + str2 + "' (" + jSEngine.f3130a + ") already created!");
                    str = null;
                }
                h.put(str2, Long.valueOf(jSEngine3.f3130a));
                i.put(Long.valueOf(jSEngine3.f3130a), jSEngine3);
                str = map.get("flags");
                jSEngine = jSEngine3;
            }
            if (str != null && str.length() > 0) {
                jSEngine.b = !str.contains("--disable-print-objects-at-dispose");
                JNIBridge.nativeSetInfo(jSEngine.f3130a, "flags", str, 0L);
            }
            return jSEngine;
        }
    }

    public static boolean loadSoImpl(String str, String str2, String str3) {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbdefcb", new Object[]{str, str2, str3})).booleanValue();
        }
        synchronized (j) {
            a2 = h.a(str, str2, str3);
        }
        return a2;
    }

    public d createContextImpl(String str, Object obj, Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d1f01646", new Object[]{this, str, obj, cls});
        }
        d dVar = new d(str, obj, (JSEngine) this, cls);
        dVar.a(new a(6, new Object[]{dVar}));
        synchronized (this.f) {
            this.f.add(dVar);
        }
        requestLoopAsync(0L);
        return dVar;
    }

    public static JSEngine getInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("4e7dce40", new Object[]{str});
        }
        synchronized (i) {
            Long l = h.get(str);
            if (l == null || l.longValue() == 0) {
                return null;
            }
            return i.get(l);
        }
    }

    public String getEmbedderName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15edce0", new Object[]{this}) : this.d;
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            dispose(false);
        }
    }

    public boolean isDisposed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue() : this.f3130a == 0;
    }

    public List<d> getContexts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31051686", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f) {
            Iterator<d> it = this.f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public int getContextCount() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4792fc90", new Object[]{this})).intValue();
        }
        synchronized (this.f) {
            size = this.f.size();
        }
        return size;
    }

    public d getContext(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("299b64df", new Object[]{this, new Long(j2)});
        }
        synchronized (this.f) {
            Iterator<d> it = this.f.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next.f() == j2) {
                    return next;
                }
            }
            return null;
        }
    }

    public d createContext(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("88fa72bf", new Object[]{this, str}) : createContextImpl(str, null, null);
    }

    public void removeContext(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645c855f", new Object[]{this, dVar});
            return;
        }
        if (!dVar.c()) {
            dVar.b();
        }
        synchronized (this.f) {
            this.f.remove(dVar);
        }
        requestLoopAsync(0L);
    }

    public void startTrace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9956d1e", new Object[]{this, str, str2});
            return;
        }
        if (str == null) {
            str = "/sdcard/jsi_trace_${pid}_${time}_${index}.json";
        }
        if (str2 == null) {
            str2 = "jsi,v8,v8.compile,disabled-by-default-v8.compile";
        }
        if (syncCall()) {
            doStartTrace(str, str2);
            return;
        }
        Object obj = this.e;
        if (obj != null) {
            g.a(obj, new a(1, new Object[]{str, str2}));
        } else {
            warnThreadNoHandler();
        }
    }

    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
        } else if (syncCall()) {
            doStopTrace();
        } else {
            Object obj = this.e;
            if (obj != null) {
                g.a(obj, new a(2));
            } else {
                warnThreadNoHandler();
            }
        }
    }

    public long onExternalMemoryChange(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61c793f6", new Object[]{this, new Long(j2)})).longValue();
        }
        if (syncCall()) {
            return JNIBridge.nativeCommand(9L, this.f3130a, new Object[]{Long.valueOf(j2)});
        }
        Object obj = this.e;
        if (obj != null) {
            g.a(obj, new a(7, new Object[]{Long.valueOf(j2)}));
            return -1L;
        }
        warnThreadNoHandler();
        return -1L;
    }

    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else if (syncCall()) {
            JNIBridge.nativeOnLowMemory(this.f3130a);
        } else {
            Object obj = this.e;
            if (obj != null) {
                g.a(obj, new a(5));
            } else {
                warnThreadNoHandler();
            }
        }
    }

    public void setEnableStats(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45573c53", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.l != z && !isDisposed()) {
            f.a(z);
            this.l = z;
        }
        if (!z) {
            synchronized (this.o) {
                this.o.clear();
                this.m = false;
            }
        }
        Bridge.engineCmd((JSEngine) this, 5, z ? 1L : 0L);
    }

    public void setMaxPrintCount(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b45c38", new Object[]{this, new Integer(i2)});
        } else {
            this.n = i2;
        }
    }

    public void printObjects() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688c16ae", new Object[]{this});
        } else if (syncCall()) {
            doPrintObjects();
        } else {
            Object obj = this.e;
            if (obj != null) {
                g.a(obj, new a(3));
            } else {
                warnThreadNoHandler();
            }
        }
    }

    public int getCurrentEngineType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("371fb739", new Object[]{this})).intValue();
        }
        Object engineCmd = Bridge.engineCmd((JSEngine) this, 6, 0L);
        if (!(engineCmd instanceof Integer)) {
            return 0;
        }
        return ((Integer) engineCmd).intValue();
    }

    public static boolean supportMultipleEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51ba422c", new Object[0])).booleanValue() : Bridge.engineCmd(null, 7, 0L) != null;
    }

    public static String getEngineType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d7c59a7", new Object[0]);
        }
        Object engineCmd = Bridge.engineCmd(null, 4, 0L);
        if (!(engineCmd instanceof String)) {
            return null;
        }
        return (String) engineCmd;
    }

    public static boolean isEngineReady(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b235cc9", new Object[]{new Integer(i2)})).booleanValue() : h.a(i2);
    }

    public static String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]) : JNIBridge.nativeGetVersion(null);
    }

    public static int getVersionInt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6abd31e7", new Object[0])).intValue() : (int) JNIBridge.nativeCommand(3L, 0L, null);
    }

    public boolean setData(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f015f90", new Object[]{this, new Integer(i2), obj})).booleanValue();
        }
        Object[] objArr = this.p;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = obj;
        return true;
    }

    public Object getData(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fcb63b76", new Object[]{this, new Integer(i2)});
        }
        Object[] objArr = this.p;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    public int getDataSlotsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbb81794", new Object[]{this})).intValue() : this.p.length;
    }

    public static boolean startRemoteInspect(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3fed341", new Object[]{str})).booleanValue() : JNIBridge.nativeCommand(10L, 0L, new Object[]{str}) == 1;
    }

    public static void stopRemoteInspect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f604a093", new Object[0]);
        } else {
            JNIBridge.nativeCommand(11L, 0L, null);
        }
    }

    public void setEventListener(com.alibaba.jsi.standard.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cecfefe3", new Object[]{this, aVar});
        } else {
            this.q = aVar;
        }
    }

    public com.alibaba.jsi.standard.a getEventListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.jsi.standard.a) ipChange.ipc$dispatch("bf51aea7", new Object[]{this}) : this.q;
    }

    public boolean setCodeCache(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0399a8", new Object[]{this, str})).booleanValue() : 1 == JNIBridge.nativeCommand(13L, getNativeInstance(), new String[]{str});
    }

    public static boolean enableScriptCoverage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9ce30bb", new Object[]{new Boolean(z)})).booleanValue();
        }
        return 1 == JNIBridge.nativeCommand(14L, z ? 1L : 0L, null);
    }

    public static void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
        } else {
            JNIBridge.nativeCommand(15L, 0L, new Object[]{h.b});
        }
    }

    public static int setMaxCacheSize(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4bc00ce", new Object[]{new Integer(i2)})).intValue() : (int) JNIBridge.nativeCommand(16L, i2, new Object[]{h.b});
    }

    public void objectCreated(com.alibaba.jsi.standard.js.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2010e9f3", new Object[]{this, bVar});
        } else if (!this.l) {
        } else {
            synchronized (this.o) {
                this.o.add(bVar);
                this.m = true;
            }
        }
    }

    public void objectDeleted(com.alibaba.jsi.standard.js.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89296322", new Object[]{this, bVar});
        } else if (!this.m) {
        } else {
            synchronized (this.o) {
                this.o.remove(bVar);
                if (this.o.size() == 0) {
                    z = false;
                }
                this.m = z;
            }
        }
    }

    public void requestLoopAsync(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d6ec54", new Object[]{this, new Long(j2)});
            return;
        }
        Object obj = this.e;
        if (obj == null) {
            return;
        }
        g.b(obj, this.g);
        g.a(this.e, this.g, j2);
    }

    public void notifyDeleteUnusedObjects(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a3f53e", new Object[]{this, dVar});
        } else if (this.e == null) {
        } else {
            Runnable q = dVar.q();
            g.b(this.e, q);
            g.a(this.e, q);
        }
    }

    /* loaded from: classes2.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int b;
        private final Object[] c;

        static {
            kge.a(-348721381);
            kge.a(-1390502639);
        }

        public a(int i) {
            this.b = i;
            this.c = null;
        }

        public a(int i, Object[] objArr) {
            this.b = i;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e eVar = e.this;
            e.access$002(eVar, g.d(e.access$100(eVar)));
            switch (this.b) {
                case 1:
                    e eVar2 = e.this;
                    Object[] objArr = this.c;
                    e.access$200(eVar2, (String) objArr[0], (String) objArr[1]);
                    return;
                case 2:
                    e.access$300(e.this);
                    return;
                case 3:
                    e.access$400(e.this);
                    return;
                case 4:
                    JNIBridge.nativeOnLoop(e.this.f3130a);
                    return;
                case 5:
                    JNIBridge.nativeOnLowMemory(e.this.f3130a);
                    return;
                case 6:
                    ((d) this.c[0]).p().b();
                    return;
                case 7:
                    JNIBridge.nativeCommand(9L, e.this.f3130a, this.c);
                    return;
                default:
                    g.c("Unknown JSI task " + this.b);
                    return;
            }
        }
    }

    private void doStartTrace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64edd09", new Object[]{this, str, str2});
            return;
        }
        g.a("Starting trace");
        if (JNIBridge.nativeStartTrace(this.f3130a, str, str2)) {
            return;
        }
        g.c("Start trace failed!");
    }

    private void doStopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb0629f", new Object[]{this});
            return;
        }
        g.a("Stopping trace");
        JNIBridge.nativeStopTrace(this.f3130a);
    }

    private void doPrintObjects() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f3f159", new Object[]{this});
            return;
        }
        d dVar = null;
        synchronized (this.f) {
            Iterator<d> it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (!next.c()) {
                    dVar = next;
                    break;
                }
            }
        }
        synchronized (this.o) {
            f.a(dVar, this.o, this.d, this.n);
        }
    }

    private void warnThreadNoHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d13c00", new Object[]{this});
            return;
        }
        g.b("The creation thread of JSEngine \"" + this.d + "\" do not have a looper!");
    }

    private boolean syncCall() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6953a4", new Object[]{this})).booleanValue() : this.k && g.d(this.e);
    }

    private long getNativeInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("152736f3", new Object[]{this})).longValue();
        }
        Object engineCmd = Bridge.engineCmd(null, 9, 0L);
        if (!(engineCmd instanceof Long)) {
            return 0L;
        }
        return ((Long) engineCmd).longValue();
    }
}
