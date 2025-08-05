package com.taobao.android.tbuprofen.adapter.anr;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.tbuprofen.adapter.anr.a;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.jbg;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SOURCE_TYPE_IDLE_HANDLER = 2;
    public static final int SOURCE_TYPE_MESSAGE = 1;
    public static final int SOURCE_TYPE_MESSAGE_STR = 3;
    public static long q;

    /* renamed from: a  reason: collision with root package name */
    private final TBAnrConfig f15464a;
    private a d;
    private com.taobao.android.tbuprofen.adapter.anr.b e;
    private final Context r;
    private String s = null;
    private final HandlerThread c = jbg.b("tbp-looper-monitor");
    private final MainLooperTaskMonitor b = new MainLooperTaskMonitor();
    private final Queue<d> f = new ConcurrentLinkedDeque();
    private d g = null;
    private final MessageQueue h = f.b();
    private CountDownLatch p = null;
    private String i = "android.app.ActivityThread$H BIND_APPLICATION";
    private volatile long j = SystemClock.uptimeMillis();
    private long l = SystemClock.currentThreadTimeMillis();
    private volatile long k = 0;
    private long m = 0;
    private long n = 0;
    private long o = 0;

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public List<d> f15467a = null;
        public long b = -1;
        public String c = null;
        public long d = -1;
        public Queue<Message> e = null;
        public LinkedList<a.C0596a> f = null;
        public LinkedList<a.C0596a> g = null;
        public long h;

        static {
            kge.a(-1059140354);
        }
    }

    static {
        kge.a(613034523);
    }

    public static /* synthetic */ Context a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ed38bccd", new Object[]{eVar}) : eVar.r;
    }

    public static /* synthetic */ File a(e eVar, String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("777c65e8", new Object[]{eVar, str, new Long(j)}) : eVar.a(str, j);
    }

    public static /* synthetic */ String a(e eVar, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d0dfff1", new Object[]{eVar, new Long(j)}) : eVar.a(j);
    }

    public static /* synthetic */ String a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b09e7321", new Object[]{eVar, str});
        }
        eVar.s = str;
        return str;
    }

    public static /* synthetic */ void a(e eVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbe41a8", new Object[]{eVar, message});
        } else {
            eVar.a(message);
        }
    }

    public static /* synthetic */ TBAnrConfig b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBAnrConfig) ipChange.ipc$dispatch("d8679519", new Object[]{eVar}) : eVar.f15464a;
    }

    public static /* synthetic */ void b(e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b936aae", new Object[]{eVar, new Long(j)});
        } else {
            eVar.b(j);
        }
    }

    public static /* synthetic */ void b(e eVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0fd129", new Object[]{eVar, message});
        } else {
            eVar.b(message);
        }
    }

    public static /* synthetic */ String c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63fb5ca9", new Object[]{eVar}) : eVar.s;
    }

    public static /* synthetic */ void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18bd1ad8", new Object[]{eVar});
        } else {
            eVar.f();
        }
    }

    public e(Context context, TBAnrConfig tBAnrConfig) {
        this.r = context;
        this.f15464a = tBAnrConfig;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.start();
        this.d = new a(this.c.getLooper(), this);
        f();
        boolean a2 = this.b.a(true, this.d);
        com.taobao.android.tbuprofen.log.c.a("MainLooperTaskManager", "Start Main Looper Monitor: %b", Boolean.valueOf(a2));
        if (a2 && this.f15464a.isAnrTraceDumpEnable) {
            this.e = new com.taobao.android.tbuprofen.adapter.anr.b(this, this.f15464a);
            this.e.a();
        }
        UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY);
        crashCaughtHeaderByType.addHeaderInfo("TBP_ANR_ENABLE", com.taobao.android.tbuprofen.common.a.a(System.currentTimeMillis()));
        crashCaughtHeaderByType.addHeaderInfo("TBP_ANR_DUMP_FLAG", String.valueOf(this.f15464a.anrInfoSaveFlag));
        if (this.f15464a.dumpNativeStack) {
            crashCaughtHeaderByType.addHeaderInfo("TBP_ANR_DUMP_NATIVE_STACK", "true");
        }
        TCrashSDK.instance().addAnrUncaughtListener(new AnrUncaughtListener() { // from class: com.taobao.android.tbuprofen.adapter.anr.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tcrash.AnrUncaughtListener
            public Map<String, Object> onAnrUncaught() {
                File a3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("5dc54bb7", new Object[]{this});
                }
                Log.e("MainLooperTaskManager", "anr happened!!! " + UTDevice.getUtdid(e.a(e.this)));
                long currentTimeMillis = System.currentTimeMillis();
                j.a(currentTimeMillis, e.b(e.this).anrInfoSaveFlag);
                HashMap hashMap = new HashMap();
                try {
                    e.a(e.this, e.a(e.this, currentTimeMillis));
                    if ((e.b(e.this).anrInfoSaveFlag & 4) != 0) {
                        hashMap.put("TBP_ANR_INFO", e.c(e.this));
                    }
                    if ((e.b(e.this).anrInfoSaveFlag & 2) != 0 && (a3 = e.a(e.this, e.c(e.this), currentTimeMillis)) != null) {
                        hashMap.put("TBP_ANR_FILE", a3.getName());
                    }
                    j.a(System.currentTimeMillis() - currentTimeMillis, e.c(e.this));
                    return hashMap;
                } catch (Exception e) {
                    j.a();
                    Log.e("MainLooperTaskManager", "dump anr info error", e);
                    return null;
                }
            }
        });
    }

    /* loaded from: classes6.dex */
    public static class a extends Handler implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final e f15466a;

        static {
            kge.a(379665099);
            kge.a(-1585877646);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Looper looper, e eVar) {
            super(looper);
            this.f15466a = eVar;
        }

        @Override // com.taobao.android.tbuprofen.adapter.anr.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                a(1, 3, str);
            }
        }

        @Override // com.taobao.android.tbuprofen.adapter.anr.c
        public void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            } else {
                a(2, 1, Message.obtain(message));
            }
        }

        @Override // com.taobao.android.tbuprofen.adapter.anr.c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                a(2, 3, str);
            }
        }

        @Override // com.taobao.android.tbuprofen.adapter.anr.c
        public void a(MessageQueue.IdleHandler idleHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1c613d2", new Object[]{this, idleHandler});
            } else {
                a(1, 2, idleHandler);
            }
        }

        @Override // com.taobao.android.tbuprofen.adapter.anr.c
        public void b(MessageQueue.IdleHandler idleHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b92b48f1", new Object[]{this, idleHandler});
            } else {
                a(2, 2, idleHandler);
            }
        }

        private void a(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f8120a4", new Object[]{this, new Integer(i), new Integer(i2), obj});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.obj = obj;
            obtain.getData().putLong("upTime", uptimeMillis);
            obtain.getData().putLong("threadTime", currentThreadTimeMillis);
            sendMessage(obtain);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                e.a(this.f15466a, message);
            } else if (i == 2) {
                e.b(this.f15466a, message);
            } else if (i == 3) {
                this.f15466a.a((b) message.obj);
            } else if (i != 4) {
            } else {
                e.b(this.f15466a, ((Long) message.obj).longValue());
                e.d(this.f15466a);
            }
        }
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            return;
        }
        if (d.f15463a.get() == 0) {
            this.k = message.peekData().getLong("upTime");
            this.m = message.peekData().getLong("threadTime");
            long j = this.k - this.j;
            long j2 = this.m - this.l;
            boolean z = j > ((long) this.f15464a.largeTaskThreshold);
            Message obtain = Message.obtain();
            obtain.what = 110;
            this.f.add(d.a(obtain, j, j2, z, this.j, this.k));
            obtain.recycle();
        }
        this.j = message.peekData().getLong("upTime");
        this.l = message.peekData().getLong("threadTime");
        if (message.arg1 == 3) {
            this.i = (String) message.obj;
        } else if (message.arg1 == 2) {
            this.i = message.obj.getClass().getName();
        }
        this.n = this.j - this.k;
        long j3 = this.l - this.m;
        if (this.n >= this.f15464a.idleTaskThreshold) {
            this.f.add(d.a(this.n, j3, this.k, this.j));
            this.g = null;
            this.n = 0L;
        }
        this.k = -1L;
        this.o++;
    }

    private void b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeca26bc", new Object[]{this, message});
            return;
        }
        this.k = message.peekData().getLong("upTime");
        this.m = message.peekData().getLong("threadTime");
        a(message.arg1, message.obj, this.m - this.l, this.j, this.k);
        if (message.arg1 == 1) {
            ((Message) message.obj).recycle();
        }
        this.j = -1L;
    }

    private void a(int i, Object obj, long j, long j2, long j3) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3252ac2d", new Object[]{this, new Integer(i), obj, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        long j4 = j3 - j2;
        boolean z = j4 > ((long) this.f15464a.largeTaskThreshold);
        if (i == 1) {
            Message message = (Message) obj;
            if (f.a(message)) {
                this.f.add(d.a(message, j4, j, z, j2, j3));
                this.g = null;
                return;
            }
            dVar = null;
        } else {
            dVar = null;
            if (i == 3) {
                String str = this.i;
                if (f.a(str)) {
                    this.f.add(d.a(str, j4, j, z, j2, j3));
                    this.g = null;
                    return;
                }
            }
        }
        if (z) {
            this.f.add(d.a(i, i == 3 ? this.i : obj, j4, j, j2, j3));
            this.g = dVar;
            return;
        }
        d dVar2 = this.g;
        if (dVar2 == null || !dVar2.a()) {
            this.g = d.b(j4, j, j2, j3);
            this.f.add(this.g);
            return;
        }
        this.g.a(j4, j, j3, this.n, this.f15464a.collectAggregatedMessage ? f.a(i, obj) : "");
    }

    private void b(long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        while (!this.f.isEmpty()) {
            d peek = this.f.peek();
            if (peek != null) {
                if (j - peek.c() <= this.f15464a.monitorTimeScope) {
                    break;
                }
                this.f.poll();
            }
        }
        if (!this.f15464a.isAnrTraceDumpEnable || this.e == null) {
            return;
        }
        d peek2 = this.f.peek();
        if (peek2 != null) {
            j2 = peek2.b();
        } else {
            j2 = d.f15463a.get();
        }
        this.e.a(j2);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = Long.valueOf(uptimeMillis);
        this.d.sendMessageDelayed(obtain, this.f15464a.checkTaskInterval);
    }

    public synchronized b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cf6241fc", new Object[]{this});
        }
        b bVar = new b();
        synchronized (this.h) {
            com.taobao.android.tbuprofen.log.c.a("MainLooperTaskManager", "dump main looper message!", new Object[0]);
            bVar.e = c();
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = bVar;
            this.d.sendMessage(obtain);
        }
        try {
            com.taobao.android.tbuprofen.log.c.a("MainLooperTaskManager", "wait dump history!", new Object[0]);
            this.p = new CountDownLatch(1);
            if (!this.p.await(10000L, TimeUnit.MILLISECONDS)) {
                com.taobao.android.tbuprofen.log.c.a("MainLooperTaskManager", "wait dump history timeout!", new Object[0]);
                return null;
            }
            com.taobao.android.tbuprofen.log.c.a("MainLooperTaskManager", "Take snapshot done!!!", new Object[0]);
            return bVar;
        } catch (Exception e) {
            com.taobao.android.tbuprofen.log.c.a("MainLooperTaskManager", "wait dump history error!", new Object[0]);
            e.printStackTrace();
            return null;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1215d817", new Object[]{this, bVar});
            return;
        }
        try {
            bVar.b = this.j;
            bVar.d = SystemClock.uptimeMillis();
            bVar.c = this.i;
            bVar.h = this.o;
            bVar.f15467a = e();
            if (this.f15464a.isAnrTraceDumpEnable) {
                bVar.f = new LinkedList<>();
                bVar.g = new LinkedList<>();
                this.e.a(bVar.f, bVar.g);
            }
            this.p.countDown();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private List<d> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f) {
            arrayList.add(new d(dVar));
        }
        return arrayList;
    }

    private Queue<Message> a(int i) {
        LinkedList linkedList = new LinkedList();
        synchronized (this.h) {
            try {
                Field a2 = ReflectUtils.a(MessageQueue.class, "mMessages");
                Field a3 = ReflectUtils.a(Message.class, "next");
                if (a2 != null && a3 != null) {
                    int i2 = 0;
                    for (Message message = (Message) a2.get(this.h); message != null; message = (Message) a3.get(message)) {
                        i2++;
                        if (i2 > i) {
                            break;
                        }
                        Message obtain = Message.obtain(message);
                        obtain.getData().putLong(RemoteMessageConst.Notification.WHEN, message.getWhen());
                        linkedList.add(obtain);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return linkedList;
    }

    public Queue<Message> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("ea7ff0a", new Object[]{this}) : a(this.f15464a.maxPendingMessageCount);
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.j;
    }

    private String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        b b2 = b();
        if (b2 == null) {
            return "null";
        }
        if (this.f15464a.dumpMessageObjInfo) {
            f.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---");
        sb.append("\n");
        sb.append("TBP ANR Message Start\n");
        sb.append("[packageName]:");
        sb.append(this.r.getPackageName());
        sb.append("\n");
        sb.append("[anrTime]:");
        sb.append(com.taobao.android.tbuprofen.common.a.a(j));
        sb.append("\n");
        sb.append("[buildId]:");
        sb.append(com.taobao.android.tbuprofen.common.a.a(this.r, "build_id"));
        sb.append("\n");
        sb.append("[deviceBrand]:");
        sb.append(Build.BRAND);
        sb.append("\n");
        sb.append("[deviceModel]:");
        sb.append(Build.MODEL);
        sb.append("\n");
        sb.append("[fingerprint]:");
        sb.append(Build.FINGERPRINT);
        sb.append("\n");
        sb.append("[systemVersion]:");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\n");
        sb.append("[sdkVersion]:");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\n");
        sb.append("[utdid]:");
        sb.append(UTDevice.getUtdid(this.r));
        sb.append("\n");
        sb.append("[is64bit]:");
        sb.append(com.taobao.android.diagnose.common.a.b());
        sb.append("\n");
        sb.append("\n[Running Task]");
        sb.append("\n");
        if (b2.b == -1) {
            sb.append("Do not have any running task.");
            sb.append("\n");
        } else if (b2.b == 0) {
            long j2 = q;
            sb.append(String.format("[%s]====> Execute: %dms. %s", com.taobao.android.tbuprofen.common.a.a(j2), Long.valueOf(j - j2), "BindApplication"));
            sb.append("\n");
        } else {
            long j3 = b2.d - b2.b;
            sb.append(String.format("[%s]====> Execute: %dms. %s", com.taobao.android.tbuprofen.common.a.a(j - j3), Long.valueOf(j3), b2.c));
            sb.append("\n");
        }
        if (b2.g != null && !b2.g.isEmpty()) {
            while (!b2.g.isEmpty()) {
                a.C0596a peek = b2.g.peek();
                if (peek != null) {
                    sb.append(peek);
                    sb.append("\n");
                    b2.g.poll();
                }
            }
        }
        sb.append("\n[Total Handle Message]: ");
        sb.append(b2.h);
        sb.append("\n");
        List<d> list = b2.f15467a;
        sb.append("\n[History Task]: ");
        sb.append(list.size());
        sb.append("\n");
        for (int size = list.size() - 1; size >= 0; size--) {
            d dVar = list.get(size);
            sb.append(dVar.toString());
            sb.append("\n");
            Iterator<a.C0596a> it = b2.f.iterator();
            while (it.hasNext()) {
                a.C0596a next = it.next();
                d dVar2 = dVar;
                if (dVar.b() == next.f15461a) {
                    sb.append(next);
                    sb.append("\n");
                }
                dVar = dVar2;
            }
        }
        Queue<Message> queue = b2.e;
        sb.append("\n[Main Looper MessageQueue]: ");
        sb.append(queue.size());
        sb.append("\n");
        for (Message message : queue) {
            boolean z = message.getTarget() == null;
            long j4 = message.getData().getLong(RemoteMessageConst.Notification.WHEN);
            long j5 = j4 - uptimeMillis;
            Object[] objArr = new Object[4];
            objArr[0] = com.taobao.android.tbuprofen.common.a.b(j4);
            objArr[1] = z ? "Barrier" : "Message";
            objArr[2] = j5 < 0 ? "waited" : JarvisConstant.TRIGGER_POINT_AFTER;
            objArr[3] = Long.valueOf(Math.abs(j5));
            sb.append(String.format("[%s] ==> (%s %s:%d)", objArr));
            if (z) {
                sb.append(" index:");
                sb.append(message.arg1);
            } else {
                sb.append(" what:");
                sb.append(message.what);
                sb.append(", target:");
                sb.append(message.getTarget().getClass().getName());
                if (message.getCallback() != null) {
                    sb.append(", callback:");
                    sb.append(message.getCallback().getClass().getName());
                }
                if (f.a(message)) {
                    String a2 = f.a(message.obj, message.what);
                    sb.append(", obj:");
                    sb.append(a2);
                }
            }
            sb.append("\n");
            message.recycle();
        }
        sb.append("\nTBP ANR Message End\n");
        return sb.toString();
    }

    private File a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("956d797b", new Object[]{this, str, new Long(j)});
        }
        File file = new File(this.r.getExternalFilesDir("anrinfo"), String.format("%s_%s.anr", Integer.valueOf(Process.myPid()), new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Long.valueOf(j))));
        if (!com.taobao.android.tbuprofen.common.a.a(file, str, false)) {
            return null;
        }
        com.taobao.android.tbuprofen.log.c.c("MainLooperTaskManager", "Save anr info to " + file.getAbsolutePath(), new Object[0]);
        return file;
    }
}
