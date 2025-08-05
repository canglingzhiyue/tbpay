package com.alibaba.ariver.kernel.common;

import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.multiinstance.InstanceType;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class RVProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Object> f2906a;
    private static final Map<InstanceType, Map<Class<?>, Object>> b;
    private static volatile Printer c;
    private static Initializer d;
    public static boolean sHasSetupProxy;

    /* loaded from: classes2.dex */
    public static class EmptyPrinter implements Printer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1730660580);
            kge.a(-125821525);
        }

        @Override // com.alibaba.ariver.kernel.common.RVProxy.Printer
        public void print(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc0dfd7e", new Object[]{this, str});
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface Initializer {
        void doInitialize();
    }

    /* loaded from: classes2.dex */
    public interface LazyGetter<T> {
        T get();
    }

    /* loaded from: classes2.dex */
    public interface Printer {
        void print(String str);
    }

    static {
        kge.a(2129236821);
        f2906a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        sHasSetupProxy = false;
        d = null;
    }

    public static void setLazyInitializer(Initializer initializer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6326ef", new Object[]{initializer});
        } else {
            d = initializer;
        }
    }

    public static void setPrinter(Printer printer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0da9183", new Object[]{printer});
        } else {
            c = printer;
        }
    }

    public static synchronized Printer getPrinter() {
        synchronized (RVProxy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Printer) ipChange.ipc$dispatch("ea5a53af", new Object[0]);
            }
            if (c == null) {
                c = new EmptyPrinter();
            }
            return c;
        }
    }

    public static <T> void setLazy(Class<T> cls, LazyGetter<T> lazyGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79b63b3", new Object[]{cls, lazyGetter});
        } else {
            a(null, cls, lazyGetter);
        }
    }

    public static <T> void setLazy(InstanceType instanceType, Class<T> cls, LazyGetter<T> lazyGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38881f5", new Object[]{instanceType, cls, lazyGetter});
        } else {
            a(instanceType, cls, lazyGetter);
        }
    }

    public static <T> void set(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707e8150", new Object[]{cls, t});
        } else {
            a(null, cls, t);
        }
    }

    public static <T> void set(InstanceType instanceType, Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40b20a6", new Object[]{instanceType, cls, t});
        } else {
            a(instanceType, cls, t);
        }
    }

    private static <T> void a(InstanceType instanceType, Class cls, Object obj) {
        Map<Class<?>, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40c1925", new Object[]{instanceType, cls, obj});
        } else if (cls == null) {
        } else {
            if (instanceType != null) {
                map = b.get(instanceType);
                if (map == null) {
                    synchronized (b) {
                        map = b.get(instanceType);
                        if (map == null) {
                            map = new ConcurrentHashMap<>();
                            b.put(instanceType, map);
                        }
                    }
                }
            } else {
                map = f2906a;
            }
            if (obj == null) {
                map.remove(cls);
            } else if (!cls.isInterface()) {
                throw new IllegalArgumentException("set proxy class must a Interface: " + cls);
            } else if (!Proxiable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("set proxy class must a Proxiable: " + cls);
            } else if (!cls.isInstance(obj) && !(obj instanceof LazyGetter)) {
                throw new IllegalArgumentException(obj.getClass().getSimpleName() + " is not instance of " + cls.getSimpleName() + " and not instance of LazyGetter");
            } else {
                Printer printer = getPrinter();
                printer.print(cls.getSimpleName() + " >>> " + obj.getClass() + " instance: " + instanceType);
                synchronized (f2906a) {
                    map.put(cls, obj);
                }
            }
        }
    }

    public static <T> T get(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ea288332", new Object[]{cls}) : (T) get((Class<Object>) cls, false);
    }

    public static <T> T get(Node node, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("b4f7086e", new Object[]{node, cls}) : (T) get(node, cls, false);
    }

    public static <T> T get(Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("70fbfade", new Object[]{cls, new Boolean(z)}) : (T) get(null, cls, z);
    }

    public static <T> T get(Node node, final Class<T> cls, boolean z) {
        Map<Class<?>, Object> map;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("fffe1d22", new Object[]{node, cls, new Boolean(z)});
        }
        if (!cls.isInterface()) {
            getPrinter().print("got proxy clazz must a Interface:" + cls.getSimpleName());
        }
        InstanceType instanceType = node != null ? node.getInstanceType() : null;
        if (instanceType == null || (map = b.get(instanceType)) == null) {
            map = null;
            t = null;
        } else {
            t = (T) map.get(cls);
        }
        if (t == null) {
            t = (T) f2906a.get(cls);
        }
        if (t != null && !(t instanceof LazyGetter)) {
            return t;
        }
        T t2 = (T) a(map, cls);
        if (t2 != null) {
            return t2;
        }
        if (!sHasSetupProxy) {
            getPrinter().print("get proxy but not initialized! sLazyInitializer: " + d);
            Initializer initializer = d;
            if (initializer != null) {
                initializer.doInitialize();
                T t3 = (T) a(map, cls);
                if (t3 != null) {
                    return t3;
                }
            } else if (z) {
                return null;
            }
        }
        if (z) {
            return null;
        }
        T t4 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.alibaba.ariver.kernel.common.RVProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
                }
                Class<?> returnType = method.getReturnType();
                Printer printer = RVProxy.getPrinter();
                printer.print("unimplemented proxy:" + cls.getSimpleName() + "." + method.getName());
                if (!returnType.isPrimitive()) {
                    return null;
                }
                return (returnType == Boolean.TYPE || returnType == Boolean.TYPE) ? false : 0;
            }
        });
        set(cls, t4);
        return t4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[Catch: all -> 0x000f, TryCatch #2 {all -> 0x000f, blocks: (B:6:0x0007, B:14:0x0016, B:16:0x001e, B:18:0x0022, B:23:0x0050, B:24:0x0054, B:25:0x0059, B:27:0x005b, B:33:0x009a, B:40:0x00c5, B:41:0x00e1), top: B:48:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[Catch: all -> 0x000f, TryCatch #2 {all -> 0x000f, blocks: (B:6:0x0007, B:14:0x0016, B:16:0x001e, B:18:0x0022, B:23:0x0050, B:24:0x0054, B:25:0x0059, B:27:0x005b, B:33:0x009a, B:40:0x00c5, B:41:0x00e1), top: B:48:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T a(java.util.Map<java.lang.Class<?>, java.lang.Object> r7, java.lang.Class<T> r8) {
        /*
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = com.alibaba.ariver.kernel.common.RVProxy.f2906a
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L12
            java.lang.Object r3 = r7.get(r8)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L13
            r4 = 1
            goto L14
        Lf:
            r7 = move-exception
            goto Le3
        L12:
            r3 = 0
        L13:
            r4 = 0
        L14:
            if (r3 != 0) goto L1c
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = com.alibaba.ariver.kernel.common.RVProxy.f2906a     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> Lf
        L1c:
            if (r3 == 0) goto L5b
            boolean r5 = r3 instanceof com.alibaba.ariver.kernel.common.RVProxy.LazyGetter     // Catch: java.lang.Throwable -> Lf
            if (r5 == 0) goto L49
            com.alibaba.ariver.kernel.common.RVProxy$LazyGetter r3 = (com.alibaba.ariver.kernel.common.RVProxy.LazyGetter) r3     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Lf
            com.alibaba.ariver.kernel.common.RVProxy$Printer r2 = getPrinter()     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r5.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = "Lazy initialize of "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lf
            r5.append(r8)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = " to "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lf
            r5.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lf
            r2.print(r5)     // Catch: java.lang.Throwable -> Lf
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L59
            if (r4 == 0) goto L54
            r7.put(r8, r3)     // Catch: java.lang.Throwable -> Lf
            goto L59
        L54:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = com.alibaba.ariver.kernel.common.RVProxy.f2906a     // Catch: java.lang.Throwable -> Lf
            r7.put(r8, r3)     // Catch: java.lang.Throwable -> Lf
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L5b:
            java.lang.Class<com.alibaba.ariver.kernel.api.annotation.DefaultImpl> r7 = com.alibaba.ariver.kernel.api.annotation.DefaultImpl.class
            java.lang.annotation.Annotation r7 = r8.getAnnotation(r7)     // Catch: java.lang.Throwable -> Lf
            com.alibaba.ariver.kernel.api.annotation.DefaultImpl r7 = (com.alibaba.ariver.kernel.api.annotation.DefaultImpl) r7     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto Le1
            java.lang.String r1 = r7.value()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r8.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L9f
            java.lang.Object r7 = r1.newInstance()     // Catch: java.lang.Throwable -> Lc4
            com.alibaba.ariver.kernel.common.RVProxy$Printer r1 = getPrinter()     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r2.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "Default initialize of "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9c
            r2.append(r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = " to "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9c
            r2.append(r7)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9c
            r1.print(r2)     // Catch: java.lang.Throwable -> L9c
            set(r8, r7)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r7
        L9c:
            r8 = move-exception
            r3 = r7
            goto Lc5
        L9f:
            com.alibaba.ariver.kernel.common.RVProxy$Printer r1 = getPrinter()     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r2.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = "Default impl "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = r7.value()     // Catch: java.lang.Throwable -> Lc4
            r2.append(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = " is not instance of "
            r2.append(r7)     // Catch: java.lang.Throwable -> Lc4
            r2.append(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> Lc4
            r1.print(r7)     // Catch: java.lang.Throwable -> Lc4
            goto Le1
        Lc4:
            r8 = move-exception
        Lc5:
            com.alibaba.ariver.kernel.common.RVProxy$Printer r7 = getPrinter()     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "DefaultImpl instantiate exception!"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> Lf
            r1.append(r8)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Lf
            r7.print(r8)     // Catch: java.lang.Throwable -> Lf
        Le1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Le3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.RVProxy.a(java.util.Map, java.lang.Class):java.lang.Object");
    }
}
