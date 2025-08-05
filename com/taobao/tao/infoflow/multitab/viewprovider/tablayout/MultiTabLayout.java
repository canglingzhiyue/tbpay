package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.util.DensityUtil;
import tb.kge;

/* loaded from: classes8.dex */
public class MultiTabLayout extends TabLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_INDICATOR_BOTTOM_OFFSET_DP = 2;
    private static final int DEFAULT_INDICATOR_HEIGHT_DP = 2;
    private static final int DEFAULT_INDICATOR_RADIUS_DP = 2;
    private static final int DEFAULT_INDICATOR_WIDTH_DP = 15;
    private static final int SCROLL_STATE_CHECK_INTERVAL = 100;
    private static final String TAG = "MultiTabLayout";
    private a indicatorConfig;
    private int mCurrentSelectIndex;
    private float mDownX;
    private final Handler mHandler;
    private int mIndicatorLeft;
    private Paint mIndicatorPaint;
    private RectF mIndicatorRect;
    private float mMoveX;
    private a.e mOnPreCreateListener;
    private a.InterfaceC0864a mOnScrollListener;
    private final Runnable mScrollStopRunnable;
    private boolean mShowIndicator;
    private final TabLayout.b tabSelectListener;

    /* loaded from: classes8.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f20649a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(1208630492);
        }

        public a() {
        }
    }

    static {
        kge.a(-1680610961);
    }

    public static /* synthetic */ Object ipc$super(MultiTabLayout multiTabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 284424147:
                super.addOnTabSelectedListener((TabLayout.b) objArr[0]);
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ a.InterfaceC0864a access$000(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0864a) ipChange.ipc$dispatch("fc053c93", new Object[]{multiTabLayout}) : multiTabLayout.mOnScrollListener;
    }

    public static /* synthetic */ int access$100(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50b58e8b", new Object[]{multiTabLayout})).intValue() : multiTabLayout.mCurrentSelectIndex;
    }

    public static /* synthetic */ int access$102(MultiTabLayout multiTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7ff5a9c", new Object[]{multiTabLayout, new Integer(i)})).intValue();
        }
        multiTabLayout.mCurrentSelectIndex = i;
        return i;
    }

    public MultiTabLayout(Context context) {
        super(context);
        this.mIndicatorLeft = -1;
        this.mDownX = 0.0f;
        this.mMoveX = 0.0f;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mScrollStopRunnable = new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (MultiTabLayout.access$000(MultiTabLayout.this) == null) {
                } else {
                    MultiTabLayout.access$000(MultiTabLayout.this).a();
                }
            }
        };
        this.tabSelectListener = new TabLayout.b() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.design.widget.TabLayout.b
            public void onTabReselected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("802b1091", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabUnselected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fbd0156b", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabSelected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e6b72ea4", new Object[]{this, dVar});
                    return;
                }
                MultiTabLayout.access$102(MultiTabLayout.this, dVar.d());
                g.a(MultiTabLayout.TAG, "tabSelectListener mCurrentSelectIndex:" + MultiTabLayout.access$100(MultiTabLayout.this));
            }
        };
        init();
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIndicatorLeft = -1;
        this.mDownX = 0.0f;
        this.mMoveX = 0.0f;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mScrollStopRunnable = new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (MultiTabLayout.access$000(MultiTabLayout.this) == null) {
                } else {
                    MultiTabLayout.access$000(MultiTabLayout.this).a();
                }
            }
        };
        this.tabSelectListener = new TabLayout.b() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.design.widget.TabLayout.b
            public void onTabReselected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("802b1091", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabUnselected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fbd0156b", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabSelected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e6b72ea4", new Object[]{this, dVar});
                    return;
                }
                MultiTabLayout.access$102(MultiTabLayout.this, dVar.d());
                g.a(MultiTabLayout.TAG, "tabSelectListener mCurrentSelectIndex:" + MultiTabLayout.access$100(MultiTabLayout.this));
            }
        };
        init();
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIndicatorLeft = -1;
        this.mDownX = 0.0f;
        this.mMoveX = 0.0f;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mScrollStopRunnable = new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (MultiTabLayout.access$000(MultiTabLayout.this) == null) {
                } else {
                    MultiTabLayout.access$000(MultiTabLayout.this).a();
                }
            }
        };
        this.tabSelectListener = new TabLayout.b() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.design.widget.TabLayout.b
            public void onTabReselected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("802b1091", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabUnselected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fbd0156b", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabSelected(TabLayout.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e6b72ea4", new Object[]{this, dVar});
                    return;
                }
                MultiTabLayout.access$102(MultiTabLayout.this, dVar.d());
                g.a(MultiTabLayout.TAG, "tabSelectListener mCurrentSelectIndex:" + MultiTabLayout.access$100(MultiTabLayout.this));
            }
        };
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mIndicatorPaint = new Paint();
        this.mIndicatorPaint.setStyle(Paint.Style.FILL);
        this.mIndicatorPaint.setAntiAlias(true);
        this.indicatorConfig = new a();
        this.indicatorConfig.f20649a = DensityUtil.dip2px(getContext(), 2.0f);
        this.indicatorConfig.b = DensityUtil.dip2px(getContext(), 15.0f);
        this.indicatorConfig.d = DensityUtil.dip2px(getContext(), 2.0f);
        this.indicatorConfig.c = DensityUtil.dip2px(getContext(), 2.0f);
        this.mIndicatorRect = new RectF();
        addOnTabSelectedListener(this.tabSelectListener);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!n.n().e()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mMoveX = 0.0f;
        } else if (action == 1) {
            g.a(TAG, "onInterceptTouchEvent ACTION_UP mDownX:" + this.mDownX + ",mMoveX:" + this.mMoveX);
            float f = this.mMoveX;
            if (f != 0.0f && Math.abs(this.mDownX - f) > 1.0f) {
                g.a(TAG, "onInterceptTouchEvent 滑动拦截");
                return super.onInterceptTouchEvent(motionEvent);
            }
            int[] viewCoordinates = getViewCoordinates(this.mCurrentSelectIndex);
            if (viewCoordinates == null || viewCoordinates.length < 2) {
                g.a(TAG, "onInterceptTouchEvent 坐标计算异常");
                return super.onInterceptTouchEvent(motionEvent);
            }
            float f2 = this.mDownX;
            if (f2 > viewCoordinates[1]) {
                int findTargetSelectIndex = findTargetSelectIndex(f2, this.mCurrentSelectIndex + 1, getTabCount());
                g.a(TAG, "onInterceptTouchEvent 查找右侧 targetSelectIndex:" + findTargetSelectIndex);
                a.e eVar = this.mOnPreCreateListener;
                if (eVar != null && findTargetSelectIndex != -1) {
                    eVar.a(findTargetSelectIndex);
                }
            }
            float f3 = this.mDownX;
            if (f3 < viewCoordinates[0]) {
                int findTargetSelectIndex2 = findTargetSelectIndex(f3, 0, this.mCurrentSelectIndex);
                g.a(TAG, "onInterceptTouchEvent 查找左侧 targetSelectIndex:" + findTargetSelectIndex2);
                a.e eVar2 = this.mOnPreCreateListener;
                if (eVar2 != null) {
                    eVar2.a(findTargetSelectIndex2);
                }
            }
            this.mDownX = 0.0f;
            this.mMoveX = 0.0f;
        } else if (action == 2) {
            this.mMoveX = motionEvent.getX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private int findTargetSelectIndex(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6892d280", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)})).intValue();
        }
        while (i < i2) {
            g.a(TAG, "查询坐标 i:" + i);
            int[] viewCoordinates = getViewCoordinates(i);
            if (viewCoordinates != null && viewCoordinates.length >= 2 && viewCoordinates[0] <= f && viewCoordinates[1] >= f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private int[] getViewCoordinates(int i) {
        View b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f16fd4e8", new Object[]{this, new Integer(i)});
        }
        TabLayout.d tabAt = getTabAt(i);
        if (tabAt == null || (b = tabAt.b()) == null) {
            return null;
        }
        Rect rect = new Rect();
        b.getGlobalVisibleRect(rect);
        return new int[]{rect.left, rect.right};
    }

    @Override // android.support.design.widget.TabLayout
    public void addOnTabSelectedListener(TabLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f3f7d3", new Object[]{this, bVar});
        } else {
            super.addOnTabSelectedListener(bVar);
        }
    }

    public void setPreCreateListener(a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f49d870", new Object[]{this, eVar});
        } else {
            this.mOnPreCreateListener = eVar;
        }
    }

    public void setIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c30a586", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorConfig.e = i;
        this.mIndicatorPaint.setColor(i);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public a getIndicatorConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("43528f57", new Object[]{this}) : this.indicatorConfig;
    }

    public void setShowIndicator(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5627edd", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowIndicator = z;
        }
    }

    public void setIndicatorBottomOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3baad731", new Object[]{this, new Integer(i)});
        } else {
            this.indicatorConfig.c = i;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(final int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.mOnScrollListener != null) {
            this.mHandler.post(new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MultiTabLayout.access$000(MultiTabLayout.this).l_(i);
                    }
                }
            });
        }
        if (this.mOnScrollListener == null) {
            return;
        }
        this.mHandler.postDelayed(this.mScrollStopRunnable, 100L);
    }

    public void setScrollListener(a.InterfaceC0864a interfaceC0864a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606fc8a2", new Object[]{this, interfaceC0864a});
        } else {
            this.mOnScrollListener = interfaceC0864a;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!this.mShowIndicator || (i = this.mIndicatorLeft) < 0) {
            return;
        }
        this.mIndicatorRect.set(i, (getHeight() - this.indicatorConfig.f20649a) - this.indicatorConfig.c, this.indicatorConfig.b + i, getHeight() - this.indicatorConfig.c);
        canvas.drawRoundRect(this.mIndicatorRect, this.indicatorConfig.d, this.indicatorConfig.d, this.mIndicatorPaint);
    }

    public RectF getIndicatorRect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("c7d36203", new Object[]{this}) : this.mIndicatorRect;
    }

    public void updateIndicatorPosition(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac43b33", new Object[]{this, new Integer(i), new Float(f)});
        } else if ((!n.n().e() && Math.abs(i - getSelectedTabPosition()) > 1) || !this.mShowIndicator) {
        } else {
            updateIndicatorPositionInternal(i, f);
        }
    }

    private void updateIndicatorPositionInternal(int i, float f) {
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405f4d50", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        View childTabView = getChildTabView(i);
        TabLayout.d tabAt = getTabAt(i);
        if (tabAt == null) {
            return;
        }
        View b = tabAt.b();
        if (childTabView == null || childTabView.getWidth() <= 0) {
            i2 = -1;
        } else {
            int paddingLeft = b == null ? 0 : b.getPaddingLeft();
            if (b != null) {
                i3 = b.getPaddingRight();
            }
            i2 = childTabView.getLeft() + paddingLeft + ((((childTabView.getWidth() - paddingLeft) - i3) - this.indicatorConfig.b) / 2);
            if (f > 0.0f && i < getTabCount() - 1) {
                View childTabView2 = getChildTabView(i + 1);
                if (childTabView2 == null) {
                    return;
                }
                i2 = (int) (((childTabView2.getLeft() + ((childTabView2.getWidth() - this.indicatorConfig.b) / 2)) * f) + ((1.0f - f) * i2));
            }
        }
        setIndicatorPosition(i2);
    }

    public View getChildTabView(int i) {
        View b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bbacd88a", new Object[]{this, new Integer(i)});
        }
        TabLayout.d tabAt = getTabAt(i);
        if (tabAt != null && (b = tabAt.b()) != null && b.getParent() != null) {
            return (ViewGroup) b.getParent();
        }
        return null;
    }

    private void setIndicatorPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadc4d06", new Object[]{this, new Integer(i)});
        } else if (i == this.mIndicatorLeft) {
        } else {
            this.mIndicatorLeft = i;
            invalidate();
        }
    }
}
