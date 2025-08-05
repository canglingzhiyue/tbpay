package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static o f23656a;
    private AtomicBoolean b = new AtomicBoolean(false);

    static {
        kge.a(546620273);
    }

    public static o a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("e235365e", new Object[0]);
        }
        if (f23656a == null) {
            synchronized (o.class) {
                if (f23656a == null) {
                    f23656a = new o();
                }
            }
        }
        return f23656a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b.get() || !android.taobao.windvane.config.i.a().b() || !this.b.compareAndSet(false, true)) {
        } else {
            android.taobao.windvane.util.m.c("ZCache", "未初始化ZCache so，需要先初始化");
            try {
                r.a();
            } catch (Throwable th) {
                this.b.set(false);
                android.taobao.windvane.util.m.e("ZCache", "初始化ZCache so失败");
                th.printStackTrace();
            }
        }
    }
}
