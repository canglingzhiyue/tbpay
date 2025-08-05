package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes.dex */
public class PingResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PingEntry[] e;

    /* renamed from: a  reason: collision with root package name */
    private String f25064a = null;
    private String b = null;
    private int c = 0;
    private int d = 0;
    private PingTaskWatcher f = null;

    public PingResponse(int i) {
        this.e = null;
        this.e = new PingEntry[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.e[i2] = new PingEntry();
        }
    }

    public void a(PingTaskWatcher pingTaskWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6336ddcf", new Object[]{this, pingTaskWatcher});
        } else {
            this.f = pingTaskWatcher;
        }
    }

    public void a(int i, int i2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26196676", new Object[]{this, new Integer(i), new Integer(i2), new Double(d)});
            return;
        }
        this.e[i].a(i, i2, d);
        if (d >= mto.a.GEO_NOT_SUPPORT) {
            this.d++;
        }
        PingTaskWatcher pingTaskWatcher = this.f;
        if (pingTaskWatcher == null) {
            return;
        }
        pingTaskWatcher.OnEntry(i, i2, d);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f25064a = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        PingTaskWatcher pingTaskWatcher = this.f;
        if (pingTaskWatcher == null) {
            return;
        }
        if (i == 0) {
            pingTaskWatcher.OnFinished();
        } else {
            pingTaskWatcher.OnFailed(i);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f25064a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public PingEntry[] d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PingEntry[]) ipChange.ipc$dispatch("e886ef32", new Object[]{this}) : this.e;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d;
    }
}
