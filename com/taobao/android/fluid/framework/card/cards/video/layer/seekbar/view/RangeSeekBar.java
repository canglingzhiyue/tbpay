package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.sil;
import tb.six;
import tb.sjt;
import tb.spz;

/* loaded from: classes5.dex */
public class RangeSeekBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROGRESS_DARK_DEFAULT_COLOR = "#26FFFFFF";
    private static final String PROGRESS_DEFAULT_COLOR = "#222222";
    public static final int SEEKBAR_MODE_RANGE = 2;
    public static final int SEEKBAR_MODE_SINGLE = 1;
    private static final String TAG = "RangeSeekBar";
    public static final int TICK_MARK_GRAVITY_CENTER = 1;
    public static final int TICK_MARK_GRAVITY_LEFT = 0;
    public static final int TICK_MARK_GRAVITY_RIGHT = 2;
    public static final int TRICK_MARK_MODE_NUMBER = 0;
    public static final int TRICK_MARK_MODE_OTHER = 1;
    private six callback;
    public SeekBar currTouchSB;
    private boolean enableSmoothSeek;
    private boolean enableThumbOverlap;
    private int gravity;
    private boolean isEnable;
    private final boolean isEnableWeexUponSeekBar;
    public boolean isScaleThumb;
    private boolean isSeekBarSeeking;
    private boolean isTouchEventDragging;
    public SeekBar leftSB;
    private float maxProgress;
    private float minInterval;
    private float minProgress;
    private int normalProgressHeight;
    public final Paint paint;
    public Bitmap progressBitmap;
    private int progressBottom;
    private int progressColor;
    public Bitmap progressDefaultBitmap;
    private int progressDefaultColor;
    private int progressDefaultDrawableId;
    public final RectF progressDefaultDstRect;
    private int progressDrawableId;
    public final RectF progressDstRect;
    private int progressHeight;
    private int progressLeft;
    private int progressPaddingRight;
    private float progressRadius;
    private int progressRight;
    public final Rect progressSrcRect;
    private int progressTop;
    private int progressWidth;
    public float reservePercent;
    public SeekBar rightSB;
    private int seekBarMode;
    public Bitmap seekingProgressBitmap;
    private int seekingProgressDrawableId;
    private final Handler smoothProgressHandler;
    private int smoothStepWidth;
    private int smoothUpdateDuration;
    private int smoothUpdateInterval;
    public final RectF stepDivRect;
    private int steps;
    private boolean stepsAutoBonding;
    public final List<Bitmap> stepsBitmaps;
    private int stepsColor;
    private int stepsDrawableId;
    private float stepsHeight;
    private float stepsRadius;
    private float stepsWidth;
    private int targetProgress;
    private int thumbProgressColor;
    private int thumbProgressHeight;
    public Rect tickMarkTextRect;
    public float touchDownX;
    public float touchDownY;
    private final int touchSlop;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface GravityDef {
    }

    static {
        kge.a(83285632);
    }

    public static /* synthetic */ Object ipc$super(RangeSeekBar rangeSeekBar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1269932558:
                super.setEnabled(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ int access$000(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4c9c79d", new Object[]{rangeSeekBar})).intValue() : rangeSeekBar.targetProgress;
    }

    public static /* synthetic */ int access$100(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3f056fc", new Object[]{rangeSeekBar})).intValue() : rangeSeekBar.smoothStepWidth;
    }

    public static /* synthetic */ float access$200(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a316e658", new Object[]{rangeSeekBar})).floatValue() : rangeSeekBar.maxProgress;
    }

    public static /* synthetic */ int access$300(RangeSeekBar rangeSeekBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a23d75ba", new Object[]{rangeSeekBar})).intValue() : rangeSeekBar.smoothUpdateInterval;
    }

    public RangeSeekBar(Context context) {
        this(context, null);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint();
        this.progressDefaultDstRect = new RectF();
        this.progressDstRect = new RectF();
        this.progressSrcRect = new Rect();
        this.stepDivRect = new RectF();
        this.stepsBitmaps = new ArrayList();
        this.isScaleThumb = false;
        this.tickMarkTextRect = new Rect();
        this.isEnable = true;
        this.enableSmoothSeek = oeb.a("ShortVideo.enableSmoothSeek", true);
        this.smoothStepWidth = 20;
        this.smoothUpdateDuration = 100;
        this.smoothProgressHandler = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                int progress = RangeSeekBar.this.getProgress();
                if (RangeSeekBar.access$000(RangeSeekBar.this) <= progress) {
                    return;
                }
                RangeSeekBar rangeSeekBar = RangeSeekBar.this;
                rangeSeekBar.setProgress(Math.min(RangeSeekBar.access$000(rangeSeekBar), RangeSeekBar.access$100(RangeSeekBar.this) + progress), RangeSeekBar.access$200(RangeSeekBar.this));
                if (RangeSeekBar.access$000(RangeSeekBar.this) <= progress + RangeSeekBar.access$100(RangeSeekBar.this)) {
                    return;
                }
                sendEmptyMessageDelayed(0, RangeSeekBar.access$300(RangeSeekBar.this));
            }
        };
        initAttrs(attributeSet);
        initPaint();
        initSeekBar(attributeSet);
        initStepsBitmap();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.isEnableWeexUponSeekBar = sjt.B();
    }

    public int getGravity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19666692", new Object[]{this})).intValue() : this.gravity;
    }

    public void setGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49afdb50", new Object[]{this, new Integer(i)});
        } else {
            this.gravity = i;
        }
    }

    public SeekBar getLeftSeekBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SeekBar) ipChange.ipc$dispatch("f709bc07", new Object[]{this}) : this.leftSB;
    }

    public float getMaxProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bdc13d72", new Object[]{this})).floatValue() : this.maxProgress;
    }

    public float getMinProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b914960", new Object[]{this})).floatValue() : this.minProgress;
    }

    public int getProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ba5fa9d", new Object[]{this})).intValue() : getRangeSeekBarState()[0].b;
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        this.targetProgress = (int) f;
        if (this.enableSmoothSeek) {
            this.smoothProgressHandler.removeMessages(0);
            if (f == this.minProgress || f == this.maxProgress) {
                this.smoothUpdateInterval = 0;
                setProgress(f, this.maxProgress);
                return;
            }
            int progress = getProgress();
            int i = this.targetProgress - progress;
            int i2 = this.smoothStepWidth;
            if (i > i2 * 2) {
                setProgress(i2 + progress, this.maxProgress);
                int i3 = this.targetProgress - progress;
                int i4 = this.smoothStepWidth;
                this.smoothUpdateInterval = this.smoothUpdateDuration / ((i3 - i4) / i4);
                this.smoothProgressHandler.sendEmptyMessageDelayed(0, this.smoothUpdateInterval);
                return;
            }
            this.smoothUpdateInterval = 0;
            setProgress(f, this.maxProgress);
            return;
        }
        setProgress(f, this.maxProgress);
    }

    public int getProgressBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccffd28", new Object[]{this})).intValue() : this.progressBottom;
    }

    public int getProgressHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9ef1624", new Object[]{this})).intValue() : this.progressHeight;
    }

    public void setProgressHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c238e266", new Object[]{this, new Integer(i)});
            return;
        }
        this.normalProgressHeight = i;
        updateProgressHeight(this.normalProgressHeight);
    }

    public int getProgressLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e87d9c4", new Object[]{this})).intValue() : this.progressLeft;
    }

    public int getProgressPaddingRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("298a5d48", new Object[]{this})).intValue() : this.progressPaddingRight;
    }

    public int getProgressRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dfdbe033", new Object[]{this})).intValue() : this.progressRight;
    }

    public int getProgressTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f58de2c", new Object[]{this})).intValue() : this.progressTop;
    }

    public int getProgressWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a5066dd", new Object[]{this})).intValue() : this.progressWidth;
    }

    public a[] getRangeSeekBarState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a[]) ipChange.ipc$dispatch("7f772a59", new Object[]{this});
        }
        a aVar = new a();
        aVar.b = this.leftSB.g();
        aVar.f12493a = String.valueOf(aVar.b);
        if (b.a(aVar.b, this.minProgress) == 0) {
            aVar.c = true;
        } else if (b.a(aVar.b, this.maxProgress) == 0) {
            aVar.d = true;
        }
        a aVar2 = new a();
        if (this.seekBarMode == 2) {
            aVar2.b = this.rightSB.g();
            aVar2.f12493a = String.valueOf(aVar2.b);
            if (b.a(this.rightSB.l, this.minProgress) == 0) {
                aVar2.c = true;
            } else if (b.a(this.rightSB.l, this.maxProgress) == 0) {
                aVar2.d = true;
            }
        }
        return new a[]{aVar, aVar2};
    }

    public int getThumbProgressHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("562e006e", new Object[]{this})).intValue() : this.thumbProgressHeight;
    }

    public void setThumbProgressHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f4af4", new Object[]{this, new Integer(i)});
        } else {
            this.thumbProgressHeight = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 != 3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEventProxy(android.view.ViewGroup r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r6
            r1[r4] = r7
            r1[r2] = r8
            java.lang.String r7 = "6bd7b6cf"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1f:
            boolean r0 = r6.isEnable
            if (r0 != 0) goto L24
            return r5
        L24:
            int r0 = r8.getAction()
            if (r0 == 0) goto L3e
            if (r0 == r4) goto L32
            if (r0 == r2) goto L4c
            if (r0 == r3) goto L32
            goto La5
        L32:
            r6.isTouchEventDragging = r5
            if (r7 == 0) goto La5
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r5)
            goto La5
        L3e:
            r6.isTouchEventDragging = r5
            float r0 = r6.getEventX(r8)
            r6.touchDownX = r0
            float r0 = r6.getEventY(r8)
            r6.touchDownY = r0
        L4c:
            float r0 = r6.getEventX(r8)
            float r1 = r6.getEventY(r8)
            float r2 = r6.touchDownX
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            float r3 = r6.touchDownY
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6c
            r5 = 1
        L6c:
            boolean r1 = r6.isTouchEventDragging
            if (r1 != 0) goto La5
            if (r5 == 0) goto La5
            float r1 = r6.touchDownX
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r6.touchSlop
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La5
            r6.isTouchEventDragging = r4
            boolean r0 = tb.sjt.w()
            if (r0 == 0) goto L99
            boolean r0 = r7 instanceof com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout
            if (r0 == 0) goto L99
            java.lang.String r0 = "RangeSeekBar"
            java.lang.String r1 = "onTouchEventProxy: clearPendingEvent"
            tb.spz.c(r0, r1)
            r0 = r7
            com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout r0 = (com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout) r0
            r0.clearPendingEvent()
        L99:
            r6.onStart(r8)
            if (r7 == 0) goto La5
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r4)
        La5:
            boolean r7 = r6.isTouchEventDragging
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onInterceptTouchEventProxy(android.view.ViewGroup, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 != 3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEventProxy(android.view.ViewGroup r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r6
            r1[r5] = r7
            r1[r2] = r8
            java.lang.String r7 = "eb9aac13"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1f:
            boolean r0 = r6.isEnable
            if (r0 != 0) goto L24
            return r5
        L24:
            int r0 = r8.getAction()
            if (r0 == 0) goto Lb1
            if (r0 == r5) goto L99
            if (r0 == r2) goto L32
            if (r0 == r3) goto L99
            goto Lb0
        L32:
            float r0 = r6.getEventX(r8)
            float r1 = r6.getEventY(r8)
            float r2 = r6.touchDownX
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            float r3 = r6.touchDownY
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L52
            r4 = 1
        L52:
            boolean r1 = r6.isTouchEventDragging
            if (r1 != 0) goto L8c
            if (r4 == 0) goto L8c
            float r1 = r6.touchDownX
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r2 = r6.touchSlop
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L8c
            r6.isTouchEventDragging = r5
            boolean r1 = tb.sjt.w()
            if (r1 == 0) goto L80
            boolean r1 = r7 instanceof com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout
            if (r1 == 0) goto L80
            java.lang.String r1 = "RangeSeekBar"
            java.lang.String r2 = "onTouchEventProxy: clearPendingEvent"
            tb.spz.c(r1, r2)
            r1 = r7
            com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout r1 = (com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout) r1
            r1.clearPendingEvent()
        L80:
            r6.onStart(r8)
            if (r7 == 0) goto L8c
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r5)
        L8c:
            boolean r7 = r6.isTouchEventDragging
            if (r7 != 0) goto L95
            boolean r7 = super.onTouchEvent(r8)
            return r7
        L95:
            r6.onMoved(r0)
            goto Lb0
        L99:
            if (r7 == 0) goto La2
            android.view.ViewParent r7 = r7.getParent()
            r7.requestDisallowInterceptTouchEvent(r4)
        La2:
            boolean r7 = r6.isTouchEventDragging
            if (r7 != 0) goto Lab
            boolean r7 = super.onTouchEvent(r8)
            return r7
        Lab:
            r6.isTouchEventDragging = r4
            r6.onFinish(r8)
        Lb0:
            return r5
        Lb1:
            r6.isTouchEventDragging = r4
            float r7 = r6.getEventX(r8)
            r6.touchDownX = r7
            float r7 = r6.getEventY(r8)
            r6.touchDownY = r7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onTouchEventProxy(android.view.ViewGroup, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.Boolean, java.lang.Boolean> onTouchEventProxyWeexUponSeekBar(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onTouchEventProxyWeexUponSeekBar(android.view.MotionEvent):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 != 3) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            r1[r4] = r6
            java.lang.String r6 = "a9b14c3a"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            boolean r0 = r5.isEnable
            if (r0 != 0) goto L21
            return r4
        L21:
            com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout r0 = r5.findFscrmidFavorFrameLayout()
            if (r0 == 0) goto L30
            r0.touchInRangeSeekBar(r4)
            boolean r6 = r5.isEnableWeexUponSeekBar
            if (r6 == 0) goto L2f
            return r4
        L2f:
            return r3
        L30:
            int r0 = r6.getAction()
            if (r0 == 0) goto L94
            if (r0 == r4) goto L74
            if (r0 == r2) goto L3e
            r1 = 3
            if (r0 == r1) goto L74
            goto L8f
        L3e:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L4b
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
        L4b:
            float r0 = r5.getEventX(r6)
            boolean r1 = r5.isTouchEventDragging
            if (r1 != 0) goto L67
            float r1 = r5.touchDownX
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r2 = r5.touchSlop
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L67
            r5.isTouchEventDragging = r4
            r5.onStart(r6)
        L67:
            boolean r1 = r5.isTouchEventDragging
            if (r1 != 0) goto L70
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L70:
            r5.onMoved(r0)
            goto L8f
        L74:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L81
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L81:
            boolean r0 = r5.isTouchEventDragging
            if (r0 != 0) goto L8a
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L8a:
            r5.isTouchEventDragging = r3
            r5.onFinish(r6)
        L8f:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L94:
            r5.isTouchEventDragging = r3
            float r0 = r5.getEventX(r6)
            r5.touchDownX = r0
            float r6 = r5.getEventY(r6)
            r5.touchDownY = r6
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto Laf
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r4)
        Laf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean isTouchInRangeSeekBar(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3daa5b8", new Object[]{this, motionEvent})).booleanValue();
        }
        int a2 = b.a(getContext(), 20.0f);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        int height = getHeight();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        return rawX > ((float) i) && rawX < ((float) (i + width)) && rawY > ((float) (i2 - a2)) && rawY < ((float) ((i2 + height) + a2));
    }

    public void setEnableSmoothSeek(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92d6a62", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSmoothSeek = z;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setEnabled(z);
        this.isEnable = z;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        onMeasureProgress(i, i2);
        setRange(this.minProgress, this.maxProgress, this.minInterval);
        int progressBottom = (getProgressBottom() + getProgressTop()) / 2;
        this.leftSB.a(getProgressLeft(), progressBottom);
        if (this.seekBarMode != 2) {
            return;
        }
        this.rightSB.a(getProgressLeft(), progressBottom);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        onDrawProgressBar(canvas, this.paint);
        onDrawSteps(canvas, this.paint);
        onDrawSeekBar(canvas);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.minValue = this.minProgress;
        savedState.maxValue = this.maxProgress;
        savedState.rangeInterval = this.minInterval;
        a[] rangeSeekBarState = getRangeSeekBarState();
        savedState.currSelectedMin = rangeSeekBarState[0].b;
        savedState.currSelectedMax = rangeSeekBarState[1].b;
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        try {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setRange(savedState.minValue, savedState.maxValue, savedState.rangeInterval);
            setProgress(savedState.currSelectedMin, savedState.currSelectedMax);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        } else if (mode == Integer.MIN_VALUE && (getParent() instanceof ViewGroup) && size == -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((ViewGroup) getParent()).getMeasuredHeight(), Integer.MIN_VALUE);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((int) getRawHeight()) + getPaddingTop() + getPaddingBottom(), 1073741824);
        }
        super.onMeasure(i, makeMeasureSpec);
    }

    public void setOnRangeChangedListener(six sixVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcc9e1", new Object[]{this, sixVar});
        } else {
            this.callback = sixVar;
        }
    }

    public void setProgress(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2155836", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        float min = Math.min(f, f2);
        float max = Math.max(min, f2);
        float f3 = this.minInterval;
        if (max - min < f3) {
            min = max - f3;
        }
        if (min < this.minProgress) {
            spz.c(TAG, "setProgress() min < (preset min - offsetValue) . #min:" + min + " #preset min:" + max);
            return;
        }
        if (max > this.maxProgress) {
            spz.c(TAG, "setProgress() max > (preset max - offsetValue) . #max:" + max + " #preset max:" + max);
        }
        float f4 = this.maxProgress;
        float f5 = this.minProgress;
        float f6 = f4 - f5;
        this.leftSB.l = Math.abs(min - f5) / f6;
        if (this.seekBarMode == 2) {
            this.rightSB.l = Math.abs(max - this.minProgress) / f6;
        }
        six sixVar = this.callback;
        if (sixVar != null) {
            sixVar.a(this, min, max, false);
        }
        invalidate();
    }

    public void setRange(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe90c882", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            setRange(f, f2, this.minInterval);
        }
    }

    public void setRange(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d388af7e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (f2 <= f) {
            spz.c(TAG, "setRange() max must be greater than min ! #max:" + f2 + " #min:" + f);
        } else if (f3 < 0.0f) {
            spz.c(TAG, "setRange() interval must be greater than zero ! #minInterval:" + f3);
        } else {
            float f4 = f2 - f;
            if (f3 >= f4) {
                spz.c(TAG, "setRange() interval must be less than (max - min) ! #minInterval:" + f3 + " #max - min:" + f4);
                return;
            }
            this.maxProgress = f2;
            this.minProgress = f;
            this.minInterval = f3;
            this.reservePercent = f3 / f4;
            if (this.seekBarMode == 2) {
                if (this.leftSB.l + this.reservePercent <= 1.0f && this.leftSB.l + this.reservePercent > this.rightSB.l) {
                    this.rightSB.l = this.leftSB.l + this.reservePercent;
                } else if (this.rightSB.l - this.reservePercent >= 0.0f && this.rightSB.l - this.reservePercent < this.leftSB.l) {
                    this.leftSB.l = this.rightSB.l - this.reservePercent;
                }
            }
            invalidate();
        }
    }

    public void setSmoothStepWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44507612", new Object[]{this, new Integer(i)});
        } else {
            this.smoothStepWidth = i;
        }
    }

    public void setSmoothUpdateDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6557b12f", new Object[]{this, new Integer(i)});
        } else {
            this.smoothUpdateDuration = i;
        }
    }

    public void setThumbEnabled(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8259d40", new Object[]{this, new Boolean(z)});
            return;
        }
        this.leftSB.b(z);
        if (!z || (i = this.thumbProgressHeight) <= 0) {
            i = this.normalProgressHeight;
        }
        updateProgressHeight(i);
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        } else {
            this.paint.setTypeface(typeface);
        }
    }

    public float calculateSeekBarPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a58b7b9", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = 0.0f;
        if (this.currTouchSB == null) {
            return 0.0f;
        }
        float progressLeft = (f - getProgressLeft()) / this.progressWidth;
        if (f < getProgressLeft()) {
            progressLeft = 0.0f;
        } else if (f > getProgressRight()) {
            progressLeft = 1.0f;
        }
        if (sil.d()) {
            float f3 = (f - this.touchDownX) / this.progressWidth;
            float f4 = this.currTouchSB.l;
            float f5 = f4 + f3;
            if (f5 > 1.0f) {
                f2 = 1.0f;
            } else if (f5 >= 0.0f) {
                f2 = f5;
            }
            spz.c(TAG, "calculateCurrentSeekBarPercent() touchDownX=" + f + "; lastTouchDownX=" + this.touchDownX + "; relativePercent=" + f3 + "; currPercent=" + f4 + "; percent=" + f2);
            progressLeft = f2;
        }
        if (this.seekBarMode != 2) {
            return progressLeft;
        }
        SeekBar seekBar = this.currTouchSB;
        SeekBar seekBar2 = this.leftSB;
        return seekBar == seekBar2 ? progressLeft > this.rightSB.l - this.reservePercent ? this.rightSB.l - this.reservePercent : progressLeft : (seekBar != this.rightSB || progressLeft >= seekBar2.l + this.reservePercent) ? progressLeft : this.reservePercent + this.leftSB.l;
    }

    public float getEventX(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("731a74c0", new Object[]{this, motionEvent})).floatValue() : motionEvent.getX();
    }

    public float getEventY(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88033d01", new Object[]{this, motionEvent})).floatValue() : motionEvent.getY();
    }

    public float getRawHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3ec68b0", new Object[]{this})).floatValue();
        }
        if (this.seekBarMode == 1) {
            return this.leftSB.h();
        }
        return Math.max(this.leftSB.h(), this.rightSB.h());
    }

    public void onDrawProgressBar(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee131d0", new Object[]{this, canvas, paint});
            return;
        }
        if (b.a(this.progressDefaultBitmap)) {
            canvas.drawBitmap(this.progressDefaultBitmap, (Rect) null, this.progressDefaultDstRect, paint);
        } else {
            paint.setColor(this.progressDefaultColor);
            RectF rectF = this.progressDefaultDstRect;
            float f = this.progressRadius;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
        if (this.seekBarMode == 2) {
            this.progressDstRect.top = getProgressTop();
            this.progressDstRect.left = this.leftSB.h + (this.leftSB.m() / 2.0f) + (this.progressWidth * this.leftSB.l);
            this.progressDstRect.right = this.rightSB.h + (this.rightSB.m() / 2.0f) + (this.progressWidth * this.rightSB.l);
            this.progressDstRect.bottom = getProgressBottom();
        } else {
            this.progressDstRect.top = getProgressTop();
            this.progressDstRect.left = this.leftSB.h + (this.leftSB.m() / 2.0f);
            this.progressDstRect.right = this.leftSB.h + (this.leftSB.m() / 2.0f) + (this.progressWidth * this.leftSB.l);
            this.progressDstRect.bottom = getProgressBottom();
        }
        if (this.isSeekBarSeeking) {
            if (b.a(this.seekingProgressBitmap)) {
                Rect rect = this.progressSrcRect;
                rect.top = 0;
                rect.bottom = this.seekingProgressBitmap.getHeight();
                int width = this.seekingProgressBitmap.getWidth();
                if (this.seekBarMode == 2) {
                    float f2 = width;
                    this.progressSrcRect.left = (int) (this.leftSB.l * f2);
                    this.progressSrcRect.right = (int) (f2 * this.rightSB.l);
                } else {
                    Rect rect2 = this.progressSrcRect;
                    rect2.left = 0;
                    rect2.right = (int) (width * this.leftSB.l);
                }
                canvas.drawBitmap(this.seekingProgressBitmap, this.progressSrcRect, this.progressDstRect, (Paint) null);
                return;
            }
            paint.setColor(this.thumbProgressColor);
            RectF rectF2 = this.progressDstRect;
            float f3 = this.progressRadius;
            canvas.drawRoundRect(rectF2, f3, f3, paint);
        } else if (b.a(this.progressBitmap)) {
            Rect rect3 = this.progressSrcRect;
            rect3.top = 0;
            rect3.bottom = this.progressBitmap.getHeight();
            int width2 = this.progressBitmap.getWidth();
            if (this.seekBarMode == 2) {
                float f4 = width2;
                this.progressSrcRect.left = (int) (this.leftSB.l * f4);
                this.progressSrcRect.right = (int) (f4 * this.rightSB.l);
            } else {
                Rect rect4 = this.progressSrcRect;
                rect4.left = 0;
                rect4.right = (int) (width2 * this.leftSB.l);
            }
            canvas.drawBitmap(this.progressBitmap, this.progressSrcRect, this.progressDstRect, (Paint) null);
        } else {
            paint.setColor(this.progressColor);
            RectF rectF3 = this.progressDstRect;
            float f5 = this.progressRadius;
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
    }

    public void onDrawSeekBar(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2d7486", new Object[]{this, canvas});
            return;
        }
        if (this.leftSB.f() == 3) {
            this.leftSB.d(true);
        }
        this.leftSB.a(canvas);
        if (this.seekBarMode != 2) {
            return;
        }
        if (this.rightSB.f() == 3) {
            this.rightSB.d(true);
        }
        this.rightSB.a(canvas);
    }

    public void onDrawSteps(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862d8a2f", new Object[]{this, canvas, paint});
        } else if (verifyStepsMode()) {
            int progressWidth = getProgressWidth() / this.steps;
            float progressHeight = (this.stepsHeight - getProgressHeight()) / 2.0f;
            for (int i = 0; i <= this.steps; i++) {
                float progressLeft = (getProgressLeft() + (i * progressWidth)) - (this.stepsWidth / 2.0f);
                this.stepDivRect.set(progressLeft, getProgressTop() - progressHeight, this.stepsWidth + progressLeft, getProgressBottom() + progressHeight);
                if (this.stepsBitmaps.isEmpty() || this.stepsBitmaps.size() <= i) {
                    paint.setColor(this.stepsColor);
                    RectF rectF = this.stepDivRect;
                    float f = this.stepsRadius;
                    canvas.drawRoundRect(rectF, f, f, paint);
                } else {
                    canvas.drawBitmap(this.stepsBitmaps.get(i), (Rect) null, this.stepDivRect, paint);
                }
            }
        }
    }

    public void onMeasureProgress(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e233f3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int paddingBottom = (i2 - getPaddingBottom()) - getPaddingTop();
        if (i2 <= 0) {
            return;
        }
        int i3 = this.gravity;
        if (i3 == 0) {
            float max = (this.leftSB.f() == 1 && this.rightSB.f() == 1) ? 0.0f : Math.max(this.leftSB.e(), this.rightSB.e());
            float max2 = Math.max(this.leftSB.k(), this.rightSB.k());
            int i4 = this.progressHeight;
            this.progressTop = (int) (max + (((max2 - (i4 / 2.0f)) - i4) / 2.0f));
            this.progressBottom = this.progressTop + i4;
        } else if (i3 == 1) {
            float max3 = paddingBottom - (Math.max(this.leftSB.k(), this.rightSB.k()) / 2.0f);
            int i5 = this.progressHeight;
            this.progressBottom = (int) (max3 + (i5 / 2.0f));
            this.progressTop = this.progressBottom - i5;
        } else {
            int paddingTop = getPaddingTop();
            int i6 = this.progressHeight;
            this.progressTop = paddingTop + ((paddingBottom - i6) / 2);
            this.progressBottom = this.progressTop + i6;
        }
        this.progressLeft = getPaddingLeft();
        this.progressRight = i - getPaddingRight();
        this.progressWidth = this.progressRight - this.progressLeft;
        this.progressDefaultDstRect.set(getProgressLeft(), getProgressTop(), getProgressRight(), getProgressBottom());
        this.progressPaddingRight = i - this.progressRight;
        if (this.progressRadius <= 0.0f) {
            this.progressRadius = (int) (this.progressHeight * 0.5f);
        }
        initProgressBitmap();
    }

    private void changeThumbActivateState(boolean z) {
        SeekBar seekBar;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52720d35", new Object[]{this, new Boolean(z)});
        } else if (z && (seekBar = this.currTouchSB) != null) {
            if (seekBar == this.leftSB) {
                z2 = true;
            }
            this.leftSB.c(z2);
            if (this.seekBarMode != 2) {
                return;
            }
            this.rightSB.c(!z2);
        } else {
            this.leftSB.c(false);
            if (this.seekBarMode != 2) {
                return;
            }
            this.rightSB.c(false);
        }
    }

    private FscrmidFavorFrameLayout findFscrmidFavorFrameLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FscrmidFavorFrameLayout) ipChange.ipc$dispatch("cfe4bacb", new Object[]{this});
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof FscrmidFavorFrameLayout) {
                return (FscrmidFavorFrameLayout) parent;
            }
        }
        return null;
    }

    private void initAttrs(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ed4775", new Object[]{this, attributeSet});
            return;
        }
        this.seekBarMode = 1;
        this.minProgress = 0.0f;
        this.maxProgress = 100.0f;
        this.minInterval = 0.0f;
        this.gravity = 2;
        this.progressColor = Color.parseColor("#80FFFFFF");
        this.progressRadius = -1.0f;
        this.progressDefaultColor = Color.parseColor(isInDarkTheme(getContext()) ? PROGRESS_DARK_DEFAULT_COLOR : PROGRESS_DEFAULT_COLOR);
        this.thumbProgressColor = Color.parseColor("#80FFFFFF");
        int a2 = b.a(getContext(), 2.0f);
        this.progressHeight = a2;
        this.normalProgressHeight = a2;
        this.thumbProgressHeight = this.normalProgressHeight << 1;
    }

    private static boolean isInDarkTheme(Context context) {
        Resources resources;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{context})).booleanValue() : context != null && (!(context instanceof Activity) || !((Activity) context).isFinishing()) && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && (configuration.uiMode & 48) == 32;
    }

    private void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.progressDefaultColor);
    }

    private void initProgressBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbfcd73", new Object[]{this});
            return;
        }
        if (this.progressBitmap == null) {
            this.progressBitmap = b.a(getContext(), this.progressWidth, this.progressHeight, this.progressDrawableId);
        }
        if (this.progressDefaultBitmap == null) {
            this.progressDefaultBitmap = b.a(getContext(), this.progressWidth, this.progressHeight, this.progressDefaultDrawableId);
        }
        if (this.seekingProgressBitmap != null) {
            return;
        }
        this.seekingProgressBitmap = b.a(getContext(), this.progressWidth, this.progressHeight, this.seekingProgressDrawableId);
    }

    private void initSeekBar(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e6a27c", new Object[]{this, attributeSet});
            return;
        }
        this.leftSB = new SeekBar(this, attributeSet, true);
        this.rightSB = new SeekBar(this, attributeSet, false);
        SeekBar seekBar = this.rightSB;
        if (this.seekBarMode != 1) {
            z = true;
        }
        seekBar.a(z);
    }

    private void initStepsBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5018d", new Object[]{this});
        } else if (verifyStepsMode() && this.stepsDrawableId != 0 && this.stepsBitmaps.isEmpty()) {
            Bitmap a2 = b.a(getContext(), (int) this.stepsWidth, (int) this.stepsHeight, this.stepsDrawableId);
            for (int i = 0; i <= this.steps; i++) {
                this.stepsBitmaps.add(a2);
            }
        }
    }

    private void onFinish(MotionEvent motionEvent) {
        float f;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d831bae", new Object[]{this, motionEvent});
            return;
        }
        if (verifyStepsMode() && this.stepsAutoBonding) {
            float calculateSeekBarPercent = calculateSeekBarPercent(getEventX(motionEvent));
            this.currTouchSB.a(new BigDecimal(calculateSeekBarPercent / f).setScale(0, RoundingMode.HALF_UP).intValue() * (1.0f / this.steps));
        }
        if (this.seekBarMode == 2) {
            this.rightSB.d(false);
        }
        this.leftSB.d(false);
        this.currTouchSB.o();
        resetCurrentSeekBarThumb();
        a[] rangeSeekBarState = getRangeSeekBarState();
        float f2 = rangeSeekBarState[0].b;
        float f3 = rangeSeekBarState[1].b;
        six sixVar = this.callback;
        if (sixVar != null) {
            sixVar.a(this, f2, f3, false);
        }
        six sixVar2 = this.callback;
        if (sixVar2 != null) {
            if (this.currTouchSB != this.leftSB) {
                z = false;
            }
            sixVar2.b(this, z);
        }
        this.isSeekBarSeeking = false;
        setThumbEnabled(this.isSeekBarSeeking);
        changeThumbActivateState(false);
        this.targetProgress = (int) f2;
        this.smoothProgressHandler.removeMessages(0);
    }

    private void onMoved(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eecc85", new Object[]{this, new Float(f)});
            return;
        }
        if (this.seekBarMode == 2 && this.leftSB.l == this.rightSB.l) {
            this.currTouchSB.o();
            six sixVar = this.callback;
            if (sixVar != null) {
                sixVar.b(this, this.currTouchSB == this.leftSB);
            }
            this.isSeekBarSeeking = false;
            setThumbEnabled(this.isSeekBarSeeking);
            if (f - this.touchDownX > 0.0f) {
                SeekBar seekBar = this.currTouchSB;
                if (seekBar != this.rightSB) {
                    seekBar.d(false);
                    resetCurrentSeekBarThumb();
                    this.currTouchSB = this.rightSB;
                }
            } else {
                SeekBar seekBar2 = this.currTouchSB;
                if (seekBar2 != this.leftSB) {
                    seekBar2.d(false);
                    resetCurrentSeekBarThumb();
                    this.currTouchSB = this.leftSB;
                }
            }
            six sixVar2 = this.callback;
            if (sixVar2 != null) {
                sixVar2.a(this, this.currTouchSB == this.leftSB);
            }
            this.isSeekBarSeeking = true;
            setThumbEnabled(this.isSeekBarSeeking);
        }
        scaleCurrentSeekBarThumb();
        SeekBar seekBar3 = this.currTouchSB;
        float f2 = 1.0f;
        if (seekBar3.m < 1.0f) {
            f2 = 0.1f + this.currTouchSB.m;
        }
        seekBar3.m = f2;
        this.currTouchSB.a(calculateSeekBarPercent(f));
        this.currTouchSB.d(true);
        this.touchDownX = f;
        if (this.callback != null) {
            a[] rangeSeekBarState = getRangeSeekBarState();
            this.callback.a(this, rangeSeekBarState[0].b, rangeSeekBarState[1].b, true);
        }
        invalidate();
        changeThumbActivateState(true);
    }

    private void onStart(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c453365f", new Object[]{this, motionEvent});
            return;
        }
        if (this.seekBarMode == 2) {
            if (this.rightSB.l >= 1.0f && this.leftSB.a(getEventX(motionEvent), getEventY(motionEvent))) {
                this.currTouchSB = this.leftSB;
                scaleCurrentSeekBarThumb();
            } else if (this.rightSB.a(getEventX(motionEvent), getEventY(motionEvent))) {
                this.currTouchSB = this.rightSB;
                scaleCurrentSeekBarThumb();
            } else {
                float progressLeft = (this.touchDownX - getProgressLeft()) / this.progressWidth;
                if (Math.abs(this.leftSB.l - progressLeft) < Math.abs(this.rightSB.l - progressLeft)) {
                    this.currTouchSB = this.leftSB;
                } else {
                    this.currTouchSB = this.rightSB;
                }
                this.currTouchSB.a(calculateSeekBarPercent(this.touchDownX));
            }
        } else {
            this.currTouchSB = this.leftSB;
            scaleCurrentSeekBarThumb();
        }
        six sixVar = this.callback;
        if (sixVar != null) {
            if (this.currTouchSB == this.leftSB) {
                z = true;
            }
            sixVar.a(this, z);
        }
        this.isSeekBarSeeking = true;
        setThumbEnabled(this.isSeekBarSeeking);
        changeThumbActivateState(true);
    }

    private void resetCurrentSeekBarThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f88346c", new Object[]{this});
            return;
        }
        SeekBar seekBar = this.currTouchSB;
        if (seekBar == null || seekBar.l() <= 1.0f || !this.isScaleThumb) {
            return;
        }
        this.isScaleThumb = false;
        this.currTouchSB.p();
    }

    private void scaleCurrentSeekBarThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a9fe11", new Object[]{this});
            return;
        }
        SeekBar seekBar = this.currTouchSB;
        if (seekBar == null || seekBar.l() <= 1.0f || this.isScaleThumb) {
            return;
        }
        this.isScaleThumb = true;
        this.currTouchSB.q();
    }

    private void updateProgressHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6e269f", new Object[]{this, new Integer(i)});
            return;
        }
        this.progressHeight = i;
        int paddingTop = getPaddingTop();
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - getPaddingTop();
        int i2 = this.progressHeight;
        this.progressTop = paddingTop + ((measuredHeight - i2) / 2);
        this.progressBottom = this.progressTop + i2;
        this.progressDefaultDstRect.set(getProgressLeft(), getProgressTop(), getProgressRight(), getProgressBottom());
        this.progressRadius = i / 2.0f;
    }

    private boolean verifyStepsMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42bc48fc", new Object[]{this})).booleanValue() : this.steps > 0 && this.stepsHeight > 0.0f && this.stepsWidth > 0.0f;
    }
}
