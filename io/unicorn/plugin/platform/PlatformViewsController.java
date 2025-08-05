package io.unicorn.plugin.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.ui.m;
import io.unicorn.embedding.android.AndroidTouchProcessor;
import io.unicorn.embedding.android.UnicornImageReaderView;
import io.unicorn.embedding.android.UnicornView;
import io.unicorn.embedding.android.e;
import io.unicorn.embedding.engine.FlutterOverlaySurface;
import io.unicorn.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.unicorn.embedding.engine.mutatorsstack.UnicornMutatorView;
import io.unicorn.view.AccessibilityBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;
import tb.rti;
import tb.rtp;

/* loaded from: classes9.dex */
public class PlatformViewsController implements j {
    private AndroidTouchProcessor b;
    private Context c;
    private UnicornView d;
    private io.unicorn.view.a e;
    private rtp f;
    private int o = 0;
    private boolean p = false;
    private boolean u = false;

    /* renamed from: a  reason: collision with root package name */
    private final i f24867a = new i();
    private final a g = new a();
    private final SparseArray<UnicornImageReaderView> m = new SparseArray<>();
    private HashSet<Integer> q = new HashSet<>();
    private HashSet<Integer> r = new HashSet<>();
    private final SparseArray<PlatformViewWrapper> n = new SparseArray<>();
    private final SparseArray<f> h = new SparseArray<>();
    private final HashMap<Class<? extends f>, com.taobao.android.weex_framework.platform.c> i = new HashMap<>();
    private final SparseArray<UnicornMutatorView> l = new SparseArray<>();
    private final SparseArray<f> j = new SparseArray<>();
    private final SparseArray<Boolean> k = new SparseArray<>();
    private final io.unicorn.embedding.android.e s = io.unicorn.embedding.android.e.a();
    private e t = new e(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.unicorn.plugin.platform.PlatformViewsController$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24869a = new int[PlatformViewsMode.values().length];

        static {
            try {
                f24869a[PlatformViewsMode.TextureDisplay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24869a[PlatformViewsMode.HybridComposting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24869a[PlatformViewsMode.PunchingDisplay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24869a[PlatformViewsMode.OverlayDisplay.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public enum PlatformViewsMode {
        TextureDisplay,
        HybridComposting,
        PunchingDisplay,
        OverlayDisplay
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum UpdateType {
        UPDATE_TYPE_STYLES,
        UPDATE_TYPE_ATTRS,
        UPDATE_TYPE_EVENT
    }

    static {
        kge.a(2146409463);
        kge.a(-1085905480);
    }

    private int a(double d) {
        return (int) Math.round(d * q());
    }

    private static List<MotionEvent.PointerCoords> a(Object obj, float f, int i) {
        double[] dArr = (double[]) obj;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            int i3 = i2 * 9;
            pointerCoords.orientation = (float) dArr[i3];
            pointerCoords.pressure = (float) dArr[i3 + 1];
            pointerCoords.size = (float) dArr[i3 + 2];
            pointerCoords.toolMajor = ((float) dArr[i3 + 3]) * f;
            pointerCoords.toolMinor = ((float) dArr[i3 + 4]) * f;
            pointerCoords.touchMajor = ((float) dArr[i3 + 5]) * f;
            pointerCoords.touchMinor = ((float) dArr[i3 + 6]) * f;
            pointerCoords.x = ((float) dArr[i3 + 7]) * f;
            pointerCoords.y = ((float) dArr[i3 + 8]) * f;
            arrayList.add(pointerCoords);
        }
        return arrayList;
    }

    private static List<MotionEvent.PointerProperties> a(Object obj, int i) {
        int[] iArr = (int[]) obj;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            int i3 = i2 << 1;
            pointerProperties.id = iArr[i3];
            pointerProperties.toolType = iArr[i3 + 1];
            arrayList.add(pointerProperties);
        }
        return arrayList;
    }

    private void a(f fVar) {
        if (this.u) {
            a(fVar, 1);
            a(fVar, 2);
        }
    }

    private void a(f fVar, int i) {
        if (i == 1) {
            fVar.onActivityStart();
        } else if (i == 2) {
            fVar.onActivityResume();
        } else if (i == 3) {
            fVar.onActivityPause();
        } else if (i == 4) {
            fVar.onActivityStop();
        } else if (i != 5) {
        } else {
            fVar.onActivityDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        boolean z2 = z;
        for (int i = 0; i < this.m.size(); i++) {
            int keyAt = this.m.keyAt(i);
            UnicornImageReaderView valueAt = this.m.valueAt(i);
            if (this.q.contains(Integer.valueOf(keyAt))) {
                this.d.attachOverlaySurfaceToRender(valueAt);
                z2 &= valueAt.acquireLatestImage();
            } else {
                if (!this.p) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            int keyAt2 = this.l.keyAt(i2);
            UnicornMutatorView unicornMutatorView = this.l.get(keyAt2);
            boolean z3 = this.j.get(keyAt2) != null && this.k.get(keyAt2, false).booleanValue();
            if ((z2 || z3) && this.r.contains(Integer.valueOf(keyAt2))) {
                unicornMutatorView.setVisibility(0);
            } else {
                unicornMutatorView.setVisibility(8);
            }
        }
    }

    private int b(double d) {
        return (int) Math.round(d / q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f c(String str, int i, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        f fVar;
        g a2 = this.f24867a.a(str);
        com.taobao.android.weex_framework.platform.c cVar = null;
        if (a2 != null) {
            f a3 = a2.a(this.c, i);
            if (a3 == null) {
                HashMap<String, Object> hashMap3 = new HashMap<>();
                for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                    hashMap3.put(entry.getKey(), entry.getValue());
                }
                fVar = a2.a(this.c, i, str, hashMap, hashMap3, hashSet);
            } else {
                fVar = a3;
            }
        } else {
            fVar = null;
        }
        if (fVar == null) {
            cVar = m.b(str);
            if (cVar == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
            }
            Object a4 = cVar.a(this.c, i);
            if (a4 != null && (a4 instanceof f)) {
                fVar = (f) a4;
            }
        }
        if (fVar == null) {
            throw new IllegalStateException("Failed to create platform view: " + str);
        }
        if (fVar instanceof WeexPlatformView) {
            WeexPlatformView weexPlatformView = (WeexPlatformView) fVar;
            if (cVar == null) {
                if (this.i.containsKey(weexPlatformView.getClass())) {
                    cVar = this.i.get(weexPlatformView.getClass());
                } else {
                    cVar = new com.taobao.android.weex_framework.platform.c(weexPlatformView.getClass());
                    this.i.put(weexPlatformView.getClass(), cVar);
                }
            }
            weexPlatformView.attach(cVar, this.t);
            weexPlatformView.bindData(hashMap, hashMap2, hashSet);
        }
        fVar.onFlutterViewAttached(this.d);
        return fVar;
    }

    private void j(int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + Build.VERSION.SDK_INT + ", required API level is: " + i);
    }

    private static boolean k(int i) {
        return i == 0 || i == 1;
    }

    private void l(int i) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            a(this.h.valueAt(i2), i);
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            a(this.j.valueAt(i3), i);
        }
    }

    private float q() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    private void r() {
        while (this.h.size() > 0) {
            e(this.h.keyAt(0));
        }
        while (this.j.size() > 0) {
            f(this.j.keyAt(0));
        }
    }

    private void s() {
        if (!this.p) {
            this.d.convertToImageView();
            this.p = true;
        }
    }

    private void t() {
        if (this.d == null) {
            Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            this.d.removeView(this.m.valueAt(i));
        }
        this.m.clear();
    }

    public static void u() {
    }

    public int a(int i, int i2, double d, double d2) {
        if (PlatformViewsMode.values()[i2] == PlatformViewsMode.TextureDisplay) {
            return b(i, d, d2);
        }
        return 0;
    }

    public long a(String str, int i, int i2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        int i3 = AnonymousClass2.f24869a[PlatformViewsMode.values()[i2].ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return b(str, i, 0, hashMap, hashMap2, hashSet);
            }
            if (i3 == 3) {
                return b(str, i, hashMap, hashMap2, hashSet);
            }
            if (i3 == 4) {
                return a(str, i, hashMap, hashMap2, hashSet);
            }
            return -1L;
        }
        return c(str, i, 0, hashMap, hashMap2, hashSet);
    }

    public long a(String str, int i, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        f c = c(str, i, hashMap, hashMap2, hashSet);
        c.onFlutterViewAttached(this.d);
        this.j.put(i, c);
        this.k.put(i, false);
        a(c);
        return -1L;
    }

    public MotionEvent a(float f, rtp.a aVar, boolean z) {
        MotionEvent a2 = this.s.a(e.a.a(aVar.p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) a(aVar.f, aVar.e).toArray(new MotionEvent.PointerProperties[aVar.e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) a(aVar.g, f, aVar.e).toArray(new MotionEvent.PointerCoords[aVar.e]);
        return (z || a2 == null) ? MotionEvent.obtain(aVar.b.longValue(), aVar.c.longValue(), aVar.d, aVar.e, pointerPropertiesArr, pointerCoordsArr, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o) : MotionEvent.obtain(a2.getDownTime(), a2.getEventTime(), a2.getAction(), aVar.e, pointerPropertiesArr, pointerCoordsArr, a2.getMetaState(), a2.getButtonState(), a2.getXPrecision(), a2.getYPrecision(), a2.getDeviceId(), a2.getEdgeFlags(), a2.getSource(), a2.getFlags());
    }

    @Override // io.unicorn.plugin.platform.j
    public View a(int i) {
        f fVar = this.h.get(i);
        if (fVar == null) {
            fVar = this.j.get(i);
        }
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    public WeexValue a(int i, String str, WeexValue[] weexValueArr) {
        f fVar = this.h.get(i);
        if (fVar == null) {
            fVar = this.j.get(i);
        }
        WeexValue weexValue = null;
        if (fVar == null) {
            return null;
        }
        try {
            weexValue = ((WeexPlatformView) fVar).CallUINodeMethod(str, weexValueArr);
        } catch (Exception e) {
            Log.e("PlatformViewsController", e.getMessage());
        }
        if ("scroll".equals(str)) {
            c(i);
        }
        return weexValue;
    }

    public FlutterOverlaySurface a(UnicornImageReaderView unicornImageReaderView) {
        int i = this.o;
        this.o = i + 1;
        this.m.put(i, unicornImageReaderView);
        return new FlutterOverlaySurface(i, unicornImageReaderView.getSurface());
    }

    @Override // io.unicorn.plugin.platform.j
    public void a() {
        this.g.a(null);
    }

    public void a(int i, double d, double d2) {
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
            return;
        }
        int a2 = a(d);
        int a3 = a(d2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
        layoutParams.topMargin = a2;
        layoutParams.leftMargin = a3;
        platformViewWrapper.setLayoutParams(layoutParams);
    }

    public void a(int i, int i2) {
        PlatformViewsMode platformViewsMode = PlatformViewsMode.values()[i2];
        if (platformViewsMode == PlatformViewsMode.HybridComposting || platformViewsMode == PlatformViewsMode.TextureDisplay) {
            e(i);
        } else if (platformViewsMode != PlatformViewsMode.PunchingDisplay && platformViewsMode != PlatformViewsMode.OverlayDisplay) {
        } else {
            f(i);
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        if (this.m.get(i) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
        }
        s();
        UnicornImageReaderView unicornImageReaderView = this.m.get(i);
        if (unicornImageReaderView.getParent() == null) {
            this.d.addView(unicornImageReaderView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        unicornImageReaderView.setLayoutParams(layoutParams);
        unicornImageReaderView.setVisibility(0);
        unicornImageReaderView.bringToFront();
        this.q.add(Integer.valueOf(i));
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack, int i8) {
        f fVar = this.h.get(i);
        if (fVar == null) {
            f fVar2 = this.j.get(i);
            if (fVar2 == null) {
                return;
            }
            UnicornView unicornView = this.d;
            if (unicornView != null) {
                unicornView.setRenderSurfaceOpaque(false);
            }
            i(i);
            UnicornMutatorView unicornMutatorView = this.l.get(i);
            unicornMutatorView.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
            unicornMutatorView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
            View view = fVar2.getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
            }
            if (i8 <= 0) {
                return;
            }
            this.r.add(Integer.valueOf(i));
            return;
        }
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper != null) {
            platformViewWrapper.tryToFinishToTexture(i8);
            platformViewWrapper.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i7);
            View view2 = fVar.getView();
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
            return;
        }
        s();
        h(i);
        UnicornMutatorView unicornMutatorView2 = this.l.get(i);
        unicornMutatorView2.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
        unicornMutatorView2.setVisibility(0);
        unicornMutatorView2.bringToFront();
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i6, i7);
        View view3 = this.h.get(i).getView();
        if (view3 != null) {
            view3.setLayoutParams(layoutParams3);
            view3.bringToFront();
        }
        this.r.add(Integer.valueOf(i));
    }

    public void a(int i, HashMap<String, String> hashMap, int i2) {
        UpdateType updateType = UpdateType.values()[i2];
        f fVar = this.h.get(i);
        if (fVar == null) {
            fVar = this.j.get(i);
        }
        if (fVar == null) {
            return;
        }
        try {
            if (!(fVar instanceof WeexPlatformView)) {
                if (updateType == UpdateType.UPDATE_TYPE_EVENT) {
                    return;
                }
                fVar.onUpdateAttrs(hashMap);
                return;
            }
            WeexPlatformView weexPlatformView = (WeexPlatformView) fVar;
            if (updateType == UpdateType.UPDATE_TYPE_ATTRS) {
                weexPlatformView.onUpdateAttrs(hashMap);
            } else if (updateType == UpdateType.UPDATE_TYPE_STYLES) {
                weexPlatformView.onUpdateStyles(hashMap);
            } else if (updateType == UpdateType.UPDATE_TYPE_EVENT) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    if ("0".equals(entry.getValue())) {
                        weexPlatformView.onRemoveEvent(entry.getKey());
                    } else {
                        weexPlatformView.onAddEvent(entry.getKey());
                    }
                }
            }
        } catch (Exception e) {
            Log.e("PlatformViewsController", e.getMessage());
        }
    }

    public void a(Context context, io.unicorn.view.a aVar, rti rtiVar) {
        if (this.c == null) {
            this.c = context;
            this.e = aVar;
            this.f = new rtp(rtiVar);
            this.t.a(this.f);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void a(WeexInstance weexInstance) {
        this.t.a(weexInstance);
    }

    public void a(UnicornView unicornView) {
        this.d = unicornView;
        for (int i = 0; i < this.h.size(); i++) {
            this.h.valueAt(i).onFlutterViewAttached(this.d);
        }
    }

    public void a(io.unicorn.embedding.engine.renderer.a aVar) {
        this.b = new AndroidTouchProcessor(aVar, true);
    }

    @Override // io.unicorn.plugin.platform.j
    public void a(AccessibilityBridge accessibilityBridge) {
        this.g.a(accessibilityBridge);
    }

    public void a(rtp.a aVar) {
        MotionEvent a2;
        View view;
        try {
            int i = aVar.f33372a;
            float f = this.c.getResources().getDisplayMetrics().density;
            j(20);
            if (this.h.get(i) != null) {
                a2 = a(f, aVar, false);
                if (a2 == null) {
                    Log.e("PlatformView", "MotionEvent is null");
                    return;
                }
                view = this.h.get(aVar.f33372a).getView();
                if (view == null) {
                    return;
                }
            } else if (this.j.get(i) == null) {
                Log.e("PlatformView", "Sending touch to an unknown view with id:" + i);
                return;
            } else {
                a2 = a(f, aVar, false);
                view = this.j.get(aVar.f33372a).getView();
                if (view == null) {
                    return;
                }
            }
            view.dispatchTouchEvent(a2);
        } catch (Exception e) {
            Log.e("PlatformView", e.getMessage());
        }
    }

    public int b(int i, double d, double d2) {
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper == null) {
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i);
            return 0;
        }
        int a2 = a(d);
        int a3 = a(d2);
        if (a2 > platformViewWrapper.getBufferWidth() || a3 > platformViewWrapper.getBufferHeight()) {
            platformViewWrapper.setBufferSize(a2, a3);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
        layoutParams.width = a2;
        layoutParams.height = a3;
        platformViewWrapper.setLayoutParams(layoutParams);
        return ((b(platformViewWrapper.getBufferWidth()) & 65535) << 16) | (b(platformViewWrapper.getBufferHeight()) & 65535);
    }

    public long b(String str, int i, int i2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        j(19);
        if (k(i2)) {
            f c = c(str, i, hashMap, hashMap2, hashSet);
            c.getView().setLayoutDirection(i2);
            this.h.put(i, c);
            a(c);
            return -1L;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + i + riy.BRACKET_END_STR);
    }

    public long b(String str, int i, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        f c = c(str, i, hashMap, hashMap2, hashSet);
        c.onFlutterViewAttached(this.d);
        this.j.put(i, c);
        this.k.put(i, true);
        a(c);
        this.d.setBackgroundColor(-1);
        return -1L;
    }

    public void b() {
        this.t.a((rtp) null);
        rtp rtpVar = this.f;
        if (rtpVar != null) {
            rtpVar.a(null);
            this.f = null;
        }
        j();
        this.c = null;
        this.e = null;
    }

    @Override // io.unicorn.plugin.platform.j
    public boolean b(int i) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c(java.lang.String r22, int r23, int r24, java.util.HashMap<java.lang.String, java.lang.String> r25, java.util.HashMap<java.lang.String, java.lang.String> r26, java.util.HashSet<java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.plugin.platform.PlatformViewsController.c(java.lang.String, int, int, java.util.HashMap, java.util.HashMap, java.util.HashSet):long");
    }

    public void c() {
        for (int i = 0; i < this.h.size(); i++) {
            this.h.get(this.h.keyAt(i)).onFlutterViewDetached();
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.j.get(this.j.keyAt(i2)).onFlutterViewDetached();
        }
        j();
        t();
        r();
        this.d = null;
        this.p = false;
    }

    public void c(int i) {
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper == null || !platformViewWrapper.isCanAutoSwitch()) {
            return;
        }
        platformViewWrapper.switchToPunching();
    }

    public h d() {
        return this.f24867a;
    }

    public void d(int i) {
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper == null || !platformViewWrapper.isCanAutoSwitch()) {
            return;
        }
        platformViewWrapper.switchToTexture();
    }

    public void e() {
        r();
    }

    public void e(int i) {
        f fVar = this.h.get(i);
        if (fVar != null) {
            if (fVar instanceof WeexPlatformView) {
                this.i.remove(fVar.getClass());
            }
            ViewGroup viewGroup = (ViewGroup) fVar.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(fVar.getView());
            }
            this.h.remove(i);
            fVar.dispose();
        }
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper != null) {
            platformViewWrapper.release();
            platformViewWrapper.unsetOnDescendantFocusChangeListener();
            ViewGroup viewGroup2 = (ViewGroup) platformViewWrapper.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(platformViewWrapper);
            }
            this.n.remove(i);
            return;
        }
        UnicornMutatorView unicornMutatorView = this.l.get(i);
        if (unicornMutatorView == null) {
            return;
        }
        unicornMutatorView.unsetOnDescendantFocusChangeListener();
        ViewGroup viewGroup3 = (ViewGroup) unicornMutatorView.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeView(unicornMutatorView);
        }
        this.l.remove(i);
    }

