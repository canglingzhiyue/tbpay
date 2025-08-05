package com.taobao.monitor.impl.common;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mpi;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final e f18154a = new e();
    private Context b;
    private volatile Handler c;
    private volatile Handler d;
    private String e;
    private Boolean f;
    private String g;
    private String h;
    private Handler i = new Handler(Looper.getMainLooper());

    private e() {
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("ee08dc95", new Object[0]) : f18154a;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.b;
    }

    public e a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("858c39d", new Object[]{this, context});
        }
        this.b = context;
        return this;
    }

    public e a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("51d79e0b", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a41b85fb", new Object[]{this});
        }
        if (this.c == null) {
            synchronized (e.class) {
                if (this.c == null) {
                    HandlerThread handlerThread = new HandlerThread("APM-Monitor-Biz");
                    handlerThread.start();
                    this.c = new Handler(handlerThread.getLooper());
                }
            }
        }
        return this.c;
    }

    public Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a01d14da", new Object[]{this});
        }
        if (this.d == null) {
            synchronized (e.class) {
                if (this.d == null) {
                    HandlerThread handlerThread = new HandlerThread("APM-FrameMetrics");
                    handlerThread.start();
                    this.d = new Handler(handlerThread.getLooper());
                }
            }
        }
        return this.d;
    }

    public Handler j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8c24df35", new Object[]{this}) : this.i;
    }

    public Handler f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("9c1ea3b9", new Object[]{this}) : this.c;
    }

    public void a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e49798", new Object[]{this, handler});
        } else {
            this.c = handler;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        Context context = this.b;
        if (context == null) {
            return "";
        }
        if (this.h == null) {
            int identifier = context.getResources().getIdentifier("ttid", "string", this.b.getPackageName());
            if (identifier <= 0) {
                mpi.c("Global", "can not find valid ttid");
                this.h = "";
            } else {
                this.h = this.b.getString(identifier);
            }
        }
        return this.h;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        Context context = this.b;
        if (context == null) {
            return false;
        }
        if (this.f == null) {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            this.f = Boolean.valueOf(z);
        }
        return this.f.booleanValue();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        Context context = this.b;
        if (context == null) {
            return false;
        }
        if (this.g == null) {
            int identifier = context.getResources().getIdentifier("publish_type", "string", this.b.getPackageName());
            if (identifier <= 0) {
                mpi.c("Global", "can not find valid publish_type");
                this.g = "";
            } else {
                this.g = this.b.getString(identifier);
            }
        }
        return "0".equals(this.g);
    }
}
