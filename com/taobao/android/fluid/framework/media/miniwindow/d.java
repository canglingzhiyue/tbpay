package com.taobao.android.fluid.framework.media.miniwindow;

import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.obu;
import tb.obx;
import tb.occ;
import tb.sjq;
import tb.snv;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FloatWindow f12590a;
    private WindowManager.LayoutParams b;
    private int c;
    private int d;

    static {
        kge.a(1259750196);
    }

    public d(Context context) {
        this.f12590a = new FloatWindow(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        FloatWindow floatWindow = this.f12590a;
        if (floatWindow == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) floatWindow.getLayoutParams();
        if (layoutParams != null && this.f12590a.userHasMoved()) {
            occ.a((Context) obu.e(), e.SP_KEY_FLOAT_WINDOW_X, layoutParams.x);
            occ.a((Context) obu.e(), e.SP_KEY_FLOAT_WINDOW_Y, layoutParams.y);
        }
        this.f12590a.destroy();
    }

    public FloatWindow b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatWindow) ipChange.ipc$dispatch("f385c1a2", new Object[]{this}) : this.f12590a;
    }

    public WindowManager.LayoutParams c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("31c9d87a", new Object[]{this});
        }
        if (this.b == null) {
            this.b = e.a();
            WindowManager.LayoutParams layoutParams = this.b;
            layoutParams.width = this.c;
            layoutParams.height = this.d;
            int a2 = obx.a(obu.e());
            int i = e.FLOAT_WINDOW_PADDING;
            int i2 = e.FLOAT_WINDOW_BOTTOM_PADDING;
            int min = Math.min(obx.d(), obx.c());
            int max = Math.max(obx.d(), obx.c());
            int b = occ.b(obu.e(), e.SP_KEY_FLOAT_WINDOW_X, 0);
            int b2 = occ.b(obu.e(), e.SP_KEY_FLOAT_WINDOW_Y, 0);
            if (b == 0 && b2 == 0) {
                WindowManager.LayoutParams layoutParams2 = this.b;
                layoutParams2.x = (min - this.c) - i;
                layoutParams2.y = ((max - a2) - this.d) - i2;
            } else {
                WindowManager.LayoutParams layoutParams3 = this.b;
                layoutParams3.x = b;
                layoutParams3.y = b2;
            }
        }
        return this.b;
    }

    public void a(snv snvVar, sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122501b3", new Object[]{this, snvVar, sjqVar});
        } else if (snvVar == null) {
        } else {
            int i = sjqVar.b;
            int i2 = sjqVar.f33635a;
            if (i == 0 || i2 == 0) {
                i = obx.c();
                i2 = obx.d();
            }
            int c = (obx.c() << 2) / 15;
            float f = i / i2;
            if (Math.abs(f - 0.5625f) < 0.1f) {
                this.c = c;
                this.d = (c / 9) << 4;
            }
            if (Math.abs(f - 1.7777778f) < 0.1d) {
                this.c = (c / 9) << 4;
                this.d = c;
            } else if (Math.abs(f - 1.0f) < 0.1d) {
                int i3 = (c * 6) / 5;
                this.c = i3;
                this.d = i3;
            } else if (Math.abs(f - 0.75f) < 0.1d) {
                this.d = (c / 3) << 2;
                this.c = c;
            }
            snvVar.a(this.c, this.d);
            ViewGroup f2 = snvVar.f();
            if (f2.getParent() != null) {
                ((ViewGroup) f2.getParent()).removeView(f2);
            }
            FloatWindow floatWindow = this.f12590a;
            if (floatWindow == null) {
                return;
            }
            floatWindow.getContentView().addView(f2, 0, new ViewGroup.LayoutParams(-2, -2));
        }
    }
}
