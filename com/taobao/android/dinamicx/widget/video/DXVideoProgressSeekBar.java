package com.taobao.android.dinamicx.widget.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gbg;

/* loaded from: classes5.dex */
public class DXVideoProgressSeekBar extends AppCompatSeekBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isTouching;
    private int mProgressHeight;
    private int mProgressRealWidth;
    private GradientDrawable mThumbDrawable;
    private int mThumbHeight;
    private Rect mThumbRect;
    private int mThumbWidth;
    private int middleProgressHeight;
    private int middleThumbSize;
    private int normalProgressHeight;
    private int normalThumbSize;
    private ThumbState thumbState;
    private long touchMaxY;
    private int touchProgressHeight;
    private int touchThumbSize;
    private boolean touchingStateChanged;

    /* renamed from: com.taobao.android.dinamicx.widget.video.DXVideoProgressSeekBar$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12189a = new int[ThumbState.values().length];

        static {
            try {
                f12189a[ThumbState.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12189a[ThumbState.TOUCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum ThumbState {
        NORMAL,
        MIDDLE,
        TOUCH
    }

    public static /* synthetic */ Object ipc$super(DXVideoProgressSeekBar dXVideoProgressSeekBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 1389530587) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public DXVideoProgressSeekBar(Context context) {
        this(context, null);
    }

    public DXVideoProgressSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXVideoProgressSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbRect = new Rect();
        initThumb();
    }

    public void setTouchMaxY(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba3094b", new Object[]{this, new Long(j)});
        } else {
            this.touchMaxY = j;
        }
    }

    private void initThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc9c82d", new Object[]{this});
            return;
        }
        this.normalThumbSize = gbg.a(getContext(), 3.0f);
        this.middleThumbSize = gbg.a(getContext(), 6.0f);
        this.touchThumbSize = gbg.a(getContext(), 10.0f);
        this.normalProgressHeight = gbg.a(getContext(), 2.0f);
        this.middleProgressHeight = gbg.a(getContext(), 4.0f);
        this.touchProgressHeight = gbg.a(getContext(), 8.0f);
        this.mThumbDrawable = new GradientDrawable();
        this.mThumbDrawable.setColor(-1);
        this.mThumbDrawable.setShape(1);
        setThumbState(ThumbState.NORMAL);
    }

    private void setThumbStyle(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba7c4e4", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mThumbDrawable.setSize(i, i);
        this.mThumbDrawable.setCornerRadius(i / 2.0f);
        this.mThumbWidth = i;
        this.mThumbHeight = i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i2;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (this.thumbState != ThumbState.NORMAL) {
                    i3 = gbg.a(getContext(), 1.0f);
                }
                marginLayoutParams.bottomMargin = i3;
            }
        }
        requestLayout();
    }

    public void setThumbState(ThumbState thumbState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a850e7", new Object[]{this, thumbState});
            return;
        }
        this.thumbState = thumbState;
        int i = AnonymousClass1.f12189a[thumbState.ordinal()];
        if (i == 1 || i == 2) {
            setThumbStyle(this.middleThumbSize, this.middleProgressHeight);
        } else {
            setThumbStyle(this.normalThumbSize, this.normalProgressHeight);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.mProgressRealWidth = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.mProgressHeight = getHeight();
    }

    @Override // android.support.v7.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mThumbDrawable != null) {
            setThumbPosition(this.mThumbRect);
            this.mThumbDrawable.setBounds(this.mThumbRect);
            this.mThumbDrawable.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 != 3) goto L11;
     */
    @Override // android.widget.AbsSeekBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.video.DXVideoProgressSeekBar.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            r1[r4] = r12
            java.lang.String r12 = "a9b14c3a"
            java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L1c:
            int r0 = r12.getAction()
            r1 = 3
            if (r0 == 0) goto L42
            if (r0 == r4) goto L32
            if (r0 == r2) goto L2a
            if (r0 == r1) goto L32
            goto L6a
        L2a:
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L6a
        L32:
            boolean r0 = r11.isTouching
            if (r0 == 0) goto L3a
            r11.touchingStateChanged = r4
            r11.isTouching = r3
        L3a:
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L6a
        L42:
            float r0 = r12.getY()
            int r2 = r11.getBottom()
            long r5 = (long) r2
            long r7 = r11.touchMaxY
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L54
            goto L5b
        L54:
            int r2 = r11.getHeight()
            int r2 = r2 * 3
            long r7 = (long) r2
        L5b:
            long r5 = r5 - r7
            float r1 = (float) r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L63
            r11.isTouching = r4
        L63:
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
        L6a:
            boolean r0 = r11.isTouching
            if (r0 != 0) goto L74
            boolean r0 = r11.touchingStateChanged
            if (r0 == 0) goto L73
            goto L74
        L73:
            return r4
        L74:
            r11.touchingStateChanged = r3
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.video.DXVideoProgressSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue() : this.isTouching;
    }

    public void setThumbPosition(Rect rect) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfcf6835", new Object[]{this, rect});
            return;
        }
        float progress = (float) (((getProgress() * this.mProgressRealWidth) / getMax()) + 0.5d);
        int i3 = this.mThumbWidth;
        if (progress < i3 / 2.0f) {
            int paddingLeft = getPaddingLeft();
            int i4 = this.mThumbWidth;
            i2 = (int) ((paddingLeft - (i4 / 2)) + progress);
            i = i4 + i2;
        } else if ((i3 / 2) + progress > this.mProgressRealWidth + getPaddingLeft()) {
            i2 = this.mProgressRealWidth + getPaddingLeft();
            i = i2 + this.mThumbWidth;
        } else {
            int i5 = (int) progress;
            int i6 = this.mThumbWidth;
            i = i5 + (i6 / 2);
            i2 = i5 - (i6 / 2);
        }
        int i7 = this.mThumbHeight;
        int i8 = (this.mProgressHeight / 2) - (i7 / 2);
        rect.set(i2, i8, i, i7 + i8);
    }
}
