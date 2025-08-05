package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.tao.flexbox.layoutmanager.component.m;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh.FakeHeaderView;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ohc;
import tb.ohd;
import tb.oic;
import tb.oid;
import tb.tds;

/* loaded from: classes8.dex */
public class TNodeRecyclerView extends TRecyclerView implements View.OnTouchListener, tds {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEYBOARD_DISMISS_MODE_DRAG = "drag";
    public static final int RECYCLER_MOVE_OFFSET_FLAG = 16;
    private boolean disableTouch;
    private boolean enableEdgeEffect;
    private float fadingEdgeEnd;
    private float fadingEdgeStart;
    private boolean firstOnScrollIgnored;
    private boolean hookTouchEvent;
    private boolean inTouch;
    private boolean isInSlowScroll;
    private boolean isScrollUp;
    private boolean isScrolling;
    private String keyBoardDismissMode;
    private float lastX;
    private float lastY;
    private m listViewComponent;
    private int mDownRawX;
    private int mDownRawY;
    private float mDx;
    private float mDy;
    public boolean mEnableNestedSlide;
    private boolean mHaveHideKeyBoard;
    private com.taobao.tao.flexbox.layoutmanager.module.element.a mKeyBoardDismissListener;
    public float mLastDispatchDownX;
    public float mLastDispatchDownY;
    private float mMoveY;
    private float mX;
    private float mY;
    private int minScrollY;
    private boolean needResetOffsetInWindow;
    private List<ScrollChangeListener> scrollListeners;
    private int totalX;
    private int totalY;
    private List<oid> velocityTrackListeners;

    static {
        kge.a(-1366422855);
        kge.a(-468432129);
        kge.a(-2026558253);
    }

    public static /* synthetic */ Object ipc$super(TNodeRecyclerView tNodeRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1770652179:
                return new Float(super.getTopFadingEdgeStrength());
            case -1708092539:
                return new Boolean(super.dispatchNestedPreScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (int[]) objArr[2], (int[]) objArr[3], ((Number) objArr[4]).intValue()));
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1228744384:
                return new Boolean(super.canScrollVertically(((Number) objArr[0]).intValue()));
            case -886384698:
                return new Boolean(super.dispatchNestedPreScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (int[]) objArr[2], (int[]) objArr[3]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 316357487:
                return new Float(super.getBottomFadingEdgeStrength());
            case 570946804:
                return new Float(super.getRightFadingEdgeStrength());
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1162030921:
                super.setClipToPadding(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 2041665995:
                return new Float(super.getLeftFadingEdgeStrength());
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(TNodeRecyclerView tNodeRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327b4a52", new Object[]{tNodeRecyclerView, new Integer(i)});
        } else {
            tNodeRecyclerView.fireVelocityChanged(i);
        }
    }

    public static /* synthetic */ boolean access$1000(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("286e3406", new Object[]{tNodeRecyclerView})).booleanValue() : tNodeRecyclerView.firstOnScrollIgnored;
    }

    public static /* synthetic */ boolean access$1002(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cdbf698", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.firstOnScrollIgnored = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db50112a", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.isInSlowScroll = z;
        return z;
    }

    public static /* synthetic */ boolean access$1102(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e2d8619", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.isScrollUp = z;
        return z;
    }

