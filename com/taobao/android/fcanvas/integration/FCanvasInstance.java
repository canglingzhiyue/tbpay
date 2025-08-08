package com.taobao.android.fcanvas.integration;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasNativeInterface;
import com.taobao.android.fcanvas.integration.adapter.OnCanvasErrorListener;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import com.taobao.android.fcanvas.integration.d;
import tb.kge;

/* loaded from: classes5.dex */
public class FCanvasInstance implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FCanvasJNIBridge f12317a;
    private d b;
    private RenderMode c;
    private f d;
    private final FrameLayout e;
    private final FCanvasNativeInterface f;
    private final String g;
    private final FCanvas h;
    private a i;

    /* loaded from: classes5.dex */
    public enum ContainerType {
        Unknown,
        Widget_1_0_Legacy,
        Widget_2_0_Legacy,
        Widget_3_0_Or_Weex,
        Widget_2_0,
        MiniApp,
        MiniGame
    }

    /* loaded from: classes5.dex */
    public enum RenderMode {
        surface,
        texture
    }

    /* loaded from: classes5.dex */
    public enum RenderType {
        canvas2D,
        webGL
    }

    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12322a;
        public boolean b;

        static {
            kge.a(359294661);
        }
    }

    static {
        kge.a(594341044);
        kge.a(1994052498);
    }

    @Deprecated
    public static void a(String str, Bitmap bitmap, FCanvasNativeInterface.ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51267140", new Object[]{str, bitmap, imageLoadCallback});
        }
    }

    public static /* synthetic */ d a(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7795713d", new Object[]{fCanvasInstance}) : fCanvasInstance.b;
    }

    public static /* synthetic */ d a(FCanvasInstance fCanvasInstance, Context context, RenderMode renderMode, RenderType renderType, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6862f57a", new Object[]{fCanvasInstance, context, renderMode, renderType, new Boolean(z)}) : fCanvasInstance.a(context, renderMode, renderType, z);
    }

    public static /* synthetic */ d a(FCanvasInstance fCanvasInstance, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a8ec9753", new Object[]{fCanvasInstance, dVar});
        }
        fCanvasInstance.b = dVar;
        return dVar;
    }

    public static /* synthetic */ RenderMode b(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderMode) ipChange.ipc$dispatch("a5621cc", new Object[]{fCanvasInstance}) : fCanvasInstance.c;
    }

    public static /* synthetic */ FrameLayout c(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2de3fd4", new Object[]{fCanvasInstance}) : fCanvasInstance.e;
    }

    public static /* synthetic */ FCanvas d(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FCanvas) ipChange.ipc$dispatch("65088740", new Object[]{fCanvasInstance}) : fCanvasInstance.h;
    }

    public static /* synthetic */ String e(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66113c99", new Object[]{fCanvasInstance}) : fCanvasInstance.g;
    }

    public FCanvasInstance(Context context, String str, String str2, a aVar, FCanvas fCanvas) {
        this.i = aVar;
        this.h = fCanvas;
        this.g = str;
        a(aVar.f(), aVar.e(), str2);
        this.f12317a = new FCanvasJNIBridge();
        this.f12317a.attachToNative(str);
        this.d = f.a(this.f12317a, a.a(aVar));
        this.f12317a.bindVsyncScheduler(this.d);
        this.e = new FrameLayout(context);
        this.f = new FCanvasNativeInterface(this.f12317a);
        if (aVar.g()) {
            b(a.b(aVar), aVar.c(), aVar.d());
        } else {
            a(a.b(aVar), aVar.c(), aVar.d());
        }
        a(context, aVar.a(), str, aVar.h());
        d dVar = this.b;
        if (dVar != null) {
            View canvasView = dVar.getCanvasView();
            if (canvasView instanceof TextureView) {
                com.taobao.android.fcanvas.integration.b.a().a(this.g, (TextureView) canvasView);
            }
        } else {
            this.h.printLog(3, "create render surface failed", null);
        }
        final com.taobao.android.fcanvas.integration.adapter.b b2 = aVar.b();
        FCanvasJNIBridge.setOnCanvasFirstFrameListener(str, new com.taobao.android.fcanvas.integration.adapter.b() { // from class: com.taobao.android.fcanvas.integration.FCanvasInstance.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fcanvas.integration.adapter.b
            public void a() {
                View canvasView2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (FCanvasInstance.a(FCanvasInstance.this) != null && FCanvasInstance.b(FCanvasInstance.this) == RenderMode.surface && (canvasView2 = FCanvasInstance.a(FCanvasInstance.this).getCanvasView()) != null) {
                    canvasView2.setAlpha(1.0f);
                }
                com.taobao.android.fcanvas.integration.adapter.b bVar = b2;
                if (bVar == null) {
                    return;
                }
                bVar.a();
            }
        });
    }

    @Override // com.taobao.android.fcanvas.integration.d.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.a();
    }

    @Override // com.taobao.android.fcanvas.integration.d.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.b();
    }

    private void a(final Context context, final RenderMode renderMode, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb2b532", new Object[]{this, context, renderMode, str, new Boolean(z)});
            return;
        }
        this.c = renderMode;
        final com.taobao.android.fcanvas.integration.c cVar = new com.taobao.android.fcanvas.integration.c(this.f12317a, this.g);
        d a2 = a(context, renderMode, RenderType.canvas2D, z);
        a2.attachToRenderer(cVar);
        this.b = a2;
        this.e.addView(this.b.getCanvasView());
        FCanvasJNIBridge.setOnCanvasTypeChangedListener(str, new FCanvasJNIBridge.OnCanvasTypeChangedListener() { // from class: com.taobao.android.fcanvas.integration.FCanvasInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge.OnCanvasTypeChangedListener
            public void onCanvasTypeChanged(String str2, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("46c2d980", new Object[]{this, str2, new Boolean(z2)});
                } else if (Looper.myLooper() != Looper.getMainLooper() || !str.equals(str2) || !z2) {
                } else {
                    try {
                        if (FCanvasInstance.c(FCanvasInstance.this).getChildCount() <= 0) {
                            return;
                        }
                        FCanvasInstance.a(FCanvasInstance.this).detachFromRenderer();
                        FCanvasInstance.d(FCanvasInstance.this).printLog(1, "make new textureView and switch to webGL context", null);
                        FCanvasInstance.a(FCanvasInstance.this, FCanvasInstance.a(FCanvasInstance.this, context, renderMode, RenderType.webGL, z));
                        FCanvasInstance.a(FCanvasInstance.this).attachToRenderer(cVar);
                        FCanvasInstance.c(FCanvasInstance.this).removeAllViews();
                        FCanvasInstance.c(FCanvasInstance.this).addView(FCanvasInstance.a(FCanvasInstance.this).getCanvasView());
                        View canvasView = FCanvasInstance.a(FCanvasInstance.this).getCanvasView();
                        if (!(canvasView instanceof TextureView)) {
                            return;
                        }
                        com.taobao.android.fcanvas.integration.b.a().a(FCanvasInstance.e(FCanvasInstance.this), (TextureView) canvasView);
                    } catch (Throwable th) {
                        FCanvasInstance.d(FCanvasInstance.this).printLog(3, "unable change to webGL mode", th);
                    }
                }
            }
        });
    }

    private void a(ContainerType containerType, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ee6e0c", new Object[]{this, containerType, new Integer(i), new Integer(i2)});
            return;
        }
        this.f.createOnScreenCanvas(this.g, a(containerType), i, i2);
        FCanvas fCanvas = this.h;
        fCanvas.printLog(0, "[FCanvasInstance] createOnScreenCanvas(" + i + "," + i2 + ") success. canvasId:" + this.g, null);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        FCanvasJNIBridge fCanvasJNIBridge = this.f12317a;
        if (fCanvasJNIBridge == null) {
            return;
        }
        fCanvasJNIBridge.notifyMemoryPressure(this.g);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e532b504", new Object[]{this, cVar});
            return;
        }
        FCanvasJNIBridge fCanvasJNIBridge = this.f12317a;
        if (fCanvasJNIBridge == null || cVar == null) {
            return;
        }
        fCanvasJNIBridge.setProfileEnabled(this.g, cVar.f12322a, cVar.b);
    }

    private void b(ContainerType containerType, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bcec8d", new Object[]{this, containerType, new Integer(i), new Integer(i2)});
        } else {
            this.f.createOffScreenCanvas(this.g, a(containerType), i, i2);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (StringUtils.isEmpty(this.g)) {
        } else {
            this.f.resizeCanvas(this.g, i, i2, i3, i4);
        }
    }

    public Bitmap d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3863b0c9", new Object[]{this});
        }
        if (this.f12317a != null && !StringUtils.isEmpty(this.g)) {
            return this.f12317a.makeSnapshot(this.g);
        }
        return null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        f fVar = this.d;
        if (fVar != null) {
            fVar.b();
        }
        this.f.pause();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        f fVar = this.d;
        if (fVar != null) {
            fVar.a();
        }
        this.f.resume();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar != null) {
            dVar.detachFromRenderer();
        }
        f fVar = this.d;
        if (fVar != null) {
            fVar.b();
        }
        this.b = null;
        this.f12317a.detachFromNativeAndReleaseResources(this.g);
        this.f12317a.clearCallbacks(this.g);
    }

    public View h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this}) : this.e;
    }

    private d a(Context context, RenderMode renderMode, RenderType renderType, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("30552795", new Object[]{this, context, renderMode, renderType, new Boolean(z)});
        }
        FCanvas fCanvas = this.h;
        d fCanvasSurfaceView = renderMode == RenderMode.surface ? new FCanvasSurfaceView(context, fCanvas, false, a.c(this.i), renderType) : new FCanvasTextureView(context, fCanvas, renderType);
        fCanvasSurfaceView.setLifecycleListener(this);
        if (fCanvasSurfaceView.getCanvasView() instanceof TextureView) {
            ((TextureView) fCanvasSurfaceView.getCanvasView()).setOpaque(z);
        }
        return fCanvasSurfaceView;
    }

    private void a(boolean z, float f, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6618de9e", new Object[]{this, new Boolean(z), new Float(f), str});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (str == null) {
            str = "";
        }
        FCanvasJNIBridge.nativeInitializeCanvasRuntime(f, z, i, str);
    }

    private int a(ContainerType containerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf9f889f", new Object[]{this, containerType})).intValue();
        }
        if (containerType == null) {
            return 0;
        }
        if (containerType == ContainerType.Widget_1_0_Legacy) {
            return 1;
        }
        if (containerType == ContainerType.Widget_2_0_Legacy) {
            return 2;
        }
        if (containerType == ContainerType.Widget_2_0) {
            return 3;
        }
        if (containerType == ContainerType.MiniApp) {
            return 4;
        }
        if (containerType == ContainerType.Widget_3_0_Or_Weex) {
            return 5;
        }
        return containerType == ContainerType.MiniGame ? 6 : 0;
    }

    public void setFixedFrameRate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3c7432", new Object[]{this, new Boolean(z)});
            return;
        }
        f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.a(z);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private RenderMode f12320a;
        private boolean b;
        private OnCanvasErrorListener c;
        private com.taobao.android.fcanvas.integration.adapter.b d;
        private int e;
        private int f;
        private float g;
        private boolean h;
        private boolean i;
        private boolean j;
        private ContainerType k;
        private boolean l;
        private boolean m;

        static {
            kge.a(-1867931418);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e531cc4a", new Object[]{aVar})).booleanValue() : aVar.m;
        }

        public static /* synthetic */ ContainerType b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ContainerType) ipChange.ipc$dispatch("a756f3f3", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc50d4cc", new Object[]{aVar})).booleanValue() : aVar.l;
        }

        private a(b bVar) {
            this.m = false;
            this.f12320a = b.a(bVar) != null ? b.a(bVar) : RenderMode.texture;
            this.c = b.b(bVar);
            this.d = b.c(bVar);
            this.b = b.d(bVar);
            this.e = b.e(bVar);
            this.f = b.f(bVar);
            this.h = b.g(bVar);
            this.i = b.h(bVar);
            this.g = b.i(bVar);
            this.j = b.j(bVar);
            this.k = b.k(bVar);
            this.l = b.l(bVar);
            this.m = b.m(bVar);
        }

        public RenderMode a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RenderMode) ipChange.ipc$dispatch("419a9bd0", new Object[]{this}) : this.f12320a;
        }

        public com.taobao.android.fcanvas.integration.adapter.b b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.fcanvas.integration.adapter.b) ipChange.ipc$dispatch("19098379", new Object[]{this}) : this.d;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.e;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f;
        }

        public float e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.g;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.h;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.i;
        }

        public boolean h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.j;
        }
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private RenderMode f12321a;
        private boolean b;
        private OnCanvasErrorListener c;
        private com.taobao.android.fcanvas.integration.adapter.b d;
        private final int e;
        private final int f;
        private final float g;
        private boolean i;
        private boolean j;
        private ContainerType h = ContainerType.Unknown;
        private boolean k = true;
        private boolean l = true;
        private boolean m = false;

        static {
            kge.a(-1869793323);
        }

        public static /* synthetic */ RenderMode a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RenderMode) ipChange.ipc$dispatch("33b5eccd", new Object[]{bVar}) : bVar.f12321a;
        }

        public static /* synthetic */ OnCanvasErrorListener b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (OnCanvasErrorListener) ipChange.ipc$dispatch("34a57d79", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ com.taobao.android.fcanvas.integration.adapter.b c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.fcanvas.integration.adapter.b) ipChange.ipc$dispatch("4df99fb", new Object[]{bVar}) : bVar.d;
        }

        public static /* synthetic */ boolean d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfe0cd6c", new Object[]{bVar})).booleanValue() : bVar.b;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b370519c", new Object[]{bVar})).intValue() : bVar.e;
        }

        public static /* synthetic */ int f(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6ffd5dd", new Object[]{bVar})).intValue() : bVar.f;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a8f5a2f", new Object[]{bVar})).booleanValue() : bVar.i;
        }

        public static /* synthetic */ boolean h(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e1ede70", new Object[]{bVar})).booleanValue() : bVar.j;
        }

        public static /* synthetic */ float i(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("81ae629d", new Object[]{bVar})).floatValue() : bVar.g;
        }

        public static /* synthetic */ boolean j(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("753de6f2", new Object[]{bVar})).booleanValue() : bVar.k;
        }

        public static /* synthetic */ ContainerType k(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ContainerType) ipChange.ipc$dispatch("bbda824b", new Object[]{bVar}) : bVar.h;
        }

        public static /* synthetic */ boolean l(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c5cef74", new Object[]{bVar})).booleanValue() : bVar.l;
        }

        public static /* synthetic */ boolean m(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fec73b5", new Object[]{bVar})).booleanValue() : bVar.m;
        }

        public b(int i, int i2, float f) {
            this.e = Math.max(i, 0);
            this.f = Math.max(i2, 0);
            this.g = f;
        }

        public b a(RenderMode renderMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d3363c3", new Object[]{this, renderMode});
            }
            this.f12321a = renderMode;
            return this;
        }

        public b a(OnCanvasErrorListener onCanvasErrorListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7f68da02", new Object[]{this, onCanvasErrorListener});
            }
            this.c = onCanvasErrorListener;
            return this;
        }

        public b a(com.taobao.android.fcanvas.integration.adapter.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eb6871ff", new Object[]{this, bVar});
            }
            this.d = bVar;
            return this;
        }

        public b a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("307e60e7", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("240de528", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public b a(ContainerType containerType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("104013a7", new Object[]{this, containerType});
            }
            this.h = containerType;
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("179d6969", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public b e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("febc71eb", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public b f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f24bf62c", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a1918b4c", new Object[]{this}) : new a(this);
        }
    }
}
