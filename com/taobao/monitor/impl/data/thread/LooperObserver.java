package com.taobao.monitor.impl.data.thread;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.mnd;
import tb.mpi;

/* loaded from: classes7.dex */
public class LooperObserver implements Looper.Observer {
    public static final int NANOS_PER_MS = 1000000;

    /* renamed from: a  reason: collision with root package name */
    static LooperObserver f18163a = null;
    private static boolean b = false;
    private static boolean c = false;
    private final Thread d;
    private final Object e;
    private a f;
    private a g;
    private int h;
    private a i;

    static {
        try {
            b = new File("/data/local/tmp/.apm/.removeLooperObserverCluster").exists();
            c = new File("/data/local/tmp/.apm/.printEveryMsgNode").exists();
        } catch (Exception e) {
            e.printStackTrace();
            b = false;
            c = false;
        }
    }

    public static void init() {
        Field field;
        try {
            Field[] fieldArr = (Field[]) Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]).invoke(Looper.class, new Object[0]);
            int length = fieldArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = fieldArr[i];
                if ("sObserver".equals(field.getName())) {
                    break;
                }
                i++;
            }
            field.setAccessible(true);
            LooperObserver looperObserver = (LooperObserver) Class.forName(LooperObserver.class.getName()).getConstructor(Object.class).newInstance(field.get(null));
            field.set(null, looperObserver);
            f18163a = looperObserver;
        } catch (Exception e) {
            mpi.c("LooperObserver", e);
        }
    }

    public static a a(long j, long j2) {
        LooperObserver looperObserver = f18163a;
        if (looperObserver == null || !d.ad) {
            return null;
        }
        a aVar = looperObserver.f;
        if (b) {
            a(aVar);
        }
        a aVar2 = null;
        a aVar3 = null;
        while (aVar != null) {
            if ((aVar.f18164a <= j && j < aVar.b) || ((aVar.f18164a < j2 && j2 <= aVar.b) || (j < aVar.f18164a && aVar.b < j2))) {
                a c2 = aVar.c();
                c2.p = null;
                c2.q = null;
                if (aVar3 == null) {
                    aVar2 = c2;
                    aVar3 = aVar2;
                } else {
                    aVar3.p = c2;
                    aVar3 = aVar3.p;
                }
            }
            aVar = aVar.p;
        }
        return aVar2;
    }

    private static void a(a aVar) {
        StringBuilder sb = new StringBuilder();
        while (aVar != null) {
            sb.append(aVar);
            sb.append("\n");
            aVar = aVar.p;
        }
        mpi.c("LooperObserver", sb);
    }

    public Object messageDispatchStarting() {
        if (d.ad && Thread.currentThread() == this.d) {
            this.i = a.a();
            this.i.f18164a = System.nanoTime();
            this.i.d = SystemClock.currentThreadTimeMillis();
            this.i.n = mnd.b;
        }
        return a();
    }

    private Object a() {
        Method[] methodArr;
        Object obj = this.e;
        if (obj == null) {
            return null;
        }
        try {
            for (Method method : (Method[]) Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]).invoke(Class.forName("android.os.Looper$Observer"), new Object[0])) {
                if ("messageDispatchStarting".equals(method.getName())) {
                    method.setAccessible(true);
                    return method.invoke(obj, new Object[0]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void messageDispatched(Object obj, Message message) {
        if (d.ad && Thread.currentThread() == this.d) {
            a(this.i, message, (Exception) null);
            b(this.i);
            this.i = null;
        }
        a(obj, message);
    }

    private void a(Object obj, Message message) {
        Method[] methodArr;
        Object obj2 = this.e;
        if (obj2 == null) {
            return;
        }
        try {
            for (Method method : (Method[]) Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]).invoke(Class.forName("android.os.Looper$Observer"), new Object[0])) {
                if ("messageDispatched".equals(method.getName())) {
                    method.setAccessible(true);
                    method.invoke(obj2, obj, message);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dispatchingThrewException(Object obj, Message message, Exception exc) {
        if (d.ad && Thread.currentThread() == this.d) {
            a(this.i, message, exc);
            b(this.i);
            this.i = null;
        }
        a(obj, message, exc);
    }

    private void a(Object obj, Message message, Exception exc) {
        Method[] methodArr;
        Object obj2 = this.e;
        if (obj2 == null) {
            return;
        }
        try {
            for (Method method : (Method[]) Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]).invoke(Class.forName("android.os.Looper$Observer"), new Object[0])) {
                if ("dispatchingThrewException".equals(method.getName())) {
                    method.setAccessible(true);
                    method.invoke(obj2, obj, message, exc);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(a aVar, Message message, Exception exc) {
        if (aVar == null) {
            return;
        }
        aVar.b = System.nanoTime();
        aVar.c = aVar.b - aVar.f18164a;
        aVar.e = SystemClock.currentThreadTimeMillis();
        aVar.f = aVar.e - aVar.d;
        if (aVar.c >= 100000000 || b) {
            aVar.g = 2;
        }
        if (message.isAsynchronous()) {
            aVar.g = 6;
            aVar.o = message.isAsynchronous();
        }
        if (aVar.g != 1) {
            aVar.h = message.what;
            aVar.i = message.getWhen();
            String str = null;
            aVar.j = message.getTarget() == null ? null : message.getTarget().getClass().getName();
            Runnable callback = message.getCallback();
            if (callback != null) {
                str = callback.getClass().getName();
            }
            aVar.k = str;
        }
        aVar.l = exc;
        aVar.m++;
    }

    private void b(a aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.g == 2) {
            c(aVar);
            return;
        }
        a aVar2 = this.f;
        if (aVar2 == null || aVar2.g != 1 || aVar.g != 1 || this.f.c > 100000000 || this.f.n != aVar.n) {
            c(aVar);
            return;
        }
        this.f.b = aVar.b;
        this.f.e = aVar.e;
        a aVar3 = this.f;
        aVar3.h = -1;
        aVar3.i = -1L;
        aVar3.j = null;
        aVar3.k = null;
        aVar3.l = null;
        aVar3.c += aVar.c;
        this.f.f += aVar.f;
        this.f.m++;
        aVar.b();
    }

    private void c(a aVar) {
        if (c) {
            Log.e("LooperObserver", aVar.toString());
        }
        a aVar2 = this.f;
        aVar.p = aVar2;
        if (aVar2 != null) {
            aVar2.q = aVar;
        }
        this.f = aVar;
        if (this.g == null) {
            this.g = this.f;
        }
        this.h++;
        if (this.h > 200) {
            a aVar3 = this.g;
            this.g = aVar3.q;
            aVar3.q = null;
            this.g.p = null;
            this.h--;
            aVar3.b();
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static a r;
        private static int s;
        private static final Object t = new Object();
        public String j;
        public String k;
        public Exception l;
        public a p;
        public a q;

        /* renamed from: a  reason: collision with root package name */
        public long f18164a = -1;
        public long b = -1;
        public long c = 0;
        public long d = -1;
        public long e = -1;
        public long f = 0;
        public int g = 1;
        public int h = -1;
        public long i = -1;
        public int m = 0;
        public boolean n = false;
        public boolean o = false;

        private a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cd103d52", new Object[0]);
            }
            synchronized (t) {
                if (r != null) {
                    a aVar = r;
                    r = aVar.p;
                    aVar.p = null;
                    aVar.q = null;
                    s--;
                    return aVar;
                }
                return new a();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.f18164a = 0L;
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 1;
            this.h = 0;
            this.i = 0L;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = 0;
            this.n = false;
            this.o = false;
            synchronized (t) {
                if (s < 100) {
                    this.p = r;
                    r = this;
                    s++;
                }
            }
        }

        public a c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e6ea6b90", new Object[]{this});
            }
            a a2 = a();
            a2.f18164a = this.f18164a;
            a2.b = this.b;
            a2.c = this.c;
            a2.d = this.d;
            a2.e = this.e;
            a2.f = this.f;
            a2.g = this.g;
            a2.h = this.h;
            a2.i = this.i;
            a2.j = this.j;
            a2.k = this.k;
            a2.l = this.l;
            a2.m = this.m;
            a2.n = this.n;
            a2.o = this.o;
            return a2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MsgRecordNode{startNanoTime=" + (this.f18164a / 1000000) + ", endNanoTime=" + (this.b / 1000000) + ", wallDuration=" + (this.c / 1000000) + ", startThreadTime=" + this.d + ", endThreadTime=" + this.e + ", cpuDuration=" + this.f + ", type=" + this.g + ", what=" + this.h + ", when=" + this.i + ", target='" + this.j + "', callback='" + this.k + "', exception=" + this.l + ", count=" + this.m + ", background=" + this.n + ", asynchronous=" + this.o + '}';
        }
    }
}
