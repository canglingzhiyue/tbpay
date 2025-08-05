package com.alibaba.jsi.standard.java;

import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.c;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.g;
import com.alibaba.jsi.standard.js.i;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f3136a;
    private final c b;
    private final Map<C0116a, Object> c = new WeakHashMap();

    static {
        kge.a(1645041051);
    }

    public static /* synthetic */ c a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("baf95ac1", new Object[]{aVar}) : aVar.b;
    }

    public a(d dVar, c cVar) {
        this.f3136a = dVar;
        this.b = cVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (C0116a c0116a : this.c.keySet()) {
            c0116a.a();
        }
        this.c.clear();
    }

    public <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(this.f3136a.g());
        o oVar = null;
        try {
            oVar = this.f3136a.h();
            return (T) a(this.f3136a, oVar, str, cls);
        } finally {
            if (oVar != null) {
                oVar.a();
            }
            cVar.b();
        }
    }

    public <T> T a(o oVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ad315423", new Object[]{this, oVar, cls}) : (T) b(this.f3136a, oVar, cls.getName(), cls);
    }

    private <T> T a(d dVar, o oVar, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e1bc8e00", new Object[]{this, dVar, oVar, str, cls});
        }
        w a2 = oVar.a(dVar, str);
        if (a2 == null) {
            return null;
        }
        if (!(a2 instanceof o)) {
            a2.a();
            return null;
        }
        return (T) b(dVar, (o) a2, str, cls);
    }

    private <T> T b(d dVar, o oVar, String str, Class<T> cls) {
        C0116a c0116a;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("57d2b05f", new Object[]{this, dVar, oVar, str, cls});
        }
        T t2 = null;
        try {
            c0116a = new C0116a(dVar, oVar, str);
            try {
                t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, c0116a);
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.c.put(c0116a, null);
                if (t == null) {
                    c0116a.a();
                }
                return t;
            } catch (Throwable th2) {
                th = th2;
                t2 = t;
                if (t2 == null && c0116a != null) {
                    c0116a.a();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c0116a = null;
        }
    }

    /* renamed from: com.alibaba.jsi.standard.java.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0116a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private d b;
        private o c;
        private String d;

        static {
            kge.a(-1777064504);
            kge.a(16938580);
        }

        public C0116a(d dVar, o oVar, String str) {
            this.b = dVar;
            this.c = oVar;
            this.d = str;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            o oVar = this.c;
            if (oVar == null) {
                return;
            }
            oVar.a();
            this.c = null;
        }

        public void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            if (this.c == null) {
                return;
            }
            a.a(a.this).a(this.c);
            this.c = null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            try {
                JSEngine g = this.b.g();
                if (g.isDisposed()) {
                    throw new RuntimeException("JSEngine \"" + g.getEmbedderName() + "\" has been disposed");
                } else if (this.b.c()) {
                    throw new RuntimeException("JSContext {" + this.b.e() + ", id " + this.b.f() + "} has been disposed");
                } else if (this.c == null) {
                    throw new RuntimeException("JSIProxy \"" + this.d + "\" has been detached");
                } else {
                    return a(method, objArr);
                }
            } catch (Throwable th) {
                com.alibaba.jsi.standard.b a2 = this.b.a();
                if (a2 == null || !a2.onJSSupportException(this.b, th)) {
                    throw th;
                }
                Class<?> returnType = method.getReturnType();
                if (returnType == Void.TYPE || !returnType.isPrimitive()) {
                    return null;
                }
                if (returnType == Boolean.TYPE) {
                    return false;
                }
                if (returnType == Integer.TYPE || returnType == Long.TYPE) {
                    return 0;
                }
                if (returnType == Float.TYPE || returnType == Double.TYPE) {
                    return 0;
                }
                if (returnType == Short.TYPE) {
                    return (short) 0;
                }
                if (returnType == Character.TYPE) {
                    return (char) 0;
                }
                return returnType == Byte.TYPE ? (byte) 0 : null;
            }
        }

        private Object a(Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("bbf43db1", new Object[]{this, method, objArr});
            }
            com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(this.b.g());
            try {
                w a2 = this.c.a(this.b, method.getName());
                if (a2 == null) {
                    throw new RuntimeException("No JS method named \"" + method.getName() + "\" in \"" + this.d + "\"");
                } else if (a2 instanceof j) {
                    i j = this.b.j();
                    if (j != null) {
                        g.c("Clear previous pending JS exception: " + j.c(this.b));
                        g.c("JS stack: " + j.d(this.b));
                        j.a();
                    }
                    j jVar = (j) a2;
                    w[] wVarArr = null;
                    if (objArr != null) {
                        wVarArr = new w[objArr.length];
                        int length = objArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            wVarArr[i2] = a.a(a.this).a(this.b, objArr[i]);
                            i++;
                            i2++;
                        }
                    }
                    w a3 = jVar.a(this.b, this.c, wVarArr);
                    a2.a();
                    if (wVarArr != null) {
                        for (w wVar : wVarArr) {
                            if (wVar != null) {
                                wVar.a();
                            }
                        }
                    }
                    if (this.b.i()) {
                        if (a3 != null) {
                            a3.a();
                        }
                        throw new JSRuntimeException(this.b, this.b.j());
                    }
                    Object a4 = a.a(a.this).a(this.b, a3);
                    if (a3 != null) {
                        a3.a();
                    }
                    return a4;
                } else {
                    a2.a();
                    throw new RuntimeException("\"" + method.getName() + "\" in \"" + this.d + "\" is not a function");
                }
            } finally {
                cVar.b();
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "JSIProxy@" + this.d + "@" + Integer.toHexString(hashCode());
        }
    }
}
