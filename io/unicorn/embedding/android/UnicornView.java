package io.unicorn.embedding.android;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.taobao.android.weex_framework.util.l;
import com.taobao.android.weex_framework.util.s;
import com.taobao.android.weex_framework.util.t;
import io.unicorn.embedding.android.UnicornImageReaderView;
import io.unicorn.embedding.engine.renderer.a;
import io.unicorn.view.AccessibilityBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.kge;
import tb.rtd;
import tb.xmp;

/* loaded from: classes9.dex */
public class UnicornView extends FrameLayout {
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private AndroidTouchProcessor androidTouchProcessor;
    private io.unicorn.embedding.engine.a flutterEngine;
    private final Set<a> flutterEngineAttachmentListeners;
    private final io.unicorn.embedding.engine.renderer.b flutterUiDisplayListener;
    private final Set<io.unicorn.embedding.engine.renderer.b> flutterUiDisplayListeners;
    private boolean isFlutterUiDisplayed;
    private View mCurEditTextFocusView;
    private boolean mEnableFixSurfaceToHybrid;
    private xmp mWeexUnicornListener;
    private final AccessibilityBridge.c onAccessibilityChangeListener;
    private View.OnTouchListener onTouchListener;
    private final Runnable onTransitionComplete;
    private io.unicorn.embedding.engine.renderer.c previousRenderSurface;
    private io.unicorn.embedding.engine.renderer.c renderSurface;
    private View splashScreenView;
    private UnicornImageReaderView unicornImageReaderView;
    private UnicornImageView unicornImageView;
    private i unicornSurfaceTexture;
    private UnicornSurfaceView unicornSurfaceView;
    private UnicornTextureView unicornTextureView;
    private final a.c viewportMetrics;

    @Deprecated
    /* loaded from: classes9.dex */
    public enum RenderMode {
        surface,
        texture,
        image
    }

    @Deprecated
    /* loaded from: classes9.dex */
    public enum TransparencyMode {
        opaque,
        transparent
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    /* loaded from: classes9.dex */
    public interface a {
    }

    static {
        kge.a(-517250171);
    }

    public UnicornView(Context context) {
        this(context, (AttributeSet) null, new UnicornSurfaceView(context, null, false));
    }

