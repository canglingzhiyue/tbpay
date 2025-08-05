package com.taobao.android.searchbaseframe.meta.uikit;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f14984a;
    private float b;
    private final int c;
    private boolean d;
    private boolean e;
    private boolean f = false;
    private final MetaLayout g;
    private boolean h;

    static {
        kge.a(-925086465);
    }

    public e(Context context, MetaLayout metaLayout) {
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = metaLayout;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3816280", new Object[]{this, bVar});
        } else {
            this.f14984a = bVar;
        }
    }

    public boolean a(MotionEvent motionEvent) {
        boolean z;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.f14984a == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.b = motionEvent.getY();
            this.e = false;
            this.f = motionEvent.getY() < ((float) this.g.getCurrentHeaderHeight());
            if (this.f && (bVar = this.f14984a) != null) {
                bVar.r();
            }
            z = true;
        } else {
            this.e = this.e || Math.abs(this.b - motionEvent.getY()) > ((float) this.c);
            z = false;
        }
        return this.f && this.f14984a.a(motionEvent) && !z && this.e;
    }

    public void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
        } else if (motionEvent.getAction() != 0) {
        } else {
            this.d = true;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.h = true;
        }
    }

    public boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{this, motionEvent})).booleanValue();
        }
        b bVar = this.f14984a;
        if (bVar == null) {
            return false;
        }
        if (this.h) {
            motionEvent.offsetLocation(0.0f, this.g.getHiddenHeight());
        } else {
            motionEvent.offsetLocation(0.0f, -bVar.s());
        }
        if (this.d) {
            this.d = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(0);
            this.f14984a.b(obtain);
            obtain.recycle();
        }
        return this.f14984a.b(motionEvent);
    }
}
