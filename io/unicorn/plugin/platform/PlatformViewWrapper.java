package io.unicorn.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import io.unicorn.embedding.android.AndroidTouchProcessor;
import io.unicorn.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.unicorn.view.a;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;
import tb.rtd;
import tb.rtp;
import tb.rtw;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class PlatformViewWrapper extends FrameLayout {
    private static final int HAS_NEW_FRAME = 1;
    private static final String TAG = "PlatformViewWrapper";
    ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int bufferHeight;
    private int bufferWidth;
    private boolean invalid;
    private int left;
    private final a.InterfaceC1064a listener;
    private boolean mCanAutoSwitch;
    private boolean mHasNotifySwitchToTexture;
    private boolean mIsDrawToTexture;
    private boolean mIsPendingToTexture;
    private rtp mPlatformViewsChannel;
    private int mTextDrawCount;
    private int mViewId;
    private FlutterMutatorsStack mutatorsStack;
    private final AtomicLong pendingFramesCount;
    private int prevLeft;
    private int prevTop;
    private float screenDensity;
    private Surface surface;
    private a.b textureEntry;
    private int top;
    private AndroidTouchProcessor touchProcessor;
    private SurfaceTexture tx;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a extends Animation {

        /* renamed from: a  reason: collision with root package name */
        private final Matrix f24866a;

        static {
            kge.a(-1188654598);
        }

        public a(Matrix matrix) {
            this.f24866a = matrix;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            transformation.getMatrix().set(this.f24866a);
        }
    }

    static {
        kge.a(-2089144325);
    }

    public PlatformViewWrapper(Context context) {
        super(context);
        this.invalid = false;
        this.mCanAutoSwitch = false;
        this.mIsDrawToTexture = true;
        this.mHasNotifySwitchToTexture = false;
        this.mIsPendingToTexture = false;
        this.pendingFramesCount = new AtomicLong(0L);
        this.listener = new a.InterfaceC1064a() { // from class: io.unicorn.plugin.platform.PlatformViewWrapper.1
            @Override // io.unicorn.view.a.InterfaceC1064a
            public void a() {
                if (Build.VERSION.SDK_INT == 29) {
                    PlatformViewWrapper.this.pendingFramesCount.decrementAndGet();
                }
            }
        };
        this.screenDensity = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
    }

    public PlatformViewWrapper(Context context, a.b bVar) {
        this(context);
        this.textureEntry = bVar;
        bVar.a(this.listener);
        setTexture(bVar.b());
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.mutatorsStack.getFinalMatrix());
        float f = this.screenDensity;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.left, -this.top);
        return matrix;
    }

    private void notifyEngineSwitchToTextureLayer() {
        if (!this.mHasNotifySwitchToTexture) {
            this.mPlatformViewsChannel.a(this.mViewId, "PunchingToTexture", null);
            this.mHasNotifySwitchToTexture = true;
        }
    }

    private void onFrameProduced() {
        if (Build.VERSION.SDK_INT == 29) {
            this.pendingFramesCount.incrementAndGet();
        }
    }

    private boolean shouldDrawToSurfaceNow() {
        return Build.VERSION.SDK_INT != 29 || this.pendingFramesCount.get() <= 0;
    }

    protected Surface createSurface(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.mIsDrawToTexture) {
            drawTexture(canvas);
        } else if (!this.mIsPendingToTexture) {
            super.draw(canvas);
        } else {
            if (drawTexture(canvas)) {
                super.draw(canvas);
            }
            notifyEngineSwitchToTextureLayer();
            invalidate();
        }
    }

    public boolean drawTexture(Canvas canvas) {
        String str;
        Canvas lockHardwareCanvas;
        SurfaceTexture surfaceTexture;
        if (!canvas.isHardwareAccelerated()) {
            super.draw(canvas);
            return false;
        }
        if (this.invalid && this.surface == null && (surfaceTexture = this.tx) != null && !surfaceTexture.isReleased()) {
            this.surface = createSurface(this.tx);
            this.invalid = false;
        }
        Surface surface = this.surface;
        if (surface == null || !surface.isValid()) {
            super.draw(canvas);
            str = "Invalid surface. The platform view cannot be displayed.";
        } else {
            SurfaceTexture surfaceTexture2 = this.tx;
            if (surfaceTexture2 != null && !surfaceTexture2.isReleased()) {
                if (!shouldDrawToSurfaceNow()) {
                    invalidate();
                    return true;
                }
                try {
                    lockHardwareCanvas = this.surface.lockHardwareCanvas();
                } catch (IllegalStateException e) {
                    rtd.b(TAG, "illegal surface", e);
                    this.surface.release();
                    this.surface = createSurface(this.tx);
                    Surface surface2 = this.surface;
                    if (surface2 == null || !surface2.isValid()) {
                        return false;
                    }
                    lockHardwareCanvas = this.surface.lockHardwareCanvas();
                }
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    onFrameProduced();
                    return true;
                } finally {
                    this.surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            str = "Invalid texture. The platform view cannot be displayed.";
        }
        rtd.e(TAG, str);
        return false;
    }

    public int getBufferHeight() {
        return this.bufferHeight;
    }

    public int getBufferWidth() {
        return this.bufferWidth;
    }

    public SurfaceTexture getTexture() {
        return this.tx;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void invalidateSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
            this.invalid = true;
        }
    }

    public boolean isCanAutoSwitch() {
        return this.mCanAutoSwitch;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.prevLeft = i;
        this.prevTop = i2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.left;
            this.prevLeft = i2;
            i = this.top;
            this.prevTop = i;
            f = i2;
        } else if (action == 2) {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
            return this.touchProcessor.a(motionEvent, matrix);
        } else {
            f = this.left;
            i = this.top;
        }
        matrix.postTranslate(f, i);
        return this.touchProcessor.a(motionEvent, matrix);
    }

    public void readyToDisplay(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.mutatorsStack = flutterMutatorsStack;
        this.left = i;
        this.top = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        a aVar = new a(getPlatformViewMatrix());
        setAnimation(aVar);
        aVar.setDuration(0L);
        aVar.setFillAfter(true);
    }

    public void release() {
        this.tx = null;
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
    }

    public void setAutoSwitchMode(boolean z) {
        this.mCanAutoSwitch = z;
    }

    public void setBufferSize(int i, int i2) {
        this.bufferWidth = i;
        this.bufferHeight = i2;
        SurfaceTexture surfaceTexture = this.tx;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || this.activeFocusListener != null) {
            return;
        }
        this.activeFocusListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.unicorn.plugin.platform.PlatformViewWrapper.3
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public void onGlobalFocusChanged(View view, View view2) {
                View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
                onFocusChangeListener2.onFocusChange(platformViewWrapper, rtw.a((View) platformViewWrapper));
            }
        };
        viewTreeObserver.addOnGlobalFocusChangeListener(this.activeFocusListener);
    }

    public void setPlatformViewsChannel(int i, rtp rtpVar) {
        this.mViewId = i;
        this.mPlatformViewsChannel = rtpVar;
    }

    public void setTexture(SurfaceTexture surfaceTexture) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            rtd.e(TAG, "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.tx = surfaceTexture;
        int i2 = this.bufferWidth;
        if (i2 > 0 && (i = this.bufferHeight) > 0) {
            this.tx.setDefaultBufferSize(i2, i);
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = createSurface(surfaceTexture);
        Canvas lockHardwareCanvas = this.surface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            onFrameProduced();
        } finally {
            this.surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void setTouchProcessor(AndroidTouchProcessor androidTouchProcessor) {
        this.touchProcessor = androidTouchProcessor;
    }

    public void switchToPunching() {
        this.mIsDrawToTexture = false;
    }

    public void switchToTexture() {
        this.mIsPendingToTexture = true;
        this.mTextDrawCount = 0;
        this.mHasNotifySwitchToTexture = false;
        invalidate();
    }

    public void tryToFinishToTexture(int i) {
        if (!this.mIsPendingToTexture) {
            return;
        }
        if (i == 1) {
            this.mTextDrawCount++;
            if (this.mTextDrawCount > 2) {
                this.mIsDrawToTexture = true;
                this.mIsPendingToTexture = false;
            }
        }
        invalidate();
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.activeFocusListener) == null) {
            return;
        }
        this.activeFocusListener = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public void viewInvalidate() {
        post(new Runnable() { // from class: io.unicorn.plugin.platform.PlatformViewWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                PlatformViewWrapper.this.invalidate();
            }
        });
    }
}
