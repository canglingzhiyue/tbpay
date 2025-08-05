package com.alibaba.poplayer.factory.view.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.bzl;
import tb.kge;

/* loaded from: classes.dex */
public abstract class PenetrateFrame extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_PENETRATE_ALPHA = 204;
    private boolean mBitmapCacheUpdated;
    private final List<Rect> mClickableAreas;
    private Rect mClickableFrame;
    private boolean mEnableClickArea;
    private boolean mFindTextureSurfaceViewRectWhenTouch;
    private List<WeakReference<View>> mFoundTextureSurfaceViews;
    private boolean mInterruptOnlyDownAction;
    private Boolean mIsInterceptHover;
    private int mPenetrateAlpha;
    private boolean mUseCacheMark;
    private boolean mUseTouchPointBitmap;
    private boolean useTouchIntercept;

    static {
        kge.a(-1145652596);
    }

    public static /* synthetic */ Object ipc$super(PenetrateFrame penetrateFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -446122783) {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode != 623593120) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        return new Boolean(super.onInterceptHoverEvent((MotionEvent) objArr[0]));
    }

    public PenetrateFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPenetrateAlpha = 204;
        this.mUseCacheMark = true;
        this.useTouchIntercept = true;
        this.mIsInterceptHover = null;
        this.mFindTextureSurfaceViewRectWhenTouch = false;
        this.mFoundTextureSurfaceViews = new ArrayList();
        this.mClickableAreas = new ArrayList();
        initialize(context);
    }

    public PenetrateFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPenetrateAlpha = 204;
        this.mUseCacheMark = true;
        this.useTouchIntercept = true;
        this.mIsInterceptHover = null;
        this.mFindTextureSurfaceViewRectWhenTouch = false;
        this.mFoundTextureSurfaceViews = new ArrayList();
        this.mClickableAreas = new ArrayList();
        initialize(context);
    }

    public PenetrateFrame(Context context) {
        super(context);
        this.mPenetrateAlpha = 204;
        this.mUseCacheMark = true;
        this.useTouchIntercept = true;
        this.mIsInterceptHover = null;
        this.mFindTextureSurfaceViewRectWhenTouch = false;
        this.mFoundTextureSurfaceViews = new ArrayList();
        this.mClickableAreas = new ArrayList();
        initialize(context);
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        setLayoutTransition(null);
        IModuleSwitchAdapter b = bzl.a().b();
        if (b == null) {
            return;
        }
        this.mInterruptOnlyDownAction = b.interruptDownAction();
    }

    public void setUseTouchIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba65ac5", new Object[]{this, new Boolean(z)});
        } else {
            this.useTouchIntercept = z;
        }
    }

    public void setUseTouchPointBitmap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9aca048", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseTouchPointBitmap = z;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    public final void setPenetrateAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8583384", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = 255;
        if (i <= 255) {
            i2 = Math.max(i, 0);
        }
        this.mPenetrateAlpha = i2;
        c.a("PenetrateFrame.setPenetrateAlpha.penetrateAlpha{%s}", Integer.valueOf(this.mPenetrateAlpha));
    }

    public void setFindTextureSurfaceViewRectWhenTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eaaa3e", new Object[]{this, new Boolean(z)});
        } else {
            this.mFindTextureSurfaceViewRectWhenTouch = z;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (!this.useTouchIntercept) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return onInterceptEvent(motionEvent, 0);
        } catch (Throwable th) {
            c.a("PenetrateFrame.onInterceptTouchEvent.error", th);
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e568b4e1", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (isInterceptHover() && this.useTouchIntercept) {
                return onInterceptEvent(motionEvent, 9);
            }
            return super.onInterceptHoverEvent(motionEvent);
        } catch (Throwable th) {
            c.a("PenetrateFrame.onInterceptHoverEvent.error", th);
            return true;
        }
    }

    private boolean isInterceptHover() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47bc9bef", new Object[]{this})).booleanValue();
        }
        if (this.mIsInterceptHover == null) {
            if (bzl.a().b() != null && bzl.a().b().isInterceptHover()) {
                z = true;
            }
            this.mIsInterceptHover = Boolean.valueOf(z);
        }
        return this.mIsInterceptHover.booleanValue();
    }

    private boolean onInterceptEvent(MotionEvent motionEvent, int i) {
        int pixel;
        Rect rect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1515114", new Object[]{this, motionEvent, new Integer(i)})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (this.mInterruptOnlyDownAction && action != 0 && action != 9) {
            if (Build.VERSION.SDK_INT >= 19) {
                c.a("onInterceptEvent.interruptOnlyDownAction.action=", MotionEvent.actionToString(action));
            }
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (x < 0 || y < 0 || (this.mEnableClickArea && (rect = this.mClickableFrame) != null && !rect.contains(x, y))) {
            return true;
        }
        if (!this.mClickableAreas.isEmpty()) {
            for (Rect rect2 : this.mClickableAreas) {
                if (rect2.contains(x, y)) {
                    return false;
                }
            }
        }
        int i2 = this.mPenetrateAlpha;
        if (255 == i2) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        c.a("onInterceptEvent.mUseTouchPointBitmap=%s", Boolean.valueOf(this.mUseTouchPointBitmap));
        if (this.mUseTouchPointBitmap) {
            Bitmap touchPointBitMap = getTouchPointBitMap(x, y);
            if (touchPointBitMap == null) {
                c.a("onInterceptEvent.touchPointBitMap=null", new Object[0]);
                return true;
            }
            pixel = touchPointBitMap.getPixel(0, 0);
            touchPointBitMap.recycle();
        } else {
            if (i == action) {
                updateBitmapCacheIfNeed();
            }
            Pair<Bitmap, Float> scaleSnapshotBitMap = getScaleSnapshotBitMap();
            if (scaleSnapshotBitMap == null || scaleSnapshotBitMap.first == null) {
                c.a("onInterceptEvent.snapshotBitMap=null", new Object[0]);
                return true;
            }
            Bitmap bitmap = (Bitmap) scaleSnapshotBitMap.first;
            float floatValue = ((Float) scaleSnapshotBitMap.second).floatValue();
            int i3 = (int) (x * floatValue);
            int i4 = (int) (y * floatValue);
            if (i3 > bitmap.getWidth() || i4 > bitmap.getHeight()) {
                return true;
            }
            pixel = bitmap.getPixel(i3, i4);
        }
        if (255 - Color.alpha(pixel) <= this.mPenetrateAlpha) {
            return false;
        }
        if (!this.mFindTextureSurfaceViewRectWhenTouch) {
            return true;
        }
        return determineMotionOnTextureSurfaceViews(motionEvent, i);
    }

    public void setEnableClickArea(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e586cdfd", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableClickArea = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
        if (r0.equals("top") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setClickableAreaFrame(com.alibaba.poplayer.factory.view.base.ClickableAreaParam r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.factory.view.base.PenetrateFrame.setClickableAreaFrame(com.alibaba.poplayer.factory.view.base.ClickableAreaParam):void");
    }

    public void addClickableArea(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b67204", new Object[]{this, rect});
        } else if (rect == null) {
        } else {
            this.mClickableAreas.add(rect);
        }
    }

    public void clearClickableInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05ee86a", new Object[]{this});
            return;
        }
        this.mClickableFrame = null;
        this.mClickableAreas.clear();
    }

    public void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
        } else if (this.mUseCacheMark && !this.mBitmapCacheUpdated) {
        } else {
            destroyDrawingCache();
            buildDrawingCache();
            this.mBitmapCacheUpdated = false;
        }
    }

    public void setUseCacheMark(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656b2043", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseCacheMark = z;
        }
    }

    public Pair<Bitmap, Float> getScaleSnapshotBitMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("280b7c78", new Object[]{this}) : new Pair<>(getDrawingCache(), Float.valueOf(1.0f));
    }

    public Bitmap getTouchPointBitMap(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("47d347fb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-i, -i2);
        canvas.setMatrix(matrix);
        draw(canvas);
        return createBitmap;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
            this.mBitmapCacheUpdated = true;
        } catch (Throwable th) {
            c.a("PenetrateFrame.dispatchDraw.error", th);
        }
    }

    private boolean determineMotionOnTextureSurfaceViews(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed0ee477", new Object[]{this, motionEvent, new Integer(i)})).booleanValue();
        }
        try {
            if (motionEvent.getAction() == i || this.mFoundTextureSurfaceViews == null || this.mFoundTextureSurfaceViews.isEmpty()) {
                this.mFoundTextureSurfaceViews = findTextureAndSurfaceView(this);
            }
            if (!this.mFoundTextureSurfaceViews.isEmpty()) {
                for (WeakReference<View> weakReference : this.mFoundTextureSurfaceViews) {
                    Rect rect = new Rect();
                    if (weakReference.get() != null) {
                        weakReference.get().getGlobalVisibleRect(rect);
                        if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            c.a("determineTouchActingOnTextureSurfaceViews error", th);
            return true;
        }
    }

    private List<WeakReference<View>> findTextureAndSurfaceView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3685ec99", new Object[]{this, view});
        }
        try {
            if (view == null) {
                return new ArrayList();
            }
            while (true) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (ViewGroup) parent;
                } else {
                    ArrayList arrayList = new ArrayList();
                    internalSelectTextureViewAndSurfaceView(view, arrayList);
                    return arrayList;
                }
            }
        } catch (Throwable th) {
            c.a("findTextureAndSurfaceView error", th);
            return new ArrayList();
        }
    }

    private void internalSelectTextureViewAndSurfaceView(View view, List<WeakReference<View>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc01309a", new Object[]{this, view, list});
            return;
        }
        if (list == null) {
            try {
                list = new ArrayList<>();
            } catch (Throwable th) {
                c.a("internalSelectTextureViewAndSurfaceView error", th);
                return;
            }
        }
        if ((view instanceof TextureView) || (view instanceof SurfaceView)) {
            list.add(new WeakReference<>(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                internalSelectTextureViewAndSurfaceView(viewGroup.getChildAt(i), list);
            }
        }
    }
}
