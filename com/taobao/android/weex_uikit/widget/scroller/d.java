package com.taobao.android.weex_uikit.widget.scroller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c b;
    private boolean c;
    private View d;

    /* renamed from: a  reason: collision with root package name */
    private Handler f16205a = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.weex_uikit.widget.scroller.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1 || !d.a(d.this)) {
            } else {
                d.b(d.this);
            }
        }
    };
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;
    private boolean g = true;

    static {
        kge.a(442240619);
    }

    public static /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2dd4799b", new Object[]{dVar})).booleanValue() : dVar.c;
    }

    public static /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47eff836", new Object[]{dVar});
        } else {
            dVar.c();
        }
    }

    public d(c cVar, View view) {
        this.b = cVar;
        this.d = view;
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.b.onRealTimeScroll(this.d, i, i2, i3, i4);
        a();
        if (!this.c) {
            b();
        }
        int i6 = this.f;
        if (i6 == Integer.MIN_VALUE || (i5 = this.e) == Integer.MIN_VALUE) {
            this.f = i;
            this.e = i2;
            this.b.onScrollChange(this.d, i, i2, i3, i4);
            this.g = true;
            return;
        }
        int i7 = i2 - i5;
        this.f = i;
        this.e = i2;
        if (Math.abs(i - i6) >= 10 || Math.abs(i7) >= 10) {
            this.b.onScrollChange(this.d, i, i2, i3, i4);
            this.g = true;
            return;
        }
        this.g = false;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f16205a.removeMessages(1);
        this.f16205a.sendEmptyMessageDelayed(1, 80L);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.onScrollStart(this.d);
        this.c = true;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (!this.g) {
            c cVar = this.b;
            View view = this.d;
            int i = this.f;
            int i2 = this.e;
            cVar.onScrollChange(view, i, i2, i, i2);
            this.g = true;
        }
        this.f = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.b.onScrollEnd(this.d);
        this.c = false;
    }
}
