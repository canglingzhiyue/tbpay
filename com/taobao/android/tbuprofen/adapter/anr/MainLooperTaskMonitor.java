package com.taobao.android.tbuprofen.adapter.anr;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Printer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes6.dex */
public class MainLooperTaskMonitor implements Printer, InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f15458a = new AtomicBoolean(false);
    private boolean b = false;
    private Object d = null;
    private boolean e = false;
    private Printer f = null;
    private c c = null;
    private final MessageQueue g = f.b();

    static {
        kge.a(1014093768);
        kge.a(16938580);
        kge.a(-1548381555);
    }

    public static /* synthetic */ boolean a(MainLooperTaskMonitor mainLooperTaskMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c090e53", new Object[]{mainLooperTaskMonitor})).booleanValue() : mainLooperTaskMonitor.b;
    }

    public static /* synthetic */ c b(MainLooperTaskMonitor mainLooperTaskMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("dee9ae35", new Object[]{mainLooperTaskMonitor}) : mainLooperTaskMonitor.c;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f15458a.get()) {
            throw new IllegalStateException("Need do init before start monitor.");
        } else {
            this.b = true;
        }
    }

    public boolean a(boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a19551f", new Object[]{this, new Boolean(z), cVar})).booleanValue();
        }
        if (!this.f15458a.compareAndSet(false, true)) {
            return true;
        }
        this.c = cVar;
        if (!b()) {
            return false;
        }
        c();
        if (z) {
            a();
        }
        return true;
    }

    private boolean b() {
        try {
            this.f = (Printer) ReflectUtils.a(Looper.class, "mLogging").get(Looper.getMainLooper());
            Looper.getMainLooper().setMessageLogging(this);
            if (Build.VERSION.SDK_INT >= 29) {
                Class[] clsArr = {Class.forName("android.os.Looper$Observer")};
                this.e = clsArr[0] != null;
                this.d = com.taobao.android.tbuprofen.common.a.a(Looper.class, "sObserver", null, Proxy.newProxyInstance(MainLooperTaskMonitor.class.getClassLoader(), clsArr, this));
            }
            return true;
        } catch (Throwable th) {
            com.taobao.android.tbuprofen.log.c.a("MainLooperMonitor", th, "monitor exception", new Object[0]);
            this.e = false;
            return false;
        }
    }

    @Override // android.util.Printer
    public void println(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c611640", new Object[]{this, str});
            return;
        }
        if (this.b && str != null) {
            if (str.charAt(0) == '>') {
                this.c.a(str);
            } else if (!this.e) {
                this.c.b(str);
            }
        }
        Printer printer = this.f;
        if (printer == null) {
            return;
        }
        printer.println(str);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (this.b && Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            String name = method.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != -1879582208) {
                if (hashCode == 43687879 && name.equals("dispatchingThrewException")) {
                    c = 1;
                }
            } else if (name.equals("messageDispatched")) {
                c = 0;
            }
            if (c == 0 || c == 1) {
                this.c.a((Message) objArr[1]);
            }
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            return method.invoke(obj2, objArr);
        }
        return null;
    }

    private boolean c() {
        if (this.g == null) {
            com.taobao.android.tbuprofen.log.c.a("MainLooperMonitor", "Can't get messageQueue", new Object[0]);
            return false;
        }
        try {
            Field a2 = ReflectUtils.a(MessageQueue.class, "mIdleHandlers");
            Object obj = null;
            if (a2 != null) {
                obj = a2.get(this.g);
            }
            if (obj != null && obj.getClass().equals(ArrayList.class)) {
                ArrayList arrayList = (ArrayList) obj;
                synchronized (this.g) {
                    a2.set(this.g, new ProxyArrayList(arrayList, this));
                }
                return true;
            }
        } catch (Exception e) {
            com.taobao.android.tbuprofen.log.c.a("MainLooperMonitor", e, "Failed to monitor idleHandler", new Object[0]);
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final MessageQueue.IdleHandler f15459a;
        private final MainLooperTaskMonitor b;

        static {
            kge.a(1516950276);
            kge.a(1508499111);
        }

        public a(MessageQueue.IdleHandler idleHandler, MainLooperTaskMonitor mainLooperTaskMonitor) {
            this.f15459a = idleHandler;
            this.b = mainLooperTaskMonitor;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (!MainLooperTaskMonitor.a(this.b)) {
                return this.f15459a.queueIdle();
            }
            MainLooperTaskMonitor.b(this.b).a(this.f15459a);
            boolean queueIdle = this.f15459a.queueIdle();
            MainLooperTaskMonitor.b(this.b).b(this.f15459a);
            return queueIdle;
        }

        public MessageQueue.IdleHandler a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageQueue.IdleHandler) ipChange.ipc$dispatch("a7980bd2", new Object[]{this}) : this.f15459a;
        }
    }

    /* loaded from: classes6.dex */
    public static class ProxyArrayList<T> extends ArrayList<MessageQueue.IdleHandler> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final MainLooperTaskMonitor monitor;

        static {
            kge.a(397299781);
        }

        public static /* synthetic */ Object ipc$super(ProxyArrayList proxyArrayList, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -332530133) {
                if (hashCode != 195222152) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.add((ProxyArrayList) objArr[0]));
            }
            return new Boolean(super.remove(objArr[0]));
        }

        public ProxyArrayList(ArrayList<MessageQueue.IdleHandler> arrayList, MainLooperTaskMonitor mainLooperTaskMonitor) {
            this.monitor = mainLooperTaskMonitor;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            Iterator<MessageQueue.IdleHandler> it = arrayList.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(MessageQueue.IdleHandler idleHandler) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3118e396", new Object[]{this, idleHandler})).booleanValue() : super.add((ProxyArrayList<T>) new a(idleHandler, this.monitor));
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue() : super.remove(obj);
        }

        public ArrayList<MessageQueue.IdleHandler> getIdleHandlerList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("92c8b93f", new Object[]{this});
            }
            ArrayList<MessageQueue.IdleHandler> arrayList = new ArrayList<>();
            for (int i = 0; i < size(); i++) {
                MessageQueue.IdleHandler idleHandler = get(i);
                if (idleHandler instanceof a) {
                    arrayList.add(((a) idleHandler).a());
                }
            }
            return arrayList;
        }
    }
}
