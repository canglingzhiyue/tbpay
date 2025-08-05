package com.taobao.taolive.room.ui.swipeback;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.swipeback.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class SwipeBackLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    private static final float DEFAULT_SCROLL_THRESHOLD = 0.3f;
    public static final int EDGE_ALL = 11;
    public static final int EDGE_BOTTOM = 8;
    private static final int[] EDGE_FLAGS;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int FULL_ALPHA = 255;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int OVERSCROLL_DISTANCE = 10;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private Activity mActivity;
    private int mContentLeft;
    private int mContentTop;
    private View mContentView;
    private e mDragHelper;
    private int mEdgeFlag;
    private boolean mEnable;
    private boolean mInLayout;
    private List<a> mListeners;
    private int mScrimColor;
    private float mScrimOpacity;
    private float mScrollPercent;
    private float mScrollThreshold;
    private Drawable mShadowBottom;
    private Drawable mShadowLeft;
    private Drawable mShadowRight;
    private Rect mTmpRect;
    private int mTrackingEdge;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);
    }

    /* loaded from: classes8.dex */
    public interface b extends a {
        void a();
    }

    public static /* synthetic */ Object ipc$super(SwipeBackLayout swipeBackLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1952076612) {
            if (hashCode != 1604649632) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.requestLayout();
            return null;
        }
        return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
    }

    public static /* synthetic */ int access$100(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6702438", new Object[]{swipeBackLayout})).intValue() : swipeBackLayout.mEdgeFlag;
    }

    public static /* synthetic */ int access$1002(SwipeBackLayout swipeBackLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c37ba861", new Object[]{swipeBackLayout, new Integer(i)})).intValue();
        }
        swipeBackLayout.mContentLeft = i;
        return i;
    }

    public static /* synthetic */ int access$1102(SwipeBackLayout swipeBackLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57ba1800", new Object[]{swipeBackLayout, new Integer(i)})).intValue();
        }
        swipeBackLayout.mContentTop = i;
        return i;
    }

    public static /* synthetic */ float access$1200(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac6298a5", new Object[]{swipeBackLayout})).floatValue() : swipeBackLayout.mScrollThreshold;
    }

    public static /* synthetic */ e access$200(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("8172ffe3", new Object[]{swipeBackLayout}) : swipeBackLayout.mDragHelper;
    }

    public static /* synthetic */ int access$300(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b5b653a", new Object[]{swipeBackLayout})).intValue() : swipeBackLayout.mTrackingEdge;
    }

    public static /* synthetic */ int access$302(SwipeBackLayout swipeBackLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c194d4d", new Object[]{swipeBackLayout, new Integer(i)})).intValue();
        }
        swipeBackLayout.mTrackingEdge = i;
        return i;
    }

    public static /* synthetic */ List access$400(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d1df837f", new Object[]{swipeBackLayout}) : swipeBackLayout.mListeners;
    }

    public static /* synthetic */ float access$500(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c046a639", new Object[]{swipeBackLayout})).floatValue() : swipeBackLayout.mScrollPercent;
    }

    public static /* synthetic */ float access$502(SwipeBackLayout swipeBackLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54962145", new Object[]{swipeBackLayout, new Float(f)})).floatValue();
        }
        swipeBackLayout.mScrollPercent = f;
        return f;
    }

    public static /* synthetic */ View access$600(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4b66808c", new Object[]{swipeBackLayout}) : swipeBackLayout.mContentView;
    }

    public static /* synthetic */ Drawable access$700(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("2580668f", new Object[]{swipeBackLayout}) : swipeBackLayout.mShadowLeft;
    }

    public static /* synthetic */ Drawable access$800(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("6022e6e", new Object[]{swipeBackLayout}) : swipeBackLayout.mShadowRight;
    }

    public static /* synthetic */ Drawable access$900(SwipeBackLayout swipeBackLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("e683f64d", new Object[]{swipeBackLayout}) : swipeBackLayout.mShadowBottom;
    }

    static {
        kge.a(-1567515486);
        EDGE_FLAGS = new int[]{1, 2, 8, 11};
    }

    public SwipeBackLayout(Context context) {
        this(context, null);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.TaoLiveSwipeBackLayoutStyle);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.mScrollThreshold = 0.3f;
        this.mEnable = true;
        this.mScrimColor = -1728053248;
        this.mTmpRect = new Rect();
        this.mDragHelper = e.a(this, new c());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TaoLiveSwipeBackLayout, i, R.style.TaoLiveSwipeBackLayout);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TaoLiveSwipeBackLayout_edge_size, -1);
        if (dimensionPixelSize > 0) {
            setEdgeSize(dimensionPixelSize);
        }
        setEdgeTrackingEnabled(EDGE_FLAGS[obtainStyledAttributes.getInt(R.styleable.TaoLiveSwipeBackLayout_edge_flag, 0)]);
        setShadow(obtainStyledAttributes.getResourceId(R.styleable.TaoLiveSwipeBackLayout_shadow_left, R.drawable.taolive_shadow_left), 1);
        obtainStyledAttributes.recycle();
        float f = getResources().getDisplayMetrics().density * 400.0f;
        this.mDragHelper.a(f);
        this.mDragHelper.b(f * 2.0f);
    }

    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.mContentView = view;
        }
    }

    public void setEnableGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67e78a9", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnable = z;
        }
    }

    public void setEdgeTrackingEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892aa8f1", new Object[]{this, new Integer(i)});
            return;
        }
        this.mEdgeFlag = i;
        this.mDragHelper.a(this.mEdgeFlag);
    }

    public void setEdgeSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4682717c", new Object[]{this, new Integer(i)});
        } else {
            this.mDragHelper.b(i);
        }
    }

    @Deprecated
    public void setSwipeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19623ec3", new Object[]{this, aVar});
        } else {
            addSwipeListener(aVar);
        }
    }

    public void addSwipeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99035164", new Object[]{this, aVar});
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(aVar);
    }

    public void removeSwipeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589d98e1", new Object[]{this, aVar});
            return;
        }
        List<a> list = this.mListeners;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    public void setScrollThresHold(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa05ee1d", new Object[]{this, new Float(f)});
        } else if (f >= 1.0f || f <= 0.0f) {
            throw new IllegalArgumentException("Threshold value should be between 0 and 1.0");
        } else {
            this.mScrollThreshold = f;
        }
    }

    public void setShadow(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("883d8656", new Object[]{this, drawable, new Integer(i)});
            return;
        }
        if ((i & 1) != 0) {
            this.mShadowLeft = drawable;
        } else if ((i & 2) != 0) {
            this.mShadowRight = drawable;
        } else if ((i & 8) != 0) {
            this.mShadowBottom = drawable;
        }
        invalidate();
    }

    public void setShadow(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5fd8dc9", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setShadow(getResources().getDrawable(i), i2);
        }
    }

    public void scrollToFinishActivity() {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa54e891", new Object[]{this});
            return;
        }
        int width = this.mContentView.getWidth();
        int height = this.mContentView.getHeight();
        int i3 = this.mEdgeFlag;
        if ((i3 & 1) != 0) {
            i = width + this.mShadowLeft.getIntrinsicWidth() + 10;
            this.mTrackingEdge = 1;
        } else if ((i3 & 2) != 0) {
            i = ((-width) - this.mShadowRight.getIntrinsicWidth()) - 10;
            this.mTrackingEdge = 2;
        } else {
            if ((i3 & 8) != 0) {
                this.mTrackingEdge = 8;
                i2 = ((-height) - this.mShadowBottom.getIntrinsicHeight()) - 10;
            }
            i = 0;
        }
        this.mDragHelper.a(this.mContentView, i, i2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mEnable) {
            return false;
        }
        try {
            return this.mDragHelper.a(motionEvent);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mEnable) {
            return false;
        }
        this.mDragHelper.b(motionEvent);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mInLayout = true;
        View view = this.mContentView;
        if (view != null) {
            int i5 = this.mContentLeft;
            view.layout(i5, this.mContentTop, view.getMeasuredWidth() + i5, this.mContentTop + this.mContentView.getMeasuredHeight());
        }
        this.mInLayout = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (this.mInLayout) {
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
        }
        if (view != this.mContentView) {
            z = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.mScrimOpacity > 0.0f && z && this.mDragHelper.a() != 0) {
            drawShadow(canvas, view);
            drawScrim(canvas, view);
        }
        return drawChild;
    }

    private void drawScrim(Canvas canvas, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcfd336", new Object[]{this, canvas, view});
            return;
        }
        int i = this.mScrimColor;
        int i2 = (i & 16777215) | (((int) ((((-16777216) & i) >>> 24) * this.mScrimOpacity)) << 24);
        int i3 = this.mTrackingEdge;
        if ((i3 & 1) != 0) {
            canvas.clipRect(0, 0, view.getLeft(), getHeight());
        } else if ((i3 & 2) != 0) {
            canvas.clipRect(view.getRight(), 0, getRight(), getHeight());
        } else if ((i3 & 8) != 0) {
            canvas.clipRect(view.getLeft(), view.getBottom(), getRight(), getHeight());
        }
        canvas.drawColor(i2);
    }

    private void drawShadow(Canvas canvas, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132900d8", new Object[]{this, canvas, view});
            return;
        }
        Rect rect = this.mTmpRect;
        view.getHitRect(rect);
        if ((this.mEdgeFlag & 1) != 0) {
            this.mShadowLeft.setBounds(rect.left - this.mShadowLeft.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            this.mShadowLeft.setAlpha((int) (this.mScrimOpacity * 255.0f));
            this.mShadowLeft.draw(canvas);
        }
        if ((this.mEdgeFlag & 2) != 0) {
            this.mShadowRight.setBounds(rect.right, rect.top, rect.right + this.mShadowRight.getIntrinsicWidth(), rect.bottom);
            this.mShadowRight.setAlpha((int) (this.mScrimOpacity * 255.0f));
            this.mShadowRight.draw(canvas);
        }
        if ((this.mEdgeFlag & 8) == 0) {
            return;
        }
        this.mShadowBottom.setBounds(rect.left, rect.bottom, rect.right, rect.bottom + this.mShadowBottom.getIntrinsicHeight());
        this.mShadowBottom.setAlpha((int) (this.mScrimOpacity * 255.0f));
        this.mShadowBottom.draw(canvas);
    }

    public void attachToActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c20aa8", new Object[]{this, activity});
            return;
        }
        this.mActivity = activity;
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842836});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        viewGroup2.setBackgroundResource(resourceId);
        viewGroup.removeView(viewGroup2);
        addView(viewGroup2);
        setContentView(viewGroup2);
        addSwipeListener(new com.taobao.taolive.room.ui.swipeback.c(activity));
        viewGroup.addView(this);
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        this.mScrimOpacity = 1.0f - this.mScrollPercent;
        if (!this.mDragHelper.a(true)) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* loaded from: classes8.dex */
    public class c extends e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        static {
            kge.a(2062578880);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1474194533) {
                super.a(((Number) objArr[0]).intValue());
                return null;
            } else if (hashCode != -416004310) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            }
        }

        private c() {
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public boolean a(View view, int i) {
            boolean b;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            boolean c = SwipeBackLayout.access$200(SwipeBackLayout.this).c(SwipeBackLayout.access$100(SwipeBackLayout.this), i);
            if (c) {
                if (SwipeBackLayout.access$200(SwipeBackLayout.this).c(1, i)) {
                    SwipeBackLayout.access$302(SwipeBackLayout.this, 1);
                } else if (SwipeBackLayout.access$200(SwipeBackLayout.this).c(2, i)) {
                    SwipeBackLayout.access$302(SwipeBackLayout.this, 2);
                } else if (SwipeBackLayout.access$200(SwipeBackLayout.this).c(8, i)) {
                    SwipeBackLayout.access$302(SwipeBackLayout.this, 8);
                }
                if (SwipeBackLayout.access$400(SwipeBackLayout.this) != null && !SwipeBackLayout.access$400(SwipeBackLayout.this).isEmpty()) {
                    for (a aVar : SwipeBackLayout.access$400(SwipeBackLayout.this)) {
                        aVar.a(SwipeBackLayout.access$300(SwipeBackLayout.this));
                    }
                }
                this.b = true;
            }
            if (SwipeBackLayout.access$100(SwipeBackLayout.this) == 1 || SwipeBackLayout.access$100(SwipeBackLayout.this) == 2) {
                b = SwipeBackLayout.access$200(SwipeBackLayout.this).b(2, i);
            } else if (SwipeBackLayout.access$100(SwipeBackLayout.this) == 8) {
                b = SwipeBackLayout.access$200(SwipeBackLayout.this).b(1, i);
            } else {
                if (SwipeBackLayout.access$100(SwipeBackLayout.this) == 11) {
                    z = true;
                }
                return c & z;
            }
            z = !b;
            return c & z;
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public int a(View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue() : SwipeBackLayout.access$100(SwipeBackLayout.this) & 3;
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public int b(View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9103723c", new Object[]{this, view})).intValue() : SwipeBackLayout.access$100(SwipeBackLayout.this) & 8;
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public void a(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.a(view, i, i2, i3, i4);
            if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 1) != 0) {
                SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                SwipeBackLayout.access$502(swipeBackLayout, Math.abs(i / (SwipeBackLayout.access$600(swipeBackLayout).getWidth() + SwipeBackLayout.access$700(SwipeBackLayout.this).getIntrinsicWidth())));
            } else if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 2) != 0) {
                SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                SwipeBackLayout.access$502(swipeBackLayout2, Math.abs(i / (SwipeBackLayout.access$600(swipeBackLayout2).getWidth() + SwipeBackLayout.access$800(SwipeBackLayout.this).getIntrinsicWidth())));
            } else if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 8) != 0) {
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                SwipeBackLayout.access$502(swipeBackLayout3, Math.abs(i2 / (SwipeBackLayout.access$600(swipeBackLayout3).getHeight() + SwipeBackLayout.access$900(SwipeBackLayout.this).getIntrinsicHeight())));
            }
            SwipeBackLayout.access$1002(SwipeBackLayout.this, i);
            SwipeBackLayout.access$1102(SwipeBackLayout.this, i2);
            SwipeBackLayout.this.invalidate();
            if (SwipeBackLayout.access$500(SwipeBackLayout.this) < SwipeBackLayout.access$1200(SwipeBackLayout.this) && !this.b) {
                this.b = true;
            }
            if (SwipeBackLayout.access$400(SwipeBackLayout.this) != null && !SwipeBackLayout.access$400(SwipeBackLayout.this).isEmpty()) {
                Iterator it = SwipeBackLayout.access$400(SwipeBackLayout.this).iterator();
                while (it.hasNext()) {
                    it.next();
                    SwipeBackLayout.access$200(SwipeBackLayout.this).a();
                    SwipeBackLayout.access$500(SwipeBackLayout.this);
                }
            }
            if (SwipeBackLayout.access$400(SwipeBackLayout.this) != null && !SwipeBackLayout.access$400(SwipeBackLayout.this).isEmpty() && SwipeBackLayout.access$200(SwipeBackLayout.this).a() == 1 && SwipeBackLayout.access$500(SwipeBackLayout.this) >= SwipeBackLayout.access$1200(SwipeBackLayout.this) && this.b) {
                this.b = false;
                Iterator it2 = SwipeBackLayout.access$400(SwipeBackLayout.this).iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
            if (SwipeBackLayout.access$500(SwipeBackLayout.this) < 1.0f || SwipeBackLayout.access$400(SwipeBackLayout.this) == null || SwipeBackLayout.access$400(SwipeBackLayout.this).isEmpty()) {
                return;
            }
            for (a aVar : SwipeBackLayout.access$400(SwipeBackLayout.this)) {
                if (aVar instanceof b) {
                    ((b) aVar).a();
                }
            }
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public void a(View view, float f, float f2) {
            int i;
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c23a8ea", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 1) != 0) {
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i2 = (i3 > 0 || (i3 == 0 && SwipeBackLayout.access$500(SwipeBackLayout.this) > SwipeBackLayout.access$1200(SwipeBackLayout.this))) ? width + SwipeBackLayout.access$700(SwipeBackLayout.this).getIntrinsicWidth() + 10 : 0;
            } else if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 2) != 0) {
                i2 = (f < 0.0f || (f == 0.0f && SwipeBackLayout.access$500(SwipeBackLayout.this) > SwipeBackLayout.access$1200(SwipeBackLayout.this))) ? -(width + SwipeBackLayout.access$700(SwipeBackLayout.this).getIntrinsicWidth() + 10) : 0;
            } else if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 8) != 0 && (f2 < 0.0f || (f2 == 0.0f && SwipeBackLayout.access$500(SwipeBackLayout.this) > SwipeBackLayout.access$1200(SwipeBackLayout.this)))) {
                i = -(height + SwipeBackLayout.access$900(SwipeBackLayout.this).getIntrinsicHeight() + 10);
                SwipeBackLayout.access$200(SwipeBackLayout.this).a(i2, i);
                SwipeBackLayout.this.invalidate();
            }
            i = 0;
            SwipeBackLayout.access$200(SwipeBackLayout.this).a(i2, i);
            SwipeBackLayout.this.invalidate();
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public int a(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 1) != 0) {
                return Math.min(view.getWidth(), Math.max(i, 0));
            }
            if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 2) == 0) {
                return 0;
            }
            return Math.min(0, Math.max(i, -view.getWidth()));
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public int b(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5dfe645c", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            if ((SwipeBackLayout.access$300(SwipeBackLayout.this) & 8) == 0) {
                return 0;
            }
            return Math.min(0, Math.max(i, -view.getHeight()));
        }

        @Override // com.taobao.taolive.room.ui.swipeback.e.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            super.a(i);
            if (SwipeBackLayout.access$400(SwipeBackLayout.this) == null || SwipeBackLayout.access$400(SwipeBackLayout.this).isEmpty()) {
                return;
            }
            Iterator it = SwipeBackLayout.access$400(SwipeBackLayout.this).iterator();
            while (it.hasNext()) {
                it.next();
                SwipeBackLayout.access$500(SwipeBackLayout.this);
            }
        }
    }
}
