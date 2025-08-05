package com.taobao.android.tbuprofen.adapter.anr;

import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.anr.a;
import com.taobao.android.tbuprofen.util.StackDumpUtils;
import java.util.HashMap;
import java.util.LinkedList;
import tb.jbg;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements StackDumpUtils.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<Integer, Object> e;
    private final e c;
    private final TBAnrConfig d;

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f15462a = null;
    private volatile a b = null;
    private long f = -1;

    static {
        kge.a(465414980);
        kge.a(-1288322444);
    }

    public b(e eVar, TBAnrConfig tBAnrConfig) {
        this.c = eVar;
        this.d = tBAnrConfig;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f15462a != null) {
        } else {
            this.f15462a = jbg.b("tbp-anr-trace");
            this.f15462a.start();
            this.f = this.f15462a.getThreadId();
            this.b = new a(this, this.f15462a.getLooper(), this.c, this.d);
            this.b.sendEmptyMessage(1002);
            this.b.sendEmptyMessage(0);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.tbuprofen.log.c.a("TraceDumper", "Stop thread " + this.f + " to dump stack!", new Object[0]);
        StackDumpUtils.b(this.f);
        if (this.f15462a == null) {
            return;
        }
        if (this.b != null) {
            this.b.removeMessages(0);
        }
        this.f15462a.quitSafely();
        this.b = null;
        this.f15462a = null;
    }

    @Override // com.taobao.android.tbuprofen.util.StackDumpUtils.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.a("TraceDumper", "Receive Dump stack trace error:" + i, new Object[0]);
        b();
        j.a(i);
        if (!this.d.restartDumpThread) {
            return;
        }
        a();
    }

    public void a(LinkedList<a.C0596a> linkedList, LinkedList<a.C0596a> linkedList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee31d18", new Object[]{this, linkedList, linkedList2});
        } else if (this.b == null) {
        } else {
            this.b.a(linkedList, linkedList2);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1001;
        obtain.obj = Long.valueOf(j);
        if (this.b != null) {
            this.b.sendMessage(obtain);
        }
        if (this.d.dumpNativeStack) {
            return;
        }
        e = null;
    }
}
