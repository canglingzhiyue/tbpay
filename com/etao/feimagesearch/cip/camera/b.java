package com.etao.feimagesearch.cip.camera;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Size;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.camera2.Camera2Wrapper;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import tb.cot;
import tb.cqe;
import tb.cqg;
import tb.kge;

/* loaded from: classes3.dex */
public class b implements cqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6614a;
    private final FrameLayout b;
    private final AutoFitSurfaceView c;
    private final cqe d;
    private int h;
    private int i;
    private final CaptureManager j;
    private boolean f = false;
    private boolean e = com.etao.feimagesearch.config.b.aw();
    private final SurfaceHolder.Callback g = new SurfaceHolder.Callback() { // from class: com.etao.feimagesearch.cip.camera.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                return;
            }
            cot.a("PltCamera", "AutoSize_CameraViewHolder", "surfaceCreated");
            b.a(b.this, true);
            b.a(b.this).a(surfaceHolder);
            b.b(b.this).L();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            cot.c("AutoSize_CameraViewHolder", "surfaceChanged: width=" + i2 + ", height=" + i3 + ", format=" + i);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            } else {
                b.a(b.this, false);
            }
        }
    };

    static {
        kge.a(456902188);
        kge.a(165414206);
    }

    public static /* synthetic */ cqe a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqe) ipChange.ipc$dispatch("238b5582", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("542996eb", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.f = z;
        return z;
    }

    public static /* synthetic */ CaptureManager b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CaptureManager) ipChange.ipc$dispatch("5ab272e2", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ AutoFitSurfaceView c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AutoFitSurfaceView) ipChange.ipc$dispatch("591cad34", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206cea", new Object[]{bVar});
        } else {
            bVar.i();
        }
    }

    public b(Activity activity, FrameLayout frameLayout, AutoFitSurfaceView autoFitSurfaceView, CaptureManager captureManager) {
        this.f6614a = activity;
        this.c = autoFitSurfaceView;
        if (com.etao.feimagesearch.config.b.br()) {
            ad.c("setSurfaceView", new ac() { // from class: com.etao.feimagesearch.cip.camera.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    b.c(b.this).setLayoutParams(layoutParams);
                }
            });
        }
        this.j = captureManager;
        this.b = frameLayout;
        this.b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.etao.feimagesearch.cip.camera.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    cot.c("AutoSize_CameraViewHolder", "onLayoutChange: unchanged");
                } else {
                    b.d(b.this);
                }
            }
        });
        this.d = a(activity);
        this.j.a(this.d);
        this.d.a(this);
        SurfaceHolder holder = this.c.getHolder();
        this.c.registerCallback(this.g);
        holder.setType(3);
    }

    private cqe a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqe) ipChange.ipc$dispatch("2d3e0b5", new Object[]{this, activity});
        }
        if (Build.VERSION.SDK_INT >= 24 && com.etao.feimagesearch.config.b.bO() && !com.etao.feimagesearch.cip.camera2.a.Companion.a(activity)) {
            try {
                return new Camera2Wrapper(activity);
            } catch (Exception unused) {
                return new c(activity, this.e);
            }
        }
        return new c(activity, this.e);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cot.c("AutoSize_CameraViewHolder", "onResume");
        this.d.b();
        cot.a("PltCamera", "AutoSize_CameraViewHolder", "onResume mSurfaceReady = " + this.f);
        SurfaceHolder holder = this.c.getHolder();
        if (this.e) {
            if (!this.f) {
                return;
            }
            this.d.a(holder);
            return;
        }
        this.d.a(holder);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d.e();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d.c();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d.g();
        }
    }

    public cqe f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqe) ipChange.ipc$dispatch("357b9522", new Object[]{this}) : this.d;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.b.getWidth();
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.b.getHeight();
    }

    @Override // tb.cqg
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.h = i;
        this.i = i2;
        ad.c("onCameraSizeChange", new ac() { // from class: com.etao.feimagesearch.cip.camera.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    b.d(b.this);
                }
            }
        });
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        AutoFitSurfaceView autoFitSurfaceView = this.c;
        if (autoFitSurfaceView == null || this.b == null || autoFitSurfaceView.getLayoutParams() == null || this.i == 0 || this.h == 0 || this.b.getHeight() == 0 || this.b.getWidth() == 0) {
            return;
        }
        this.j.b(new Size(this.h, this.i));
        this.j.a(new Size(this.b.getWidth(), this.b.getHeight()));
        cot.c("AutoSize_CameraViewHolder", "updateSurfaceSize mCameraWidth:" + this.h + ", mCameraHeight:" + this.i + " rootWidth " + this.b.getWidth() + ", rootHeight " + this.b.getHeight());
        this.c.setAspectRatio(this.h, this.i, this.d.m());
        this.c.requestLayout();
    }
}