    public UnicornView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new UnicornSurfaceView(context, null, false));
    }

    private UnicornView(Context context, AttributeSet attributeSet, UnicornSurfaceView unicornSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixSurfaceToHybrid = com.taobao.android.weex_framework.util.f.s();
        this.viewportMetrics = new a.c();
        this.onAccessibilityChangeListener = new AccessibilityBridge.c() { // from class: io.unicorn.embedding.android.UnicornView.1
            @Override // io.unicorn.view.AccessibilityBridge.c
            public void a(boolean z, boolean z2) {
                UnicornView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.2
            @Override // io.unicorn.embedding.engine.renderer.b
            public void a() {
                UnicornView.this.isFlutterUiDisplayed = true;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.a();
                }
            }

            @Override // io.unicorn.embedding.engine.renderer.b
            public void b() {
                UnicornView.this.isFlutterUiDisplayed = false;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.b();
                }
            }
        };
        this.onTransitionComplete = new Runnable() { // from class: io.unicorn.embedding.android.UnicornView.4
            @Override // java.lang.Runnable
            public void run() {
                if (UnicornView.this.splashScreenView != null) {
                    UnicornView unicornView = UnicornView.this;
                    unicornView.removeView(unicornView.splashScreenView);
                }
            }
        };
        this.unicornSurfaceView = unicornSurfaceView;
        this.renderSurface = unicornSurfaceView;
        init();
    }

    private UnicornView(Context context, AttributeSet attributeSet, UnicornTextureView unicornTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixSurfaceToHybrid = com.taobao.android.weex_framework.util.f.s();
        this.viewportMetrics = new a.c();
        this.onAccessibilityChangeListener = new AccessibilityBridge.c() { // from class: io.unicorn.embedding.android.UnicornView.1
            @Override // io.unicorn.view.AccessibilityBridge.c
            public void a(boolean z, boolean z2) {
                UnicornView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.2
            @Override // io.unicorn.embedding.engine.renderer.b
            public void a() {
                UnicornView.this.isFlutterUiDisplayed = true;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.a();
                }
            }

            @Override // io.unicorn.embedding.engine.renderer.b
            public void b() {
                UnicornView.this.isFlutterUiDisplayed = false;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.b();
                }
            }
        };
        this.onTransitionComplete = new Runnable() { // from class: io.unicorn.embedding.android.UnicornView.4
            @Override // java.lang.Runnable
            public void run() {
                if (UnicornView.this.splashScreenView != null) {
                    UnicornView unicornView = UnicornView.this;
                    unicornView.removeView(unicornView.splashScreenView);
                }
            }
        };
        this.unicornTextureView = unicornTextureView;
        this.renderSurface = unicornTextureView;
        init();
    }

    public UnicornView(Context context, UnicornImageView unicornImageView) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixSurfaceToHybrid = com.taobao.android.weex_framework.util.f.s();
        this.viewportMetrics = new a.c();
        this.onAccessibilityChangeListener = new AccessibilityBridge.c() { // from class: io.unicorn.embedding.android.UnicornView.1
            @Override // io.unicorn.view.AccessibilityBridge.c
            public void a(boolean z, boolean z2) {
                UnicornView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.2
            @Override // io.unicorn.embedding.engine.renderer.b
            public void a() {
                UnicornView.this.isFlutterUiDisplayed = true;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.a();
                }
            }

            @Override // io.unicorn.embedding.engine.renderer.b
            public void b() {
                UnicornView.this.isFlutterUiDisplayed = false;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.b();
                }
            }
        };
        this.onTransitionComplete = new Runnable() { // from class: io.unicorn.embedding.android.UnicornView.4
            @Override // java.lang.Runnable
            public void run() {
                if (UnicornView.this.splashScreenView != null) {
                    UnicornView unicornView = UnicornView.this;
                    unicornView.removeView(unicornView.splashScreenView);
                }
            }
        };
        this.unicornImageView = unicornImageView;
        this.renderSurface = unicornImageView;
        init();
    }

    public UnicornView(Context context, UnicornSurfaceView unicornSurfaceView) {
        this(context, (AttributeSet) null, unicornSurfaceView);
    }

    public UnicornView(Context context, UnicornTextureView unicornTextureView) {
        this(context, (AttributeSet) null, unicornTextureView);
    }

    @Deprecated
    public UnicornView(Context context, TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new UnicornSurfaceView(context, null, transparencyMode == TransparencyMode.transparent));
    }

    public UnicornView(Context context, i iVar) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixSurfaceToHybrid = com.taobao.android.weex_framework.util.f.s();
        this.viewportMetrics = new a.c();
        this.onAccessibilityChangeListener = new AccessibilityBridge.c() { // from class: io.unicorn.embedding.android.UnicornView.1
            @Override // io.unicorn.view.AccessibilityBridge.c
            public void a(boolean z, boolean z2) {
                UnicornView.this.resetWillNotDraw(z, z2);
            }
        };
        this.flutterUiDisplayListener = new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.2
            @Override // io.unicorn.embedding.engine.renderer.b
            public void a() {
                UnicornView.this.isFlutterUiDisplayed = true;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.a();
                }
            }

            @Override // io.unicorn.embedding.engine.renderer.b
            public void b() {
                UnicornView.this.isFlutterUiDisplayed = false;
                for (io.unicorn.embedding.engine.renderer.b bVar : UnicornView.this.flutterUiDisplayListeners) {
                    bVar.b();
                }
            }
        };
        this.onTransitionComplete = new Runnable() { // from class: io.unicorn.embedding.android.UnicornView.4
            @Override // java.lang.Runnable
            public void run() {
                if (UnicornView.this.splashScreenView != null) {
                    UnicornView unicornView = UnicornView.this;
                    unicornView.removeView(unicornView.splashScreenView);
                }
            }
        };
        this.unicornSurfaceTexture = iVar;
        this.renderSurface = this.unicornSurfaceTexture;
    }

    private ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? ZeroSides.LEFT : ZeroSides.RIGHT;
            } else if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    private void clearForceInput(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View view = this.mCurEditTextFocusView;
            if (!isShouldHideInput(view, motionEvent.getX(), motionEvent.getY())) {
                return;
            }
            view.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroySurfaceView() {
        postDelayed(new Runnable() { // from class: io.unicorn.embedding.android.UnicornView.7
            @Override // java.lang.Runnable
            public void run() {
                if (UnicornView.this.unicornSurfaceView == null || UnicornView.this.renderSurface == UnicornView.this.unicornSurfaceView) {
                    return;
                }
                UnicornView unicornView = UnicornView.this;
                unicornView.removeView(unicornView.unicornSurfaceView);
                UnicornView.this.unicornSurfaceView = null;
            }
        }, 30L);
    }

    private View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        int i2;
        Method declaredMethod;
        try {
            i2 = 0;
            declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, new Object[0]).equals(Integer.valueOf(i))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, viewGroup.getChildAt(i2));
                if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                    return findViewByAccessibilityIdRootedAtCurrentView;
                }
                i2++;
            }
        }
        return null;
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        View view;
        rtd.a(TAG, "Initializing FlutterView");
        if (this.unicornSurfaceView != null) {
            rtd.a(TAG, "Internally using a FlutterSurfaceView.");
            view = this.unicornSurfaceView;
        } else if (this.unicornTextureView != null) {
            rtd.a(TAG, "Internally using a FlutterTextureView.");
            view = this.unicornTextureView;
        } else if (this.unicornImageView != null) {
            rtd.a(TAG, "Internally using a UnicornImageView.");
            view = this.unicornImageView;
        } else {
            rtd.a(TAG, "Internally using a FlutterImageView.");
            view = this.unicornImageReaderView;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    private boolean isShouldHideInput(View view, float f, float f2) {
        if (view instanceof EditText) {
            int[] iArr = {0, 0};
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            return f <= ((float) i) || f >= ((float) (view.getWidth() + i)) || f2 <= ((float) i2) || f2 >= ((float) (view.getHeight() + i2));
        }
        return false;
    }

    private boolean isSplashScreenNeededNow() {
        return !hasRenderedFirstFrame();
    }

    public static void preloadClass() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWillNotDraw(boolean z, boolean z2) {
        setWillNotDraw(!z && !z2);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            rtd.d(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.f24840a = getResources().getDisplayMetrics().density;
        this.flutterEngine.e().a(this.viewportMetrics);
    }

    private void setFlutterViewFocusable() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    private void updateViewportPadding() {
        if (Build.VERSION.SDK_INT < 19 || !isAttachedToWindow()) {
            if (getResources() == null || getResources().getDisplayMetrics() == null) {
                return;
            }
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.viewportMetrics.g = displayMetrics.widthPixels;
            this.viewportMetrics.d = displayMetrics.heightPixels;
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        a.c cVar = this.viewportMetrics;
        cVar.g = iArr[0];
        cVar.d = iArr[1];
        Rect rect = new Rect();
        boolean globalVisibleRect = getGlobalVisibleRect(rect);
        int height = rect.height();
        int g = l.g(getContext()) - (this.viewportMetrics.d + height);
        if (height == 0 || !globalVisibleRect || g < 0) {
            this.viewportMetrics.d = l.g(getContext());
            this.viewportMetrics.f = 0;
        } else {
            this.viewportMetrics.f = g;
        }
        if (!globalVisibleRect || rect.width() != getMeasuredWidth()) {
            return;
        }
        this.viewportMetrics.g = 0;
    }

    public boolean acquireLatestImageViewFrame() {
        UnicornImageReaderView unicornImageReaderView = this.unicornImageReaderView;
        if (unicornImageReaderView != null) {
            return unicornImageReaderView.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(a aVar) {
        this.flutterEngineAttachmentListeners.add(aVar);
    }

    public void addOnFirstFrameRenderedListener(io.unicorn.embedding.engine.renderer.b bVar) {
        this.flutterUiDisplayListeners.add(bVar);
    }

    public void attachOverlaySurfaceToRender(UnicornImageReaderView unicornImageReaderView) {
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar != null) {
            unicornImageReaderView.attachToRenderer(aVar.e());
        }
    }

    public void attachToFlutterEngine(io.unicorn.embedding.engine.a aVar) {
        s.a("attachToFlutterEngine");
        rtd.a(TAG, "Attaching to a FlutterEngine: " + aVar);
        if (isAttachedToFlutterEngine()) {
            if (aVar == this.flutterEngine) {
                rtd.a(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                rtd.a(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = aVar;
        io.unicorn.embedding.engine.renderer.a e = this.flutterEngine.e();
        this.isFlutterUiDisplayed = e.a();
        s.a("attachToRenderer");
        this.renderSurface.attachToRenderer(e);
        s.b("attachToRenderer");
        e.a(this.flutterUiDisplayListener);
        s.a("newAndroidTouchProcessor");
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.e(), false);
        s.b("newAndroidTouchProcessor");
        s.a("newAccessibilityBridge");
        this.accessibilityBridge = new AccessibilityBridge(this, aVar.g(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.flutterEngine.j());
        this.accessibilityBridge.a(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.b(), this.accessibilityBridge.c());
        this.flutterEngine.j().a(this.accessibilityBridge);
        s.b("newAccessibilityBridge");
        this.flutterEngine.j().a(this.flutterEngine.e());
        sendUserSettingsToFlutter();
        sendViewportMetricsToFlutter();
        aVar.j().a(this);
        Iterator<a> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.a();
        }
        s.b("attachToFlutterEngine");
    }

    public void clearCurEditTextFocusView(View view) {
        if (this.mCurEditTextFocusView == view) {
            this.mCurEditTextFocusView = null;
        }
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        if (this.unicornImageReaderView == null) {
            this.unicornImageReaderView = createImageView();
            addView(this.unicornImageReaderView);
        } else {
            int width = getWidth();
            int height = getHeight();
            if (width <= 0) {
                width = this.viewportMetrics.b;
            }
            if (height <= 0) {
                height = this.viewportMetrics.c;
            }
            this.unicornImageReaderView.resizeIfNeeded(width, height);
        }
        this.previousRenderSurface = this.renderSurface;
        this.renderSurface = this.unicornImageReaderView;
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar != null) {
            this.renderSurface.attachToRenderer(aVar.e());
            io.unicorn.embedding.engine.renderer.c cVar = this.previousRenderSurface;
            if (cVar instanceof UnicornTextureView) {
                if (((UnicornTextureView) cVar).isOpaque()) {
                    return;
                }
                post(new Runnable() { // from class: io.unicorn.embedding.android.UnicornView.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (UnicornView.this.previousRenderSurface != null) {
                            ((UnicornTextureView) UnicornView.this.previousRenderSurface).setAlpha(0.0f);
                        }
                    }
                });
            } else if (!this.mEnableFixSurfaceToHybrid || !(cVar instanceof UnicornSurfaceView) || !((UnicornSurfaceView) cVar).getRenderTransparently()) {
            } else {
                post(new Runnable() { // from class: io.unicorn.embedding.android.UnicornView.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (UnicornView.this.previousRenderSurface != null) {
                            ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setAlpha(0.0f);
                            ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setZOrderOnTop(false);
                            ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setVisibility(8);
                            ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setVisibility(0);
                        }
                    }
                });
            }
        }
    }

    public void convertToOffScreenSurface() {
        UnicornImageView unicornImageView = this.unicornImageView;
        if (unicornImageView == null || this.renderSurface != unicornImageView) {
            return;
        }
        unicornImageView.stopRendering();
    }

    public void convertToOnScreenSurface() {
        UnicornImageView unicornImageView = this.unicornImageView;
        if (unicornImageView == null || this.renderSurface != unicornImageView) {
            return;
        }
        this.unicornImageView.startRendering(getWidth(), getHeight());
        this.flutterEngine.h().b();
    }

    public void convertToSurfaceView() {
        String str;
        if (!(this.renderSurface instanceof UnicornTextureView)) {
            str = "Tried to convert to the surface view, but no texture view is used.";
        } else {
            io.unicorn.embedding.engine.a aVar = this.flutterEngine;
            if (aVar == null || aVar.e() == null) {
                str = "Tried to convert to the surface view, but flutterEngine is null.";
            } else {
                this.renderSurface.pause();
                if (this.unicornSurfaceView == null) {
                    this.unicornSurfaceView = new UnicornSurfaceView(getContext(), false);
                    addView(this.unicornSurfaceView);
                }
                this.renderSurface = this.unicornSurfaceView;
                final io.unicorn.embedding.engine.renderer.a e = this.flutterEngine.e();
                e.d();
                this.renderSurface.attachToRenderer(e);
                e.a(new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.5
                    @Override // io.unicorn.embedding.engine.renderer.b
                    public void a() {
                        e.b(this);
                        if (UnicornView.this.unicornTextureView != null) {
                            UnicornView unicornView = UnicornView.this;
                            unicornView.removeView(unicornView.unicornTextureView);
                            UnicornView.this.unicornTextureView = null;
                        }
                    }

                    @Override // io.unicorn.embedding.engine.renderer.b
                    public void b() {
                    }
                });
                str = "Convert to SurfaceView!";
            }
        }
        rtd.b(TAG, str);
    }

    public void convertToTextureView() {
        String str;
        if (!(this.renderSurface instanceof UnicornSurfaceView)) {
            str = "Tried to surface the texture view, but no surface view is used.";
        } else {
            io.unicorn.embedding.engine.a aVar = this.flutterEngine;
            if (aVar == null || aVar.e() == null) {
                str = "Tried to convert to the surface view, but flutterEngine is null.";
            } else {
                this.renderSurface.pause();
                if (this.unicornTextureView == null) {
                    this.unicornTextureView = new UnicornTextureView(getContext());
                    addView(this.unicornTextureView);
                }
                this.unicornTextureView.setOpaque(false);
                this.renderSurface = this.unicornTextureView;
                final io.unicorn.embedding.engine.renderer.a e = this.flutterEngine.e();
                e.d();
                this.renderSurface.attachToRenderer(e);
                e.a(new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.6
                    @Override // io.unicorn.embedding.engine.renderer.b
                    public void a() {
                        UnicornView.this.unicornTextureView.setOpaque(true);
                        e.b(this);
                        UnicornView.this.destroySurfaceView();
                    }

                    @Override // io.unicorn.embedding.engine.renderer.b
                    public void b() {
                    }
                });
                str = "Convert to TextureView!";
            }
        }
        rtd.b(TAG, str);
    }

    public UnicornImageReaderView createImageView() {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0) {
            width = this.viewportMetrics.b;
        }
        if (height <= 0) {
            height = this.viewportMetrics.c;
        }
        return new UnicornImageReaderView(getContext(), width, height, UnicornImageReaderView.SurfaceKind.background);
    }

    public void detachFromFlutterEngine() {
        rtd.a(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
        if (!isAttachedToFlutterEngine()) {
            rtd.a(TAG, "Not attached to an engine. Doing nothing.");
            return;
        }
        Iterator<a> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.flutterEngine.j().c();
        this.flutterEngine.j().a();
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge != null) {
            accessibilityBridge.a();
            this.accessibilityBridge = null;
        }
        io.unicorn.embedding.engine.renderer.a e = this.flutterEngine.e();
        this.isFlutterUiDisplayed = false;
        e.b(this.flutterUiDisplayListener);
        e.c();
        e.a(false);
        io.unicorn.embedding.engine.renderer.c cVar = this.previousRenderSurface;
        if (cVar != null && this.renderSurface == this.unicornImageReaderView) {
            this.renderSurface = cVar;
        }
        this.renderSurface.detachFromRenderer();
        UnicornImageReaderView unicornImageReaderView = this.unicornImageReaderView;
        if (unicornImageReaderView != null) {
            unicornImageReaderView.closeImageReader();
            removeView(this.unicornImageReaderView);
            this.unicornImageReaderView = null;
        }
        UnicornImageView unicornImageView = this.unicornImageView;
        if (unicornImageView != null) {
            unicornImageView.closeImageReader();
            this.unicornImageView = null;
        }
        i iVar = this.unicornSurfaceTexture;
        if (iVar != null) {
            iVar.b();
            this.unicornSurfaceTexture = null;
        }
        this.previousRenderSurface = null;
        this.flutterEngine = null;
    }

    public View findViewByAccessibilityIdTraversal(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return findViewByAccessibilityIdRootedAtCurrentView(i, this);
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (View) declaredMethod.invoke(this, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT <= 19) {
            this.viewportMetrics.d = rect.top;
            this.viewportMetrics.e = rect.right;
            a.c cVar = this.viewportMetrics;
            cVar.f = 0;
            cVar.g = rect.left;
            a.c cVar2 = this.viewportMetrics;
            cVar2.h = 0;
            cVar2.i = 0;
            cVar2.j = rect.bottom;
            this.viewportMetrics.k = 0;
            rtd.a(TAG, "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.viewportMetrics.d + ", Left: " + this.viewportMetrics.g + ", Right: " + this.viewportMetrics.e + "\nKeyboard insets: Bottom: " + this.viewportMetrics.j + ", Left: " + this.viewportMetrics.k + ", Right: " + this.viewportMetrics.i);
            sendViewportMetricsToFlutter();
            return true;
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null || !accessibilityBridge.b()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public io.unicorn.embedding.engine.a getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    public PointerIcon getSystemPointerIcon(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public void invalidRenderSurface() {
        io.unicorn.embedding.engine.renderer.c cVar = this.renderSurface;
        if (cVar != null) {
            cVar.invalid();
        }
    }

    public boolean isAttachedToFlutterEngine() {
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        return aVar != null && aVar.e() == this.renderSurface.getAttachedRenderer();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (Build.VERSION.SDK_INT == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            this.viewportMetrics.l = systemGestureInsets.top;
            this.viewportMetrics.m = systemGestureInsets.right;
            this.viewportMetrics.n = systemGestureInsets.bottom;
            this.viewportMetrics.o = systemGestureInsets.left;
        }
        boolean z = true;
        int i = 0;
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (z) {
                i = 0 | WindowInsets.Type.navigationBars();
            }
            if (z2) {
                i |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i);
            this.viewportMetrics.d = insets.top;
            this.viewportMetrics.e = insets.right;
            this.viewportMetrics.f = insets.bottom;
            this.viewportMetrics.g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            this.viewportMetrics.h = insets2.top;
            this.viewportMetrics.i = insets2.right;
            this.viewportMetrics.j = insets2.bottom;
            this.viewportMetrics.k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            this.viewportMetrics.l = insets3.top;
            this.viewportMetrics.m = insets3.right;
            this.viewportMetrics.n = insets3.bottom;
            this.viewportMetrics.o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.c cVar = this.viewportMetrics;
                cVar.d = Math.max(Math.max(cVar.d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.c cVar2 = this.viewportMetrics;
                cVar2.e = Math.max(Math.max(cVar2.e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.c cVar3 = this.viewportMetrics;
                cVar3.f = Math.max(Math.max(cVar3.f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.c cVar4 = this.viewportMetrics;
                cVar4.g = Math.max(Math.max(cVar4.g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z) {
                zeroSides = calculateShouldZeroSides();
            }
            this.viewportMetrics.d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.viewportMetrics.e = (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            a.c cVar5 = this.viewportMetrics;
            cVar5.f = 0;
            cVar5.g = (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.c cVar6 = this.viewportMetrics;
            cVar6.h = 0;
            cVar6.i = 0;
            cVar6.j = z ? windowInsets.getSystemWindowInsetBottom() : guessBottomKeyboardInset(windowInsets);
            this.viewportMetrics.k = 0;
        }
        rtd.a(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.d + ", Left: " + this.viewportMetrics.g + ", Right: " + this.viewportMetrics.e + "\nKeyboard insets: Bottom: " + this.viewportMetrics.j + ", Left: " + this.viewportMetrics.k + ", Right: " + this.viewportMetrics.i + "System Gesture Insets - Left: " + this.viewportMetrics.o + ", Top: " + this.viewportMetrics.l + ", Right: " + this.viewportMetrics.m + ", Bottom: " + this.viewportMetrics.j);
        updateViewportPadding();
        sendViewportMetricsToFlutter();
        return onApplyWindowInsets;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            rtd.a(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            sendUserSettingsToFlutter();
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine() && this.androidTouchProcessor.b(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onHoverEvent(motionEvent);
        }
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge != null) {
            return accessibilityBridge.a(motionEvent);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return !isAttachedToFlutterEngine() ? super.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return !isAttachedToFlutterEngine() ? super.onKeyUp(i, keyEvent) : super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        rtd.a(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        a.c cVar = this.viewportMetrics;
        cVar.b = i;
        cVar.c = i2;
        updateViewportPadding();
        sendViewportMetricsToFlutter();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        View.OnTouchListener onTouchListener = this.onTouchListener;
        if (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) {
            return true;
        }
        clearForceInput(motionEvent);
        if (this.mWeexUnicornListener != null && motionEvent.getAction() != 2) {
            this.mWeexUnicornListener.a("actionType:" + motionEvent.getAction() + ",x:" + motionEvent.getRawX() + ",y:" + motionEvent.getRawY());
        }
        t.a(1, "onTouch", motionEvent, this);
        return this.androidTouchProcessor.a(motionEvent);
    }

    public void registerEditTextFocusView(View view) {
        this.mCurEditTextFocusView = view;
    }

    public void removeFlutterEngineAttachmentListener(a aVar) {
        this.flutterEngineAttachmentListeners.remove(aVar);
    }

    public void removeOnFirstFrameRenderedListener(io.unicorn.embedding.engine.renderer.b bVar) {
        this.flutterUiDisplayListeners.remove(bVar);
    }

    public void revertImageView(final Runnable runnable) {
        if (this.unicornImageReaderView == null) {
            rtd.a(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.unicorn.embedding.engine.renderer.c cVar = this.previousRenderSurface;
        if (cVar == null) {
            rtd.a(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        if (cVar instanceof UnicornTextureView) {
            if (!((UnicornTextureView) cVar).isOpaque()) {
                ((UnicornTextureView) this.previousRenderSurface).setAlpha(1.0f);
            }
        } else if (this.mEnableFixSurfaceToHybrid && (cVar instanceof UnicornSurfaceView) && ((UnicornSurfaceView) cVar).getRenderTransparently()) {
            ((UnicornSurfaceView) this.previousRenderSurface).setAlpha(1.0f);
            ((UnicornSurfaceView) this.previousRenderSurface).setZOrderOnTop(true);
        }
        this.renderSurface = this.previousRenderSurface;
        this.previousRenderSurface = null;
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar == null) {
            this.unicornImageReaderView.detachFromRenderer();
            runnable.run();
            return;
        }
        final io.unicorn.embedding.engine.renderer.a e = aVar.e();
        if (e == null) {
            this.unicornImageReaderView.detachFromRenderer();
            runnable.run();
            return;
        }
        this.renderSurface.attachToRenderer(e);
        e.a(new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.10
            @Override // io.unicorn.embedding.engine.renderer.b
            public void a() {
                e.b(this);
                runnable.run();
                if ((UnicornView.this.renderSurface instanceof UnicornImageReaderView) || UnicornView.this.unicornImageReaderView == null) {
                    return;
                }
                UnicornView.this.unicornImageReaderView.detachFromRenderer();
            }

            @Override // io.unicorn.embedding.engine.renderer.b
            public void b() {
            }
        });
    }

    void sendUserSettingsToFlutter() {
    }

    public void setRenderSurfaceOpaque(boolean z) {
        io.unicorn.embedding.engine.renderer.c cVar = this.renderSurface;
        if (cVar instanceof UnicornTextureView) {
            ((UnicornTextureView) cVar).setOpaque(z);
        }
    }

    public void setSplashView(final f fVar) {
        if (fVar == null || !isSplashScreenNeededNow()) {
            return;
        }
        rtd.a(TAG, "Showing splash screen UI.");
        this.splashScreenView = fVar.a(getContext(), null);
        addView(this.splashScreenView);
        addOnFirstFrameRenderedListener(new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornView.3
            @Override // io.unicorn.embedding.engine.renderer.b
            public void a() {
                fVar.a(UnicornView.this.onTransitionComplete);
            }

            @Override // io.unicorn.embedding.engine.renderer.b
            public void b() {
            }
        });
    }

    public void setTouchListener(View.OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }

    public void setViewportMetrics(int i, int i2) {
        a.c cVar = this.viewportMetrics;
        cVar.b = i;
        cVar.c = i2;
        sendViewportMetricsToFlutter();
    }

    public void setWeexUnicornListener(xmp xmpVar) {
        this.mWeexUnicornListener = xmpVar;
    }

    public void updateScreenSize(float f, float f2) {
        a.c cVar = this.viewportMetrics;
        cVar.p = (int) f;
        cVar.q = (int) f2;
        sendViewportMetricsToFlutter();
    }

    public void updateViewport() {
        updateViewportPadding();
        sendViewportMetricsToFlutter();
    }

    public void validRenderSurface() {
        io.unicorn.embedding.engine.renderer.c cVar = this.renderSurface;
        if (cVar != null) {
            cVar.valid();
        }
    }
}
