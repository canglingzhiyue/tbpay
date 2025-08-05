package com.taobao.android.launcher.bootstrap.tao.biz.touch;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.h;
import tb.sxs;

/* loaded from: classes5.dex */
public class d extends GestureDetector.SimpleOnGestureListener implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean h = h.a(".enableScrollDetail");
    private final sxs b;
    private final int f;
    private final int g;

    /* renamed from: a  reason: collision with root package name */
    private final String f13080a = "GestureListener";
    private int c = -1;
    private int d = 0;
    private int e = 0;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -223117518:
                return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            case 307521857:
                return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            case 587072321:
                return new Boolean(super.onDown((MotionEvent) objArr[0]));
            case 1575121015:
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public d(sxs sxsVar) {
        this.b = sxsVar;
        WindowManager windowManager = (WindowManager) sxsVar.i().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f = displayMetrics.widthPixels;
            this.g = displayMetrics.heightPixels;
            return;
        }
        this.g = 0;
        this.f = 0;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.b.a()) {
            return super.onSingleTapUp(motionEvent);
        }
        com.taobao.android.launcher.bootstrap.tao.h.b("GestureListener", "onSingleTapUp");
        this.b.a("GestureListener.onSingleTapUp");
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (this.b.a()) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        com.taobao.android.launcher.bootstrap.tao.h.b("GestureListener", "onFling");
        this.c = 2;
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (this.b.a()) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        this.c = 1;
        this.d = (int) (this.d + f);
        this.e = (int) (this.e + f2);
        if (h) {
            com.taobao.android.launcher.bootstrap.tao.h.b("GestureListener", "onScroll, total distanceX:" + this.d + ", total distanceY:" + this.e);
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.b.a()) {
            return super.onDown(motionEvent);
        }
        com.taobao.android.launcher.bootstrap.tao.h.b("GestureListener", "onDown");
        this.c = 0;
        this.d = 0;
        this.e = 0;
        return super.onDown(motionEvent);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.biz.touch.g
    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (this.b.a()) {
        } else {
            com.taobao.android.launcher.bootstrap.tao.h.b("GestureListener", "onUp");
            int i = this.c;
            if (i == 1) {
                if (Math.abs(this.d) >= this.f / 2) {
                    com.taobao.android.launcher.bootstrap.tao.h.b("GestureListener", "onScrollingUp");
                    this.b.a("GestureListener.onScrollingUp");
                }
            } else if (i == 2) {
                com.taobao.android.launcher.bootstrap.tao.h.b("GestureListener", "onFlingUp");
                this.b.a("GestureListener.onFlingUp");
            }
            this.c = 3;
            this.d = 0;
            this.e = 0;
        }
    }
}
