package com.etao.feimagesearch.intelli;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.c;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cot;
import tb.coy;
import tb.kge;

/* loaded from: classes3.dex */
public final class ObjectDetectorWrapper extends d implements ComponentCallbacks2, CaptureManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    public static final String TAG = "realtime_ObjectDetectorWrapper";
    private static final boolean o;
    private static final int p;
    private boolean e;
    private final a f;
    private Companion.ImageProcessStatus g;
    private d h;
    private com.etao.feimagesearch.intelli.realtime.c i;
    private com.etao.feimagesearch.structure.capture.g j;
    private final FrameLayout k;
    private com.etao.feimagesearch.structure.capture.e l;
    private final Context m;
    private final CaptureManager n;

    public static /* synthetic */ Object ipc$super(ObjectDetectorWrapper objectDetectorWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, newConfig});
        } else {
            q.c(newConfig, "newConfig");
        }
    }

    public ObjectDetectorWrapper(Context context, CaptureManager captureManager) {
        b bVar;
        q.c(context, "context");
        q.c(captureManager, "captureManager");
        this.m = context;
        this.n = captureManager;
        this.f = new a();
        this.g = Companion.ImageProcessStatus.Idle;
        if (this.n.w()) {
            bVar = new h(this.m, this.n);
        } else {
            bVar = new b(this.m, this.n);
        }
        this.h = bVar;
        this.i = new com.etao.feimagesearch.intelli.realtime.c(this.m, this.f, this.n);
        this.j = this.h;
        this.k = new FrameLayout(this.m);
        com.b().registerComponentCallbacks(this);
        this.k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.k.addView(this.h.d());
        this.n.a(this);
        a(this.n.p(), this.n.h());
    }

    public static final /* synthetic */ boolean a(ObjectDetectorWrapper objectDetectorWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c8e19f8", new Object[]{objectDetectorWrapper})).booleanValue() : objectDetectorWrapper.e;
    }

    public static final /* synthetic */ CaptureManager b(ObjectDetectorWrapper objectDetectorWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CaptureManager) ipChange.ipc$dispatch("15d8a7eb", new Object[]{objectDetectorWrapper}) : objectDetectorWrapper.n;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* loaded from: classes3.dex */
        public enum ImageProcessStatus {
            RealtimeSearch,
            AutoDetect,
            Idle
        }

        static {
            kge.a(-1853060981);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    static {
        kge.a(130073859);
        kge.a(1692250641);
        kge.a(-418195541);
        Companion = new Companion(null);
        o = com.etao.feimagesearch.config.b.bM();
        p = com.etao.feimagesearch.config.b.bN();
    }

    /* loaded from: classes3.dex */
    public static final class a implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.etao.feimagesearch.intelli.realtime.c.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.c(ObjectDetectorWrapper.TAG, "onBuildSuccess");
            if (ObjectDetectorWrapper.a(ObjectDetectorWrapper.this)) {
                return;
            }
            ObjectDetectorWrapper.b(ObjectDetectorWrapper.this).a(CaptureManager.RealtimeModelLoadListener.LoadState.BUILD_SUCCESS);
        }

        @Override // com.etao.feimagesearch.intelli.realtime.c.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            cot.c(ObjectDetectorWrapper.TAG, "onBuildFailed");
            if (ObjectDetectorWrapper.a(ObjectDetectorWrapper.this)) {
                return;
            }
            ObjectDetectorWrapper.b(ObjectDetectorWrapper.this).a(CaptureManager.RealtimeModelLoadListener.LoadState.BUILD_FAILED);
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                ObjectDetectorWrapper.b(ObjectDetectorWrapper.this).a(CaptureManager.RealtimeModelLoadListener.LoadState.DESTROYED);
            }
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.h.a(i, i2);
        this.i.a(i, i2);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public FrameLayout d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this}) : this.k;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h.a(z);
        this.i.a(z);
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(byte[] bArr, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acc2fe", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.d || this.g == Companion.ImageProcessStatus.Idle) {
        } else {
            this.j.a(bArr, z, i, i2, i3);
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.g != Companion.ImageProcessStatus.AutoDetect) {
        } else {
            this.h.e();
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        cot.c(TAG, "resume() called");
        super.a();
        this.h.a();
        this.i.a();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cot.c(TAG, "stop() called");
        super.b();
        this.h.b();
        this.i.b();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.b().unregisterComponentCallbacks(this);
        this.g = Companion.ImageProcessStatus.Idle;
        this.n.x();
        this.h.c();
        if (this.e) {
            return;
        }
        this.i.c();
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public void a(com.etao.feimagesearch.structure.capture.e flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9c6ec6", new Object[]{this, flow});
            return;
        }
        q.c(flow, "flow");
        this.l = flow;
        this.h.a(flow);
        this.i.a(flow);
    }

    @Override // com.etao.feimagesearch.structure.capture.CaptureManager.a
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        cot.c(TAG, "onTabChange nextTab: " + i + ", open: " + z);
        if (i == 0) {
            a(Companion.ImageProcessStatus.AutoDetect);
        } else if (i == 2) {
            a(Companion.ImageProcessStatus.Idle);
        } else if (z) {
            a(Companion.ImageProcessStatus.RealtimeSearch);
        } else {
            a(Companion.ImageProcessStatus.AutoDetect);
        }
    }

    private final void a(Companion.ImageProcessStatus imageProcessStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa8573a", new Object[]{this, imageProcessStatus});
            return;
        }
        this.g = imageProcessStatus;
        int i = f.$EnumSwitchMapping$0[imageProcessStatus.ordinal()];
        if (i == 1) {
            return;
        }
        if (i == 2) {
            if (!(!q.a(this.j, this.h))) {
                return;
            }
            this.k.removeAllViews();
            this.k.addView(this.h.d());
            this.j = this.h;
        } else if (!(!q.a(this.j, this.i))) {
        } else {
            this.k.removeAllViews();
            this.k.addView(this.i.d());
            this.j = this.i;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "objectDetectorWrapperOnLowMemory", 19999, new String[0]);
        cot.a("AutoDetect", TAG, "objectDetectorWrapperOnLowMemory");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
        } else if (!o || i >= p || this.e || this.g == Companion.ImageProcessStatus.RealtimeSearch) {
        } else {
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "killRealtimeSearch", 19999, "level", String.valueOf(i));
            cot.a("AutoDetect", "killRealtimeSearch", String.valueOf(i));
            this.i.c();
            this.e = true;
            this.f.c();
        }
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public ClientModelType f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClientModelType) ipChange.ipc$dispatch("3c5a970b", new Object[]{this}) : this.h.f();
    }
}
