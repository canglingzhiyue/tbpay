package com.taobao.android.tbuprofen.adapter.anr;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.StackDumpUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DOUBLE_INC = 4;
    public static final int LINEAR_INC = 2;
    public static final int LOG_INC = 3;
    public static final int MSG_CLEAR_EXPIRED_TRACE = 1001;
    public static final int MSG_DUMP_STACK_TRACE = 0;
    public static final int MSG_FIX_DUMP_STACK_TIMEOUT = 1002;
    public static final int NO_INC = 1;

    /* renamed from: a  reason: collision with root package name */
    private long f15460a;
    private final e b;
    private int c;
    private int d;
    private final int e;
    private final ConcurrentLinkedQueue<C0596a> f;
    private final TBAnrConfig g;
    private final b h;

    static {
        kge.a(-565913869);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(b bVar, Looper looper, e eVar, TBAnrConfig tBAnrConfig) {
        super(looper);
        this.d = 0;
        com.taobao.android.tbuprofen.log.c.d("AnrTraceHandler", "MainThreadMonitorHandler init", new Object[0]);
        this.e = tBAnrConfig.defaultDumpInterval;
        this.c = this.e;
        this.h = bVar;
        this.b = eVar;
        this.g = tBAnrConfig;
        this.f = new ConcurrentLinkedQueue<>();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 0) {
            int a2 = a();
            this.c = a2;
            sendEmptyMessageDelayed(0, a2);
        } else if (i == 1001) {
            a(((Long) message.obj).longValue());
        } else if (i != 1002) {
        } else {
            if (!StackDumpUtils.a(Process.myTid(), this.h)) {
                com.taobao.android.tbuprofen.log.c.b("AnrTraceHandler", "fixThreadStackDumpTimeout invoke failed", new Object[0]);
            }
            com.taobao.android.tbuprofen.log.c.a("AnrTraceHandler", "tbp-anr-trace start success", new Object[0]);
        }
    }

    private int a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int i = this.e;
        long d = this.b.d();
        if (d != this.f15460a) {
            this.d = 0;
            this.f15460a = d;
            this.c = this.e;
        }
        if (d < 0) {
            return i;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - d;
        if (j <= this.g.largeTaskThreshold) {
            return i - ((int) j);
        }
        long j2 = d.f15463a.get();
        Object[] dumpRawStackTraceSafely = StackDumpUtils.dumpRawStackTraceSafely(Looper.getMainLooper().getThread(), this.g.ddmDumpSdkVersion == Build.VERSION.SDK_INT);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (dumpRawStackTraceSafely != null) {
            z = true;
        }
        j.a(uptimeMillis2, z);
        this.f.add(new C0596a(j2, dumpRawStackTraceSafely, uptimeMillis, this.d == 0 ? (int) j : this.c, uptimeMillis2));
        int a2 = a(this.c);
        this.d++;
        return a2;
    }

    private void a(long j) {
        C0596a peek;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.d("AnrTraceHandler", "clearExpiredAnrTrace history stack trace " + this.f.size(), new Object[0]);
        if (this.f.size() == 0) {
            return;
        }
        long j2 = d.f15463a.get();
        synchronized (this) {
            while (!this.f.isEmpty() && ((peek = this.f.peek()) == null || (peek.f15461a != j2 && peek.f15461a < j))) {
                this.f.poll();
            }
        }
    }

    public void a(LinkedList<C0596a> linkedList, LinkedList<C0596a> linkedList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee31d18", new Object[]{this, linkedList, linkedList2});
            return;
        }
        long j = d.f15463a.get();
        synchronized (this) {
            Iterator<C0596a> it = this.f.iterator();
            while (it.hasNext()) {
                C0596a next = it.next();
                if (next.f15461a != j) {
                    linkedList.add(next);
                } else {
                    linkedList2.add(next);
                }
            }
        }
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.d == 0) {
            return this.e;
        }
        int i2 = this.g.timeIncType;
        if (i2 != 1) {
            if (i2 == 2) {
                i += this.e;
            } else if (i2 == 3) {
                i = b(i);
            } else if (i2 == 4) {
                i += i;
            }
        }
        int min = Math.min(i, this.g.maxDumpInterval);
        com.taobao.android.tbuprofen.log.c.e("AnrTraceHandler", "Next dump interval = " + min, new Object[0]);
        return min;
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : (int) (i + (this.e * Math.log10(this.d * 10)));
    }

    /* renamed from: com.taobao.android.tbuprofen.adapter.anr.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0596a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f15461a;
        private final long b;
        private final int c;
        private final long d;
        private final Object[] e;
        private String[] f;

        static {
            kge.a(-1957160996);
        }

        public C0596a(long j, Object[] objArr, long j2, int i, long j3) {
            this.f15461a = j;
            this.e = objArr;
            this.b = j2;
            this.c = i;
            this.d = j3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("[+%dms %s][%dms]  %s%s", Integer.valueOf(this.c), com.taobao.android.tbuprofen.common.a.b(this.b), Long.valueOf(this.d), a(), c());
        }

        private String c() {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
            }
            if (this.f == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (String str : this.f) {
                if (str != null) {
                    sb.append("\n");
                    sb.append(str);
                }
            }
            return sb.toString();
        }

        private String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e == null ? "Failed to dump stack trace" : StackDumpUtils.a(StackDumpUtils.a(Looper.getMainLooper().getThread().getName(), this.e));
        }
    }
}
