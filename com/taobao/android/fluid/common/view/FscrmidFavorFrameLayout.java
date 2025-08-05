package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.android.fluid.framework.card.cards.web.WebPenetrateFrameLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tb.kge;
import tb.obw;
import tb.ohd;
import tb.shr;
import tb.sjt;
import tb.spz;

/* loaded from: classes5.dex */
public class FscrmidFavorFrameLayout extends RoundCornerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEGREES_MAX = 30;
    private static final int DEGREES_MIN = -30;
    private static final int DOUBLE_TAP_TIMEOUT;
    private static final int MAX_ALPHA = 255;
    private static final int MAX_FAVOR_COUNT = 20;
    private static final int REFRESH_RATE = 16000000;
    private final int INTERCEPT_TOUCH_WIDTH;
    private Bitmap bitmap;
    private int bitmapCenterX;
    private int bitmapCenterY;
    private shr doubleClickListener;
    private boolean interceptIsDouble;
    private long interceptSingleClickTime;
    private boolean isContentValid;
    private boolean isDouble;
    private boolean isEnableWeexUponSeekBar;
    private boolean isFixDuplicateFavor;
    private boolean isLongPress;
    private boolean isScreenEdge;
    private boolean isWebCardPlayingGame;
    private final List<b> list;
    private boolean mDisableTouch;
    private boolean mEnableFavor;
    private final a mOnClickRunnable;
    private final Runnable mOnLongClickRunnable;
    private final Matrix matrix;
    private boolean mediaCardScaled;
    private RangeSeekBar rangeSeekBar;
    private long singleClickTime;
    private boolean start;
    private boolean touchInRangeSeekBar;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f12434a = 0;
        public int b;
        public int c;
        public int d;
        public float e;
        public int f;
        public Paint g;
        public long h;

        static {
            kge.a(-340397855);
        }
    }

    public static /* synthetic */ Object ipc$super(FscrmidFavorFrameLayout fscrmidFavorFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.fluid.common.view.RoundCornerLayout
    public boolean canInterceptVertical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c35c74f3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ shr access$100(FscrmidFavorFrameLayout fscrmidFavorFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shr) ipChange.ipc$dispatch("bb163b49", new Object[]{fscrmidFavorFrameLayout}) : fscrmidFavorFrameLayout.doubleClickListener;
    }

    public static /* synthetic */ boolean access$202(FscrmidFavorFrameLayout fscrmidFavorFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb09fe15", new Object[]{fscrmidFavorFrameLayout, new Boolean(z)})).booleanValue();
        }
        fscrmidFavorFrameLayout.isLongPress = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(FscrmidFavorFrameLayout fscrmidFavorFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5007126", new Object[]{fscrmidFavorFrameLayout})).booleanValue() : fscrmidFavorFrameLayout.isScreenEdge;
    }

    static {
        kge.a(-493468249);
        DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    }

    public FscrmidFavorFrameLayout(Context context) {
        super(context);
        this.matrix = new Matrix();
        this.list = new ArrayList();
        this.INTERCEPT_TOUCH_WIDTH = 180;
        this.mOnClickRunnable = new a();
        this.start = true;
        this.mEnableFavor = true;
        this.isScreenEdge = false;
        this.isEnableWeexUponSeekBar = sjt.B();
        this.isFixDuplicateFavor = sjt.C();
        this.mOnLongClickRunnable = new Runnable() { // from class: com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this) == null) {
                } else {
                    FscrmidFavorFrameLayout.access$202(FscrmidFavorFrameLayout.this, true);
                    FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this).onLongClick(FscrmidFavorFrameLayout.access$300(FscrmidFavorFrameLayout.this));
                    if (FscrmidFavorFrameLayout.this.getParent() == null) {
                        return;
                    }
                    FscrmidFavorFrameLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        };
        init();
    }

    public FscrmidFavorFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.matrix = new Matrix();
        this.list = new ArrayList();
        this.INTERCEPT_TOUCH_WIDTH = 180;
        this.mOnClickRunnable = new a();
        this.start = true;
        this.mEnableFavor = true;
        this.isScreenEdge = false;
        this.isEnableWeexUponSeekBar = sjt.B();
        this.isFixDuplicateFavor = sjt.C();
        this.mOnLongClickRunnable = new Runnable() { // from class: com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this) == null) {
                } else {
                    FscrmidFavorFrameLayout.access$202(FscrmidFavorFrameLayout.this, true);
                    FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this).onLongClick(FscrmidFavorFrameLayout.access$300(FscrmidFavorFrameLayout.this));
                    if (FscrmidFavorFrameLayout.this.getParent() == null) {
                        return;
                    }
                    FscrmidFavorFrameLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        };
        init();
    }

    public void disableTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e90c56", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableTouch = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isEnableWeexUponSeekBar) {
            return dispatchTouchEventWeexUponSeekBar(motionEvent);
        }
        return dispatchTouchEventWeexBelowSeekbar(motionEvent);
    }

    public boolean dispatchTouchEventWeexUponSeekBar(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3564bcb", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.rangeSeekBar == null) {
            this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.rangeSeekBar != null && motionEvent.getActionMasked() == 0) {
            this.touchInRangeSeekBar = this.rangeSeekBar.isTouchInRangeSeekBar(motionEvent);
        }
        RangeSeekBar rangeSeekBar = this.rangeSeekBar;
        if (rangeSeekBar != null && this.touchInRangeSeekBar) {
            MotionEvent transformedEvent = transformedEvent(this, rangeSeekBar, motionEvent);
            Pair<Boolean, Boolean> onTouchEventProxyWeexUponSeekBar = this.rangeSeekBar.onTouchEventProxyWeexUponSeekBar(transformedEvent);
            boolean booleanValue = ((Boolean) onTouchEventProxyWeexUponSeekBar.first).booleanValue();
            boolean booleanValue2 = ((Boolean) onTouchEventProxyWeexUponSeekBar.second).booleanValue();
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                touchInRangeSeekBar(false);
            }
            if (!booleanValue) {
                super.dispatchTouchEvent(motionEvent);
            } else if (booleanValue2) {
                removeCallbacks(this.mOnLongClickRunnable);
                removeCallbacks(this.mOnClickRunnable);
                clearPendingEvent();
                onLongPressCancel();
            }
            transformedEvent.recycle();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTouchEventWeexBelowSeekbar(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da627080", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            this.touchInRangeSeekBar = false;
        }
        try {
            z = super.dispatchTouchEvent(motionEvent);
            if (this.touchInRangeSeekBar && motionEvent.getActionMasked() == 0) {
                if (this.rangeSeekBar == null) {
                    this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                }
                MotionEvent transformedEvent = transformedEvent(this, this.rangeSeekBar, motionEvent);
                this.rangeSeekBar.onInterceptTouchEventProxy(this, transformedEvent);
                this.rangeSeekBar.onTouchEventProxy(this, transformedEvent);
                transformedEvent.recycle();
                return true;
            }
        } catch (Exception e) {
            spz.a("FscrmidFavorFrameLayout", "dispatchTouchEvent error", e);
            e.printStackTrace();
        }
        return z;
    }

    @Override // com.taobao.android.fluid.common.view.RoundCornerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RangeSeekBar rangeSeekBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isEnableWeexUponSeekBar) {
            if (this.touchInRangeSeekBar && this.rangeSeekBar == null) {
                this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (this.touchInRangeSeekBar && (rangeSeekBar = this.rangeSeekBar) != null) {
                MotionEvent transformedEvent = transformedEvent(this, rangeSeekBar, motionEvent);
                boolean onInterceptTouchEventProxy = this.rangeSeekBar.onInterceptTouchEventProxy(this, transformedEvent);
                transformedEvent.recycle();
                return onInterceptTouchEventProxy;
            }
        }
        if (this.mDisableTouch) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        addPendingEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.interceptSingleClickTime < DOUBLE_TAP_TIMEOUT) {
                this.interceptIsDouble = true;
            } else {
                this.interceptIsDouble = false;
            }
            this.interceptSingleClickTime = currentTimeMillis;
        } else if ((action == 1 || action == 3) && obw.WEEX_STATE_NOT_CONSUME.equals(getWeexConsume()) && !isForbidClick() && !isTouchOnWebViewValidArea(motionEvent)) {
            return onTouchEvent(motionEvent);
        }
        if (this.isFixDuplicateFavor) {
            if (this.interceptIsDouble && !isForbidClick() && obw.WEEX_STATE_NOT_CONSUME.equals(getWeexConsume())) {
                return true;
            }
        } else if (this.interceptIsDouble && !isForbidClick()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.android.fluid.common.view.RoundCornerLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RangeSeekBar rangeSeekBar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isEnableWeexUponSeekBar) {
            if (this.touchInRangeSeekBar && this.rangeSeekBar == null) {
                this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (this.touchInRangeSeekBar && (rangeSeekBar = this.rangeSeekBar) != null) {
                MotionEvent transformedEvent = transformedEvent(this, rangeSeekBar, motionEvent);
                try {
                    z = this.rangeSeekBar.onTouchEventProxy(this, transformedEvent);
                } catch (Exception e) {
                    spz.a("FscrmidFavorFrameLayout", "motionEvent error", e);
                    e.printStackTrace();
                }
                transformedEvent.recycle();
                return z;
            }
        }
        if (this.mDisableTouch) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isLongPress = false;
            removeCallbacks(this.mOnClickRunnable);
            removeCallbacks(this.mOnLongClickRunnable);
            long currentTimeMillis = System.currentTimeMillis();
            if (!isForbidClick() && this.isContentValid) {
                if (currentTimeMillis - this.singleClickTime < DOUBLE_TAP_TIMEOUT) {
                    if (!this.isDouble && this.doubleClickListener != null && !isTouchOnWebViewValidArea(motionEvent)) {
                        this.doubleClickListener.onDoubleClick(motionEvent.getX(), motionEvent.getY());
                    }
                    if (this.isDouble && this.doubleClickListener != null) {
                        spz.c("FscrmidFavorFrameLayout", "tripleClick ---" + motionEvent.getX() + " , " + motionEvent.getY());
                        this.doubleClickListener.onTripleClick(motionEvent.getX(), motionEvent.getY());
                    }
                    this.isDouble = true;
                    if (this.mEnableFavor) {
                        collectFavor(motionEvent);
                    }
                    requestDisallowInterceptTouchEvent(true);
                } else {
                    this.isDouble = false;
                    if (!this.isEnableWeexUponSeekBar) {
                        longClickOnTouchEvent(motionEvent);
                    } else if (!this.touchInRangeSeekBar) {
                        longClickOnTouchEvent(motionEvent);
                    }
                }
            }
            this.singleClickTime = currentTimeMillis;
        } else if (action == 1) {
            removeCallbacks(this.mOnLongClickRunnable);
            removeCallbacks(this.mOnClickRunnable);
            if (!this.isDouble && !this.isLongPress && !isTouchOnWebViewValidArea(motionEvent)) {
                a.a(this.mOnClickRunnable, motionEvent.getX());
                a.b(this.mOnClickRunnable, motionEvent.getY());
                postDelayed(this.mOnClickRunnable, DOUBLE_TAP_TIMEOUT);
            }
            requestDisallowInterceptTouchEvent(false);
            clearPendingEvent();
            onLongPressCancel();
        } else if (action == 3) {
            removeCallbacks(this.mOnLongClickRunnable);
            requestDisallowInterceptTouchEvent(false);
            clearPendingEvent();
            onLongPressCancel();
        }
        return true;
    }

    public boolean isForbidClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("94734e55", new Object[]{this})).booleanValue() : this.mediaCardScaled || this.isWebCardPlayingGame;
    }

    public boolean isTouchOnWebViewValidArea(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ccb0884", new Object[]{this, motionEvent})).booleanValue();
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof DWPenetrateFrameLayout) {
                return ((DWPenetrateFrameLayout) childAt).isTouchOnValidArea(motionEvent);
            }
            if (childAt instanceof WebPenetrateFrameLayout) {
                return ((WebPenetrateFrameLayout) childAt).isTouchOnValidArea(motionEvent);
            }
        }
        return false;
    }

    public void setBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
            return;
        }
        this.bitmap = bitmap;
        this.bitmapCenterX = bitmap.getWidth() / 2;
        this.bitmapCenterY = bitmap.getHeight() / 2;
    }

    public void setContentValid(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7470edc8", new Object[]{this, new Boolean(z)});
        } else {
            this.isContentValid = z;
        }
    }

    public void setEnableFavor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ccee14", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableFavor = z;
        }
    }

    public void setMediaCardScaled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff058e1", new Object[]{this, new Boolean(z)});
        } else {
            this.mediaCardScaled = z;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else if (!(onClickListener instanceof shr)) {
        } else {
            this.doubleClickListener = (shr) onClickListener;
        }
    }

    public void setWebCardPlayingGame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dfb7cf", new Object[]{this, new Boolean(z)});
        } else {
            this.isWebCardPlayingGame = z;
        }
    }

    public void touchInRangeSeekBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38770b", new Object[]{this, new Boolean(z)});
        } else {
            this.touchInRangeSeekBar = z;
        }
    }

    @Override // com.taobao.android.fluid.common.view.BaseRoundCornerLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        if (this.list == null) {
            return;
        }
        for (int i = 0; i < this.list.size(); i++) {
            b bVar = this.list.get(i);
            this.matrix.reset();
            this.matrix.postScale(bVar.e, bVar.e, bVar.c + this.bitmapCenterX, bVar.d + this.bitmapCenterY);
            this.matrix.postRotate(bVar.f, bVar.c + this.bitmapCenterX, bVar.d + this.bitmapCenterY);
            canvas.save();
            canvas.concat(this.matrix);
            canvas.drawBitmap(this.bitmap, bVar.c - this.bitmapCenterX, bVar.d - this.bitmapCenterY, bVar.g);
            canvas.restore();
        }
        if (this.list.isEmpty()) {
            return;
        }
        refresh();
        invalidate();
    }

    private void collectFavor(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281b5810", new Object[]{this, motionEvent});
        } else if (this.list == null) {
        } else {
            b bVar = new b();
            bVar.e = 1.0f;
            bVar.b = 255;
            bVar.c = (int) motionEvent.getX();
            bVar.d = (int) motionEvent.getY();
            bVar.g = initPaint(bVar.b);
            bVar.f = degrees(-30, 30);
            bVar.h = System.nanoTime();
            if (this.list.size() == 0) {
                this.start = true;
            }
            if (this.list.size() > 20) {
                this.list.remove(0);
            }
            this.list.add(bVar);
            if (!this.start) {
                return;
            }
            invalidate();
        }
    }

    private int degrees(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74151101", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : new Random().nextInt((i2 - i) + 1) + i;
    }

    private RangeSeekBar inRangeSeekBar(View view, int i, int i2) {
        int i3;
        int i4;
        RangeSeekBar inRangeSeekBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RangeSeekBar) ipChange.ipc$dispatch("a08b1e59", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt != null && (i3 = i + scrollX) >= childAt.getLeft() && i3 < childAt.getRight() * childAt.getScaleX() && (i4 = i2 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && (inRangeSeekBar = inRangeSeekBar(childAt, (int) ((i3 - childAt.getLeft()) / childAt.getScaleX()), i4 - childAt.getTop())) != null) {
                    return inRangeSeekBar;
                }
            }
            return null;
        } else if (view instanceof RangeSeekBar) {
            return (RangeSeekBar) view;
        } else {
            return null;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.fluid_sdk_double_click);
        this.bitmapCenterX = this.bitmap.getWidth() / 2;
        this.bitmapCenterY = this.bitmap.getHeight() / 2;
    }

    private Paint initPaint(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("478ec8bd", new Object[]{this, new Integer(i)});
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setAlpha(i);
        return paint;
    }

    private void longClickOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0f1dc2", new Object[]{this, motionEvent});
            return;
        }
        int x = (int) motionEvent.getX();
        motionEvent.getY();
        int f = ohd.f(getContext());
        int a2 = ohd.a(getContext(), 180);
        if (x >= a2 && x <= f - a2) {
            this.isScreenEdge = false;
        } else {
            this.isScreenEdge = true;
        }
        postDelayed(this.mOnLongClickRunnable, ViewConfiguration.getLongPressTimeout());
    }

    private void onLongPressCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4423029", new Object[]{this});
            return;
        }
        shr shrVar = this.doubleClickListener;
        if (shrVar == null) {
            return;
        }
        shrVar.onLongClickCancel();
    }

    private void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        long nanoTime = System.nanoTime();
        int i = 0;
        while (i < this.list.size()) {
            b bVar = this.list.get(i);
            int i2 = (int) ((nanoTime - bVar.h) / 16000000);
            bVar.f12434a += i2;
            if (i2 > 0) {
                bVar.h = nanoTime;
            }
            if (!this.start && bVar.b == 0) {
                this.list.remove(i);
                i--;
                bVar.g = null;
            } else {
                if (this.start) {
                    this.start = false;
                }
                if (bVar.f12434a <= 3) {
                    bVar.e += 0.2f;
                    bVar.d -= 10;
                } else if (bVar.f12434a <= 6) {
                    bVar.e = (float) (bVar.e - 0.2d);
                    bVar.d -= 10;
                } else if (bVar.f12434a <= 15) {
                    bVar.e = 1.0f;
                    bVar.d -= 10;
                } else {
                    bVar.e = (float) (bVar.e + 0.1d);
                    bVar.b -= 10;
                    if (bVar.b < 0) {
                        bVar.b = 0;
                    }
                    bVar.d -= 10;
                }
                bVar.g.setAlpha(bVar.b);
            }
            i++;
        }
    }

    private MotionEvent transformedEvent(View view, View view2, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEvent) ipChange.ipc$dispatch("c4dde0e0", new Object[]{this, view, view2, motionEvent});
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(i, iArr[1] - iArr2[1]);
        return obtain;
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float b;
        private float c;

        static {
            kge.a(-1939778456);
            kge.a(-1390502639);
        }

        private a() {
        }

        public static /* synthetic */ float a(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("856cfa1d", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.b = f;
            return f;
        }

        public static /* synthetic */ float b(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("be4d5abc", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.c = f;
            return f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this) == null) {
            } else {
                FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this).onSingleClick(this.b, this.c);
            }
        }
    }
}
