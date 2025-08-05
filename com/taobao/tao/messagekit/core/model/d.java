package com.taobao.tao.messagekit.core.model;

import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import tao.reactivex.j;
import tb.jdz;
import tb.kge;

/* loaded from: classes8.dex */
public class d<T> implements j<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTROL_STREAM = "control_stream";
    public static final String DOWN_STREAM = "down_stream";
    public static final String UP_STREAM = "up_stream";

    /* renamed from: a  reason: collision with root package name */
    private tao.reactivex.h.c<T> f20784a = tao.reactivex.h.a.c().d();
    private String b;

    static {
        kge.a(951449156);
        kge.a(-605775859);
    }

    public tao.reactivex.c<T> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tao.reactivex.c) ipChange.ipc$dispatch("96225953", new Object[]{this}) : this.f20784a.a(tao.reactivex.a.BUFFER).b();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tao.reactivex.j
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        MsgLog.b("Pipe", "onComplete, name=" + this.b);
    }

    @Override // tao.reactivex.j
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        th.printStackTrace();
        MsgLog.c("Pipe", "onError,  name=" + this.b, Log.getStackTraceString(th));
        com.taobao.tao.messagekit.core.utils.d.a("MKT", "c_pipe_err", 1.0d);
    }

    @Override // tao.reactivex.j
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            return;
        }
        try {
            if (t instanceof b) {
                b bVar = (b) t;
                if (bVar.o != null) {
                    bVar.o.pipeTime = SystemClock.elapsedRealtime();
                }
            }
            this.f20784a.onNext(t);
            MsgLog.a("Pipe", "onNext, name=" + this.b, t);
        } catch (Throwable th) {
            onError(th);
        }
    }

    @Override // tao.reactivex.j
    public void onSubscribe(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
        }
    }
}
