package com.taobao.downgrade;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.rule.DefaultRule;
import tb.kkr;
import tb.kkt;

/* loaded from: classes.dex */
public class g implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f17074a;
    private final kkt b;
    private DefaultRule c;

    public g(Handler handler, kkt kktVar) {
        this.f17074a = handler;
        this.b = kktVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f17074a.postDelayed(this, 60000L);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f17074a.removeCallbacks(this);
        }
    }

    private DefaultRule c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultRule) ipChange.ipc$dispatch("ce194584", new Object[]{this});
        }
        if (this.c == null) {
            this.c = this.b.f("default");
        }
        return this.c;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DefaultRule c = c();
        if (c != null) {
            i = h.a(c.dataPickRate, 60);
            if (i <= 0) {
                b();
                return;
            }
            kkr.a(c);
        }
        this.f17074a.postDelayed(this, Math.max(i, 60) * 1000);
    }
}
