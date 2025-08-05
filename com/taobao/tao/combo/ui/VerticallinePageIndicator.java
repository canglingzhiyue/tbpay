package com.taobao.tao.combo.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.ui.VerticalViewPager;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class VerticallinePageIndicator extends View implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FADE_FRAME_MS = 50;
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private int mCurrentPage;
    private int mFadeBy;
    private int mFadeDelay;
    private int mFadeLength;
    private final Runnable mFadeRunnable;
    private boolean mFades;
    private boolean mIsDragging;
    private float mLastMotionY;
    private VerticalViewPager.d mListener;
    private final Paint mPaint;
    private float mPositionOffset;
    private int mScrollState;
    private int mTouchSlop;
    private VerticalViewPager mViewPager;

    static {
        kge.a(-1663928708);
        kge.a(1779696112);
    }

    public static /* synthetic */ Object ipc$super(VerticallinePageIndicator verticallinePageIndicator, String str, Object... objArr) {
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
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$000(VerticallinePageIndicator verticallinePageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("835fceb2", new Object[]{verticallinePageIndicator})).booleanValue() : verticallinePageIndicator.mFades;
    }

    public static /* synthetic */ Paint access$100(VerticallinePageIndicator verticallinePageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Paint) ipChange.ipc$dispatch("d67cd6fe", new Object[]{verticallinePageIndicator}) : verticallinePageIndicator.mPaint;
    }

    public static /* synthetic */ int access$200(VerticallinePageIndicator verticallinePageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d39fcdf", new Object[]{verticallinePageIndicator})).intValue() : verticallinePageIndicator.mFadeBy;
    }

    public static /* synthetic */ Runnable access$300(VerticallinePageIndicator verticallinePageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("c18f47a9", new Object[]{verticallinePageIndicator}) : verticallinePageIndicator.mFadeRunnable;
    }

    public VerticallinePageIndicator(Context context) {
        this(context, null);
    }

    public VerticallinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiUnderlinePageIndicatorStyle);
    }

    public VerticallinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint(1);
        this.mLastMotionY = -1.0f;
        this.mActivePointerId = -1;
        this.mFadeRunnable = new Runnable() { // from class: com.taobao.tao.combo.ui.VerticallinePageIndicator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!VerticallinePageIndicator.access$000(VerticallinePageIndicator.this)) {
                } else {
                    int max = Math.max(VerticallinePageIndicator.access$100(VerticallinePageIndicator.this).getAlpha() - VerticallinePageIndicator.access$200(VerticallinePageIndicator.this), 0);
                    VerticallinePageIndicator.access$100(VerticallinePageIndicator.this).setAlpha(max);
                    VerticallinePageIndicator.this.invalidate();
                    if (max <= 0) {
                        return;
                    }
                    VerticallinePageIndicator.this.postDelayed(this, 50L);
                }
            }
        };
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        boolean z = resources.getBoolean(R.bool.default_underline_indicator_fades);
        int integer = resources.getInteger(R.integer.default_underline_indicator_fade_delay);
        int integer2 = resources.getInteger(R.integer.default_underline_indicator_fade_length);
        int color = resources.getColor(R.color.default_underline_indicator_selected_color);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.UnderlinePageIndicator, i, 0);
        setFades(obtainStyledAttributes.getBoolean(R.styleable.UnderlinePageIndicator_fades, z));
        setSelectedColor(obtainStyledAttributes.getColor(R.styleable.UnderlinePageIndicator_selectedColor, color));
        setFadeDelay(obtainStyledAttributes.getInteger(R.styleable.UnderlinePageIndicator_fadeDelay, integer));
        setFadeLength(obtainStyledAttributes.getInteger(R.styleable.UnderlinePageIndicator_fadeLength, integer2));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.UnderlinePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    public boolean getFades() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbb65bcc", new Object[]{this})).booleanValue() : this.mFades;
    }

    public void setFades(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93a1e18", new Object[]{this, new Boolean(z)});
        } else if (z == this.mFades) {
        } else {
            this.mFades = z;
            if (z) {
                post(this.mFadeRunnable);
                return;
            }
            removeCallbacks(this.mFadeRunnable);
            this.mPaint.setAlpha(255);
            invalidate();
        }
    }

    public int getFadeDelay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("959d55ab", new Object[]{this})).intValue() : this.mFadeDelay;
    }

    public void setFadeDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6043c57", new Object[]{this, new Integer(i)});
        } else {
            this.mFadeDelay = i;
        }
    }

    public int getFadeLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c82c70f2", new Object[]{this})).intValue() : this.mFadeLength;
    }

    public void setFadeLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7438bb58", new Object[]{this, new Integer(i)});
            return;
        }
        this.mFadeLength = i;
        this.mFadeBy = 255 / (this.mFadeLength / 50);
    }

    public int getSelectedColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64a8bd4c", new Object[]{this})).intValue() : this.mPaint.getColor();
    }

    public void setSelectedColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79ae2d6", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        VerticalViewPager verticalViewPager = this.mViewPager;
        if (verticalViewPager == null || (a2 = verticalViewPager.getAdapter().a()) == 0) {
            return;
        }
        if (this.mCurrentPage >= a2) {
            setCurrentItem(a2 - 1);
            return;
        }
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / (a2 * 1.0f);
        float width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        float paddingTop = getPaddingTop() + ((this.mCurrentPage + this.mPositionOffset) * height);
        canvas.drawRect(width, paddingTop, width + getPaddingRight(), paddingTop + height, this.mPaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        VerticalViewPager verticalViewPager = this.mViewPager;
        if (verticalViewPager == null || verticalViewPager.getAdapter().a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            this.mLastMotionY = motionEvent.getY();
        } else {
            if (action != 1) {
                if (action == 2) {
                    float y = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                    float f = y - this.mLastMotionY;
                    if (!this.mIsDragging && Math.abs(f) > this.mTouchSlop) {
                        this.mIsDragging = true;
                    }
                    if (this.mIsDragging) {
                        this.mLastMotionY = y;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                        this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                        if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.mActivePointerId) {
                            if (actionIndex2 == 0) {
                                i = 1;
                            }
                            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
                        }
                        this.mLastMotionY = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                    }
                }
            }
            if (!this.mIsDragging) {
                int a2 = this.mViewPager.getAdapter().a();
                float height = getHeight();
                float f2 = height / 2.0f;
                float f3 = height / 6.0f;
                if (this.mCurrentPage > 0 && motionEvent.getY() < f2 - f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage - 1);
                    }
                    return true;
                } else if (this.mCurrentPage < a2 - 1 && motionEvent.getY() > f2 + f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage + 1);
                    }
                    return true;
                }
            }
            this.mIsDragging = false;
            this.mActivePointerId = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        }
        return true;
    }

    public void setViewPager(VerticalViewPager verticalViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18813bb0", new Object[]{this, verticalViewPager});
            return;
        }
        VerticalViewPager verticalViewPager2 = this.mViewPager;
        if (verticalViewPager2 == verticalViewPager) {
            return;
        }
        if (verticalViewPager2 != null) {
            verticalViewPager2.setOnPageChangeListener(null);
        }
        if (verticalViewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.mViewPager = verticalViewPager;
        this.mViewPager.setOnPageChangeListener(this);
        invalidate();
        post(new Runnable() { // from class: com.taobao.tao.combo.ui.VerticallinePageIndicator.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!VerticallinePageIndicator.access$000(VerticallinePageIndicator.this)) {
                } else {
                    VerticallinePageIndicator verticallinePageIndicator = VerticallinePageIndicator.this;
                    verticallinePageIndicator.post(VerticallinePageIndicator.access$300(verticallinePageIndicator));
                }
            }
        });
    }

    public void setViewPager(VerticalViewPager verticalViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a6ad53", new Object[]{this, verticalViewPager, new Integer(i)});
            return;
        }
        setViewPager(verticalViewPager);
        setCurrentItem(i);
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        VerticalViewPager verticalViewPager = this.mViewPager;
        if (verticalViewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        verticalViewPager.setCurrentItem(i);
        this.mCurrentPage = i;
        invalidate();
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
        } else {
            invalidate();
        }
    }

    @Override // com.taobao.tao.combo.ui.VerticalViewPager.d
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollState = i;
        VerticalViewPager.d dVar = this.mListener;
        if (dVar == null) {
            return;
        }
        dVar.onPageScrollStateChanged(i);
    }

    @Override // com.taobao.tao.combo.ui.VerticalViewPager.d
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        this.mCurrentPage = i;
        this.mPositionOffset = f;
        if (this.mFades) {
            if (i2 > 0) {
                removeCallbacks(this.mFadeRunnable);
                this.mPaint.setAlpha(255);
            } else if (this.mScrollState != 1) {
                postDelayed(this.mFadeRunnable, this.mFadeDelay);
            }
        }
        invalidate();
        VerticalViewPager.d dVar = this.mListener;
        if (dVar == null) {
            return;
        }
        dVar.onPageScrolled(i, f, i2);
    }

    @Override // com.taobao.tao.combo.ui.VerticalViewPager.d
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mScrollState == 0) {
            this.mCurrentPage = i;
            this.mPositionOffset = 0.0f;
            invalidate();
            this.mFadeRunnable.run();
        }
        VerticalViewPager.d dVar = this.mListener;
        if (dVar == null) {
            return;
        }
        dVar.onPageSelected(i);
    }

    public void setOnPageChangeListener(VerticalViewPager.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f917518", new Object[]{this, dVar});
        } else {
            this.mListener = dVar;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mCurrentPage = savedState.currentPage;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.mCurrentPage;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        int currentPage;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }

        static {
            kge.a(-366525038);
            CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.taobao.tao.combo.ui.VerticallinePageIndicator.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.tao.combo.ui.VerticallinePageIndicator$SavedState] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.tao.combo.ui.VerticallinePageIndicator$SavedState[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public SavedState a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("1a28104e", new Object[]{this, parcel}) : new SavedState(parcel);
                }

                public SavedState[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("b44f8bbd", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }
            };
        }
    }
}
