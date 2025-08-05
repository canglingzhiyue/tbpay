package com.alibaba.jsi.standard;

import com.alibaba.jsi.standard.js.aa;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.m;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.s;
import com.alibaba.jsi.standard.js.u;
import com.alibaba.jsi.standard.js.w;
import com.alibaba.jsi.standard.js.y;
import com.alibaba.jsi.standard.js.z;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.jsi.standard.d f3121a;
    private final Map<String, j> b = new HashMap();
    private final Map<String, Object> c = new HashMap();
    private final Map<Object, e> d = new WeakHashMap();
    private final Map<e, Object> e = new WeakHashMap();
    private aa f = null;
    private final Map<Class, aa> g = new HashMap();
    private final Map<Class, aa> h = new HashMap();
    private final List<com.alibaba.jsi.standard.js.b> i = new ArrayList();
    private boolean j = true;
    private boolean k = true;
    private boolean l = false;
    private boolean m = false;
    private boolean n = true;
    private boolean o = false;
    private Class<? extends Annotation> p = null;
    private boolean q = false;

    static {
        kge.a(-528863698);
    }

    public static /* synthetic */ o a(c cVar, com.alibaba.jsi.standard.d dVar, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("ba8b41e5", new Object[]{cVar, dVar, obj}) : cVar.b(dVar, obj);
    }

    public static /* synthetic */ w a(c cVar, com.alibaba.jsi.standard.js.a aVar, Class cls, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("4eaea6a5", new Object[]{cVar, aVar, cls, obj, obj2}) : cVar.a(aVar, cls, obj, obj2);
    }

    public static /* synthetic */ Class a(c cVar, com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("3800c018", new Object[]{cVar, dVar, wVar}) : cVar.b(dVar, wVar);
    }

    public static /* synthetic */ Object a(c cVar, com.alibaba.jsi.standard.d dVar, w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2d04e789", new Object[]{cVar, dVar, wVar, new Boolean(z)}) : cVar.a(dVar, wVar, z);
    }

    public static /* synthetic */ String a(Class[] clsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("983e2af0", new Object[]{clsArr}) : b(clsArr);
    }

    public static /* synthetic */ void a(com.alibaba.jsi.standard.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7386dbbf", new Object[]{dVar, str});
        } else {
            b(dVar, str);
        }
    }

    public static /* synthetic */ void a(com.alibaba.jsi.standard.d dVar, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51e3596", new Object[]{dVar, str, th});
        } else {
            b(dVar, str, th);
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20de40da", new Object[]{cVar})).booleanValue() : cVar.q;
    }

    public static /* synthetic */ boolean a(c cVar, Class cls, Class cls2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eba4cfa", new Object[]{cVar, cls, cls2})).booleanValue() : cVar.a((Class<?>) cls, cls2);
    }

    public static /* synthetic */ boolean a(c cVar, Class[] clsArr, Class[] clsArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf9f466a", new Object[]{cVar, clsArr, clsArr2})).booleanValue() : cVar.a(clsArr, clsArr2);
    }

    public static /* synthetic */ Class[] a(c cVar, com.alibaba.jsi.standard.d dVar, com.alibaba.jsi.standard.js.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class[]) ipChange.ipc$dispatch("f805347d", new Object[]{cVar, dVar, aVar}) : cVar.a(dVar, aVar);
    }

    public static /* synthetic */ Map b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("27854acc", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ Map c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9cff710d", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ Class d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ca683386", new Object[]{cVar}) : cVar.p;
    }

    public c(com.alibaba.jsi.standard.d dVar) {
        this.f3121a = dVar;
    }

    public void a(Object obj, Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5e9579", new Object[]{this, obj, cls});
            return;
        }
        this.p = cls;
        if (obj == null) {
            return;
        }
        this.j = com.alibaba.jsi.standard.g.a(obj, "javaSuper", this.j);
        this.k = com.alibaba.jsi.standard.g.a(obj, "javaField", this.k);
        this.l = com.alibaba.jsi.standard.g.a(obj, "javaClass", this.l);
        this.m = com.alibaba.jsi.standard.g.a(obj, "classObject", this.m);
        this.n = com.alibaba.jsi.standard.g.a(obj, "innerClass", this.n);
        this.o = com.alibaba.jsi.standard.g.a(obj, "jsObject", this.o);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        b();
        e();
        a(this.f3121a);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        aa aaVar = this.f;
        if (aaVar != null) {
            aaVar.a();
            this.f = null;
        }
        for (aa aaVar2 : this.g.values()) {
            aaVar2.a();
        }
        this.g.clear();
        for (aa aaVar3 : this.h.values()) {
            aaVar3.a();
        }
        this.h.clear();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSEngine g2 = this.f3121a.g();
        synchronized (this.i) {
            if (this.i.isEmpty()) {
                return;
            }
            if (g2.isDisposed()) {
                this.i.clear();
                return;
            }
            com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(g2);
            try {
                synchronized (this.i) {
                    for (com.alibaba.jsi.standard.js.b bVar : this.i) {
                        bVar.a();
                    }
                    this.i.clear();
                }
            } finally {
                cVar.b();
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this.i) {
            if (this.i.size() >= 30) {
                for (com.alibaba.jsi.standard.js.b bVar : this.i) {
                    bVar.a();
                }
                this.i.clear();
            }
        }
    }

    public void a(com.alibaba.jsi.standard.js.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba10ed3b", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            synchronized (this.i) {
                this.i.add(bVar);
            }
            this.f3121a.g().notifyDeleteUnusedObjects(this.f3121a);
        }
    }

    /* loaded from: classes2.dex */
    public class a extends com.alibaba.jsi.standard.js.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f3122a;
        private final Class c;

        static {
            kge.a(-1431871637);
        }

        public a(Object obj) {
            this.f3122a = obj;
            this.c = this.f3122a.getClass().getComponentType();
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this}) : this.f3122a.toString();
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final void onDetached() {
            e eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fa39278", new Object[]{this});
            } else if (c.a(c.this) || (eVar = (e) c.b(c.this).remove(this.f3122a)) == null) {
            } else {
                eVar.a(false);
                c.c(c.this).remove(eVar);
            }
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final w onGetIndexedProperty(com.alibaba.jsi.standard.d dVar, w wVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("24174676", new Object[]{this, dVar, wVar, new Integer(i)});
            }
            wVar.a();
            try {
                return c.this.a(dVar, Array.get(this.f3122a, i));
            } catch (Throwable th) {
                c.a(dVar, "Get array element at " + i + " failed: " + th.toString(), th);
                return null;
            }
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final w onSetIndexedProperty(com.alibaba.jsi.standard.d dVar, w wVar, int i, w wVar2) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("e7ad3a40", new Object[]{this, dVar, wVar, new Integer(i), wVar2});
            }
            wVar.a();
            Class cls = this.c;
            if (cls != null) {
                c cVar = c.this;
                if (c.a(cVar, cls, c.a(cVar, dVar, wVar2))) {
                    try {
                        obj = c.this.a(dVar, wVar2);
                    } catch (Throwable th) {
                        th = th;
                        obj = null;
                    }
                    try {
                        Array.set(this.f3122a, i, obj);
                        return wVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        wVar2.a();
                        if (obj instanceof w) {
                            ((w) obj).a();
                        }
                        c.a(dVar, "Set array element at " + i + " failed: " + th.toString(), th);
                        return null;
                    }
                }
            }
            wVar2.a();
            c.a(dVar, "Set a mismatch value type into array at index " + i);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class f extends com.alibaba.jsi.standard.js.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f3127a;
        private final Class c;

        static {
            kge.a(-1431871632);
        }

        public f(Object obj) {
            this.f3127a = obj;
            this.c = obj.getClass();
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this}) : this.f3127a.toString();
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final void onDetached() {
            e eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fa39278", new Object[]{this});
            } else if (c.a(c.this) || (eVar = (e) c.b(c.this).remove(this.f3127a)) == null) {
            } else {
                eVar.a(false);
                c.c(c.this).remove(eVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // com.alibaba.jsi.standard.js.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.alibaba.jsi.standard.js.w onGetProperty(com.alibaba.jsi.standard.d r5, com.alibaba.jsi.standard.js.w r6, java.lang.String r7) {
            /*
                r4 = this;
                r6.a()
                java.lang.Object r6 = r4.f3127a
                r0 = 0
                if (r6 != 0) goto L1a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r1 = "Java object has been detached while getting "
                r6.<init>(r1)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.alibaba.jsi.standard.c.a(r5, r6)
                return r0
            L1a:
                r6 = 1
                java.lang.Class r1 = r4.c     // Catch: java.lang.NoSuchFieldException -> L25
                java.lang.reflect.Field r1 = r1.getField(r7)     // Catch: java.lang.NoSuchFieldException -> L25
                r1.setAccessible(r6)     // Catch: java.lang.NoSuchFieldException -> L26
                goto L37
            L25:
                r1 = r0
            L26:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Not found property "
                r2.<init>(r3)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.alibaba.jsi.standard.c.a(r5, r2)
            L37:
                if (r1 == 0) goto L7e
                int r2 = r1.getModifiers()
                r2 = r2 & 9
                if (r2 == r6) goto L53
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r1 = "No property named "
                r6.<init>(r1)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.alibaba.jsi.standard.c.a(r5, r6)
                goto L7e
            L53:
                java.lang.Object r6 = r4.f3127a     // Catch: java.lang.Throwable -> L60
                java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L60
                com.alibaba.jsi.standard.c r1 = com.alibaba.jsi.standard.c.this     // Catch: java.lang.Throwable -> L60
                com.alibaba.jsi.standard.js.w r0 = r1.a(r5, r6)     // Catch: java.lang.Throwable -> L60
                goto L7e
            L60:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Get property "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r7 = " failed: "
                r1.append(r7)
                java.lang.String r7 = r6.toString()
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                com.alibaba.jsi.standard.c.a(r5, r7, r6)
            L7e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.c.f.onGetProperty(com.alibaba.jsi.standard.d, com.alibaba.jsi.standard.js.w, java.lang.String):com.alibaba.jsi.standard.js.w");
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final void onSetProperty(com.alibaba.jsi.standard.d dVar, w wVar, String str, w wVar2) {
            wVar.a();
            if (this.f3127a == null) {
                c.a(dVar, "Java object has been detached while setting " + str);
                wVar2.a();
                return;
            }
            Field field = null;
            try {
                field = this.c.getField(str);
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                c.a(dVar, "Not found property " + str);
            }
            if (field != null) {
                if ((field.getModifiers() & 9) != 1) {
                    c.a(dVar, "No property named " + str);
                } else if (c.a(c.this, field.getType(), c.a(c.this, dVar, wVar2))) {
                    Object a2 = c.this.a(dVar, wVar2);
                    try {
                        field.set(this.f3127a, a2);
                    } catch (Throwable th) {
                        if (a2 instanceof w) {
                            ((w) a2).a();
                        }
                        c.a(dVar, "Set property " + str + " failed: " + th.toString(), th);
                    }
                } else {
                    c.a(dVar, "Set a mismatch value type into property '" + str + "'");
                }
            }
            wVar2.a();
        }
    }

    /* loaded from: classes2.dex */
    public class g extends com.alibaba.jsi.standard.js.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final Class c;
        private final Object d = com.alibaba.jsi.standard.g.a();

        static {
            kge.a(-1431871631);
        }

        public g(String str, Class cls) {
            this.b = str;
            this.c = cls;
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this}) : this.b;
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
            }
            com.alibaba.jsi.standard.d b = aVar.b();
            w c = aVar.c();
            Object a2 = c.a(c.this, b, c, false);
            if (a2 == null) {
                c.a();
                c.a(b, "Can not get java this object while calling '" + aVar.d() + "', it may be detached");
                return null;
            }
            w a3 = c.a(c.this, aVar, a2.getClass(), a2, this.d);
            c.a();
            return a3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // com.alibaba.jsi.standard.js.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.alibaba.jsi.standard.js.w onGetProperty(com.alibaba.jsi.standard.d r4, com.alibaba.jsi.standard.js.w r5, java.lang.String r6) {
            /*
                r3 = this;
                r5.a()
                r5 = 0
                java.lang.Class r0 = r3.c     // Catch: java.lang.NoSuchFieldException -> Lf
                java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: java.lang.NoSuchFieldException -> Lf
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L10
                goto L21
            Lf:
                r0 = r5
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Not found static property "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                com.alibaba.jsi.standard.c.a(r4, r1)
            L21:
                if (r0 == 0) goto L67
                int r1 = r0.getModifiers()
                r2 = 9
                r1 = r1 & r2
                if (r1 == r2) goto L3e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "No static property named "
                r0.<init>(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                com.alibaba.jsi.standard.c.a(r4, r6)
                goto L67
            L3e:
                java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L49
                com.alibaba.jsi.standard.c r1 = com.alibaba.jsi.standard.c.this     // Catch: java.lang.Throwable -> L49
                com.alibaba.jsi.standard.js.w r5 = r1.a(r4, r0)     // Catch: java.lang.Throwable -> L49
                goto L67
            L49:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Get static property "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r6 = " failed: "
                r1.append(r6)
                java.lang.String r6 = r0.toString()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                com.alibaba.jsi.standard.c.a(r4, r6, r0)
            L67:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.c.g.onGetProperty(com.alibaba.jsi.standard.d, com.alibaba.jsi.standard.js.w, java.lang.String):com.alibaba.jsi.standard.js.w");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        @Override // com.alibaba.jsi.standard.js.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSetProperty(com.alibaba.jsi.standard.d r5, com.alibaba.jsi.standard.js.w r6, java.lang.String r7, com.alibaba.jsi.standard.js.w r8) {
            /*
                r4 = this;
                r6.a()
                r6 = 0
                java.lang.Class r0 = r4.c     // Catch: java.lang.NoSuchFieldException -> Lf
                java.lang.reflect.Field r0 = r0.getField(r7)     // Catch: java.lang.NoSuchFieldException -> Lf
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L10
                goto L21
            Lf:
                r0 = r6
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Not found static property "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.alibaba.jsi.standard.c.a(r5, r1)
            L21:
                if (r0 == 0) goto L98
                int r1 = r0.getModifiers()
                r2 = 9
                r1 = r1 & r2
                if (r1 == r2) goto L3e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "No static property named "
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.alibaba.jsi.standard.c.a(r5, r6)
                goto L98
            L3e:
                com.alibaba.jsi.standard.c r1 = com.alibaba.jsi.standard.c.this
                java.lang.Class r2 = r0.getType()
                com.alibaba.jsi.standard.c r3 = com.alibaba.jsi.standard.c.this
                java.lang.Class r3 = com.alibaba.jsi.standard.c.a(r3, r5, r8)
                boolean r1 = com.alibaba.jsi.standard.c.a(r1, r2, r3)
                if (r1 == 0) goto L82
                com.alibaba.jsi.standard.c r1 = com.alibaba.jsi.standard.c.this
                java.lang.Object r1 = r1.a(r5, r8)
                r0.set(r6, r1)     // Catch: java.lang.Throwable -> L5a
                goto L98
            L5a:
                r6 = move-exception
                boolean r0 = r1 instanceof com.alibaba.jsi.standard.js.w
                if (r0 == 0) goto L64
                com.alibaba.jsi.standard.js.w r1 = (com.alibaba.jsi.standard.js.w) r1
                r1.a()
            L64:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Set static property "
                r0.<init>(r1)
                r0.append(r7)
                java.lang.String r7 = " failed: "
                r0.append(r7)
                java.lang.String r7 = r6.toString()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                com.alibaba.jsi.standard.c.a(r5, r7, r6)
                goto L98
            L82:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Set a mismatch value type into static property '"
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r7 = "'"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.alibaba.jsi.standard.c.a(r5, r6)
            L98:
                r8.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.c.g.onSetProperty(com.alibaba.jsi.standard.d, com.alibaba.jsi.standard.js.w, java.lang.String, com.alibaba.jsi.standard.js.w):void");
        }
    }

    /* renamed from: com.alibaba.jsi.standard.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0115c extends com.alibaba.jsi.standard.js.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Class f3124a;
        private final String c;

        static {
            kge.a(-1431871635);
        }

        public C0115c(String str, Class cls) {
            this.c = str;
            this.f3124a = cls;
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this}) : this.c;
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
            Object[] objArr;
            com.alibaba.jsi.standard.d b = aVar.b();
            if (!aVar.e()) {
                c.a(b, "Java constructor '" + this.c + "' can not be called as a function!");
                return null;
            }
            if (this.f3124a.isInterface()) {
                if (aVar.a() == 1) {
                    w a2 = aVar.a(0);
                    if (a2 instanceof o) {
                        return c.this.a(b, b.l().a((o) a2, this.f3124a));
                    } else if (a2 != null) {
                        a2.a();
                    }
                }
                c.a(b, "Java interface constructor " + this.c + " only accept one JSObject argument!");
                return null;
            }
            Constructor<?>[] constructors = this.f3124a.getConstructors();
            Class[] a3 = c.a(c.this, b, aVar);
            for (Constructor<?> constructor : constructors) {
                if ((constructor.getModifiers() & 1) != 0 && ((c.d(c.this) == null || constructor.isAnnotationPresent(c.d(c.this))) && c.a(c.this, constructor.getParameterTypes(), a3))) {
                    int length = a3.length;
                    if (length > 0) {
                        objArr = new Object[length];
                        for (int i = 0; i < length; i++) {
                            w a4 = aVar.a(i);
                            objArr[i] = c.this.a(b, a4);
                            a4.a();
                        }
                    } else {
                        objArr = null;
                    }
                    try {
                        return c.a(c.this, b, constructor.newInstance(objArr));
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        while (th2.getCause() != null) {
                            th2 = th2.getCause();
                        }
                        c.a(b, "Java constructor occurs exception: " + th2.toString(), th);
                        return null;
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Can not found a matched constructor for '");
            sb.append(this.c);
            sb.append("' with ");
            sb.append(aVar.a());
            sb.append(" argument");
            sb.append(aVar.a() > 1 ? "s " : " ");
            sb.append(c.a(a3));
            c.a(b, sb.toString());
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends com.alibaba.jsi.standard.js.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final Class c;
        private final Object d = com.alibaba.jsi.standard.g.a();

        static {
            kge.a(-1431871636);
        }

        public b(String str, Class cls) {
            this.b = str;
            this.c = cls;
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this}) : this.b;
        }

        @Override // com.alibaba.jsi.standard.js.h
        public final w onCallFunction(com.alibaba.jsi.standard.js.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("8f6a3446", new Object[]{this, aVar}) : c.a(c.this, aVar, this.c, null, this.d);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        @Override // com.alibaba.jsi.standard.js.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.alibaba.jsi.standard.js.w onGetProperty(com.alibaba.jsi.standard.d r5, com.alibaba.jsi.standard.js.w r6, java.lang.String r7) {
            /*
                r4 = this;
                r0 = 0
                java.lang.Class r1 = r4.c     // Catch: java.lang.NoSuchFieldException -> Lc
                java.lang.reflect.Field r1 = r1.getField(r7)     // Catch: java.lang.NoSuchFieldException -> Lc
                r2 = 1
                r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> Ld
                goto L1e
            Lc:
                r1 = r0
            Ld:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Not found static property "
                r2.<init>(r3)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.alibaba.jsi.standard.c.a(r5, r2)
            L1e:
                if (r1 == 0) goto L64
                int r2 = r1.getModifiers()
                r3 = 9
                r2 = r2 & r3
                if (r2 == r3) goto L3b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "No static property named "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                com.alibaba.jsi.standard.c.a(r5, r7)
                goto L64
            L3b:
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L46
                com.alibaba.jsi.standard.c r2 = com.alibaba.jsi.standard.c.this     // Catch: java.lang.Throwable -> L46
                com.alibaba.jsi.standard.js.w r0 = r2.a(r5, r1)     // Catch: java.lang.Throwable -> L46
                goto L64
            L46:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Get static property '"
                r2.<init>(r3)
                r2.append(r7)
                java.lang.String r7 = "' failed: "
                r2.append(r7)
                java.lang.String r7 = r1.toString()
                r2.append(r7)
                java.lang.String r7 = r2.toString()
                com.alibaba.jsi.standard.c.a(r5, r7, r1)
            L64:
                r6.a()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.c.b.onGetProperty(com.alibaba.jsi.standard.d, com.alibaba.jsi.standard.js.w, java.lang.String):com.alibaba.jsi.standard.js.w");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        @Override // com.alibaba.jsi.standard.js.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSetProperty(com.alibaba.jsi.standard.d r6, com.alibaba.jsi.standard.js.w r7, java.lang.String r8, com.alibaba.jsi.standard.js.w r9) {
            /*
                r5 = this;
                r0 = 0
                java.lang.Class r1 = r5.c     // Catch: java.lang.NoSuchFieldException -> Lc
                java.lang.reflect.Field r1 = r1.getField(r8)     // Catch: java.lang.NoSuchFieldException -> Lc
                r2 = 1
                r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> Ld
                goto L1e
            Lc:
                r1 = r0
            Ld:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Not found static property "
                r2.<init>(r3)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                com.alibaba.jsi.standard.c.a(r6, r2)
            L1e:
                if (r1 == 0) goto L95
                int r2 = r1.getModifiers()
                r3 = 9
                r2 = r2 & r3
                if (r2 == r3) goto L3b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "No static property named "
                r0.<init>(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                com.alibaba.jsi.standard.c.a(r6, r8)
                goto L95
            L3b:
                com.alibaba.jsi.standard.c r2 = com.alibaba.jsi.standard.c.this
                java.lang.Class r3 = r1.getType()
                com.alibaba.jsi.standard.c r4 = com.alibaba.jsi.standard.c.this
                java.lang.Class r4 = com.alibaba.jsi.standard.c.a(r4, r6, r9)
                boolean r2 = com.alibaba.jsi.standard.c.a(r2, r3, r4)
                if (r2 == 0) goto L7f
                com.alibaba.jsi.standard.c r2 = com.alibaba.jsi.standard.c.this
                java.lang.Object r2 = r2.a(r6, r9)
                r1.set(r0, r2)     // Catch: java.lang.Throwable -> L57
                goto L95
            L57:
                r0 = move-exception
                boolean r1 = r2 instanceof com.alibaba.jsi.standard.js.w
                if (r1 == 0) goto L61
                com.alibaba.jsi.standard.js.w r2 = (com.alibaba.jsi.standard.js.w) r2
                r2.a()
            L61:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Set static property "
                r1.<init>(r2)
                r1.append(r8)
                java.lang.String r8 = " failed: "
                r1.append(r8)
                java.lang.String r8 = r0.toString()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                com.alibaba.jsi.standard.c.a(r6, r8, r0)
                goto L95
            L7f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Set a mismatch value type into static property '"
                r0.<init>(r1)
                r0.append(r8)
                java.lang.String r8 = "'"
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                com.alibaba.jsi.standard.c.a(r6, r8)
            L95:
                r7.a()
                r9.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.c.b.onSetProperty(com.alibaba.jsi.standard.d, com.alibaba.jsi.standard.js.w, java.lang.String, com.alibaba.jsi.standard.js.w):void");
        }
    }

    private w a(com.alibaba.jsi.standard.js.a aVar, Class cls, Object obj, Object obj2) {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("f9f179b7", new Object[]{this, aVar, cls, obj, obj2});
        }
        boolean z = obj == null;
        com.alibaba.jsi.standard.d b2 = aVar.b();
        String d2 = aVar.d();
        Class[] a2 = a(b2, aVar);
        Method b3 = com.alibaba.jsi.standard.g.b(obj2, d2);
        if (b3 != null && a(b3.getParameterTypes(), a2)) {
            return a(b2, aVar, b3, obj);
        }
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(d2) && ((!z || (method.getModifiers() & 9) == 9) && a(method.getParameterTypes(), a2))) {
                com.alibaba.jsi.standard.g.a(obj2, d2, method);
                return a(b2, aVar, method, obj);
            }
        }
        StringBuilder sb = new StringBuilder("Can not found a matched ");
        sb.append(z ? "static " : "");
        sb.append("method '");
        sb.append(d2);
        sb.append("' with ");
        sb.append(aVar.a());
        sb.append(" argument");
        sb.append(aVar.a() > 1 ? "s " : " ");
        sb.append(b(a2));
        b(b2, sb.toString());
        return null;
    }

    private w a(com.alibaba.jsi.standard.d dVar, com.alibaba.jsi.standard.js.a aVar, Method method, Object obj) {
        Object[] objArr;
        int a2 = aVar.a();
        if (a2 > 0) {
            objArr = new Object[a2];
            for (int i = 0; i < a2; i++) {
                w a3 = aVar.a(i);
                objArr[i] = a(dVar, a3);
                a3.a();
            }
        } else {
            objArr = null;
        }
        try {
            method.setAccessible(true);
            Object invoke = method.invoke(obj, objArr);
            if (method.getReturnType() == Void.TYPE) {
                return y.p();
            }
            return a(dVar, invoke, false);
        } catch (Throwable th) {
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            b(dVar, "Function " + aVar.d() + " occurs exception: " + th2.toString(), th);
            return null;
        }
    }

    public Object a(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("66dba5b9", new Object[]{this, dVar, wVar}) : a(dVar, wVar, true);
    }

    private Object a(com.alibaba.jsi.standard.d dVar, w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8aad2937", new Object[]{this, dVar, wVar, new Boolean(z)});
        }
        if (wVar instanceof y) {
            return null;
        }
        if (wVar instanceof com.alibaba.jsi.standard.js.f) {
            return Boolean.valueOf(((com.alibaba.jsi.standard.js.f) wVar).l_());
        }
        if (wVar instanceof m) {
            double m_ = ((m) wVar).m_();
            int i = (int) m_;
            if (m_ == i) {
                return Integer.valueOf(i);
            }
            long j = (long) m_;
            if (m_ == j) {
                return Long.valueOf(j);
            }
            return Double.valueOf(m_);
        } else if (wVar instanceof s) {
            return ((s) wVar).p_();
        } else {
            if (wVar instanceof j) {
                com.alibaba.jsi.standard.js.h c = ((j) wVar).c(dVar);
                if (c instanceof C0115c) {
                    return ((C0115c) c).f3124a;
                }
                if (!this.o) {
                    return null;
                }
                return z ? wVar.b(dVar) : wVar;
            } else if (wVar instanceof o) {
                com.alibaba.jsi.standard.js.h g2 = ((o) wVar).g(dVar);
                if (g2 instanceof f) {
                    return ((f) g2).f3127a;
                }
                if (g2 instanceof a) {
                    return ((a) g2).f3122a;
                }
                if (!this.o) {
                    return null;
                }
                return z ? wVar.b(dVar) : wVar;
            } else if (!this.o || !(wVar instanceof u)) {
                return null;
            } else {
                return z ? wVar.b(dVar) : wVar;
            }
        }
    }

    public w a(com.alibaba.jsi.standard.d dVar, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("ef1d136f", new Object[]{this, dVar, obj}) : a(dVar, obj, true);
    }

    private w a(com.alibaba.jsi.standard.d dVar, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("f4c92141", new Object[]{this, dVar, obj, new Boolean(z)});
        }
        if (obj == null) {
            return y.q();
        }
        if (obj instanceof Boolean) {
            return com.alibaba.jsi.standard.js.f.a(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return new m(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new m(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return new m(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return new s((String) obj);
        }
        if (obj instanceof Class) {
            return a(dVar, (Class) obj);
        }
        if (!(obj instanceof w)) {
            return b(dVar, obj);
        }
        if (z) {
            return ((w) obj).b(dVar);
        }
        return (w) obj;
    }

    private Class[] a(com.alibaba.jsi.standard.d dVar, com.alibaba.jsi.standard.js.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("2c97050f", new Object[]{this, dVar, aVar});
        }
        int a2 = aVar.a();
        Class[] clsArr = new Class[a2];
        for (int i = 0; i < a2; i++) {
            w a3 = aVar.a(i);
            clsArr[i] = b(dVar, a3);
            a3.a();
        }
        return clsArr;
    }

    private Class b(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("727cfb25", new Object[]{this, dVar, wVar});
        }
        if (wVar instanceof com.alibaba.jsi.standard.js.f) {
            return Boolean.TYPE;
        }
        if (wVar instanceof m) {
            double m_ = ((m) wVar).m_();
            if (m_ == ((int) m_)) {
                return Integer.TYPE;
            }
            if (m_ == ((long) m_)) {
                return Long.TYPE;
            }
            return Double.TYPE;
        } else if (wVar instanceof y) {
            return Void.TYPE;
        } else {
            if (wVar instanceof s) {
                return String.class;
            }
            if (wVar instanceof j) {
                if (((j) wVar).c(dVar) instanceof C0115c) {
                    return Class.class;
                }
                if (!this.o) {
                    return null;
                }
                return wVar.getClass();
            } else if (wVar instanceof o) {
                com.alibaba.jsi.standard.js.h g2 = ((o) wVar).g(dVar);
                if (g2 instanceof f) {
                    Object obj = ((f) g2).f3127a;
                    if (obj == null) {
                        return null;
                    }
                    return obj.getClass();
                } else if (g2 instanceof a) {
                    Object obj2 = ((a) g2).f3122a;
                    if (obj2 == null) {
                        return null;
                    }
                    return obj2.getClass();
                } else if (!this.o) {
                    return null;
                } else {
                    return wVar.getClass();
                }
            } else if (this.o && (wVar instanceof u)) {
                return wVar.getClass();
            } else {
                return null;
            }
        }
    }

    private boolean a(Class[] clsArr, Class[] clsArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a90fc", new Object[]{this, clsArr, clsArr2})).booleanValue();
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        int i = 0;
        for (Class cls : clsArr2) {
            if (!a((Class<?>) clsArr[i], cls)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean a(Class<?> cls, Class cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f9b140c", new Object[]{this, cls, cls2})).booleanValue();
        }
        if (cls2 == null) {
            return false;
        }
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        return (cls2 == Boolean.TYPE || cls2 == Boolean.class) ? cls == Boolean.class || cls == Boolean.TYPE || cls == Object.class : (cls2 == Integer.TYPE || cls2 == Integer.class) ? cls == Integer.class || cls == Integer.TYPE || cls == Long.class || cls == Long.TYPE || cls == Double.class || cls == Double.TYPE || cls == Object.class : (cls2 == Long.TYPE || cls2 == Long.class) ? cls == Long.class || cls == Long.TYPE || cls == Double.class || cls == Double.TYPE || cls == Object.class : (cls2 == Double.TYPE || cls2 == Double.class) ? cls == Double.class || cls == Double.TYPE || cls == Object.class : ((cls2 != Void.TYPE && cls2 != Void.class) || cls == Boolean.TYPE || cls == Integer.TYPE || cls == Long.TYPE || cls == Double.TYPE || cls == Byte.TYPE || cls == Character.TYPE || cls == Short.TYPE || cls == Float.TYPE) ? false : true;
    }

    private static String b(Class[] clsArr) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef5c1bcf", new Object[]{clsArr});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BRACKET_START_STR);
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == Boolean.TYPE) {
                name = com.taobao.android.weex_framework.util.a.ATOM_boolean;
            } else if (cls == Integer.TYPE) {
                name = "int";
            } else if (cls == Long.TYPE) {
                name = "long";
            } else if (cls == Double.TYPE) {
                name = "double";
            } else if (cls == String.class) {
                name = com.taobao.android.weex_framework.util.a.ATOM_String;
            } else if (cls == Void.TYPE) {
                name = "Object";
            } else if (cls == Class.class) {
                name = "Class";
            } else {
                name = cls != null ? cls.getName() : "<unsupported>";
            }
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(name);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }

    /* loaded from: classes2.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public z f3126a;
        private com.alibaba.jsi.standard.d c;

        static {
            kge.a(-1431871633);
        }

        public e(com.alibaba.jsi.standard.d dVar, o oVar) {
            this.c = dVar;
            this.f3126a = oVar.i(dVar);
        }

        public final void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            z zVar = this.f3126a;
            if (zVar == null) {
                return;
            }
            c.this.a(zVar);
            this.f3126a = null;
        }

        public final boolean a(boolean z) {
            w a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            z zVar = this.f3126a;
            if (zVar == null) {
                return false;
            }
            this.f3126a = null;
            if (z && (a2 = zVar.a(this.c)) != null) {
                if (a2 instanceof o) {
                    ((o) a2).h(this.c);
                }
                a2.a();
            }
            zVar.a();
            return true;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.q = true;
        for (e eVar : this.e.keySet()) {
            eVar.a(true);
        }
        this.q = false;
        this.d.clear();
        this.e.clear();
        this.c.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.jsi.standard.js.o b(com.alibaba.jsi.standard.d r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.c.b(com.alibaba.jsi.standard.d, java.lang.Object):com.alibaba.jsi.standard.js.o");
    }

    private void a(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20deb535", new Object[]{this, dVar});
            return;
        }
        for (j jVar : this.b.values()) {
            w f2 = jVar.f(dVar);
            if (f2 != null) {
                if (f2 instanceof o) {
                    ((o) f2).h(dVar);
                }
                f2.a();
            }
            jVar.h(dVar);
            jVar.a();
        }
        this.b.clear();
    }

    private j a(com.alibaba.jsi.standard.d dVar, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("6ba6b073", new Object[]{this, dVar, cls}) : a(dVar, cls, cls.getName());
    }

    private j a(com.alibaba.jsi.standard.d dVar, Class cls, String str) {
        w a2;
        Class<?>[] declaredClasses;
        Class<? extends Annotation> cls2;
        j a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("60f542bd", new Object[]{this, dVar, cls, str});
        }
        if (!this.l) {
            return null;
        }
        if (this.b.containsKey(str)) {
            return (j) this.b.get(str).b(dVar);
        }
        j jVar = new j(dVar, new C0115c(str, cls), a(str), true);
        o b2 = b(dVar, cls);
        o a4 = a(dVar, cls, false, false);
        jVar.d(dVar, b2);
        jVar.a(dVar, com.taobao.android.weex_framework.util.a.ATOM_prototype, a4);
        a4.a(dVar, com.taobao.android.weex_framework.util.a.ATOM_constructor, jVar);
        this.b.put(str, (j) jVar.b(dVar));
        Class superclass = cls.getSuperclass();
        if (superclass != null && this.j) {
            j a5 = a(dVar, superclass, superclass.getName());
            if (a5 != null) {
                w f2 = a5.f(dVar);
                b2.d(dVar, f2);
                f2.a();
                w a6 = a5.a(dVar, com.taobao.android.weex_framework.util.a.ATOM_prototype);
                a4.d(dVar, a6);
                a6.a();
                a5.a();
            }
        } else {
            w a7 = dVar.a(com.taobao.android.weex_framework.util.a.ATOM_Function);
            if (a7 != null) {
                if ((a7 instanceof o) && (a2 = ((o) a7).a(dVar, com.taobao.android.weex_framework.util.a.ATOM_prototype)) != null) {
                    b2.d(dVar, a2);
                    a2.a();
                }
                a7.a();
            }
        }
        a4.a();
        if (this.n) {
            for (Class<?> cls3 : cls.getDeclaredClasses()) {
                if ((cls3.getModifiers() & 1) == 1 && (((cls2 = this.p) == null || cls3.isAnnotationPresent(cls2)) && (a3 = a(dVar, (Class) cls3)) != null)) {
                    String name = cls3.getName();
                    b2.a(dVar, name.substring(name.lastIndexOf(36) + 1), a3);
                    a3.a();
                }
            }
        }
        b2.a();
        if (this.m) {
            o b3 = b(dVar, (Object) cls);
            jVar.a(dVar, "class", b3);
            b3.a();
        }
        return jVar;
    }

    private o b(com.alibaba.jsi.standard.d dVar, Class cls) {
        Method[] declaredMethods;
        Field[] declaredFields;
        Class<? extends Annotation> cls2;
        Class<? extends Annotation> cls3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("499a16ed", new Object[]{this, dVar, cls});
        }
        aa a2 = aa.a(dVar.g());
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 9) == 9 && ((cls3 = this.p) == null || method.isAnnotationPresent(cls3))) {
                a2.a(method.getName(), 0);
            }
        }
        if (this.k) {
            for (Field field : cls.getDeclaredFields()) {
                if ((field.getModifiers() & 9) == 9 && ((cls2 = this.p) == null || field.isAnnotationPresent(cls2))) {
                    a2.b(field.getName(), 0);
                }
            }
        }
        o a3 = a2.a(dVar, new b(cls.getName(), cls));
        a2.a();
        return a3;
    }

    private o a(com.alibaba.jsi.standard.d dVar, Class cls, boolean z, boolean z2) {
        Method[] methods;
        Field[] fields;
        Class<? extends Annotation> cls2;
        Class<? extends Annotation> cls3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("253b218e", new Object[]{this, dVar, cls, new Boolean(z), new Boolean(z2)});
        }
        aa aaVar = null;
        if (z2) {
            aaVar = this.h.get(cls);
        }
        if (aaVar == null) {
            aaVar = aa.a(dVar.g());
            for (Method method : z ? cls.getMethods() : cls.getDeclaredMethods()) {
                if ((method.getModifiers() & 1) == 1 && ((cls3 = this.p) == null || method.isAnnotationPresent(cls3))) {
                    aaVar.a(method.getName(), 0);
                }
            }
            if (this.k) {
                for (Field field : z ? cls.getFields() : cls.getDeclaredFields()) {
                    if ((field.getModifiers() & 9) == 9 && ((cls2 = this.p) == null || field.isAnnotationPresent(cls2))) {
                        aaVar.b(field.getName(), 0);
                    }
                }
            }
        }
        if (z2) {
            this.h.put(cls, aaVar);
        }
        o a2 = aaVar.a(dVar, new g(cls.getName(), cls));
        if (!z2) {
            aaVar.a();
        }
        return a2;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : str.substring(str.lastIndexOf(46) + 1);
    }

    /* loaded from: classes2.dex */
    public static class d extends OutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public StringBuilder f3125a;

        static {
            kge.a(-1431871634);
        }

        private d() {
            this.f3125a = new StringBuilder();
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            } else {
                this.f3125a.append(i);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            } else {
                this.f3125a.append((CharSequence) new String(bArr, i, i2), i, i2);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
            } else {
                this.f3125a.append(new String(bArr));
            }
        }
    }

    private static void b(com.alibaba.jsi.standard.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b711f980", new Object[]{dVar, str});
        } else {
            b(dVar, str, null);
        }
    }

    private static void b(com.alibaba.jsi.standard.d dVar, String str, Throwable th) {
        w e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7768ea75", new Object[]{dVar, str, th});
            return;
        }
        com.alibaba.jsi.standard.js.i iVar = new com.alibaba.jsi.standard.js.i(dVar, str);
        if (th != null && (e2 = iVar.e(dVar)) != null) {
            try {
                d dVar2 = new d((byte) 0);
                th.printStackTrace(new PrintStream(dVar2));
                ((o) e2).a(dVar, "java_stack", new s(dVar2.f3125a.toString()));
            } finally {
                try {
                } finally {
                }
            }
        }
        dVar.a(iVar);
        iVar.a();
    }
}