    public static /* synthetic */ int access$1200(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("614a2cb3", new Object[]{tNodeRecyclerView})).intValue() : tNodeRecyclerView.totalX;
    }

    public static /* synthetic */ int access$1202(TNodeRecyclerView tNodeRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f7ed5b8", new Object[]{tNodeRecyclerView, new Integer(i)})).intValue();
        }
        tNodeRecyclerView.totalX = i;
        return i;
    }

    public static /* synthetic */ int access$1300(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fdb82912", new Object[]{tNodeRecyclerView})).intValue() : tNodeRecyclerView.totalY;
    }

    public static /* synthetic */ int access$1302(TNodeRecyclerView tNodeRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70d06539", new Object[]{tNodeRecyclerView, new Integer(i)})).intValue();
        }
        tNodeRecyclerView.totalY = i;
        return i;
    }

    public static /* synthetic */ float access$1400(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9a26256e", new Object[]{tNodeRecyclerView})).floatValue() : tNodeRecyclerView.mDy;
    }

    public static /* synthetic */ float access$1500(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("369421cd", new Object[]{tNodeRecyclerView})).floatValue() : tNodeRecyclerView.mMoveY;
    }

    public static /* synthetic */ void access$200(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d117b8f", new Object[]{tNodeRecyclerView});
        } else {
            tNodeRecyclerView.fireScrollFast();
        }
    }

    public static /* synthetic */ void access$300(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297f77ee", new Object[]{tNodeRecyclerView});
        } else {
            tNodeRecyclerView.fireScrollSlow();
        }
    }

    public static /* synthetic */ boolean access$402(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af44bfad", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.isScrolling = z;
        return z;
    }

    public static /* synthetic */ float access$502(TNodeRecyclerView tNodeRecyclerView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0960406", new Object[]{tNodeRecyclerView, new Float(f)})).floatValue();
        }
        tNodeRecyclerView.lastX = f;
        return f;
    }

    public static /* synthetic */ float access$602(TNodeRecyclerView tNodeRecyclerView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91e79387", new Object[]{tNodeRecyclerView, new Float(f)})).floatValue();
        }
        tNodeRecyclerView.lastY = f;
        return f;
    }

    public static /* synthetic */ m access$700(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("7ffad629", new Object[]{tNodeRecyclerView}) : tNodeRecyclerView.listViewComponent;
    }

    public static /* synthetic */ boolean access$800(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("37a565cd", new Object[]{tNodeRecyclerView})).booleanValue() : tNodeRecyclerView.inTouch;
    }

    public static /* synthetic */ List access$900(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("79ccdb1f", new Object[]{tNodeRecyclerView}) : tNodeRecyclerView.scrollListeners;
    }

    public TNodeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fadingEdgeStart = 0.0f;
        this.fadingEdgeEnd = 0.0f;
        this.mX = 0.0f;
        this.mY = 0.0f;
        this.lastX = 0.0f;
        this.lastY = 0.0f;
        this.mDy = 0.0f;
        this.mMoveY = 0.0f;
        this.mDx = 0.0f;
        this.inTouch = false;
        this.isScrollUp = false;
        this.isScrolling = false;
        this.totalY = 0;
        this.totalX = 0;
        this.isInSlowScroll = true;
        this.hookTouchEvent = true;
        this.enableEdgeEffect = false;
        this.firstOnScrollIgnored = false;
        this.scrollListeners = new ArrayList();
        this.velocityTrackListeners = new ArrayList();
        this.mHaveHideKeyBoard = false;
        this.minScrollY = 0;
        init();
    }

    public TNodeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fadingEdgeStart = 0.0f;
        this.fadingEdgeEnd = 0.0f;
        this.mX = 0.0f;
        this.mY = 0.0f;
        this.lastX = 0.0f;
        this.lastY = 0.0f;
        this.mDy = 0.0f;
        this.mMoveY = 0.0f;
        this.mDx = 0.0f;
        this.inTouch = false;
        this.isScrollUp = false;
        this.isScrolling = false;
        this.totalY = 0;
        this.totalX = 0;
        this.isInSlowScroll = true;
        this.hookTouchEvent = true;
        this.enableEdgeEffect = false;
        this.firstOnScrollIgnored = false;
        this.scrollListeners = new ArrayList();
        this.velocityTrackListeners = new ArrayList();
        this.mHaveHideKeyBoard = false;
        this.minScrollY = 0;
        init();
    }

    public TNodeRecyclerView(Context context) {
        super(context);
        this.fadingEdgeStart = 0.0f;
        this.fadingEdgeEnd = 0.0f;
        this.mX = 0.0f;
        this.mY = 0.0f;
        this.lastX = 0.0f;
        this.lastY = 0.0f;
        this.mDy = 0.0f;
        this.mMoveY = 0.0f;
        this.mDx = 0.0f;
        this.inTouch = false;
        this.isScrollUp = false;
        this.isScrolling = false;
        this.totalY = 0;
        this.totalX = 0;
        this.isInSlowScroll = true;
        this.hookTouchEvent = true;
        this.enableEdgeEffect = false;
        this.firstOnScrollIgnored = false;
        this.scrollListeners = new ArrayList();
        this.velocityTrackListeners = new ArrayList();
        this.mHaveHideKeyBoard = false;
        this.minScrollY = 0;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOnTouchListener(this);
        addOnScrollListener(new a());
        ohc.a(RecyclerView.class, "mMaxFlingVelocity", this, Integer.valueOf(ohd.b(getContext(), 4000)));
    }

    public void setComponent(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f87fff", new Object[]{this, mVar});
        } else {
            this.listViewComponent = mVar;
        }
    }

    public boolean isInSLowScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbdb9768", new Object[]{this})).booleanValue() : this.isInSlowScroll;
    }

    public void setHookTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42dbea0d", new Object[]{this, new Boolean(z)});
        } else {
            this.hookTouchEvent = z;
        }
    }

    public void resetTotal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bba93c", new Object[]{this});
            return;
        }
        this.totalX = 0;
        this.totalY = 0;
    }

    public void setKeyBoardDismissMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a1a8d5", new Object[]{this, str});
        } else {
            this.keyBoardDismissMode = str;
        }
    }

    public void setKeyBoardDismissListener(com.taobao.tao.flexbox.layoutmanager.module.element.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0e4fb1", new Object[]{this, aVar});
        } else {
            this.mKeyBoardDismissListener = aVar;
        }
    }

    public void setDisableTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b3a014", new Object[]{this, new Boolean(z)});
        } else {
            this.disableTouch = z;
        }
    }

    @Override // tb.tds
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
        } else if (iArr == null) {
        } else {
            this.fadingEdgeStart = iArr[0];
            this.fadingEdgeEnd = iArr[1];
            int max = (int) Math.max(this.fadingEdgeStart, this.fadingEdgeEnd);
            if (max <= 0) {
                return;
            }
            setFadingEdgeLength(max);
            if (getOrientation() == 1) {
                setVerticalFadingEdgeEnabled(true);
            } else {
                setHorizontalFadingEdgeEnabled(true);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class a extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final oic b;

        static {
            kge.a(1600896012);
            kge.a(203352297);
        }

        public a() {
            this.b = new oic(TNodeRecyclerView.this.getContext());
            a(new oid() { // from class: com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oid
                public void a(int i) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else {
                        TNodeRecyclerView.access$000(TNodeRecyclerView.this, i);
                    }
                }

                @Override // tb.oid
                public void b() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    TNodeRecyclerView.access$102(TNodeRecyclerView.this, false);
                    TNodeRecyclerView.access$200(TNodeRecyclerView.this);
                }

                @Override // tb.oid
                public void c() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                        return;
                    }
                    TNodeRecyclerView.access$102(TNodeRecyclerView.this, true);
                    TNodeRecyclerView.access$300(TNodeRecyclerView.this);
                }
            });
        }

        public void a(oid oidVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f4f4ce", new Object[]{this, oidVar});
            } else {
                this.b.a(oidVar);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            if (i == 1) {
                TNodeRecyclerView.access$402(TNodeRecyclerView.this, true);
            } else if (i == 0) {
                this.b.a();
                TNodeRecyclerView.access$402(TNodeRecyclerView.this, false);
                TNodeRecyclerView.access$502(TNodeRecyclerView.this, 0.0f);
                TNodeRecyclerView.access$602(TNodeRecyclerView.this, 0.0f);
            }
            if (TNodeRecyclerView.access$700(TNodeRecyclerView.this) != null) {
                TNodeRecyclerView.access$700(TNodeRecyclerView.this).b(i);
                if (!TNodeRecyclerView.access$800(TNodeRecyclerView.this) && i == 0) {
                    TNodeRecyclerView.access$700(TNodeRecyclerView.this).d();
                }
            }
            if (oeb.K()) {
                int i2 = 16;
                if (TNodeRecyclerView.access$700(TNodeRecyclerView.this).getViewParams().av != YogaFlexDirection.ROW ? TNodeRecyclerView.this.computeVerticalScrollOffset() <= 0 : TNodeRecyclerView.this.computeHorizontalScrollOffset() <= 0) {
                    i2 = 0;
                }
                for (ScrollChangeListener scrollChangeListener : TNodeRecyclerView.access$900(TNodeRecyclerView.this)) {
                    scrollChangeListener.onScrollStateChanged(i, i2);
                }
                return;
            }
            for (ScrollChangeListener scrollChangeListener2 : TNodeRecyclerView.access$900(TNodeRecyclerView.this)) {
                scrollChangeListener2.onScrollStateChanged(i, 0);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            View a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            if (i2 == 1 && !TNodeRecyclerView.access$1000(TNodeRecyclerView.this) && oeb.ag()) {
                View childAt = recyclerView.getChildAt(0);
                if ((childAt instanceof ViewGroup) && (((ViewGroup) childAt).getChildAt(0) instanceof FakeHeaderView)) {
                    TNodeRecyclerView.access$1002(TNodeRecyclerView.this, true);
                    return;
                }
            }
            this.b.a(i2);
            TNodeRecyclerView.access$1102(TNodeRecyclerView.this, i2 > 0);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int[] findVisibleItemPositionRange = TNodeRecyclerView.this.findVisibleItemPositionRange(true);
            int i3 = findVisibleItemPositionRange[0];
            int i4 = findVisibleItemPositionRange[1];
            TNodeRecyclerView tNodeRecyclerView = TNodeRecyclerView.this;
            TNodeRecyclerView.access$1202(tNodeRecyclerView, TNodeRecyclerView.access$1200(tNodeRecyclerView) + i);
            TNodeRecyclerView tNodeRecyclerView2 = TNodeRecyclerView.this;
            TNodeRecyclerView.access$1302(tNodeRecyclerView2, TNodeRecyclerView.access$1300(tNodeRecyclerView2) + i2);
            if (TNodeRecyclerView.access$1200(TNodeRecyclerView.this) < 0) {
                TNodeRecyclerView.access$1202(TNodeRecyclerView.this, 0);
            } else if (i3 == 0 && layoutManager.getChildCount() > 0) {
                TRecyclerView tRecyclerView = (TRecyclerView) recyclerView;
                int headerViewsCount = tRecyclerView.getHeaderViewsCount() > 0 ? tRecyclerView.getHeaderViewsCount() : 0;
                if (layoutManager.getChildCount() > headerViewsCount && layoutManager.getChildAt(headerViewsCount).getLeft() > 0) {
                    TNodeRecyclerView.access$1202(TNodeRecyclerView.this, 0);
                }
            }
            if (TNodeRecyclerView.access$1300(TNodeRecyclerView.this) < 0) {
                TNodeRecyclerView.access$1302(TNodeRecyclerView.this, 0);
            } else if (i3 == 0 && TNodeRecyclerView.access$700(TNodeRecyclerView.this) != null && (a2 = TNodeRecyclerView.access$700(TNodeRecyclerView.this).a(0)) != null && a2.getTop() >= 0) {
                TNodeRecyclerView.access$1302(TNodeRecyclerView.this, 0);
            }
            if (TNodeRecyclerView.access$700(TNodeRecyclerView.this) != null) {
                TNodeRecyclerView.access$700(TNodeRecyclerView.this).a(i3, i4, i2, TNodeRecyclerView.access$1400(TNodeRecyclerView.this), recyclerView.getScrollState(), TNodeRecyclerView.access$1500(TNodeRecyclerView.this));
            }
            for (ScrollChangeListener scrollChangeListener : TNodeRecyclerView.access$900(TNodeRecyclerView.this)) {
                scrollChangeListener.onScroll(TNodeRecyclerView.access$1200(TNodeRecyclerView.this), TNodeRecyclerView.access$1300(TNodeRecyclerView.this), i, i2);
            }
        }
    }

    public boolean isFirstItemFullVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb7d0d5", new Object[]{this})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (findVisibleItemPositionRange(false)[0] == 0 && layoutManager.getChildCount() > 0) {
            int headerViewsCount = getHeaderViewsCount() > 0 ? getHeaderViewsCount() : 0;
            if (layoutManager.getChildCount() > headerViewsCount && layoutManager.getChildAt(headerViewsCount).getTop() >= 0) {
                return true;
            }
        }
        return false;
    }

    public int getTotalX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3b1e004", new Object[]{this})).intValue() : this.totalX;
    }

    public int getTotalY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3bff785", new Object[]{this})).intValue() : this.totalY;
    }

    public void enableNestedSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4507e27e", new Object[]{this});
        } else {
            this.mEnableNestedSlide = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r0 != 3) goto L26;
     */
    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r5
            r1[r3] = r6
            java.lang.String r6 = "7bb68bd5"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            boolean r0 = r5.mEnableNestedSlide
            if (r0 == 0) goto L86
            boolean r0 = tb.oeb.Q()
            if (r0 == 0) goto L86
            boolean r0 = r5.checkCanScrollVertically()
            if (r0 == 0) goto L86
            int r0 = r6.getAction()
            if (r0 == 0) goto L7a
            if (r0 == r3) goto L72
            if (r0 == r2) goto L3a
            r1 = 3
            if (r0 == r1) goto L72
            goto L86
        L3a:
            float r0 = r6.getY()
            float r1 = r6.getX()
            float r2 = r5.mLastDispatchDownY
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r5.mLastDispatchDownX
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L86
            float r0 = r6.getY()
            boolean r0 = r5.checkSlideEndVertically(r0)
            if (r0 == 0) goto L6a
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L86
        L6a:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L86
        L72:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L86
        L7a:
            float r0 = r6.getX()
            r5.mLastDispatchDownX = r0
            float r0 = r6.getY()
            r5.mLastDispatchDownY = r0
        L86:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkCanScrollVertically() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("704f3883", new Object[]{this})).booleanValue() : (getLayoutManager() instanceof LinearLayoutManager) && getLayoutManager().canScrollVertically();
    }

    private boolean checkSlideEndVertically(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e335588", new Object[]{this, new Float(f)})).booleanValue();
        }
        if ((getLayoutManager() instanceof LinearLayoutManager) && getLayoutManager().getChildCount() != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 && canScrollVertically(1) && f > this.mLastDispatchDownY) {
                return true;
            }
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 && canScrollVertically(-1) && f < this.mLastDispatchDownY) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.taobao.tao.flexbox.layoutmanager.module.element.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableTouch) {
            return false;
        }
        if (this.hookTouchEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mHaveHideKeyBoard = false;
                this.mDownRawX = (int) motionEvent.getRawX();
                this.mDownRawY = (int) motionEvent.getRawY();
                if ("drag".equals(this.keyBoardDismissMode) && !oeb.an() && (aVar = this.mKeyBoardDismissListener) != null) {
                    aVar.onKeyBoardNeedDismiss(getContext());
                }
            } else if (action == 2) {
                int rawY = (int) motionEvent.getRawY();
                int rawX = (int) motionEvent.getRawX();
                if (getOrientation() == 1 && Math.abs(rawX - this.mDownRawX) > Math.abs(Math.abs(rawY - this.mDownRawY))) {
                    return false;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.taobao.tao.flexbox.layoutmanager.module.element.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableTouch) {
            return false;
        }
        if (motionEvent.getAction() == 2 && "drag".equals(this.keyBoardDismissMode) && oeb.an() && !this.mHaveHideKeyBoard && (aVar = this.mKeyBoardDismissListener) != null) {
            aVar.onKeyBoardNeedDismiss(getContext());
            this.mHaveHideKeyBoard = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        m mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        this.mX = motionEvent.getRawX();
        this.mY = motionEvent.getRawY();
        int actionMasked = motionEvent.getActionMasked();
        this.inTouch = actionMasked == 0 || actionMasked == 2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.mDx = 0.0f;
                this.mDy = 0.0f;
                this.lastY = 0.0f;
                this.lastX = 0.0f;
                this.mMoveY = 0.0f;
                if (getScrollState() == 0) {
                    this.listViewComponent.d();
                }
            } else if (action == 2) {
                if (this.lastX == 0.0f) {
                    this.lastX = this.mX;
                }
                if (this.lastY == 0.0f) {
                    this.lastY = this.mY;
                }
                float f = this.mX;
                this.mDx = f - this.lastX;
                float f2 = this.mY;
                this.mDy = f2 - this.lastY;
                this.mMoveY = f2 - this.mDownRawY;
                this.lastX = f;
                this.lastY = f2;
                if (getOrientation() == 1 && !canScrollVertically(-1)) {
                    float f3 = this.mDy;
                    if (f3 > 0.0f && (mVar = this.listViewComponent) != null) {
                        mVar.a(f3);
                    }
                }
            }
        }
        return false;
    }

    public int[] findVisibleItemPositionRange(boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("66daff1f", new Object[]{this, new Boolean(z)});
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            i = gridLayoutManager.findFirstVisibleItemPosition();
            if (z) {
                i2 = gridLayoutManager.findLastVisibleItemPosition();
            }
            i2 = 0;
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i = linearLayoutManager.findFirstVisibleItemPosition();
            if (z) {
                i2 = linearLayoutManager.findLastVisibleItemPosition();
            }
            i2 = 0;
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
            int i3 = findFirstVisibleItemPositions[0];
            for (int i4 = 1; i4 < staggeredGridLayoutManager.getSpanCount(); i4++) {
                i3 = Math.min(i3, findFirstVisibleItemPositions[i4]);
            }
            if (z) {
                int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                int i5 = findLastVisibleItemPositions[0];
                for (int i6 = 1; i6 < staggeredGridLayoutManager.getSpanCount(); i6++) {
                    i5 = Math.max(i5, findLastVisibleItemPositions[i6]);
                }
                i2 = i5;
                i = i3;
            } else {
                i = i3;
                i2 = 0;
            }
        }
        int[] iArr = {i, i2};
        int headerViewsCount = getHeaderViewsCount();
        if (headerViewsCount > 0) {
            if (iArr[0] > 0) {
                iArr[0] = iArr[0] - headerViewsCount;
                iArr[1] = iArr[1] - headerViewsCount;
            } else {
                iArr[1] = iArr[1] - headerViewsCount;
            }
        }
        return iArr;
    }

    public boolean isScrollUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a9851d", new Object[]{this})).booleanValue() : this.isScrollUp;
    }

    public void addScrollChangeListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb3f78a", new Object[]{this, scrollChangeListener});
        } else if (scrollChangeListener == null || this.scrollListeners.contains(scrollChangeListener)) {
        } else {
            this.scrollListeners.add(scrollChangeListener);
        }
    }

    public void removeScrollChangeListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8526ad", new Object[]{this, scrollChangeListener});
        } else {
            this.scrollListeners.remove(scrollChangeListener);
        }
    }

    public void addVelocityChangeListener(oid oidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b943faf", new Object[]{this, oidVar});
        } else if (oidVar == null || this.velocityTrackListeners.contains(oidVar)) {
        } else {
            this.velocityTrackListeners.add(oidVar);
        }
    }

    public void removeVelocityChangeListener(oid oidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af006d2", new Object[]{this, oidVar});
        } else {
            this.velocityTrackListeners.remove(oidVar);
        }
    }

    private void fireVelocityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbcdfb", new Object[]{this, new Integer(i)});
            return;
        }
        for (oid oidVar : this.velocityTrackListeners) {
            oidVar.a(i);
        }
    }

    private void fireScrollSlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21345fcb", new Object[]{this});
            return;
        }
        for (oid oidVar : this.velocityTrackListeners) {
            oidVar.c();
        }
    }

    private void fireScrollFast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b89a8a6", new Object[]{this});
            return;
        }
        for (oid oidVar : this.velocityTrackListeners) {
            oidVar.b();
        }
    }

    public void fireNestScrollEvent(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64ebc06", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        for (ScrollChangeListener scrollChangeListener : this.scrollListeners) {
            scrollChangeListener.onNestScroll(i, i2, i3, i4);
        }
        this.listViewComponent.a(i2, i4);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        m mVar = this.listViewComponent;
        if (mVar != null) {
            mVar.a();
        }
        super.onDetachedFromWindow();
    }

    public void setNeedResetOffsetInWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4760136e", new Object[]{this, new Boolean(z)});
        } else {
            this.needResetOffsetInWindow = z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb2ad7c6", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2})).booleanValue();
        }
        boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        if (iArr2 != null && this.needResetOffsetInWindow) {
            iArr2[1] = 0;
        }
        return dispatchNestedPreScroll;
    }

    @Override // android.support.v7.widget.RecyclerView, android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a309385", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
        }
        boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        if (iArr2 != null && this.needResetOffsetInWindow) {
            iArr2[1] = 0;
        }
        return dispatchNestedPreScroll;
    }

    public void enableEdgeEffect(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9adc66b", new Object[]{this, new Integer(i)});
            return;
        }
        this.enableEdgeEffect = true;
        m mVar = this.listViewComponent;
        if (mVar == null) {
            return;
        }
        try {
            if (!oec.a(mVar.getNode().k())) {
                return;
            }
            if (i == 1) {
                z = true;
            }
            com.taobao.tao.flexbox.layoutmanager.component.bouncy.a.a(this, z);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.enableEdgeEffect) {
            return;
        }
        enableEdgeEffect(getOrientation());
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45432f49", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setClipToPadding(z);
        if (!this.enableEdgeEffect) {
            return;
        }
        enableEdgeEffect(getOrientation());
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9675fded", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeStart <= 0.0f) {
            return 0.0f;
        }
        return super.getTopFadingEdgeStrength();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12db3b6f", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeEnd <= 0.0f) {
            return 0.0f;
        }
        return super.getBottomFadingEdgeStrength();
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79b159cb", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeStart <= 0.0f) {
            return 0.0f;
        }
        return super.getLeftFadingEdgeStrength();
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2207f4f4", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeEnd <= 0.0f) {
            return 0.0f;
        }
        return super.getRightFadingEdgeStrength();
    }

    public void setMinScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ee2260", new Object[]{this, new Integer(i)});
        } else {
            this.minScrollY = i;
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean canScrollVertically = super.canScrollVertically(i);
        if (!canScrollVertically && (i2 = this.minScrollY) > 0 && i < 0) {
            scrollBy(0, i2);
        }
        return canScrollVertically;
    }
}
