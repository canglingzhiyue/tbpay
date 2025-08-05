package com.etao.feimagesearch.cip.camera;

import android.app.Activity;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import tb.cot;
import tb.cqf;
import tb.cqh;
import tb.kge;

/* loaded from: classes3.dex */
public class d implements cqf, cqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f6631a;
    private final b c;
    private volatile int d;
    private volatile int e;
    private boolean f = false;
    private volatile cqh h = null;

    static {
        kge.a(1028590695);
        kge.a(1108331054);
        kge.a(-1040246050);
    }

    public d(Activity activity, FrameLayout frameLayout, AutoFitSurfaceView autoFitSurfaceView, CaptureManager captureManager) {
        this.f6631a = activity;
        this.c = new b(activity, frameLayout, autoFitSurfaceView, captureManager);
        this.c.f().a((cqf) this);
        this.c.f().a((cqh) this);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c.e();
        }
    }

    public void a(e eVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362882aa", new Object[]{this, eVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.d = this.c.g();
        this.e = this.c.h();
        this.c.f().a(new f(eVar, z, this.d, this.e, z2, this.f6631a.hashCode()));
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c.f().a();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.c.g();
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.c.h();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        cot.c("FEISCameraRenderer", "onResume");
        this.c.b();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.c.d();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        cot.c("FEISCameraRenderer", "pausePreview");
        this.c.c();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.c.f().f();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.c.f().d();
        this.c.b();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c.f().a(z);
        this.c.b();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.f = true;
        this.c.f().b(true);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.f = false;
        this.c.f().b(false);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.c.f().a(f);
        }
    }

    public void a(cqh cqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ed5ade", new Object[]{this, cqhVar});
        } else {
            this.h = cqhVar;
        }
    }

    @Override // tb.cqf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = false;
        cot.a("AutoDetect", "FEISCameraRenderer", "onCameraOpened");
    }

    @Override // tb.cqf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            cot.a("AutoDetect", "FEISCameraRenderer", "onCameraOpenFailed");
        }
    }

    @Override // tb.cqf
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f = false;
        }
    }

    @Override // tb.cqh
    public void a(byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a9dac3", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
        } else if (i2 == 0 || i == 0) {
        } else {
            try {
                if (this.h == null) {
                    return;
                }
                this.h.a(bArr, i, i2, i3, z, i4);
            } catch (Exception e) {
                cot.a("FEISCameraRenderer", "onFrame frameCallback error", e);
            }
        }
    }
}