    public void f() {
        r();
    }

    public void f(int i) {
        f fVar = this.j.get(i);
        if (fVar != null) {
            if (fVar instanceof WeexPlatformView) {
                this.i.remove(fVar.getClass());
            }
            ViewGroup viewGroup = (ViewGroup) fVar.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(fVar.getView());
            }
            this.j.remove(i);
            this.k.remove(i);
            fVar.dispose();
        }
        UnicornMutatorView unicornMutatorView = this.l.get(i);
        if (unicornMutatorView != null) {
            ViewGroup viewGroup2 = (ViewGroup) unicornMutatorView.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(unicornMutatorView);
            }
            this.l.remove(i);
        }
        if (this.d == null || this.j.size() != 0) {
            return;
        }
        this.d.setRenderSurfaceOpaque(true);
    }

    public f g(int i) {
        f fVar = this.h.get(i);
        return fVar == null ? this.j.get(i) : fVar;
    }

    public void g() {
        this.q.clear();
        this.r.clear();
    }

    public void h() {
        boolean z = false;
        if (this.p && this.r.isEmpty()) {
            this.p = false;
            this.d.revertImageView(new Runnable() { // from class: io.unicorn.plugin.platform.PlatformViewsController.1
                @Override // java.lang.Runnable
                public void run() {
                    PlatformViewsController.this.a(false);
                }
            });
            return;
        }
        if (this.p && this.d.acquireLatestImageViewFrame()) {
            z = true;
        }
        a(z);
    }

    void h(int i) {
        f fVar = this.h.get(i);
        if (fVar != null) {
            if (this.l.get(i) != null) {
                return;
            }
            if (fVar.getView() == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (fVar.getView().getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Context context = this.c;
            UnicornMutatorView unicornMutatorView = new UnicornMutatorView(context, context.getResources().getDisplayMetrics().density, this.b);
            this.l.put(i, unicornMutatorView);
            unicornMutatorView.addView(fVar.getView());
            this.d.addView(unicornMutatorView);
            return;
        }
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }

    public FlutterOverlaySurface i() {
        return a(new UnicornImageReaderView(this.d.getContext(), this.d.getWidth(), this.d.getHeight(), UnicornImageReaderView.SurfaceKind.overlay));
    }

    void i(int i) {
        f fVar = this.j.get(i);
        if (fVar != null) {
            if (this.l.get(i) != null) {
                return;
            }
            if (fVar.getView() == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (fVar.getView().getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Context context = this.c;
            UnicornMutatorView unicornMutatorView = new UnicornMutatorView(context, context.getResources().getDisplayMetrics().density, this.b);
            this.l.put(i, unicornMutatorView);
            unicornMutatorView.addView(fVar.getView());
            if (!this.k.get(i).booleanValue()) {
                this.d.addView(unicornMutatorView);
                return;
            }
            int childCount = this.d.getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                if (this.d.getChildAt(i3) instanceof UnicornMutatorView) {
                    i2++;
                }
            }
            this.d.addView(unicornMutatorView, i2);
            return;
        }
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }

    public void j() {
        for (int i = 0; i < this.m.size(); i++) {
            UnicornImageReaderView valueAt = this.m.valueAt(i);
            valueAt.detachFromRenderer();
            valueAt.closeImageReader();
        }
    }

    public void k() {
        for (int i = 0; i < this.n.size(); i++) {
            this.n.valueAt(i).invalidateSurface();
        }
    }

    public void l() {
        l(1);
        for (int i = 0; i < this.n.size(); i++) {
            this.n.valueAt(i).viewInvalidate();
        }
    }

    public void m() {
        this.u = false;
        l(3);
    }

    public void m(int i) {
        View view;
        f fVar = this.j.get(i);
        if (fVar == null || (view = fVar.getView()) == null || view.getParent() == null) {
            return;
        }
        ((View) view.getParent()).setVisibility(8);
    }

    public void n() {
        this.u = true;
        l(2);
    }

    public void o() {
        l(4);
    }

    public void p() {
        l(5);
    }
}
